package p000createpolar;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageProximitySensorGammaMasterMax7106 extends AudioDeviceCallback {
    public final /* synthetic */ PolarVoyageLiveDataSolarQuantumUltra7998 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageProximitySensorGammaMasterMax7106(PolarVoyageLiveDataSolarQuantumUltra7998 polarVoyageLiveDataSolarQuantumUltra7998) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageLiveDataSolarQuantumUltra7998;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        PolarVoyageLiveDataSolarQuantumUltra7998 polarVoyageLiveDataSolarQuantumUltra7998 = this.PolarVoyageZipVortexCelestial6185;
        AudioDeviceInfo audioDeviceInfo = polarVoyageLiveDataSolarQuantumUltra7998.PolarVoyageStrictModeLegendEpic1532;
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], audioDeviceInfo)) {
                polarVoyageLiveDataSolarQuantumUltra7998.PolarVoyageStrictModeLegendEpic1532 = null;
                break;
            }
            i++;
        }
        polarVoyageLiveDataSolarQuantumUltra7998.PolarVoyageKotlinBetaPulseBeta3653();
    }
}
