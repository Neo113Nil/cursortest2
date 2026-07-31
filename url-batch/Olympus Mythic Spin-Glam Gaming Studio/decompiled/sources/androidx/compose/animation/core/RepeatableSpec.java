package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimationSpec.kt */
@Immutable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u00020\u001f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/animation/core/RepeatableSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "iterations", "I", "getIterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "J", "getInitialStartOffset-Rmkjzm4", "()J", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {
    private final DurationBasedAnimationSpec animation;
    private final long initialStartOffset;
    private final int iterations;
    private final RepeatMode repeatMode;

    @Override // androidx.compose.animation.core.AnimationSpec
    public VectorizedFiniteAnimationSpec vectorize(TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedRepeatableSpec(this.iterations, this.animation.vectorize(converter), this.repeatMode, this.initialStartOffset, null);
    }

    public boolean equals(Object other) {
        if (!(other instanceof RepeatableSpec)) {
            return false;
        }
        RepeatableSpec repeatableSpec = (RepeatableSpec) other;
        return repeatableSpec.iterations == this.iterations && Intrinsics.areEqual(repeatableSpec.animation, this.animation) && repeatableSpec.repeatMode == this.repeatMode && StartOffset.m121equalsimpl0(repeatableSpec.initialStartOffset, this.initialStartOffset);
    }

    public int hashCode() {
        return (((((this.iterations * 31) + this.animation.hashCode()) * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m122hashCodeimpl(this.initialStartOffset);
    }
}
