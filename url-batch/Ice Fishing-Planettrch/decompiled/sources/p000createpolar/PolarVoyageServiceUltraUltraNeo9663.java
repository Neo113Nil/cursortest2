package p000createpolar;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageServiceUltraUltraNeo9663 implements PolarVoyageModelInputOutputInfernoBeta7978, PolarVoyageScaleGestureDetectorDragonBlazeShadow4642, PolarVoyageRotateDrawablePixelSparkStorm9570, PolarVoyageBottomSheetInfernoOmega3378 {
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public Object PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;
    public Object PolarVoyageViewRogueMaster4778;

    public PolarVoyageServiceUltraUltraNeo9663(PolarVoyageLaunchTitanHyperPhoenix7302 polarVoyageLaunchTitanHyperPhoenix7302, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageLaunchTitanHyperPhoenix7302;
        this.PolarVoyageBottomSheetOmegaNeo1907 = hashMap2;
        this.PolarVoyageViewRogueMaster4778 = hashMap3;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageBarcodeScannerInfernoSolarSpark7767(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = jArr;
    }

    public static PolarVoyageServiceUltraUltraNeo9663 PolarVoyageViewRogueMaster4778(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        PolarVoyageServiceUltraUltraNeo9663 polarVoyageServiceUltraUltraNeo9663 = new PolarVoyageServiceUltraUltraNeo9663();
        polarVoyageServiceUltraUltraNeo9663.PolarVoyageBottomSheetOmegaNeo1907 = new ArrayDeque();
        polarVoyageServiceUltraUltraNeo9663.PolarVoyageItemDecorationUltraDeltaEpic7485 = sharedPreferences;
        polarVoyageServiceUltraUltraNeo9663.PolarVoyageStrictModeLegendEpic1532 = "topic_operation_queue";
        polarVoyageServiceUltraUltraNeo9663.PolarVoyageRotateAnimationCyberCelestialDelta4768 = ",";
        polarVoyageServiceUltraUltraNeo9663.PolarVoyageViewRogueMaster4778 = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) polarVoyageServiceUltraUltraNeo9663.PolarVoyageBottomSheetOmegaNeo1907)) {
            try {
                ((ArrayDeque) polarVoyageServiceUltraUltraNeo9663.PolarVoyageBottomSheetOmegaNeo1907).clear();
                String string = ((SharedPreferences) polarVoyageServiceUltraUltraNeo9663.PolarVoyageItemDecorationUltraDeltaEpic7485).getString((String) polarVoyageServiceUltraUltraNeo9663.PolarVoyageStrictModeLegendEpic1532, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) polarVoyageServiceUltraUltraNeo9663.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
                    String[] split = string.split((String) polarVoyageServiceUltraUltraNeo9663.PolarVoyageRotateAnimationCyberCelestialDelta4768, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) polarVoyageServiceUltraUltraNeo9663.PolarVoyageBottomSheetOmegaNeo1907).add(str);
                        }
                    }
                    return polarVoyageServiceUltraUltraNeo9663;
                }
                return polarVoyageServiceUltraUltraNeo9663;
            } finally {
            }
        }
    }

    public void PolarVoyageAnimatorSetSparkUltraMax8233(String str, PolarVoyageLifecycleTitaniumDeltaMaster6179 polarVoyageLifecycleTitaniumDeltaMaster6179) {
        str.getClass();
        if (str.length() <= 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("method.isEmpty() == true");
            return;
        }
        if (polarVoyageLifecycleTitaniumDeltaMaster6179 == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("method ", str, " must have a request body."));
                return;
            }
        } else if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageKeyframeEpicNovaXCyber9821(str)) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("method ", str, " must not have a request body."));
            return;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = str;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageLifecycleTitaniumDeltaMaster6179;
    }

    @Override // p000createpolar.PolarVoyageRotateDrawablePixelSparkStorm9570
    public PolarVoyageRemoteConfigEliteSpectra7350 PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297) {
        if (((Set) this.PolarVoyageStrictModeLegendEpic1532).contains(polarVoyageRotateAnimationBlazePixelTitan5297)) {
            return ((PolarVoyageRotateDrawablePixelSparkStorm9570) this.PolarVoyageViewRogueMaster4778).PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageRotateAnimationBlazePixelTitan5297);
        }
        PolarVoyageR8UltraEliteBeta8736.PolarVoyageRotateAnimationCyberCelestialDelta4768("Attempting to request an undeclared dependency Provider<", polarVoyageRotateAnimationBlazePixelTitan5297, ">.");
        return null;
    }

    public void PolarVoyageBitmapMaxTitanTitan7960(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.PolarVoyageItemDecorationUltraDeltaEpic7485).put(str, obj);
        PolarVoyagePlaceholderVortexBetaPulse5592 polarVoyagePlaceholderVortexBetaPulse5592 = (PolarVoyagePlaceholderVortexBetaPulse5592) ((LinkedHashMap) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).get(str);
        if (polarVoyagePlaceholderVortexBetaPulse5592 != null) {
            polarVoyagePlaceholderVortexBetaPulse5592.PolarVoyageItemDecorationUltraDeltaEpic7485(obj);
        }
        PolarVoyagePlaceholderVortexBetaPulse5592 polarVoyagePlaceholderVortexBetaPulse55922 = (PolarVoyagePlaceholderVortexBetaPulse5592) ((LinkedHashMap) this.PolarVoyageBottomSheetOmegaNeo1907).get(str);
        if (polarVoyagePlaceholderVortexBetaPulse55922 != null) {
            polarVoyagePlaceholderVortexBetaPulse55922.PolarVoyageItemDecorationUltraDeltaEpic7485(obj);
        }
    }

    @Override // p000createpolar.PolarVoyageBottomSheetInfernoOmega3378
    public long PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        return ((long[]) this.PolarVoyageStrictModeLegendEpic1532)[i];
    }

    public void PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageRecyclerViewSpeedBlaze7728 polarVoyageRecyclerViewSpeedBlaze7728, PolarVoyageActionBarInfernoMax1008 polarVoyageActionBarInfernoMax1008) {
        ((ArrayList) this.PolarVoyageBottomSheetOmegaNeo1907).add(new PolarVoyageSnackbarElitePixelTitan9268(2, polarVoyageRecyclerViewSpeedBlaze7728, polarVoyageActionBarInfernoMax1008));
    }

    public float PolarVoyageCameraPixelBlaze2629(int i, boolean z) {
        Layout layout = (Layout) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float PolarVoyageContentProviderHyperSpark3838(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        boolean z3;
        int i4;
        Bidi bidi;
        Bidi bidi2;
        boolean z4;
        ArrayList arrayList = (ArrayList) this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Layout layout = (Layout) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (!z2) {
            return PolarVoyageCameraPixelBlaze2629(i, z);
        }
        int PolarVoyageLifecycleOlympianOmega3762 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageLifecycleOlympianOmega3762(layout, i, z2);
        int lineStart = layout.getLineStart(PolarVoyageLifecycleOlympianOmega3762);
        int lineEnd = layout.getLineEnd(PolarVoyageLifecycleOlympianOmega3762);
        if (i != lineStart && i != lineEnd) {
            return PolarVoyageCameraPixelBlaze2629(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return PolarVoyageCameraPixelBlaze2629(i, z);
        }
        int PolarVoyageStrictModeLegendEpic1532 = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageStrictModeLegendEpic1532(arrayList, Integer.valueOf(i));
        int i5 = PolarVoyageStrictModeLegendEpic1532 < 0 ? -(PolarVoyageStrictModeLegendEpic1532 + 1) : PolarVoyageStrictModeLegendEpic1532 + 1;
        if (z2 && i5 > 0) {
            int i6 = i5 - 1;
            if (i == ((Number) arrayList.get(i6)).intValue()) {
                i5 = i6;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i5 == 0 ? 0 : ((Number) arrayList.get(i5 + (-1))).intValue())) == -1;
        int PolarVoyageNavigationViewHyperHyperHyperion1793 = PolarVoyageNavigationViewHyperHyperHyperion1793(lineEnd, lineStart);
        int intValue = i5 == 0 ? 0 : ((Number) arrayList.get(i5 - 1)).intValue();
        int i7 = lineStart - intValue;
        int i8 = PolarVoyageNavigationViewHyperHyperHyperion1793 - intValue;
        ArrayList arrayList2 = (ArrayList) this.PolarVoyageStrictModeLegendEpic1532;
        boolean[] zArr = (boolean[]) this.PolarVoyageBottomSheetOmegaNeo1907;
        if (zArr[i5]) {
            bidi2 = (Bidi) arrayList2.get(i5);
            i3 = PolarVoyageLifecycleOlympianOmega3762;
            i2 = PolarVoyageNavigationViewHyperHyperHyperion1793;
            i4 = -1;
        } else {
            int intValue2 = i5 == 0 ? 0 : ((Number) arrayList.get(i5 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i5)).intValue();
            int i9 = intValue3 - intValue2;
            char[] cArr = (char[]) this.PolarVoyageViewRogueMaster4778;
            i2 = PolarVoyageNavigationViewHyperHyperHyperion1793;
            if (cArr == null || cArr.length < i9) {
                cArr = new char[i9];
            }
            i3 = PolarVoyageLifecycleOlympianOmega3762;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i9)) {
                i4 = -1;
                Bidi bidi3 = new Bidi(cArr, 0, null, 0, i9, layout.getParagraphDirection(layout.getLineForOffset(i5 == 0 ? 0 : ((Number) arrayList.get(i5 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi3.getRunCount() != 1) {
                    bidi = bidi3;
                    arrayList2.set(i5, bidi);
                    zArr[i5] = z3;
                    if (bidi != null) {
                        char[] cArr2 = (char[]) this.PolarVoyageViewRogueMaster4778;
                        cArr = cArr == cArr2 ? null : cArr2;
                    }
                    this.PolarVoyageViewRogueMaster4778 = cArr;
                    bidi2 = bidi;
                }
            } else {
                z3 = true;
                i4 = -1;
            }
            bidi = null;
            arrayList2.set(i5, bidi);
            zArr[i5] = z3;
            if (bidi != null) {
            }
            this.PolarVoyageViewRogueMaster4778 = cArr;
            bidi2 = bidi;
        }
        Bidi createLineBidi = bidi2 != null ? bidi2.createLineBidi(i7, i8) : null;
        if (createLineBidi == null) {
            z4 = true;
        } else {
            if (createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                PolarVoyageJobIntentServiceSpectraEliteGamma3385[] polarVoyageJobIntentServiceSpectraEliteGamma3385Arr = new PolarVoyageJobIntentServiceSpectraEliteGamma3385[runCount];
                for (int i10 = 0; i10 < runCount; i10++) {
                    polarVoyageJobIntentServiceSpectraEliteGamma3385Arr[i10] = new PolarVoyageJobIntentServiceSpectraEliteGamma3385(createLineBidi.getRunStart(i10) + lineStart, createLineBidi.getRunLimit(i10) + lineStart, createLineBidi.getRunLevel(i10) % 2 == 1);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i11 = 0; i11 < runCount2; i11++) {
                    bArr[i11] = (byte) createLineBidi.getRunLevel(i11);
                }
                Bidi.reorderVisually(bArr, 0, polarVoyageJobIntentServiceSpectraEliteGamma3385Arr, 0, runCount);
                if (i != lineStart) {
                    int i12 = i3;
                    int PolarVoyageNavigationViewHyperHyperHyperion17932 = i > i2 ? PolarVoyageNavigationViewHyperHyperHyperion1793(i, lineStart) : i;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= runCount) {
                            i13 = i4;
                            break;
                        }
                        if (polarVoyageJobIntentServiceSpectraEliteGamma3385Arr[i13].PolarVoyageMotionLayoutTransitionHeroVision4068 == PolarVoyageNavigationViewHyperHyperHyperion17932) {
                            break;
                        }
                        i13++;
                    }
                    boolean z6 = (z || z5 == polarVoyageJobIntentServiceSpectraEliteGamma3385Arr[i13].PolarVoyageKotlinBetaPulseBeta3653) ? z5 : !z5;
                    return (i13 == 0 && z6) ? layout.getLineLeft(i12) : (i13 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(polarVoyageJobIntentServiceSpectraEliteGamma3385Arr[i13 - 1].PolarVoyageMotionLayoutTransitionHeroVision4068) : layout.getPrimaryHorizontal(polarVoyageJobIntentServiceSpectraEliteGamma3385Arr[i13 + 1].PolarVoyageMotionLayoutTransitionHeroVision4068) : layout.getLineRight(i12);
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= runCount) {
                        i14 = i4;
                        break;
                    }
                    if (polarVoyageJobIntentServiceSpectraEliteGamma3385Arr[i14].PolarVoyageZipVortexCelestial6185 == i) {
                        break;
                    }
                    i14++;
                }
                boolean z7 = (z || z5 == polarVoyageJobIntentServiceSpectraEliteGamma3385Arr[i14].PolarVoyageKotlinBetaPulseBeta3653) ? !z5 : z5;
                if (i14 == 0 && z7) {
                    return layout.getLineLeft(i3);
                }
                return (i14 != runCount + (-1) || z7) ? z7 ? layout.getPrimaryHorizontal(polarVoyageJobIntentServiceSpectraEliteGamma3385Arr[i14 - 1].PolarVoyageZipVortexCelestial6185) : layout.getPrimaryHorizontal(polarVoyageJobIntentServiceSpectraEliteGamma3385Arr[i14 + 1].PolarVoyageZipVortexCelestial6185) : layout.getLineRight(i3);
            }
            z4 = true;
        }
        int i15 = i3;
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
        if (z || z5 == isRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return i == lineStart ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i15) : layout.getLineRight(i15);
    }

    @Override // p000createpolar.PolarVoyageRotateDrawablePixelSparkStorm9570
    public Object PolarVoyageDiffUtilTurboStrike5735(PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297) {
        if (((Set) this.PolarVoyageItemDecorationUltraDeltaEpic7485).contains(polarVoyageRotateAnimationBlazePixelTitan5297)) {
            return ((PolarVoyageRotateDrawablePixelSparkStorm9570) this.PolarVoyageViewRogueMaster4778).PolarVoyageDiffUtilTurboStrike5735(polarVoyageRotateAnimationBlazePixelTitan5297);
        }
        PolarVoyageR8UltraEliteBeta8736.PolarVoyageRotateAnimationCyberCelestialDelta4768("Attempting to request an undeclared dependency ", polarVoyageRotateAnimationBlazePixelTitan5297, ".");
        return null;
    }

    public void PolarVoyageDisplayMetricsVortexDragon9516(String str) {
        str.getClass();
        if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        PolarVoyageAnimatorCelestialBeta6967 polarVoyageAnimatorCelestialBeta6967 = new PolarVoyageAnimatorCelestialBeta6967(1);
        polarVoyageAnimatorCelestialBeta6967.PolarVoyageDrawableDeltaHyperion5742(null, str);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageAnimatorCelestialBeta6967.PolarVoyageZipVortexCelestial6185();
    }

    @Override // p000createpolar.PolarVoyageBottomSheetInfernoOmega3378
    public List PolarVoyageDrawableDeltaHyperion5742(long j) {
        PolarVoyageLaunchTitanHyperPhoenix7302 polarVoyageLaunchTitanHyperPhoenix7302 = (PolarVoyageLaunchTitanHyperPhoenix7302) this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Map map = (Map) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        HashMap hashMap = (HashMap) this.PolarVoyageBottomSheetOmegaNeo1907;
        HashMap hashMap2 = (HashMap) this.PolarVoyageViewRogueMaster4778;
        ArrayList arrayList = new ArrayList();
        polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageTextInputEditTextNebulaHero6651(j, polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageItemDecorationUltraDeltaEpic7485, arrayList);
        TreeMap treeMap = new TreeMap();
        polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageStrictModeLegendEpic1532(j, false, polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageItemDecorationUltraDeltaEpic7485, treeMap);
        polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageItemDecorationUltraDeltaEpic7485(j, map, hashMap, polarVoyageLaunchTitanHyperPhoenix7302.PolarVoyageItemDecorationUltraDeltaEpic7485, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                PolarVoyageDigitalInkRecognitionAuroraDeltaMega8123 polarVoyageDigitalInkRecognitionAuroraDeltaMega8123 = (PolarVoyageDigitalInkRecognitionAuroraDeltaMega8123) hashMap.get(pair.first);
                polarVoyageDigitalInkRecognitionAuroraDeltaMega8123.getClass();
                arrayList2.add(new PolarVoyageProcessCameraProviderHeroBetaSolar3759(null, null, null, decodeByteArray, polarVoyageDigitalInkRecognitionAuroraDeltaMega8123.PolarVoyageKotlinBetaPulseBeta3653, 0, polarVoyageDigitalInkRecognitionAuroraDeltaMega8123.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageDigitalInkRecognitionAuroraDeltaMega8123.PolarVoyageMotionLayoutTransitionHeroVision4068, 0, Integer.MIN_VALUE, -3.4028235E38f, polarVoyageDigitalInkRecognitionAuroraDeltaMega8123.PolarVoyageDiffUtilTurboStrike5735, polarVoyageDigitalInkRecognitionAuroraDeltaMega8123.PolarVoyageTextInputEditTextNebulaHero6651, false, -16777216, polarVoyageDigitalInkRecognitionAuroraDeltaMega8123.PolarVoyageRotateAnimationCyberCelestialDelta4768, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            PolarVoyageDigitalInkRecognitionAuroraDeltaMega8123 polarVoyageDigitalInkRecognitionAuroraDeltaMega81232 = (PolarVoyageDigitalInkRecognitionAuroraDeltaMega8123) hashMap.get(entry.getKey());
            polarVoyageDigitalInkRecognitionAuroraDeltaMega81232.getClass();
            PolarVoyageFontFamilyTitanDeltaBlaze3478 polarVoyageFontFamilyTitanDeltaBlaze3478 = (PolarVoyageFontFamilyTitanDeltaBlaze3478) entry.getValue();
            CharSequence charSequence = polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageZipVortexCelestial6185;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (PolarVoyageBillingClientUltraOmegaMax5253 polarVoyageBillingClientUltraOmegaMax5253 : (PolarVoyageBillingClientUltraOmegaMax5253[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), PolarVoyageBillingClientUltraOmegaMax5253.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(polarVoyageBillingClientUltraOmegaMax5253), spannableStringBuilder.getSpanEnd(polarVoyageBillingClientUltraOmegaMax5253), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = polarVoyageDigitalInkRecognitionAuroraDeltaMega81232.PolarVoyageKotlinBetaPulseBeta3653;
            int i10 = polarVoyageDigitalInkRecognitionAuroraDeltaMega81232.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageBitmapVisionAuroraPixel4705 = f;
            polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageDiffUtilTurboStrike5735 = i10;
            polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageDigitalInkRecognitionAuroraDeltaMega81232.PolarVoyageBitmapVisionAuroraPixel4705;
            polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageDigitalInkRecognitionAuroraDeltaMega81232.PolarVoyageMotionLayoutTransitionHeroVision4068;
            polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageViewRogueMaster4778 = polarVoyageDigitalInkRecognitionAuroraDeltaMega81232.PolarVoyageDiffUtilTurboStrike5735;
            float f2 = polarVoyageDigitalInkRecognitionAuroraDeltaMega81232.PolarVoyageStrictModeLegendEpic1532;
            int i11 = polarVoyageDigitalInkRecognitionAuroraDeltaMega81232.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageBottomSheetOmegaNeo1907 = f2;
            polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i11;
            polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageContentProviderHyperSpark3838 = polarVoyageDigitalInkRecognitionAuroraDeltaMega81232.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            arrayList2.add(polarVoyageFontFamilyTitanDeltaBlaze3478.PolarVoyageZipVortexCelestial6185());
        }
        return arrayList2;
    }

    public void PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageLayoutInflaterInfernoSpeedForce3849 polarVoyageLayoutInflaterInfernoSpeedForce3849, PolarVoyageActionBarInfernoMax1008 polarVoyageActionBarInfernoMax1008) {
        ((ArrayList) this.PolarVoyageStrictModeLegendEpic1532).add(new PolarVoyageRippleDrawableRogueBlazeBlaze8980(polarVoyageLayoutInflaterInfernoSpeedForce3849, polarVoyageActionBarInfernoMax1008));
    }

    @Override // p000createpolar.PolarVoyageRotateDrawablePixelSparkStorm9570
    public Object PolarVoyageKotlinBetaPulseBeta3653(Class cls) {
        if (!((Set) this.PolarVoyageItemDecorationUltraDeltaEpic7485).contains(PolarVoyageRotateAnimationBlazePixelTitan5297.PolarVoyageZipVortexCelestial6185(cls))) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageRotateAnimationCyberCelestialDelta4768("Attempting to request an undeclared dependency ", cls, ".");
            return null;
        }
        Object PolarVoyageKotlinBetaPulseBeta3653 = ((PolarVoyageRotateDrawablePixelSparkStorm9570) this.PolarVoyageViewRogueMaster4778).PolarVoyageKotlinBetaPulseBeta3653(cls);
        if (!cls.equals(PolarVoyageRemoteConfigTitaniumTitanNovaX8748.class)) {
            return PolarVoyageKotlinBetaPulseBeta3653;
        }
        return new PolarVoyageOnAttachStateChangeListenerStormRoguePhantom1790();
    }

    @Override // p000createpolar.PolarVoyageBottomSheetInfernoOmega3378
    public int PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        long[] jArr = (long[]) this.PolarVoyageStrictModeLegendEpic1532;
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185(jArr, j, false);
        if (PolarVoyageZipVortexCelestial6185 < jArr.length) {
            return PolarVoyageZipVortexCelestial6185;
        }
        return -1;
    }

    public int PolarVoyageNavigationViewHyperHyperHyperion1793(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((PolarVoyageR8VisionOmegaNebula9943.PolarVoyageRemoteModelManagerOlympianCelestial9141(charAt, 8192) < 0 || PolarVoyageR8VisionOmegaNebula9943.PolarVoyageRemoteModelManagerOlympianCelestial9141(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void PolarVoyageRemoteModelManagerOlympianCelestial9141(String str, String str2) {
        str2.getClass();
        PolarVoyageRotateAnimationHyperionPixelCelestial5757 polarVoyageRotateAnimationHyperionPixelCelestial5757 = (PolarVoyageRotateAnimationHyperionPixelCelestial5757) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        polarVoyageRotateAnimationHyperionPixelCelestial5757.getClass();
        PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageViewRogueMaster4778(str);
        PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageCameraPixelBlaze2629(str2, str);
        polarVoyageRotateAnimationHyperionPixelCelestial5757.PolarVoyageItemDecorationUltraDeltaEpic7485(str);
        PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageRotateAnimationHyperionPixelCelestial5757, str, str2);
    }

    @Override // p000createpolar.PolarVoyageRotateDrawablePixelSparkStorm9570
    public PolarVoyageRemoteConfigEliteSpectra7350 PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297) {
        if (((Set) this.PolarVoyageBottomSheetOmegaNeo1907).contains(polarVoyageRotateAnimationBlazePixelTitan5297)) {
            return ((PolarVoyageRotateDrawablePixelSparkStorm9570) this.PolarVoyageViewRogueMaster4778).PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageRotateAnimationBlazePixelTitan5297);
        }
        PolarVoyageR8UltraEliteBeta8736.PolarVoyageRotateAnimationCyberCelestialDelta4768("Attempting to request an undeclared dependency Provider<Set<", polarVoyageRotateAnimationBlazePixelTitan5297, ">>.");
        return null;
    }

    @Override // p000createpolar.PolarVoyageBottomSheetInfernoOmega3378
    public int PolarVoyageSnackbarGammaEclipse2140() {
        return ((long[]) this.PolarVoyageStrictModeLegendEpic1532).length;
    }

    @Override // p000createpolar.PolarVoyageRotateDrawablePixelSparkStorm9570
    public Set PolarVoyageStrictModeLegendEpic1532(PolarVoyageRotateAnimationBlazePixelTitan5297 polarVoyageRotateAnimationBlazePixelTitan5297) {
        if (((Set) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).contains(polarVoyageRotateAnimationBlazePixelTitan5297)) {
            return ((PolarVoyageRotateDrawablePixelSparkStorm9570) this.PolarVoyageViewRogueMaster4778).PolarVoyageStrictModeLegendEpic1532(polarVoyageRotateAnimationBlazePixelTitan5297);
        }
        PolarVoyageR8UltraEliteBeta8736.PolarVoyageRotateAnimationCyberCelestialDelta4768("Attempting to request an undeclared dependency Set<", polarVoyageRotateAnimationBlazePixelTitan5297, ">.");
        return null;
    }

    @Override // p000createpolar.PolarVoyageRotateDrawablePixelSparkStorm9570
    public PolarVoyageRemoteConfigEliteSpectra7350 PolarVoyageTextInputEditTextNebulaHero6651(Class cls) {
        return PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageRotateAnimationBlazePixelTitan5297.PolarVoyageZipVortexCelestial6185(cls));
    }

    @Override // p000createpolar.PolarVoyageScaleGestureDetectorDragonBlazeShadow4642
    public Object PolarVoyageZipVortexCelestial6185(Object obj) {
        PolarVoyageGroupPixelOlympian6575 polarVoyageGroupPixelOlympian6575 = (PolarVoyageGroupPixelOlympian6575) obj;
        polarVoyageGroupPixelOlympian6575.getClass();
        PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = (PolarVoyageResourcesCelestialInferno9280) ((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageItemDecorationUltraDeltaEpic7485).PolarVoyageMotionLayoutForceEpicAurora7183();
        PolarVoyageWithContextGammaMaster7108 polarVoyageWithContextGammaMaster7108 = (PolarVoyageWithContextGammaMaster7108) this.PolarVoyageStrictModeLegendEpic1532;
        String str = polarVoyageGroupPixelOlympian6575.PolarVoyageMotionLayoutTransitionHeroVision4068;
        byte[] bArr = (byte[]) polarVoyageResourcesCelestialInferno9280.PolarVoyageStrictModeLegendEpic1532;
        byte[] bArr2 = (byte[]) ((PolarVoyageToolbarHeroSpeed2535) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185((PolarVoyageFlingGestureHyperionEpic8763) polarVoyageWithContextGammaMaster7108.PolarVoyageDisplayMetricsVortexDragon9516(str, bArr));
        String str2 = polarVoyageGroupPixelOlympian6575.PolarVoyageZipVortexCelestial6185;
        byte[] bArr3 = (byte[]) polarVoyageResourcesCelestialInferno9280.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        str2.getClass();
        bArr4.getClass();
        bArr5.getClass();
        return new PolarVoyageR8RogueCelestialVision4313(bArr, bArr3, (byte[]) ((PolarVoyageDelayNovaRogueBeta9839) this.PolarVoyageViewRogueMaster4778).PolarVoyageZipVortexCelestial6185(new PolarVoyageSoundPoolEpicTitan9494(str2, bArr4, bArr5)));
    }

    @Override // p000createpolar.PolarVoyageDebugCelestialNebula7743
    public Object get() {
        return new PolarVoyageShapeDrawableTitanFusionSpeed5859((Executor) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageItemDecorationUltraDeltaEpic7485).get(), (PolarVoyageLintMegaMaxRogue5881) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageStrictModeLegendEpic1532).get(), (PolarVoyageAlarmManagerAlphaInferno3493) ((PolarVoyageDrawableCosmosEclipseMax6944) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).get(), (PolarVoyageExoPlayerNeoDelta8060) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageBottomSheetOmegaNeo1907).get(), (PolarVoyageExoPlayerNeoDelta8060) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageViewRogueMaster4778).get());
    }

    public PolarVoyageServiceUltraUltraNeo9663(Map map) {
        map.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new LinkedHashMap(map);
        this.PolarVoyageStrictModeLegendEpic1532 = new LinkedHashMap();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new LinkedHashMap();
        this.PolarVoyageBottomSheetOmegaNeo1907 = new LinkedHashMap();
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageGeocoderPulseCyber7758(2, this);
    }

    public /* synthetic */ PolarVoyageServiceUltraUltraNeo9663(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = obj;
        this.PolarVoyageStrictModeLegendEpic1532 = obj2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj3;
        this.PolarVoyageBottomSheetOmegaNeo1907 = obj4;
        this.PolarVoyageViewRogueMaster4778 = obj5;
    }

    public PolarVoyageServiceUltraUltraNeo9663() {
        this.PolarVoyageViewRogueMaster4778 = PolarVoyageDelayNovaRogueBeta9839.PolarVoyageLooperThreadAlphaPrime1279;
        this.PolarVoyageStrictModeLegendEpic1532 = "GET";
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageRotateAnimationHyperionPixelCelestial5757(0);
    }
}
