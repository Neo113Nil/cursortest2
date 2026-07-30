package p000createpolar;

import android.content.Context;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.WindowInsetsAnimation;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBundlePhantomEclipseMega7910 implements PolarVoyageCoordinatorLayoutPhoenixHyperionForce5563, PolarVoyageFlowMaxTitanAlpha3096, PolarVoyageServiceSolarDeltaFusion9632, PolarVoyageFontFamilyTurboHero9597 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageBundlePhantomEclipseMega7910(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 4:
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageDigitalInkRecognitionBetaDelta4802(new Reference[16]);
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new ReferenceQueue();
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageTextRecognitionHeroOmega1312();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageLevelListDrawableStormStrike7946();
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageConstraintLayoutVisionMasterDragon8646(4);
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageIntentServicePixelMaxElite4283(16);
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                this.PolarVoyageStrictModeLegendEpic1532 = Collections.synchronizedMap(new WeakHashMap());
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 9:
                PolarVoyageFilterBlazeCelestial3240 polarVoyageFilterBlazeCelestial3240 = PolarVoyageFilterBlazeCelestial3240.PolarVoyageKotlinBetaPulseBeta3653;
                this.PolarVoyageStrictModeLegendEpic1532 = new SparseIntArray();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageFilterBlazeCelestial3240;
                break;
        }
    }

    public static void PolarVoyageZipVortexCelestial6185(PolarVoyageBundlePhantomEclipseMega7910 polarVoyageBundlePhantomEclipseMega7910, boolean z, boolean z2) {
        synchronized (polarVoyageBundlePhantomEclipseMega7910) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
                    if (((Context) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageStrictModeLegendEpic1532).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageStrictModeLegendEpic1532).getSystemService("power");
                    if (powerManager == null) {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        polarVoyageBundlePhantomEclipseMega7910.PolarVoyageRotateAnimationCyberCelestialDelta4768 = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public void PolarVoyageBarcodeScannerInfernoSolarSpark7767(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.PolarVoyageStrictModeLegendEpic1532)) {
            hashMap = new HashMap((Map) this.PolarVoyageStrictModeLegendEpic1532);
        }
        synchronized (((Map) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
            hashMap2 = new HashMap((Map) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                return;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((PolarVoyageRotateDrawableTurboHyperDelta7408) entry2.getKey()).PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageBarcodeScannerOlympianNeoShadow6002(status));
            }
        }
    }

    @Override // p000createpolar.PolarVoyageServiceSolarDeltaFusion9632
    public void PolarVoyageDiffUtilTurboStrike5735(PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995) {
        ((Map) ((PolarVoyageBundlePhantomEclipseMega7910) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageRotateAnimationCyberCelestialDelta4768).remove((PolarVoyageRotateDrawableTurboHyperDelta7408) this.PolarVoyageStrictModeLegendEpic1532);
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a3, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0116, code lost:
    
        if (")".equals(p000createpolar.PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageMotionLayoutTransitionHeroVision4068(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // p000createpolar.PolarVoyageFlowMaxTitanAlpha3096
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void PolarVoyageItemDecorationUltraDeltaEpic7485(byte[] bArr, int i, int i2, PolarVoyageProximitySensorNovaXStrikeSolar8705 polarVoyageProximitySensorNovaXStrikeSolar8705, PolarVoyageScaleAnimationVortexAurora2886 polarVoyageScaleAnimationVortexAurora2886) {
        PolarVoyageViewPager2InfernoNebula3418 polarVoyageViewPager2InfernoNebula3418;
        String str;
        ?? r0;
        String sb;
        int i3;
        char c;
        PolarVoyageBundlePhantomEclipseMega7910 polarVoyageBundlePhantomEclipseMega7910 = this;
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = (PolarVoyageTextRecognitionHeroOmega1312) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageAlarmManagerShadowHyperBeta8339(bArr, i + i2);
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i);
        ArrayList arrayList = new ArrayList();
        try {
            PolarVoyageOnAttachStateChangeListenerTurboUltraPulse3911.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextRecognitionHeroOmega1312);
            while (!TextUtils.isEmpty(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                int i4 = -1;
                int i5 = 0;
                char c2 = 65535;
                while (true) {
                    ?? r9 = 1;
                    if (c2 == 65535) {
                        i5 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        String PolarVoyageDrawableDeltaHyperion5742 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(StandardCharsets.UTF_8);
                        c2 = PolarVoyageDrawableDeltaHyperion5742 == null ? (char) 0 : "STYLE".equals(PolarVoyageDrawableDeltaHyperion5742) ? (char) 2 : PolarVoyageDrawableDeltaHyperion5742.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i5);
                        if (c2 == 0) {
                            PolarVoyageTransformNeoTitanium1654.PolarVoyageGuidelineStormSolar2850(new PolarVoyageDrawableCosmosEclipseMax6944(arrayList2), polarVoyageProximitySensorNovaXStrikeSolar8705, polarVoyageScaleAnimationVortexAurora2886);
                            return;
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("A style block was found after the first cue.");
                                    return;
                                }
                                polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(StandardCharsets.UTF_8);
                                PolarVoyageLevelListDrawableStormStrike7946 polarVoyageLevelListDrawableStormStrike7946 = (PolarVoyageLevelListDrawableStormStrike7946) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega13122 = polarVoyageLevelListDrawableStormStrike7946.PolarVoyageZipVortexCelestial6185;
                                StringBuilder sb2 = polarVoyageLevelListDrawableStormStrike7946.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                sb2.setLength(0);
                                int i6 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                while (!TextUtils.isEmpty(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(StandardCharsets.UTF_8))) {
                                }
                                polarVoyageTextRecognitionHeroOmega13122.PolarVoyageAlarmManagerShadowHyperBeta8339(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068);
                                polarVoyageTextRecognitionHeroOmega13122.PolarVoyageConfigurationMaxSpectraForce5418(i6);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextRecognitionHeroOmega13122);
                                    if (polarVoyageTextRecognitionHeroOmega13122.PolarVoyageZipVortexCelestial6185() >= 5 && "::cue".equals(polarVoyageTextRecognitionHeroOmega13122.PolarVoyageAlertDialogCyberHeroQuantum3938(5, StandardCharsets.UTF_8))) {
                                        int i7 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                        String PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTextRecognitionHeroOmega13122, sb2);
                                        if (PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
                                            if ("{".equals(PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                                                polarVoyageTextRecognitionHeroOmega13122.PolarVoyageConfigurationMaxSpectraForce5418(i7);
                                                str = "";
                                            } else if ("(".equals(PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                                                int i8 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                                int i9 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageKotlinBetaPulseBeta3653;
                                                boolean z2 = z ? 1 : 0;
                                                while (i8 < i9 && z2 == 0) {
                                                    int i10 = i8 + 1;
                                                    z2 = ((char) polarVoyageTextRecognitionHeroOmega13122.PolarVoyageZipVortexCelestial6185[i8]) == ')' ? r9 : z ? 1 : 0;
                                                    i8 = i10;
                                                }
                                                str = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageAlertDialogCyberHeroQuantum3938((i8 - 1) - polarVoyageTextRecognitionHeroOmega13122.PolarVoyageMotionLayoutTransitionHeroVision4068, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTextRecognitionHeroOmega13122, sb2))) {
                                                PolarVoyageLifecycleCameraControllerHeroInfernoSpectra3115 polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115 = new PolarVoyageLifecycleCameraControllerHeroInfernoSpectra3115();
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageZipVortexCelestial6185 = "";
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageMotionLayoutTransitionHeroVision4068 = "";
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageKotlinBetaPulseBeta3653 = Collections.EMPTY_SET;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = "";
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBitmapVisionAuroraPixel4705 = str2;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageTextInputEditTextNebulaHero6651 = z;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageStrictModeLegendEpic1532 = z;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i4;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBottomSheetOmegaNeo1907 = i4;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageViewRogueMaster4778 = i4;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageCameraPixelBlaze2629 = i4;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageDrawableDeltaHyperion5742 = i4;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageContentProviderHyperSpark3838 = i4;
                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageRemoteModelManagerOlympianCelestial9141 = z;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i4) {
                                                        ?? matcher = PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageKotlinBetaPulseBeta3653.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r9);
                                                            group.getClass();
                                                            polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = group;
                                                        }
                                                        str = str.substring(z ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                                                    String[] split = str.split("\\.", i4);
                                                    String str4 = split[z ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i4) {
                                                        polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageMotionLayoutTransitionHeroVision4068 = str4.substring(z ? 1 : 0, indexOf2);
                                                        polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageZipVortexCelestial6185 = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageMotionLayoutTransitionHeroVision4068 = str4;
                                                    }
                                                    if (split.length > r9) {
                                                        int length = split.length;
                                                        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(length <= split.length ? r9 : z ? 1 : 0);
                                                        polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageKotlinBetaPulseBeta3653 = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r9, length)));
                                                    }
                                                }
                                                boolean z3 = z ? 1 : 0;
                                                String str5 = str2;
                                                boolean z4 = r9;
                                                while (z3 == 0) {
                                                    int i11 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                                    str5 = PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTextRecognitionHeroOmega13122, sb2);
                                                    boolean z5 = (str5 == null || "}".equals(str5)) ? z4 : z;
                                                    if (z5 == 0) {
                                                        polarVoyageTextRecognitionHeroOmega13122.PolarVoyageConfigurationMaxSpectraForce5418(i11);
                                                        PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextRecognitionHeroOmega13122);
                                                        String PolarVoyageZipVortexCelestial6185 = PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageZipVortexCelestial6185(polarVoyageTextRecognitionHeroOmega13122, sb2);
                                                        if (!PolarVoyageZipVortexCelestial6185.isEmpty() && ":".equals(PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTextRecognitionHeroOmega13122, sb2))) {
                                                            PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextRecognitionHeroOmega13122);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z6 = false;
                                                            while (true) {
                                                                if (z6) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i12 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                                                    String PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTextRecognitionHeroOmega13122, sb2);
                                                                    if (PolarVoyageMotionLayoutTransitionHeroVision40682 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(PolarVoyageMotionLayoutTransitionHeroVision40682) || ";".equals(PolarVoyageMotionLayoutTransitionHeroVision40682)) {
                                                                        polarVoyageTextRecognitionHeroOmega13122.PolarVoyageConfigurationMaxSpectraForce5418(i12);
                                                                        z6 = true;
                                                                    } else {
                                                                        sb3.append(PolarVoyageMotionLayoutTransitionHeroVision40682);
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !sb.isEmpty()) {
                                                                int i13 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                                                String PolarVoyageMotionLayoutTransitionHeroVision40683 = PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageTextRecognitionHeroOmega13122, sb2);
                                                                if (!";".equals(PolarVoyageMotionLayoutTransitionHeroVision40683)) {
                                                                    if ("}".equals(PolarVoyageMotionLayoutTransitionHeroVision40683)) {
                                                                        polarVoyageTextRecognitionHeroOmega13122.PolarVoyageConfigurationMaxSpectraForce5418(i13);
                                                                    }
                                                                }
                                                                if ("color".equals(PolarVoyageZipVortexCelestial6185)) {
                                                                    i3 = 1;
                                                                    polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageCombineOlympianCosmos3121.PolarVoyageZipVortexCelestial6185(sb, true);
                                                                    polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                                                                } else {
                                                                    i3 = 1;
                                                                    if ("background-color".equals(PolarVoyageZipVortexCelestial6185)) {
                                                                        polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageCombineOlympianCosmos3121.PolarVoyageZipVortexCelestial6185(sb, true);
                                                                        polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageStrictModeLegendEpic1532 = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(PolarVoyageZipVortexCelestial6185)) {
                                                                            if ("over".equals(sb)) {
                                                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageContentProviderHyperSpark3838 = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageContentProviderHyperSpark3838 = 2;
                                                                                r0 = 1;
                                                                                z4 = r0;
                                                                                z3 = z5;
                                                                                z = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(PolarVoyageZipVortexCelestial6185)) {
                                                                            polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageRemoteModelManagerOlympianCelestial9141 = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(PolarVoyageZipVortexCelestial6185)) {
                                                                            if ("underline".equals(sb)) {
                                                                                i3 = 1;
                                                                                polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBottomSheetOmegaNeo1907 = 1;
                                                                            }
                                                                        } else if ("font-family".equals(PolarVoyageZipVortexCelestial6185)) {
                                                                            polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(sb);
                                                                        } else if (!"font-weight".equals(PolarVoyageZipVortexCelestial6185)) {
                                                                            i3 = 1;
                                                                            if ("font-style".equals(PolarVoyageZipVortexCelestial6185)) {
                                                                                if ("italic".equals(sb)) {
                                                                                    polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageCameraPixelBlaze2629 = 1;
                                                                                }
                                                                            } else if ("font-size".equals(PolarVoyageZipVortexCelestial6185)) {
                                                                                ?? matcher2 = PolarVoyageLevelListDrawableStormStrike7946.PolarVoyageBarcodeScannerInfernoSolarSpark7767.matcher(PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(sb));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    switch (c) {
                                                                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                                                                            r0 = 1;
                                                                                            polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageDrawableDeltaHyperion5742 = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r0 = 1;
                                                                                            polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageDrawableDeltaHyperion5742 = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r0 = 1;
                                                                                            polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageDrawableDeltaHyperion5742 = 1;
                                                                                            break;
                                                                                        default:
                                                                                            PolarVoyageR8UltraEliteBeta8736.PolarVoyageAnimatorSetSparkUltraMax8233();
                                                                                            return;
                                                                                    }
                                                                                    String group3 = matcher2.group(r0);
                                                                                    group3.getClass();
                                                                                    polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageSnackbarGammaEclipse2140 = Float.parseFloat(group3);
                                                                                    z4 = r0;
                                                                                    z3 = z5;
                                                                                    z = false;
                                                                                } else {
                                                                                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb)) {
                                                                            i3 = 1;
                                                                            polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115.PolarVoyageViewRogueMaster4778 = 1;
                                                                        }
                                                                        z4 = r0;
                                                                        z3 = z5;
                                                                        z = false;
                                                                    }
                                                                }
                                                                r0 = i3;
                                                                z4 = r0;
                                                                z3 = z5;
                                                                z = false;
                                                            }
                                                            r0 = 1;
                                                            z4 = r0;
                                                            z3 = z5;
                                                            z = false;
                                                        }
                                                    }
                                                    r0 = z4;
                                                    z4 = r0;
                                                    z3 = z5;
                                                    z = false;
                                                }
                                                boolean z7 = z4;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(polarVoyageLifecycleCameraControllerHeroInfernoSpectra3115);
                                                }
                                                r9 = z7;
                                                z = false;
                                                i4 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c2 == 3) {
                                Pattern pattern = PolarVoyageChipHyperPhoenixNebula7861.PolarVoyageZipVortexCelestial6185;
                                Charset charset = StandardCharsets.UTF_8;
                                String PolarVoyageDrawableDeltaHyperion57422 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(charset);
                                if (PolarVoyageDrawableDeltaHyperion57422 == null) {
                                    polarVoyageViewPager2InfernoNebula3418 = null;
                                } else {
                                    Pattern pattern2 = PolarVoyageChipHyperPhoenixNebula7861.PolarVoyageZipVortexCelestial6185;
                                    Matcher matcher3 = pattern2.matcher(PolarVoyageDrawableDeltaHyperion57422);
                                    if (matcher3.matches()) {
                                        polarVoyageViewPager2InfernoNebula3418 = PolarVoyageChipHyperPhoenixNebula7861.PolarVoyageBarcodeScannerInfernoSolarSpark7767(null, matcher3, polarVoyageTextRecognitionHeroOmega1312, arrayList);
                                    } else {
                                        polarVoyageViewPager2InfernoNebula3418 = null;
                                        String PolarVoyageDrawableDeltaHyperion57423 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageDrawableDeltaHyperion5742(charset);
                                        if (PolarVoyageDrawableDeltaHyperion57423 != null) {
                                            Matcher matcher4 = pattern2.matcher(PolarVoyageDrawableDeltaHyperion57423);
                                            if (matcher4.matches()) {
                                                polarVoyageViewPager2InfernoNebula3418 = PolarVoyageChipHyperPhoenixNebula7861.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDrawableDeltaHyperion57422.trim(), matcher4, polarVoyageTextRecognitionHeroOmega1312, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (polarVoyageViewPager2InfernoNebula3418 != null) {
                                    arrayList2.add(polarVoyageViewPager2InfernoNebula3418);
                                }
                            }
                            polarVoyageBundlePhantomEclipseMega7910 = this;
                        }
                    }
                }
            }
        } catch (PolarVoyageToastNeoOmega7549 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // p000createpolar.PolarVoyageCoordinatorLayoutPhoenixHyperionForce5563
    public void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        PolarVoyagePagingSourceSolarElite3258 polarVoyagePagingSourceSolarElite3258 = (PolarVoyagePagingSourceSolarElite3258) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        SparseArray sparseArray = polarVoyagePagingSourceSolarElite3258.PolarVoyageTextInputEditTextNebulaHero6651;
        PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087 = (PolarVoyageAuthVortexNebulaNeo9087) this.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393() == 0 && (polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393() & 128) != 0) {
            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(6);
            int PolarVoyageZipVortexCelestial6185 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() / 4;
            for (int i = 0; i < PolarVoyageZipVortexCelestial6185; i++) {
                polarVoyageTextRecognitionHeroOmega1312.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageAuthVortexNebulaNeo9087.PolarVoyageMotionLayoutTransitionHeroVision4068, 0, 4);
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageCameraPixelBlaze2629(0);
                int PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(16);
                polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(3);
                if (PolarVoyageTextInputEditTextNebulaHero6651 == 0) {
                    polarVoyageAuthVortexNebulaNeo9087.PolarVoyageSnackbarGammaEclipse2140(13);
                } else {
                    int PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(13);
                    if (sparseArray.get(PolarVoyageTextInputEditTextNebulaHero66512) == null) {
                        sparseArray.put(PolarVoyageTextInputEditTextNebulaHero66512, new PolarVoyageJavaEclipseSparkVortex7630(new PolarVoyageViewPagerSparkVision4365(polarVoyagePagingSourceSolarElite3258, PolarVoyageTextInputEditTextNebulaHero66512)));
                        polarVoyagePagingSourceSolarElite3258.PolarVoyageCameraPixelBlaze2629++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    @Override // p000createpolar.PolarVoyageFontFamilyTurboHero9597
    public Object PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995) {
        PolarVoyageMotionLayoutHeroSpeed4592 polarVoyageMotionLayoutHeroSpeed4592 = (PolarVoyageMotionLayoutHeroSpeed4592) this.PolarVoyageStrictModeLegendEpic1532;
        Bundle bundle = (Bundle) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        polarVoyageMotionLayoutHeroSpeed4592.getClass();
        if (!polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageItemDecorationUltraDeltaEpic7485()) {
            return polarVoyageDialogFragmentTitanCelestial7995;
        }
        Bundle bundle2 = (Bundle) polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageDiffUtilTurboStrike5735();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? polarVoyageDialogFragmentTitanCelestial7995 : polarVoyageMotionLayoutHeroSpeed4592.PolarVoyageZipVortexCelestial6185(bundle).PolarVoyageStrictModeLegendEpic1532(PolarVoyageViewPager2InfernoEpic1202.PolarVoyageRotateAnimationCyberCelestialDelta4768, PolarVoyageDelayNovaRogueBeta9839.PolarVoyageGuidelineStormSolar2850);
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                return "Bounds{lower=" + ((PolarVoyageRealtimeDatabaseSpectraMega9212) this.PolarVoyageStrictModeLegendEpic1532) + " upper=" + ((PolarVoyageRealtimeDatabaseSpectraMega9212) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ PolarVoyageBundlePhantomEclipseMega7910(int i, Object obj, Object obj2, boolean z) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
        this.PolarVoyageStrictModeLegendEpic1532 = obj2;
    }

    public PolarVoyageBundlePhantomEclipseMega7910(IBinder iBinder) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 11;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.PolarVoyageStrictModeLegendEpic1532 = new Messenger(iBinder);
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageLevelListDrawableRogueEclipse2191(iBinder);
            this.PolarVoyageStrictModeLegendEpic1532 = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public PolarVoyageBundlePhantomEclipseMega7910(Context context) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 3;
        this.PolarVoyageStrictModeLegendEpic1532 = context;
    }

    public /* synthetic */ PolarVoyageBundlePhantomEclipseMega7910(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
    }

    public PolarVoyageBundlePhantomEclipseMega7910(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 6;
        lowerBound = bounds.getLowerBound();
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageRealtimeDatabaseSpectraMega9212.PolarVoyageKotlinBetaPulseBeta3653(lowerBound);
        upperBound = bounds.getUpperBound();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRealtimeDatabaseSpectraMega9212.PolarVoyageKotlinBetaPulseBeta3653(upperBound);
    }

    public PolarVoyageBundlePhantomEclipseMega7910(PolarVoyagePagingSourceSolarElite3258 polarVoyagePagingSourceSolarElite3258) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyagePagingSourceSolarElite3258;
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageAuthVortexNebulaNeo9087(new byte[4], 4);
    }

    @Override // p000createpolar.PolarVoyageCoordinatorLayoutPhoenixHyperionForce5563
    public void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageSupervisorJobStrikeCelestialGamma8770 polarVoyageSupervisorJobStrikeCelestialGamma8770, PolarVoyageR8EpicBlaze3675 polarVoyageR8EpicBlaze3675, PolarVoyageTransformCyberVisionPhantom1406 polarVoyageTransformCyberVisionPhantom1406) {
    }
}
