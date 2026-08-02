package S0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f2418a;

    /* renamed from: b, reason: collision with root package name */
    public int f2419b;

    /* renamed from: c, reason: collision with root package name */
    public int f2420c;

    /* renamed from: d, reason: collision with root package name */
    public int f2421d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2422e;

    @Override // S0.e
    public int a() {
        return -1;
    }

    @Override // S0.e
    public int b() {
        return this.f2418a;
    }

    @Override // S0.e
    public int c() {
        W.u uVar = (W.u) this.f2422e;
        int i4 = this.f2419b;
        if (i4 == 8) {
            return uVar.z();
        }
        if (i4 == 16) {
            return uVar.G();
        }
        int i5 = this.f2420c;
        this.f2420c = i5 + 1;
        if (i5 % 2 != 0) {
            return this.f2421d & 15;
        }
        int z = uVar.z();
        this.f2421d = z;
        return (z & 240) >> 4;
    }

    public long d() {
        int i4 = this.f2420c;
        if (i4 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f2422e;
        int i5 = this.f2418a;
        long j4 = jArr[i5];
        this.f2418a = this.f2421d & (i5 + 1);
        this.f2420c = i4 - 1;
        return j4;
    }
}
