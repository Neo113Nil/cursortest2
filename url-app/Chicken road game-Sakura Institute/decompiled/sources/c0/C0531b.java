package c0;

import C.F;
import Z.C0311h;
import Z.C0313j;
import Z.G;
import Z.H;
import Z.I;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import b0.AbstractC0495c;
import i.AbstractC0665F;
import i.C0661B;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0533d f5725a;

    /* renamed from: e, reason: collision with root package name */
    public Outline f5729e;

    /* renamed from: i, reason: collision with root package name */
    public float f5733i;

    /* renamed from: j, reason: collision with root package name */
    public I f5734j;

    /* renamed from: k, reason: collision with root package name */
    public C0313j f5735k;

    /* renamed from: l, reason: collision with root package name */
    public C0313j f5736l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5737m;

    /* renamed from: n, reason: collision with root package name */
    public C0311h f5738n;

    /* renamed from: o, reason: collision with root package name */
    public int f5739o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5741q;

    /* renamed from: r, reason: collision with root package name */
    public long f5742r;

    /* renamed from: s, reason: collision with root package name */
    public long f5743s;

    /* renamed from: t, reason: collision with root package name */
    public long f5744t;

    /* renamed from: b, reason: collision with root package name */
    public M0.b f5726b = AbstractC0495c.f5606a;

    /* renamed from: c, reason: collision with root package name */
    public M0.k f5727c = M0.k.f3555d;

    /* renamed from: d, reason: collision with root package name */
    public M2.p f5728d = C0530a.f5722e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5730f = true;

    /* renamed from: g, reason: collision with root package name */
    public long f5731g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f5732h = 9205357640488583168L;

    /* renamed from: p, reason: collision with root package name */
    public final F f5740p = new F();

    public C0531b(InterfaceC0533d interfaceC0533d) {
        this.f5725a = interfaceC0533d;
        interfaceC0533d.N(false);
        this.f5742r = 0L;
        this.f5743s = 0L;
        this.f5744t = 9205357640488583168L;
    }

    public final void a() {
        if (this.f5730f) {
            InterfaceC0533d interfaceC0533d = this.f5725a;
            if (interfaceC0533d.u() || interfaceC0533d.F() > 0.0f) {
                C0313j c0313j = this.f5735k;
                if (c0313j != null) {
                    Outline outline = this.f5729e;
                    if (outline == null) {
                        outline = new Outline();
                        this.f5729e = outline;
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    Path path = c0313j.f4530a;
                    if (i2 > 28 || path.isConvex()) {
                        if (i2 > 30) {
                            j.f5821a.a(outline, c0313j);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f5737m = !outline.canClip();
                    } else {
                        Outline outline2 = this.f5729e;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.f5737m = true;
                    }
                    this.f5735k = c0313j;
                    outline.setAlpha(interfaceC0533d.a());
                    interfaceC0533d.o(outline);
                } else {
                    Outline outline3 = this.f5729e;
                    if (outline3 == null) {
                        outline3 = new Outline();
                        this.f5729e = outline3;
                    }
                    long U3 = u3.d.U(this.f5743s);
                    long j4 = this.f5731g;
                    long j5 = this.f5732h;
                    if (j5 != 9205357640488583168L) {
                        U3 = j5;
                    }
                    outline3.setRoundRect(Math.round(Y.c.d(j4)), Math.round(Y.c.e(j4)), Math.round(Y.f.d(U3) + Y.c.d(j4)), Math.round(Y.f.b(U3) + Y.c.e(j4)), this.f5733i);
                    outline3.setAlpha(interfaceC0533d.a());
                    interfaceC0533d.o(outline3);
                }
            } else {
                interfaceC0533d.o(null);
            }
        }
        this.f5730f = false;
    }

    public final void b() {
        if (this.f5741q && this.f5739o == 0) {
            F f4 = this.f5740p;
            C0531b c0531b = (C0531b) f4.f1052b;
            if (c0531b != null) {
                c0531b.d();
                f4.f1052b = null;
            }
            C0661B c0661b = (C0661B) f4.f1054d;
            if (c0661b != null) {
                Object[] objArr = c0661b.f6885b;
                long[] jArr = c0661b.f6884a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j4 = jArr[i2];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j4) < 128) {
                                    ((C0531b) objArr[(i2 << 3) + i5]).d();
                                }
                                j4 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                c0661b.b();
            }
            this.f5725a.r();
        }
    }

    public final I c() {
        I g4;
        I i2 = this.f5734j;
        C0313j c0313j = this.f5735k;
        if (i2 != null) {
            return i2;
        }
        if (c0313j != null) {
            Z.F f4 = new Z.F(c0313j);
            this.f5734j = f4;
            return f4;
        }
        long U3 = u3.d.U(this.f5743s);
        long j4 = this.f5731g;
        long j5 = this.f5732h;
        if (j5 != 9205357640488583168L) {
            U3 = j5;
        }
        float d4 = Y.c.d(j4);
        float e4 = Y.c.e(j4);
        float d5 = Y.f.d(U3) + d4;
        float b4 = Y.f.b(U3) + e4;
        float f5 = this.f5733i;
        if (f5 > 0.0f) {
            long I3 = u3.l.I(f5, f5);
            long I4 = u3.l.I(Y.a.b(I3), Y.a.c(I3));
            g4 = new H(new Y.e(d4, e4, d5, b4, I4, I4, I4, I4));
        } else {
            g4 = new G(new Y.d(d4, e4, d5, b4));
        }
        this.f5734j = g4;
        return g4;
    }

    public final void d() {
        this.f5739o--;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final void e() {
        F f4 = this.f5740p;
        f4.f1053c = (C0531b) f4.f1052b;
        C0661B elements = (C0661B) f4.f1054d;
        if (elements != null && elements.h()) {
            C0661B c0661b = (C0661B) f4.f1055e;
            if (c0661b == null) {
                int i2 = AbstractC0665F.f6892a;
                c0661b = new C0661B();
                f4.f1055e = c0661b;
            }
            Intrinsics.checkNotNullParameter(elements, "elements");
            c0661b.i(elements);
            elements.b();
        }
        f4.f1051a = true;
        this.f5725a.C(this.f5726b, this.f5727c, this, this.f5728d);
        f4.f1051a = false;
        C0531b c0531b = (C0531b) f4.f1053c;
        if (c0531b != null) {
            c0531b.d();
        }
        C0661B c0661b2 = (C0661B) f4.f1055e;
        if (c0661b2 == null || !c0661b2.h()) {
            return;
        }
        Object[] objArr = c0661b2.f6885b;
        long[] jArr = c0661b2.f6884a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128) {
                            ((C0531b) objArr[(i4 << 3) + i6]).d();
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        c0661b2.b();
    }

    public final void f(long j4, long j5, float f4) {
        if (Y.c.b(this.f5731g, j4) && Y.f.a(this.f5732h, j5) && this.f5733i == f4 && this.f5735k == null) {
            return;
        }
        this.f5734j = null;
        this.f5735k = null;
        this.f5730f = true;
        this.f5737m = false;
        this.f5731g = j4;
        this.f5732h = j5;
        this.f5733i = f4;
        a();
    }
}
