package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMagnetometerTitanSpectraNeo4882 implements PolarVoyageKaptTitanBlaze4844 {
    public static final PolarVoyageIntentHyperTurbo2550 PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageIntentHyperTurbo2550(3);
    public final Object PolarVoyageItemDecorationUltraDeltaEpic7485 = new Object();
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public volatile PolarVoyageKaptTitanBlaze4844 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageMagnetometerTitanSpectraNeo4882(PolarVoyageKaptTitanBlaze4844 polarVoyageKaptTitanBlaze4844) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageKaptTitanBlaze4844;
    }

    @Override // p000createpolar.PolarVoyageKaptTitanBlaze4844
    public final Object get() {
        PolarVoyageKaptTitanBlaze4844 polarVoyageKaptTitanBlaze4844 = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageIntentHyperTurbo2550 polarVoyageIntentHyperTurbo2550 = PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageKaptTitanBlaze4844 != polarVoyageIntentHyperTurbo2550) {
            synchronized (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                try {
                    if (this.PolarVoyageStrictModeLegendEpic1532 != polarVoyageIntentHyperTurbo2550) {
                        Object obj = this.PolarVoyageStrictModeLegendEpic1532.get();
                        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
                        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageIntentHyperTurbo2550;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public final String toString() {
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == PolarVoyageBottomSheetOmegaNeo1907) {
            obj = "<supplier that returned " + this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
