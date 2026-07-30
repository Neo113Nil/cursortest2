package p000createpolar;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMaterialCardViewPhoenixGammaTitanium8856 extends PolarVoyageInputFilterNovaEclipseAlpha5181 {
    public final long PolarVoyageCameraPixelBlaze2629;
    public final float PolarVoyageDrawableDeltaHyperion5742;
    public final List PolarVoyageViewRogueMaster4778;

    public PolarVoyageMaterialCardViewPhoenixGammaTitanium8856(List list, long j, float f) {
        this.PolarVoyageViewRogueMaster4778 = list;
        this.PolarVoyageCameraPixelBlaze2629 = j;
        this.PolarVoyageDrawableDeltaHyperion5742 = f;
    }

    @Override // p000createpolar.PolarVoyageInputFilterNovaEclipseAlpha5181
    public final Shader PolarVoyageCameraViewEclipseLegendStrike8028(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2 = this.PolarVoyageCameraPixelBlaze2629;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageBottomSheetOmegaNeo1907(j);
            intBitsToFloat = Float.intBitsToFloat((int) (PolarVoyageBottomSheetOmegaNeo1907 >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (PolarVoyageBottomSheetOmegaNeo1907 & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        float f = this.PolarVoyageDrawableDeltaHyperion5742;
        if (f == Float.POSITIVE_INFINITY) {
            f = PolarVoyageFlowCollectorQuantumPhantom5972.PolarVoyageKotlinBetaPulseBeta3653(j) / 2.0f;
        }
        float f2 = f;
        List list = this.PolarVoyageViewRogueMaster4778;
        PolarVoyageTransformNeoTitanium1654.PolarVoyageCanvasElitePhoenix4750(list);
        int PolarVoyageBottomSheetOmegaNeo19072 = PolarVoyageTransformNeoTitanium1654.PolarVoyageBottomSheetOmegaNeo1907(list);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f2, PolarVoyageTransformNeoTitanium1654.PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageBottomSheetOmegaNeo19072, list), PolarVoyageTransformNeoTitanium1654.PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageBottomSheetOmegaNeo19072, list), PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageToolbarEclipseInfernoHero6368(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageMaterialCardViewPhoenixGammaTitanium8856)) {
            return false;
        }
        PolarVoyageMaterialCardViewPhoenixGammaTitanium8856 polarVoyageMaterialCardViewPhoenixGammaTitanium8856 = (PolarVoyageMaterialCardViewPhoenixGammaTitanium8856) obj;
        return this.PolarVoyageViewRogueMaster4778.equals(polarVoyageMaterialCardViewPhoenixGammaTitanium8856.PolarVoyageViewRogueMaster4778) && PolarVoyageJobSchedulerGammaMaster7383.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageCameraPixelBlaze2629, polarVoyageMaterialCardViewPhoenixGammaTitanium8856.PolarVoyageCameraPixelBlaze2629) && this.PolarVoyageDrawableDeltaHyperion5742 == polarVoyageMaterialCardViewPhoenixGammaTitanium8856.PolarVoyageDrawableDeltaHyperion5742;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageDrawableDeltaHyperion5742, PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageViewRogueMaster4778.hashCode() * 961, 31, this.PolarVoyageCameraPixelBlaze2629), 31);
    }

    public final String toString() {
        String str;
        long j = this.PolarVoyageCameraPixelBlaze2629;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) PolarVoyageJobSchedulerGammaMaster7383.PolarVoyageStrictModeLegendEpic1532(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.PolarVoyageDrawableDeltaHyperion5742;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.PolarVoyageViewRogueMaster4778 + ", stops=null, " + str + str2 + "tileMode=" + ((Object) PolarVoyageDebugStrikeHyper9028.PolarVoyageItemDecorationUltraDeltaEpic7485(0)) + ')';
    }
}
