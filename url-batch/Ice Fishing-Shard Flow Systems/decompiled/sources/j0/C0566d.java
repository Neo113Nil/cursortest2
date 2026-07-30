package j0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;

/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5940a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5941b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5942c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5943d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public C0566d(String name, boolean z7, List columns, List orders) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f5940a = name;
        this.f5941b = z7;
        this.f5942c = columns;
        this.f5943d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                orders.add("ASC");
            }
        }
        this.f5943d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0566d)) {
            return false;
        }
        C0566d c0566d = (C0566d) obj;
        boolean z7 = c0566d.f5941b;
        String str = c0566d.f5940a;
        if (this.f5941b != z7 || !Intrinsics.a(this.f5942c, c0566d.f5942c) || !Intrinsics.a(this.f5943d, c0566d.f5943d)) {
            return false;
        }
        String str2 = this.f5940a;
        return p.l(str2, "index_") ? p.l(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f5940a;
        return this.f5943d.hashCode() + ((this.f5942c.hashCode() + ((((p.l(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f5941b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f5940a + "', unique=" + this.f5941b + ", columns=" + this.f5942c + ", orders=" + this.f5943d + "'}";
    }
}
