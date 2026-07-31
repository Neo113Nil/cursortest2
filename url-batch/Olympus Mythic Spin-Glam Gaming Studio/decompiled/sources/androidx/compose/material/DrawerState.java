package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
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
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Drawer.kt */
@Stable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/material/DrawerState;", "", "Landroidx/compose/material/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material/SwipeableState;", "swipeableState", "Landroidx/compose/material/SwipeableState;", "getSwipeableState$material_release", "()Landroidx/compose/material/SwipeableState;", "isOpen", "()Z", "getCurrentValue", "()Landroidx/compose/material/DrawerValue;", "currentValue", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", "()V", "offset", "Companion", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DrawerState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SwipeableState swipeableState;

    public DrawerState(DrawerValue initialValue, Function1 confirmStateChange) {
        TweenSpec tweenSpec;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        tweenSpec = DrawerKt.AnimationSpec;
        this.swipeableState = new SwipeableState(initialValue, tweenSpec, confirmStateChange);
    }

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DrawerValue;", "invoke", "(Landroidx/compose/material/DrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.DrawerState$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DrawerValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: getSwipeableState$material_release, reason: from getter */
    public final SwipeableState getSwipeableState() {
        return this.swipeableState;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    public final DrawerValue getCurrentValue() {
        return (DrawerValue) this.swipeableState.getCurrentValue();
    }

    public final Object close(Continuation continuation) {
        TweenSpec tweenSpec;
        DrawerValue drawerValue = DrawerValue.Closed;
        tweenSpec = DrawerKt.AnimationSpec;
        Object animateTo = animateTo(drawerValue, tweenSpec, continuation);
        return animateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : Unit.INSTANCE;
    }

    public final Object animateTo(DrawerValue drawerValue, AnimationSpec animationSpec, Continuation continuation) {
        Object animateTo = this.swipeableState.animateTo(drawerValue, animationSpec, continuation);
        return animateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : Unit.INSTANCE;
    }

    public final State getOffset() {
        return this.swipeableState.getOffset();
    }

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver Saver(final Function1 confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(new Function2() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final DrawerValue invoke(@NotNull SaverScope Saver, @NotNull DrawerState it) {
                    Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new Function1() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final DrawerState invoke(@NotNull DrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new DrawerState(it, Function1.this);
                }
            });
        }
    }
}
