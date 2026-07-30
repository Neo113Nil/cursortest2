package p000createpolar;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSurfaceViewMegaSparkShadow6231 implements PolarVoyageRoomEclipseUltra5587 {
    public boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageSurfaceViewMegaSparkShadow6231(PolarVoyageRecyclerViewUltraBlazeThunder8612 polarVoyageRecyclerViewUltraBlazeThunder8612, PolarVoyageLevelListDrawablePhoenixEclipse4200[] polarVoyageLevelListDrawablePhoenixEclipse4200Arr, boolean z) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageRecyclerViewUltraBlazeThunder8612;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageLevelListDrawablePhoenixEclipse4200Arr;
        boolean z2 = false;
        if (polarVoyageLevelListDrawablePhoenixEclipse4200Arr != null && z) {
            z2 = true;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = z2;
    }

    public void PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageBannerAdBlazeHyperion2492 polarVoyageBannerAdBlazeHyperion2492, PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta7408) {
        PolarVoyageMotionLayoutEpicHyper1268 polarVoyageMotionLayoutEpicHyper1268 = (PolarVoyageMotionLayoutEpicHyper1268) ((PolarVoyageRecyclerViewUltraBlazeThunder8612) ((PolarVoyageRecyclerViewUltraBlazeThunder8612) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageCardViewTurboEclipse5307 polarVoyageCardViewTurboEclipse5307 = (PolarVoyageCardViewTurboEclipse5307) ((PolarVoyageIntentServiceMasterOlympian3440) polarVoyageBannerAdBlazeHyperion2492).PolarVoyageRemoteModelManagerOlympianCelestial9141();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(polarVoyageCardViewTurboEclipse5307.PolarVoyageMotionLayoutTransitionHeroVision4068);
        int i = PolarVoyageAnalyticsHyperUltra2307.PolarVoyageZipVortexCelestial6185;
        if (polarVoyageMotionLayoutEpicHyper1268 == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            polarVoyageMotionLayoutEpicHyper1268.writeToParcel(obtain, 0);
        }
        try {
            polarVoyageCardViewTurboEclipse5307.PolarVoyageZipVortexCelestial6185.transact(1, obtain, null, 1);
            obtain.recycle();
            polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyagePushNotificationPixelFusion3898 polarVoyagePushNotificationPixelFusion3898) {
        synchronized (this.PolarVoyageStrictModeLegendEpic1532) {
            try {
                if (((ArrayDeque) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new ArrayDeque();
                }
                ((ArrayDeque) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).add(polarVoyagePushNotificationPixelFusion3898);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void PolarVoyageDiffUtilTurboStrike5735(PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995) {
        PolarVoyagePushNotificationPixelFusion3898 polarVoyagePushNotificationPixelFusion3898;
        synchronized (this.PolarVoyageStrictModeLegendEpic1532) {
            if (((ArrayDeque) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) != null && !this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
                while (true) {
                    synchronized (this.PolarVoyageStrictModeLegendEpic1532) {
                        try {
                            polarVoyagePushNotificationPixelFusion3898 = (PolarVoyagePushNotificationPixelFusion3898) ((ArrayDeque) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).poll();
                            if (polarVoyagePushNotificationPixelFusion3898 == null) {
                                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    polarVoyagePushNotificationPixelFusion3898.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageDialogFragmentTitanCelestial7995);
                }
            }
        }
    }

    @Override // p000createpolar.PolarVoyageRoomEclipseUltra5587
    /* renamed from: PolarVoyageMotionLayoutTransitionHeroVision4068, reason: merged with bridge method [inline-methods] */
    public PolarVoyageVectorDrawableTitaniumStorm2009 PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder6774) {
        MediaCodec mediaCodec;
        PolarVoyageContentObserverDragonTitaniumNebula2107 polarVoyageIntentServiceSpeedVortexThunder4775;
        int i;
        PolarVoyageVectorDrawableTitaniumStorm2009 polarVoyageVectorDrawableTitaniumStorm2009;
        String str = ((PolarVoyageAlertDialogVortexStorm8075) polarVoyageStateEpicSpectraThunder6774.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageZipVortexCelestial6185;
        PolarVoyageVectorDrawableTitaniumStorm2009 polarVoyageVectorDrawableTitaniumStorm20092 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.PolarVoyageItemDecorationUltraDeltaEpic7485 || Build.VERSION.SDK_INT < 36) {
                    polarVoyageIntentServiceSpeedVortexThunder4775 = new PolarVoyageIntentServiceSpeedVortexThunder4775(mediaCodec, (HandlerThread) ((PolarVoyageButtonSpeedOlympianMax7598) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).get());
                    i = 0;
                } else {
                    polarVoyageIntentServiceSpeedVortexThunder4775 = new PolarVoyageRecyclerViewUltraBlazeThunder8612(13, mediaCodec);
                    i = 4;
                }
                polarVoyageVectorDrawableTitaniumStorm2009 = new PolarVoyageVectorDrawableTitaniumStorm2009(mediaCodec, (HandlerThread) ((PolarVoyageButtonSpeedOlympianMax7598) this.PolarVoyageStrictModeLegendEpic1532).get(), polarVoyageIntentServiceSpeedVortexThunder4775, (PolarVoyageAlarmManagerAlphaInferno3493) polarVoyageStateEpicSpectraThunder6774.PolarVoyageZipVortexCelestial6185);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) polarVoyageStateEpicSpectraThunder6774.PolarVoyageBitmapVisionAuroraPixel4705;
                if (surface == null && ((PolarVoyageAlertDialogVortexStorm8075) polarVoyageStateEpicSpectraThunder6774.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageItemDecorationUltraDeltaEpic7485 && Build.VERSION.SDK_INT >= 35) {
                    i |= 8;
                }
                PolarVoyageVectorDrawableTitaniumStorm2009.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageVectorDrawableTitaniumStorm2009, (MediaFormat) polarVoyageStateEpicSpectraThunder6774.PolarVoyageKotlinBetaPulseBeta3653, surface, (MediaCrypto) polarVoyageStateEpicSpectraThunder6774.PolarVoyageDiffUtilTurboStrike5735, i);
                return polarVoyageVectorDrawableTitaniumStorm2009;
            } catch (Exception e2) {
                e = e2;
                polarVoyageVectorDrawableTitaniumStorm20092 = polarVoyageVectorDrawableTitaniumStorm2009;
                if (polarVoyageVectorDrawableTitaniumStorm20092 != null) {
                    polarVoyageVectorDrawableTitaniumStorm20092.PolarVoyageZipVortexCelestial6185();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    public boolean PolarVoyageZipVortexCelestial6185(long j) {
        Object obj;
        List list = (List) ((PolarVoyageResourcesCelestialInferno9280) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageStrictModeLegendEpic1532;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageAlertDialogCyberHeroQuantum3938(((PolarVoyageLintDeltaVortexDragon3634) obj).PolarVoyageZipVortexCelestial6185, j)) {
                break;
            }
            i++;
        }
        PolarVoyageLintDeltaVortexDragon3634 polarVoyageLintDeltaVortexDragon3634 = (PolarVoyageLintDeltaVortexDragon3634) obj;
        if (polarVoyageLintDeltaVortexDragon3634 != null) {
            return polarVoyageLintDeltaVortexDragon3634.PolarVoyageItemDecorationUltraDeltaEpic7485;
        }
        return false;
    }

    public PolarVoyageSurfaceViewMegaSparkShadow6231() {
        this.PolarVoyageStrictModeLegendEpic1532 = new Object();
    }

    public PolarVoyageSurfaceViewMegaSparkShadow6231(PolarVoyageScrollViewNovaDragon3767 polarVoyageScrollViewNovaDragon3767, PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageScrollViewNovaDragon3767;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageResourcesCelestialInferno9280;
    }

    public PolarVoyageSurfaceViewMegaSparkShadow6231(PolarVoyageButtonSpeedOlympianMax7598 polarVoyageButtonSpeedOlympianMax7598, PolarVoyageButtonSpeedOlympianMax7598 polarVoyageButtonSpeedOlympianMax75982) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageButtonSpeedOlympianMax7598;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageButtonSpeedOlympianMax75982;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
    }
}
