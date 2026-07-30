package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wq1 {
    public final List a;
    public final int b;

    public wq1(int i, List list) {
        this.a = list;
        this.b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder n = in1.n(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        n.append(new IntRange(0, list.size() - 1, 1));
        n.append("'.");
        throw new IllegalArgumentException(n.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wq1.class != obj.getClass()) {
            return false;
        }
        wq1 wq1Var = (wq1) obj;
        return this.b == wq1Var.b && Intrinsics.b(this.a, wq1Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.b + ", mergedHistory=" + this.a + ')';
    }

    public wq1() {
        this(-1, ah0.m);
    }
}
