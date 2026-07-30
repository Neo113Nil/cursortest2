package p000createpolar;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDisplayMetricsSolarTitanium9667 {
    private volatile AtomicReferenceArray<Object> array;

    public PolarVoyageDisplayMetricsSolarTitanium9667(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(int i, PolarVoyageClipDrawableForceStormPrime9685 polarVoyageClipDrawableForceStormPrime9685) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, polarVoyageClipDrawableForceStormPrime9685);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, polarVoyageClipDrawableForceStormPrime9685);
        this.array = atomicReferenceArray2;
    }

    public final Object PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final int PolarVoyageZipVortexCelestial6185() {
        return this.array.length();
    }
}
