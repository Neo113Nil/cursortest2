package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMeteringPointDeltaElite5941 extends PolarVoyageConstraintLayoutThunderInfernoForce3907 {
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageMeteringPointDeltaElite5941(int i, int i2, int i3) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i3;
        this.PolarVoyageStrictModeLegendEpic1532 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
        this.PolarVoyageBottomSheetOmegaNeo1907 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // p000createpolar.PolarVoyageConstraintLayoutThunderInfernoForce3907
    public final int nextInt() {
        int i = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (i != this.PolarVoyageStrictModeLegendEpic1532) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = this.PolarVoyageItemDecorationUltraDeltaEpic7485 + i;
            return i;
        }
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = false;
            return i;
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
        return 0;
    }
}
