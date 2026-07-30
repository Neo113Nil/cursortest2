package p000createpolar;

import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageSoundPoolAuroraFusion6423 implements Iterable, PolarVoyageZipDeltaSpectraRogue6055 {
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageSoundPoolAuroraFusion6423(int i, int i2, int i3) {
        if (i3 == 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageRemoteModelManagerOlympianCelestial9141(i, i2, i3);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageSoundPoolAuroraFusion6423)) {
            return false;
        }
        if (isEmpty() && ((PolarVoyageSoundPoolAuroraFusion6423) obj).isEmpty()) {
            return true;
        }
        PolarVoyageSoundPoolAuroraFusion6423 polarVoyageSoundPoolAuroraFusion6423 = (PolarVoyageSoundPoolAuroraFusion6423) obj;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 == polarVoyageSoundPoolAuroraFusion6423.PolarVoyageItemDecorationUltraDeltaEpic7485 && this.PolarVoyageStrictModeLegendEpic1532 == polarVoyageSoundPoolAuroraFusion6423.PolarVoyageStrictModeLegendEpic1532 && this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == polarVoyageSoundPoolAuroraFusion6423.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.PolarVoyageItemDecorationUltraDeltaEpic7485 * 31) + this.PolarVoyageStrictModeLegendEpic1532) * 31) + this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public boolean isEmpty() {
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new PolarVoyageMeteringPointDeltaElite5941(this.PolarVoyageItemDecorationUltraDeltaEpic7485, this.PolarVoyageStrictModeLegendEpic1532, this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
