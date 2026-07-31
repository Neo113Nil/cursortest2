package w0;

import o2.m0;
import w0.b0;
import w0.v;

/* loaded from: classes.dex */
public final class u implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final v f22964a;

    /* renamed from: b, reason: collision with root package name */
    private final long f22965b;

    public u(v vVar, long j7) {
        this.f22964a = vVar;
        this.f22965b = j7;
    }

    private c0 a(long j7, long j8) {
        return new c0((j7 * 1000000) / this.f22964a.f22970e, this.f22965b + j8);
    }

    @Override // w0.b0
    public boolean g() {
        return true;
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        o2.a.h(this.f22964a.f22976k);
        v vVar = this.f22964a;
        v.a aVar = vVar.f22976k;
        long[] jArr = aVar.f22978a;
        long[] jArr2 = aVar.f22979b;
        int i7 = m0.i(jArr, vVar.i(j7), true, false);
        c0 a7 = a(i7 == -1 ? 0L : jArr[i7], i7 != -1 ? jArr2[i7] : 0L);
        if (a7.f22879a == j7 || i7 == jArr.length - 1) {
            return new b0.a(a7);
        }
        int i8 = i7 + 1;
        return new b0.a(a7, a(jArr[i8], jArr2[i8]));
    }

    @Override // w0.b0
    public long j() {
        return this.f22964a.f();
    }
}
