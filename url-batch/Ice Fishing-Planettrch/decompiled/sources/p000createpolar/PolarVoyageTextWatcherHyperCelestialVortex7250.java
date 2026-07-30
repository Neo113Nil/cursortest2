package p000createpolar;

import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextWatcherHyperCelestialVortex7250 {
    public final PolarVoyageInterpolatorCelestialFusion9132 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final PolarVoyageInterpolatorCelestialFusion9132 PolarVoyageBitmapVisionAuroraPixel4705;
    public final PolarVoyageInterpolatorCelestialFusion9132 PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageRotateAnimationNovaXSpectra7703 PolarVoyageDiffUtilTurboStrike5735;
    public final PolarVoyageRotateAnimationNovaXSpectra7703 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final String PolarVoyageKotlinBetaPulseBeta3653;
    public final ArrayList PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageRotateAnimationNovaXSpectra7703 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageRotateAnimationNovaXSpectra7703 PolarVoyageStrictModeLegendEpic1532;
    public boolean PolarVoyageTextInputEditTextNebulaHero6651;
    public final boolean PolarVoyageViewRogueMaster4778;
    public final String PolarVoyageZipVortexCelestial6185;
    public static final PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 PolarVoyageCameraPixelBlaze2629 = new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 PolarVoyageDrawableDeltaHyperion5742 = new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472("\\{(.+?)\\}");
    public static final PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 PolarVoyageSnackbarGammaEclipse2140 = new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472("http[s]?://");
    public static final PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 PolarVoyageContentProviderHyperSpark3838 = new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(".*");
    public static final PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 PolarVoyageRemoteModelManagerOlympianCelestial9141 = new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472("([^/]*?|)");
    public static final PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 PolarVoyageNavigationViewHyperHyperHyperion1793 = new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472("^[^?#]+\\?([^#]*).*");

    public PolarVoyageTextWatcherHyperCelestialVortex7250(String str) {
        this.PolarVoyageZipVortexCelestial6185 = str;
        ArrayList arrayList = new ArrayList();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageInterpolatorCelestialFusion9132(new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageFirebaseModelDownloadConditionsGammaForce6790
            public final /* synthetic */ PolarVoyageTextWatcherHyperCelestialVortex7250 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                List list;
                int i2 = i;
                PolarVoyageTextWatcherHyperCelestialVortex7250 polarVoyageTextWatcherHyperCelestialVortex7250 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageKotlinBetaPulseBeta3653;
                        if (str2 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185));
                    case 2:
                        String str3 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageBitmapVisionAuroraPixel4705.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageNavigationViewHyperHyperHyperion1793("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(queryParameters);
                                if (str5 == null) {
                                    polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                                    str5 = str4;
                                }
                                PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageDrawableDeltaHyperion5742;
                                polarVoyageOnDeviceTranslatorNovaXPhoenix2472.getClass();
                                str5.getClass();
                                Matcher matcher = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str5);
                                matcher.getClass();
                                PolarVoyageLayoutSpectraInferno5864 polarVoyageLayoutSpectraInferno5864 = new PolarVoyageLayoutSpectraInferno5864();
                                int i3 = 0;
                                for (PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str5); PolarVoyageMotionLayoutTransitionHeroVision4068 != null; PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageActivityInfoBetaQuantum8726()) {
                                    PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                                    PolarVoyageMotionLayoutTransitionHeroVision40682.getClass();
                                    polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068.add(PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185);
                                    if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485 > i3) {
                                        String quote = Pattern.quote(str5.substring(i3, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532 + 1;
                                }
                                if (i3 < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                polarVoyageLayoutSpectraInferno5864.PolarVoyageZipVortexCelestial6185 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485(sb.toString());
                                linkedHashMap.put(str4, polarVoyageLayoutSpectraInferno5864);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185(fragment, arrayList2, sb2);
                        return new PolarVoyageRippleDrawableRogueBlazeBlaze8980(arrayList2, sb2.toString());
                    case 4:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        return (polarVoyageRippleDrawableRogueBlazeBlaze8980 == null || (list = (List) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485) == null) ? new ArrayList() : list;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89802 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        if (polarVoyageRippleDrawableRogueBlazeBlaze89802 != null) {
                            return (String) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageStrictModeLegendEpic1532;
                        }
                        return null;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageRotateAnimationCyberCelestialDelta4768.getValue();
                        if (str7 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = new PolarVoyageInterpolatorCelestialFusion9132(new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageFirebaseModelDownloadConditionsGammaForce6790
            public final /* synthetic */ PolarVoyageTextWatcherHyperCelestialVortex7250 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                List list;
                int i22 = i2;
                PolarVoyageTextWatcherHyperCelestialVortex7250 polarVoyageTextWatcherHyperCelestialVortex7250 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageKotlinBetaPulseBeta3653;
                        if (str2 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185));
                    case 2:
                        String str3 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageBitmapVisionAuroraPixel4705.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageNavigationViewHyperHyperHyperion1793("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(queryParameters);
                                if (str5 == null) {
                                    polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                                    str5 = str4;
                                }
                                PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageDrawableDeltaHyperion5742;
                                polarVoyageOnDeviceTranslatorNovaXPhoenix2472.getClass();
                                str5.getClass();
                                Matcher matcher = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str5);
                                matcher.getClass();
                                PolarVoyageLayoutSpectraInferno5864 polarVoyageLayoutSpectraInferno5864 = new PolarVoyageLayoutSpectraInferno5864();
                                int i3 = 0;
                                for (PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str5); PolarVoyageMotionLayoutTransitionHeroVision4068 != null; PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageActivityInfoBetaQuantum8726()) {
                                    PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                                    PolarVoyageMotionLayoutTransitionHeroVision40682.getClass();
                                    polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068.add(PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185);
                                    if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485 > i3) {
                                        String quote = Pattern.quote(str5.substring(i3, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532 + 1;
                                }
                                if (i3 < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                polarVoyageLayoutSpectraInferno5864.PolarVoyageZipVortexCelestial6185 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485(sb.toString());
                                linkedHashMap.put(str4, polarVoyageLayoutSpectraInferno5864);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185(fragment, arrayList2, sb2);
                        return new PolarVoyageRippleDrawableRogueBlazeBlaze8980(arrayList2, sb2.toString());
                    case 4:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        return (polarVoyageRippleDrawableRogueBlazeBlaze8980 == null || (list = (List) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485) == null) ? new ArrayList() : list;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89802 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        if (polarVoyageRippleDrawableRogueBlazeBlaze89802 != null) {
                            return (String) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageStrictModeLegendEpic1532;
                        }
                        return null;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageRotateAnimationCyberCelestialDelta4768.getValue();
                        if (str7 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon8768 = new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageFirebaseModelDownloadConditionsGammaForce6790
            public final /* synthetic */ PolarVoyageTextWatcherHyperCelestialVortex7250 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                List list;
                int i22 = i3;
                PolarVoyageTextWatcherHyperCelestialVortex7250 polarVoyageTextWatcherHyperCelestialVortex7250 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageKotlinBetaPulseBeta3653;
                        if (str2 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185));
                    case 2:
                        String str3 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageBitmapVisionAuroraPixel4705.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageNavigationViewHyperHyperHyperion1793("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(queryParameters);
                                if (str5 == null) {
                                    polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                                    str5 = str4;
                                }
                                PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageDrawableDeltaHyperion5742;
                                polarVoyageOnDeviceTranslatorNovaXPhoenix2472.getClass();
                                str5.getClass();
                                Matcher matcher = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str5);
                                matcher.getClass();
                                PolarVoyageLayoutSpectraInferno5864 polarVoyageLayoutSpectraInferno5864 = new PolarVoyageLayoutSpectraInferno5864();
                                int i32 = 0;
                                for (PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str5); PolarVoyageMotionLayoutTransitionHeroVision4068 != null; PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageActivityInfoBetaQuantum8726()) {
                                    PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                                    PolarVoyageMotionLayoutTransitionHeroVision40682.getClass();
                                    polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068.add(PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185);
                                    if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485 > i32) {
                                        String quote = Pattern.quote(str5.substring(i32, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532 + 1;
                                }
                                if (i32 < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                polarVoyageLayoutSpectraInferno5864.PolarVoyageZipVortexCelestial6185 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485(sb.toString());
                                linkedHashMap.put(str4, polarVoyageLayoutSpectraInferno5864);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185(fragment, arrayList2, sb2);
                        return new PolarVoyageRippleDrawableRogueBlazeBlaze8980(arrayList2, sb2.toString());
                    case 4:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        return (polarVoyageRippleDrawableRogueBlazeBlaze8980 == null || (list = (List) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485) == null) ? new ArrayList() : list;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89802 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        if (polarVoyageRippleDrawableRogueBlazeBlaze89802 != null) {
                            return (String) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageStrictModeLegendEpic1532;
                        }
                        return null;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageRotateAnimationCyberCelestialDelta4768.getValue();
                        if (str7 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        PolarVoyageMotionLayoutTransitionPrimeStrike8732 polarVoyageMotionLayoutTransitionPrimeStrike8732 = PolarVoyageMotionLayoutTransitionPrimeStrike8732.PolarVoyageItemDecorationUltraDeltaEpic7485;
        this.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyagePoseDetectionCosmosVision6217(polarVoyageMotionLayoutTransitionPrimeStrike8732, polarVoyageFragmentPulseEliteDragon8768);
        final int i4 = 3;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyagePoseDetectionCosmosVision6217(polarVoyageMotionLayoutTransitionPrimeStrike8732, new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageFirebaseModelDownloadConditionsGammaForce6790
            public final /* synthetic */ PolarVoyageTextWatcherHyperCelestialVortex7250 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                List list;
                int i22 = i4;
                PolarVoyageTextWatcherHyperCelestialVortex7250 polarVoyageTextWatcherHyperCelestialVortex7250 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageKotlinBetaPulseBeta3653;
                        if (str2 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185));
                    case 2:
                        String str3 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageBitmapVisionAuroraPixel4705.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageNavigationViewHyperHyperHyperion1793("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(queryParameters);
                                if (str5 == null) {
                                    polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                                    str5 = str4;
                                }
                                PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageDrawableDeltaHyperion5742;
                                polarVoyageOnDeviceTranslatorNovaXPhoenix2472.getClass();
                                str5.getClass();
                                Matcher matcher = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str5);
                                matcher.getClass();
                                PolarVoyageLayoutSpectraInferno5864 polarVoyageLayoutSpectraInferno5864 = new PolarVoyageLayoutSpectraInferno5864();
                                int i32 = 0;
                                for (PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str5); PolarVoyageMotionLayoutTransitionHeroVision4068 != null; PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageActivityInfoBetaQuantum8726()) {
                                    PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                                    PolarVoyageMotionLayoutTransitionHeroVision40682.getClass();
                                    polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068.add(PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185);
                                    if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485 > i32) {
                                        String quote = Pattern.quote(str5.substring(i32, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532 + 1;
                                }
                                if (i32 < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                polarVoyageLayoutSpectraInferno5864.PolarVoyageZipVortexCelestial6185 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485(sb.toString());
                                linkedHashMap.put(str4, polarVoyageLayoutSpectraInferno5864);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185(fragment, arrayList2, sb2);
                        return new PolarVoyageRippleDrawableRogueBlazeBlaze8980(arrayList2, sb2.toString());
                    case 4:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        return (polarVoyageRippleDrawableRogueBlazeBlaze8980 == null || (list = (List) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485) == null) ? new ArrayList() : list;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89802 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        if (polarVoyageRippleDrawableRogueBlazeBlaze89802 != null) {
                            return (String) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageStrictModeLegendEpic1532;
                        }
                        return null;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageRotateAnimationCyberCelestialDelta4768.getValue();
                        if (str7 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyagePoseDetectionCosmosVision6217(polarVoyageMotionLayoutTransitionPrimeStrike8732, new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageFirebaseModelDownloadConditionsGammaForce6790
            public final /* synthetic */ PolarVoyageTextWatcherHyperCelestialVortex7250 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                List list;
                int i22 = i5;
                PolarVoyageTextWatcherHyperCelestialVortex7250 polarVoyageTextWatcherHyperCelestialVortex7250 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageKotlinBetaPulseBeta3653;
                        if (str2 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185));
                    case 2:
                        String str3 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageBitmapVisionAuroraPixel4705.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageNavigationViewHyperHyperHyperion1793("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(queryParameters);
                                if (str5 == null) {
                                    polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                                    str5 = str4;
                                }
                                PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageDrawableDeltaHyperion5742;
                                polarVoyageOnDeviceTranslatorNovaXPhoenix2472.getClass();
                                str5.getClass();
                                Matcher matcher = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str5);
                                matcher.getClass();
                                PolarVoyageLayoutSpectraInferno5864 polarVoyageLayoutSpectraInferno5864 = new PolarVoyageLayoutSpectraInferno5864();
                                int i32 = 0;
                                for (PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str5); PolarVoyageMotionLayoutTransitionHeroVision4068 != null; PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageActivityInfoBetaQuantum8726()) {
                                    PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                                    PolarVoyageMotionLayoutTransitionHeroVision40682.getClass();
                                    polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068.add(PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185);
                                    if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485 > i32) {
                                        String quote = Pattern.quote(str5.substring(i32, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532 + 1;
                                }
                                if (i32 < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                polarVoyageLayoutSpectraInferno5864.PolarVoyageZipVortexCelestial6185 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485(sb.toString());
                                linkedHashMap.put(str4, polarVoyageLayoutSpectraInferno5864);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185(fragment, arrayList2, sb2);
                        return new PolarVoyageRippleDrawableRogueBlazeBlaze8980(arrayList2, sb2.toString());
                    case 4:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        return (polarVoyageRippleDrawableRogueBlazeBlaze8980 == null || (list = (List) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485) == null) ? new ArrayList() : list;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89802 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        if (polarVoyageRippleDrawableRogueBlazeBlaze89802 != null) {
                            return (String) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageStrictModeLegendEpic1532;
                        }
                        return null;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageRotateAnimationCyberCelestialDelta4768.getValue();
                        if (str7 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyagePoseDetectionCosmosVision6217(polarVoyageMotionLayoutTransitionPrimeStrike8732, new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageFirebaseModelDownloadConditionsGammaForce6790
            public final /* synthetic */ PolarVoyageTextWatcherHyperCelestialVortex7250 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                List list;
                int i22 = i6;
                PolarVoyageTextWatcherHyperCelestialVortex7250 polarVoyageTextWatcherHyperCelestialVortex7250 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageKotlinBetaPulseBeta3653;
                        if (str2 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185));
                    case 2:
                        String str3 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageBitmapVisionAuroraPixel4705.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageNavigationViewHyperHyperHyperion1793("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(queryParameters);
                                if (str5 == null) {
                                    polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                                    str5 = str4;
                                }
                                PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageDrawableDeltaHyperion5742;
                                polarVoyageOnDeviceTranslatorNovaXPhoenix2472.getClass();
                                str5.getClass();
                                Matcher matcher = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str5);
                                matcher.getClass();
                                PolarVoyageLayoutSpectraInferno5864 polarVoyageLayoutSpectraInferno5864 = new PolarVoyageLayoutSpectraInferno5864();
                                int i32 = 0;
                                for (PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str5); PolarVoyageMotionLayoutTransitionHeroVision4068 != null; PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageActivityInfoBetaQuantum8726()) {
                                    PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                                    PolarVoyageMotionLayoutTransitionHeroVision40682.getClass();
                                    polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068.add(PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185);
                                    if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485 > i32) {
                                        String quote = Pattern.quote(str5.substring(i32, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532 + 1;
                                }
                                if (i32 < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                polarVoyageLayoutSpectraInferno5864.PolarVoyageZipVortexCelestial6185 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485(sb.toString());
                                linkedHashMap.put(str4, polarVoyageLayoutSpectraInferno5864);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185(fragment, arrayList2, sb2);
                        return new PolarVoyageRippleDrawableRogueBlazeBlaze8980(arrayList2, sb2.toString());
                    case 4:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        return (polarVoyageRippleDrawableRogueBlazeBlaze8980 == null || (list = (List) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485) == null) ? new ArrayList() : list;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89802 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        if (polarVoyageRippleDrawableRogueBlazeBlaze89802 != null) {
                            return (String) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageStrictModeLegendEpic1532;
                        }
                        return null;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageRotateAnimationCyberCelestialDelta4768.getValue();
                        if (str7 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageInterpolatorCelestialFusion9132(new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageFirebaseModelDownloadConditionsGammaForce6790
            public final /* synthetic */ PolarVoyageTextWatcherHyperCelestialVortex7250 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                List list;
                int i22 = i7;
                PolarVoyageTextWatcherHyperCelestialVortex7250 polarVoyageTextWatcherHyperCelestialVortex7250 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageKotlinBetaPulseBeta3653;
                        if (str2 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185));
                    case 2:
                        String str3 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageBitmapVisionAuroraPixel4705.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageNavigationViewHyperHyperHyperion1793("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(queryParameters);
                                if (str5 == null) {
                                    polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                                    str5 = str4;
                                }
                                PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageDrawableDeltaHyperion5742;
                                polarVoyageOnDeviceTranslatorNovaXPhoenix2472.getClass();
                                str5.getClass();
                                Matcher matcher = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str5);
                                matcher.getClass();
                                PolarVoyageLayoutSpectraInferno5864 polarVoyageLayoutSpectraInferno5864 = new PolarVoyageLayoutSpectraInferno5864();
                                int i32 = 0;
                                for (PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str5); PolarVoyageMotionLayoutTransitionHeroVision4068 != null; PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageActivityInfoBetaQuantum8726()) {
                                    PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                                    PolarVoyageMotionLayoutTransitionHeroVision40682.getClass();
                                    polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068.add(PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185);
                                    if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485 > i32) {
                                        String quote = Pattern.quote(str5.substring(i32, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532 + 1;
                                }
                                if (i32 < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                polarVoyageLayoutSpectraInferno5864.PolarVoyageZipVortexCelestial6185 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485(sb.toString());
                                linkedHashMap.put(str4, polarVoyageLayoutSpectraInferno5864);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185(fragment, arrayList2, sb2);
                        return new PolarVoyageRippleDrawableRogueBlazeBlaze8980(arrayList2, sb2.toString());
                    case 4:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        return (polarVoyageRippleDrawableRogueBlazeBlaze8980 == null || (list = (List) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485) == null) ? new ArrayList() : list;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89802 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        if (polarVoyageRippleDrawableRogueBlazeBlaze89802 != null) {
                            return (String) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageStrictModeLegendEpic1532;
                        }
                        return null;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageRotateAnimationCyberCelestialDelta4768.getValue();
                        if (str7 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new PolarVoyageInterpolatorCelestialFusion9132(new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageFirebaseModelDownloadConditionsGammaForce6790
            public final /* synthetic */ PolarVoyageTextWatcherHyperCelestialVortex7250 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                List list;
                int i22 = i8;
                PolarVoyageTextWatcherHyperCelestialVortex7250 polarVoyageTextWatcherHyperCelestialVortex7250 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageKotlinBetaPulseBeta3653;
                        if (str2 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185));
                    case 2:
                        String str3 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageBitmapVisionAuroraPixel4705.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str3);
                            parse.getClass();
                            for (String str4 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageNavigationViewHyperHyperHyperion1793("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str5 = (String) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(queryParameters);
                                if (str5 == null) {
                                    polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageTextInputEditTextNebulaHero6651 = true;
                                    str5 = str4;
                                }
                                PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageDrawableDeltaHyperion5742;
                                polarVoyageOnDeviceTranslatorNovaXPhoenix2472.getClass();
                                str5.getClass();
                                Matcher matcher = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str5);
                                matcher.getClass();
                                PolarVoyageLayoutSpectraInferno5864 polarVoyageLayoutSpectraInferno5864 = new PolarVoyageLayoutSpectraInferno5864();
                                int i32 = 0;
                                for (PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str5); PolarVoyageMotionLayoutTransitionHeroVision4068 != null; PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageActivityInfoBetaQuantum8726()) {
                                    PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                                    PolarVoyageMotionLayoutTransitionHeroVision40682.getClass();
                                    polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068.add(PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185);
                                    if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485 > i32) {
                                        String quote = Pattern.quote(str5.substring(i32, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532 + 1;
                                }
                                if (i32 < str5.length()) {
                                    String quote2 = Pattern.quote(str5.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                polarVoyageLayoutSpectraInferno5864.PolarVoyageZipVortexCelestial6185 = PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485(sb.toString());
                                linkedHashMap.put(str4, polarVoyageLayoutSpectraInferno5864);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185;
                        Uri parse2 = Uri.parse(str6);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str6);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        PolarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageZipVortexCelestial6185(fragment, arrayList2, sb2);
                        return new PolarVoyageRippleDrawableRogueBlazeBlaze8980(arrayList2, sb2.toString());
                    case 4:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        return (polarVoyageRippleDrawableRogueBlazeBlaze8980 == null || (list = (List) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485) == null) ? new ArrayList() : list;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze89802 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageItemDecorationUltraDeltaEpic7485.getValue();
                        if (polarVoyageRippleDrawableRogueBlazeBlaze89802 != null) {
                            return (String) polarVoyageRippleDrawableRogueBlazeBlaze89802.PolarVoyageStrictModeLegendEpic1532;
                        }
                        return null;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str7 = (String) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageRotateAnimationCyberCelestialDelta4768.getValue();
                        if (str7 != null) {
                            return new PolarVoyageOnDeviceTranslatorNovaXPhoenix2472(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!PolarVoyageCameraPixelBlaze2629.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str).find()) {
            String pattern = PolarVoyageSnackbarGammaEclipse2140.PolarVoyageItemDecorationUltraDeltaEpic7485.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str);
        if (PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
            PolarVoyageZipVortexCelestial6185(str.substring(0, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485), arrayList, sb);
            if (!PolarVoyageContentProviderHyperSpark3838.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(sb).find() && !PolarVoyageRemoteModelManagerOlympianCelestial9141.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(sb).find()) {
                z = true;
            }
            this.PolarVoyageViewRogueMaster4778 = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageItemDecorationUltraDeltaEpic7485(sb.toString());
    }

    public static String PolarVoyageItemDecorationUltraDeltaEpic7485(String str) {
        return (PolarVoyageDebugTitaniumInferno5712.PolarVoyageAlertDialogCyberHeroQuantum3938(str, "\\Q") && PolarVoyageDebugTitaniumInferno5712.PolarVoyageAlertDialogCyberHeroQuantum3938(str, "\\E")) ? PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageAnimatorSetSparkUltraMax8233(str, ".*", "\\E.*\\Q") : PolarVoyageDebugTitaniumInferno5712.PolarVoyageAlertDialogCyberHeroQuantum3938(str, "\\.\\*") ? PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageAnimatorSetSparkUltraMax8233(str, "\\.\\*", ".*") : str;
    }

    public static void PolarVoyageTextInputEditTextNebulaHero6651(Bundle bundle, String str, String str2, PolarVoyageRoomEntityQuantumPhantom9586 polarVoyageRoomEntityQuantumPhantom9586) {
        if (polarVoyageRoomEntityQuantumPhantom9586 == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            PolarVoyageAlertDialogSpectraGammaGamma5541 polarVoyageAlertDialogSpectraGammaGamma5541 = polarVoyageRoomEntityQuantumPhantom9586.PolarVoyageZipVortexCelestial6185;
            str.getClass();
            polarVoyageAlertDialogSpectraGammaGamma5541.PolarVoyageBitmapVisionAuroraPixel4705(bundle, str, polarVoyageAlertDialogSpectraGammaGamma5541.PolarVoyageBarcodeScannerInfernoSolarSpark7767(str2));
        }
    }

    public static void PolarVoyageZipVortexCelestial6185(String str, ArrayList arrayList, StringBuilder sb) {
        PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = PolarVoyageDrawableDeltaHyperion5742;
        polarVoyageOnDeviceTranslatorNovaXPhoenix2472.getClass();
        Matcher matcher = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageItemDecorationUltraDeltaEpic7485.matcher(str);
        matcher.getClass();
        int i = 0;
        for (PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str); PolarVoyageMotionLayoutTransitionHeroVision4068 != null; PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageActivityInfoBetaQuantum8726()) {
            PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40682 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(1);
            PolarVoyageMotionLayoutTransitionHeroVision40682.getClass();
            arrayList.add(PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185);
            if (PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485 > i) {
                String quote = Pattern.quote(str.substring(i, PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageItemDecorationUltraDeltaEpic7485));
                quote.getClass();
                sb.append(quote);
            }
            String pattern = PolarVoyageRemoteModelManagerOlympianCelestial9141.PolarVoyageItemDecorationUltraDeltaEpic7485.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183().PolarVoyageStrictModeLegendEpic1532 + 1;
        }
        if (i < str.length()) {
            String quote2 = Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public final Bundle PolarVoyageBarcodeScannerInfernoSolarSpark7767(Uri uri, LinkedHashMap linkedHashMap) {
        PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision40682;
        String str;
        uri.getClass();
        linkedHashMap.getClass();
        PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix2472 = (PolarVoyageOnDeviceTranslatorNovaXPhoenix2472) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getValue();
        if (polarVoyageOnDeviceTranslatorNovaXPhoenix2472 != null && (PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageOnDeviceTranslatorNovaXPhoenix2472.PolarVoyageMotionLayoutTransitionHeroVision4068(uri.toString())) != null) {
            Bundle PolarVoyageStrictModeLegendEpic1532 = PolarVoyageTransformNeoTitanium1654.PolarVoyageStrictModeLegendEpic1532((PolarVoyageRippleDrawableRogueBlazeBlaze8980[]) Arrays.copyOf(new PolarVoyageRippleDrawableRogueBlazeBlaze8980[0], 0));
            if (PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageMotionLayoutTransitionHeroVision4068, PolarVoyageStrictModeLegendEpic1532, linkedHashMap) && (!((Boolean) this.PolarVoyageBitmapVisionAuroraPixel4705.getValue()).booleanValue() || PolarVoyageDiffUtilTurboStrike5735(uri, PolarVoyageStrictModeLegendEpic1532, linkedHashMap))) {
                String fragment = uri.getFragment();
                PolarVoyageOnDeviceTranslatorNovaXPhoenix2472 polarVoyageOnDeviceTranslatorNovaXPhoenix24722 = (PolarVoyageOnDeviceTranslatorNovaXPhoenix2472) this.PolarVoyageBottomSheetOmegaNeo1907.getValue();
                if (polarVoyageOnDeviceTranslatorNovaXPhoenix24722 != null && (PolarVoyageMotionLayoutTransitionHeroVision40682 = polarVoyageOnDeviceTranslatorNovaXPhoenix24722.PolarVoyageMotionLayoutTransitionHeroVision4068(String.valueOf(fragment))) != null) {
                    List list = (List) this.PolarVoyageStrictModeLegendEpic1532.getValue();
                    ArrayList arrayList = new ArrayList(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                            throw null;
                        }
                        String str2 = (String) obj;
                        PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision40683 = ((PolarVoyageApplicationInfoHyperionHyperion6216) PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(i2);
                        if (PolarVoyageMotionLayoutTransitionHeroVision40683 != null) {
                            str = Uri.decode(PolarVoyageMotionLayoutTransitionHeroVision40683.PolarVoyageZipVortexCelestial6185);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageStrictModeLegendEpic1532, str2, str, (PolarVoyageRoomEntityQuantumPhantom9586) linkedHashMap.get(str2));
                            arrayList.add(PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageKeyframeEpicNovaXCyber9821(linkedHashMap, new PolarVoyagePagingFusionPrimeOmega4043(PolarVoyageStrictModeLegendEpic1532, 0)).isEmpty()) {
                    return PolarVoyageStrictModeLegendEpic1532;
                }
            }
        }
        return null;
    }

    public final boolean PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821, Bundle bundle, Map map) {
        ArrayList arrayList = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        ArrayList arrayList2 = new ArrayList(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String str = null;
            if (i < 0) {
                PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                throw null;
            }
            String str2 = (String) obj;
            PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision4068 = ((PolarVoyageApplicationInfoHyperionHyperion6216) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(i3);
            if (PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
                str = Uri.decode(PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185);
                str.getClass();
            }
            if (str == null) {
                str = "";
            }
            try {
                PolarVoyageTextInputEditTextNebulaHero6651(bundle, str2, str, (PolarVoyageRoomEntityQuantumPhantom9586) map.get(str2));
                arrayList2.add(PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageDiffUtilTurboStrike5735(Uri uri, Bundle bundle, Map map) {
        PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821;
        Object obj;
        boolean z;
        Object obj2;
        String query;
        PolarVoyageTextWatcherHyperCelestialVortex7250 polarVoyageTextWatcherHyperCelestialVortex7250 = this;
        Map map2 = map;
        for (Map.Entry entry : ((Map) polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageDiffUtilTurboStrike5735.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            PolarVoyageLayoutSpectraInferno5864 polarVoyageLayoutSpectraInferno5864 = (PolarVoyageLayoutSpectraInferno5864) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (polarVoyageTextWatcherHyperCelestialVortex7250.PolarVoyageTextInputEditTextNebulaHero6651 && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageGuidelineStormSolar2850(query);
            }
            PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova8373 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            boolean z2 = false;
            Bundle PolarVoyageStrictModeLegendEpic1532 = PolarVoyageTransformNeoTitanium1654.PolarVoyageStrictModeLegendEpic1532((PolarVoyageRippleDrawableRogueBlazeBlaze8980[]) Arrays.copyOf(new PolarVoyageRippleDrawableRogueBlazeBlaze8980[0], 0));
            ArrayList arrayList = polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                String str2 = (String) obj3;
                PolarVoyageRoomEntityQuantumPhantom9586 polarVoyageRoomEntityQuantumPhantom9586 = (PolarVoyageRoomEntityQuantumPhantom9586) map2.get(str2);
                PolarVoyageAlertDialogSpectraGammaGamma5541 polarVoyageAlertDialogSpectraGammaGamma5541 = polarVoyageRoomEntityQuantumPhantom9586 != null ? polarVoyageRoomEntityQuantumPhantom9586.PolarVoyageZipVortexCelestial6185 : null;
                if ((polarVoyageAlertDialogSpectraGammaGamma5541 instanceof PolarVoyagePaintHeroSparkTurbo1938) && !polarVoyageRoomEntityQuantumPhantom9586.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                    PolarVoyagePaintHeroSparkTurbo1938 polarVoyagePaintHeroSparkTurbo1938 = (PolarVoyagePaintHeroSparkTurbo1938) polarVoyageAlertDialogSpectraGammaGamma5541;
                    switch (polarVoyagePaintHeroSparkTurbo1938.PolarVoyageBitmapVisionAuroraPixel4705) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            obj2 = new boolean[0];
                            break;
                        case 1:
                            obj2 = new float[0];
                            break;
                        case 2:
                            obj2 = new int[0];
                            break;
                        case 3:
                            obj2 = new long[0];
                            break;
                        default:
                            obj2 = new String[0];
                            break;
                    }
                    polarVoyagePaintHeroSparkTurbo1938.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageStrictModeLegendEpic1532, str2, obj2);
                }
            }
            Map map3 = map2;
            for (String str3 : queryParameters) {
                String str4 = polarVoyageLayoutSpectraInferno5864.PolarVoyageZipVortexCelestial6185;
                if (str4 != null) {
                    Pattern compile = Pattern.compile(str4);
                    compile.getClass();
                    str3.getClass();
                    Matcher matcher = compile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        polarVoyageAnimatorCelestialDeltaMaster5821 = new PolarVoyageAnimatorCelestialDeltaMaster5821(matcher, str3);
                        if (polarVoyageAnimatorCelestialDeltaMaster5821 != null) {
                            return z2;
                        }
                        ArrayList arrayList2 = polarVoyageLayoutSpectraInferno5864.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        ArrayList arrayList3 = new ArrayList(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(arrayList2, 10));
                        int size2 = arrayList2.size();
                        boolean z3 = z2;
                        int i2 = z3 ? 1 : 0;
                        Map map4 = map3;
                        ?? r14 = z3;
                        while (i2 < size2) {
                            Object obj4 = arrayList2.get(i2);
                            i2++;
                            int i3 = r14 + 1;
                            if (r14 < 0) {
                                PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                                throw null;
                            }
                            String str5 = (String) obj4;
                            PolarVoyageCameraXCyberBlazeTitan4557 PolarVoyageMotionLayoutTransitionHeroVision4068 = ((PolarVoyageApplicationInfoHyperionHyperion6216) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068(i3);
                            String str6 = PolarVoyageMotionLayoutTransitionHeroVision4068 != null ? PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185 : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            PolarVoyageRoomEntityQuantumPhantom9586 polarVoyageRoomEntityQuantumPhantom95862 = (PolarVoyageRoomEntityQuantumPhantom9586) map4.get(str5);
                            try {
                                str5.getClass();
                            } catch (IllegalArgumentException unused) {
                            }
                            if (PolarVoyageStrictModeLegendEpic1532.containsKey(str5)) {
                                if (PolarVoyageStrictModeLegendEpic1532.containsKey(str5)) {
                                    if (polarVoyageRoomEntityQuantumPhantom95862 != null) {
                                        PolarVoyageAlertDialogSpectraGammaGamma5541 polarVoyageAlertDialogSpectraGammaGamma55412 = polarVoyageRoomEntityQuantumPhantom95862.PolarVoyageZipVortexCelestial6185;
                                        Object PolarVoyageZipVortexCelestial6185 = polarVoyageAlertDialogSpectraGammaGamma55412.PolarVoyageZipVortexCelestial6185(PolarVoyageStrictModeLegendEpic1532, str5);
                                        if (!PolarVoyageStrictModeLegendEpic1532.containsKey(str5)) {
                                            throw new IllegalArgumentException("There is no previous value in this savedState.");
                                        }
                                        polarVoyageAlertDialogSpectraGammaGamma55412.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageStrictModeLegendEpic1532, str5, polarVoyageAlertDialogSpectraGammaGamma55412.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageZipVortexCelestial6185, str6));
                                    }
                                    z = false;
                                } else {
                                    z = true;
                                }
                                obj = Boolean.valueOf(z);
                                arrayList3.add(obj);
                                map4 = map;
                                r14 = i3;
                                z2 = false;
                            } else {
                                PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageStrictModeLegendEpic1532, str5, str6, polarVoyageRoomEntityQuantumPhantom95862);
                                obj = polarVoyageFilterGammaStrikeNova8373;
                                arrayList3.add(obj);
                                map4 = map;
                                r14 = i3;
                                z2 = false;
                            }
                        }
                        map3 = map;
                    }
                }
                polarVoyageAnimatorCelestialDeltaMaster5821 = null;
                if (polarVoyageAnimatorCelestialDeltaMaster5821 != null) {
                }
            }
            bundle.putAll(PolarVoyageStrictModeLegendEpic1532);
            polarVoyageTextWatcherHyperCelestialVortex7250 = this;
            map2 = map;
        }
        return true;
    }

    public final ArrayList PolarVoyageKotlinBetaPulseBeta3653() {
        Collection values = ((Map) this.PolarVoyageDiffUtilTurboStrike5735.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageSensorManagerFusionPixelSolar7026(((PolarVoyageLayoutSpectraInferno5864) it.next()).PolarVoyageMotionLayoutTransitionHeroVision4068, arrayList);
        }
        return PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageProximitySensorStrikeNeo2764(PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageProximitySensorStrikeNeo2764(this.PolarVoyageMotionLayoutTransitionHeroVision4068, arrayList), (List) this.PolarVoyageStrictModeLegendEpic1532.getValue());
    }

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(this.PolarVoyageZipVortexCelestial6185);
        parse.getClass();
        List<String> pathSegments2 = parse.getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : pathSegments) {
            if (pathSegments2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet.size();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PolarVoyageTextWatcherHyperCelestialVortex7250)) {
            return false;
        }
        return this.PolarVoyageZipVortexCelestial6185.equals(((PolarVoyageTextWatcherHyperCelestialVortex7250) obj).PolarVoyageZipVortexCelestial6185);
    }

    public final int hashCode() {
        return this.PolarVoyageZipVortexCelestial6185.hashCode() * 961;
    }
}
