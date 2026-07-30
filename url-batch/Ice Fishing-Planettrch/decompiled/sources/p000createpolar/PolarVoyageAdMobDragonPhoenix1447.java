package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageAdMobDragonPhoenix1447 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageAdMobDragonPhoenix1447(int i) {
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    public static String PolarVoyageKotlinBetaPulseBeta3653(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        return (this.PolarVoyageStrictModeLegendEpic1532 & i) == i;
    }

    public void PolarVoyageZipVortexCelestial6185(int i) {
        this.PolarVoyageStrictModeLegendEpic1532 = i | this.PolarVoyageStrictModeLegendEpic1532;
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 1:
                return PolarVoyageKotlinBetaPulseBeta3653(this.PolarVoyageStrictModeLegendEpic1532);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ PolarVoyageAdMobDragonPhoenix1447() {
    }
}
