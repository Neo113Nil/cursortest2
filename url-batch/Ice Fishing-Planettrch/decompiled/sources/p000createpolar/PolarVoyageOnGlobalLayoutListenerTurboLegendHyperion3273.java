package p000createpolar;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273 implements PolarVoyageRippleDrawableUltraHeroDelta6612, PolarVoyageMapBlazeAlpha6089, PolarVoyageShapeDrawableStormHero5776, PolarVoyageServiceSolarDeltaFusion9632, PolarVoyageCrashlyticsQuantumFusion7846, PolarVoyageScaleAnimationVortexAurora2886, PolarVoyageFlowCollectorOmegaHyperion3803 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    @Override // p000createpolar.PolarVoyageShapeDrawableStormHero5776
    public PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, PolarVoyageThemeOverlayMegaStrike5586 polarVoyageThemeOverlayMegaStrike5586, int[] iArr) {
        PolarVoyageActionBarNovaRogueSpark9934 polarVoyageActionBarNovaRogueSpark9934 = (PolarVoyageActionBarNovaRogueSpark9934) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageDatabasePhantomBeta6832 PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageRotateAnimationCyberCelestialDelta4768();
        for (int i2 = 0; i2 < polarVoyageThemeOverlayMegaStrike5586.PolarVoyageZipVortexCelestial6185; i2++) {
            PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageBannerAdPrimeNova4024(i, polarVoyageThemeOverlayMegaStrike5586, i2, polarVoyageActionBarNovaRogueSpark9934, iArr[i2]));
        }
        return PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageDiffUtilTurboStrike5735();
    }

    public PolarVoyageFragmentManagerForceRogueCyber8904 PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493) {
        PolarVoyageActivityInfoPixelEliteNovaX7277 polarVoyageActivityInfoPixelEliteNovaX7277 = (PolarVoyageActivityInfoPixelEliteNovaX7277) this.PolarVoyageStrictModeLegendEpic1532;
        URL url = (URL) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532;
        String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageFlingGestureEclipsePrimeMax1376("CctTransportBackend");
        if (Log.isLoggable(PolarVoyageFlingGestureEclipsePrimeMax1376, 4)) {
            Log.i(PolarVoyageFlingGestureEclipsePrimeMax1376, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
        httpURLConnection.setReadTimeout(polarVoyageActivityInfoPixelEliteNovaX7277.PolarVoyageTextInputEditTextNebulaHero6651);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = polarVoyageActivityInfoPixelEliteNovaX7277.PolarVoyageZipVortexCelestial6185;
                    PolarVoyageKeyframeThunderUltra8111 polarVoyageKeyframeThunderUltra8111 = (PolarVoyageKeyframeThunderUltra8111) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    PolarVoyageVelocityTrackerEpicEliteVortex6257 polarVoyageVelocityTrackerEpicEliteVortex6257 = (PolarVoyageVelocityTrackerEpicEliteVortex6257) polarVoyageAdapterTitanSpark4027.PolarVoyageStrictModeLegendEpic1532;
                    PolarVoyageFlingGestureHeroPhantomEclipse1222 polarVoyageFlingGestureHeroPhantomEclipse1222 = new PolarVoyageFlingGestureHeroPhantomEclipse1222(bufferedWriter, polarVoyageVelocityTrackerEpicEliteVortex6257.PolarVoyageZipVortexCelestial6185, polarVoyageVelocityTrackerEpicEliteVortex6257.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageVelocityTrackerEpicEliteVortex6257.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageVelocityTrackerEpicEliteVortex6257.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                    polarVoyageFlingGestureHeroPhantomEclipse1222.PolarVoyageDiffUtilTurboStrike5735(polarVoyageKeyframeThunderUltra8111);
                    polarVoyageFlingGestureHeroPhantomEclipse1222.PolarVoyageItemDecorationUltraDeltaEpic7485();
                    polarVoyageFlingGestureHeroPhantomEclipse1222.PolarVoyageMotionLayoutTransitionHeroVision4068.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String PolarVoyageFlingGestureEclipsePrimeMax13762 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageFlingGestureEclipsePrimeMax1376("CctTransportBackend");
                    if (Log.isLoggable(PolarVoyageFlingGestureEclipsePrimeMax13762, 4)) {
                        Log.i(PolarVoyageFlingGestureEclipsePrimeMax13762, String.format("Status Code: %d", valueOf));
                    }
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageSnackbarGammaEclipse2140("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageSnackbarGammaEclipse2140("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new PolarVoyageFragmentManagerForceRogueCyber8904(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new PolarVoyageFragmentManagerForceRogueCyber8904(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            PolarVoyageFragmentManagerForceRogueCyber8904 polarVoyageFragmentManagerForceRogueCyber8904 = new PolarVoyageFragmentManagerForceRogueCyber8904(responseCode, null, PolarVoyageResourcesStormEliteEpic2202.PolarVoyageZipVortexCelestial6185(new BufferedReader(new InputStreamReader(gZIPInputStream))).PolarVoyageZipVortexCelestial6185);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return polarVoyageFragmentManagerForceRogueCyber8904;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (PolarVoyageMapThunderAurora9698 e) {
            e = e;
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageNavigationViewHyperHyperHyperion1793("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new PolarVoyageFragmentManagerForceRogueCyber8904(Constants.MINIMAL_ERROR_STATUS_CODE, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageNavigationViewHyperHyperHyperion1793("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new PolarVoyageFragmentManagerForceRogueCyber8904(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageNavigationViewHyperHyperHyperion1793("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new PolarVoyageFragmentManagerForceRogueCyber8904(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageNavigationViewHyperHyperHyperion1793("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new PolarVoyageFragmentManagerForceRogueCyber8904(Constants.MINIMAL_ERROR_STATUS_CODE, null, 0L);
        }
    }

    @Override // p000createpolar.PolarVoyageServiceSolarDeltaFusion9632
    public void PolarVoyageDiffUtilTurboStrike5735(PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case 13:
                polarVoyageDialogFragmentTitanCelestial7995.getClass();
                ((PolarVoyageVibratorMasterAlphaNova2131) obj).PolarVoyageZipVortexCelestial6185(polarVoyageDialogFragmentTitanCelestial7995);
                break;
            case 26:
                PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBitmapMaxTitanTitan7960((Intent) obj);
                break;
            case 27:
                ((PolarVoyageContextShadowStrikeCelestial9029) obj).PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // p000createpolar.PolarVoyageCrashlyticsQuantumFusion7846
    public long PolarVoyageItemDecorationUltraDeltaEpic7485(long j) {
        return PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageItemDecorationUltraDeltaEpic7485((j * r8.PolarVoyageBitmapVisionAuroraPixel4705) / 1000000, 0L, ((PolarVoyageTransitionHyperionVortex1802) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1);
    }

    @Override // p000createpolar.PolarVoyageFlowCollectorOmegaHyperion3803
    public Object PolarVoyageKotlinBetaPulseBeta3653() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case 24:
                PolarVoyageExoPlayerNeoDelta8060 polarVoyageExoPlayerNeoDelta8060 = ((PolarVoyageWorkManagerVortexNova2773) obj).PolarVoyageStrictModeLegendEpic1532;
                SQLiteDatabase PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageExoPlayerNeoDelta8060.PolarVoyageMotionLayoutTransitionHeroVision4068();
                PolarVoyageMotionLayoutTransitionHeroVision4068.beginTransaction();
                try {
                    PolarVoyageMotionLayoutTransitionHeroVision4068.compileStatement("DELETE FROM log_event_dropped").execute();
                    PolarVoyageMotionLayoutTransitionHeroVision4068.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + polarVoyageExoPlayerNeoDelta8060.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185()).execute();
                    PolarVoyageMotionLayoutTransitionHeroVision4068.setTransactionSuccessful();
                    return null;
                } finally {
                    PolarVoyageMotionLayoutTransitionHeroVision4068.endTransaction();
                }
            default:
                PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = (PolarVoyageAnimatorCelestialDeltaMaster5821) obj;
                Iterator it = ((Iterable) ((PolarVoyageExoPlayerNeoDelta8060) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageR8UltraEliteBeta8736(24))).iterator();
                while (it.hasNext()) {
                    ((PolarVoyageAlarmManagerAlphaInferno3493) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutForceEpicAurora7183((PolarVoyageLayoutInfernoSpeed9711) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // p000createpolar.PolarVoyageRippleDrawableUltraHeroDelta6612
    public void PolarVoyageMotionLayoutTransitionHeroVision4068(Object obj) {
        ((PolarVoyageStateFlowNebulaMax1492) ((PolarVoyageConstraintSetCloneTitanOmega1401) this.PolarVoyageStrictModeLegendEpic1532).getValue()).PolarVoyageZipVortexCelestial6185(obj);
    }

    public void PolarVoyageStrictModeLegendEpic1532() {
        PolarVoyageObjectDetectionThunderHyperInferno3620 polarVoyageObjectDetectionThunderHyperInferno3620 = (PolarVoyageObjectDetectionThunderHyperInferno3620) this.PolarVoyageStrictModeLegendEpic1532;
        synchronized (PolarVoyageLaunchOmegaDragon4995.PolarVoyageKotlinBetaPulseBeta3653) {
            List list = PolarVoyageLaunchOmegaDragon4995.PolarVoyageItemDecorationUltraDeltaEpic7485;
            list.getClass();
            ArrayList arrayList = new ArrayList(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, polarVoyageObjectDetectionThunderHyperInferno3620)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            PolarVoyageLaunchOmegaDragon4995.PolarVoyageItemDecorationUltraDeltaEpic7485 = arrayList;
        }
    }

    public void PolarVoyageTextInputEditTextNebulaHero6651(long j, PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case 15:
                PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageViewRogueMaster4778(j, polarVoyageTextRecognitionHeroOmega1312, ((PolarVoyageFCMSolarHyperion7432) obj).PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149);
                break;
            case 19:
                PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageViewRogueMaster4778(j, polarVoyageTextRecognitionHeroOmega1312, ((PolarVoyageAnimatorThunderPhoenixElite4872) obj).PolarVoyageKotlinBetaPulseBeta3653);
                break;
            default:
                PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageCameraPixelBlaze2629(j, polarVoyageTextRecognitionHeroOmega1312, ((PolarVoyageAnimatorThunderPhoenixElite4872) obj).PolarVoyageKotlinBetaPulseBeta3653);
                break;
        }
    }

    @Override // p000createpolar.PolarVoyageMapBlazeAlpha6089
    public void PolarVoyageZipVortexCelestial6185(Object obj) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj2 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case 4:
                ((PolarVoyageAudioManagerPulseMega5140) obj).PolarVoyageSnackbarGammaEclipse2140 = (PolarVoyageAssetManagerQuantumSpectraPhoenix6233) obj2;
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                PolarVoyageTransformNeoUltra1411 polarVoyageTransformNeoUltra1411 = (PolarVoyageTransformNeoUltra1411) obj2;
                PolarVoyageAudioManagerPulseMega5140 polarVoyageAudioManagerPulseMega5140 = (PolarVoyageAudioManagerPulseMega5140) obj;
                polarVoyageAudioManagerPulseMega5140.PolarVoyageCameraViewSpectraMaxSpectra2824 += polarVoyageTransformNeoUltra1411.PolarVoyageTextInputEditTextNebulaHero6651;
                polarVoyageAudioManagerPulseMega5140.PolarVoyagePackageManagerCelestialPhoenix8393 += polarVoyageTransformNeoUltra1411.PolarVoyageBitmapVisionAuroraPixel4705;
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                ((PolarVoyageCameraSelectorVortexQuantumNebula4957) obj).PolarVoyageRotateAnimationCyberCelestialDelta4768((List) obj2);
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                ((PolarVoyageCameraSelectorVortexQuantumNebula4957) obj).PolarVoyageContentProviderHyperSpark3838((PolarVoyageFCMCosmosNebulaOlympian7141) obj2);
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                ((PolarVoyageCameraSelectorVortexQuantumNebula4957) obj).PolarVoyageNavigationViewHyperHyperHyperion1793((PolarVoyageFCMStrikeSpark5743) obj2);
                break;
            case 9:
                ((PolarVoyageCameraSelectorVortexQuantumNebula4957) obj).PolarVoyageContentProviderHyperSpark3838(((PolarVoyageLiveDataScopeDeltaForce2288) obj2).PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587);
                break;
            case 10:
                ((PolarVoyageCameraSelectorVortexQuantumNebula4957) obj).PolarVoyageRemoteModelManagerOlympianCelestial9141((PolarVoyageAsyncCelestialNebulaSpeed1878) obj2);
                break;
        }
    }

    @Override // p000createpolar.PolarVoyageScaleAnimationVortexAurora2886
    public void accept(Object obj) {
        ((PolarVoyageDatabasePhantomBeta6832) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutTransitionHeroVision4068((PolarVoyageConstraintSetCloneOlympianMegaVision9846) obj);
    }

    public /* synthetic */ PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273(PolarVoyageLayoutInflaterPulseBeta9407 polarVoyageLayoutInflaterPulseBeta9407, Object obj, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }
}
