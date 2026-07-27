package o;

import kotlin.Unit;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class Q implements M0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M0.b f8702d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8703e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8704i;

    /* renamed from: j, reason: collision with root package name */
    public final e3.c f8705j = new e3.c(false);

    public Q(M0.b bVar) {
        this.f8702d = bVar;
    }

    @Override // M0.b
    public final long E(long j4) {
        return this.f8702d.E(j4);
    }

    @Override // M0.b
    public final long I(float f4) {
        return this.f8702d.I(f4);
    }

    @Override // M0.b
    public final long J(long j4) {
        return this.f8702d.J(j4);
    }

    @Override // M0.b
    public final float L(float f4) {
        return this.f8702d.L(f4);
    }

    @Override // M0.b
    public final float M(long j4) {
        return this.f8702d.M(j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(E2.c cVar) {
        O o4;
        int i2;
        Q q2;
        if (cVar instanceof O) {
            o4 = (O) cVar;
            int i4 = o4.f8678m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                o4.f8678m = i4 - Integer.MIN_VALUE;
                Object obj = o4.f8676k;
                D2.a aVar = D2.a.f2163d;
                i2 = o4.f8678m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    o4.f8675j = this;
                    o4.f8678m = 1;
                    if (this.f8705j.c(null, o4) == aVar) {
                        return aVar;
                    }
                    q2 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q2 = o4.f8675j;
                    AbstractC1343r.b(obj);
                }
                q2.f8703e = false;
                q2.f8704i = false;
                return Unit.f7487a;
            }
        }
        o4 = new O(this, cVar);
        Object obj2 = o4.f8676k;
        D2.a aVar2 = D2.a.f2163d;
        i2 = o4.f8678m;
        if (i2 != 0) {
        }
        q2.f8703e = false;
        q2.f8704i = false;
        return Unit.f7487a;
    }

    @Override // M0.b
    public final long a0(float f4) {
        return this.f8702d.a0(f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(E2.c cVar) {
        P p4;
        int i2;
        Q q2;
        if (cVar instanceof P) {
            p4 = (P) cVar;
            int i4 = p4.f8694m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p4.f8694m = i4 - Integer.MIN_VALUE;
                Object obj = p4.f8692k;
                D2.a aVar = D2.a.f2163d;
                i2 = p4.f8694m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    if (this.f8703e || this.f8704i) {
                        q2 = this;
                        return Boolean.valueOf(q2.f8703e);
                    }
                    p4.f8691j = this;
                    p4.f8694m = 1;
                    if (this.f8705j.c(null, p4) == aVar) {
                        return aVar;
                    }
                    q2 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q2 = p4.f8691j;
                    AbstractC1343r.b(obj);
                }
                q2.f8705j.e(null);
                return Boolean.valueOf(q2.f8703e);
            }
        }
        p4 = new P(this, cVar);
        Object obj2 = p4.f8692k;
        D2.a aVar2 = D2.a.f2163d;
        i2 = p4.f8694m;
        if (i2 != 0) {
        }
        q2.f8705j.e(null);
        return Boolean.valueOf(q2.f8703e);
    }

    @Override // M0.b
    public final float e() {
        return this.f8702d.e();
    }

    @Override // M0.b
    public final int h0(long j4) {
        return this.f8702d.h0(j4);
    }

    @Override // M0.b
    public final float i0(int i2) {
        return this.f8702d.i0(i2);
    }

    @Override // M0.b
    public final float j0(long j4) {
        return this.f8702d.j0(j4);
    }

    @Override // M0.b
    public final float k0(float f4) {
        return this.f8702d.k0(f4);
    }

    @Override // M0.b
    public final int l(float f4) {
        return this.f8702d.l(f4);
    }

    @Override // M0.b
    public final float q() {
        return this.f8702d.q();
    }
}
