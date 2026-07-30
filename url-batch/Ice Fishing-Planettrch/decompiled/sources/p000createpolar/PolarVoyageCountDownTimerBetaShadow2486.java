package p000createpolar;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCountDownTimerBetaShadow2486 implements PolarVoyageTypefaceNebulaAurora4762, Serializable {
    public final List PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageCountDownTimerBetaShadow2486(List list) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = list;
    }

    @Override // p000createpolar.PolarVoyageTypefaceNebulaAurora4762
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i >= list.size()) {
                return true;
            }
            if (!((PolarVoyageTypefaceNebulaAurora4762) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageCountDownTimerBetaShadow2486) {
            return this.PolarVoyageItemDecorationUltraDeltaEpic7485.equals(((PolarVoyageCountDownTimerBetaShadow2486) obj).PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        return false;
    }

    public final int hashCode() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
