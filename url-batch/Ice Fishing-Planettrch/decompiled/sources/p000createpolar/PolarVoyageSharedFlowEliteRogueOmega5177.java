package p000createpolar;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSharedFlowEliteRogueOmega5177 {
    public final PolarVoyageToastOmegaMega3247 PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
    public final XmlPullParser PolarVoyageZipVortexCelestial6185;

    public PolarVoyageSharedFlowEliteRogueOmega5177(XmlResourceParser xmlResourceParser) {
        this.PolarVoyageZipVortexCelestial6185 = xmlResourceParser;
        PolarVoyageToastOmegaMega3247 polarVoyageToastOmegaMega3247 = new PolarVoyageToastOmegaMega3247();
        polarVoyageToastOmegaMega3247.PolarVoyageMotionLayoutTransitionHeroVision4068 = new float[64];
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageToastOmegaMega3247;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(int i) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i | this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public final float PolarVoyageMotionLayoutTransitionHeroVision4068(TypedArray typedArray, String str, int i, float f) {
        if (PolarVoyageFragmentManagerEpicMax6434.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageZipVortexCelestial6185, str)) {
            f = typedArray.getFloat(i, f);
        }
        PolarVoyageKotlinBetaPulseBeta3653(typedArray.getChangingConfigurations());
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PolarVoyageViewModelQuantumDragonPhoenix2767 PolarVoyageZipVortexCelestial6185(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        PolarVoyageViewModelQuantumDragonPhoenix2767 polarVoyageViewModelQuantumDragonPhoenix2767;
        if (PolarVoyageFragmentManagerEpicMax6434.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageZipVortexCelestial6185, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    polarVoyageViewModelQuantumDragonPhoenix2767 = PolarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageMotionLayoutTransitionHeroVision4068(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    polarVoyageViewModelQuantumDragonPhoenix2767 = null;
                }
            } else {
                polarVoyageViewModelQuantumDragonPhoenix2767 = new PolarVoyageViewModelQuantumDragonPhoenix2767(typedValue.data, 0, (Object) null);
            }
            PolarVoyageKotlinBetaPulseBeta3653(typedArray.getChangingConfigurations());
            return polarVoyageViewModelQuantumDragonPhoenix2767;
        }
        polarVoyageViewModelQuantumDragonPhoenix2767 = new PolarVoyageViewModelQuantumDragonPhoenix2767(0, 0, (Object) null);
        PolarVoyageKotlinBetaPulseBeta3653(typedArray.getChangingConfigurations());
        return polarVoyageViewModelQuantumDragonPhoenix2767;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageSharedFlowEliteRogueOmega5177)) {
            return false;
        }
        PolarVoyageSharedFlowEliteRogueOmega5177 polarVoyageSharedFlowEliteRogueOmega5177 = (PolarVoyageSharedFlowEliteRogueOmega5177) obj;
        return PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageZipVortexCelestial6185, polarVoyageSharedFlowEliteRogueOmega5177.PolarVoyageZipVortexCelestial6185) && this.PolarVoyageMotionLayoutTransitionHeroVision4068 == polarVoyageSharedFlowEliteRogueOmega5177.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public final int hashCode() {
        return Integer.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) + (this.PolarVoyageZipVortexCelestial6185.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.PolarVoyageZipVortexCelestial6185);
        sb.append(", config=");
        return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraPixelBlaze2629(sb, this.PolarVoyageMotionLayoutTransitionHeroVision4068, ')');
    }
}
