package w0;

import w0.e0;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f22905a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f22906b;

    /* renamed from: c, reason: collision with root package name */
    private int f22907c;

    /* renamed from: d, reason: collision with root package name */
    private long f22908d;

    /* renamed from: e, reason: collision with root package name */
    private int f22909e;

    /* renamed from: f, reason: collision with root package name */
    private int f22910f;

    /* renamed from: g, reason: collision with root package name */
    private int f22911g;

    public void a(e0 e0Var, e0.a aVar) {
        if (this.f22907c > 0) {
            e0Var.b(this.f22908d, this.f22909e, this.f22910f, this.f22911g, aVar);
            this.f22907c = 0;
        }
    }

    public void b() {
        this.f22906b = false;
        this.f22907c = 0;
    }

    public void c(e0 e0Var, long j7, int i7, int i8, int i9, e0.a aVar) {
        o2.a.g(this.f22911g <= i8 + i9, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f22906b) {
            int i10 = this.f22907c;
            int i11 = i10 + 1;
            this.f22907c = i11;
            if (i10 == 0) {
                this.f22908d = j7;
                this.f22909e = i7;
                this.f22910f = 0;
            }
            this.f22910f += i8;
            this.f22911g = i9;
            if (i11 >= 16) {
                a(e0Var, aVar);
            }
        }
    }

    public void d(m mVar) {
        if (this.f22906b) {
            return;
        }
        mVar.n(this.f22905a, 0, 10);
        mVar.h();
        if (t0.b.i(this.f22905a) == 0) {
            return;
        }
        this.f22906b = true;
    }
}
