package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kc1 {
    public final List PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public kc1(int i, List list) {
        this.PxuCJdSBwIXG = list;
        this.lS5Rgt96tfkO = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        u9.QrzZRwfaDlRX(o0.BRwzKIf41E4i(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), new br0(0, list.size() - 1, 1), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kc1.class != obj.getClass()) {
            return false;
        }
        kc1 kc1Var = (kc1) obj;
        return this.lS5Rgt96tfkO == kc1Var.lS5Rgt96tfkO && cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, kc1Var.PxuCJdSBwIXG);
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode() + (this.lS5Rgt96tfkO * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.lS5Rgt96tfkO + ", mergedHistory=" + this.PxuCJdSBwIXG + ')';
    }

    public kc1() {
        this(-1, p50.rtx2ld2ELZv4);
    }
}
