package c1;

import a3.m;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f761a;

    /* renamed from: b, reason: collision with root package name */
    public final int f762b;

    public c(List list, int i) {
        this.f761a = list;
        this.f762b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i + "', bounds = '" + new j3.c(0, list.size() - 1, 1) + "'.").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f762b == cVar.f762b && f3.d.a(this.f761a, cVar.f761a);
    }

    public final int hashCode() {
        return this.f761a.hashCode() + (this.f762b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f762b + ", mergedHistory=" + this.f761a + ')';
    }

    public c() {
        this(m.f113f, -1);
    }
}
