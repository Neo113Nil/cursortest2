package p000createpolar;

import android.os.Bundle;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageContentObserverCyberPulse2403 implements Comparable {
    public final int PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageCameraXCelestialNeoSolar7858 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Bundle PolarVoyageStrictModeLegendEpic1532;
    public final boolean PolarVoyageViewRogueMaster4778;

    public PolarVoyageContentObserverCyberPulse2403(PolarVoyageCameraXCelestialNeoSolar7858 polarVoyageCameraXCelestialNeoSolar7858, Bundle bundle, boolean z, int i, boolean z2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageCameraXCelestialNeoSolar7858;
        this.PolarVoyageStrictModeLegendEpic1532 = bundle;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
        this.PolarVoyageBottomSheetOmegaNeo1907 = i;
        this.PolarVoyageViewRogueMaster4778 = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: PolarVoyageZipVortexCelestial6185, reason: merged with bridge method [inline-methods] */
    public final int compareTo(PolarVoyageContentObserverCyberPulse2403 polarVoyageContentObserverCyberPulse2403) {
        polarVoyageContentObserverCyberPulse2403.getClass();
        boolean z = polarVoyageContentObserverCyberPulse2403.PolarVoyageViewRogueMaster4778;
        boolean z2 = polarVoyageContentObserverCyberPulse2403.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Bundle bundle = polarVoyageContentObserverCyberPulse2403.PolarVoyageStrictModeLegendEpic1532;
        boolean z3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.PolarVoyageBottomSheetOmegaNeo1907 - polarVoyageContentObserverCyberPulse2403.PolarVoyageBottomSheetOmegaNeo1907;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.PolarVoyageViewRogueMaster4778;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
