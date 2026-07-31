package x1;

import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 extends q6.j implements p6.a {
    public static final h0 A;
    public static final h0 B;
    public static final h0 C;
    public static final h0 D;
    public static final h0 E;
    public static final h0 F;
    public static final h0 G;
    public static final h0 H;
    public static final h0 I;

    /* renamed from: f, reason: collision with root package name */
    public static final h0 f8423f;

    /* renamed from: g, reason: collision with root package name */
    public static final h0 f8424g;

    /* renamed from: h, reason: collision with root package name */
    public static final h0 f8425h;
    public static final h0 i;

    /* renamed from: j, reason: collision with root package name */
    public static final h0 f8426j;

    /* renamed from: k, reason: collision with root package name */
    public static final h0 f8427k;

    /* renamed from: l, reason: collision with root package name */
    public static final h0 f8428l;

    /* renamed from: m, reason: collision with root package name */
    public static final h0 f8429m;

    /* renamed from: n, reason: collision with root package name */
    public static final h0 f8430n;

    /* renamed from: o, reason: collision with root package name */
    public static final h0 f8431o;

    /* renamed from: p, reason: collision with root package name */
    public static final h0 f8432p;

    /* renamed from: q, reason: collision with root package name */
    public static final h0 f8433q;

    /* renamed from: r, reason: collision with root package name */
    public static final h0 f8434r;

    /* renamed from: s, reason: collision with root package name */
    public static final h0 f8435s;

    /* renamed from: t, reason: collision with root package name */
    public static final h0 f8436t;

    /* renamed from: u, reason: collision with root package name */
    public static final h0 f8437u;

    /* renamed from: v, reason: collision with root package name */
    public static final h0 f8438v;

    /* renamed from: w, reason: collision with root package name */
    public static final h0 f8439w;

    /* renamed from: x, reason: collision with root package name */
    public static final h0 f8440x;

    /* renamed from: y, reason: collision with root package name */
    public static final h0 f8441y;

    /* renamed from: z, reason: collision with root package name */
    public static final h0 f8442z;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8443e;

    static {
        int i8 = 0;
        f8423f = new h0(i8, 0);
        f8424g = new h0(i8, 1);
        f8425h = new h0(i8, 2);
        i = new h0(i8, 3);
        f8426j = new h0(i8, 4);
        f8427k = new h0(i8, 5);
        f8428l = new h0(i8, 6);
        f8429m = new h0(i8, 7);
        f8430n = new h0(i8, 8);
        f8431o = new h0(i8, 9);
        f8432p = new h0(i8, 10);
        f8433q = new h0(i8, 11);
        f8434r = new h0(i8, 12);
        f8435s = new h0(i8, 13);
        f8436t = new h0(i8, 14);
        f8437u = new h0(i8, 15);
        f8438v = new h0(i8, 16);
        f8439w = new h0(i8, 17);
        f8440x = new h0(i8, 18);
        f8441y = new h0(i8, 19);
        f8442z = new h0(i8, 20);
        A = new h0(i8, 21);
        B = new h0(i8, 22);
        C = new h0(i8, 23);
        D = new h0(i8, 24);
        E = new h0(i8, 25);
        F = new h0(i8, 26);
        G = new h0(i8, 27);
        H = new h0(i8, 28);
        I = new h0(i8, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i8, int i9) {
        super(i8);
        this.f8443e = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p6.a
    public final Object b() {
        a7.m0 m0Var;
        g6.h e8;
        Choreographer choreographer;
        Object[] objArr = 0;
        switch (this.f8443e) {
            case 0:
                k0.b("LocalConfiguration");
                throw null;
            case 1:
                k0.b("LocalContext");
                throw null;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                k0.b("LocalImageVectorCache");
                throw null;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                k0.b("LocalResourceIdCache");
                throw null;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                k0.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    h7.e eVar = a7.d0.f249a;
                    b7.e eVar2 = f7.n.f2795a;
                    p6.e bVar = new c.b(2, 1, objArr == true ? 1 : 0);
                    Thread currentThread = Thread.currentThread();
                    g6.d dVar = g6.d.f3045d;
                    g6.e eVar3 = (g6.e) eVar2.l(dVar);
                    g6.i iVar = g6.i.f3046d;
                    if (eVar3 == null) {
                        m0Var = a7.l1.a();
                        e8 = a7.x.e(iVar, a.a.v(eVar2, m0Var), true);
                        h7.e eVar4 = a7.d0.f249a;
                        if (e8 != eVar4 && e8.l(dVar) == null) {
                            e8 = e8.c(eVar4);
                        }
                    } else {
                        if (eVar3 instanceof a7.m0) {
                        }
                        m0Var = (a7.m0) a7.l1.f274a.get();
                        e8 = a7.x.e(iVar, eVar2, true);
                        h7.e eVar5 = a7.d0.f249a;
                        if (e8 != eVar5 && e8.l(dVar) == null) {
                            e8 = e8.c(eVar5);
                        }
                    }
                    a7.c cVar = new a7.c(e8, currentThread, m0Var);
                    cVar.h0(a7.v.f303d, cVar, bVar);
                    a7.m0 m0Var2 = cVar.f246h;
                    if (m0Var2 != null) {
                        int i8 = a7.m0.i;
                        m0Var2.t(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long x7 = m0Var2 != null ? m0Var2.x() : Long.MAX_VALUE;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a7.a1.f240d;
                            if (atomicReferenceFieldUpdater.get(cVar) instanceof a7.p0) {
                                LockSupport.parkNanos(cVar, x7);
                            } else {
                                if (m0Var2 != null) {
                                    int i9 = a7.m0.i;
                                    m0Var2.m(false);
                                }
                                Object s5 = a7.x.s(atomicReferenceFieldUpdater.get(cVar));
                                a7.o oVar = s5 instanceof a7.o ? (a7.o) s5 : null;
                                if (oVar != null) {
                                    throw oVar.f286a;
                                }
                                choreographer = (Choreographer) s5;
                            }
                        } catch (Throwable th) {
                            if (m0Var2 != null) {
                                int i10 = a7.m0.i;
                                m0Var2.m(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    cVar.B(interruptedException);
                    throw interruptedException;
                }
                m0 m0Var3 = new m0(choreographer, m.a.n(Looper.getMainLooper()));
                return a.a.v(m0Var3, m0Var3.f8508o);
            case 6:
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                b1.b("LocalAutofillManager");
                throw null;
            case x.v0.f8304b /* 9 */:
                b1.b("LocalAutofillTree");
                throw null;
            case x.v0.f8306d /* 10 */:
                b1.b("LocalClipboard");
                throw null;
            case 11:
                b1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                b1.b("LocalDensity");
                throw null;
            case 14:
                b1.b("LocalFocusManager");
                throw null;
            case x.v0.f8308f /* 15 */:
                b1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                b1.b("LocalFontLoader");
                throw null;
            case 17:
                b1.b("LocalGraphicsContext");
                throw null;
            case 18:
                b1.b("LocalHapticFeedback");
                throw null;
            case 19:
                b1.b("LocalInputManager");
                throw null;
            case 20:
                b1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                b1.b("LocalTextToolbar");
                throw null;
            case 26:
                b1.b("LocalUriHandler");
                throw null;
            case 27:
                b1.b("LocalViewConfiguration");
                throw null;
            case 28:
                b1.b("LocalWindowInfo");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
