package e0;

import T.C0097o;
import java.util.ArrayList;
import v2.I;

/* loaded from: classes.dex */
public final class k extends m implements d0.i {

    /* renamed from: f, reason: collision with root package name */
    public final n f8391f;

    public k(C0097o c0097o, I i4, n nVar, ArrayList arrayList) {
        super(c0097o, i4, nVar, arrayList);
        this.f8391f = nVar;
    }

    @Override // d0.i
    public final long A() {
        return this.f8391f.f8399d;
    }

    @Override // d0.i
    public final long C(long j4) {
        return this.f8391f.d(j4);
    }

    @Override // d0.i
    public final long D(long j4, long j5) {
        return this.f8391f.b(j4, j5);
    }

    @Override // d0.i
    public final long a(long j4) {
        return this.f8391f.g(j4);
    }

    @Override // e0.m
    public final String b() {
        return null;
    }

    @Override // e0.m
    public final j d() {
        return null;
    }

    @Override // d0.i
    public final long f(long j4, long j5) {
        return this.f8391f.e(j4, j5);
    }

    @Override // d0.i
    public final long g(long j4, long j5) {
        return this.f8391f.c(j4, j5);
    }

    @Override // d0.i
    public final long h(long j4, long j5) {
        n nVar = this.f8391f;
        if (nVar.f8401f != null) {
            return -9223372036854775807L;
        }
        long b4 = nVar.b(j4, j5) + nVar.c(j4, j5);
        return (nVar.e(b4, j4) + nVar.g(b4)) - nVar.f8404i;
    }

    @Override // d0.i
    public final j i(long j4) {
        return this.f8391f.h(this, j4);
    }

    @Override // d0.i
    public final long p(long j4, long j5) {
        return this.f8391f.f(j4, j5);
    }

    @Override // d0.i
    public final boolean w() {
        return this.f8391f.i();
    }

    @Override // e0.m
    public final d0.i c() {
        return this;
    }
}
