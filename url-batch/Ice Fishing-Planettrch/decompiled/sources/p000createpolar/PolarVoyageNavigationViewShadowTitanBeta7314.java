package p000createpolar;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageNavigationViewShadowTitanBeta7314 extends PolarVoyageAudioManagerTitaniumNovaAlpha1023 implements Serializable {
    public final Comparator[] PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageNavigationViewShadowTitanBeta7314(PolarVoyageInterstitialAdSpectraStrikeQuantum2259 polarVoyageInterstitialAdSpectraStrikeQuantum2259, PolarVoyageInterstitialAdSpectraStrikeQuantum2259 polarVoyageInterstitialAdSpectraStrikeQuantum22592) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new Comparator[]{polarVoyageInterstitialAdSpectraStrikeQuantum2259, polarVoyageInterstitialAdSpectraStrikeQuantum22592};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PolarVoyageNavigationViewShadowTitanBeta7314) {
            return Arrays.equals(this.PolarVoyageItemDecorationUltraDeltaEpic7485, ((PolarVoyageNavigationViewShadowTitanBeta7314) obj).PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public final String toString() {
        return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(new StringBuilder("Ordering.compound("), Arrays.toString(this.PolarVoyageItemDecorationUltraDeltaEpic7485), ")");
    }
}
