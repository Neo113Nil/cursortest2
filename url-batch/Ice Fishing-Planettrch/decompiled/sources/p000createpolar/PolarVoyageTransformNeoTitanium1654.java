package p000createpolar;

import android.app.Activity;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Size;
import android.util.SizeF;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import com.adjust.sdk.Constants;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageTransformNeoTitanium1654 {
    public static final int[] PolarVoyageZipVortexCelestial6185 = {1, 2, 3, 6};
    public static final int[] PolarVoyageMotionLayoutTransitionHeroVision4068 = {48000, 44100, 32000};
    public static final int[] PolarVoyageKotlinBetaPulseBeta3653 = {24000, 22050, 16000};
    public static final int[] PolarVoyageBarcodeScannerInfernoSolarSpark7767 = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] PolarVoyageBitmapVisionAuroraPixel4705 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] PolarVoyageDiffUtilTurboStrike5735 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final Object PolarVoyageTextInputEditTextNebulaHero6651 = new Object();
    public static final PolarVoyageWithContextGammaMaster7108 PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageWithContextGammaMaster7108(8);
    public static final byte[] PolarVoyageStrictModeLegendEpic1532 = {36, 62, 59, 50, 57, 35, 7, 63, 54, 36, 50, 25, 54, 33, 62, 48, 54, 35, 56, 37};
    public static final PolarVoyageViewModelPrimeRogue9804 PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageViewModelPrimeRogue9804("player_info");
    public static final long[] PolarVoyageBottomSheetOmegaNeo1907 = new long[0];
    public static final String[] PolarVoyageViewRogueMaster4778 = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] PolarVoyageCameraPixelBlaze2629 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] PolarVoyageDrawableDeltaHyperion5742 = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static final float[] PolarVoyageActivityInfoBetaQuantum8726(int i, List list) {
        if (i == 0) {
            return null;
        }
        float[] fArr = new float[list.size() + i];
        fArr[0] = 0.0f;
        int size = list.size() - 1;
        int i2 = 1;
        for (int i3 = 1; i3 < size; i3++) {
            long j = ((PolarVoyageContentResolverRogueSpeed9469) list.get(i3)).PolarVoyageZipVortexCelestial6185;
            float size2 = i3 / (list.size() - 1);
            int i4 = i2 + 1;
            fArr[i2] = size2;
            if (PolarVoyageContentResolverRogueSpeed9469.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j) == 0.0f) {
                i2 += 2;
                fArr[i4] = size2;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = 1.0f;
        return fArr;
    }

    public static final BlendMode PolarVoyageAlarmManagerShadowHyperBeta8339(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static long PolarVoyageAlertDialogCyberHeroQuantum3938(double d) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageSnackbarGammaEclipse2140("not a normal value", PolarVoyagePackageManagerCelestialPhoenix8393(d));
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static final PolarVoyageVelocityTrackerGammaDeltaEpic7489 PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian6822) {
        PolarVoyageIntentServiceStrikeHyper8903 PolarVoyageDrawableDeltaHyperion57422 = polarVoyageEventNebulaCelestialOlympian6822.PolarVoyageDrawableDeltaHyperion5742(PolarVoyagePagingSourceEpicSolarStorm3628.PolarVoyageBottomSheetOmegaNeo1907);
        PolarVoyageVelocityTrackerGammaDeltaEpic7489 polarVoyageVelocityTrackerGammaDeltaEpic7489 = PolarVoyageDrawableDeltaHyperion57422 instanceof PolarVoyageVelocityTrackerGammaDeltaEpic7489 ? (PolarVoyageVelocityTrackerGammaDeltaEpic7489) PolarVoyageDrawableDeltaHyperion57422 : null;
        return polarVoyageVelocityTrackerGammaDeltaEpic7489 == null ? PolarVoyageMotionLayoutTransitionStormTitanHyperion4784.PolarVoyageZipVortexCelestial6185 : polarVoyageVelocityTrackerGammaDeltaEpic7489;
    }

    public static final PolarVoyageServiceConnectionRoguePixelElite3423 PolarVoyageBarcodeScannerInfernoSolarSpark7767(String str) {
        Set singleton = Collections.singleton(str);
        singleton.getClass();
        return new PolarVoyageServiceConnectionRoguePixelElite3423(singleton);
    }

    public static final float PolarVoyageBitmapMaxTitanTitan7960(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        PolarVoyageRunnableVisionPhoenix2735 polarVoyageRunnableVisionPhoenix2735 = PolarVoyageThemeOverlayCelestialOmegaSpark3810.PolarVoyageZipVortexCelestial6185;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : PolarVoyageScaleAnimationInfernoStrike4510.PolarVoyageZipVortexCelestial6185[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027, PolarVoyageColorStateListStormTurbo7339 polarVoyageColorStateListStormTurbo7339, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718, int i) {
        polarVoyageColorStateListStormTurbo7339.getClass();
        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(175583078);
        int i2 = 4;
        int i3 = (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageAdapterTitanSpark4027) ? 4 : 2) | i | (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageColorStateListStormTurbo7339) ? 32 : 16);
        if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCanvasElitePhoenix4750(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFlowSparkNovaX7791.PolarVoyageMotionLayoutTransitionHeroVision4068);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            PolarVoyageMotionLayoutTransitionInfernoHyperion5474 polarVoyageMotionLayoutTransitionInfernoHyperion5474 = (PolarVoyageMotionLayoutTransitionInfernoHyperion5474) polarVoyageAdapterTitanSpark4027.PolarVoyageStrictModeLegendEpic1532;
            boolean PolarVoyageItemDecorationUltraDeltaEpic74852 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageColorStateListStormTurbo7339) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageAdapterTitanSpark4027) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(activity);
            Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            if (PolarVoyageItemDecorationUltraDeltaEpic74852 || PolarVoyageAlarmManagerShadowHyperBeta8339 == PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185) {
                PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageInputMethodManagerLegendAlphaStorm3063(polarVoyageColorStateListStormTurbo7339, polarVoyageAdapterTitanSpark4027, activity, 5);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta8339);
            }
            PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageMotionLayoutTransitionInfernoHyperion5474, null, null, null, null, null, null, (PolarVoyageStateFlowNebulaMax1492) PolarVoyageAlarmManagerShadowHyperBeta8339, polarVoyageFlowCollectorEliteStrike5718, 0);
        } else {
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDatabaseCosmosSpectraSolar3905();
        }
        PolarVoyageInputMethodManagerFusionForceElite3024 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageNavigationViewHyperHyperHyperion1793();
        if (PolarVoyageNavigationViewHyperHyperHyperion1793 != null) {
            PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageDelayDragonPhoenixNeo9282(i, i2, polarVoyageAdapterTitanSpark4027, polarVoyageColorStateListStormTurbo7339);
        }
    }

    public static final int PolarVoyageBottomSheetOmegaNeo1907(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        for (int i2 = 1; i2 < size; i2++) {
            if (PolarVoyageContentResolverRogueSpeed9469.PolarVoyageBarcodeScannerInfernoSolarSpark7767(((PolarVoyageContentResolverRogueSpeed9469) list.get(i2)).PolarVoyageZipVortexCelestial6185) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final Object PolarVoyageCameraPixelBlaze2629(long j, PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126) {
        if (j > 0) {
            PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290 = new PolarVoyageDebugStrikeEclipseQuantum3290(1, PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageCanvasElitePhoenix4750(polarVoyageTextInputLayoutTitaniumGamma2126));
            polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageNavigationViewHyperHyperHyperion1793();
            if (j < Long.MAX_VALUE) {
                PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageViewRogueMaster4778).PolarVoyageFCMCelestialCosmosPixel3711(j, polarVoyageDebugStrikeEclipseQuantum3290);
            }
            Object PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageRemoteModelManagerOlympianCelestial9141();
            if (PolarVoyageRemoteModelManagerOlympianCelestial9141 == PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                return PolarVoyageRemoteModelManagerOlympianCelestial9141;
            }
        }
        return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
    }

    public static int PolarVoyageCameraViewSpectraMaxSpectra2824(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final void PolarVoyageCanvasElitePhoenix4750(List list) {
        if (list.size() >= 2) {
            return;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("colors must have length of at least 2 if colorStops is omitted.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        PolarVoyageToolbarEclipseInfernoHero6368(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = PolarVoyageLifecycleOlympianOmega3762(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int PolarVoyageCardViewAlphaVortexCelestial9747(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int PolarVoyageClipboardManagerAuroraPixel8666 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageClipboardManagerAuroraPixel8666(obj);
        int i2 = PolarVoyageClipboardManagerAuroraPixel8666 & i;
        int PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(i2, obj3);
        if (PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 != 0) {
            int i3 = ~i;
            int i4 = PolarVoyageClipboardManagerAuroraPixel8666 & i3;
            int i5 = -1;
            while (true) {
                int i6 = PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageMotionLayoutForceEpicAurora7183(obj, objArr[i6]) || (objArr2 != null && !PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageMotionLayoutForceEpicAurora7183(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = i8;
                }
            }
        }
        return -1;
    }

    public static final PorterDuff.Mode PolarVoyageConfigurationMaxSpectraForce5418(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static PolarVoyageBottomSheetVisionAurora1810 PolarVoyageContentProviderHyperSpark3838(String str) {
        str.getClass();
        PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageZipVortexCelestial61852 = PolarVoyageBottomSheetVisionAurora1810.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185(str, 0);
        if (PolarVoyageZipVortexCelestial61852 == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String str2 = (String) ((PolarVoyageCoroutineCelestialAuroraPixel1740) PolarVoyageZipVortexCelestial61852.PolarVoyageDisplayMetricsVortexDragon9516()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((PolarVoyageCoroutineCelestialAuroraPixel1740) PolarVoyageZipVortexCelestial61852.PolarVoyageDisplayMetricsVortexDragon9516()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = PolarVoyageZipVortexCelestial61852.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new PolarVoyageBottomSheetVisionAurora1810(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageZipVortexCelestial61853 = PolarVoyageBottomSheetVisionAurora1810.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185(str, i2);
            if (PolarVoyageZipVortexCelestial61853 == null) {
                PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageDrawableDeltaHyperion5742("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                return null;
            }
            PolarVoyageApplicationInfoHyperionHyperion6216 polarVoyageApplicationInfoHyperionHyperion6216 = (PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageZipVortexCelestial61853.PolarVoyageBottomSheetOmegaNeo1907;
            PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = polarVoyageApplicationInfoHyperionHyperion6216.PolarVoyageMotionLayoutTransitionHeroVision4068(1);
            String str3 = PolarVoyageMotionLayoutTransitionHeroVision40682 != null ? PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185 : null;
            if (str3 == null) {
                i = PolarVoyageZipVortexCelestial61853.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532;
            } else {
                PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40683 = polarVoyageApplicationInfoHyperionHyperion6216.PolarVoyageMotionLayoutTransitionHeroVision4068(2);
                String str4 = PolarVoyageMotionLayoutTransitionHeroVision40683 != null ? PolarVoyageMotionLayoutTransitionHeroVision40683.PolarVoyageZipVortexCelestial6185 : null;
                if (str4 == null) {
                    PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40684 = polarVoyageApplicationInfoHyperionHyperion6216.PolarVoyageMotionLayoutTransitionHeroVision4068(3);
                    PolarVoyageMotionLayoutTransitionHeroVision40684.getClass();
                    str4 = PolarVoyageMotionLayoutTransitionHeroVision40684.PolarVoyageZipVortexCelestial6185;
                } else if (str4.length() > 0 && PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBitmapMaxTitanTitan7960(str4.charAt(0), '\'', false) && str4.length() > 0 && PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBitmapMaxTitanTitan7960(str4.charAt(str4.length() - 1), '\'', false) && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = PolarVoyageZipVortexCelestial61853.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532;
            }
        }
    }

    public static void PolarVoyageDiffUtilDragonSpeedEclipse6225(PolarVoyageBottomSheetInfernoOmega3378 polarVoyageBottomSheetInfernoOmega3378, int i, PolarVoyageScaleAnimationVortexAurora2886 polarVoyageScaleAnimationVortexAurora2886) {
        long PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageBottomSheetInfernoOmega3378.PolarVoyageBitmapVisionAuroraPixel4705(i);
        List PolarVoyageDrawableDeltaHyperion57422 = polarVoyageBottomSheetInfernoOmega3378.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageBitmapVisionAuroraPixel47052);
        if (PolarVoyageDrawableDeltaHyperion57422.isEmpty()) {
            return;
        }
        if (i == polarVoyageBottomSheetInfernoOmega3378.PolarVoyageSnackbarGammaEclipse2140() - 1) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
            return;
        }
        long PolarVoyageBitmapVisionAuroraPixel47053 = polarVoyageBottomSheetInfernoOmega3378.PolarVoyageBitmapVisionAuroraPixel4705(i + 1) - polarVoyageBottomSheetInfernoOmega3378.PolarVoyageBitmapVisionAuroraPixel4705(i);
        if (PolarVoyageBitmapVisionAuroraPixel47053 > 0) {
            polarVoyageScaleAnimationVortexAurora2886.accept(new PolarVoyageConstraintSetCloneOlympianMegaVision9846(PolarVoyageBitmapVisionAuroraPixel47052, PolarVoyageBitmapVisionAuroraPixel47053, PolarVoyageDrawableDeltaHyperion57422));
        }
    }

    public static final void PolarVoyageDiffUtilTurboStrike5735(final boolean z, final PolarVoyageObjectDetectionThunderHyperInferno3620 polarVoyageObjectDetectionThunderHyperInferno3620, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718, final int i) {
        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(1818896922);
        int i2 = (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageTextInputEditTextNebulaHero6651(z) ? 4 : 2) | i | (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageObjectDetectionThunderHyperInferno3620) ? 32 : 16);
        if ((i2 & 19) == 18 && polarVoyageFlowCollectorEliteStrike5718.PolarVoyagePackageManagerCelestialPhoenix8393()) {
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDatabaseCosmosSpectraSolar3905();
        } else {
            PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageRotateAnimationCyberCelestialDelta4768(z, polarVoyageObjectDetectionThunderHyperInferno3620, polarVoyageFlowCollectorEliteStrike5718, i2 & 126);
        }
        PolarVoyageInputMethodManagerFusionForceElite3024 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageNavigationViewHyperHyperHyperion1793();
        if (PolarVoyageNavigationViewHyperHyperHyperion1793 != null) {
            PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageObjectDetectionThunderHyperInferno3620(z, polarVoyageObjectDetectionThunderHyperInferno3620, i) { // from class: create-polar.PolarVoyageCountDownTimerPhantomElite1043
                public final /* synthetic */ boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
                public final /* synthetic */ PolarVoyageObjectDetectionThunderHyperInferno3620 PolarVoyageStrictModeLegendEpic1532;

                @Override // p000createpolar.PolarVoyageObjectDetectionThunderHyperInferno3620
                public final Object PolarVoyageDiffUtilTurboStrike5735(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int PolarVoyageKotlinHeroHyper4083 = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageKotlinHeroHyper4083(1);
                    PolarVoyageTransformNeoTitanium1654.PolarVoyageDiffUtilTurboStrike5735(this.PolarVoyageItemDecorationUltraDeltaEpic7485, this.PolarVoyageStrictModeLegendEpic1532, (PolarVoyageFlowCollectorEliteStrike5718) obj, PolarVoyageKotlinHeroHyper4083);
                    return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                }
            };
        }
    }

    public static final float PolarVoyageDisplayMetricsVortexDragon9516(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        PolarVoyageRunnableVisionPhoenix2735 polarVoyageRunnableVisionPhoenix2735 = PolarVoyageThemeOverlayCelestialOmegaSpark3810.PolarVoyageZipVortexCelestial6185;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? PolarVoyageScaleAnimationInfernoStrike4510.PolarVoyageZipVortexCelestial6185[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static boolean PolarVoyageDrawableDeltaHyperion5742(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PolarVoyageContentResolverHyperOmegaSolar3508 PolarVoyageFCMCelestialCosmosPixel3711(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageStrictModeLegendEpic1532(newPullParser, "x:xmpmeta")) {
            throw PolarVoyageToastNeoOmega7549.PolarVoyageZipVortexCelestial6185(null, "Couldn't find xmp metadata");
        }
        PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
        long j = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageStrictModeLegendEpic1532(newPullParser, "rdf:Description")) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String PolarVoyageDiffUtilTurboStrike57352 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(newPullParser, PolarVoyageViewRogueMaster4778[i2]);
                    if (PolarVoyageDiffUtilTurboStrike57352 == null) {
                        i2++;
                    } else {
                        if (Integer.parseInt(PolarVoyageDiffUtilTurboStrike57352) != 1) {
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String PolarVoyageDiffUtilTurboStrike57353 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(newPullParser, PolarVoyageCameraPixelBlaze2629[i3]);
                            if (PolarVoyageDiffUtilTurboStrike57353 != null) {
                                j = Long.parseLong(PolarVoyageDiffUtilTurboStrike57353);
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        while (true) {
                            if (i >= 2) {
                                PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero14772 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
                                polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
                                break;
                            }
                            String PolarVoyageDiffUtilTurboStrike57354 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(newPullParser, PolarVoyageDrawableDeltaHyperion5742[i]);
                            if (PolarVoyageDiffUtilTurboStrike57354 != null) {
                                polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageContentProviderHyperSpark3838(new PolarVoyageRealtimeDatabaseSpectraVisionTitan3637("image/jpeg", 0L, 0L), new PolarVoyageRealtimeDatabaseSpectraVisionTitan3637("video/mp4", Long.parseLong(PolarVoyageDiffUtilTurboStrike57354), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else if (PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageStrictModeLegendEpic1532(newPullParser, "Container:Directory")) {
                polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = PolarVoyageViewBindingPulseHeroSpeed5705(newPullParser, "Container", "Item");
            } else if (PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageStrictModeLegendEpic1532(newPullParser, "GContainer:Directory")) {
                polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = PolarVoyageViewBindingPulseHeroSpeed5705(newPullParser, "GContainer", "GContainerItem");
            }
            if (PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageItemDecorationUltraDeltaEpic7485(newPullParser, "x:xmpmeta")) {
                if (!polarVoyageLifecycleCameraControllerUltraShadowDelta8620.isEmpty()) {
                    return new PolarVoyageContentResolverHyperOmegaSolar3508(j, polarVoyageLifecycleCameraControllerUltraShadowDelta8620);
                }
            }
        }
        return null;
    }

    public static int PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static final long PolarVoyageFlingGestureEclipsePrimeMax1376(PolarVoyageCardViewPulseSpark7250 polarVoyageCardViewPulseSpark7250) {
        float f = polarVoyageCardViewPulseSpark7250.PolarVoyageKotlinBetaPulseBeta3653 - polarVoyageCardViewPulseSpark7250.PolarVoyageZipVortexCelestial6185;
        float f2 = polarVoyageCardViewPulseSpark7250.PolarVoyageBarcodeScannerInfernoSolarSpark7767 - polarVoyageCardViewPulseSpark7250.PolarVoyageMotionLayoutTransitionHeroVision4068;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageGuidelineStormSolar2850(PolarVoyageBottomSheetInfernoOmega3378 polarVoyageBottomSheetInfernoOmega3378, PolarVoyageProximitySensorNovaXStrikeSolar8705 polarVoyageProximitySensorNovaXStrikeSolar8705, PolarVoyageScaleAnimationVortexAurora2886 polarVoyageScaleAnimationVortexAurora2886) {
        int PolarVoyageMotionLayoutTransitionHeroVision40682;
        boolean z;
        int i;
        long j = polarVoyageProximitySensorNovaXStrikeSolar8705.PolarVoyageZipVortexCelestial6185;
        if (j == -9223372036854775807L) {
            PolarVoyageMotionLayoutTransitionHeroVision40682 = 0;
        } else {
            PolarVoyageMotionLayoutTransitionHeroVision40682 = polarVoyageBottomSheetInfernoOmega3378.PolarVoyageMotionLayoutTransitionHeroVision4068(j);
            if (PolarVoyageMotionLayoutTransitionHeroVision40682 == -1) {
                PolarVoyageMotionLayoutTransitionHeroVision40682 = polarVoyageBottomSheetInfernoOmega3378.PolarVoyageSnackbarGammaEclipse2140();
            }
            if (PolarVoyageMotionLayoutTransitionHeroVision40682 > 0 && polarVoyageBottomSheetInfernoOmega3378.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageMotionLayoutTransitionHeroVision40682 - 1) == j) {
                PolarVoyageMotionLayoutTransitionHeroVision40682--;
            }
        }
        if (j != -9223372036854775807L && PolarVoyageMotionLayoutTransitionHeroVision40682 < polarVoyageBottomSheetInfernoOmega3378.PolarVoyageSnackbarGammaEclipse2140()) {
            List PolarVoyageDrawableDeltaHyperion57422 = polarVoyageBottomSheetInfernoOmega3378.PolarVoyageDrawableDeltaHyperion5742(j);
            long PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageBottomSheetInfernoOmega3378.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageMotionLayoutTransitionHeroVision40682);
            if (!PolarVoyageDrawableDeltaHyperion57422.isEmpty()) {
                long j2 = polarVoyageProximitySensorNovaXStrikeSolar8705.PolarVoyageZipVortexCelestial6185;
                if (j2 < PolarVoyageBitmapVisionAuroraPixel47052) {
                    polarVoyageScaleAnimationVortexAurora2886.accept(new PolarVoyageConstraintSetCloneOlympianMegaVision9846(j2, PolarVoyageBitmapVisionAuroraPixel47052 - j2, PolarVoyageDrawableDeltaHyperion57422));
                    z = true;
                    for (i = PolarVoyageMotionLayoutTransitionHeroVision40682; i < polarVoyageBottomSheetInfernoOmega3378.PolarVoyageSnackbarGammaEclipse2140(); i++) {
                        PolarVoyageDiffUtilDragonSpeedEclipse6225(polarVoyageBottomSheetInfernoOmega3378, i, polarVoyageScaleAnimationVortexAurora2886);
                    }
                    if (polarVoyageProximitySensorNovaXStrikeSolar8705.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                        return;
                    }
                    if (z) {
                        PolarVoyageMotionLayoutTransitionHeroVision40682--;
                    }
                    for (int i2 = 0; i2 < PolarVoyageMotionLayoutTransitionHeroVision40682; i2++) {
                        PolarVoyageDiffUtilDragonSpeedEclipse6225(polarVoyageBottomSheetInfernoOmega3378, i2, polarVoyageScaleAnimationVortexAurora2886);
                    }
                    if (z) {
                        polarVoyageScaleAnimationVortexAurora2886.accept(new PolarVoyageConstraintSetCloneOlympianMegaVision9846(polarVoyageBottomSheetInfernoOmega3378.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageMotionLayoutTransitionHeroVision40682), j - polarVoyageBottomSheetInfernoOmega3378.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageMotionLayoutTransitionHeroVision40682), polarVoyageBottomSheetInfernoOmega3378.PolarVoyageDrawableDeltaHyperion5742(j)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < polarVoyageBottomSheetInfernoOmega3378.PolarVoyageSnackbarGammaEclipse2140()) {
        }
        if (polarVoyageProximitySensorNovaXStrikeSolar8705.PolarVoyageMotionLayoutTransitionHeroVision4068) {
        }
    }

    public static void PolarVoyageItemDecorationUltraDeltaEpic7485(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = PolarVoyageSnackbarTitaniumElite5182.PolarVoyageZipVortexCelestial6185;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = PolarVoyageLightSensorFusionMax1182.PolarVoyageZipVortexCelestial6185;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static PolarVoyageSupervisorJobVortexDelta5512 PolarVoyageKotlinBetaPulseBeta3653(int i, PolarVoyageCameraSelectorTitaniumNovaX9647 polarVoyageCameraSelectorTitaniumNovaX9647, int i2) {
        int i3 = i2 & 2;
        PolarVoyageCameraSelectorTitaniumNovaX9647 polarVoyageCameraSelectorTitaniumNovaX96472 = PolarVoyageCameraSelectorTitaniumNovaX9647.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i3 != 0) {
            polarVoyageCameraSelectorTitaniumNovaX9647 = polarVoyageCameraSelectorTitaniumNovaX96472;
        }
        if (i == -2) {
            if (polarVoyageCameraSelectorTitaniumNovaX9647 != polarVoyageCameraSelectorTitaniumNovaX96472) {
                return new PolarVoyageVideoCaptureForceThunder4873(1, polarVoyageCameraSelectorTitaniumNovaX9647);
            }
            PolarVoyageFirebaseHeroVision8149.PolarVoyageZipVortexCelestial6185.getClass();
            return new PolarVoyageSupervisorJobVortexDelta5512(PolarVoyageVectorDrawableCompatAuroraSpectra7370.PolarVoyageMotionLayoutTransitionHeroVision4068);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? polarVoyageCameraSelectorTitaniumNovaX9647 == polarVoyageCameraSelectorTitaniumNovaX96472 ? new PolarVoyageSupervisorJobVortexDelta5512(i) : new PolarVoyageVideoCaptureForceThunder4873(i, polarVoyageCameraSelectorTitaniumNovaX9647) : new PolarVoyageSupervisorJobVortexDelta5512(Integer.MAX_VALUE) : polarVoyageCameraSelectorTitaniumNovaX9647 == polarVoyageCameraSelectorTitaniumNovaX96472 ? new PolarVoyageSupervisorJobVortexDelta5512(0) : new PolarVoyageVideoCaptureForceThunder4873(1, polarVoyageCameraSelectorTitaniumNovaX9647);
        }
        if (polarVoyageCameraSelectorTitaniumNovaX9647 == polarVoyageCameraSelectorTitaniumNovaX96472) {
            return new PolarVoyageVideoCaptureForceThunder4873(1, PolarVoyageCameraSelectorTitaniumNovaX9647.PolarVoyageStrictModeLegendEpic1532);
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final Class PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageActionBarInfernoMax1008 polarVoyageActionBarInfernoMax1008) {
        polarVoyageActionBarInfernoMax1008.getClass();
        Class PolarVoyageZipVortexCelestial61852 = polarVoyageActionBarInfernoMax1008.PolarVoyageZipVortexCelestial6185();
        PolarVoyageZipVortexCelestial61852.getClass();
        return PolarVoyageZipVortexCelestial61852;
    }

    public static int PolarVoyageLifecycleOlympianOmega3762(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static final int[] PolarVoyageLooperThreadAlphaPrime1279(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(((PolarVoyageContentResolverRogueSpeed9469) list.get(i3)).PolarVoyageZipVortexCelestial6185);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i4 = 0;
        while (i3 < size3) {
            long j = ((PolarVoyageContentResolverRogueSpeed9469) list.get(i3)).PolarVoyageZipVortexCelestial6185;
            if (PolarVoyageContentResolverRogueSpeed9469.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(PolarVoyageContentResolverRogueSpeed9469.PolarVoyageMotionLayoutTransitionHeroVision4068(((PolarVoyageContentResolverRogueSpeed9469) list.get(1)).PolarVoyageZipVortexCelestial6185, 0.0f));
                } else if (i3 == size2) {
                    i2 = i4 + 1;
                    iArr2[i4] = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(PolarVoyageContentResolverRogueSpeed9469.PolarVoyageMotionLayoutTransitionHeroVision4068(((PolarVoyageContentResolverRogueSpeed9469) list.get(i3 - 1)).PolarVoyageZipVortexCelestial6185, 0.0f));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(PolarVoyageContentResolverRogueSpeed9469.PolarVoyageMotionLayoutTransitionHeroVision4068(((PolarVoyageContentResolverRogueSpeed9469) list.get(i3 - 1)).PolarVoyageZipVortexCelestial6185, 0.0f));
                    i4 += 2;
                    iArr2[i5] = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(PolarVoyageContentResolverRogueSpeed9469.PolarVoyageMotionLayoutTransitionHeroVision4068(((PolarVoyageContentResolverRogueSpeed9469) list.get(i3 + 1)).PolarVoyageZipVortexCelestial6185, 0.0f));
                }
                i4 = i2;
            } else {
                iArr2[i4] = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageActionBarInfernoMax1008 polarVoyageActionBarInfernoMax1008) {
        polarVoyageActionBarInfernoMax1008.getClass();
        Class PolarVoyageZipVortexCelestial61852 = polarVoyageActionBarInfernoMax1008.PolarVoyageZipVortexCelestial6185();
        if (PolarVoyageZipVortexCelestial61852.isPrimitive()) {
            String name = PolarVoyageZipVortexCelestial61852.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return PolarVoyageZipVortexCelestial61852;
    }

    public static final void PolarVoyageMotionLayoutTransitionHeroVision4068(String str, PolarVoyageViewPrimeShadowSolar4883 polarVoyageViewPrimeShadowSolar4883, PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar8536, int i, boolean z, int i2, int i3, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718, int i4) {
        int i5;
        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(-1186827822);
        if ((i4 & 6) == 0) {
            i5 = (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageViewPrimeShadowSolar4883) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageIntentHyperSolar8536) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(null) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageTextInputEditTextNebulaHero6651(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i3) ? 8388608 : 4194304;
        }
        int i6 = i5 | 100663296;
        if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCanvasElitePhoenix4750(i6 & 1, (38347923 & i6) != 38347922)) {
            PolarVoyageZipVortexCelestial6185(str, polarVoyageViewPrimeShadowSolar4883, polarVoyageIntentHyperSolar8536, i, z, i2, i3, polarVoyageFlowCollectorEliteStrike5718, i6 & 268435454);
        } else {
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDatabaseCosmosSpectraSolar3905();
        }
        PolarVoyageInputMethodManagerFusionForceElite3024 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageNavigationViewHyperHyperHyperion1793();
        if (PolarVoyageNavigationViewHyperHyperHyperion1793 != null) {
            PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageAnimationSpectraHyper8129(str, polarVoyageViewPrimeShadowSolar4883, polarVoyageIntentHyperSolar8536, i, z, i2, i3, i4, 0);
        }
    }

    public static final String[] PolarVoyageNavigationViewHyperHyperHyperion1793(PolarVoyageItemDecorationHyperSpectra4087 polarVoyageItemDecorationHyperSpectra4087) {
        polarVoyageItemDecorationHyperSpectra4087.getClass();
        return (String[]) ((PolarVoyageServiceConnectionRoguePixelElite3423) polarVoyageItemDecorationHyperSpectra4087).PolarVoyageMotionLayoutTransitionHeroVision4068.toArray(new String[0]);
    }

    public static boolean PolarVoyagePackageManagerCelestialPhoenix8393(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static int PolarVoyageRemoteModelManagerOlympianCelestial9141(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = PolarVoyageMotionLayoutTransitionHeroVision4068[i];
        if (i4 == 44100) {
            return ((i2 % 2) + PolarVoyageDiffUtilTurboStrike5735[i3]) * 2;
        }
        int i5 = PolarVoyageBitmapVisionAuroraPixel4705[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static long[] PolarVoyageRotateAnimationCyberCelestialDelta4768(long[]... jArr) {
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i = (int) j;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageNavigationViewHyperHyperHyperion1793(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }

    public static PolarVoyagePermissionPulseElite6024 PolarVoyageSnackbarGammaEclipse2140(SSLSession sSLSession) {
        Object obj;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        PolarVoyageServiceCyberOlympian6675 PolarVoyageBottomSheetOmegaNeo19072 = PolarVoyageServiceCyberOlympian6675.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("tlsVersion == NONE");
            return null;
        }
        PolarVoyageAdapterDelegateSpeedVisionRogue8497.PolarVoyageStrictModeLegendEpic1532.getClass();
        PolarVoyageAdapterDelegateSpeedVisionRogue8497 PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageConstraintLayoutVisionMasterDragon8646.PolarVoyageKotlinBetaPulseBeta3653(protocol);
        try {
            obj = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageStrictModeLegendEpic1532(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            obj = PolarVoyageWindowManagerSpeedUltra3573.PolarVoyageItemDecorationUltraDeltaEpic7485;
        }
        return new PolarVoyagePermissionPulseElite6024(PolarVoyageKotlinBetaPulseBeta36532, PolarVoyageBottomSheetOmegaNeo19072, PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageStrictModeLegendEpic1532(sSLSession.getLocalCertificates()), new PolarVoyageNavigationViewPhoenixTurbo2488(5, obj));
    }

    public static final Bundle PolarVoyageStrictModeLegendEpic1532(PolarVoyageRippleDrawableRogueBlazeBlaze8980... polarVoyageRippleDrawableRogueBlazeBlaze8980Arr) {
        Bundle bundle = new Bundle(polarVoyageRippleDrawableRogueBlazeBlaze8980Arr.length);
        for (PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 : polarVoyageRippleDrawableRogueBlazeBlaze8980Arr) {
            String str = (String) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485;
            Object obj = polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageStrictModeLegendEpic1532;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageInsetDrawableCosmosStrikeStrike4393 polarVoyageInsetDrawableCosmosStrikeStrike4393, PolarVoyageViewPagerNovaShadow8337 polarVoyageViewPagerNovaShadow8337, Throwable th, PolarVoyageMotionSceneHyperVisionVision6497 polarVoyageMotionSceneHyperVisionVision6497) {
        PolarVoyageSQLiteFusionShadow7862 polarVoyageSQLiteFusionShadow7862;
        int i;
        try {
            if (polarVoyageMotionSceneHyperVisionVision6497 instanceof PolarVoyageSQLiteFusionShadow7862) {
                polarVoyageSQLiteFusionShadow7862 = (PolarVoyageSQLiteFusionShadow7862) polarVoyageMotionSceneHyperVisionVision6497;
                int i2 = polarVoyageSQLiteFusionShadow7862.PolarVoyageCameraPixelBlaze2629;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    polarVoyageSQLiteFusionShadow7862.PolarVoyageCameraPixelBlaze2629 = i2 - Integer.MIN_VALUE;
                    Object obj = polarVoyageSQLiteFusionShadow7862.PolarVoyageViewRogueMaster4778;
                    i = polarVoyageSQLiteFusionShadow7862.PolarVoyageCameraPixelBlaze2629;
                    if (i != 0) {
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                        polarVoyageSQLiteFusionShadow7862.PolarVoyageBottomSheetOmegaNeo1907 = th;
                        polarVoyageSQLiteFusionShadow7862.PolarVoyageCameraPixelBlaze2629 = 1;
                        Object PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageViewPagerNovaShadow8337.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageInsetDrawableCosmosStrikeStrike4393, th, polarVoyageSQLiteFusionShadow7862);
                        Object obj2 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        if (PolarVoyageBitmapVisionAuroraPixel47052 == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = polarVoyageSQLiteFusionShadow7862.PolarVoyageBottomSheetOmegaNeo1907;
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                    }
                    return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                }
            }
            if (i != 0) {
            }
            return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                PolarVoyageItemDecorationUltraDeltaEpic7485(th2, th);
            }
            throw th2;
        }
        polarVoyageSQLiteFusionShadow7862 = new PolarVoyageSQLiteFusionShadow7862(polarVoyageMotionSceneHyperVisionVision6497);
        Object obj3 = polarVoyageSQLiteFusionShadow7862.PolarVoyageViewRogueMaster4778;
        i = polarVoyageSQLiteFusionShadow7862.PolarVoyageCameraPixelBlaze2629;
    }

    public static void PolarVoyageToolbarEclipseInfernoHero6368(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 PolarVoyageViewBindingPulseHeroSpeed5705(XmlPullParser xmlPullParser, String str, String str2) {
        PolarVoyageDatabasePhantomBeta6832 PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageRotateAnimationCyberCelestialDelta4768();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageStrictModeLegendEpic1532(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String PolarVoyageDiffUtilTurboStrike57352 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, concat3);
                String PolarVoyageDiffUtilTurboStrike57353 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, concat4);
                String PolarVoyageDiffUtilTurboStrike57354 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, concat5);
                String PolarVoyageDiffUtilTurboStrike57355 = PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageDiffUtilTurboStrike5735(xmlPullParser, concat6);
                if (PolarVoyageDiffUtilTurboStrike57352 == null || PolarVoyageDiffUtilTurboStrike57353 == null) {
                    return PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
                }
                PolarVoyageRotateAnimationCyberCelestialDelta47682.PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageRealtimeDatabaseSpectraVisionTitan3637(PolarVoyageDiffUtilTurboStrike57352, PolarVoyageDiffUtilTurboStrike57354 != null ? Long.parseLong(PolarVoyageDiffUtilTurboStrike57354) : 0L, PolarVoyageDiffUtilTurboStrike57355 != null ? Long.parseLong(PolarVoyageDiffUtilTurboStrike57355) : 0L));
            }
        } while (!PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageItemDecorationUltraDeltaEpic7485(xmlPullParser, concat2));
        return PolarVoyageRotateAnimationCyberCelestialDelta47682.PolarVoyageDiffUtilTurboStrike5735();
    }

    public static Object PolarVoyageViewRogueMaster4778(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("must be power of 2 between 2^1 and 2^30: ", i));
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:91|(25:144|145|(1:147)|95|96|(1:142)(1:100)|101|(10:106|107|108|109|110|(1:112)(1:126)|113|(1:125)|117|118)|129|130|131|132|133|134|135|107|108|109|110|(0)(0)|113|(1:115)|125|117|118)|93|(24:143|96|(1:98)|140|142|101|(12:103|106|107|108|109|110|(0)(0)|113|(0)|125|117|118)|129|130|131|132|133|134|135|107|108|109|110|(0)(0)|113|(0)|125|117|118)|95|96|(0)|140|142|101|(0)|129|130|131|132|133|134|135|107|108|109|110|(0)(0)|113|(0)|125|117|118) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01e6, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c2 A[Catch: RejectedExecutionException -> 0x0188, TryCatch #0 {RejectedExecutionException -> 0x0188, blocks: (B:145:0x0181, B:96:0x0192, B:98:0x01a4, B:101:0x01b1, B:103:0x01c2, B:129:0x01cb, B:140:0x01aa, B:93:0x018b), top: B:144:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4 A[Catch: RejectedExecutionException -> 0x0188, TryCatch #0 {RejectedExecutionException -> 0x0188, blocks: (B:145:0x0181, B:96:0x0192, B:98:0x01a4, B:101:0x01b1, B:103:0x01c2, B:129:0x01cb, B:140:0x01aa, B:93:0x018b), top: B:144:0x0181 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PolarVoyageZipVortexCelestial6185(String str, PolarVoyageViewPrimeShadowSolar4883 polarVoyageViewPrimeShadowSolar4883, PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar8536, int i, boolean z, int i2, int i3, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718, int i4) {
        int i5;
        PolarVoyageOnLongClickListenerTitaniumPhoenixHero5338 polarVoyageOnLongClickListenerTitaniumPhoenixHero5338;
        boolean z2;
        int hashCode;
        boolean z3;
        boolean PolarVoyageBarcodeScannerInfernoSolarSpark77672;
        Object PolarVoyageAlarmManagerShadowHyperBeta8339;
        Object polarVoyagePushNotificationRoguePrime1424;
        Executor executor;
        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(-1040751001);
        if ((i4 & 6) == 0) {
            i5 = (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageViewPrimeShadowSolar4883) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageIntentHyperSolar8536) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(null) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageTextInputEditTextNebulaHero6651(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(null) ? 67108864 : 33554432;
        }
        int i6 = i5 | 805306368;
        if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCanvasElitePhoenix4750(i6 & 1, (306783379 & i6) != 306783378)) {
            if (i3 <= 0 || i2 <= 0) {
                PolarVoyageInputFilterSpectraSpark1316.PolarVoyageZipVortexCelestial6185("both minLines " + i3 + " and maxLines " + i2 + " must be greater than zero");
            }
            if (i3 > i2) {
                PolarVoyageInputFilterSpectraSpark1316.PolarVoyageZipVortexCelestial6185("minLines " + i3 + " must be less than or equal to maxLines " + i2);
            }
            if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageIntentServicePixelInferno8329.PolarVoyageZipVortexCelestial6185) != null) {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                return;
            }
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(356926143);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            PolarVoyageOnLongClickListenerTitaniumPhoenixHero5338 polarVoyageOnLongClickListenerTitaniumPhoenixHero53382 = (PolarVoyageOnLongClickListenerTitaniumPhoenixHero5338) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageMaterialCardViewMasterSpeed1905.PolarVoyageBottomSheetOmegaNeo1907);
            int i7 = ((i6 >> 3) & 112) | (i6 & 14);
            Executor executor2 = (Executor) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageBindingAdapterEclipseHyper7817.PolarVoyageZipVortexCelestial6185);
            if (executor2 != null) {
                int length = str.length();
                if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                    if (PolarVoyageBindingAdapterEclipseHyper7817.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
                        PolarVoyageBindingAdapterEclipseHyper7817.PolarVoyageMotionLayoutTransitionHeroVision4068 = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    }
                    Boolean bool = PolarVoyageBindingAdapterEclipseHyper7817.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1254328095);
                        PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova6437 = (PolarVoyageOnLongClickListenerRogueDeltaNova6437) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageMaterialCardViewMasterSpeed1905.PolarVoyageDrawableDeltaHyperion5742);
                        PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse9577 = (PolarVoyageEditTextAuroraHeroPulse9577) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageMaterialCardViewMasterSpeed1905.PolarVoyageItemDecorationUltraDeltaEpic7485);
                        if (((i7 & 112) ^ 48) > 32) {
                            try {
                                if (!polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageIntentHyperSolar8536)) {
                                }
                                z3 = true;
                                PolarVoyageBarcodeScannerInfernoSolarSpark77672 = ((((i7 & 14) ^ 6) <= 4 && polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(str)) || (i7 & 6) == 4) | z3 | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageOnLongClickListenerRogueDeltaNova6437.ordinal()) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageEditTextAuroraHeroPulse9577) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageOnLongClickListenerTitaniumPhoenixHero53382);
                                PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
                            } catch (RejectedExecutionException unused) {
                                polarVoyageOnLongClickListenerTitaniumPhoenixHero5338 = polarVoyageOnLongClickListenerTitaniumPhoenixHero53382;
                            }
                            if (!PolarVoyageBarcodeScannerInfernoSolarSpark77672 && PolarVoyageAlarmManagerShadowHyperBeta8339 != PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185) {
                                polarVoyagePushNotificationRoguePrime1424 = PolarVoyageAlarmManagerShadowHyperBeta8339;
                                polarVoyageOnLongClickListenerTitaniumPhoenixHero5338 = polarVoyageOnLongClickListenerTitaniumPhoenixHero53382;
                                executor = executor2;
                                executor.execute((Runnable) polarVoyagePushNotificationRoguePrime1424);
                                z2 = false;
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(357887763);
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(z2);
                                PolarVoyageViewPrimeShadowSolar4883 PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageViewPrimeShadowSolar4883.PolarVoyageBitmapVisionAuroraPixel4705(new TextStringSimpleElement(str, polarVoyageIntentHyperSolar8536, polarVoyageOnLongClickListenerTitaniumPhoenixHero5338, i, z, i2, i3));
                                PolarVoyageTypefaceRogueSpark5596 polarVoyageTypefaceRogueSpark5596 = PolarVoyageTypefaceRogueSpark5596.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                hashCode = Long.hashCode(polarVoyageFlowCollectorEliteStrike5718.PolarVoyageColorStateListEliteStrikeOlympian8131);
                                PolarVoyageViewPrimeShadowSolar4883 PolarVoyageAlertDialogNovaXCelestial4954 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageBitmapVisionAuroraPixel47052);
                                PolarVoyageBitmapMegaPixelNovaX8457 PolarVoyageViewRogueMaster47782 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageViewRogueMaster4778();
                                PolarVoyageContextNeoDelta3168.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
                                PolarVoyageChipForceInfernoBlaze6226 polarVoyageChipForceInfernoBlaze6226 = PolarVoyageProGuardPrimePrime8435.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                                if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                                    polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBottomSheetNovaXNova5051();
                                } else {
                                    polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageChipForceInfernoBlaze6226);
                                }
                                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTypefaceRogueSpark5596);
                                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageViewRogueMaster47782);
                                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageAlertDialogNovaXCelestial4954);
                                PolarVoyageLaunchFusionGamma3061 polarVoyageLaunchFusionGamma3061 = PolarVoyageProGuardPrimePrime8435.PolarVoyageDiffUtilTurboStrike5735;
                                if (!polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954 || !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339(), Integer.valueOf(hashCode))) {
                                    PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBitmapMaxTitanTitan7960(hashCode, polarVoyageFlowCollectorEliteStrike5718, hashCode, polarVoyageLaunchFusionGamma3061);
                                }
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(true);
                            }
                            executor = executor2;
                            polarVoyagePushNotificationRoguePrime1424 = new PolarVoyagePushNotificationRoguePrime1424(polarVoyageIntentHyperSolar8536, polarVoyageOnLongClickListenerRogueDeltaNova6437, str, polarVoyageEditTextAuroraHeroPulse9577, polarVoyageOnLongClickListenerTitaniumPhoenixHero53382, 0);
                            polarVoyageOnLongClickListenerTitaniumPhoenixHero5338 = polarVoyageOnLongClickListenerTitaniumPhoenixHero53382;
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyagePushNotificationRoguePrime1424);
                            executor.execute((Runnable) polarVoyagePushNotificationRoguePrime1424);
                            z2 = false;
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(357887763);
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(z2);
                            PolarVoyageViewPrimeShadowSolar4883 PolarVoyageBitmapVisionAuroraPixel470522 = polarVoyageViewPrimeShadowSolar4883.PolarVoyageBitmapVisionAuroraPixel4705(new TextStringSimpleElement(str, polarVoyageIntentHyperSolar8536, polarVoyageOnLongClickListenerTitaniumPhoenixHero5338, i, z, i2, i3));
                            PolarVoyageTypefaceRogueSpark5596 polarVoyageTypefaceRogueSpark55962 = PolarVoyageTypefaceRogueSpark5596.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            hashCode = Long.hashCode(polarVoyageFlowCollectorEliteStrike5718.PolarVoyageColorStateListEliteStrikeOlympian8131);
                            PolarVoyageViewPrimeShadowSolar4883 PolarVoyageAlertDialogNovaXCelestial49542 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageBitmapVisionAuroraPixel470522);
                            PolarVoyageBitmapMegaPixelNovaX8457 PolarVoyageViewRogueMaster477822 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageViewRogueMaster4778();
                            PolarVoyageContextNeoDelta3168.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
                            PolarVoyageChipForceInfernoBlaze6226 polarVoyageChipForceInfernoBlaze62262 = PolarVoyageProGuardPrimePrime8435.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                            if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                            }
                            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTypefaceRogueSpark55962);
                            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageViewRogueMaster477822);
                            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageAlertDialogNovaXCelestial49542);
                            PolarVoyageLaunchFusionGamma3061 polarVoyageLaunchFusionGamma30612 = PolarVoyageProGuardPrimePrime8435.PolarVoyageDiffUtilTurboStrike5735;
                            if (!polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                            }
                            PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBitmapMaxTitanTitan7960(hashCode, polarVoyageFlowCollectorEliteStrike5718, hashCode, polarVoyageLaunchFusionGamma30612);
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(true);
                        }
                        if ((i7 & 48) != 32) {
                            z3 = false;
                            PolarVoyageBarcodeScannerInfernoSolarSpark77672 = ((((i7 & 14) ^ 6) <= 4 && polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(str)) || (i7 & 6) == 4) | z3 | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageOnLongClickListenerRogueDeltaNova6437.ordinal()) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageEditTextAuroraHeroPulse9577) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageOnLongClickListenerTitaniumPhoenixHero53382);
                            PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
                            if (!PolarVoyageBarcodeScannerInfernoSolarSpark77672) {
                                polarVoyagePushNotificationRoguePrime1424 = PolarVoyageAlarmManagerShadowHyperBeta8339;
                                polarVoyageOnLongClickListenerTitaniumPhoenixHero5338 = polarVoyageOnLongClickListenerTitaniumPhoenixHero53382;
                                executor = executor2;
                                executor.execute((Runnable) polarVoyagePushNotificationRoguePrime1424);
                                z2 = false;
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(357887763);
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(z2);
                                PolarVoyageViewPrimeShadowSolar4883 PolarVoyageBitmapVisionAuroraPixel4705222 = polarVoyageViewPrimeShadowSolar4883.PolarVoyageBitmapVisionAuroraPixel4705(new TextStringSimpleElement(str, polarVoyageIntentHyperSolar8536, polarVoyageOnLongClickListenerTitaniumPhoenixHero5338, i, z, i2, i3));
                                PolarVoyageTypefaceRogueSpark5596 polarVoyageTypefaceRogueSpark559622 = PolarVoyageTypefaceRogueSpark5596.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                hashCode = Long.hashCode(polarVoyageFlowCollectorEliteStrike5718.PolarVoyageColorStateListEliteStrikeOlympian8131);
                                PolarVoyageViewPrimeShadowSolar4883 PolarVoyageAlertDialogNovaXCelestial495422 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageBitmapVisionAuroraPixel4705222);
                                PolarVoyageBitmapMegaPixelNovaX8457 PolarVoyageViewRogueMaster4778222 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageViewRogueMaster4778();
                                PolarVoyageContextNeoDelta3168.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
                                PolarVoyageChipForceInfernoBlaze6226 polarVoyageChipForceInfernoBlaze622622 = PolarVoyageProGuardPrimePrime8435.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                                if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                                }
                                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTypefaceRogueSpark559622);
                                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageViewRogueMaster4778222);
                                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageAlertDialogNovaXCelestial495422);
                                PolarVoyageLaunchFusionGamma3061 polarVoyageLaunchFusionGamma306122 = PolarVoyageProGuardPrimePrime8435.PolarVoyageDiffUtilTurboStrike5735;
                                if (!polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                                }
                                PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBitmapMaxTitanTitan7960(hashCode, polarVoyageFlowCollectorEliteStrike5718, hashCode, polarVoyageLaunchFusionGamma306122);
                                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(true);
                            }
                            executor = executor2;
                            polarVoyagePushNotificationRoguePrime1424 = new PolarVoyagePushNotificationRoguePrime1424(polarVoyageIntentHyperSolar8536, polarVoyageOnLongClickListenerRogueDeltaNova6437, str, polarVoyageEditTextAuroraHeroPulse9577, polarVoyageOnLongClickListenerTitaniumPhoenixHero53382, 0);
                            polarVoyageOnLongClickListenerTitaniumPhoenixHero5338 = polarVoyageOnLongClickListenerTitaniumPhoenixHero53382;
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyagePushNotificationRoguePrime1424);
                            executor.execute((Runnable) polarVoyagePushNotificationRoguePrime1424);
                            z2 = false;
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(357887763);
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(z2);
                            PolarVoyageViewPrimeShadowSolar4883 PolarVoyageBitmapVisionAuroraPixel47052222 = polarVoyageViewPrimeShadowSolar4883.PolarVoyageBitmapVisionAuroraPixel4705(new TextStringSimpleElement(str, polarVoyageIntentHyperSolar8536, polarVoyageOnLongClickListenerTitaniumPhoenixHero5338, i, z, i2, i3));
                            PolarVoyageTypefaceRogueSpark5596 polarVoyageTypefaceRogueSpark5596222 = PolarVoyageTypefaceRogueSpark5596.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            hashCode = Long.hashCode(polarVoyageFlowCollectorEliteStrike5718.PolarVoyageColorStateListEliteStrikeOlympian8131);
                            PolarVoyageViewPrimeShadowSolar4883 PolarVoyageAlertDialogNovaXCelestial4954222 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageBitmapVisionAuroraPixel47052222);
                            PolarVoyageBitmapMegaPixelNovaX8457 PolarVoyageViewRogueMaster47782222 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageViewRogueMaster4778();
                            PolarVoyageContextNeoDelta3168.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
                            PolarVoyageChipForceInfernoBlaze6226 polarVoyageChipForceInfernoBlaze6226222 = PolarVoyageProGuardPrimePrime8435.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                            if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                            }
                            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTypefaceRogueSpark5596222);
                            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageViewRogueMaster47782222);
                            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageAlertDialogNovaXCelestial4954222);
                            PolarVoyageLaunchFusionGamma3061 polarVoyageLaunchFusionGamma3061222 = PolarVoyageProGuardPrimePrime8435.PolarVoyageDiffUtilTurboStrike5735;
                            if (!polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                            }
                            PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBitmapMaxTitanTitan7960(hashCode, polarVoyageFlowCollectorEliteStrike5718, hashCode, polarVoyageLaunchFusionGamma3061222);
                            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(true);
                        }
                        z3 = true;
                        PolarVoyageBarcodeScannerInfernoSolarSpark77672 = ((((i7 & 14) ^ 6) <= 4 && polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(str)) || (i7 & 6) == 4) | z3 | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageOnLongClickListenerRogueDeltaNova6437.ordinal()) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageEditTextAuroraHeroPulse9577) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageOnLongClickListenerTitaniumPhoenixHero53382);
                        PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
                        if (!PolarVoyageBarcodeScannerInfernoSolarSpark77672) {
                        }
                        executor = executor2;
                        polarVoyagePushNotificationRoguePrime1424 = new PolarVoyagePushNotificationRoguePrime1424(polarVoyageIntentHyperSolar8536, polarVoyageOnLongClickListenerRogueDeltaNova6437, str, polarVoyageEditTextAuroraHeroPulse9577, polarVoyageOnLongClickListenerTitaniumPhoenixHero53382, 0);
                        polarVoyageOnLongClickListenerTitaniumPhoenixHero5338 = polarVoyageOnLongClickListenerTitaniumPhoenixHero53382;
                        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyagePushNotificationRoguePrime1424);
                        executor.execute((Runnable) polarVoyagePushNotificationRoguePrime1424);
                        z2 = false;
                        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
                        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(357887763);
                        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(z2);
                        PolarVoyageViewPrimeShadowSolar4883 PolarVoyageBitmapVisionAuroraPixel470522222 = polarVoyageViewPrimeShadowSolar4883.PolarVoyageBitmapVisionAuroraPixel4705(new TextStringSimpleElement(str, polarVoyageIntentHyperSolar8536, polarVoyageOnLongClickListenerTitaniumPhoenixHero5338, i, z, i2, i3));
                        PolarVoyageTypefaceRogueSpark5596 polarVoyageTypefaceRogueSpark55962222 = PolarVoyageTypefaceRogueSpark5596.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        hashCode = Long.hashCode(polarVoyageFlowCollectorEliteStrike5718.PolarVoyageColorStateListEliteStrikeOlympian8131);
                        PolarVoyageViewPrimeShadowSolar4883 PolarVoyageAlertDialogNovaXCelestial49542222 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageBitmapVisionAuroraPixel470522222);
                        PolarVoyageBitmapMegaPixelNovaX8457 PolarVoyageViewRogueMaster477822222 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageViewRogueMaster4778();
                        PolarVoyageContextNeoDelta3168.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
                        PolarVoyageChipForceInfernoBlaze6226 polarVoyageChipForceInfernoBlaze62262222 = PolarVoyageProGuardPrimePrime8435.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                        if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                        }
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTypefaceRogueSpark55962222);
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageViewRogueMaster477822222);
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageAlertDialogNovaXCelestial49542222);
                        PolarVoyageLaunchFusionGamma3061 polarVoyageLaunchFusionGamma30612222 = PolarVoyageProGuardPrimePrime8435.PolarVoyageDiffUtilTurboStrike5735;
                        if (!polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                        }
                        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBitmapMaxTitanTitan7960(hashCode, polarVoyageFlowCollectorEliteStrike5718, hashCode, polarVoyageLaunchFusionGamma30612222);
                        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(true);
                    }
                }
                polarVoyageOnLongClickListenerTitaniumPhoenixHero5338 = polarVoyageOnLongClickListenerTitaniumPhoenixHero53382;
                z2 = false;
            } else {
                polarVoyageOnLongClickListenerTitaniumPhoenixHero5338 = polarVoyageOnLongClickListenerTitaniumPhoenixHero53382;
                z2 = false;
            }
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1255196839);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(z2);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(357887763);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(z2);
            PolarVoyageViewPrimeShadowSolar4883 PolarVoyageBitmapVisionAuroraPixel4705222222 = polarVoyageViewPrimeShadowSolar4883.PolarVoyageBitmapVisionAuroraPixel4705(new TextStringSimpleElement(str, polarVoyageIntentHyperSolar8536, polarVoyageOnLongClickListenerTitaniumPhoenixHero5338, i, z, i2, i3));
            PolarVoyageTypefaceRogueSpark5596 polarVoyageTypefaceRogueSpark559622222 = PolarVoyageTypefaceRogueSpark5596.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            hashCode = Long.hashCode(polarVoyageFlowCollectorEliteStrike5718.PolarVoyageColorStateListEliteStrikeOlympian8131);
            PolarVoyageViewPrimeShadowSolar4883 PolarVoyageAlertDialogNovaXCelestial495422222 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageBitmapVisionAuroraPixel4705222222);
            PolarVoyageBitmapMegaPixelNovaX8457 PolarVoyageViewRogueMaster4778222222 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageViewRogueMaster4778();
            PolarVoyageContextNeoDelta3168.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
            PolarVoyageChipForceInfernoBlaze6226 polarVoyageChipForceInfernoBlaze622622222 = PolarVoyageProGuardPrimePrime8435.PolarVoyageMotionLayoutTransitionHeroVision4068;
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
            if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
            }
            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTypefaceRogueSpark559622222);
            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageViewRogueMaster4778222222);
            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageAlertDialogNovaXCelestial495422222);
            PolarVoyageLaunchFusionGamma3061 polarVoyageLaunchFusionGamma306122222 = PolarVoyageProGuardPrimePrime8435.PolarVoyageDiffUtilTurboStrike5735;
            if (!polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
            }
            PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBitmapMaxTitanTitan7960(hashCode, polarVoyageFlowCollectorEliteStrike5718, hashCode, polarVoyageLaunchFusionGamma306122222);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(true);
        } else {
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDatabaseCosmosSpectraSolar3905();
        }
        PolarVoyageInputMethodManagerFusionForceElite3024 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageNavigationViewHyperHyperHyperion1793();
        if (PolarVoyageNavigationViewHyperHyperHyperion1793 != null) {
            PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageAnimationSpectraHyper8129(str, polarVoyageViewPrimeShadowSolar4883, polarVoyageIntentHyperSolar8536, i, z, i2, i3, i4, 1);
        }
    }
}
