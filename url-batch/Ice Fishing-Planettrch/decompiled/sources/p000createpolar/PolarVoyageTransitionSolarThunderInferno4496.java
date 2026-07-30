package p000createpolar;

import java.io.Serializable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTransitionSolarThunderInferno4496 implements PolarVoyageKaptTitanBlaze4844, Serializable {
    public transient Object PolarVoyageBottomSheetOmegaNeo1907;
    public final transient Object PolarVoyageItemDecorationUltraDeltaEpic7485 = new Object();
    public volatile transient boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageKaptTitanBlaze4844 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageTransitionSolarThunderInferno4496(PolarVoyageKaptTitanBlaze4844 polarVoyageKaptTitanBlaze4844) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageKaptTitanBlaze4844;
    }

    @Override // p000createpolar.PolarVoyageKaptTitanBlaze4844
    public final Object get() {
        if (!this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            synchronized (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                try {
                    if (!this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                        Object obj = this.PolarVoyageStrictModeLegendEpic1532.get();
                        this.PolarVoyageBottomSheetOmegaNeo1907 = obj;
                        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.PolarVoyageBottomSheetOmegaNeo1907;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            obj = "<supplier that returned " + this.PolarVoyageBottomSheetOmegaNeo1907 + ">";
        } else {
            obj = this.PolarVoyageStrictModeLegendEpic1532;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
