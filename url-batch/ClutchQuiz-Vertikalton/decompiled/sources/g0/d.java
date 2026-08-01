package g0;

import g1.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2553a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2554b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2555c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public d(String str, boolean z2, List list, List list2) {
        this.f2553a = str;
        this.f2554b = z2;
        this.f2555c = list;
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
        if (this.f2554b != dVar.f2554b || !this.f2555c.equals(dVar.f2555c) || !f.a(this.d, dVar.d)) {
            return false;
        }
        String str = this.f2553a;
        boolean startsWith = str.startsWith("index_");
        String str2 = dVar.f2553a;
        return startsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f2553a;
        return this.d.hashCode() + ((this.f2555c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f2554b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f2553a + "', unique=" + this.f2554b + ", columns=" + this.f2555c + ", orders=" + this.d + "'}";
    }
}
