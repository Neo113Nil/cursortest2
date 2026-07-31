package t1;

import Z1.i;
import h2.AbstractC0454p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f7986a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7987b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7988c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7989d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public d(String str, boolean z3, List list, List list2) {
        this.f7986a = str;
        this.f7987b = z3;
        this.f7988c = list;
        this.f7989d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                list2.add("ASC");
            }
        }
        this.f7989d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f7987b != dVar.f7987b || !this.f7988c.equals(dVar.f7988c) || !i.a(this.f7989d, dVar.f7989d)) {
            return false;
        }
        String str = this.f7986a;
        boolean i02 = AbstractC0454p.i0(str, "index_");
        String str2 = dVar.f7986a;
        return i02 ? AbstractC0454p.i0(str2, "index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f7986a;
        return this.f7989d.hashCode() + ((this.f7988c.hashCode() + ((((AbstractC0454p.i0(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f7987b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f7986a + "', unique=" + this.f7987b + ", columns=" + this.f7988c + ", orders=" + this.f7989d + "'}";
    }
}
