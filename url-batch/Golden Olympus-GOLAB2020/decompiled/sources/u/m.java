package u;

import t.C3422d;
import t.C3423e;

/* loaded from: classes.dex */
public abstract class m implements InterfaceC3449d {

    /* renamed from: a, reason: collision with root package name */
    public int f46358a;

    /* renamed from: b, reason: collision with root package name */
    C3423e f46359b;

    /* renamed from: c, reason: collision with root package name */
    k f46360c;

    /* renamed from: d, reason: collision with root package name */
    protected C3423e.b f46361d;

    /* renamed from: e, reason: collision with root package name */
    C3452g f46362e = new C3452g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f46363f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f46364g = false;

    /* renamed from: h, reason: collision with root package name */
    public C3451f f46365h = new C3451f(this);

    /* renamed from: i, reason: collision with root package name */
    public C3451f f46366i = new C3451f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f46367j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46368a;

        static {
            int[] iArr = new int[C3422d.b.values().length];
            f46368a = iArr;
            try {
                iArr[C3422d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46368a[C3422d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46368a[C3422d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46368a[C3422d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46368a[C3422d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(C3423e c3423e) {
        this.f46359b = c3423e;
    }

    private void l(int i4, int i5) {
        int i6 = this.f46358a;
        if (i6 == 0) {
            this.f46362e.d(g(i5, i4));
            return;
        }
        if (i6 == 1) {
            this.f46362e.d(Math.min(g(this.f46362e.f46344m, i4), i5));
            return;
        }
        if (i6 == 2) {
            C3423e E4 = this.f46359b.E();
            if (E4 != null) {
                if ((i4 == 0 ? E4.f46118e : E4.f46120f).f46362e.f46332j) {
                    C3423e c3423e = this.f46359b;
                    this.f46362e.d(g((int) ((r9.f46329g * (i4 == 0 ? c3423e.f46142q : c3423e.f46148t)) + 0.5f), i4));
                    return;
                }
                return;
            }
            return;
        }
        if (i6 != 3) {
            return;
        }
        C3423e c3423e2 = this.f46359b;
        m mVar = c3423e2.f46118e;
        C3423e.b bVar = mVar.f46361d;
        C3423e.b bVar2 = C3423e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && mVar.f46358a == 3) {
            l lVar = c3423e2.f46120f;
            if (lVar.f46361d == bVar2 && lVar.f46358a == 3) {
                return;
            }
        }
        if (i4 == 0) {
            mVar = c3423e2.f46120f;
        }
        if (mVar.f46362e.f46332j) {
            float r4 = c3423e2.r();
            this.f46362e.d(i4 == 1 ? (int) ((mVar.f46362e.f46329g / r4) + 0.5f) : (int) ((r4 * mVar.f46362e.f46329g) + 0.5f));
        }
    }

    @Override // u.InterfaceC3449d
    public abstract void a(InterfaceC3449d interfaceC3449d);

    protected final void b(C3451f c3451f, C3451f c3451f2, int i4) {
        c3451f.f46334l.add(c3451f2);
        c3451f.f46328f = i4;
        c3451f2.f46333k.add(c3451f);
    }

    protected final void c(C3451f c3451f, C3451f c3451f2, int i4, C3452g c3452g) {
        c3451f.f46334l.add(c3451f2);
        c3451f.f46334l.add(this.f46362e);
        c3451f.f46330h = i4;
        c3451f.f46331i = c3452g;
        c3451f2.f46333k.add(c3451f);
        c3452g.f46333k.add(c3451f);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i4, int i5) {
        if (i5 == 0) {
            C3423e c3423e = this.f46359b;
            int i6 = c3423e.f46140p;
            int max = Math.max(c3423e.f46138o, i4);
            if (i6 > 0) {
                max = Math.min(i6, i4);
            }
            if (max != i4) {
                return max;
            }
        } else {
            C3423e c3423e2 = this.f46359b;
            int i7 = c3423e2.f46146s;
            int max2 = Math.max(c3423e2.f46144r, i4);
            if (i7 > 0) {
                max2 = Math.min(i7, i4);
            }
            if (max2 != i4) {
                return max2;
            }
        }
        return i4;
    }

    protected final C3451f h(C3422d c3422d) {
        C3422d c3422d2 = c3422d.f46068d;
        if (c3422d2 == null) {
            return null;
        }
        C3423e c3423e = c3422d2.f46066b;
        int i4 = a.f46368a[c3422d2.f46067c.ordinal()];
        if (i4 == 1) {
            return c3423e.f46118e.f46365h;
        }
        if (i4 == 2) {
            return c3423e.f46118e.f46366i;
        }
        if (i4 == 3) {
            return c3423e.f46120f.f46365h;
        }
        if (i4 == 4) {
            return c3423e.f46120f.f46355k;
        }
        if (i4 != 5) {
            return null;
        }
        return c3423e.f46120f.f46366i;
    }

    protected final C3451f i(C3422d c3422d, int i4) {
        C3422d c3422d2 = c3422d.f46068d;
        if (c3422d2 == null) {
            return null;
        }
        C3423e c3423e = c3422d2.f46066b;
        m mVar = i4 == 0 ? c3423e.f46118e : c3423e.f46120f;
        int i5 = a.f46368a[c3422d2.f46067c.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f46366i;
        }
        return mVar.f46365h;
    }

    public long j() {
        if (this.f46362e.f46332j) {
            return r0.f46329g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f46364g;
    }

    abstract boolean m();

    protected void n(InterfaceC3449d interfaceC3449d, C3422d c3422d, C3422d c3422d2, int i4) {
        C3451f h4 = h(c3422d);
        C3451f h5 = h(c3422d2);
        if (h4.f46332j && h5.f46332j) {
            int b4 = h4.f46329g + c3422d.b();
            int b5 = h5.f46329g - c3422d2.b();
            int i5 = b5 - b4;
            if (!this.f46362e.f46332j && this.f46361d == C3423e.b.MATCH_CONSTRAINT) {
                l(i4, i5);
            }
            C3452g c3452g = this.f46362e;
            if (c3452g.f46332j) {
                if (c3452g.f46329g == i5) {
                    this.f46365h.d(b4);
                    this.f46366i.d(b5);
                    return;
                }
                C3423e c3423e = this.f46359b;
                float u4 = i4 == 0 ? c3423e.u() : c3423e.I();
                if (h4 == h5) {
                    b4 = h4.f46329g;
                    b5 = h5.f46329g;
                    u4 = 0.5f;
                }
                this.f46365h.d((int) (b4 + 0.5f + (((b5 - b4) - this.f46362e.f46329g) * u4)));
                this.f46366i.d(this.f46365h.f46329g + this.f46362e.f46329g);
            }
        }
    }

    protected void o(InterfaceC3449d interfaceC3449d) {
    }

    protected void p(InterfaceC3449d interfaceC3449d) {
    }
}
