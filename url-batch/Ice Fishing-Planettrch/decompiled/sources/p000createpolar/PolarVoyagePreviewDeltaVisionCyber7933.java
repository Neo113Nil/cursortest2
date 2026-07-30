package p000createpolar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyagePreviewDeltaVisionCyber7933 implements PolarVoyageCameraXMasterUltra1270, PolarVoyageTextInputEditTextTurboNovaOmega2115, PolarVoyageInputFilterSpectraMega1999, PolarVoyageR8EpicBlaze3675, PolarVoyageScaleGestureDetectorDragonBlazeShadow4642, PolarVoyageChipNebulaNovaXLegend6841, PolarVoyagePermissionInfoNebulaSparkCosmos8006, PolarVoyageFlowCollectorShadowPixel9788 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyagePreviewDeltaVisionCyber7933() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 16;
        PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
    }

    public static PolarVoyageServiceInfoStormStorm6276 PolarVoyageAnimatorSetSparkUltraMax8233(String str) {
        if (str.equals("http/1.0")) {
            return PolarVoyageServiceInfoStormStorm6276.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return PolarVoyageServiceInfoStormStorm6276.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return PolarVoyageServiceInfoStormStorm6276.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return PolarVoyageServiceInfoStormStorm6276.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return PolarVoyageServiceInfoStormStorm6276.SPDY_3;
        }
        if (str.equals("quic")) {
            return PolarVoyageServiceInfoStormStorm6276.QUIC;
        }
        if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "h3", false)) {
            return PolarVoyageServiceInfoStormStorm6276.HTTP_3;
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("Unexpected protocol: ".concat(str));
        return null;
    }

    public static final float PolarVoyageBarcodeScannerInfernoSolarSpark7767(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    public static final void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageToolbarHeroSpeed2535 polarVoyageToolbarHeroSpeed2535) {
        PolarVoyagePlaceholderVortexBetaPulse5592 polarVoyagePlaceholderVortexBetaPulse5592;
        PolarVoyageOnLongClickListenerShadowPrimeMax9791 polarVoyageOnLongClickListenerShadowPrimeMax9791;
        PolarVoyageOnLongClickListenerShadowPrimeMax9791 polarVoyageOnLongClickListenerShadowPrimeMax97912;
        PolarVoyagePlaceholderVortexBetaPulse5592 polarVoyagePlaceholderVortexBetaPulse55922 = PolarVoyageSQLiteAuroraSolarSpark5167.PolarVoyageAlertDialogCyberHeroQuantum3938;
        do {
            polarVoyagePlaceholderVortexBetaPulse5592 = PolarVoyageSQLiteAuroraSolarSpark5167.PolarVoyageAlertDialogCyberHeroQuantum3938;
            polarVoyageOnLongClickListenerShadowPrimeMax9791 = (PolarVoyageOnLongClickListenerShadowPrimeMax9791) polarVoyagePlaceholderVortexBetaPulse5592.getValue();
            PolarVoyagePagingDataAlphaUltra1037 polarVoyagePagingDataAlphaUltra1037 = polarVoyageOnLongClickListenerShadowPrimeMax9791.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            PolarVoyageOnDeviceTranslatorDragonQuantum5263 polarVoyageOnDeviceTranslatorDragonQuantum5263 = (PolarVoyageOnDeviceTranslatorDragonQuantum5263) polarVoyagePagingDataAlphaUltra1037.get(polarVoyageToolbarHeroSpeed2535);
            if (polarVoyageOnDeviceTranslatorDragonQuantum5263 == null) {
                polarVoyageOnLongClickListenerShadowPrimeMax97912 = polarVoyageOnLongClickListenerShadowPrimeMax9791;
            } else {
                Object obj = polarVoyageOnDeviceTranslatorDragonQuantum5263.PolarVoyageZipVortexCelestial6185;
                Object obj2 = polarVoyageOnDeviceTranslatorDragonQuantum5263.PolarVoyageMotionLayoutTransitionHeroVision4068;
                PolarVoyageTextRecognitionMasterPrime1651 polarVoyageTextRecognitionMasterPrime1651 = polarVoyagePagingDataAlphaUltra1037.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageTextRecognitionMasterPrime1651 PolarVoyageLayerDrawableShadowTitaniumOmega1942 = polarVoyageTextRecognitionMasterPrime1651.PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageToolbarHeroSpeed2535 != null ? polarVoyageToolbarHeroSpeed2535.hashCode() : 0, 0, polarVoyageToolbarHeroSpeed2535);
                if (polarVoyageTextRecognitionMasterPrime1651 != PolarVoyageLayerDrawableShadowTitaniumOmega1942) {
                    polarVoyagePagingDataAlphaUltra1037 = PolarVoyageLayerDrawableShadowTitaniumOmega1942 == null ? PolarVoyagePagingDataAlphaUltra1037.PolarVoyageRotateAnimationCyberCelestialDelta4768 : new PolarVoyagePagingDataAlphaUltra1037(PolarVoyageLayerDrawableShadowTitaniumOmega1942, polarVoyagePagingDataAlphaUltra1037.PolarVoyageStrictModeLegendEpic1532 - 1);
                }
                PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069 polarVoyageOnLongClickListenerOlympianPhantomAlpha1069 = PolarVoyageOnLongClickListenerOlympianPhantomAlpha1069.PolarVoyageDrawableDeltaHyperion5742;
                if (obj != polarVoyageOnLongClickListenerOlympianPhantomAlpha1069) {
                    Object obj3 = polarVoyagePagingDataAlphaUltra1037.get(obj);
                    obj3.getClass();
                    polarVoyagePagingDataAlphaUltra1037 = polarVoyagePagingDataAlphaUltra1037.PolarVoyageZipVortexCelestial6185(obj, new PolarVoyageOnDeviceTranslatorDragonQuantum5263(((PolarVoyageOnDeviceTranslatorDragonQuantum5263) obj3).PolarVoyageZipVortexCelestial6185, obj2));
                }
                if (obj2 != polarVoyageOnLongClickListenerOlympianPhantomAlpha1069) {
                    Object obj4 = polarVoyagePagingDataAlphaUltra1037.get(obj2);
                    obj4.getClass();
                    polarVoyagePagingDataAlphaUltra1037 = polarVoyagePagingDataAlphaUltra1037.PolarVoyageZipVortexCelestial6185(obj2, new PolarVoyageOnDeviceTranslatorDragonQuantum5263(obj, ((PolarVoyageOnDeviceTranslatorDragonQuantum5263) obj4).PolarVoyageMotionLayoutTransitionHeroVision4068));
                }
                Object obj5 = obj != polarVoyageOnLongClickListenerOlympianPhantomAlpha1069 ? polarVoyageOnLongClickListenerShadowPrimeMax9791.PolarVoyageItemDecorationUltraDeltaEpic7485 : obj2;
                if (obj2 != polarVoyageOnLongClickListenerOlympianPhantomAlpha1069) {
                    obj = polarVoyageOnLongClickListenerShadowPrimeMax9791.PolarVoyageStrictModeLegendEpic1532;
                }
                polarVoyageOnLongClickListenerShadowPrimeMax97912 = new PolarVoyageOnLongClickListenerShadowPrimeMax9791(obj5, obj, polarVoyagePagingDataAlphaUltra1037);
            }
            if (polarVoyageOnLongClickListenerShadowPrimeMax9791 == polarVoyageOnLongClickListenerShadowPrimeMax97912) {
                return;
            }
        } while (!polarVoyagePlaceholderVortexBetaPulse5592.PolarVoyageStrictModeLegendEpic1532(polarVoyageOnLongClickListenerShadowPrimeMax9791, polarVoyageOnLongClickListenerShadowPrimeMax97912));
    }

    public static Typeface PolarVoyageBottomSheetOmegaNeo1907(String str, PolarVoyagePaintSolarElite8455 polarVoyagePaintSolarElite8455, int i) {
        if (i == 0 && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyagePaintSolarElite8455, PolarVoyagePaintSolarElite8455.PolarVoyageViewRogueMaster4778) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyagePaintSolarElite8455, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(PolarVoyageRemoteModelManagerOlympianCelestial9141) : Typeface.create(str, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }

    public static final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854) {
        PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova98542 = PolarVoyageDrawablePixelCyberMega1951.PolarVoyageCameraPixelBlaze2629;
        return !PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageContentProviderHyperSpark3838(polarVoyageCameraPhantomNova9854.PolarVoyageMotionLayoutTransitionHeroVision4068(), ".class", true);
    }

    public static PolarVoyageCameraPhantomNova9854 PolarVoyageRemoteModelManagerOlympianCelestial9141(String str) {
        str.getClass();
        PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967 = PolarVoyageKeyEventPhoenixHyperUltra2521.PolarVoyageZipVortexCelestial6185;
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = new PolarVoyageSnackbarSpectraMasterMaster4120();
        polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageCanvasElitePhoenix4750(str);
        return PolarVoyageKeyEventPhoenixHyperUltra2521.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageSnackbarSpectraMasterMaster4120, false);
    }

    public static byte[] PolarVoyageRotateAnimationCyberCelestialDelta4768(List list) {
        list.getClass();
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = new PolarVoyageSnackbarSpectraMasterMaster4120();
        ArrayList PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageTextInputEditTextNebulaHero6651(list);
        int size = PolarVoyageTextInputEditTextNebulaHero6651.size();
        int i = 0;
        while (i < size) {
            Object obj = PolarVoyageTextInputEditTextNebulaHero6651.get(i);
            i++;
            String str = (String) obj;
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(str.length());
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageCanvasElitePhoenix4750(str);
        }
        return polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageContentProviderHyperSpark3838(polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532);
    }

    public static ArrayList PolarVoyageTextInputEditTextNebulaHero6651(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PolarVoyageServiceInfoStormStorm6276) obj) != PolarVoyageServiceInfoStormStorm6276.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((PolarVoyageServiceInfoStormStorm6276) obj2).PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        return arrayList2;
    }

    public int PolarVoyageBitmapMaxTitanTitan7960(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // p000createpolar.PolarVoyageChipNebulaNovaXLegend6841
    public Typeface PolarVoyageCameraPixelBlaze2629(PolarVoyagePoseDetectionNebulaCyber8239 polarVoyagePoseDetectionNebulaCyber8239, PolarVoyagePaintSolarElite8455 polarVoyagePaintSolarElite8455, int i) {
        String str;
        polarVoyagePoseDetectionNebulaCyber8239.getClass();
        int i2 = polarVoyagePaintSolarElite8455.PolarVoyageItemDecorationUltraDeltaEpic7485 / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i2 || i2 >= 4) {
            if (i2 != 4) {
                if (i2 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageBottomSheetOmegaNeo1907(str, polarVoyagePaintSolarElite8455, i);
            if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBottomSheetOmegaNeo1907, Typeface.create(Typeface.DEFAULT, PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyagePaintSolarElite8455, i))) && !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBottomSheetOmegaNeo1907, PolarVoyageBottomSheetOmegaNeo1907(null, polarVoyagePaintSolarElite8455, i))) {
                typeface = PolarVoyageBottomSheetOmegaNeo1907;
            }
        }
        return typeface == null ? PolarVoyageBottomSheetOmegaNeo1907("sans-serif", polarVoyagePaintSolarElite8455, i) : typeface;
    }

    @Override // p000createpolar.PolarVoyagePermissionInfoNebulaSparkCosmos8006
    public void PolarVoyageContentProviderHyperSpark3838(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // p000createpolar.PolarVoyageCameraXMasterUltra1270
    public long PolarVoyageDiffUtilTurboStrike5735(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
            int i = PolarVoyageStorageFusionThunderPrime5160.PolarVoyageZipVortexCelestial6185;
            return floatToRawIntBits;
        }
        float PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageBitmapVisionAuroraPixel4705(j, j2);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(PolarVoyageBitmapVisionAuroraPixel4705) << 32) | (Float.floatToRawIntBits(PolarVoyageBitmapVisionAuroraPixel4705) & 4294967295L);
        int i2 = PolarVoyageStorageFusionThunderPrime5160.PolarVoyageZipVortexCelestial6185;
        return floatToRawIntBits2;
    }

    public Signature[] PolarVoyageDisplayMetricsVortexDragon9516(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // p000createpolar.PolarVoyagePermissionInfoNebulaSparkCosmos8006
    public void PolarVoyageDrawableDeltaHyperion5742() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void PolarVoyageItemDecorationUltraDeltaEpic7485(final WebView webView) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webView.setDownloadListener(new DownloadListener() { // from class: create-polar.PolarVoyageViewBindingCelestialPrimeHyper3230
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                Context context = webView.getContext();
                str.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        });
        webView.setLayerType(2, null);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = webView.getSettings();
        settings.getClass();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setMixedContentMode(0);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
    }

    @Override // p000createpolar.PolarVoyageR8EpicBlaze3675
    public void PolarVoyageKotlinBetaPulseBeta3653() {
        throw new UnsupportedOperationException();
    }

    @Override // p000createpolar.PolarVoyageChipNebulaNovaXLegend6841
    public Typeface PolarVoyageNavigationViewHyperHyperHyperion1793(PolarVoyagePaintSolarElite8455 polarVoyagePaintSolarElite8455, int i) {
        return PolarVoyageBottomSheetOmegaNeo1907(null, polarVoyagePaintSolarElite8455, i);
    }

    @Override // p000createpolar.PolarVoyageR8EpicBlaze3675
    public PolarVoyageDrawerLayoutUltraMasterShadow4631 PolarVoyageSnackbarGammaEclipse2140(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000createpolar.PolarVoyageR8EpicBlaze3675
    public void PolarVoyageStrictModeLegendEpic1532(PolarVoyagePaintMegaCelestial9975 polarVoyagePaintMegaCelestial9975) {
        throw new UnsupportedOperationException();
    }

    @Override // p000createpolar.PolarVoyageInputFilterSpectraMega1999
    public Object PolarVoyageViewRogueMaster4778(Object obj) {
        ((PolarVoyageZipNovaStrike2011) obj).getClass();
        return PolarVoyageAlarmManagerSolarSolar6680.PolarVoyageZipVortexCelestial6185;
    }

    @Override // p000createpolar.PolarVoyageScaleGestureDetectorDragonBlazeShadow4642
    public Object PolarVoyageZipVortexCelestial6185(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 18:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                String encodeToString = Base64.encodeToString(bArr, 2);
                encodeToString.getClass();
                return encodeToString;
            default:
                PolarVoyageObjectAnimatorPrimeHyperOlympian2749 polarVoyageObjectAnimatorPrimeHyperOlympian2749 = (PolarVoyageObjectAnimatorPrimeHyperOlympian2749) obj;
                polarVoyageObjectAnimatorPrimeHyperOlympian2749.getClass();
                if (polarVoyageObjectAnimatorPrimeHyperOlympian2749.equals(PolarVoyageObjectAnimatorPrimeHyperOlympian2749.PolarVoyageZipVortexCelestial6185)) {
                    return new PolarVoyageAnnotationProcessorAlphaNeoOmega9986();
                }
                if (polarVoyageObjectAnimatorPrimeHyperOlympian2749.equals(PolarVoyageObjectAnimatorPrimeHyperOlympian2749.PolarVoyageKotlinBetaPulseBeta3653)) {
                    return new PolarVoyageSnackbarFusionBlazeTitanium7707();
                }
                if (polarVoyageObjectAnimatorPrimeHyperOlympian2749.equals(PolarVoyageObjectAnimatorPrimeHyperOlympian2749.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                    return new PolarVoyageClipboardManagerMegaDeltaBlaze7713();
                }
                if (polarVoyageObjectAnimatorPrimeHyperOlympian2749.equals(PolarVoyageObjectAnimatorPrimeHyperOlympian2749.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                    return new PolarVoyageFCMHyperHero9795();
                }
                PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                return null;
        }
    }

    public PolarVoyagePreviewDeltaVisionCyber7933(PolarVoyageToolbarHeroSpeed2535 polarVoyageToolbarHeroSpeed2535, PolarVoyageServiceInfoNovaCyber2044 polarVoyageServiceInfoNovaCyber2044, PolarVoyagePreviewDeltaVisionCyber7933 polarVoyagePreviewDeltaVisionCyber7933, PolarVoyageWithContextGammaMaster7108 polarVoyageWithContextGammaMaster7108) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 19;
    }

    public /* synthetic */ PolarVoyagePreviewDeltaVisionCyber7933(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
    }

    @Override // p000createpolar.PolarVoyageTextInputEditTextTurboNovaOmega2115
    /* renamed from: PolarVoyageZipVortexCelestial6185, reason: collision with other method in class */
    public String mo6PolarVoyageZipVortexCelestial6185(Object obj) {
        String str = (String) obj;
        return str == null ? "" : str;
    }
}
