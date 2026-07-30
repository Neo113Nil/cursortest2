package p000createpolar;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageLiveDataPhantomHyperionPrime2095 extends AccessibilityNodeProvider {
    public final PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLiveDataPhantomHyperionPrime2095(PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra8894) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageRealtimeDatabaseEclipseUltra8894;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        PolarVoyageToastUltraNeo6602 PolarVoyageDiffUtilTurboStrike5735 = this.PolarVoyageZipVortexCelestial6185.PolarVoyageDiffUtilTurboStrike5735(i);
        if (PolarVoyageDiffUtilTurboStrike5735 == null) {
            return null;
        }
        return PolarVoyageDiffUtilTurboStrike5735.PolarVoyageZipVortexCelestial6185;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.PolarVoyageZipVortexCelestial6185.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        PolarVoyageToastUltraNeo6602 PolarVoyageItemDecorationUltraDeltaEpic7485 = this.PolarVoyageZipVortexCelestial6185.PolarVoyageItemDecorationUltraDeltaEpic7485(i);
        if (PolarVoyageItemDecorationUltraDeltaEpic7485 == null) {
            return null;
        }
        return PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.PolarVoyageZipVortexCelestial6185.PolarVoyageSnackbarGammaEclipse2140(i, i2, bundle);
    }
}
