package f1;

import java.io.EOFException;
import java.io.IOException;
import o2.m0;
import w0.b0;
import w0.c0;
import w0.m;
import w0.o;

/* loaded from: classes.dex */
final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final f f16097a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16098b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16099c;

    /* renamed from: d, reason: collision with root package name */
    private final i f16100d;

    /* renamed from: e, reason: collision with root package name */
    private int f16101e;

    /* renamed from: f, reason: collision with root package name */
    private long f16102f;

    /* renamed from: g, reason: collision with root package name */
    private long f16103g;

    /* renamed from: h, reason: collision with root package name */
    private long f16104h;

    /* renamed from: i, reason: collision with root package name */
    private long f16105i;

    /* renamed from: j, reason: collision with root package name */
    private long f16106j;

    /* renamed from: k, reason: collision with root package name */
    private long f16107k;

    /* renamed from: l, reason: collision with root package name */
    private long f16108l;

    private final class b implements b0 {
        private b() {
        }

        @Override // w0.b0
        public boolean g() {
            return true;
        }

        @Override // w0.b0
        public b0.a i(long j7) {
            return new b0.a(new c0(j7, m0.r((a.this.f16098b + ((a.this.f16100d.c(j7) * (a.this.f16099c - a.this.f16098b)) / a.this.f16102f)) - 30000, a.this.f16098b, a.this.f16099c - 1)));
        }

        @Override // w0.b0
        public long j() {
            return a.this.f16100d.b(a.this.f16102f);
        }
    }

    public a(i iVar, long j7, long j8, long j9, long j10, boolean z6) {
        o2.a.a(j7 >= 0 && j8 > j7);
        this.f16100d = iVar;
        this.f16098b = j7;
        this.f16099c = j8;
        if (j9 == j8 - j7 || z6) {
            this.f16102f = j10;
            this.f16101e = 4;
        } else {
            this.f16101e = 0;
        }
        this.f16097a = new f();
    }

    private long i(m mVar) {
        if (this.f16105i == this.f16106j) {
            return -1L;
        }
        long p7 = mVar.p();
        if (!this.f16097a.d(mVar, this.f16106j)) {
            long j7 = this.f16105i;
            if (j7 != p7) {
                return j7;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f16097a.a(mVar, false);
        mVar.h();
        long j8 = this.f16104h;
        f fVar = this.f16097a;
        long j9 = fVar.f16128c;
        long j10 = j8 - j9;
        int i7 = fVar.f16133h + fVar.f16134i;
        if (0 <= j10 && j10 < 72000) {
            return -1L;
        }
        if (j10 < 0) {
            this.f16106j = p7;
            this.f16108l = j9;
        } else {
            this.f16105i = mVar.p() + i7;
            this.f16107k = this.f16097a.f16128c;
        }
        long j11 = this.f16106j;
        long j12 = this.f16105i;
        if (j11 - j12 < 100000) {
            this.f16106j = j12;
            return j12;
        }
        long p8 = mVar.p() - (i7 * (j10 <= 0 ? 2L : 1L));
        long j13 = this.f16106j;
        long j14 = this.f16105i;
        return m0.r(p8 + ((j10 * (j13 - j14)) / (this.f16108l - this.f16107k)), j14, j13 - 1);
    }

    private void k(m mVar) {
        while (true) {
            this.f16097a.c(mVar);
            this.f16097a.a(mVar, false);
            f fVar = this.f16097a;
            if (fVar.f16128c > this.f16104h) {
                mVar.h();
                return;
            } else {
                mVar.i(fVar.f16133h + fVar.f16134i);
                this.f16105i = mVar.p();
                this.f16107k = this.f16097a.f16128c;
            }
        }
    }

    @Override // f1.g
    public long b(m mVar) {
        int i7 = this.f16101e;
        if (i7 == 0) {
            long p7 = mVar.p();
            this.f16103g = p7;
            this.f16101e = 1;
            long j7 = this.f16099c - 65307;
            if (j7 > p7) {
                return j7;
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
                long i8 = i(mVar);
                if (i8 != -1) {
                    return i8;
                }
                this.f16101e = 3;
            } else if (i7 != 3) {
                if (i7 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(mVar);
            this.f16101e = 4;
            return -(this.f16107k + 2);
        }
        this.f16102f = j(mVar);
        this.f16101e = 4;
        return this.f16103g;
    }

    @Override // f1.g
    public void c(long j7) {
        this.f16104h = m0.r(j7, 0L, this.f16102f - 1);
        this.f16101e = 2;
        this.f16105i = this.f16098b;
        this.f16106j = this.f16099c;
        this.f16107k = 0L;
        this.f16108l = this.f16102f;
    }

    @Override // f1.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f16102f != 0) {
            return new b();
        }
        return null;
    }

    long j(m mVar) {
        long j7;
        f fVar;
        this.f16097a.b();
        if (!this.f16097a.c(mVar)) {
            throw new EOFException();
        }
        this.f16097a.a(mVar, false);
        f fVar2 = this.f16097a;
        mVar.i(fVar2.f16133h + fVar2.f16134i);
        do {
            j7 = this.f16097a.f16128c;
            f fVar3 = this.f16097a;
            if ((fVar3.f16127b & 4) == 4 || !fVar3.c(mVar) || mVar.p() >= this.f16099c || !this.f16097a.a(mVar, true)) {
                break;
            }
            fVar = this.f16097a;
        } while (o.e(mVar, fVar.f16133h + fVar.f16134i));
        return j7;
    }
}
