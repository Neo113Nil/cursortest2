package t0;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final E f8625a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8626b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8628d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8629e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8630f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8631g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8632h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8633i;

    /* renamed from: j, reason: collision with root package name */
    public int f8634j;

    /* renamed from: k, reason: collision with root package name */
    public int f8635k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8636l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8637m;

    /* renamed from: n, reason: collision with root package name */
    public int f8638n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8639o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8640p;

    /* renamed from: q, reason: collision with root package name */
    public int f8641q;

    /* renamed from: s, reason: collision with root package name */
    public J f8643s;

    /* renamed from: c, reason: collision with root package name */
    public int f8627c = 5;

    /* renamed from: r, reason: collision with root package name */
    public final K f8642r = new K(this);

    /* renamed from: t, reason: collision with root package name */
    public long f8644t = O2.d.b(0, 0, 15);

    /* renamed from: u, reason: collision with root package name */
    public final D f8645u = new D(2, this);

    public M(E e3) {
        this.f8625a = e3;
    }

    public final b0 a() {
        return (b0) this.f8625a.f8561y.f2913d;
    }

    public final void b(int i3) {
        int i4 = this.f8638n;
        this.f8638n = i3;
        if ((i4 == 0) != (i3 == 0)) {
            E s3 = this.f8625a.s();
            M m3 = s3 != null ? s3.f8562z : null;
            if (m3 != null) {
                if (i3 == 0) {
                    m3.b(m3.f8638n - 1);
                } else {
                    m3.b(m3.f8638n + 1);
                }
            }
        }
    }

    public final void c(int i3) {
        int i4 = this.f8641q;
        this.f8641q = i3;
        if ((i4 == 0) != (i3 == 0)) {
            E s3 = this.f8625a.s();
            M m3 = s3 != null ? s3.f8562z : null;
            if (m3 != null) {
                if (i3 == 0) {
                    m3.c(m3.f8641q - 1);
                } else {
                    m3.c(m3.f8641q + 1);
                }
            }
        }
    }

    public final void d(boolean z3) {
        if (this.f8637m != z3) {
            this.f8637m = z3;
            if (z3 && !this.f8636l) {
                b(this.f8638n + 1);
            } else {
                if (z3 || this.f8636l) {
                    return;
                }
                b(this.f8638n - 1);
            }
        }
    }

    public final void e(boolean z3) {
        if (this.f8636l != z3) {
            this.f8636l = z3;
            if (z3 && !this.f8637m) {
                b(this.f8638n + 1);
            } else {
                if (z3 || this.f8637m) {
                    return;
                }
                b(this.f8638n - 1);
            }
        }
    }

    public final void f(boolean z3) {
        if (this.f8640p != z3) {
            this.f8640p = z3;
            if (z3 && !this.f8639o) {
                c(this.f8641q + 1);
            } else {
                if (z3 || this.f8639o) {
                    return;
                }
                c(this.f8641q - 1);
            }
        }
    }

    public final void g(boolean z3) {
        if (this.f8639o != z3) {
            this.f8639o = z3;
            if (z3 && !this.f8640p) {
                c(this.f8641q + 1);
            } else {
                if (z3 || this.f8640p) {
                    return;
                }
                c(this.f8641q - 1);
            }
        }
    }

    public final void h() {
        K k3 = this.f8642r;
        Object obj = k3.f8616t;
        E e3 = this.f8625a;
        M m3 = k3.f8604I;
        if ((obj != null || m3.a().t() != null) && k3.f8615s) {
            k3.f8615s = false;
            k3.f8616t = m3.a().t();
            E s3 = e3.s();
            if (s3 != null) {
                E.T(s3, false, 7);
            }
        }
        J j3 = this.f8643s;
        if (j3 != null) {
            Object obj2 = j3.f8596y;
            M m4 = j3.f8579A;
            if (obj2 == null) {
                Q I02 = m4.a().I0();
                f2.j.c(I02);
                if (I02.f8658o.t() == null) {
                    return;
                }
            }
            if (j3.f8595x) {
                j3.f8595x = false;
                Q I03 = m4.a().I0();
                f2.j.c(I03);
                j3.f8596y = I03.f8658o.t();
                if (AbstractC0993f.p(e3)) {
                    E s4 = e3.s();
                    if (s4 != null) {
                        E.T(s4, false, 7);
                        return;
                    }
                    return;
                }
                E s5 = e3.s();
                if (s5 != null) {
                    E.R(s5, false, 7);
                }
            }
        }
    }
}
