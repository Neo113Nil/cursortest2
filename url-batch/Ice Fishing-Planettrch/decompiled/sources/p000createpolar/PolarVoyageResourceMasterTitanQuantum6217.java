package p000createpolar;

import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageResourceMasterTitanQuantum6217 implements Comparable {
    public final long PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final long PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final long PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageResourceMasterTitanQuantum6217(long j, long j2, long j3) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = j;
        this.PolarVoyageStrictModeLegendEpic1532 = j2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.PolarVoyageItemDecorationUltraDeltaEpic7485, ((PolarVoyageResourceMasterTitanQuantum6217) obj).PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageResourceMasterTitanQuantum6217)) {
            return false;
        }
        PolarVoyageResourceMasterTitanQuantum6217 polarVoyageResourceMasterTitanQuantum6217 = (PolarVoyageResourceMasterTitanQuantum6217) obj;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 == polarVoyageResourceMasterTitanQuantum6217.PolarVoyageItemDecorationUltraDeltaEpic7485 && this.PolarVoyageStrictModeLegendEpic1532 == polarVoyageResourceMasterTitanQuantum6217.PolarVoyageStrictModeLegendEpic1532 && this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == polarVoyageResourceMasterTitanQuantum6217.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.PolarVoyageItemDecorationUltraDeltaEpic7485), Long.valueOf(this.PolarVoyageStrictModeLegendEpic1532), Long.valueOf(this.PolarVoyageRotateAnimationCyberCelestialDelta4768));
    }
}
