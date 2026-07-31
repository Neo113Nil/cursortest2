package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimationModifier.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001+B \u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0011\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR9\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "animSpec", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "targetSize", "animateTo-mzRDjE0", "(J)J", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function2;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function2;", "getListener", "()Lkotlin/jvm/functions/Function2;", "setListener", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "animData", "Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifier$AnimData;)V", "AnimData", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {
    private AnimData animData;
    private final AnimationSpec animSpec;
    private Function2 listener;
    private final CoroutineScope scope;

    public final AnimationSpec getAnimSpec() {
        return this.animSpec;
    }

    public SizeAnimationModifier(AnimationSpec animSpec, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(animSpec, "animSpec");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.animSpec = animSpec;
        this.scope = scope;
    }

    public final Function2 getListener() {
        return this.listener;
    }

    public final void setListener(Function2 function2) {
        this.listener = function2;
    }

    /* compiled from: AnimationModifier.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "anim", "startSize", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/animation/core/Animatable;", "getAnim", "()Landroidx/compose/animation/core/Animatable;", "J", "getStartSize-YbymL2g", "()J", "setStartSize-ozmzZPI", "(J)V", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class AnimData {
        private final Animatable anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return Intrinsics.areEqual(this.anim, animData.anim) && IntSize.m2565equalsimpl0(this.startSize, animData.startSize);
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m2568hashCodeimpl(this.startSize);
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m2569toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable animatable, long j) {
            this.anim = animatable;
            this.startSize = j;
        }

        public final Animatable getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name and from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m95setStartSizeozmzZPI(long j) {
            this.startSize = j;
        }
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
        long m93animateTomzRDjE0 = m93animateTomzRDjE0(IntSizeKt.IntSize(mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight()));
        return MeasureScope.layout$default(measure, IntSize.m2567getWidthimpl(m93animateTomzRDjE0), IntSize.m2566getHeightimpl(m93animateTomzRDjE0), null, new Function1() { // from class: androidx.compose.animation.SizeAnimationModifier$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m93animateTomzRDjE0(long targetSize) {
        AnimData animData = this.animData;
        if (animData != null) {
            if (!IntSize.m2565equalsimpl0(targetSize, ((IntSize) animData.getAnim().getTargetValue()).getPackedValue())) {
                animData.m95setStartSizeozmzZPI(((IntSize) animData.getAnim().getValue()).getPackedValue());
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SizeAnimationModifier$animateTo$data$1$1(animData, targetSize, this, null), 3, null);
            }
        } else {
            animData = new AnimData(new Animatable(IntSize.m2562boximpl(targetSize), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), IntSize.m2562boximpl(IntSizeKt.IntSize(1, 1))), targetSize, null);
        }
        this.animData = animData;
        return ((IntSize) animData.getAnim().getValue()).getPackedValue();
    }
}
