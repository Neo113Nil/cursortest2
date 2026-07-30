package p000createpolar;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTransitionListenerPixelCyberVision8289 implements PolarVoyageMotionLayoutTransitionNebulaHeroFusion7418 {
    public final /* synthetic */ Object PolarVoyageKotlinBetaPulseBeta3653;
    public final /* synthetic */ Object PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageTransitionListenerPixelCyberVision8289(int i, Object obj, Object obj2) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = obj;
        this.PolarVoyageKotlinBetaPulseBeta3653 = obj2;
    }

    @Override // p000createpolar.PolarVoyageMotionLayoutTransitionNebulaHeroFusion7418
    public final void PolarVoyageZipVortexCelestial6185() {
        boolean isTerminated;
        int i = this.PolarVoyageZipVortexCelestial6185;
        Object obj = this.PolarVoyageKotlinBetaPulseBeta3653;
        Object obj2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((PolarVoyageCameraXHyperionPulse4441) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((PolarVoyageBillingClientTitanEpic9544) obj);
                break;
            case 2:
                ((PolarVoyagePoseDetectionCelestialPhoenix4774) obj2).PolarVoyageSnackbarGammaEclipse2140.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageDiffUtilTurboStrike5735((PolarVoyageLocationListenerCelestialSpark5443) obj);
                break;
            case 3:
                ((PolarVoyageServiceConnectionCyberOlympian8321) obj2).PolarVoyageZipVortexCelestial6185.PolarVoyageRotateAnimationCyberCelestialDelta4768((PolarVoyageFlowNeoHero4295) obj);
                break;
            case 4:
                Iterator it = ((List) ((PolarVoyageActivityInfoMaxUltraShadow5908) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((PolarVoyageFlingGestureTitanPulseBeta5059) obj).PolarVoyageMotionLayoutTransitionHeroVision4068().PolarVoyageKotlinBetaPulseBeta3653((PolarVoyagePoseDetectionCelestialPhoenix4774) it.next());
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                PolarVoyageTransitionManagerAuroraHeroSpeed1475 polarVoyageTransitionManagerAuroraHeroSpeed1475 = (PolarVoyageTransitionManagerAuroraHeroSpeed1475) obj2;
                PolarVoyageMotionSceneCyberCelestialAlpha2457 polarVoyageMotionSceneCyberCelestialAlpha2457 = (PolarVoyageMotionSceneCyberCelestialAlpha2457) obj;
                if (polarVoyageTransitionManagerAuroraHeroSpeed1475.PolarVoyageZipVortexCelestial6185 == null) {
                    if (polarVoyageTransitionManagerAuroraHeroSpeed1475.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Unreachable");
                        break;
                    } else {
                        PolarVoyageRotateDrawableDragonMax8653 polarVoyageRotateDrawableDragonMax8653 = polarVoyageMotionSceneCyberCelestialAlpha2457.PolarVoyageZipVortexCelestial6185;
                        ArrayList arrayList = polarVoyageRotateDrawableDragonMax8653.PolarVoyageZipVortexCelestial6185;
                        CopyOnWriteArrayList copyOnWriteArrayList = polarVoyageRotateDrawableDragonMax8653.PolarVoyageKotlinBetaPulseBeta3653;
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        it2.getClass();
                        while (true) {
                            int i2 = 0;
                            if (!it2.hasNext()) {
                                copyOnWriteArrayList.clear();
                                int size = arrayList.size();
                                while (i2 < size) {
                                    Object obj3 = arrayList.get(i2);
                                    i2++;
                                    ((PolarVoyageKeyEventBlazeStormBlaze3298) obj3).PolarVoyageBitmapVisionAuroraPixel4705();
                                }
                                arrayList.clear();
                                break;
                            } else {
                                AutoCloseable autoCloseable = (AutoCloseable) it2.next();
                                if (!(autoCloseable instanceof AutoCloseable)) {
                                    if (!(autoCloseable instanceof ExecutorService)) {
                                        if (!(autoCloseable instanceof TypedArray)) {
                                            if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                                                if (!(autoCloseable instanceof MediaDrm)) {
                                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
                                                    break;
                                                } else {
                                                    ((MediaDrm) autoCloseable).release();
                                                }
                                            } else {
                                                ((MediaMetadataRetriever) autoCloseable).release();
                                            }
                                        } else {
                                            ((TypedArray) autoCloseable).recycle();
                                        }
                                    } else {
                                        ExecutorService executorService = (ExecutorService) autoCloseable;
                                        if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                            executorService.shutdown();
                                            while (!isTerminated) {
                                                try {
                                                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
                                                    if (i2 == 0) {
                                                        executorService.shutdownNow();
                                                        i2 = 1;
                                                    }
                                                }
                                            }
                                            if (i2 != 0) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                } else {
                                    autoCloseable.close();
                                }
                            }
                        }
                    }
                } else {
                    polarVoyageMotionSceneCyberCelestialAlpha2457.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBitmapVisionAuroraPixel4705();
                    break;
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                ((PolarVoyageDrawableBetaNeoSpark8326) obj2).PolarVoyageRotateAnimationCyberCelestialDelta4768.remove((PolarVoyageDrawableBetaNeoSpark8326) obj);
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                PolarVoyageDrawableBetaNeoSpark8326 polarVoyageDrawableBetaNeoSpark8326 = (PolarVoyageDrawableBetaNeoSpark8326) obj2;
                polarVoyageDrawableBetaNeoSpark8326.getClass();
                PolarVoyagePaintStrikeAuroraStrike2697 polarVoyagePaintStrikeAuroraStrike2697 = (PolarVoyagePaintStrikeAuroraStrike2697) ((PolarVoyageRealtimeDatabaseThunderOmega8505) obj).PolarVoyageMotionLayoutTransitionHeroVision4068.getValue();
                if (polarVoyagePaintStrikeAuroraStrike2697 != null) {
                    polarVoyageDrawableBetaNeoSpark8326.PolarVoyageStrictModeLegendEpic1532.remove(polarVoyagePaintStrikeAuroraStrike2697.PolarVoyageItemDecorationUltraDeltaEpic7485);
                    break;
                }
                break;
            default:
                PolarVoyageMenuSpeedOmegaEpic7274 polarVoyageMenuSpeedOmegaEpic7274 = (PolarVoyageMenuSpeedOmegaEpic7274) obj2;
                View view = (View) obj;
                int i3 = polarVoyageMenuSpeedOmegaEpic7274.PolarVoyageAnimatorSetSparkUltraMax8233 - 1;
                polarVoyageMenuSpeedOmegaEpic7274.PolarVoyageAnimatorSetSparkUltraMax8233 = i3;
                if (i3 == 0) {
                    int i4 = PolarVoyageLayoutInflaterTitaniumStrike4588.PolarVoyageZipVortexCelestial6185;
                    PolarVoyageConstraintSetSpeedBetaHero9420.PolarVoyageMotionLayoutTransitionHeroVision4068(view, null);
                    PolarVoyageLayoutInflaterTitaniumStrike4588.PolarVoyageMotionLayoutTransitionHeroVision4068(view, null);
                    view.removeOnAttachStateChangeListener(polarVoyageMenuSpeedOmegaEpic7274.PolarVoyageBitmapMaxTitanTitan7960);
                    break;
                }
                break;
        }
    }
}
