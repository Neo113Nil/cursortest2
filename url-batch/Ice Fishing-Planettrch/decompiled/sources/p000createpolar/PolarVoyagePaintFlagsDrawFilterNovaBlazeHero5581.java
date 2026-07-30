package p000createpolar;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePaintFlagsDrawFilterNovaBlazeHero5581 implements PolarVoyagePaintCelestialAurora6632 {
    public final int PolarVoyageAnimatorSetSparkUltraMax8233;
    public final List PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageEditTextAuroraHeroPulse9577 PolarVoyageCameraPixelBlaze2629;
    public final PolarVoyageRotateAnimationAuroraNovaXDragon8562 PolarVoyageContentProviderHyperSpark3838;
    public final PolarVoyageScrollViewRogueNovaAurora3073 PolarVoyageDrawableDeltaHyperion5742;
    public final String PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final boolean PolarVoyageNavigationViewHyperHyperHyperion1793;
    public PolarVoyageDrawableCosmosEclipseMax6944 PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public final List PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final CharSequence PolarVoyageSnackbarGammaEclipse2140;
    public final PolarVoyageIntentHyperSolar8536 PolarVoyageStrictModeLegendEpic1532;
    public final PolarVoyageOnLongClickListenerTitaniumPhoenixHero5338 PolarVoyageViewRogueMaster4778;

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0489, code lost:
    
        if ((r3.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653 & 1095216660480L) == 0) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0097, code lost:
    
        if (r7 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0975 A[LOOP:7: B:339:0x0973->B:340:0x0975, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0343  */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [android.text.Spannable, android.text.Spanned, java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v34, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v40, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyagePaintFlagsDrawFilterNovaBlazeHero5581(String str, PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar8536, List list, List list2, PolarVoyageOnLongClickListenerTitaniumPhoenixHero5338 polarVoyageOnLongClickListenerTitaniumPhoenixHero5338, PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse9577) {
        Locale locale;
        int i;
        int i2;
        PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo4341;
        int size;
        int i3;
        Object obj;
        String str2;
        PolarVoyageZipSpeedSolar9113 polarVoyageZipSpeedSolar9113;
        PolarVoyageDebugHyperionAurora3532 polarVoyageDebugHyperionAurora3532;
        long j;
        long PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageInputFilterNeoSpark8169 polarVoyageInputFilterNeoSpark8169;
        PolarVoyageLaunchMaxShadow5522 PolarVoyageMotionLayoutTransitionHeroVision40682;
        Typeface typeface;
        PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo43412;
        ?? r9;
        PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar85362;
        boolean z;
        Class<PolarVoyageMLKitHeroInfernoVortex4420> cls;
        float f;
        Class<PolarVoyageMLKitHeroInfernoVortex4420> cls2;
        Spannable spannable;
        String str3;
        PolarVoyageAnalyticsOmegaEclipseElite3038 polarVoyageAnalyticsOmegaEclipseElite3038;
        long j2;
        float PolarVoyageContentProviderHyperSpark3838;
        int i4;
        int length;
        PolarVoyageManifestThunderUltraVision7989 polarVoyageManifestThunderUltraVision7989;
        ArrayList arrayList;
        int size2;
        int i5;
        PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse95772;
        int i6;
        ArrayList arrayList2;
        PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo43413;
        int i7;
        int size3;
        boolean z2;
        int i8;
        List list3;
        PolarVoyageManifestThunderUltraVision7989 polarVoyageManifestThunderUltraVision79892;
        int size4;
        int i9;
        List list4;
        int i10;
        List list5;
        boolean z3;
        Class<PolarVoyageMLKitHeroInfernoVortex4420> cls3;
        PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse95773;
        PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar85363;
        int i11;
        int i12;
        PolarVoyageViewPrimeMasterMax9802 polarVoyageViewPrimeMasterMax9802;
        String str4;
        String str5;
        int i13;
        PolarVoyageBillingClientDeltaSpectra8116 polarVoyageBillingClientDeltaSpectra8116;
        String str6;
        Class<PolarVoyageMLKitHeroInfernoVortex4420> cls4;
        int i14;
        PolarVoyageMLKitHeroInfernoVortex4420[] polarVoyageMLKitHeroInfernoVortex4420Arr;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = str;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageIntentHyperSolar8536;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = list;
        this.PolarVoyageBottomSheetOmegaNeo1907 = list2;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageOnLongClickListenerTitaniumPhoenixHero5338;
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyageEditTextAuroraHeroPulse9577;
        float PolarVoyageMotionLayoutTransitionHeroVision40683 = polarVoyageEditTextAuroraHeroPulse9577.PolarVoyageMotionLayoutTransitionHeroVision4068();
        PolarVoyageScrollViewRogueNovaAurora3073 polarVoyageScrollViewRogueNovaAurora3073 = new PolarVoyageScrollViewRogueNovaAurora3073(1);
        ((TextPaint) polarVoyageScrollViewRogueNovaAurora3073).density = PolarVoyageMotionLayoutTransitionHeroVision40683;
        polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageImageCaptureVisionStorm7789.PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageKotlinBetaPulseBeta3653 = 3;
        polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageOrientationSensorPrimeTitanium2445.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageScrollViewRogueNovaAurora3073;
        PolarVoyageAnalyticsOmegaEclipseElite3038 polarVoyageAnalyticsOmegaEclipseElite30382 = polarVoyageIntentHyperSolar8536.PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra8894 = PolarVoyageStateListAnimatorTitanSpeed6860.PolarVoyageZipVortexCelestial6185;
        PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra88942 = PolarVoyageStateListAnimatorTitanSpeed6860.PolarVoyageZipVortexCelestial6185;
        PolarVoyageActivityInfoMaxUltraShadow5908 polarVoyageActivityInfoMaxUltraShadow5908 = (PolarVoyageActivityInfoMaxUltraShadow5908) polarVoyageRealtimeDatabaseEclipseUltra88942.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageActivityInfoMaxUltraShadow5908 == null) {
            if (PolarVoyageWorkManagerFusionTitanPrime7962.PolarVoyageBottomSheetOmegaNeo1907 != null) {
                polarVoyageActivityInfoMaxUltraShadow5908 = polarVoyageRealtimeDatabaseEclipseUltra88942.PolarVoyageBottomSheetOmegaNeo1907();
                polarVoyageRealtimeDatabaseEclipseUltra88942.PolarVoyageStrictModeLegendEpic1532 = polarVoyageActivityInfoMaxUltraShadow5908;
            } else {
                polarVoyageActivityInfoMaxUltraShadow5908 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBitmapVisionAuroraPixel4705;
            }
        }
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = ((Boolean) polarVoyageActivityInfoMaxUltraShadow5908.getValue()).booleanValue();
        int i15 = polarVoyageIntentHyperSolar8536.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageZipSpeedSolar9113 polarVoyageZipSpeedSolar91132 = polarVoyageIntentHyperSolar8536.PolarVoyageZipVortexCelestial6185.PolarVoyageBottomSheetOmegaNeo1907;
        if (i15 != 4) {
            if (i15 != 5) {
                if (i15 == 1) {
                    i = 0;
                } else if (i15 == 2) {
                    i = 1;
                } else {
                    if (i15 != 3 && i15 != Integer.MIN_VALUE) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((polarVoyageZipSpeedSolar91132 == null || (locale = ((PolarVoyageViewPagerFusionElite4202) polarVoyageZipSpeedSolar91132.PolarVoyageItemDecorationUltraDeltaEpic7485.get(0)).PolarVoyageZipVortexCelestial6185) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.PolarVoyageAnimatorSetSparkUltraMax8233 = i;
                PolarVoyageHandlerPrimeTitanium1480 polarVoyageHandlerPrimeTitanium1480 = new PolarVoyageHandlerPrimeTitanium1480(this);
                PolarVoyageMotionSceneInfernoEliteMax6410 polarVoyageMotionSceneInfernoEliteMax6410 = polarVoyageIntentHyperSolar8536.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageMotionSceneInfernoEliteMax6410 = polarVoyageMotionSceneInfernoEliteMax6410 == null ? PolarVoyageMotionSceneInfernoEliteMax6410.PolarVoyageKotlinBetaPulseBeta3653 : polarVoyageMotionSceneInfernoEliteMax6410;
                polarVoyageScrollViewRogueNovaAurora3073.setFlags(polarVoyageMotionSceneInfernoEliteMax6410.PolarVoyageMotionLayoutTransitionHeroVision4068 ? polarVoyageScrollViewRogueNovaAurora3073.getFlags() | 128 : polarVoyageScrollViewRogueNovaAurora3073.getFlags() & (-129));
                i2 = polarVoyageMotionSceneInfernoEliteMax6410.PolarVoyageZipVortexCelestial6185;
                if (i2 == 1) {
                    polarVoyageScrollViewRogueNovaAurora3073.setFlags(polarVoyageScrollViewRogueNovaAurora3073.getFlags() | 64);
                    polarVoyageScrollViewRogueNovaAurora3073.setHinting(0);
                } else if (i2 == 2) {
                    polarVoyageScrollViewRogueNovaAurora3073.getFlags();
                    polarVoyageScrollViewRogueNovaAurora3073.setHinting(1);
                } else if (i2 == 3) {
                    polarVoyageScrollViewRogueNovaAurora3073.getFlags();
                    polarVoyageScrollViewRogueNovaAurora3073.setHinting(0);
                } else {
                    polarVoyageScrollViewRogueNovaAurora3073.getFlags();
                }
                polarVoyageSharedFlowThunderTitaniumNeo4341 = polarVoyageIntentHyperSolar8536.PolarVoyageZipVortexCelestial6185;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((PolarVoyageActivityInfoOlympianCosmos2375) obj).PolarVoyageZipVortexCelestial6185 instanceof PolarVoyageSharedFlowThunderTitaniumNeo4341) {
                        break;
                    } else {
                        i3++;
                    }
                }
                boolean z4 = obj != null;
                long j3 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageMotionLayoutTransitionHeroVision4068;
                str2 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageTextInputEditTextNebulaHero6651;
                polarVoyageZipSpeedSolar9113 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBottomSheetOmegaNeo1907;
                PolarVoyageFlowCollectorCosmosNovaBeta5120 polarVoyageFlowCollectorCosmosNovaBeta5120 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageZipVortexCelestial6185;
                polarVoyageDebugHyperionAurora3532 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                j = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j3);
                if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision4068, 4294967296L)) {
                    polarVoyageScrollViewRogueNovaAurora3073.setTextSize(polarVoyageEditTextAuroraHeroPulse9577.PolarVoyageKeyframeEpicNovaXCyber9821(j3));
                } else if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision4068, 8589934592L)) {
                    polarVoyageScrollViewRogueNovaAurora3073.setTextSize(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageKotlinBetaPulseBeta3653(j3) * polarVoyageScrollViewRogueNovaAurora3073.getTextSize());
                }
                polarVoyageInputFilterNeoSpark8169 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageDiffUtilTurboStrike5735;
                if (polarVoyageInputFilterNeoSpark8169 == null || polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null || polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageKotlinBetaPulseBeta3653 != null) {
                    PolarVoyagePaintSolarElite8455 polarVoyagePaintSolarElite8455 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageKotlinBetaPulseBeta3653;
                    polarVoyagePaintSolarElite8455 = polarVoyagePaintSolarElite8455 == null ? PolarVoyagePaintSolarElite8455.PolarVoyageViewRogueMaster4778 : polarVoyagePaintSolarElite8455;
                    PolarVoyageZipGammaTitanium6712 polarVoyageZipGammaTitanium6712 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    int i16 = polarVoyageZipGammaTitanium6712 != null ? polarVoyageZipGammaTitanium6712.PolarVoyageZipVortexCelestial6185 : 0;
                    PolarVoyageObjectDetectionTitanVision3534 polarVoyageObjectDetectionTitanVision3534 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBitmapVisionAuroraPixel4705;
                    int i17 = polarVoyageObjectDetectionTitanVision3534 != null ? polarVoyageObjectDetectionTitanVision3534.PolarVoyageZipVortexCelestial6185 : 65535;
                    PolarVoyagePaintFlagsDrawFilterNovaBlazeHero5581 polarVoyagePaintFlagsDrawFilterNovaBlazeHero5581 = polarVoyageHandlerPrimeTitanium1480.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageSoundPoolNebulaSpark7637) polarVoyagePaintFlagsDrawFilterNovaBlazeHero5581.PolarVoyageViewRogueMaster4778).PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageInputFilterNeoSpark8169, polarVoyagePaintSolarElite8455, i16, i17);
                    if (PolarVoyageMotionLayoutTransitionHeroVision40682 instanceof PolarVoyageThemeOverlayCelestialFusionRogue3966) {
                        Object obj2 = ((PolarVoyageThemeOverlayCelestialFusionRogue3966) PolarVoyageMotionLayoutTransitionHeroVision40682).PolarVoyageItemDecorationUltraDeltaEpic7485;
                        obj2.getClass();
                        typeface = (Typeface) obj2;
                    } else {
                        PolarVoyageDrawableCosmosEclipseMax6944 polarVoyageDrawableCosmosEclipseMax6944 = new PolarVoyageDrawableCosmosEclipseMax6944(PolarVoyageMotionLayoutTransitionHeroVision40682, polarVoyagePaintFlagsDrawFilterNovaBlazeHero5581.PolarVoyageRemoteModelManagerOlympianCelestial9141);
                        polarVoyagePaintFlagsDrawFilterNovaBlazeHero5581.PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageDrawableCosmosEclipseMax6944;
                        Object obj3 = polarVoyageDrawableCosmosEclipseMax6944.PolarVoyageBottomSheetOmegaNeo1907;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    }
                    polarVoyageScrollViewRogueNovaAurora3073.setTypeface(typeface);
                }
                if (polarVoyageZipSpeedSolar9113 != null) {
                    PolarVoyageZipSpeedSolar9113 polarVoyageZipSpeedSolar91133 = PolarVoyageZipSpeedSolar9113.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    if (!polarVoyageZipSpeedSolar9113.equals(PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageNavigationViewHyperHyperHyperion1793())) {
                        ArrayList arrayList3 = new ArrayList(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(polarVoyageZipSpeedSolar9113, 10));
                        Iterator it = polarVoyageZipSpeedSolar9113.PolarVoyageItemDecorationUltraDeltaEpic7485.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((PolarVoyageViewPagerFusionElite4202) it.next()).PolarVoyageZipVortexCelestial6185);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        polarVoyageScrollViewRogueNovaAurora3073.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    polarVoyageScrollViewRogueNovaAurora3073.setFontFeatureSettings(str2);
                }
                if (polarVoyageDebugHyperionAurora3532 != null && !polarVoyageDebugHyperionAurora3532.equals(PolarVoyageDebugHyperionAurora3532.PolarVoyageKotlinBetaPulseBeta3653)) {
                    polarVoyageScrollViewRogueNovaAurora3073.setTextScaleX(polarVoyageScrollViewRogueNovaAurora3073.getTextScaleX() * polarVoyageDebugHyperionAurora3532.PolarVoyageZipVortexCelestial6185);
                    polarVoyageScrollViewRogueNovaAurora3073.setTextSkewX(polarVoyageScrollViewRogueNovaAurora3073.getTextSkewX() + polarVoyageDebugHyperionAurora3532.PolarVoyageMotionLayoutTransitionHeroVision4068);
                }
                polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageFlowCollectorCosmosNovaBeta5120.PolarVoyageBitmapVisionAuroraPixel4705());
                polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageFlowCollectorCosmosNovaBeta5120.PolarVoyageStrictModeLegendEpic1532(), 9205357640488583168L, polarVoyageFlowCollectorCosmosNovaBeta5120.PolarVoyageMotionLayoutTransitionHeroVision4068());
                polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageDiffUtilTurboStrike5735(polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageDrawableDeltaHyperion5742);
                polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageCameraPixelBlaze2629);
                polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageSnackbarGammaEclipse2140);
                if (!PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j), 4294967296L) && PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageKotlinBetaPulseBeta3653(j) != 0.0f) {
                    float textScaleX = polarVoyageScrollViewRogueNovaAurora3073.getTextScaleX() * polarVoyageScrollViewRogueNovaAurora3073.getTextSize();
                    float PolarVoyageKeyframeEpicNovaXCyber9821 = polarVoyageEditTextAuroraHeroPulse9577.PolarVoyageKeyframeEpicNovaXCyber9821(j);
                    if (textScaleX != 0.0f) {
                        polarVoyageScrollViewRogueNovaAurora3073.setLetterSpacing(PolarVoyageKeyframeEpicNovaXCyber9821 / textScaleX);
                    }
                } else if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j), 8589934592L)) {
                    polarVoyageScrollViewRogueNovaAurora3073.setLetterSpacing(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageKotlinBetaPulseBeta3653(j));
                }
                long j4 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageViewRogueMaster4778;
                PolarVoyageAlarmManagerOmegaHyper5109 polarVoyageAlarmManagerOmegaHyper5109 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageStrictModeLegendEpic1532;
                boolean z5 = (z4 || !PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j), 4294967296L) || PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageKotlinBetaPulseBeta3653(j) == 0.0f) ? false : true;
                long j5 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageTextInputEditTextNebulaHero6651;
                boolean z6 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageKotlinBetaPulseBeta3653(j4, j5) && !PolarVoyageContentResolverRogueSpeed9469.PolarVoyageKotlinBetaPulseBeta3653(j4, PolarVoyageContentResolverRogueSpeed9469.PolarVoyageDiffUtilTurboStrike5735);
                boolean z7 = polarVoyageAlarmManagerOmegaHyper5109 == null && Float.compare(polarVoyageAlarmManagerOmegaHyper5109.PolarVoyageZipVortexCelestial6185, 0.0f) != 0;
                polarVoyageSharedFlowThunderTitaniumNeo43412 = (!z5 || z6 || z7) ? new PolarVoyageSharedFlowThunderTitaniumNeo4341(0L, 0L, (PolarVoyagePaintSolarElite8455) null, (PolarVoyageZipGammaTitanium6712) null, (PolarVoyageObjectDetectionTitanVision3534) null, (PolarVoyageInputFilterNeoSpark8169) null, (String) null, z5 ? j : PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageKotlinBetaPulseBeta3653, z7 ? polarVoyageAlarmManagerOmegaHyper5109 : null, (PolarVoyageDebugHyperionAurora3532) null, (PolarVoyageZipSpeedSolar9113) null, z6 ? j4 : j5, (PolarVoyageImageCaptureVisionStorm7789) null, (PolarVoyageOrientationSensorPrimeTitanium2445) null, 63103) : null;
                List list6 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (polarVoyageSharedFlowThunderTitaniumNeo43412 != null) {
                    int size5 = list6.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    int i18 = 0;
                    while (i18 < size5) {
                        arrayList4.add(i18 == 0 ? new PolarVoyageActivityInfoOlympianCosmos2375(0, this.PolarVoyageItemDecorationUltraDeltaEpic7485.length(), polarVoyageSharedFlowThunderTitaniumNeo43412) : (PolarVoyageActivityInfoOlympianCosmos2375) this.PolarVoyageRotateAnimationCyberCelestialDelta4768.get(i18 - 1));
                        i18++;
                    }
                    list6 = arrayList4;
                }
                r9 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                float textSize = this.PolarVoyageDrawableDeltaHyperion5742.getTextSize();
                polarVoyageIntentHyperSolar85362 = this.PolarVoyageStrictModeLegendEpic1532;
                List list7 = this.PolarVoyageBottomSheetOmegaNeo1907;
                PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse95774 = this.PolarVoyageCameraPixelBlaze2629;
                z = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
                PolarVoyageViewPagerShadowNeoRogue1790 polarVoyageViewPagerShadowNeoRogue1790 = PolarVoyageBottomSheetHeroPhantomMega2886.PolarVoyageZipVortexCelestial6185;
                cls = PolarVoyageMLKitHeroInfernoVortex4420.class;
                if (z || PolarVoyageWorkManagerFusionTitanPrime7962.PolarVoyageBottomSheetOmegaNeo1907 == null) {
                    f = 0.0f;
                    cls2 = cls;
                    spannable = r9;
                    str3 = r9;
                } else {
                    PolarVoyageAnalyticsOmegaEclipseElite3038 polarVoyageAnalyticsOmegaEclipseElite30383 = polarVoyageIntentHyperSolar85362.PolarVoyageKotlinBetaPulseBeta3653;
                    if (polarVoyageAnalyticsOmegaEclipseElite30383 != null) {
                        PolarVoyageViewPrimeMasterMax9802 polarVoyageViewPrimeMasterMax98022 = polarVoyageAnalyticsOmegaEclipseElite30383.PolarVoyageZipVortexCelestial6185;
                    }
                    PolarVoyageWorkManagerFusionTitanPrime7962 PolarVoyageZipVortexCelestial6185 = PolarVoyageWorkManagerFusionTitanPrime7962.PolarVoyageZipVortexCelestial6185();
                    int length2 = r9.length();
                    if (!(PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068() == 1)) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Not initialized yet");
                        throw null;
                    }
                    if (length2 < 0) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("end cannot be negative");
                        throw null;
                    }
                    if (!(length2 >= 0)) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("start should be <= than end");
                        throw null;
                    }
                    if (!(r9.length() >= 0)) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("start should be < than charSequence length");
                        throw null;
                    }
                    if (!(length2 <= r9.length())) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("end should be < than charSequence length");
                        throw null;
                    }
                    if (r9.length() == 0 || length2 == 0) {
                        f = 0.0f;
                        cls2 = cls;
                        str4 = r9;
                    } else {
                        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493 = PolarVoyageZipVortexCelestial6185.PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        polarVoyageAlarmManagerAlphaInferno3493.getClass();
                        if (r9 instanceof Spannable) {
                            polarVoyageBillingClientDeltaSpectra8116 = new PolarVoyageBillingClientDeltaSpectra8116((Spannable) r9);
                            i13 = 0;
                        } else if (!(r9 instanceof Spanned) || ((Spanned) r9).nextSpanTransition(-1, length2 + 1, cls) > length2) {
                            i13 = 0;
                            polarVoyageBillingClientDeltaSpectra8116 = null;
                        } else {
                            polarVoyageBillingClientDeltaSpectra8116 = new PolarVoyageBillingClientDeltaSpectra8116();
                            i13 = 0;
                            polarVoyageBillingClientDeltaSpectra8116.PolarVoyageItemDecorationUltraDeltaEpic7485 = false;
                            polarVoyageBillingClientDeltaSpectra8116.PolarVoyageStrictModeLegendEpic1532 = new SpannableString(r9);
                        }
                        if (polarVoyageBillingClientDeltaSpectra8116 == null || (polarVoyageMLKitHeroInfernoVortex4420Arr = (PolarVoyageMLKitHeroInfernoVortex4420[]) polarVoyageBillingClientDeltaSpectra8116.PolarVoyageStrictModeLegendEpic1532.getSpans(i13, length2, cls)) == null || polarVoyageMLKitHeroInfernoVortex4420Arr.length <= 0) {
                            f = 0.0f;
                            str6 = r9;
                            cls4 = cls;
                            i14 = 0;
                        } else {
                            int length3 = polarVoyageMLKitHeroInfernoVortex4420Arr.length;
                            f = 0.0f;
                            int i19 = length2;
                            int i20 = 0;
                            int i21 = 0;
                            String str7 = r9;
                            while (true) {
                                str6 = str7;
                                if (i21 >= length3) {
                                    break;
                                }
                                PolarVoyageMLKitHeroInfernoVortex4420 polarVoyageMLKitHeroInfernoVortex4420 = polarVoyageMLKitHeroInfernoVortex4420Arr[i21];
                                Class<PolarVoyageMLKitHeroInfernoVortex4420> cls5 = cls;
                                int spanStart = polarVoyageBillingClientDeltaSpectra8116.PolarVoyageStrictModeLegendEpic1532.getSpanStart(polarVoyageMLKitHeroInfernoVortex4420);
                                int i22 = i21;
                                int spanEnd = polarVoyageBillingClientDeltaSpectra8116.PolarVoyageStrictModeLegendEpic1532.getSpanEnd(polarVoyageMLKitHeroInfernoVortex4420);
                                if (spanStart != i19) {
                                    polarVoyageBillingClientDeltaSpectra8116.removeSpan(polarVoyageMLKitHeroInfernoVortex4420);
                                }
                                i20 = Math.min(spanStart, i20);
                                i19 = Math.max(spanEnd, i19);
                                i21 = i22 + 1;
                                cls = cls5;
                                str7 = str6;
                            }
                            cls4 = cls;
                            length2 = i19;
                            i14 = i20;
                        }
                        if (i14 == length2 || i14 >= str6.length()) {
                            cls2 = cls4;
                            str4 = str6;
                        } else {
                            cls2 = cls4;
                            String str8 = str6;
                            PolarVoyageBillingClientDeltaSpectra8116 polarVoyageBillingClientDeltaSpectra81162 = (PolarVoyageBillingClientDeltaSpectra8116) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBitmapMaxTitanTitan7960(str8, i14, length2, Integer.MAX_VALUE, false, new PolarVoyageZoomStateAlphaVision6590(20, polarVoyageBillingClientDeltaSpectra8116, (PolarVoyageWithContextGammaMaster7108) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532));
                            str4 = str8;
                            if (polarVoyageBillingClientDeltaSpectra81162 != null) {
                                spannable = polarVoyageBillingClientDeltaSpectra81162.PolarVoyageStrictModeLegendEpic1532;
                                str5 = str8;
                                spannable.getClass();
                                str3 = str5;
                            }
                        }
                    }
                    spannable = str4;
                    str5 = str4;
                    spannable.getClass();
                    str3 = str5;
                }
                long j6 = (!list6.isEmpty() && list7.isEmpty() && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageIntentHyperSolar85362.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageManifestThunderUltraVision7989.PolarVoyageKotlinBetaPulseBeta3653)) ? 0L : 0L;
                spannable = spannable instanceof Spannable ? (Spannable) spannable : new SpannableString(spannable);
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageIntentHyperSolar85362.PolarVoyageZipVortexCelestial6185.PolarVoyageCameraPixelBlaze2629, PolarVoyageImageCaptureVisionStorm7789.PolarVoyageKotlinBetaPulseBeta3653)) {
                    spannable.setSpan(PolarVoyageBottomSheetHeroPhantomMega2886.PolarVoyageZipVortexCelestial6185, 0, str3.length(), 33);
                }
                polarVoyageAnalyticsOmegaEclipseElite3038 = polarVoyageIntentHyperSolar85362.PolarVoyageKotlinBetaPulseBeta3653;
                if ((polarVoyageAnalyticsOmegaEclipseElite3038 != null || (polarVoyageViewPrimeMasterMax9802 = polarVoyageAnalyticsOmegaEclipseElite3038.PolarVoyageZipVortexCelestial6185) == null) ? false : polarVoyageViewPrimeMasterMax9802.PolarVoyageZipVortexCelestial6185) {
                    PolarVoyageAnimatorTurboSpectraNova6915 polarVoyageAnimatorTurboSpectraNova6915 = polarVoyageIntentHyperSolar85362.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (polarVoyageAnimatorTurboSpectraNova6915.PolarVoyageDiffUtilTurboStrike5735 == null) {
                        float PolarVoyageContentProviderHyperSpark38382 = PolarVoyageLayoutOmegaVortex4134.PolarVoyageContentProviderHyperSpark3838(polarVoyageAnimatorTurboSpectraNova6915.PolarVoyageKotlinBetaPulseBeta3653, textSize, polarVoyageEditTextAuroraHeroPulse95774);
                        if (!Float.isNaN(PolarVoyageContentProviderHyperSpark38382)) {
                            spannable.setSpan(new PolarVoyageSupervisorJobHeroHero4111(PolarVoyageContentProviderHyperSpark38382), 0, spannable.length(), 33);
                        }
                        j2 = 1095216660480L;
                        polarVoyageManifestThunderUltraVision7989 = polarVoyageIntentHyperSolar85362.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        if (polarVoyageManifestThunderUltraVision7989 != null) {
                            long j7 = polarVoyageManifestThunderUltraVision7989.PolarVoyageZipVortexCelestial6185;
                            long j8 = polarVoyageManifestThunderUltraVision7989.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            if ((!PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageZipVortexCelestial6185(j7, PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageTextInputEditTextNebulaHero6651(0)) || !PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageZipVortexCelestial6185(j8, PolarVoyagePackageManagerNeoNeoTurbo8097.PolarVoyageTextInputEditTextNebulaHero6651(0))) && (j7 & j2) != j6 && (j8 & j2) != j6) {
                                long PolarVoyageMotionLayoutTransitionHeroVision40684 = PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j7);
                                float PolarVoyageKeyframeEpicNovaXCyber98212 = PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision40684, 4294967296L) ? polarVoyageEditTextAuroraHeroPulse95774.PolarVoyageKeyframeEpicNovaXCyber9821(j7) : PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision40684, 8589934592L) ? PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageKotlinBetaPulseBeta3653(j7) * textSize : f;
                                long PolarVoyageMotionLayoutTransitionHeroVision40685 = PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j8);
                                spannable.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(PolarVoyageKeyframeEpicNovaXCyber98212), (int) Math.ceil(PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision40685, 4294967296L) ? polarVoyageEditTextAuroraHeroPulse95774.PolarVoyageKeyframeEpicNovaXCyber9821(j8) : PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision40685, 8589934592L) ? textSize * PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageKotlinBetaPulseBeta3653(j8) : f)), 0, spannable.length(), 33);
                            }
                        }
                        arrayList = new ArrayList(list6.size());
                        size2 = list6.size();
                        for (i5 = 0; i5 < size2; i5++) {
                            PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos2375 = (PolarVoyageActivityInfoOlympianCosmos2375) list6.get(i5);
                            Object obj4 = polarVoyageActivityInfoOlympianCosmos2375.PolarVoyageZipVortexCelestial6185;
                            if (obj4 instanceof PolarVoyageSharedFlowThunderTitaniumNeo4341) {
                                PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo43414 = (PolarVoyageSharedFlowThunderTitaniumNeo4341) obj4;
                                if (((polarVoyageSharedFlowThunderTitaniumNeo43414.PolarVoyageDiffUtilTurboStrike5735 == null && polarVoyageSharedFlowThunderTitaniumNeo43414.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == null && polarVoyageSharedFlowThunderTitaniumNeo43414.PolarVoyageKotlinBetaPulseBeta3653 == null) ? false : true) || ((PolarVoyageSharedFlowThunderTitaniumNeo4341) obj4).PolarVoyageBitmapVisionAuroraPixel4705 != null) {
                                    arrayList.add(polarVoyageActivityInfoOlympianCosmos2375);
                                }
                            }
                        }
                        PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo43415 = polarVoyageIntentHyperSolar85362.PolarVoyageZipVortexCelestial6185;
                        PolarVoyageInputFilterNeoSpark8169 polarVoyageInputFilterNeoSpark81692 = polarVoyageSharedFlowThunderTitaniumNeo43415.PolarVoyageDiffUtilTurboStrike5735;
                        PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo43416 = ((polarVoyageInputFilterNeoSpark81692 == null || polarVoyageSharedFlowThunderTitaniumNeo43415.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null || polarVoyageSharedFlowThunderTitaniumNeo43415.PolarVoyageKotlinBetaPulseBeta3653 != null) && polarVoyageSharedFlowThunderTitaniumNeo43415.PolarVoyageBitmapVisionAuroraPixel4705 == null) ? null : new PolarVoyageSharedFlowThunderTitaniumNeo4341(0L, 0L, polarVoyageSharedFlowThunderTitaniumNeo43415.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageSharedFlowThunderTitaniumNeo43415.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageSharedFlowThunderTitaniumNeo43415.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageInputFilterNeoSpark81692, (String) null, 0L, (PolarVoyageAlarmManagerOmegaHyper5109) null, (PolarVoyageDebugHyperionAurora3532) null, (PolarVoyageZipSpeedSolar9113) null, 0L, (PolarVoyageImageCaptureVisionStorm7789) null, (PolarVoyageOrientationSensorPrimeTitanium2445) null, 65475);
                        PolarVoyageRealtimeDatabaseHyperEclipse8276 polarVoyageRealtimeDatabaseHyperEclipse8276 = new PolarVoyageRealtimeDatabaseHyperEclipse8276(1, spannable, polarVoyageHandlerPrimeTitanium1480);
                        if (arrayList.size() > 1) {
                            if (!arrayList.isEmpty()) {
                                PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo43417 = (PolarVoyageSharedFlowThunderTitaniumNeo4341) ((PolarVoyageActivityInfoOlympianCosmos2375) arrayList.get(0)).PolarVoyageZipVortexCelestial6185;
                                polarVoyageRealtimeDatabaseHyperEclipse8276.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageSharedFlowThunderTitaniumNeo43416 != null ? polarVoyageSharedFlowThunderTitaniumNeo43416.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageSharedFlowThunderTitaniumNeo43417) : polarVoyageSharedFlowThunderTitaniumNeo43417, Integer.valueOf(((PolarVoyageActivityInfoOlympianCosmos2375) arrayList.get(0)).PolarVoyageMotionLayoutTransitionHeroVision4068), Integer.valueOf(((PolarVoyageActivityInfoOlympianCosmos2375) arrayList.get(0)).PolarVoyageKotlinBetaPulseBeta3653));
                            }
                            polarVoyageEditTextAuroraHeroPulse95772 = polarVoyageEditTextAuroraHeroPulse95774;
                        } else {
                            int size6 = arrayList.size();
                            int i23 = size6 * 2;
                            int[] iArr = new int[i23];
                            int size7 = arrayList.size();
                            int i24 = 0;
                            while (i24 < size7) {
                                PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23752 = (PolarVoyageActivityInfoOlympianCosmos2375) arrayList.get(i24);
                                iArr[i24] = polarVoyageActivityInfoOlympianCosmos23752.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                iArr[i24 + size6] = polarVoyageActivityInfoOlympianCosmos23752.PolarVoyageKotlinBetaPulseBeta3653;
                                i24++;
                                polarVoyageEditTextAuroraHeroPulse95774 = polarVoyageEditTextAuroraHeroPulse95774;
                            }
                            polarVoyageEditTextAuroraHeroPulse95772 = polarVoyageEditTextAuroraHeroPulse95774;
                            if (i23 > 1) {
                                Arrays.sort(iArr);
                            }
                            if (i23 == 0) {
                                PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("Array is empty.");
                                throw null;
                            }
                            int i25 = iArr[0];
                            int i26 = 0;
                            while (i26 < i23) {
                                int i27 = iArr[i26];
                                if (i27 == i25) {
                                    arrayList2 = arrayList;
                                    i6 = i26;
                                    polarVoyageSharedFlowThunderTitaniumNeo43413 = polarVoyageSharedFlowThunderTitaniumNeo43416;
                                    i7 = i23;
                                } else {
                                    int size8 = arrayList.size();
                                    i6 = i26;
                                    PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo43418 = polarVoyageSharedFlowThunderTitaniumNeo43416;
                                    int i28 = 0;
                                    while (i28 < size8) {
                                        ArrayList arrayList5 = arrayList;
                                        PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23753 = (PolarVoyageActivityInfoOlympianCosmos2375) arrayList.get(i28);
                                        PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo43419 = polarVoyageSharedFlowThunderTitaniumNeo43416;
                                        int i29 = polarVoyageActivityInfoOlympianCosmos23753.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                        int i30 = i23;
                                        int i31 = polarVoyageActivityInfoOlympianCosmos23753.PolarVoyageKotlinBetaPulseBeta3653;
                                        if (i29 != i31 && PolarVoyageLooperTurboPixel4815.PolarVoyageZipVortexCelestial6185(i25, i27, i29, i31)) {
                                            PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo434110 = (PolarVoyageSharedFlowThunderTitaniumNeo4341) polarVoyageActivityInfoOlympianCosmos23753.PolarVoyageZipVortexCelestial6185;
                                            polarVoyageSharedFlowThunderTitaniumNeo43418 = polarVoyageSharedFlowThunderTitaniumNeo43418 != null ? polarVoyageSharedFlowThunderTitaniumNeo43418.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageSharedFlowThunderTitaniumNeo434110) : polarVoyageSharedFlowThunderTitaniumNeo434110;
                                        }
                                        i28++;
                                        arrayList = arrayList5;
                                        polarVoyageSharedFlowThunderTitaniumNeo43416 = polarVoyageSharedFlowThunderTitaniumNeo43419;
                                        i23 = i30;
                                    }
                                    arrayList2 = arrayList;
                                    polarVoyageSharedFlowThunderTitaniumNeo43413 = polarVoyageSharedFlowThunderTitaniumNeo43416;
                                    i7 = i23;
                                    if (polarVoyageSharedFlowThunderTitaniumNeo43418 != null) {
                                        polarVoyageRealtimeDatabaseHyperEclipse8276.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageSharedFlowThunderTitaniumNeo43418, Integer.valueOf(i25), Integer.valueOf(i27));
                                    }
                                    i25 = i27;
                                }
                                i26 = i6 + 1;
                                arrayList = arrayList2;
                                polarVoyageSharedFlowThunderTitaniumNeo43416 = polarVoyageSharedFlowThunderTitaniumNeo43413;
                                i23 = i7;
                            }
                        }
                        size3 = list6.size();
                        z2 = false;
                        i8 = 0;
                        while (i8 < size3) {
                            PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23754 = (PolarVoyageActivityInfoOlympianCosmos2375) list6.get(i8);
                            Object obj5 = polarVoyageActivityInfoOlympianCosmos23754.PolarVoyageZipVortexCelestial6185;
                            if (obj5 instanceof PolarVoyageSharedFlowThunderTitaniumNeo4341) {
                                int i32 = polarVoyageActivityInfoOlympianCosmos23754.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                int i33 = polarVoyageActivityInfoOlympianCosmos23754.PolarVoyageKotlinBetaPulseBeta3653;
                                if (i32 >= 0 && i32 < spannable.length() && i33 > i32 && i33 <= spannable.length()) {
                                    PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo434111 = (PolarVoyageSharedFlowThunderTitaniumNeo4341) obj5;
                                    PolarVoyageAlarmManagerOmegaHyper5109 polarVoyageAlarmManagerOmegaHyper51092 = polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageStrictModeLegendEpic1532;
                                    PolarVoyageFlowCollectorCosmosNovaBeta5120 polarVoyageFlowCollectorCosmosNovaBeta51202 = polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageZipVortexCelestial6185;
                                    if (polarVoyageAlarmManagerOmegaHyper51092 != null) {
                                        spannable.setSpan(new PolarVoyageVectorDrawableNeoNovaX7438(polarVoyageAlarmManagerOmegaHyper51092.PolarVoyageZipVortexCelestial6185, 0), i32, i33, 33);
                                    }
                                    PolarVoyageLayoutOmegaVortex4134.PolarVoyageNavigationViewHyperHyperHyperion1793(spannable, polarVoyageFlowCollectorCosmosNovaBeta51202.PolarVoyageBitmapVisionAuroraPixel4705(), i32, i33);
                                    PolarVoyageInputMethodManagerBetaShadowHyper4520 PolarVoyageStrictModeLegendEpic1532 = polarVoyageFlowCollectorCosmosNovaBeta51202.PolarVoyageStrictModeLegendEpic1532();
                                    float PolarVoyageMotionLayoutTransitionHeroVision40686 = polarVoyageFlowCollectorCosmosNovaBeta51202.PolarVoyageMotionLayoutTransitionHeroVision4068();
                                    if (PolarVoyageStrictModeLegendEpic1532 != null) {
                                        if (PolarVoyageStrictModeLegendEpic1532 instanceof PolarVoyageNotificationManagerShadowBlazeMax7736) {
                                            PolarVoyageLayoutOmegaVortex4134.PolarVoyageNavigationViewHyperHyperHyperion1793(spannable, ((PolarVoyageNotificationManagerShadowBlazeMax7736) PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768, i32, i33);
                                        } else {
                                            spannable.setSpan(new PolarVoyageLifecycleCameraControllerPulseBlaze3691((PolarVoyageInputFilterNovaEclipseAlpha5181) PolarVoyageStrictModeLegendEpic1532, PolarVoyageMotionLayoutTransitionHeroVision40686), i32, i33, 33);
                                        }
                                    }
                                    PolarVoyageImageCaptureVisionStorm7789 polarVoyageImageCaptureVisionStorm7789 = polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageCameraPixelBlaze2629;
                                    if (polarVoyageImageCaptureVisionStorm7789 != null) {
                                        int i34 = polarVoyageImageCaptureVisionStorm7789.PolarVoyageZipVortexCelestial6185;
                                        PolarVoyagePlaceholderOmegaBeta9165 polarVoyagePlaceholderOmegaBeta9165 = new PolarVoyagePlaceholderOmegaBeta9165((i34 | 1) == i34, (i34 | 2) == i34);
                                        i11 = 33;
                                        spannable.setSpan(polarVoyagePlaceholderOmegaBeta9165, i32, i33, 33);
                                    } else {
                                        i11 = 33;
                                    }
                                    PolarVoyageLayoutOmegaVortex4134.PolarVoyageAnimatorSetSparkUltraMax8233(spannable, polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageEditTextAuroraHeroPulse95772, i32, i33);
                                    polarVoyageEditTextAuroraHeroPulse95773 = polarVoyageEditTextAuroraHeroPulse95772;
                                    String str9 = polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageTextInputEditTextNebulaHero6651;
                                    if (str9 != null) {
                                        i10 = size3;
                                        spannable.setSpan(new PolarVoyageStateEclipseOmega3661(0, str9), i32, i33, i11);
                                    } else {
                                        i10 = size3;
                                    }
                                    PolarVoyageDebugHyperionAurora3532 polarVoyageDebugHyperionAurora35322 = polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                    if (polarVoyageDebugHyperionAurora35322 != null) {
                                        spannable.setSpan(new ScaleXSpan(polarVoyageDebugHyperionAurora35322.PolarVoyageZipVortexCelestial6185), i32, i33, i11);
                                        spannable.setSpan(new PolarVoyageVectorDrawableNeoNovaX7438(polarVoyageDebugHyperionAurora35322.PolarVoyageMotionLayoutTransitionHeroVision4068, 1), i32, i33, i11);
                                    }
                                    PolarVoyageLayoutOmegaVortex4134.PolarVoyageBitmapMaxTitanTitan7960(spannable, polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageBottomSheetOmegaNeo1907, i32, i33);
                                    long j9 = polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageViewRogueMaster4778;
                                    if (j9 != 16) {
                                        spannable.setSpan(new BackgroundColorSpan(PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(j9)), i32, i33, 33);
                                    }
                                    PolarVoyageOrientationSensorPrimeTitanium2445 polarVoyageOrientationSensorPrimeTitanium2445 = polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageDrawableDeltaHyperion5742;
                                    if (polarVoyageOrientationSensorPrimeTitanium2445 != null) {
                                        long j10 = polarVoyageOrientationSensorPrimeTitanium2445.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                        int PolarVoyageGuidelineStormSolar2850 = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageGuidelineStormSolar2850(polarVoyageOrientationSensorPrimeTitanium2445.PolarVoyageZipVortexCelestial6185);
                                        z3 = z2;
                                        cls3 = cls2;
                                        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                        polarVoyageIntentHyperSolar85363 = polarVoyageIntentHyperSolar85362;
                                        list5 = list7;
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                        float f2 = polarVoyageOrientationSensorPrimeTitanium2445.PolarVoyageKotlinBetaPulseBeta3653;
                                        PolarVoyageAsyncVortexInferno9977 polarVoyageAsyncVortexInferno9977 = new PolarVoyageAsyncVortexInferno9977(PolarVoyageGuidelineStormSolar2850, intBitsToFloat, intBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2);
                                        i12 = 33;
                                        spannable.setSpan(polarVoyageAsyncVortexInferno9977, i32, i33, 33);
                                    } else {
                                        list5 = list7;
                                        z3 = z2;
                                        cls3 = cls2;
                                        i12 = 33;
                                        polarVoyageIntentHyperSolar85363 = polarVoyageIntentHyperSolar85362;
                                    }
                                    PolarVoyageObjectAnimatorSparkPhantomStrike9583 polarVoyageObjectAnimatorSparkPhantomStrike9583 = polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageSnackbarGammaEclipse2140;
                                    if (polarVoyageObjectAnimatorSparkPhantomStrike9583 != null) {
                                        spannable.setSpan(new PolarVoyageSensorManagerMaxBlazeOmega7274(polarVoyageObjectAnimatorSparkPhantomStrike9583), i32, i33, i12);
                                    }
                                    if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageItemDecorationUltraDeltaEpic7485), 4294967296L) || PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageSharedFlowThunderTitaniumNeo434111.PolarVoyageItemDecorationUltraDeltaEpic7485), 8589934592L)) {
                                        z2 = true;
                                        i8++;
                                        size3 = i10;
                                        polarVoyageIntentHyperSolar85362 = polarVoyageIntentHyperSolar85363;
                                        polarVoyageEditTextAuroraHeroPulse95772 = polarVoyageEditTextAuroraHeroPulse95773;
                                        list7 = list5;
                                        cls2 = cls3;
                                    }
                                    z2 = z3;
                                    i8++;
                                    size3 = i10;
                                    polarVoyageIntentHyperSolar85362 = polarVoyageIntentHyperSolar85363;
                                    polarVoyageEditTextAuroraHeroPulse95772 = polarVoyageEditTextAuroraHeroPulse95773;
                                    list7 = list5;
                                    cls2 = cls3;
                                }
                            }
                            i10 = size3;
                            list5 = list7;
                            z3 = z2;
                            cls3 = cls2;
                            polarVoyageEditTextAuroraHeroPulse95773 = polarVoyageEditTextAuroraHeroPulse95772;
                            polarVoyageIntentHyperSolar85363 = polarVoyageIntentHyperSolar85362;
                            z2 = z3;
                            i8++;
                            size3 = i10;
                            polarVoyageIntentHyperSolar85362 = polarVoyageIntentHyperSolar85363;
                            polarVoyageEditTextAuroraHeroPulse95772 = polarVoyageEditTextAuroraHeroPulse95773;
                            list7 = list5;
                            cls2 = cls3;
                        }
                        List list8 = list7;
                        Class<PolarVoyageMLKitHeroInfernoVortex4420> cls6 = cls2;
                        PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse95775 = polarVoyageEditTextAuroraHeroPulse95772;
                        PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar85364 = polarVoyageIntentHyperSolar85362;
                        if (z2) {
                            int size9 = list6.size();
                            int i35 = 0;
                            while (i35 < size9) {
                                PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23755 = (PolarVoyageActivityInfoOlympianCosmos2375) list6.get(i35);
                                PolarVoyageTransitionListenerSpectraOmega9469 polarVoyageTransitionListenerSpectraOmega9469 = (PolarVoyageTransitionListenerSpectraOmega9469) polarVoyageActivityInfoOlympianCosmos23755.PolarVoyageZipVortexCelestial6185;
                                if (polarVoyageTransitionListenerSpectraOmega9469 instanceof PolarVoyageSharedFlowThunderTitaniumNeo4341) {
                                    int i36 = polarVoyageActivityInfoOlympianCosmos23755.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                    int i37 = polarVoyageActivityInfoOlympianCosmos23755.PolarVoyageKotlinBetaPulseBeta3653;
                                    if (i36 >= 0 && i36 < spannable.length() && i37 > i36 && i37 <= spannable.length()) {
                                        long j11 = ((PolarVoyageSharedFlowThunderTitaniumNeo4341) polarVoyageTransitionListenerSpectraOmega9469).PolarVoyageItemDecorationUltraDeltaEpic7485;
                                        long PolarVoyageMotionLayoutTransitionHeroVision40687 = PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j11);
                                        list4 = list8;
                                        Object polarVoyageAnimationSetCyberSpeedBlaze6144 = PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision40687, 4294967296L) ? new PolarVoyageAnimationSetCyberSpeedBlaze6144(polarVoyageEditTextAuroraHeroPulse95775.PolarVoyageKeyframeEpicNovaXCyber9821(j11)) : PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision40687, 8589934592L) ? new PolarVoyageTextRecognitionHyperionSparkNebula1517(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageKotlinBetaPulseBeta3653(j11)) : null;
                                        if (polarVoyageAnimationSetCyberSpeedBlaze6144 != null) {
                                            spannable.setSpan(polarVoyageAnimationSetCyberSpeedBlaze6144, i36, i37, 33);
                                        }
                                        i35++;
                                        list8 = list4;
                                    }
                                }
                                list4 = list8;
                                i35++;
                                list8 = list4;
                            }
                        }
                        list3 = list8;
                        polarVoyageManifestThunderUltraVision79892 = polarVoyageIntentHyperSolar85364.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        if (polarVoyageManifestThunderUltraVision79892 != null) {
                            long j12 = polarVoyageManifestThunderUltraVision79892.PolarVoyageZipVortexCelestial6185;
                            long PolarVoyageMotionLayoutTransitionHeroVision40688 = PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j12);
                            if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision40688, 4294967296L)) {
                                polarVoyageEditTextAuroraHeroPulse95775.PolarVoyageKeyframeEpicNovaXCyber9821(j12);
                            } else if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision40688, 8589934592L)) {
                                PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageKotlinBetaPulseBeta3653(j12);
                            }
                        }
                        size4 = list6.size();
                        for (i9 = 0; i9 < size4; i9++) {
                            Object obj6 = ((PolarVoyageActivityInfoOlympianCosmos2375) list6.get(i9)).PolarVoyageZipVortexCelestial6185;
                        }
                        if (list3.size() > 0) {
                            PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23756 = (PolarVoyageActivityInfoOlympianCosmos2375) list3.get(0);
                            if (polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageZipVortexCelestial6185 != null) {
                                PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                                throw null;
                            }
                            for (Object obj7 : spannable.getSpans(polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageKotlinBetaPulseBeta3653, cls6)) {
                                spannable.removeSpan((PolarVoyageMLKitHeroInfernoVortex4420) obj7);
                            }
                            throw null;
                        }
                        this.PolarVoyageSnackbarGammaEclipse2140 = spannable;
                        this.PolarVoyageContentProviderHyperSpark3838 = new PolarVoyageRotateAnimationAuroraNovaXDragon8562(spannable, this.PolarVoyageDrawableDeltaHyperion5742, this.PolarVoyageAnimatorSetSparkUltraMax8233);
                    }
                }
                PolarVoyageAnimatorTurboSpectraNova6915 polarVoyageAnimatorTurboSpectraNova69152 = polarVoyageIntentHyperSolar85362.PolarVoyageMotionLayoutTransitionHeroVision4068;
                PolarVoyageStrictModeTurboSpeed8430 polarVoyageStrictModeTurboSpeed8430 = polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageDiffUtilTurboStrike5735;
                polarVoyageStrictModeTurboSpeed8430 = polarVoyageStrictModeTurboSpeed8430 == null ? PolarVoyageStrictModeTurboSpeed8430.PolarVoyageKotlinBetaPulseBeta3653 : polarVoyageStrictModeTurboSpeed8430;
                j2 = 1095216660480L;
                PolarVoyageContentProviderHyperSpark3838 = PolarVoyageLayoutOmegaVortex4134.PolarVoyageContentProviderHyperSpark3838(polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageKotlinBetaPulseBeta3653, textSize, polarVoyageEditTextAuroraHeroPulse95774);
                if (!Float.isNaN(PolarVoyageContentProviderHyperSpark3838)) {
                    if (spannable.length() == 0) {
                        i4 = 1;
                    } else {
                        if (spannable.length() == 0) {
                            PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("Char sequence is empty.");
                            throw null;
                        }
                        i4 = 1;
                        if (spannable.charAt(spannable.length() - 1) != '\n') {
                            length = spannable.length();
                            int i38 = length;
                            int i39 = polarVoyageStrictModeTurboSpeed8430.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            spannable.setSpan(new PolarVoyageFCMElitePixelHero9343(PolarVoyageContentProviderHyperSpark3838, i38, (i39 & 1) <= 0, (i39 & 16) <= 0, polarVoyageStrictModeTurboSpeed8430.PolarVoyageZipVortexCelestial6185, false), 0, spannable.length(), 33);
                        }
                    }
                    length = spannable.length() + i4;
                    int i382 = length;
                    int i392 = polarVoyageStrictModeTurboSpeed8430.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    spannable.setSpan(new PolarVoyageFCMElitePixelHero9343(PolarVoyageContentProviderHyperSpark3838, i382, (i392 & 1) <= 0, (i392 & 16) <= 0, polarVoyageStrictModeTurboSpeed8430.PolarVoyageZipVortexCelestial6185, false), 0, spannable.length(), 33);
                }
                polarVoyageManifestThunderUltraVision7989 = polarVoyageIntentHyperSolar85362.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (polarVoyageManifestThunderUltraVision7989 != null) {
                }
                arrayList = new ArrayList(list6.size());
                size2 = list6.size();
                while (i5 < size2) {
                }
                PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo434152 = polarVoyageIntentHyperSolar85362.PolarVoyageZipVortexCelestial6185;
                PolarVoyageInputFilterNeoSpark8169 polarVoyageInputFilterNeoSpark816922 = polarVoyageSharedFlowThunderTitaniumNeo434152.PolarVoyageDiffUtilTurboStrike5735;
                if (polarVoyageInputFilterNeoSpark816922 == null || polarVoyageSharedFlowThunderTitaniumNeo434152.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null || polarVoyageSharedFlowThunderTitaniumNeo434152.PolarVoyageKotlinBetaPulseBeta3653 != null) {
                }
                PolarVoyageRealtimeDatabaseHyperEclipse8276 polarVoyageRealtimeDatabaseHyperEclipse82762 = new PolarVoyageRealtimeDatabaseHyperEclipse8276(1, spannable, polarVoyageHandlerPrimeTitanium1480);
                if (arrayList.size() > 1) {
                }
                size3 = list6.size();
                z2 = false;
                i8 = 0;
                while (i8 < size3) {
                }
                List list82 = list7;
                Class<PolarVoyageMLKitHeroInfernoVortex4420> cls62 = cls2;
                PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse957752 = polarVoyageEditTextAuroraHeroPulse95772;
                PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar853642 = polarVoyageIntentHyperSolar85362;
                if (z2) {
                }
                list3 = list82;
                polarVoyageManifestThunderUltraVision79892 = polarVoyageIntentHyperSolar853642.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (polarVoyageManifestThunderUltraVision79892 != null) {
                }
                size4 = list6.size();
                while (i9 < size4) {
                }
                if (list3.size() > 0) {
                }
                this.PolarVoyageSnackbarGammaEclipse2140 = spannable;
                this.PolarVoyageContentProviderHyperSpark3838 = new PolarVoyageRotateAnimationAuroraNovaXDragon8562(spannable, this.PolarVoyageDrawableDeltaHyperion5742, this.PolarVoyageAnimatorSetSparkUltraMax8233);
            }
            i = 3;
            this.PolarVoyageAnimatorSetSparkUltraMax8233 = i;
            PolarVoyageHandlerPrimeTitanium1480 polarVoyageHandlerPrimeTitanium14802 = new PolarVoyageHandlerPrimeTitanium1480(this);
            PolarVoyageMotionSceneInfernoEliteMax6410 polarVoyageMotionSceneInfernoEliteMax64102 = polarVoyageIntentHyperSolar8536.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageStrictModeLegendEpic1532;
            if (polarVoyageMotionSceneInfernoEliteMax64102 == null) {
            }
            polarVoyageScrollViewRogueNovaAurora3073.setFlags(polarVoyageMotionSceneInfernoEliteMax64102.PolarVoyageMotionLayoutTransitionHeroVision4068 ? polarVoyageScrollViewRogueNovaAurora3073.getFlags() | 128 : polarVoyageScrollViewRogueNovaAurora3073.getFlags() & (-129));
            i2 = polarVoyageMotionSceneInfernoEliteMax64102.PolarVoyageZipVortexCelestial6185;
            if (i2 == 1) {
            }
            polarVoyageSharedFlowThunderTitaniumNeo4341 = polarVoyageIntentHyperSolar8536.PolarVoyageZipVortexCelestial6185;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j32 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageMotionLayoutTransitionHeroVision4068;
            str2 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageTextInputEditTextNebulaHero6651;
            polarVoyageZipSpeedSolar9113 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBottomSheetOmegaNeo1907;
            PolarVoyageFlowCollectorCosmosNovaBeta5120 polarVoyageFlowCollectorCosmosNovaBeta51203 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageZipVortexCelestial6185;
            polarVoyageDebugHyperionAurora3532 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            j = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j32);
            if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision4068, 4294967296L)) {
            }
            polarVoyageInputFilterNeoSpark8169 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageDiffUtilTurboStrike5735;
            if (polarVoyageInputFilterNeoSpark8169 == null) {
            }
            PolarVoyagePaintSolarElite8455 polarVoyagePaintSolarElite84552 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageKotlinBetaPulseBeta3653;
            if (polarVoyagePaintSolarElite84552 == null) {
            }
            PolarVoyageZipGammaTitanium6712 polarVoyageZipGammaTitanium67122 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (polarVoyageZipGammaTitanium67122 != null) {
            }
            PolarVoyageObjectDetectionTitanVision3534 polarVoyageObjectDetectionTitanVision35342 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBitmapVisionAuroraPixel4705;
            if (polarVoyageObjectDetectionTitanVision35342 != null) {
            }
            PolarVoyagePaintFlagsDrawFilterNovaBlazeHero5581 polarVoyagePaintFlagsDrawFilterNovaBlazeHero55812 = polarVoyageHandlerPrimeTitanium14802.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageSoundPoolNebulaSpark7637) polarVoyagePaintFlagsDrawFilterNovaBlazeHero55812.PolarVoyageViewRogueMaster4778).PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageInputFilterNeoSpark8169, polarVoyagePaintSolarElite84552, i16, i17);
            if (PolarVoyageMotionLayoutTransitionHeroVision40682 instanceof PolarVoyageThemeOverlayCelestialFusionRogue3966) {
            }
            polarVoyageScrollViewRogueNovaAurora3073.setTypeface(typeface);
            if (polarVoyageZipSpeedSolar9113 != null) {
            }
            if (str2 != null) {
                polarVoyageScrollViewRogueNovaAurora3073.setFontFeatureSettings(str2);
            }
            if (polarVoyageDebugHyperionAurora3532 != null) {
                polarVoyageScrollViewRogueNovaAurora3073.setTextScaleX(polarVoyageScrollViewRogueNovaAurora3073.getTextScaleX() * polarVoyageDebugHyperionAurora3532.PolarVoyageZipVortexCelestial6185);
                polarVoyageScrollViewRogueNovaAurora3073.setTextSkewX(polarVoyageScrollViewRogueNovaAurora3073.getTextSkewX() + polarVoyageDebugHyperionAurora3532.PolarVoyageMotionLayoutTransitionHeroVision4068);
            }
            polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageFlowCollectorCosmosNovaBeta51203.PolarVoyageBitmapVisionAuroraPixel4705());
            polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageFlowCollectorCosmosNovaBeta51203.PolarVoyageStrictModeLegendEpic1532(), 9205357640488583168L, polarVoyageFlowCollectorCosmosNovaBeta51203.PolarVoyageMotionLayoutTransitionHeroVision4068());
            polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageDiffUtilTurboStrike5735(polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageDrawableDeltaHyperion5742);
            polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageCameraPixelBlaze2629);
            polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageSnackbarGammaEclipse2140);
            if (!PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j), 4294967296L)) {
            }
            if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j), 8589934592L)) {
            }
            long j42 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageViewRogueMaster4778;
            PolarVoyageAlarmManagerOmegaHyper5109 polarVoyageAlarmManagerOmegaHyper51093 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageStrictModeLegendEpic1532;
            if (z4) {
            }
            long j52 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageTextInputEditTextNebulaHero6651;
            if (PolarVoyageContentResolverRogueSpeed9469.PolarVoyageKotlinBetaPulseBeta3653(j42, j52)) {
            }
            if (polarVoyageAlarmManagerOmegaHyper51093 == null) {
            }
            if (z5) {
            }
            List list62 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (polarVoyageSharedFlowThunderTitaniumNeo43412 != null) {
            }
            r9 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            float textSize2 = this.PolarVoyageDrawableDeltaHyperion5742.getTextSize();
            polarVoyageIntentHyperSolar85362 = this.PolarVoyageStrictModeLegendEpic1532;
            List list72 = this.PolarVoyageBottomSheetOmegaNeo1907;
            PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse957742 = this.PolarVoyageCameraPixelBlaze2629;
            z = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
            PolarVoyageViewPagerShadowNeoRogue1790 polarVoyageViewPagerShadowNeoRogue17902 = PolarVoyageBottomSheetHeroPhantomMega2886.PolarVoyageZipVortexCelestial6185;
            cls = PolarVoyageMLKitHeroInfernoVortex4420.class;
            if (z) {
            }
            f = 0.0f;
            cls2 = cls;
            spannable = r9;
            str3 = r9;
            if (!list62.isEmpty()) {
            }
            if (spannable instanceof Spannable) {
            }
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageIntentHyperSolar85362.PolarVoyageZipVortexCelestial6185.PolarVoyageCameraPixelBlaze2629, PolarVoyageImageCaptureVisionStorm7789.PolarVoyageKotlinBetaPulseBeta3653)) {
            }
            polarVoyageAnalyticsOmegaEclipseElite3038 = polarVoyageIntentHyperSolar85362.PolarVoyageKotlinBetaPulseBeta3653;
            if ((polarVoyageAnalyticsOmegaEclipseElite3038 != null || (polarVoyageViewPrimeMasterMax9802 = polarVoyageAnalyticsOmegaEclipseElite3038.PolarVoyageZipVortexCelestial6185) == null) ? false : polarVoyageViewPrimeMasterMax9802.PolarVoyageZipVortexCelestial6185) {
            }
            PolarVoyageAnimatorTurboSpectraNova6915 polarVoyageAnimatorTurboSpectraNova691522 = polarVoyageIntentHyperSolar85362.PolarVoyageMotionLayoutTransitionHeroVision4068;
            PolarVoyageStrictModeTurboSpeed8430 polarVoyageStrictModeTurboSpeed84302 = polarVoyageAnimatorTurboSpectraNova691522.PolarVoyageDiffUtilTurboStrike5735;
            if (polarVoyageStrictModeTurboSpeed84302 == null) {
            }
            j2 = 1095216660480L;
            PolarVoyageContentProviderHyperSpark3838 = PolarVoyageLayoutOmegaVortex4134.PolarVoyageContentProviderHyperSpark3838(polarVoyageAnimatorTurboSpectraNova691522.PolarVoyageKotlinBetaPulseBeta3653, textSize2, polarVoyageEditTextAuroraHeroPulse957742);
            if (!Float.isNaN(PolarVoyageContentProviderHyperSpark3838)) {
            }
            polarVoyageManifestThunderUltraVision7989 = polarVoyageIntentHyperSolar85362.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (polarVoyageManifestThunderUltraVision7989 != null) {
            }
            arrayList = new ArrayList(list62.size());
            size2 = list62.size();
            while (i5 < size2) {
            }
            PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo4341522 = polarVoyageIntentHyperSolar85362.PolarVoyageZipVortexCelestial6185;
            PolarVoyageInputFilterNeoSpark8169 polarVoyageInputFilterNeoSpark8169222 = polarVoyageSharedFlowThunderTitaniumNeo4341522.PolarVoyageDiffUtilTurboStrike5735;
            if (polarVoyageInputFilterNeoSpark8169222 == null || polarVoyageSharedFlowThunderTitaniumNeo4341522.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null || polarVoyageSharedFlowThunderTitaniumNeo4341522.PolarVoyageKotlinBetaPulseBeta3653 != null) {
            }
            PolarVoyageRealtimeDatabaseHyperEclipse8276 polarVoyageRealtimeDatabaseHyperEclipse827622 = new PolarVoyageRealtimeDatabaseHyperEclipse8276(1, spannable, polarVoyageHandlerPrimeTitanium14802);
            if (arrayList.size() > 1) {
            }
            size3 = list62.size();
            z2 = false;
            i8 = 0;
            while (i8 < size3) {
            }
            List list822 = list72;
            Class<PolarVoyageMLKitHeroInfernoVortex4420> cls622 = cls2;
            PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse9577522 = polarVoyageEditTextAuroraHeroPulse95772;
            PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar8536422 = polarVoyageIntentHyperSolar85362;
            if (z2) {
            }
            list3 = list822;
            polarVoyageManifestThunderUltraVision79892 = polarVoyageIntentHyperSolar8536422.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (polarVoyageManifestThunderUltraVision79892 != null) {
            }
            size4 = list62.size();
            while (i9 < size4) {
            }
            if (list3.size() > 0) {
            }
            this.PolarVoyageSnackbarGammaEclipse2140 = spannable;
            this.PolarVoyageContentProviderHyperSpark3838 = new PolarVoyageRotateAnimationAuroraNovaXDragon8562(spannable, this.PolarVoyageDrawableDeltaHyperion5742, this.PolarVoyageAnimatorSetSparkUltraMax8233);
        }
        i = 2;
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = i;
        PolarVoyageHandlerPrimeTitanium1480 polarVoyageHandlerPrimeTitanium148022 = new PolarVoyageHandlerPrimeTitanium1480(this);
        PolarVoyageMotionSceneInfernoEliteMax6410 polarVoyageMotionSceneInfernoEliteMax641022 = polarVoyageIntentHyperSolar8536.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageMotionSceneInfernoEliteMax641022 == null) {
        }
        polarVoyageScrollViewRogueNovaAurora3073.setFlags(polarVoyageMotionSceneInfernoEliteMax641022.PolarVoyageMotionLayoutTransitionHeroVision4068 ? polarVoyageScrollViewRogueNovaAurora3073.getFlags() | 128 : polarVoyageScrollViewRogueNovaAurora3073.getFlags() & (-129));
        i2 = polarVoyageMotionSceneInfernoEliteMax641022.PolarVoyageZipVortexCelestial6185;
        if (i2 == 1) {
        }
        polarVoyageSharedFlowThunderTitaniumNeo4341 = polarVoyageIntentHyperSolar8536.PolarVoyageZipVortexCelestial6185;
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j322 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageMotionLayoutTransitionHeroVision4068;
        str2 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageTextInputEditTextNebulaHero6651;
        polarVoyageZipSpeedSolar9113 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageFlowCollectorCosmosNovaBeta5120 polarVoyageFlowCollectorCosmosNovaBeta512032 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageZipVortexCelestial6185;
        polarVoyageDebugHyperionAurora3532 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        j = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j322);
        if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision4068, 4294967296L)) {
        }
        polarVoyageInputFilterNeoSpark8169 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageDiffUtilTurboStrike5735;
        if (polarVoyageInputFilterNeoSpark8169 == null) {
        }
        PolarVoyagePaintSolarElite8455 polarVoyagePaintSolarElite845522 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageKotlinBetaPulseBeta3653;
        if (polarVoyagePaintSolarElite845522 == null) {
        }
        PolarVoyageZipGammaTitanium6712 polarVoyageZipGammaTitanium671222 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (polarVoyageZipGammaTitanium671222 != null) {
        }
        PolarVoyageObjectDetectionTitanVision3534 polarVoyageObjectDetectionTitanVision353422 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageBitmapVisionAuroraPixel4705;
        if (polarVoyageObjectDetectionTitanVision353422 != null) {
        }
        PolarVoyagePaintFlagsDrawFilterNovaBlazeHero5581 polarVoyagePaintFlagsDrawFilterNovaBlazeHero558122 = polarVoyageHandlerPrimeTitanium148022.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageSoundPoolNebulaSpark7637) polarVoyagePaintFlagsDrawFilterNovaBlazeHero558122.PolarVoyageViewRogueMaster4778).PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageInputFilterNeoSpark8169, polarVoyagePaintSolarElite845522, i16, i17);
        if (PolarVoyageMotionLayoutTransitionHeroVision40682 instanceof PolarVoyageThemeOverlayCelestialFusionRogue3966) {
        }
        polarVoyageScrollViewRogueNovaAurora3073.setTypeface(typeface);
        if (polarVoyageZipSpeedSolar9113 != null) {
        }
        if (str2 != null) {
        }
        if (polarVoyageDebugHyperionAurora3532 != null) {
        }
        polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageFlowCollectorCosmosNovaBeta512032.PolarVoyageBitmapVisionAuroraPixel4705());
        polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageFlowCollectorCosmosNovaBeta512032.PolarVoyageStrictModeLegendEpic1532(), 9205357640488583168L, polarVoyageFlowCollectorCosmosNovaBeta512032.PolarVoyageMotionLayoutTransitionHeroVision4068());
        polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageDiffUtilTurboStrike5735(polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageDrawableDeltaHyperion5742);
        polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageCameraPixelBlaze2629);
        polarVoyageScrollViewRogueNovaAurora3073.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageSnackbarGammaEclipse2140);
        if (!PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j), 4294967296L)) {
        }
        if (PolarVoyageMLKitSparkAlphaFusion8791.PolarVoyageZipVortexCelestial6185(PolarVoyageToastSolarQuantumNovaX6237.PolarVoyageMotionLayoutTransitionHeroVision4068(j), 8589934592L)) {
        }
        long j422 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageViewRogueMaster4778;
        PolarVoyageAlarmManagerOmegaHyper5109 polarVoyageAlarmManagerOmegaHyper510932 = polarVoyageSharedFlowThunderTitaniumNeo4341.PolarVoyageStrictModeLegendEpic1532;
        if (z4) {
        }
        long j522 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageTextInputEditTextNebulaHero6651;
        if (PolarVoyageContentResolverRogueSpeed9469.PolarVoyageKotlinBetaPulseBeta3653(j422, j522)) {
        }
        if (polarVoyageAlarmManagerOmegaHyper510932 == null) {
        }
        if (z5) {
        }
        List list622 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageSharedFlowThunderTitaniumNeo43412 != null) {
        }
        r9 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        float textSize22 = this.PolarVoyageDrawableDeltaHyperion5742.getTextSize();
        polarVoyageIntentHyperSolar85362 = this.PolarVoyageStrictModeLegendEpic1532;
        List list722 = this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse9577422 = this.PolarVoyageCameraPixelBlaze2629;
        z = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
        PolarVoyageViewPagerShadowNeoRogue1790 polarVoyageViewPagerShadowNeoRogue179022 = PolarVoyageBottomSheetHeroPhantomMega2886.PolarVoyageZipVortexCelestial6185;
        cls = PolarVoyageMLKitHeroInfernoVortex4420.class;
        if (z) {
        }
        f = 0.0f;
        cls2 = cls;
        spannable = r9;
        str3 = r9;
        if (!list622.isEmpty()) {
        }
        if (spannable instanceof Spannable) {
        }
        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageIntentHyperSolar85362.PolarVoyageZipVortexCelestial6185.PolarVoyageCameraPixelBlaze2629, PolarVoyageImageCaptureVisionStorm7789.PolarVoyageKotlinBetaPulseBeta3653)) {
        }
        polarVoyageAnalyticsOmegaEclipseElite3038 = polarVoyageIntentHyperSolar85362.PolarVoyageKotlinBetaPulseBeta3653;
        if ((polarVoyageAnalyticsOmegaEclipseElite3038 != null || (polarVoyageViewPrimeMasterMax9802 = polarVoyageAnalyticsOmegaEclipseElite3038.PolarVoyageZipVortexCelestial6185) == null) ? false : polarVoyageViewPrimeMasterMax9802.PolarVoyageZipVortexCelestial6185) {
        }
        PolarVoyageAnimatorTurboSpectraNova6915 polarVoyageAnimatorTurboSpectraNova6915222 = polarVoyageIntentHyperSolar85362.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageStrictModeTurboSpeed8430 polarVoyageStrictModeTurboSpeed843022 = polarVoyageAnimatorTurboSpectraNova6915222.PolarVoyageDiffUtilTurboStrike5735;
        if (polarVoyageStrictModeTurboSpeed843022 == null) {
        }
        j2 = 1095216660480L;
        PolarVoyageContentProviderHyperSpark3838 = PolarVoyageLayoutOmegaVortex4134.PolarVoyageContentProviderHyperSpark3838(polarVoyageAnimatorTurboSpectraNova6915222.PolarVoyageKotlinBetaPulseBeta3653, textSize22, polarVoyageEditTextAuroraHeroPulse9577422);
        if (!Float.isNaN(PolarVoyageContentProviderHyperSpark3838)) {
        }
        polarVoyageManifestThunderUltraVision7989 = polarVoyageIntentHyperSolar85362.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (polarVoyageManifestThunderUltraVision7989 != null) {
        }
        arrayList = new ArrayList(list622.size());
        size2 = list622.size();
        while (i5 < size2) {
        }
        PolarVoyageSharedFlowThunderTitaniumNeo4341 polarVoyageSharedFlowThunderTitaniumNeo43415222 = polarVoyageIntentHyperSolar85362.PolarVoyageZipVortexCelestial6185;
        PolarVoyageInputFilterNeoSpark8169 polarVoyageInputFilterNeoSpark81692222 = polarVoyageSharedFlowThunderTitaniumNeo43415222.PolarVoyageDiffUtilTurboStrike5735;
        if (polarVoyageInputFilterNeoSpark81692222 == null || polarVoyageSharedFlowThunderTitaniumNeo43415222.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null || polarVoyageSharedFlowThunderTitaniumNeo43415222.PolarVoyageKotlinBetaPulseBeta3653 != null) {
        }
        PolarVoyageRealtimeDatabaseHyperEclipse8276 polarVoyageRealtimeDatabaseHyperEclipse8276222 = new PolarVoyageRealtimeDatabaseHyperEclipse8276(1, spannable, polarVoyageHandlerPrimeTitanium148022);
        if (arrayList.size() > 1) {
        }
        size3 = list622.size();
        z2 = false;
        i8 = 0;
        while (i8 < size3) {
        }
        List list8222 = list722;
        Class<PolarVoyageMLKitHeroInfernoVortex4420> cls6222 = cls2;
        PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse95775222 = polarVoyageEditTextAuroraHeroPulse95772;
        PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar85364222 = polarVoyageIntentHyperSolar85362;
        if (z2) {
        }
        list3 = list8222;
        polarVoyageManifestThunderUltraVision79892 = polarVoyageIntentHyperSolar85364222.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (polarVoyageManifestThunderUltraVision79892 != null) {
        }
        size4 = list622.size();
        while (i9 < size4) {
        }
        if (list3.size() > 0) {
        }
        this.PolarVoyageSnackbarGammaEclipse2140 = spannable;
        this.PolarVoyageContentProviderHyperSpark3838 = new PolarVoyageRotateAnimationAuroraNovaXDragon8562(spannable, this.PolarVoyageDrawableDeltaHyperion5742, this.PolarVoyageAnimatorSetSparkUltraMax8233);
    }

    @Override // p000createpolar.PolarVoyagePaintCelestialAurora6632
    public final boolean PolarVoyageKotlinBetaPulseBeta3653() {
        PolarVoyageDrawableCosmosEclipseMax6944 polarVoyageDrawableCosmosEclipseMax6944 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (polarVoyageDrawableCosmosEclipseMax6944 != null ? polarVoyageDrawableCosmosEclipseMax6944.PolarVoyageRemoteModelManagerOlympianCelestial9141() : false) {
            return true;
        }
        if (!this.PolarVoyageNavigationViewHyperHyperHyperion1793) {
            PolarVoyageAnalyticsOmegaEclipseElite3038 polarVoyageAnalyticsOmegaEclipseElite3038 = this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageKotlinBetaPulseBeta3653;
            PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra8894 = PolarVoyageStateListAnimatorTitanSpeed6860.PolarVoyageZipVortexCelestial6185;
            PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra88942 = PolarVoyageStateListAnimatorTitanSpeed6860.PolarVoyageZipVortexCelestial6185;
            PolarVoyageActivityInfoMaxUltraShadow5908 polarVoyageActivityInfoMaxUltraShadow5908 = (PolarVoyageActivityInfoMaxUltraShadow5908) polarVoyageRealtimeDatabaseEclipseUltra88942.PolarVoyageStrictModeLegendEpic1532;
            if (polarVoyageActivityInfoMaxUltraShadow5908 == null) {
                if (PolarVoyageWorkManagerFusionTitanPrime7962.PolarVoyageBottomSheetOmegaNeo1907 != null) {
                    polarVoyageActivityInfoMaxUltraShadow5908 = polarVoyageRealtimeDatabaseEclipseUltra88942.PolarVoyageBottomSheetOmegaNeo1907();
                    polarVoyageRealtimeDatabaseEclipseUltra88942.PolarVoyageStrictModeLegendEpic1532 = polarVoyageActivityInfoMaxUltraShadow5908;
                } else {
                    polarVoyageActivityInfoMaxUltraShadow5908 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBitmapVisionAuroraPixel4705;
                }
            }
            if (((Boolean) polarVoyageActivityInfoMaxUltraShadow5908.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000createpolar.PolarVoyagePaintCelestialAurora6632
    public final float PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        return this.PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653();
    }

    public final float PolarVoyageZipVortexCelestial6185() {
        PolarVoyageRotateAnimationAuroraNovaXDragon8562 polarVoyageRotateAnimationAuroraNovaXDragon8562 = this.PolarVoyageContentProviderHyperSpark3838;
        float f = polarVoyageRotateAnimationAuroraNovaXDragon8562.PolarVoyageBitmapVisionAuroraPixel4705;
        TextPaint textPaint = polarVoyageRotateAnimationAuroraNovaXDragon8562.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (!Float.isNaN(f)) {
            return polarVoyageRotateAnimationAuroraNovaXDragon8562.PolarVoyageBitmapVisionAuroraPixel4705;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = polarVoyageRotateAnimationAuroraNovaXDragon8562.PolarVoyageZipVortexCelestial6185;
        lineInstance.setText(new PolarVoyagePoseDetectionPhantomPhoenixPhoenix8185(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new PolarVoyageAuthTitaniumMasterElite1113(14));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new PolarVoyageRippleDrawableRogueBlazeBlaze8980(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) priorityQueue.peek();
                if (polarVoyageRippleDrawableRogueBlazeBlaze8980 != null && ((Number) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageStrictModeLegendEpic1532).intValue() - ((Number) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new PolarVoyageRippleDrawableRogueBlazeBlaze8980(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                return 0.0f;
            }
            PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89802 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) it.next();
            f2 = Layout.getDesiredWidth(polarVoyageRotateAnimationAuroraNovaXDragon8562.PolarVoyageMotionLayoutTransitionHeroVision4068(), ((Number) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageItemDecorationUltraDeltaEpic7485).intValue(), ((Number) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageStrictModeLegendEpic1532).intValue(), textPaint);
            while (it.hasNext()) {
                PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89803 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(polarVoyageRotateAnimationAuroraNovaXDragon8562.PolarVoyageMotionLayoutTransitionHeroVision4068(), ((Number) polarVoyageRippleDrawableRogueBlazeBlaze89803.PolarVoyageItemDecorationUltraDeltaEpic7485).intValue(), ((Number) polarVoyageRippleDrawableRogueBlazeBlaze89803.PolarVoyageStrictModeLegendEpic1532).intValue(), textPaint));
            }
        }
        polarVoyageRotateAnimationAuroraNovaXDragon8562.PolarVoyageBitmapVisionAuroraPixel4705 = f2;
        return f2;
    }
}
