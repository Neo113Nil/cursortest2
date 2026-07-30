package p000createpolar;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBundleAuroraForce2869 extends PolarVoyageInputFilterNovaEclipseAlpha5181 {
    public final long PolarVoyageCameraPixelBlaze2629;
    public final long PolarVoyageDrawableDeltaHyperion5742;
    public final List PolarVoyageViewRogueMaster4778;

    public PolarVoyageBundleAuroraForce2869(long j, long j2, List list) {
        this.PolarVoyageViewRogueMaster4778 = list;
        this.PolarVoyageCameraPixelBlaze2629 = j;
        this.PolarVoyageDrawableDeltaHyperion5742 = j2;
    }

    @Override // p000createpolar.PolarVoyageInputFilterNovaEclipseAlpha5181
    public final Shader PolarVoyageCameraViewEclipseLegendStrike8028(long j) {
        long j2 = this.PolarVoyageCameraPixelBlaze2629;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.PolarVoyageViewRogueMaster4778;
        PolarVoyageTransformNeoTitanium1654.PolarVoyageCanvasElitePhoenix4750(list);
        int PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageTransformNeoTitanium1654.PolarVoyageBottomSheetOmegaNeo1907(list);
        return new LinearGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)), PolarVoyageTransformNeoTitanium1654.PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageBottomSheetOmegaNeo1907, list), PolarVoyageTransformNeoTitanium1654.PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageBottomSheetOmegaNeo1907, list), PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageToolbarEclipseInfernoHero6368(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageBundleAuroraForce2869)) {
            return false;
        }
        PolarVoyageBundleAuroraForce2869 polarVoyageBundleAuroraForce2869 = (PolarVoyageBundleAuroraForce2869) obj;
        return this.PolarVoyageViewRogueMaster4778.equals(polarVoyageBundleAuroraForce2869.PolarVoyageViewRogueMaster4778) && PolarVoyageJobSchedulerGammaMaster7383.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageCameraPixelBlaze2629, polarVoyageBundleAuroraForce2869.PolarVoyageCameraPixelBlaze2629) && PolarVoyageJobSchedulerGammaMaster7383.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageDrawableDeltaHyperion5742, polarVoyageBundleAuroraForce2869.PolarVoyageDrawableDeltaHyperion5742);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageViewRogueMaster4778.hashCode() * 961, 31, this.PolarVoyageCameraPixelBlaze2629), 31, this.PolarVoyageDrawableDeltaHyperion5742);
    }

    public final String toString() {
        String str;
        long j = this.PolarVoyageCameraPixelBlaze2629;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) PolarVoyageJobSchedulerGammaMaster7383.PolarVoyageStrictModeLegendEpic1532(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.PolarVoyageDrawableDeltaHyperion5742;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) PolarVoyageJobSchedulerGammaMaster7383.PolarVoyageStrictModeLegendEpic1532(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.PolarVoyageViewRogueMaster4778 + ", stops=null, " + str + str2 + "tileMode=" + ((Object) PolarVoyageDebugStrikeHyper9028.PolarVoyageItemDecorationUltraDeltaEpic7485(0)) + ')';
    }
}
