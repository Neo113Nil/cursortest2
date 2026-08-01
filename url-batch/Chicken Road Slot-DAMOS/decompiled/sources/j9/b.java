package j9;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f5117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5118b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5119c;

    public b(String str, int i3, int i10) {
        str.getClass();
        this.f5117a = i3;
        this.f5118b = i10;
        this.f5119c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5117a == bVar.f5117a && this.f5118b == bVar.f5118b && Intrinsics.a(this.f5119c, bVar.f5119c);
    }

    public final int hashCode() {
        return this.f5119c.hashCode() + v4.a.x(this.f5118b, Integer.hashCode(this.f5117a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GoldStar(id=");
        sb2.append(this.f5117a);
        sb2.append(", score=");
        sb2.append(this.f5118b);
        sb2.append(", date=");
        return v4.a.o(sb2, this.f5119c, ")");
    }
}
