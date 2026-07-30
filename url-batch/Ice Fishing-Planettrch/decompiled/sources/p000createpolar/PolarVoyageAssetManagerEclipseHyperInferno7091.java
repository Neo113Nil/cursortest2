package p000createpolar;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageAssetManagerEclipseHyperInferno7091 implements PolarVoyageColorDrawableVisionPhantomCyber4545 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final String PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageAssetManagerEclipseHyperInferno7091(String str) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
        str.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = str;
    }

    public static CharSequence PolarVoyageBitmapVisionAuroraPixel4705(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static PolarVoyageAssetManagerEclipseHyperInferno7091 PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        String str;
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(2);
        int PolarVoyagePackageManagerCelestialPhoenix8393 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393();
        int i = PolarVoyagePackageManagerCelestialPhoenix8393 >> 1;
        int PolarVoyagePackageManagerCelestialPhoenix83932 = ((polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393() >> 3) & 31) | ((PolarVoyagePackageManagerCelestialPhoenix8393 & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(PolarVoyagePackageManagerCelestialPhoenix83932 < 10 ? ".0" : ".");
        sb.append(PolarVoyagePackageManagerCelestialPhoenix83932);
        return new PolarVoyageAssetManagerEclipseHyperInferno7091(sb.toString(), 0);
    }

    @Override // p000createpolar.PolarVoyageColorDrawableVisionPhantomCyber4545
    public boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(CharSequence charSequence, int i, int i2, PolarVoyageInAppPurchaseStrikeQuantumTitanium4425 polarVoyageInAppPurchaseStrikeQuantumTitanium4425) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.PolarVoyageStrictModeLegendEpic1532)) {
            return true;
        }
        polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageKotlinBetaPulseBeta3653 = (polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageKotlinBetaPulseBeta3653 & 3) | 4;
        return false;
    }

    public void PolarVoyageZipVortexCelestial6185(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(PolarVoyageBitmapVisionAuroraPixel4705(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.PolarVoyageStrictModeLegendEpic1532);
                    sb.append(PolarVoyageBitmapVisionAuroraPixel4705(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 3:
                return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageDrawableDeltaHyperion5742(new StringBuilder("<"), this.PolarVoyageStrictModeLegendEpic1532, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ PolarVoyageAssetManagerEclipseHyperInferno7091(String str, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = str;
    }

    @Override // p000createpolar.PolarVoyageColorDrawableVisionPhantomCyber4545
    public Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return this;
    }
}
