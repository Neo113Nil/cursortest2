package i0;

import j1.h;
import java.util.ArrayList;
import java.util.List;
import q1.m;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3152a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3153b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3154c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3155d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public C0179d(String str, boolean z2, List list, List list2) {
        this.f3152a = str;
        this.f3153b = z2;
        this.f3154c = list;
        this.f3155d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.f3155d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0179d)) {
            return false;
        }
        C0179d c0179d = (C0179d) obj;
        if (this.f3153b != c0179d.f3153b || !this.f3154c.equals(c0179d.f3154c) || !h.a(this.f3155d, c0179d.f3155d)) {
            return false;
        }
        String str = this.f3152a;
        boolean s0 = m.s0(str, "index_", false);
        String str2 = c0179d.f3152a;
        return s0 ? m.s0(str2, "index_", false) : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f3152a;
        return this.f3155d.hashCode() + ((this.f3154c.hashCode() + ((((m.s0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f3153b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f3152a + "', unique=" + this.f3153b + ", columns=" + this.f3154c + ", orders=" + this.f3155d + "'}";
    }
}
