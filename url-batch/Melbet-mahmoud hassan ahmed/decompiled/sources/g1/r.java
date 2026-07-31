package g1;

import g1.i0;
import r0.s1;

/* loaded from: classes.dex */
public final class r implements m {

    /* renamed from: b, reason: collision with root package name */
    private w0.e0 f16524b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16525c;

    /* renamed from: e, reason: collision with root package name */
    private int f16527e;

    /* renamed from: f, reason: collision with root package name */
    private int f16528f;

    /* renamed from: a, reason: collision with root package name */
    private final o2.a0 f16523a = new o2.a0(10);

    /* renamed from: d, reason: collision with root package name */
    private long f16526d = -9223372036854775807L;

    @Override // g1.m
    public void a() {
        this.f16525c = false;
        this.f16526d = -9223372036854775807L;
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        o2.a.h(this.f16524b);
        if (this.f16525c) {
            int a7 = a0Var.a();
            int i7 = this.f16528f;
            if (i7 < 10) {
                int min = Math.min(a7, 10 - i7);
                System.arraycopy(a0Var.d(), a0Var.e(), this.f16523a.d(), this.f16528f, min);
                if (this.f16528f + min == 10) {
                    this.f16523a.O(0);
                    if (73 != this.f16523a.C() || 68 != this.f16523a.C() || 51 != this.f16523a.C()) {
                        o2.r.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f16525c = false;
                        return;
                    } else {
                        this.f16523a.P(3);
                        this.f16527e = this.f16523a.B() + 10;
                    }
                }
            }
            int min2 = Math.min(a7, this.f16527e - this.f16528f);
            this.f16524b.d(a0Var, min2);
            this.f16528f += min2;
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        w0.e0 d7 = nVar.d(dVar.c(), 5);
        this.f16524b = d7;
        d7.e(new s1.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // g1.m
    public void e() {
        int i7;
        o2.a.h(this.f16524b);
        if (this.f16525c && (i7 = this.f16527e) != 0 && this.f16528f == i7) {
            long j7 = this.f16526d;
            if (j7 != -9223372036854775807L) {
                this.f16524b.b(j7, 1, i7, 0, null);
            }
            this.f16525c = false;
        }
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f16525c = true;
        if (j7 != -9223372036854775807L) {
            this.f16526d = j7;
        }
        this.f16527e = 0;
        this.f16528f = 0;
    }
}
