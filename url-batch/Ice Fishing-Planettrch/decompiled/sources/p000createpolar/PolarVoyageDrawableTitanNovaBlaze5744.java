package p000createpolar;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDrawableTitanNovaBlaze5744 implements PolarVoyageAdapterDelegateBetaGammaBeta9555, PolarVoyageRoomEclipseUltra5587, PolarVoyageMediaPlayerBetaNeoOlympian9440, PolarVoyageRippleDrawablePrimeSpeedMax5890, PolarVoyageFlowCollectorShadowPixel9788 {
    public static final int PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, long j) {
        int i2 = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageBitmapMaxTitanTitan7960;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static MediaCodec PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder6774) {
        String str = ((PolarVoyageAlertDialogVortexStorm8075) polarVoyageStateEpicSpectraThunder6774.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageZipVortexCelestial6185;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // p000createpolar.PolarVoyageRoomEclipseUltra5587
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageAdMobForceVortexBeta7549 PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder6774) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageStateEpicSpectraThunder6774);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) polarVoyageStateEpicSpectraThunder6774.PolarVoyageBitmapVisionAuroraPixel4705;
            mediaCodec.configure((MediaFormat) polarVoyageStateEpicSpectraThunder6774.PolarVoyageKotlinBetaPulseBeta3653, surface, (MediaCrypto) polarVoyageStateEpicSpectraThunder6774.PolarVoyageDiffUtilTurboStrike5735, (surface == null && ((PolarVoyageAlertDialogVortexStorm8075) polarVoyageStateEpicSpectraThunder6774.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageItemDecorationUltraDeltaEpic7485 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new PolarVoyageResourcesCelestialInferno9280(mediaCodec, (PolarVoyageAlarmManagerAlphaInferno3493) polarVoyageStateEpicSpectraThunder6774.PolarVoyageZipVortexCelestial6185);
        } catch (IOException e) {
            e = e;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodec != null) {
            }
            throw e;
        }
    }

    @Override // p000createpolar.PolarVoyageAdapterDelegateBetaGammaBeta9555
    public boolean PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356) {
        return false;
    }

    @Override // p000createpolar.PolarVoyageAdapterDelegateBetaGammaBeta9555
    public PolarVoyageFlowMaxTitanAlpha3096 PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // p000createpolar.PolarVoyageAdapterDelegateBetaGammaBeta9555
    public int PolarVoyageViewRogueMaster4778(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356) {
        return 1;
    }

    @Override // p000createpolar.PolarVoyageRippleDrawablePrimeSpeedMax5890
    public long PolarVoyageZipVortexCelestial6185() {
        return SystemClock.elapsedRealtime();
    }
}
