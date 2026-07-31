package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scroll.kt */
@Stable
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0005R\u001a\u0010 \u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0016\u0010&\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010-\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00028F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u0005R\u0014\u0010/\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initial", "<init>", "(I)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)F", "value", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollTo", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()I", "setValue", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/runtime/MutableState;", "_maxValueState", "accumulator", "F", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "newMax", "getMaxValue", "setMaxValue$foundation_release", "maxValue", "", "isScrollInProgress", "()Z", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScrollState implements ScrollableState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver Saver = SaverKt.Saver(new Function2() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Integer invoke(@NotNull SaverScope Saver2, @NotNull ScrollState it) {
            Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getValue());
        }
    }, new Function1() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        @Nullable
        public final ScrollState invoke(int i) {
            return new ScrollState(i);
        }
    });
    private float accumulator;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    private MutableState _maxValueState = SnapshotStateKt.mutableStateOf(Integer.MAX_VALUE, SnapshotStateKt.structuralEqualityPolicy());
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new Function1() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }

        @NotNull
        public final Float invoke(float f) {
            float f2;
            f2 = ScrollState.this.accumulator;
            float value = ScrollState.this.getValue() + f + f2;
            float coerceIn = RangesKt.coerceIn(value, 0.0f, ScrollState.this.getMaxValue());
            boolean z = value == coerceIn;
            float value2 = coerceIn - ScrollState.this.getValue();
            int roundToInt = MathKt.roundToInt(value2);
            ScrollState scrollState = ScrollState.this;
            scrollState.setValue(scrollState.getValue() + roundToInt);
            ScrollState.this.accumulator = value2 - roundToInt;
            if (!z) {
                f = value2;
            }
            return Float.valueOf(f);
        }
    });

    public ScrollState(int i) {
        this.value = SnapshotStateKt.mutableStateOf(Integer.valueOf(i), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(int i) {
        this.value.setValue(Integer.valueOf(i));
    }

    public final int getValue() {
        return ((Number) this.value.getValue()).intValue();
    }

    public final int getMaxValue() {
        return ((Number) this._maxValueState.getValue()).intValue();
    }

    public final void setMaxValue$foundation_release(int i) {
        this._maxValueState.setValue(Integer.valueOf(i));
        if (getValue() > i) {
            setValue(i);
        }
    }

    /* renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object scroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        return scroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final Object animateScrollTo(int i, AnimationSpec animationSpec, Continuation continuation) {
        Object animateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i - getValue(), animationSpec, continuation);
        return animateScrollBy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollBy : Unit.INSTANCE;
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/ScrollState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver getSaver() {
            return ScrollState.Saver;
        }
    }
}
