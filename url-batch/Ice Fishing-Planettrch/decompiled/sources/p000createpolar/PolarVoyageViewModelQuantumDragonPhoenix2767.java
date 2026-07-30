package p000createpolar;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewModelQuantumDragonPhoenix2767 implements PolarVoyageScaleDrawablePulseNeoSpectra5760 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageViewModelQuantumDragonPhoenix2767(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 3:
                break;
            case 4:
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new LinkedHashMap();
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
            default:
                this.PolarVoyageStrictModeLegendEpic1532 = 1;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Collections.singletonList(null);
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageTextRecognitionHeroOmega1312(8);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PolarVoyageViewModelQuantumDragonPhoenix2767 PolarVoyageMotionLayoutTransitionHeroVision4068(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int i2;
        float f2;
        float f3;
        Object radialGradient;
        int i3;
        TypedArray obtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        int i4 = 0;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new PolarVoyageViewModelQuantumDragonPhoenix2767(PolarVoyageTextInputLayoutUltraEclipseHyperion3673.PolarVoyageMotionLayoutTransitionHeroVision4068(resources, xml, asAttributeSet, theme).getDefaultColor(), i4, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = PolarVoyageLocationManagerBetaTurbo7964.PolarVoyageBitmapVisionAuroraPixel4705;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? obtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? obtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? obtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? obtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? obtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? obtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? obtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? obtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? obtainAttributes.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? obtainAttributes.getColor(1, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f = f4;
            i2 = obtainAttributes.getInt(6, 0);
        } else {
            f = f4;
            i2 = 0;
        }
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? obtainAttributes.getFloat(5, 0.0f) : 0.0f;
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f2 = f5;
            if (next2 == 1) {
                f3 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = PolarVoyageLocationManagerBetaTurbo7964.PolarVoyageDiffUtilTurboStrike5735;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                    i3 = 0;
                } else {
                    i3 = 0;
                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                }
                boolean hasValue = obtainStyledAttributes.hasValue(i3);
                boolean hasValue2 = obtainStyledAttributes.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = obtainStyledAttributes.getColor(0, 0);
                float f12 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            f5 = f2;
            f6 = f3;
        }
        PolarVoyageImageCaptureCelestialVortex1699 polarVoyageImageCaptureCelestialVortex1699 = arrayList2.size() > 0 ? new PolarVoyageImageCaptureCelestialVortex1699(arrayList2, arrayList) : null;
        if (polarVoyageImageCaptureCelestialVortex1699 == null) {
            polarVoyageImageCaptureCelestialVortex1699 = z ? new PolarVoyageImageCaptureCelestialVortex1699(color, color2, color3) : new PolarVoyageImageCaptureCelestialVortex1699(color, color3);
        }
        if (i5 != 1) {
            if (i5 != 2) {
                radialGradient = new LinearGradient(f, f2, f3, f7, polarVoyageImageCaptureCelestialVortex1699.PolarVoyageZipVortexCelestial6185, polarVoyageImageCaptureCelestialVortex1699.PolarVoyageMotionLayoutTransitionHeroVision4068, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f8, f9, polarVoyageImageCaptureCelestialVortex1699.PolarVoyageZipVortexCelestial6185, polarVoyageImageCaptureCelestialVortex1699.PolarVoyageMotionLayoutTransitionHeroVision4068);
            }
        } else {
            if (f11 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f8, f9, f11, polarVoyageImageCaptureCelestialVortex1699.PolarVoyageZipVortexCelestial6185, polarVoyageImageCaptureCelestialVortex1699.PolarVoyageMotionLayoutTransitionHeroVision4068, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        int i6 = 0;
        return new PolarVoyageViewModelQuantumDragonPhoenix2767(i6, i6, radialGradient);
    }

    public long PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageBroadcastSpectraStormHyper8513 polarVoyageBroadcastSpectraStormHyper8513) {
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = (PolarVoyageTextRecognitionHeroOmega1312) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i = 0;
        polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageViewRogueMaster4778(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, 0, 1, false);
        int i2 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageViewRogueMaster4778(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185[i] & 255) + (i5 << 8);
        }
        this.PolarVoyageStrictModeLegendEpic1532 = i4 + 1 + this.PolarVoyageStrictModeLegendEpic1532;
        return i5;
    }

    public void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyagePagingDataTitaniumNebula9959 polarVoyagePagingDataTitaniumNebula9959) {
        PolarVoyagePagingDataTitaniumNebula9959 polarVoyagePagingDataTitaniumNebula99592;
        int i = polarVoyagePagingDataTitaniumNebula9959.PolarVoyageDiffUtilTurboStrike5735;
        if (i == -1) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Failed requirement.");
            return;
        }
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyagePagingDataTitaniumNebula9959 polarVoyagePagingDataTitaniumNebula99593 = ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i2];
        polarVoyagePagingDataTitaniumNebula99593.getClass();
        polarVoyagePagingDataTitaniumNebula9959.PolarVoyageDiffUtilTurboStrike5735 = -1;
        ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i2] = null;
        this.PolarVoyageStrictModeLegendEpic1532 = i2 - 1;
        if (polarVoyagePagingDataTitaniumNebula9959 == polarVoyagePagingDataTitaniumNebula99593) {
            return;
        }
        int PolarVoyageNavigationViewHyperHyperHyperion1793 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageNavigationViewHyperHyperHyperion1793(0L, polarVoyagePagingDataTitaniumNebula99593.PolarVoyageTextInputEditTextNebulaHero6651 - polarVoyagePagingDataTitaniumNebula9959.PolarVoyageTextInputEditTextNebulaHero6651);
        if (PolarVoyageNavigationViewHyperHyperHyperion1793 == 0) {
            ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i] = polarVoyagePagingDataTitaniumNebula99593;
            polarVoyagePagingDataTitaniumNebula99593.PolarVoyageDiffUtilTurboStrike5735 = i;
            return;
        }
        if (PolarVoyageNavigationViewHyperHyperHyperion1793 >= 0) {
            PolarVoyageKotlinBetaPulseBeta3653(i, polarVoyagePagingDataTitaniumNebula99593);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.PolarVoyageStrictModeLegendEpic1532;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                polarVoyagePagingDataTitaniumNebula99592 = ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i3];
                polarVoyagePagingDataTitaniumNebula99592.getClass();
            } else {
                polarVoyagePagingDataTitaniumNebula99592 = ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i3];
                polarVoyagePagingDataTitaniumNebula99592.getClass();
                PolarVoyagePagingDataTitaniumNebula9959 polarVoyagePagingDataTitaniumNebula99594 = ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i4];
                polarVoyagePagingDataTitaniumNebula99594.getClass();
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageNavigationViewHyperHyperHyperion1793(0L, polarVoyagePagingDataTitaniumNebula99594.PolarVoyageTextInputEditTextNebulaHero6651 - polarVoyagePagingDataTitaniumNebula99592.PolarVoyageTextInputEditTextNebulaHero6651) >= 0) {
                    polarVoyagePagingDataTitaniumNebula99592 = polarVoyagePagingDataTitaniumNebula99594;
                }
            }
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageNavigationViewHyperHyperHyperion1793(0L, polarVoyagePagingDataTitaniumNebula99592.PolarVoyageTextInputEditTextNebulaHero6651 - polarVoyagePagingDataTitaniumNebula99593.PolarVoyageTextInputEditTextNebulaHero6651) <= 0) {
                break;
            }
            int i6 = polarVoyagePagingDataTitaniumNebula99592.PolarVoyageDiffUtilTurboStrike5735;
            polarVoyagePagingDataTitaniumNebula99592.PolarVoyageDiffUtilTurboStrike5735 = i;
            ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i] = polarVoyagePagingDataTitaniumNebula99592;
            i = i6;
        }
        ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i] = polarVoyagePagingDataTitaniumNebula99593;
        polarVoyagePagingDataTitaniumNebula99593.PolarVoyageDiffUtilTurboStrike5735 = i;
    }

    public void PolarVoyageDiffUtilTurboStrike5735(PolarVoyageChipInfernoVortex9378 polarVoyageChipInfernoVortex9378, PolarVoyageViewPagerStrikeBlaze5840 polarVoyageViewPagerStrikeBlaze5840, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object obj = linkedHashMap.get(polarVoyageChipInfernoVortex9378);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(polarVoyageChipInfernoVortex9378, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        PolarVoyageLaunchHeroOmegaSolar9428 polarVoyageLaunchHeroOmegaSolar9428 = new PolarVoyageLaunchHeroOmegaSolar9428(new WeakReference(polarVoyageViewPagerStrikeBlaze5840), map, j);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                PolarVoyageLaunchHeroOmegaSolar9428 polarVoyageLaunchHeroOmegaSolar94282 = (PolarVoyageLaunchHeroOmegaSolar9428) arrayList.get(i);
                if (j < polarVoyageLaunchHeroOmegaSolar94282.PolarVoyageKotlinBetaPulseBeta3653) {
                    i++;
                } else if (polarVoyageLaunchHeroOmegaSolar94282.PolarVoyageZipVortexCelestial6185.get() == polarVoyageViewPagerStrikeBlaze5840) {
                    arrayList.set(i, polarVoyageLaunchHeroOmegaSolar9428);
                } else {
                    arrayList.add(i, polarVoyageLaunchHeroOmegaSolar9428);
                }
            }
        } else {
            arrayList.add(polarVoyageLaunchHeroOmegaSolar9428);
        }
        PolarVoyageZipVortexCelestial6185();
    }

    public void PolarVoyageKotlinBetaPulseBeta3653(int i, PolarVoyagePagingDataTitaniumNebula9959 polarVoyagePagingDataTitaniumNebula9959) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            PolarVoyagePagingDataTitaniumNebula9959 polarVoyagePagingDataTitaniumNebula99592 = ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i2];
            polarVoyagePagingDataTitaniumNebula99592.getClass();
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageNavigationViewHyperHyperHyperion1793(0L, polarVoyagePagingDataTitaniumNebula9959.PolarVoyageTextInputEditTextNebulaHero6651 - polarVoyagePagingDataTitaniumNebula99592.PolarVoyageTextInputEditTextNebulaHero6651) <= 0) {
                break;
            }
            polarVoyagePagingDataTitaniumNebula99592.PolarVoyageDiffUtilTurboStrike5735 = i;
            ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i] = polarVoyagePagingDataTitaniumNebula99592;
            i = i2;
        }
        ((PolarVoyagePagingDataTitaniumNebula9959[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i] = polarVoyagePagingDataTitaniumNebula9959;
        polarVoyagePagingDataTitaniumNebula9959.PolarVoyageDiffUtilTurboStrike5735 = i;
    }

    public void PolarVoyageZipVortexCelestial6185() {
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageStrictModeLegendEpic1532 = i + 1;
        if (i >= 10) {
            this.PolarVoyageStrictModeLegendEpic1532 = 0;
            Iterator it = ((LinkedHashMap) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    PolarVoyageLaunchHeroOmegaSolar9428 polarVoyageLaunchHeroOmegaSolar9428 = (PolarVoyageLaunchHeroOmegaSolar9428) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageObserverEliteUltra2793(arrayList);
                    if ((polarVoyageLaunchHeroOmegaSolar9428 != null ? (PolarVoyageViewPagerStrikeBlaze5840) polarVoyageLaunchHeroOmegaSolar9428.PolarVoyageZipVortexCelestial6185.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((PolarVoyageLaunchHeroOmegaSolar9428) arrayList.get(i4)).PolarVoyageZipVortexCelestial6185.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                PolarVoyagePreviewCyberNovaX2451 polarVoyagePreviewCyberNovaX2451 = (PolarVoyagePreviewCyberNovaX2451) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                ArrayList arrayList = new ArrayList(polarVoyagePreviewCyberNovaX2451.PolarVoyageStrictModeLegendEpic1532);
                int i = 0;
                while (true) {
                    int i2 = polarVoyagePreviewCyberNovaX2451.PolarVoyageStrictModeLegendEpic1532;
                    if (i >= i2) {
                        return "UnsupportedBrands{major=" + PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageAlarmManagerShadowHyperBeta8339(this.PolarVoyageStrictModeLegendEpic1532) + ", compatible=" + arrayList + "}";
                    }
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDisplayMetricsVortexDragon9516(i, i2);
                    arrayList.add(PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageAlarmManagerShadowHyperBeta8339(polarVoyagePreviewCyberNovaX2451.PolarVoyageItemDecorationUltraDeltaEpic7485[i]));
                    i++;
                }
            default:
                return super.toString();
        }
    }

    public PolarVoyageViewModelQuantumDragonPhoenix2767(ConnectionResult connectionResult, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 9;
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(connectionResult);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = connectionResult;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    public PolarVoyageViewModelQuantumDragonPhoenix2767(int i, int[] iArr) {
        PolarVoyagePreviewCyberNovaX2451 polarVoyagePreviewCyberNovaX2451;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 8;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        if (iArr != null) {
            PolarVoyagePreviewCyberNovaX2451 polarVoyagePreviewCyberNovaX24512 = PolarVoyagePreviewCyberNovaX2451.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            polarVoyagePreviewCyberNovaX2451 = iArr.length == 0 ? PolarVoyagePreviewCyberNovaX2451.PolarVoyageRotateAnimationCyberCelestialDelta4768 : new PolarVoyagePreviewCyberNovaX2451(Arrays.copyOf(iArr, iArr.length));
        } else {
            polarVoyagePreviewCyberNovaX2451 = PolarVoyagePreviewCyberNovaX2451.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyagePreviewCyberNovaX2451;
    }

    public /* synthetic */ PolarVoyageViewModelQuantumDragonPhoenix2767(int i, int i2, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    public PolarVoyageViewModelQuantumDragonPhoenix2767(int i, ArrayList arrayList) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = arrayList;
                break;
            default:
                this.PolarVoyageStrictModeLegendEpic1532 = 0;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = arrayList;
                break;
        }
    }

    public PolarVoyageViewModelQuantumDragonPhoenix2767(boolean z, boolean z2, boolean z3) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
        this.PolarVoyageStrictModeLegendEpic1532 = (z || z2 || z3) ? 1 : 0;
    }
}
