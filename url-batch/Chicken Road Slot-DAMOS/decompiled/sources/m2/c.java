package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6439a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6441c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6442d;

    public c(int i3, int i10, Object obj, String str) {
        this.f6439a = obj;
        this.f6440b = i3;
        this.f6441c = i10;
        this.f6442d = str;
        if (i3 <= i10) {
            return;
        }
        r2.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f6439a, cVar.f6439a) && this.f6440b == cVar.f6440b && this.f6441c == cVar.f6441c && Intrinsics.a(this.f6442d, cVar.f6442d);
    }

    public final int hashCode() {
        Object obj = this.f6439a;
        return this.f6442d.hashCode() + v4.a.x(this.f6441c, v4.a.x(this.f6440b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f6439a);
        sb2.append(", start=");
        sb2.append(this.f6440b);
        sb2.append(", end=");
        sb2.append(this.f6441c);
        sb2.append(", tag=");
        return n0.l.h(sb2, this.f6442d, ')');
    }

    public c(int i3, int i10, Object obj) {
        this(i3, i10, obj, "");
    }
}
