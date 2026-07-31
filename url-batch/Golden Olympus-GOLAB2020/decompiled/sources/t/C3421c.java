package t;

import java.util.ArrayList;
import t.C3423e;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3421c {

    /* renamed from: a, reason: collision with root package name */
    protected C3423e f46043a;

    /* renamed from: b, reason: collision with root package name */
    protected C3423e f46044b;

    /* renamed from: c, reason: collision with root package name */
    protected C3423e f46045c;

    /* renamed from: d, reason: collision with root package name */
    protected C3423e f46046d;

    /* renamed from: e, reason: collision with root package name */
    protected C3423e f46047e;

    /* renamed from: f, reason: collision with root package name */
    protected C3423e f46048f;

    /* renamed from: g, reason: collision with root package name */
    protected C3423e f46049g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f46050h;

    /* renamed from: i, reason: collision with root package name */
    protected int f46051i;

    /* renamed from: j, reason: collision with root package name */
    protected int f46052j;

    /* renamed from: k, reason: collision with root package name */
    protected float f46053k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f46054l;

    /* renamed from: m, reason: collision with root package name */
    int f46055m;

    /* renamed from: n, reason: collision with root package name */
    int f46056n;

    /* renamed from: o, reason: collision with root package name */
    boolean f46057o;

    /* renamed from: p, reason: collision with root package name */
    private int f46058p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f46059q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f46060r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f46061s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f46062t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f46063u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f46064v;

    public C3421c(C3423e c3423e, int i4, boolean z4) {
        this.f46043a = c3423e;
        this.f46058p = i4;
        this.f46059q = z4;
    }

    private void b() {
        int i4 = this.f46058p * 2;
        C3423e c3423e = this.f46043a;
        this.f46057o = true;
        C3423e c3423e2 = c3423e;
        boolean z4 = false;
        while (!z4) {
            this.f46051i++;
            C3423e[] c3423eArr = c3423e.f46147s0;
            int i5 = this.f46058p;
            C3423e c3423e3 = null;
            c3423eArr[i5] = null;
            c3423e.f46145r0[i5] = null;
            if (c3423e.M() != 8) {
                this.f46054l++;
                C3423e.b q4 = c3423e.q(this.f46058p);
                C3423e.b bVar = C3423e.b.MATCH_CONSTRAINT;
                if (q4 != bVar) {
                    this.f46055m += c3423e.y(this.f46058p);
                }
                int b4 = this.f46055m + c3423e.f46093J[i4].b();
                this.f46055m = b4;
                int i6 = i4 + 1;
                this.f46055m = b4 + c3423e.f46093J[i6].b();
                int b5 = this.f46056n + c3423e.f46093J[i4].b();
                this.f46056n = b5;
                this.f46056n = b5 + c3423e.f46093J[i6].b();
                if (this.f46044b == null) {
                    this.f46044b = c3423e;
                }
                this.f46046d = c3423e;
                C3423e.b[] bVarArr = c3423e.f46096M;
                int i7 = this.f46058p;
                if (bVarArr[i7] == bVar) {
                    int i8 = c3423e.f46136n[i7];
                    if (i8 == 0 || i8 == 3 || i8 == 2) {
                        this.f46052j++;
                        float f4 = c3423e.f46143q0[i7];
                        if (f4 > 0.0f) {
                            this.f46053k += f4;
                        }
                        if (c(c3423e, i7)) {
                            if (f4 < 0.0f) {
                                this.f46060r = true;
                            } else {
                                this.f46061s = true;
                            }
                            if (this.f46050h == null) {
                                this.f46050h = new ArrayList();
                            }
                            this.f46050h.add(c3423e);
                        }
                        if (this.f46048f == null) {
                            this.f46048f = c3423e;
                        }
                        C3423e c3423e4 = this.f46049g;
                        if (c3423e4 != null) {
                            c3423e4.f46145r0[this.f46058p] = c3423e;
                        }
                        this.f46049g = c3423e;
                    }
                    if (this.f46058p == 0) {
                        if (c3423e.f46132l != 0) {
                            this.f46057o = false;
                        } else if (c3423e.f46138o != 0 || c3423e.f46140p != 0) {
                            this.f46057o = false;
                        }
                    } else if (c3423e.f46134m != 0) {
                        this.f46057o = false;
                    } else if (c3423e.f46144r != 0 || c3423e.f46146s != 0) {
                        this.f46057o = false;
                    }
                    if (c3423e.f46100Q != 0.0f) {
                        this.f46057o = false;
                        this.f46063u = true;
                    }
                }
            }
            if (c3423e2 != c3423e) {
                c3423e2.f46147s0[this.f46058p] = c3423e;
            }
            C3422d c3422d = c3423e.f46093J[i4 + 1].f46068d;
            if (c3422d != null) {
                C3423e c3423e5 = c3422d.f46066b;
                C3422d c3422d2 = c3423e5.f46093J[i4].f46068d;
                if (c3422d2 != null && c3422d2.f46066b == c3423e) {
                    c3423e3 = c3423e5;
                }
            }
            if (c3423e3 == null) {
                c3423e3 = c3423e;
                z4 = true;
            }
            c3423e2 = c3423e;
            c3423e = c3423e3;
        }
        C3423e c3423e6 = this.f46044b;
        if (c3423e6 != null) {
            this.f46055m -= c3423e6.f46093J[i4].b();
        }
        C3423e c3423e7 = this.f46046d;
        if (c3423e7 != null) {
            this.f46055m -= c3423e7.f46093J[i4 + 1].b();
        }
        this.f46045c = c3423e;
        if (this.f46058p == 0 && this.f46059q) {
            this.f46047e = c3423e;
        } else {
            this.f46047e = this.f46043a;
        }
        this.f46062t = this.f46061s && this.f46060r;
    }

    private static boolean c(C3423e c3423e, int i4) {
        if (c3423e.M() == 8 || c3423e.f46096M[i4] != C3423e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i5 = c3423e.f46136n[i4];
        return i5 == 0 || i5 == 3;
    }

    public void a() {
        if (!this.f46064v) {
            b();
        }
        this.f46064v = true;
    }
}
