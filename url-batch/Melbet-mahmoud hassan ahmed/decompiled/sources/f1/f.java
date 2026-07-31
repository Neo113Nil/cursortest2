package f1;

import o2.a0;
import r0.n2;
import w0.m;
import w0.o;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f16126a;

    /* renamed from: b, reason: collision with root package name */
    public int f16127b;

    /* renamed from: c, reason: collision with root package name */
    public long f16128c;

    /* renamed from: d, reason: collision with root package name */
    public long f16129d;

    /* renamed from: e, reason: collision with root package name */
    public long f16130e;

    /* renamed from: f, reason: collision with root package name */
    public long f16131f;

    /* renamed from: g, reason: collision with root package name */
    public int f16132g;

    /* renamed from: h, reason: collision with root package name */
    public int f16133h;

    /* renamed from: i, reason: collision with root package name */
    public int f16134i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f16135j = new int[255];

    /* renamed from: k, reason: collision with root package name */
    private final a0 f16136k = new a0(255);

    f() {
    }

    public boolean a(m mVar, boolean z6) {
        b();
        this.f16136k.K(27);
        if (!o.b(mVar, this.f16136k.d(), 0, 27, z6) || this.f16136k.E() != 1332176723) {
            return false;
        }
        int C = this.f16136k.C();
        this.f16126a = C;
        if (C != 0) {
            if (z6) {
                return false;
            }
            throw n2.d("unsupported bit stream revision");
        }
        this.f16127b = this.f16136k.C();
        this.f16128c = this.f16136k.q();
        this.f16129d = this.f16136k.s();
        this.f16130e = this.f16136k.s();
        this.f16131f = this.f16136k.s();
        int C2 = this.f16136k.C();
        this.f16132g = C2;
        this.f16133h = C2 + 27;
        this.f16136k.K(C2);
        if (!o.b(mVar, this.f16136k.d(), 0, this.f16132g, z6)) {
            return false;
        }
        for (int i7 = 0; i7 < this.f16132g; i7++) {
            this.f16135j[i7] = this.f16136k.C();
            this.f16134i += this.f16135j[i7];
        }
        return true;
    }

    public void b() {
        this.f16126a = 0;
        this.f16127b = 0;
        this.f16128c = 0L;
        this.f16129d = 0L;
        this.f16130e = 0L;
        this.f16131f = 0L;
        this.f16132g = 0;
        this.f16133h = 0;
        this.f16134i = 0;
    }

    public boolean c(m mVar) {
        return d(mVar, -1L);
    }

    public boolean d(m mVar, long j7) {
        o2.a.a(mVar.p() == mVar.m());
        this.f16136k.K(4);
        while (true) {
            if ((j7 == -1 || mVar.p() + 4 < j7) && o.b(mVar, this.f16136k.d(), 0, 4, true)) {
                this.f16136k.O(0);
                if (this.f16136k.E() == 1332176723) {
                    mVar.h();
                    return true;
                }
                mVar.i(1);
            }
        }
        do {
            if (j7 != -1 && mVar.p() >= j7) {
                break;
            }
        } while (mVar.c(1) != -1);
        return false;
    }
}
