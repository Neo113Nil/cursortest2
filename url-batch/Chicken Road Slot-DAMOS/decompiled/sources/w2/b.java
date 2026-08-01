package w2;

import k1.v;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final k1.m f10024a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10025b;

    public b(k1.m mVar, float f3) {
        this.f10024a = mVar;
        this.f10025b = f3;
    }

    @Override // w2.o
    public final float a() {
        return this.f10025b;
    }

    @Override // w2.o
    public final long b() {
        int i3 = k1.p.f5341h;
        return k1.p.g;
    }

    @Override // w2.o
    public final v c() {
        return this.f10024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f10024a, bVar.f10024a) && Float.compare(this.f10025b, bVar.f10025b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10025b) + (this.f10024a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f10024a);
        sb2.append(", alpha=");
        return v4.a.l(sb2, this.f10025b, ')');
    }
}
