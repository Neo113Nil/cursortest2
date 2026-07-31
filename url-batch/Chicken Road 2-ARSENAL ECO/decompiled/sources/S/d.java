package S;

import F5.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2192a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2193b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2194c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2195d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String str, boolean z5, List columns, List orders) {
        i.e(columns, "columns");
        i.e(orders, "orders");
        this.f2192a = str;
        this.f2193b = z5;
        this.f2194c = columns;
        this.f2195d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                orders.add("ASC");
            }
        }
        this.f2195d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        boolean z5 = dVar.f2193b;
        String str = dVar.f2192a;
        if (this.f2193b != z5 || !i.a(this.f2194c, dVar.f2194c) || !i.a(this.f2195d, dVar.f2195d)) {
            return false;
        }
        String str2 = this.f2192a;
        return q.I(str2, "index_") ? q.I(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f2192a;
        return this.f2195d.hashCode() + ((this.f2194c.hashCode() + ((((q.I(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f2193b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f2192a + "', unique=" + this.f2193b + ", columns=" + this.f2194c + ", orders=" + this.f2195d + "'}";
    }
}
