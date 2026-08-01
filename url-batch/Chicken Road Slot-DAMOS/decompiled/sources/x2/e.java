package x2;

import kotlin.collections.i0;
import z4.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: d, reason: collision with root package name */
    public final float f10319d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10320e;

    /* renamed from: i, reason: collision with root package name */
    public final y2.a f10321i;

    public e(float f3, float f10, y2.a aVar) {
        this.f10319d = f3;
        this.f10320e = f10;
        this.f10321i = aVar;
    }

    @Override // x2.c
    public final float d() {
        return this.f10320e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f10319d, eVar.f10319d) == 0 && Float.compare(this.f10320e, eVar.f10320e) == 0 && this.f10321i.equals(eVar.f10321i);
    }

    @Override // x2.c
    public final float g() {
        return this.f10319d;
    }

    public final int hashCode() {
        return this.f10321i.hashCode() + n0.l.b(this.f10320e, Float.hashCode(this.f10319d) * 31, 31);
    }

    @Override // x2.c
    public final long l(float f3) {
        return v.d(4294967296L, this.f10321i.a(f3));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f10319d + ", fontScale=" + this.f10320e + ", converter=" + this.f10321i + ')';
    }

    @Override // x2.c
    public final float w(long j) {
        if (o.a(n.b(j), 4294967296L)) {
            return this.f10321i.b(n.c(j));
        }
        i0.l("Only Sp can convert to Px");
        return 0.0f;
    }
}
