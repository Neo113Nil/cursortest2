package t;

import s.C3404d;
import t.C3422d;
import t.C3423e;

/* loaded from: classes.dex */
public class g extends C3423e {

    /* renamed from: w0, reason: collision with root package name */
    protected float f46189w0 = -1.0f;

    /* renamed from: x0, reason: collision with root package name */
    protected int f46190x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    protected int f46191y0 = -1;

    /* renamed from: z0, reason: collision with root package name */
    private C3422d f46192z0 = this.f46086C;

    /* renamed from: A0, reason: collision with root package name */
    private int f46187A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    private int f46188B0 = 0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46193a;

        static {
            int[] iArr = new int[C3422d.b.values().length];
            f46193a = iArr;
            try {
                iArr[C3422d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46193a[C3422d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46193a[C3422d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46193a[C3422d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46193a[C3422d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46193a[C3422d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46193a[C3422d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46193a[C3422d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46193a[C3422d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.f46094K.clear();
        this.f46094K.add(this.f46192z0);
        int length = this.f46093J.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f46093J[i4] = this.f46192z0;
        }
    }

    @Override // t.C3423e
    public void F0(C3404d c3404d) {
        if (E() == null) {
            return;
        }
        int y4 = c3404d.y(this.f46192z0);
        if (this.f46187A0 == 1) {
            B0(y4);
            C0(0);
            e0(E().t());
            A0(0);
            return;
        }
        B0(0);
        C0(y4);
        A0(E().N());
        e0(0);
    }

    public int G0() {
        return this.f46187A0;
    }

    public int H0() {
        return this.f46190x0;
    }

    public int I0() {
        return this.f46191y0;
    }

    public float J0() {
        return this.f46189w0;
    }

    public void K0(int i4) {
        if (i4 > -1) {
            this.f46189w0 = -1.0f;
            this.f46190x0 = i4;
            this.f46191y0 = -1;
        }
    }

    public void L0(int i4) {
        if (i4 > -1) {
            this.f46189w0 = -1.0f;
            this.f46190x0 = -1;
            this.f46191y0 = i4;
        }
    }

    public void M0(float f4) {
        if (f4 > -1.0f) {
            this.f46189w0 = f4;
            this.f46190x0 = -1;
            this.f46191y0 = -1;
        }
    }

    public void N0(int i4) {
        if (this.f46187A0 == i4) {
            return;
        }
        this.f46187A0 = i4;
        this.f46094K.clear();
        if (this.f46187A0 == 1) {
            this.f46192z0 = this.f46085B;
        } else {
            this.f46192z0 = this.f46086C;
        }
        this.f46094K.add(this.f46192z0);
        int length = this.f46093J.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f46093J[i5] = this.f46192z0;
        }
    }

    @Override // t.C3423e
    public void f(C3404d c3404d) {
        f fVar = (f) E();
        if (fVar == null) {
            return;
        }
        C3422d k4 = fVar.k(C3422d.b.LEFT);
        C3422d k5 = fVar.k(C3422d.b.RIGHT);
        C3423e c3423e = this.f46097N;
        boolean z4 = c3423e != null && c3423e.f46096M[0] == C3423e.b.WRAP_CONTENT;
        if (this.f46187A0 == 0) {
            k4 = fVar.k(C3422d.b.TOP);
            k5 = fVar.k(C3422d.b.BOTTOM);
            C3423e c3423e2 = this.f46097N;
            z4 = c3423e2 != null && c3423e2.f46096M[1] == C3423e.b.WRAP_CONTENT;
        }
        if (this.f46190x0 != -1) {
            s.i q4 = c3404d.q(this.f46192z0);
            c3404d.e(q4, c3404d.q(k4), this.f46190x0, 8);
            if (z4) {
                c3404d.h(c3404d.q(k5), q4, 0, 5);
                return;
            }
            return;
        }
        if (this.f46191y0 == -1) {
            if (this.f46189w0 != -1.0f) {
                c3404d.d(C3404d.s(c3404d, c3404d.q(this.f46192z0), c3404d.q(k5), this.f46189w0));
                return;
            }
            return;
        }
        s.i q5 = c3404d.q(this.f46192z0);
        s.i q6 = c3404d.q(k5);
        c3404d.e(q5, q6, -this.f46191y0, 8);
        if (z4) {
            c3404d.h(q5, c3404d.q(k4), 0, 5);
            c3404d.h(q6, q5, 0, 5);
        }
    }

    @Override // t.C3423e
    public boolean g() {
        return true;
    }

    @Override // t.C3423e
    public C3422d k(C3422d.b bVar) {
        switch (a.f46193a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f46187A0 == 1) {
                    return this.f46192z0;
                }
                break;
            case 3:
            case 4:
                if (this.f46187A0 == 0) {
                    return this.f46192z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
