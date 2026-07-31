package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: SpringSimulation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"", "value", "velocity", "Landroidx/compose/animation/core/Motion;", "Motion", "(FF)J", "UNSET", "F", "getUNSET", "()F", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SpringSimulationKt {
    private static final float UNSET = Float.MAX_VALUE;

    public static final long Motion(float f, float f2) {
        return Motion.m108constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final float getUNSET() {
        return UNSET;
    }
}
