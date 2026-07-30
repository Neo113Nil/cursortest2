package p000createpolar;

import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRoomDaoHyperAlpha4150 implements Map.Entry, Comparable {
    public final Comparable PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageObjectAnimatorLegendCosmos2129 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageRoomDaoHyperAlpha4150(PolarVoyageObjectAnimatorLegendCosmos2129 polarVoyageObjectAnimatorLegendCosmos2129, Comparable comparable, Object obj) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageObjectAnimatorLegendCosmos2129;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = comparable;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.compareTo(((PolarVoyageRoomDaoHyperAlpha4150) obj).PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.PolarVoyageStrictModeLegendEpic1532;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageMotionLayoutTransitionHeroVision4068();
        Object obj2 = this.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        return obj2;
    }

    public final String toString() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 + "=" + this.PolarVoyageStrictModeLegendEpic1532;
    }
}
