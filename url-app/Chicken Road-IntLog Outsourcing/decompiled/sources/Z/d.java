package Z;

import B4.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3740a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3741b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3742c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3743d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String str, boolean z, List columns, List orders) {
        i.e(columns, "columns");
        i.e(orders, "orders");
        this.f3740a = str;
        this.f3741b = z;
        this.f3742c = columns;
        this.f3743d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                orders.add("ASC");
            }
        }
        this.f3743d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3741b != dVar.f3741b || !i.a(this.f3742c, dVar.f3742c) || !i.a(this.f3743d, dVar.f3743d)) {
            return false;
        }
        String str = this.f3740a;
        boolean O5 = r.O(str, "index_", false);
        String str2 = dVar.f3740a;
        return O5 ? r.O(str2, "index_", false) : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f3740a;
        return this.f3743d.hashCode() + ((this.f3742c.hashCode() + ((((r.O(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f3741b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f3740a + "', unique=" + this.f3741b + ", columns=" + this.f3742c + ", orders=" + this.f3743d + "'}";
    }
}
