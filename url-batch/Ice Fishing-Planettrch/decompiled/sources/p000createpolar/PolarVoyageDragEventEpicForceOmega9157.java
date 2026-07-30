package p000createpolar;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDragEventEpicForceOmega9157 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final PolarVoyageMLKitQuantumEpic5634 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageDragEventEpicForceOmega9157(PolarVoyageMLKitQuantumEpic5634 polarVoyageMLKitQuantumEpic5634) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageMLKitQuantumEpic5634;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
