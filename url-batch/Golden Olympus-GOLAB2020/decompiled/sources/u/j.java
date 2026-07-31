package u;

import t.C3422d;
import t.C3423e;
import u.C3451f;
import u.m;

/* loaded from: classes.dex */
public class j extends m {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f46345k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46346a;

        static {
            int[] iArr = new int[m.b.values().length];
            f46346a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46346a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46346a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(C3423e c3423e) {
        super(c3423e);
        this.f46365h.f46327e = C3451f.a.LEFT;
        this.f46366i.f46327e = C3451f.a.RIGHT;
        this.f46363f = 0;
    }

    private void q(int[] iArr, int i4, int i5, int i6, int i7, float f4, int i8) {
        int i9 = i5 - i4;
        int i10 = i7 - i6;
        if (i8 != -1) {
            if (i8 == 0) {
                iArr[0] = (int) ((i10 * f4) + 0.5f);
                iArr[1] = i10;
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iArr[0] = i9;
                iArr[1] = (int) ((i9 * f4) + 0.5f);
                return;
            }
        }
        int i11 = (int) ((i10 * f4) + 0.5f);
        int i12 = (int) ((i9 / f4) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a5, code lost:
    
        if (r7 != 1) goto L131;
     */
    @Override // u.m, u.InterfaceC3449d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(InterfaceC3449d interfaceC3449d) {
        float f4;
        float r4;
        float f5;
        int i4;
        int i5 = a.f46346a[this.f46367j.ordinal()];
        if (i5 == 1) {
            p(interfaceC3449d);
        } else if (i5 == 2) {
            o(interfaceC3449d);
        } else if (i5 == 3) {
            C3423e c3423e = this.f46359b;
            n(interfaceC3449d, c3423e.f46085B, c3423e.f46087D, 0);
            return;
        }
        if (!this.f46362e.f46332j && this.f46361d == C3423e.b.MATCH_CONSTRAINT) {
            C3423e c3423e2 = this.f46359b;
            int i6 = c3423e2.f46132l;
            if (i6 == 2) {
                C3423e E4 = c3423e2.E();
                if (E4 != null) {
                    if (E4.f46118e.f46362e.f46332j) {
                        this.f46362e.d((int) ((r1.f46329g * this.f46359b.f46142q) + 0.5f));
                    }
                }
            } else if (i6 == 3) {
                int i7 = c3423e2.f46134m;
                if (i7 == 0 || i7 == 3) {
                    l lVar = c3423e2.f46120f;
                    C3451f c3451f = lVar.f46365h;
                    C3451f c3451f2 = lVar.f46366i;
                    boolean z4 = c3423e2.f46085B.f46068d != null;
                    boolean z5 = c3423e2.f46086C.f46068d != null;
                    boolean z6 = c3423e2.f46087D.f46068d != null;
                    boolean z7 = c3423e2.f46088E.f46068d != null;
                    int s4 = c3423e2.s();
                    if (z4 && z5 && z6 && z7) {
                        float r5 = this.f46359b.r();
                        if (c3451f.f46332j && c3451f2.f46332j) {
                            C3451f c3451f3 = this.f46365h;
                            if (c3451f3.f46325c && this.f46366i.f46325c) {
                                q(f46345k, this.f46365h.f46328f + ((C3451f) c3451f3.f46334l.get(0)).f46329g, ((C3451f) this.f46366i.f46334l.get(0)).f46329g - this.f46366i.f46328f, c3451f.f46328f + c3451f.f46329g, c3451f2.f46329g - c3451f2.f46328f, r5, s4);
                                this.f46362e.d(f46345k[0]);
                                this.f46359b.f46120f.f46362e.d(f46345k[1]);
                                return;
                            }
                            return;
                        }
                        C3451f c3451f4 = this.f46365h;
                        if (c3451f4.f46332j) {
                            C3451f c3451f5 = this.f46366i;
                            if (c3451f5.f46332j) {
                                if (!c3451f.f46325c || !c3451f2.f46325c) {
                                    return;
                                }
                                q(f46345k, c3451f4.f46329g + c3451f4.f46328f, c3451f5.f46329g - c3451f5.f46328f, c3451f.f46328f + ((C3451f) c3451f.f46334l.get(0)).f46329g, ((C3451f) c3451f2.f46334l.get(0)).f46329g - c3451f2.f46328f, r5, s4);
                                this.f46362e.d(f46345k[0]);
                                this.f46359b.f46120f.f46362e.d(f46345k[1]);
                            }
                        }
                        C3451f c3451f6 = this.f46365h;
                        if (!c3451f6.f46325c || !this.f46366i.f46325c || !c3451f.f46325c || !c3451f2.f46325c) {
                            return;
                        }
                        q(f46345k, this.f46365h.f46328f + ((C3451f) c3451f6.f46334l.get(0)).f46329g, ((C3451f) this.f46366i.f46334l.get(0)).f46329g - this.f46366i.f46328f, c3451f.f46328f + ((C3451f) c3451f.f46334l.get(0)).f46329g, ((C3451f) c3451f2.f46334l.get(0)).f46329g - c3451f2.f46328f, r5, s4);
                        this.f46362e.d(f46345k[0]);
                        this.f46359b.f46120f.f46362e.d(f46345k[1]);
                    } else if (z4 && z6) {
                        if (!this.f46365h.f46325c || !this.f46366i.f46325c) {
                            return;
                        }
                        float r6 = this.f46359b.r();
                        int i8 = ((C3451f) this.f46365h.f46334l.get(0)).f46329g + this.f46365h.f46328f;
                        int i9 = ((C3451f) this.f46366i.f46334l.get(0)).f46329g - this.f46366i.f46328f;
                        if (s4 == -1 || s4 == 0) {
                            int g4 = g(i9 - i8, 0);
                            int i10 = (int) ((g4 * r6) + 0.5f);
                            int g5 = g(i10, 1);
                            if (i10 != g5) {
                                g4 = (int) ((g5 / r6) + 0.5f);
                            }
                            this.f46362e.d(g4);
                            this.f46359b.f46120f.f46362e.d(g5);
                        } else if (s4 == 1) {
                            int g6 = g(i9 - i8, 0);
                            int i11 = (int) ((g6 / r6) + 0.5f);
                            int g7 = g(i11, 1);
                            if (i11 != g7) {
                                g6 = (int) ((g7 * r6) + 0.5f);
                            }
                            this.f46362e.d(g6);
                            this.f46359b.f46120f.f46362e.d(g7);
                        }
                    } else if (z5 && z7) {
                        if (!c3451f.f46325c || !c3451f2.f46325c) {
                            return;
                        }
                        float r7 = this.f46359b.r();
                        int i12 = ((C3451f) c3451f.f46334l.get(0)).f46329g + c3451f.f46328f;
                        int i13 = ((C3451f) c3451f2.f46334l.get(0)).f46329g - c3451f2.f46328f;
                        if (s4 != -1) {
                            if (s4 == 0) {
                                int g8 = g(i13 - i12, 1);
                                int i14 = (int) ((g8 * r7) + 0.5f);
                                int g9 = g(i14, 0);
                                if (i14 != g9) {
                                    g8 = (int) ((g9 / r7) + 0.5f);
                                }
                                this.f46362e.d(g9);
                                this.f46359b.f46120f.f46362e.d(g8);
                            }
                        }
                        int g10 = g(i13 - i12, 1);
                        int i15 = (int) ((g10 / r7) + 0.5f);
                        int g11 = g(i15, 0);
                        if (i15 != g11) {
                            g10 = (int) ((g11 * r7) + 0.5f);
                        }
                        this.f46362e.d(g11);
                        this.f46359b.f46120f.f46362e.d(g10);
                    }
                } else {
                    int s5 = c3423e2.s();
                    if (s5 == -1) {
                        C3423e c3423e3 = this.f46359b;
                        f4 = c3423e3.f46120f.f46362e.f46329g;
                        r4 = c3423e3.r();
                    } else if (s5 == 0) {
                        f5 = r1.f46120f.f46362e.f46329g / this.f46359b.r();
                        i4 = (int) (f5 + 0.5f);
                        this.f46362e.d(i4);
                    } else if (s5 != 1) {
                        i4 = 0;
                        this.f46362e.d(i4);
                    } else {
                        C3423e c3423e4 = this.f46359b;
                        f4 = c3423e4.f46120f.f46362e.f46329g;
                        r4 = c3423e4.r();
                    }
                    f5 = f4 * r4;
                    i4 = (int) (f5 + 0.5f);
                    this.f46362e.d(i4);
                }
            }
        }
        C3451f c3451f7 = this.f46365h;
        if (c3451f7.f46325c) {
            C3451f c3451f8 = this.f46366i;
            if (c3451f8.f46325c) {
                if (c3451f7.f46332j && c3451f8.f46332j && this.f46362e.f46332j) {
                    return;
                }
                if (!this.f46362e.f46332j && this.f46361d == C3423e.b.MATCH_CONSTRAINT) {
                    C3423e c3423e5 = this.f46359b;
                    if (c3423e5.f46132l == 0 && !c3423e5.T()) {
                        C3451f c3451f9 = (C3451f) this.f46365h.f46334l.get(0);
                        C3451f c3451f10 = (C3451f) this.f46366i.f46334l.get(0);
                        int i16 = c3451f9.f46329g;
                        C3451f c3451f11 = this.f46365h;
                        int i17 = i16 + c3451f11.f46328f;
                        int i18 = c3451f10.f46329g + this.f46366i.f46328f;
                        c3451f11.d(i17);
                        this.f46366i.d(i18);
                        this.f46362e.d(i18 - i17);
                        return;
                    }
                }
                if (!this.f46362e.f46332j && this.f46361d == C3423e.b.MATCH_CONSTRAINT && this.f46358a == 1 && this.f46365h.f46334l.size() > 0 && this.f46366i.f46334l.size() > 0) {
                    int min = Math.min((((C3451f) this.f46366i.f46334l.get(0)).f46329g + this.f46366i.f46328f) - (((C3451f) this.f46365h.f46334l.get(0)).f46329g + this.f46365h.f46328f), this.f46362e.f46344m);
                    C3423e c3423e6 = this.f46359b;
                    int i19 = c3423e6.f46140p;
                    int max = Math.max(c3423e6.f46138o, min);
                    if (i19 > 0) {
                        max = Math.min(i19, max);
                    }
                    this.f46362e.d(max);
                }
                if (this.f46362e.f46332j) {
                    C3451f c3451f12 = (C3451f) this.f46365h.f46334l.get(0);
                    C3451f c3451f13 = (C3451f) this.f46366i.f46334l.get(0);
                    int i20 = c3451f12.f46329g + this.f46365h.f46328f;
                    int i21 = c3451f13.f46329g + this.f46366i.f46328f;
                    float u4 = this.f46359b.u();
                    if (c3451f12 == c3451f13) {
                        i20 = c3451f12.f46329g;
                        i21 = c3451f13.f46329g;
                        u4 = 0.5f;
                    }
                    this.f46365h.d((int) (i20 + 0.5f + (((i21 - i20) - this.f46362e.f46329g) * u4)));
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
            this.f46362e.d(c3423e.N());
        }
        if (this.f46362e.f46332j) {
            C3423e.b bVar = this.f46361d;
            C3423e.b bVar2 = C3423e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((E4 = this.f46359b.E()) != null && E4.w() == C3423e.b.FIXED) || E4.w() == bVar2)) {
                b(this.f46365h, E4.f46118e.f46365h, this.f46359b.f46085B.b());
                b(this.f46366i, E4.f46118e.f46366i, -this.f46359b.f46087D.b());
                return;
            }
        } else {
            C3423e.b w4 = this.f46359b.w();
            this.f46361d = w4;
            if (w4 != C3423e.b.MATCH_CONSTRAINT) {
                C3423e.b bVar3 = C3423e.b.MATCH_PARENT;
                if (w4 == bVar3 && (((E5 = this.f46359b.E()) != null && E5.w() == C3423e.b.FIXED) || E5.w() == bVar3)) {
                    int N3 = (E5.N() - this.f46359b.f46085B.b()) - this.f46359b.f46087D.b();
                    b(this.f46365h, E5.f46118e.f46365h, this.f46359b.f46085B.b());
                    b(this.f46366i, E5.f46118e.f46366i, -this.f46359b.f46087D.b());
                    this.f46362e.d(N3);
                    return;
                }
                if (this.f46361d == C3423e.b.FIXED) {
                    this.f46362e.d(this.f46359b.N());
                }
            }
        }
        C3452g c3452g = this.f46362e;
        if (c3452g.f46332j) {
            C3423e c3423e2 = this.f46359b;
            if (c3423e2.f46110a) {
                C3422d[] c3422dArr = c3423e2.f46093J;
                C3422d c3422d = c3422dArr[0];
                C3422d c3422d2 = c3422d.f46068d;
                if (c3422d2 != null && c3422dArr[1].f46068d != null) {
                    if (c3423e2.T()) {
                        this.f46365h.f46328f = this.f46359b.f46093J[0].b();
                        this.f46366i.f46328f = -this.f46359b.f46093J[1].b();
                        return;
                    }
                    C3451f h4 = h(this.f46359b.f46093J[0]);
                    if (h4 != null) {
                        b(this.f46365h, h4, this.f46359b.f46093J[0].b());
                    }
                    C3451f h5 = h(this.f46359b.f46093J[1]);
                    if (h5 != null) {
                        b(this.f46366i, h5, -this.f46359b.f46093J[1].b());
                    }
                    this.f46365h.f46324b = true;
                    this.f46366i.f46324b = true;
                    return;
                }
                if (c3422d2 != null) {
                    C3451f h6 = h(c3422d);
                    if (h6 != null) {
                        b(this.f46365h, h6, this.f46359b.f46093J[0].b());
                        b(this.f46366i, this.f46365h, this.f46362e.f46329g);
                        return;
                    }
                    return;
                }
                C3422d c3422d3 = c3422dArr[1];
                if (c3422d3.f46068d != null) {
                    C3451f h7 = h(c3422d3);
                    if (h7 != null) {
                        b(this.f46366i, h7, -this.f46359b.f46093J[1].b());
                        b(this.f46365h, this.f46366i, -this.f46362e.f46329g);
                        return;
                    }
                    return;
                }
                if ((c3423e2 instanceof t.h) || c3423e2.E() == null || this.f46359b.k(C3422d.b.CENTER).f46068d != null) {
                    return;
                }
                b(this.f46365h, this.f46359b.E().f46118e.f46365h, this.f46359b.O());
                b(this.f46366i, this.f46365h, this.f46362e.f46329g);
                return;
            }
        }
        if (this.f46361d == C3423e.b.MATCH_CONSTRAINT) {
            C3423e c3423e3 = this.f46359b;
            int i4 = c3423e3.f46132l;
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
            } else if (i4 == 3) {
                if (c3423e3.f46134m == 3) {
                    this.f46365h.f46323a = this;
                    this.f46366i.f46323a = this;
                    l lVar = c3423e3.f46120f;
                    lVar.f46365h.f46323a = this;
                    lVar.f46366i.f46323a = this;
                    c3452g.f46323a = this;
                    if (c3423e3.V()) {
                        this.f46362e.f46334l.add(this.f46359b.f46120f.f46362e);
                        this.f46359b.f46120f.f46362e.f46333k.add(this.f46362e);
                        l lVar2 = this.f46359b.f46120f;
                        lVar2.f46362e.f46323a = this;
                        this.f46362e.f46334l.add(lVar2.f46365h);
                        this.f46362e.f46334l.add(this.f46359b.f46120f.f46366i);
                        this.f46359b.f46120f.f46365h.f46333k.add(this.f46362e);
                        this.f46359b.f46120f.f46366i.f46333k.add(this.f46362e);
                    } else if (this.f46359b.T()) {
                        this.f46359b.f46120f.f46362e.f46334l.add(this.f46362e);
                        this.f46362e.f46333k.add(this.f46359b.f46120f.f46362e);
                    } else {
                        this.f46359b.f46120f.f46362e.f46334l.add(this.f46362e);
                    }
                } else {
                    C3452g c3452g4 = c3423e3.f46120f.f46362e;
                    c3452g.f46334l.add(c3452g4);
                    c3452g4.f46333k.add(this.f46362e);
                    this.f46359b.f46120f.f46365h.f46333k.add(this.f46362e);
                    this.f46359b.f46120f.f46366i.f46333k.add(this.f46362e);
                    C3452g c3452g5 = this.f46362e;
                    c3452g5.f46324b = true;
                    c3452g5.f46333k.add(this.f46365h);
                    this.f46362e.f46333k.add(this.f46366i);
                    this.f46365h.f46334l.add(this.f46362e);
                    this.f46366i.f46334l.add(this.f46362e);
                }
            }
        }
        C3423e c3423e4 = this.f46359b;
        C3422d[] c3422dArr2 = c3423e4.f46093J;
        C3422d c3422d4 = c3422dArr2[0];
        C3422d c3422d5 = c3422d4.f46068d;
        if (c3422d5 != null && c3422dArr2[1].f46068d != null) {
            if (c3423e4.T()) {
                this.f46365h.f46328f = this.f46359b.f46093J[0].b();
                this.f46366i.f46328f = -this.f46359b.f46093J[1].b();
                return;
            }
            C3451f h8 = h(this.f46359b.f46093J[0]);
            C3451f h9 = h(this.f46359b.f46093J[1]);
            h8.b(this);
            h9.b(this);
            this.f46367j = m.b.CENTER;
            return;
        }
        if (c3422d5 != null) {
            C3451f h10 = h(c3422d4);
            if (h10 != null) {
                b(this.f46365h, h10, this.f46359b.f46093J[0].b());
                c(this.f46366i, this.f46365h, 1, this.f46362e);
                return;
            }
            return;
        }
        C3422d c3422d6 = c3422dArr2[1];
        if (c3422d6.f46068d != null) {
            C3451f h11 = h(c3422d6);
            if (h11 != null) {
                b(this.f46366i, h11, -this.f46359b.f46093J[1].b());
                c(this.f46365h, this.f46366i, -1, this.f46362e);
                return;
            }
            return;
        }
        if ((c3423e4 instanceof t.h) || c3423e4.E() == null) {
            return;
        }
        b(this.f46365h, this.f46359b.E().f46118e.f46365h, this.f46359b.O());
        c(this.f46366i, this.f46365h, 1, this.f46362e);
    }

    @Override // u.m
    public void e() {
        C3451f c3451f = this.f46365h;
        if (c3451f.f46332j) {
            this.f46359b.B0(c3451f.f46329g);
        }
    }

    @Override // u.m
    void f() {
        this.f46360c = null;
        this.f46365h.c();
        this.f46366i.c();
        this.f46362e.c();
        this.f46364g = false;
    }

    @Override // u.m
    boolean m() {
        return this.f46361d != C3423e.b.MATCH_CONSTRAINT || this.f46359b.f46132l == 0;
    }

    void r() {
        this.f46364g = false;
        this.f46365h.c();
        this.f46365h.f46332j = false;
        this.f46366i.c();
        this.f46366i.f46332j = false;
        this.f46362e.f46332j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f46359b.p();
    }
}
