package c6;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f1816a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1817b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1818c;

    public g(String str, int i3, int i10) {
        str.getClass();
        this.f1816a = str;
        this.f1817b = i3;
        this.f1818c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f1816a, gVar.f1816a) && this.f1817b == gVar.f1817b && this.f1818c == gVar.f1818c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1818c) + v4.a.x(this.f1817b, this.f1816a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f1816a);
        sb2.append(", generation=");
        sb2.append(this.f1817b);
        sb2.append(", systemId=");
        return v4.a.m(sb2, this.f1818c, ')');
    }
}
