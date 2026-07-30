package p000createpolar;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSupervisorJobPulsePulseElite3500 {
    public final PolarVoyageOnTouchListenerInfernoShadow9357 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final Object PolarVoyageBitmapVisionAuroraPixel4705;
    public final Handler PolarVoyageKotlinBetaPulseBeta3653;
    public final AudioManager.OnAudioFocusChangeListener PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageSupervisorJobPulsePulseElite3500(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, PolarVoyageOnTouchListenerInfernoShadow9357 polarVoyageOnTouchListenerInfernoShadow9357, boolean z) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest build;
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageKotlinBetaPulseBeta3653 = handler;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageOnTouchListenerInfernoShadow9357;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageDigitalInkRecognitionLegendMega2070(onAudioFocusChangeListener, handler);
        } else {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = onAudioFocusChangeListener;
        }
        if (i2 < 26) {
            this.PolarVoyageBitmapVisionAuroraPixel4705 = null;
            return;
        }
        audioAttributes = PolarVoyageGroupCosmosBetaMaster5959.PolarVoyageBitmapVisionAuroraPixel4705(i).setAudioAttributes(polarVoyageOnTouchListenerInfernoShadow9357.PolarVoyageZipVortexCelestial6185());
        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(false);
        onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
        acceptsDelayedFocusGain = onAudioFocusChangeListener2.setAcceptsDelayedFocusGain(z);
        build = acceptsDelayedFocusGain.build();
        this.PolarVoyageBitmapVisionAuroraPixel4705 = build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageSupervisorJobPulsePulseElite3500)) {
            return false;
        }
        PolarVoyageSupervisorJobPulsePulseElite3500 polarVoyageSupervisorJobPulsePulseElite3500 = (PolarVoyageSupervisorJobPulsePulseElite3500) obj;
        return this.PolarVoyageZipVortexCelestial6185 == polarVoyageSupervisorJobPulsePulseElite3500.PolarVoyageZipVortexCelestial6185 && Objects.equals(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageSupervisorJobPulsePulseElite3500.PolarVoyageMotionLayoutTransitionHeroVision4068) && Objects.equals(this.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageSupervisorJobPulsePulseElite3500.PolarVoyageKotlinBetaPulseBeta3653) && Objects.equals(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageSupervisorJobPulsePulseElite3500.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.PolarVoyageZipVortexCelestial6185), this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageKotlinBetaPulseBeta3653, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, Boolean.FALSE);
    }
}
