package i0;

import java.util.ArrayList;
import java.util.List;
import r1.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3013a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3014b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3015c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public d(String str, boolean z2, List list, List list2) {
        this.f3013a = str;
        this.f3014b = z2;
        this.f3015c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3014b != dVar.f3014b || !this.f3015c.equals(dVar.f3015c) || !k1.e.a(this.d, dVar.d)) {
            return false;
        }
        String str = this.f3013a;
        boolean C2 = l.C(str, "index_", false);
        String str2 = dVar.f3013a;
        return C2 ? l.C(str2, "index_", false) : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f3013a;
        return this.d.hashCode() + ((this.f3015c.hashCode() + ((((l.C(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f3014b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f3013a + "', unique=" + this.f3014b + ", columns=" + this.f3015c + ", orders=" + this.d + "'}";
    }
}
