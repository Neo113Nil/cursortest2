package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B4\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R2\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/SizeTransformImpl;", "Landroidx/compose/animation/SizeTransform;", "", "clip", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeAnimationSpec", "<init>", "(ZLkotlin/jvm/functions/Function2;)V", "initialSize", "targetSize", "createAnimationSpec-TemP2vQ", "(JJ)Landroidx/compose/animation/core/FiniteAnimationSpec;", "createAnimationSpec", "Z", "getClip", "()Z", "Lkotlin/jvm/functions/Function2;", "getSizeAnimationSpec", "()Lkotlin/jvm/functions/Function2;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalAnimationApi
/* loaded from: classes3.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final Function2 sizeAnimationSpec;

    public SizeTransformImpl(boolean z, Function2 sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        this.clip = z;
        this.sizeAnimationSpec = sizeAnimationSpec;
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec mo96createAnimationSpecTemP2vQ(long initialSize, long targetSize) {
        return (FiniteAnimationSpec) this.sizeAnimationSpec.invoke(IntSize.m2562boximpl(initialSize), IntSize.m2562boximpl(targetSize));
    }
}
