package p000createpolar;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCoroutineMaxOlympian6075 extends PolarVoyageLifecycleBetaDelta5160 {
    public final /* synthetic */ PolarVoyageRemoteConfigPhantomDelta8611 PolarVoyageCameraPixelBlaze2629;
    public long PolarVoyageViewRogueMaster4778;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyageCoroutineMaxOlympian6075(PolarVoyageRemoteConfigPhantomDelta8611 polarVoyageRemoteConfigPhantomDelta8611, PolarVoyageFragmentMasterInfernoStorm7113 polarVoyageFragmentMasterInfernoStorm7113, long j) {
        super(polarVoyageRemoteConfigPhantomDelta8611, polarVoyageFragmentMasterInfernoStorm7113);
        polarVoyageFragmentMasterInfernoStorm7113.getClass();
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyageRemoteConfigPhantomDelta8611;
        this.PolarVoyageViewRogueMaster4778 = j;
        if (j == 0) {
            PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageCoroutineScopeDeltaInferno4802.PolarVoyageStrictModeLegendEpic1532);
        }
    }

    @Override // p000createpolar.PolarVoyageLifecycleBetaDelta5160, p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        if (j < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("byteCount < 0: ", j));
            return 0L;
        }
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return 0L;
        }
        long j2 = this.PolarVoyageViewRogueMaster4778;
        if (j2 == 0) {
            return -1L;
        }
        long PolarVoyageLayerDrawableShadowTitaniumOmega1942 = super.PolarVoyageLayerDrawableShadowTitaniumOmega1942(Math.min(j2, j), polarVoyageSnackbarSpectraMasterMaster4120);
        if (PolarVoyageLayerDrawableShadowTitaniumOmega1942 == -1) {
            this.PolarVoyageCameraPixelBlaze2629.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageItemDecorationUltraDeltaEpic7485();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageRemoteConfigPhantomDelta8611.PolarVoyageDiffUtilTurboStrike5735);
            throw protocolException;
        }
        long j3 = this.PolarVoyageViewRogueMaster4778 - PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        this.PolarVoyageViewRogueMaster4778 = j3;
        if (j3 == 0) {
            PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageCoroutineScopeDeltaInferno4802.PolarVoyageStrictModeLegendEpic1532);
        }
        return PolarVoyageLayerDrawableShadowTitaniumOmega1942;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return;
        }
        if (this.PolarVoyageViewRogueMaster4778 != 0) {
            TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageBitmapVisionAuroraPixel4705(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.PolarVoyageCameraPixelBlaze2629.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageItemDecorationUltraDeltaEpic7485();
                PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageRemoteConfigPhantomDelta8611.PolarVoyageDiffUtilTurboStrike5735);
            }
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
    }
}
