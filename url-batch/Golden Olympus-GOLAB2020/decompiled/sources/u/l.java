package u;

import t.C3422d;
import t.C3423e;
import u.C3451f;
import u.m;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public C3451f f46355k;

    /* renamed from: l, reason: collision with root package name */
    C3452g f46356l;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46357a;

        static {
            int[] iArr = new int[m.b.values().length];
            f46357a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46357a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46357a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(C3423e c3423e) {
        super(c3423e);
        C3451f c3451f = new C3451f(this);
        this.f46355k = c3451f;
        this.f46356l = null;
        this.f46365h.f46327e = C3451f.a.TOP;
        this.f46366i.f46327e = C3451f.a.BOTTOM;
        c3451f.f46327e = C3451f.a.BASELINE;
        this.f46363f = 1;
    }

    @Override // u.m, u.InterfaceC3449d
    public void a(InterfaceC3449d interfaceC3449d) {
        float f4;
        float r4;
        float f5;
        int i4;
        int i5 = a.f46357a[this.f46367j.ordinal()];
        if (i5 == 1) {
            p(interfaceC3449d);
        } else if (i5 == 2) {
            o(interfaceC3449d);
        } else if (i5 == 3) {
            C3423e c3423e = this.f46359b;
            n(interfaceC3449d, c3423e.f46086C, c3423e.f46088E, 1);
            return;
        }
        C3452g c3452g = this.f46362e;
        if (c3452g.f46325c && !c3452g.f46332j && this.f46361d == C3423e.b.MATCH_CONSTRAINT) {
            C3423e c3423e2 = this.f46359b;
            int i6 = c3423e2.f46134m;
            if (i6 == 2) {
                C3423e E4 = c3423e2.E();
                if (E4 != null) {
                    if (E4.f46120f.f46362e.f46332j) {
                        this.f46362e.d((int) ((r7.f46329g * this.f46359b.f46148t) + 0.5f));
                    }
                }
            } else if (i6 == 3 && c3423e2.f46118e.f46362e.f46332j) {
                int s4 = c3423e2.s();
                if (s4 == -1) {
                    C3423e c3423e3 = this.f46359b;
                    f4 = c3423e3.f46118e.f46362e.f46329g;
                    r4 = c3423e3.r();
                } else if (s4 == 0) {
                    f5 = r7.f46118e.f46362e.f46329g * this.f46359b.r();
                    i4 = (int) (f5 + 0.5f);
                    this.f46362e.d(i4);
                } else if (s4 != 1) {
                    i4 = 0;
                    this.f46362e.d(i4);
                } else {
                    C3423e c3423e4 = this.f46359b;
                    f4 = c3423e4.f46118e.f46362e.f46329g;
                    r4 = c3423e4.r();
                }
                f5 = f4 / r4;
                i4 = (int) (f5 + 0.5f);
                this.f46362e.d(i4);
            }
        }
        C3451f c3451f = this.f46365h;
        if (c3451f.f46325c) {
            C3451f c3451f2 = this.f46366i;
            if (c3451f2.f46325c) {
                if (c3451f.f46332j && c3451f2.f46332j && this.f46362e.f46332j) {
                    return;
                }
                if (!this.f46362e.f46332j && this.f46361d == C3423e.b.MATCH_CONSTRAINT) {
                    C3423e c3423e5 = this.f46359b;
                    if (c3423e5.f46132l == 0 && !c3423e5.V()) {
                        C3451f c3451f3 = (C3451f) this.f46365h.f46334l.get(0);
                        C3451f c3451f4 = (C3451f) this.f46366i.f46334l.get(0);
                        int i7 = c3451f3.f46329g;
                        C3451f c3451f5 = this.f46365h;
                        int i8 = i7 + c3451f5.f46328f;
                        int i9 = c3451f4.f46329g + this.f46366i.f46328f;
                        c3451f5.d(i8);
                        this.f46366i.d(i9);
                        this.f46362e.d(i9 - i8);
                        return;
                    }
                }
                if (!this.f46362e.f46332j && this.f46361d == C3423e.b.MATCH_CONSTRAINT && this.f46358a == 1 && this.f46365h.f46334l.size() > 0 && this.f46366i.f46334l.size() > 0) {
                    C3451f c3451f6 = (C3451f) this.f46365h.f46334l.get(0);
                    int i10 = (((C3451f) this.f46366i.f46334l.get(0)).f46329g + this.f46366i.f46328f) - (c3451f6.f46329g + this.f46365h.f46328f);
                    C3452g c3452g2 = this.f46362e;
                    int i11 = c3452g2.f46344m;
                    if (i10 < i11) {
                        c3452g2.d(i10);
                    } else {
                        c3452g2.d(i11);
                    }
                }
                if (this.f46362e.f46332j && this.f46365h.f46334l.size() > 0 && this.f46366i.f46334l.size() > 0) {
                    C3451f c3451f7 = (C3451f) this.f46365h.f46334l.get(0);
                    C3451f c3451f8 = (C3451f) this.f46366i.f46334l.get(0);
                    int i12 = c3451f7.f46329g + this.f46365h.f46328f;
                    int i13 = c3451f8.f46329g + this.f46366i.f46328f;
                    float I3 = this.f46359b.I();
                    if (c3451f7 == c3451f8) {
                        i12 = c3451f7.f46329g;
                        i13 = c3451f8.f46329g;
                        I3 = 0.5f;
                    }
                    this.f46365h.d((int) (i12 + 0.5f + (((i13 - i12) - this.f46362e.f46329g) * I3)));
                    this.f46366i.d(this.f46365h.f46329g + this.f46362e.f46329g);
                }
            }
        }
    }

    @Override // u.m
    void d() {
        C3423e E4;
        C3423e E5;
        C3423e c3423e = this.f46359b;
        if (c3423e.f46110a) {
            this.f46362e.d(c3423e.t());
        }
        if (!this.f46362e.f46332j) {
            this.f46361d = this.f46359b.K();
            if (this.f46359b.Q()) {
                this.f46356l = new C3446a(this);
            }
            C3423e.b bVar = this.f46361d;
            if (bVar != C3423e.b.MATCH_CONSTRAINT) {
                if (bVar == C3423e.b.MATCH_PARENT && (E5 = this.f46359b.E()) != null && E5.K() == C3423e.b.FIXED) {
                    int t4 = (E5.t() - this.f46359b.f46086C.b()) - this.f46359b.f46088E.b();
                    b(this.f46365h, E5.f46120f.f46365h, this.f46359b.f46086C.b());
                    b(this.f46366i, E5.f46120f.f46366i, -this.f46359b.f46088E.b());
                    this.f46362e.d(t4);
                    return;
                }
                if (this.f46361d == C3423e.b.FIXED) {
                    this.f46362e.d(this.f46359b.t());
                }
            }
        } else if (this.f46361d == C3423e.b.MATCH_PARENT && (E4 = this.f46359b.E()) != null && E4.K() == C3423e.b.FIXED) {
            b(this.f46365h, E4.f46120f.f46365h, this.f46359b.f46086C.b());
            b(this.f46366i, E4.f46120f.f46366i, -this.f46359b.f46088E.b());
            return;
        }
        C3452g c3452g = this.f46362e;
        boolean z4 = c3452g.f46332j;
        if (z4) {
            C3423e c3423e2 = this.f46359b;
            if (c3423e2.f46110a) {
                C3422d[] c3422dArr = c3423e2.f46093J;
                C3422d c3422d = c3422dArr[2];
                C3422d c3422d2 = c3422d.f46068d;
                if (c3422d2 != null && c3422dArr[3].f46068d != null) {
                    if (c3423e2.V()) {
                        this.f46365h.f46328f = this.f46359b.f46093J[2].b();
                        this.f46366i.f46328f = -this.f46359b.f46093J[3].b();
                    } else {
                        C3451f h4 = h(this.f46359b.f46093J[2]);
                        if (h4 != null) {
                            b(this.f46365h, h4, this.f46359b.f46093J[2].b());
                        }
                        C3451f h5 = h(this.f46359b.f46093J[3]);
                        if (h5 != null) {
                            b(this.f46366i, h5, -this.f46359b.f46093J[3].b());
                        }
                        this.f46365h.f46324b = true;
                        this.f46366i.f46324b = true;
                    }
                    if (this.f46359b.Q()) {
                        b(this.f46355k, this.f46365h, this.f46359b.l());
                        return;
                    }
                    return;
                }
                if (c3422d2 != null) {
                    C3451f h6 = h(c3422d);
                    if (h6 != null) {
                        b(this.f46365h, h6, this.f46359b.f46093J[2].b());
                        b(this.f46366i, this.f46365h, this.f46362e.f46329g);
                        if (this.f46359b.Q()) {
                            b(this.f46355k, this.f46365h, this.f46359b.l());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C3422d c3422d3 = c3422dArr[3];
                if (c3422d3.f46068d != null) {
                    C3451f h7 = h(c3422d3);
                    if (h7 != null) {
                        b(this.f46366i, h7, -this.f46359b.f46093J[3].b());
                        b(this.f46365h, this.f46366i, -this.f46362e.f46329g);
                    }
                    if (this.f46359b.Q()) {
                        b(this.f46355k, this.f46365h, this.f46359b.l());
                        return;
                    }
                    return;
                }
                C3422d c3422d4 = c3422dArr[4];
                if (c3422d4.f46068d != null) {
                    C3451f h8 = h(c3422d4);
                    if (h8 != null) {
                        b(this.f46355k, h8, 0);
                        b(this.f46365h, this.f46355k, -this.f46359b.l());
                        b(this.f46366i, this.f46365h, this.f46362e.f46329g);
                        return;
                    }
                    return;
                }
                if ((c3423e2 instanceof t.h) || c3423e2.E() == null || this.f46359b.k(C3422d.b.CENTER).f46068d != null) {
                    return;
                }
                b(this.f46365h, this.f46359b.E().f46120f.f46365h, this.f46359b.P());
                b(this.f46366i, this.f46365h, this.f46362e.f46329g);
                if (this.f46359b.Q()) {
                    b(this.f46355k, this.f46365h, this.f46359b.l());
                    return;
                }
                return;
            }
        }
        if (z4 || this.f46361d != C3423e.b.MATCH_CONSTRAINT) {
            c3452g.b(this);
        } else {
            C3423e c3423e3 = this.f46359b;
            int i4 = c3423e3.f46134m;
            if (i4 == 2) {
                C3423e E6 = c3423e3.E();
                if (E6 != null) {
                    C3452g c3452g2 = E6.f46120f.f46362e;
                    this.f46362e.f46334l.add(c3452g2);
                    c3452g2.f46333k.add(this.f46362e);
                    C3452g c3452g3 = this.f46362e;
                    c3452g3.f46324b = true;
                    c3452g3.f46333k.add(this.f46365h);
                    this.f46362e.f46333k.add(this.f46366i);
                }
            } else if (i4 == 3 && !c3423e3.V()) {
                C3423e c3423e4 = this.f46359b;
                if (c3423e4.f46132l != 3) {
                    C3452g c3452g4 = c3423e4.f46118e.f46362e;
                    this.f46362e.f46334l.add(c3452g4);
                    c3452g4.f46333k.add(this.f46362e);
                    C3452g c3452g5 = this.f46362e;
                    c3452g5.f46324b = true;
                    c3452g5.f46333k.add(this.f46365h);
                    this.f46362e.f46333k.add(this.f46366i);
                }
            }
        }
        C3423e c3423e5 = this.f46359b;
        C3422d[] c3422dArr2 = c3423e5.f46093J;
        C3422d c3422d5 = c3422dArr2[2];
        C3422d c3422d6 = c3422d5.f46068d;
        if (c3422d6 != null && c3422dArr2[3].f46068d != null) {
            if (c3423e5.V()) {
                this.f46365h.f46328f = this.f46359b.f46093J[2].b();
                this.f46366i.f46328f = -this.f46359b.f46093J[3].b();
            } else {
                C3451f h9 = h(this.f46359b.f46093J[2]);
                C3451f h10 = h(this.f46359b.f46093J[3]);
                h9.b(this);
                h10.b(this);
                this.f46367j = m.b.CENTER;
            }
            if (this.f46359b.Q()) {
                c(this.f46355k, this.f46365h, 1, this.f46356l);
            }
        } else if (c3422d6 != null) {
            C3451f h11 = h(c3422d5);
            if (h11 != null) {
                b(this.f46365h, h11, this.f46359b.f46093J[2].b());
                c(this.f46366i, this.f46365h, 1, this.f46362e);
                if (this.f46359b.Q()) {
                    c(this.f46355k, this.f46365h, 1, this.f46356l);
                }
                C3423e.b bVar2 = this.f46361d;
                C3423e.b bVar3 = C3423e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f46359b.r() > 0.0f) {
                    j jVar = this.f46359b.f46118e;
                    if (jVar.f46361d == bVar3) {
                        jVar.f46362e.f46333k.add(this.f46362e);
                        this.f46362e.f46334l.add(this.f46359b.f46118e.f46362e);
                        this.f46362e.f46323a = this;
                    }
                }
            }
        } else {
            C3422d c3422d7 = c3422dArr2[3];
            if (c3422d7.f46068d != null) {
                C3451f h12 = h(c3422d7);
                if (h12 != null) {
                    b(this.f46366i, h12, -this.f46359b.f46093J[3].b());
                    c(this.f46365h, this.f46366i, -1, this.f46362e);
                    if (this.f46359b.Q()) {
                        c(this.f46355k, this.f46365h, 1, this.f46356l);
                    }
                }
            } else {
                C3422d c3422d8 = c3422dArr2[4];
                if (c3422d8.f46068d != null) {
                    C3451f h13 = h(c3422d8);
                    if (h13 != null) {
                        b(this.f46355k, h13, 0);
                        c(this.f46365h, this.f46355k, -1, this.f46356l);
                        c(this.f46366i, this.f46365h, 1, this.f46362e);
                    }
                } else if (!(c3423e5 instanceof t.h) && c3423e5.E() != null) {
                    b(this.f46365h, this.f46359b.E().f46120f.f46365h, this.f46359b.P());
                    c(this.f46366i, this.f46365h, 1, this.f46362e);
                    if (this.f46359b.Q()) {
                        c(this.f46355k, this.f46365h, 1, this.f46356l);
                    }
                    C3423e.b bVar4 = this.f46361d;
                    C3423e.b bVar5 = C3423e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f46359b.r() > 0.0f) {
                        j jVar2 = this.f46359b.f46118e;
                        if (jVar2.f46361d == bVar5) {
                            jVar2.f46362e.f46333k.add(this.f46362e);
                            this.f46362e.f46334l.add(this.f46359b.f46118e.f46362e);
                            this.f46362e.f46323a = this;
                        }
                    }
                }
            }
        }
        if (this.f46362e.f46334l.size() == 0) {
            this.f46362e.f46325c = true;
        }
    }

    @Override // u.m
    public void e() {
        C3451f c3451f = this.f46365h;
        if (c3451f.f46332j) {
            this.f46359b.C0(c3451f.f46329g);
        }
    }

    @Override // u.m
    void f() {
        this.f46360c = null;
        this.f46365h.c();
        this.f46366i.c();
        this.f46355k.c();
        this.f46362e.c();
        this.f46364g = false;
    }

    @Override // u.m
    boolean m() {
        return this.f46361d != C3423e.b.MATCH_CONSTRAINT || this.f46359b.f46134m == 0;
    }

    void q() {
        this.f46364g = false;
        this.f46365h.c();
        this.f46365h.f46332j = false;
        this.f46366i.c();
        this.f46366i.f46332j = false;
        this.f46355k.c();
        this.f46355k.f46332j = false;
        this.f46362e.f46332j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f46359b.p();
    }
}
