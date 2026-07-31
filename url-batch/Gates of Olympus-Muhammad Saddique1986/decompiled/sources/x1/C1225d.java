package x1;

import f2.j;
import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0737q;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225d {

    /* renamed from: a, reason: collision with root package name */
    public final String f10312a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10313b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10314c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10315d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public C1225d(String str, boolean z3, List list, List list2) {
        j.f(list, "columns");
        j.f(list2, "orders");
        this.f10312a = str;
        this.f10313b = z3;
        this.f10314c = list;
        this.f10315d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                list2.add("ASC");
            }
        }
        this.f10315d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225d)) {
            return false;
        }
        C1225d c1225d = (C1225d) obj;
        if (this.f10313b != c1225d.f10313b || !j.a(this.f10314c, c1225d.f10314c) || !j.a(this.f10315d, c1225d.f10315d)) {
            return false;
        }
        String str = this.f10312a;
        boolean z3 = AbstractC0737q.z(str, "index_");
        String str2 = c1225d.f10312a;
        return z3 ? AbstractC0737q.z(str2, "index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f10312a;
        return this.f10315d.hashCode() + ((this.f10314c.hashCode() + ((((AbstractC0737q.z(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f10313b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f10312a + "', unique=" + this.f10313b + ", columns=" + this.f10314c + ", orders=" + this.f10315d + "'}";
    }
}
