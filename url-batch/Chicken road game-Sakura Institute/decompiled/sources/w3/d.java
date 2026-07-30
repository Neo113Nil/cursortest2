package w3;

import java.util.ArrayList;
import java.util.List;
import r6.k;
import z6.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f9511a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9512b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9513c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9514d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public d(String str, boolean z8, List list, List list2) {
        this.f9511a = str;
        this.f9512b = z8;
        this.f9513c = list;
        this.f9514d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                list2.add("ASC");
            }
        }
        this.f9514d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = dVar.f9511a;
        if (this.f9512b != dVar.f9512b || !this.f9513c.equals(dVar.f9513c) || !k.a(this.f9514d, dVar.f9514d)) {
            return false;
        }
        String str2 = this.f9511a;
        return o.v(str2, "index_") ? o.v(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f9511a;
        return this.f9514d.hashCode() + ((this.f9513c.hashCode() + ((((o.v(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f9512b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f9511a + "', unique=" + this.f9512b + ", columns=" + this.f9513c + ", orders=" + this.f9514d + "'}";
    }
}
