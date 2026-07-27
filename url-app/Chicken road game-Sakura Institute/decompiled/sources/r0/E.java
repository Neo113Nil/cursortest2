package r0;

import G.C0205j0;
import G.C0223t;
import G.C0227v;
import G.InterfaceC0204j;
import G.InterfaceC0229w;
import c0.C0531b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import n.AbstractC0864b;
import p0.C0941B;
import p0.InterfaceC0945F;
import q.C1002F;
import s0.AbstractC1125K;
import s0.C1166s;
import s0.P0;

/* loaded from: classes.dex */
public final class E implements InterfaceC0204j, h0, InterfaceC1070k {

    /* renamed from: M, reason: collision with root package name */
    public static final C1059A f9580M = new C1059A("Undefined intrinsics block and it is required");

    /* renamed from: N, reason: collision with root package name */
    public static final C1084z f9581N = new C1084z();

    /* renamed from: O, reason: collision with root package name */
    public static final B0.t f9582O = new B0.t(3);

    /* renamed from: A, reason: collision with root package name */
    public boolean f9583A;
    public final C0223t B;

    /* renamed from: C, reason: collision with root package name */
    public final L f9584C;

    /* renamed from: D, reason: collision with root package name */
    public C0941B f9585D;

    /* renamed from: E, reason: collision with root package name */
    public a0 f9586E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9587F;

    /* renamed from: G, reason: collision with root package name */
    public S.o f9588G;

    /* renamed from: H, reason: collision with root package name */
    public S.o f9589H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9590I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f9591J;

    /* renamed from: K, reason: collision with root package name */
    public int f9592K;

    /* renamed from: L, reason: collision with root package name */
    public int f9593L;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9594d;

    /* renamed from: e, reason: collision with root package name */
    public int f9595e;

    /* renamed from: i, reason: collision with root package name */
    public E f9596i;

    /* renamed from: j, reason: collision with root package name */
    public int f9597j;

    /* renamed from: k, reason: collision with root package name */
    public final l2.g f9598k;

    /* renamed from: l, reason: collision with root package name */
    public I.d f9599l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9600m;

    /* renamed from: n, reason: collision with root package name */
    public E f9601n;

    /* renamed from: o, reason: collision with root package name */
    public C1166s f9602o;

    /* renamed from: p, reason: collision with root package name */
    public int f9603p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9604q;

    /* renamed from: r, reason: collision with root package name */
    public y0.i f9605r;

    /* renamed from: s, reason: collision with root package name */
    public final I.d f9606s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9607t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0945F f9608u;

    /* renamed from: v, reason: collision with root package name */
    public l2.g f9609v;

    /* renamed from: w, reason: collision with root package name */
    public M0.b f9610w;

    /* renamed from: x, reason: collision with root package name */
    public M0.k f9611x;

    /* renamed from: y, reason: collision with root package name */
    public P0 f9612y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0229w f9613z;

    public E(int i2, int i4, boolean z4) {
        this(y0.k.f11579a.addAndGet(1), (i2 & 1) != 0 ? false : z4);
    }

    public static boolean L(E e4) {
        K k4 = e4.f9584C.f9691r;
        return e4.K(k4.f9662o ? new M0.a(k4.f9008j) : null);
    }

    public static void R(E e4, boolean z4, int i2) {
        E s4;
        if ((i2 & 1) != 0) {
            z4 = false;
        }
        boolean z5 = (i2 & 2) != 0;
        boolean z6 = (i2 & 4) != 0;
        if (e4.f9596i == null) {
            AbstractC0864b.D("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        C1166s c1166s = e4.f9602o;
        if (c1166s == null || e4.f9604q || e4.f9594d) {
            return;
        }
        c1166s.x(e4, true, z4, z5);
        if (z6) {
            J j4 = e4.f9584C.f9692s;
            Intrinsics.c(j4);
            L l4 = j4.f9632D;
            E s5 = l4.f9674a.s();
            int i4 = l4.f9674a.f9592K;
            if (s5 == null || i4 == 3) {
                return;
            }
            while (s5.f9592K == i4 && (s4 = s5.s()) != null) {
                s5 = s4;
            }
            int d4 = AbstractC0784j.d(i4);
            if (d4 == 0) {
                if (s5.f9596i != null) {
                    R(s5, z4, 6);
                    return;
                } else {
                    T(s5, z4, 6);
                    return;
                }
            }
            if (d4 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (s5.f9596i != null) {
                s5.Q(z4);
            } else {
                s5.S(z4);
            }
        }
    }

    public static void T(E e4, boolean z4, int i2) {
        C1166s c1166s;
        E s4;
        if ((i2 & 1) != 0) {
            z4 = false;
        }
        boolean z5 = (i2 & 2) != 0;
        boolean z6 = (i2 & 4) != 0;
        if (e4.f9604q || e4.f9594d || (c1166s = e4.f9602o) == null) {
            return;
        }
        c1166s.x(e4, false, z4, z5);
        if (z6) {
            L l4 = e4.f9584C.f9691r.f9658L;
            E s5 = l4.f9674a.s();
            int i4 = l4.f9674a.f9592K;
            if (s5 == null || i4 == 3) {
                return;
            }
            while (s5.f9592K == i4 && (s4 = s5.s()) != null) {
                s5 = s4;
            }
            int d4 = AbstractC0784j.d(i4);
            if (d4 == 0) {
                T(s5, z4, 6);
            } else {
                if (d4 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                s5.S(z4);
            }
        }
    }

    public static void U(E e4) {
        int i2 = D.f9579a[AbstractC0784j.d(e4.f9584C.f9676c)];
        L l4 = e4.f9584C;
        if (i2 != 1) {
            throw new IllegalStateException("Unexpected state ".concat(B.d(l4.f9676c)));
        }
        if (l4.f9680g) {
            R(e4, true, 6);
            return;
        }
        if (l4.f9681h) {
            e4.Q(true);
        }
        if (l4.f9677d) {
            T(e4, true, 6);
        } else if (l4.f9678e) {
            e4.S(true);
        }
    }

    public final void A() {
        if (this.f9596i != null) {
            R(this, false, 7);
        } else {
            T(this, false, 7);
        }
    }

    public final void B() {
        this.f9605r = null;
        ((C1166s) H.a(this)).z();
    }

    public final void C() {
        E e4;
        if (this.f9597j > 0) {
            this.f9600m = true;
        }
        if (!this.f9594d || (e4 = this.f9601n) == null) {
            return;
        }
        e4.C();
    }

    public final boolean D() {
        return this.f9602o != null;
    }

    public final boolean E() {
        return this.f9584C.f9691r.f9671x;
    }

    public final Boolean F() {
        J j4 = this.f9584C.f9692s;
        if (j4 != null) {
            return Boolean.valueOf(j4.f9643v);
        }
        return null;
    }

    public final void G() {
        E s4;
        if (this.f9592K == 3) {
            g();
        }
        J j4 = this.f9584C.f9692s;
        Intrinsics.c(j4);
        try {
            j4.f9633l = true;
            if (!j4.f9638q) {
                AbstractC0864b.D("replace() called on item that was not placed");
                throw null;
            }
            j4.f9631C = false;
            boolean z4 = j4.f9643v;
            j4.w0(j4.f9641t, j4.f9642u);
            if (z4 && !j4.f9631C && (s4 = j4.f9632D.f9674a.s()) != null) {
                s4.Q(false);
            }
        } finally {
            j4.f9633l = false;
        }
    }

    public final void H(int i2, int i4, int i5) {
        if (i2 == i4) {
            return;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = i2 > i4 ? i2 + i6 : i2;
            int i8 = i2 > i4 ? i4 + i6 : (i4 + i5) - 2;
            l2.g gVar = this.f9598k;
            Object n2 = ((I.d) gVar.f7976b).n(i7);
            A3.e eVar = (A3.e) gVar.f7977c;
            eVar.invoke();
            ((I.d) gVar.f7976b).a(i8, (E) n2);
            eVar.invoke();
        }
        J();
        C();
        A();
    }

    public final void I(E e4) {
        if (e4.f9584C.f9687n > 0) {
            this.f9584C.b(r0.f9687n - 1);
        }
        if (this.f9602o != null) {
            e4.i();
        }
        e4.f9601n = null;
        ((a0) e4.B.f2910d).f9764t = null;
        if (e4.f9594d) {
            this.f9597j--;
            I.d dVar = (I.d) e4.f9598k.f7976b;
            int i2 = dVar.f3332i;
            if (i2 > 0) {
                Object[] objArr = dVar.f3330d;
                int i4 = 0;
                do {
                    ((a0) ((E) objArr[i4]).B.f2910d).f9764t = null;
                    i4++;
                } while (i4 < i2);
            }
        }
        C();
        J();
    }

    public final void J() {
        if (!this.f9594d) {
            this.f9607t = true;
            return;
        }
        E s4 = s();
        if (s4 != null) {
            s4.J();
        }
    }

    public final boolean K(M0.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f9592K == 3) {
            f();
        }
        return this.f9584C.f9691r.y0(aVar.f3539a);
    }

    public final void M() {
        l2.g gVar = this.f9598k;
        int i2 = ((I.d) gVar.f7976b).f3332i;
        while (true) {
            i2--;
            I.d dVar = (I.d) gVar.f7976b;
            if (-1 >= i2) {
                dVar.g();
                ((A3.e) gVar.f7977c).invoke();
                return;
            }
            I((E) dVar.f3330d[i2]);
        }
    }

    @Override // r0.h0
    public final boolean N() {
        return D();
    }

    public final void O(int i2, int i4) {
        if (i4 < 0) {
            AbstractC0864b.C("count (" + i4 + ") must be greater than 0");
            throw null;
        }
        int i5 = (i4 + i2) - 1;
        if (i2 > i5) {
            return;
        }
        while (true) {
            l2.g gVar = this.f9598k;
            I((E) ((I.d) gVar.f7976b).f3330d[i5]);
            Object n2 = ((I.d) gVar.f7976b).n(i5);
            ((A3.e) gVar.f7977c).invoke();
            if (i5 == i2) {
                return;
            } else {
                i5--;
            }
        }
    }

    public final void P() {
        E s4;
        if (this.f9592K == 3) {
            g();
        }
        K k4 = this.f9584C.f9691r;
        k4.getClass();
        try {
            k4.f9659l = true;
            if (!k4.f9663p) {
                AbstractC0864b.D("replace called on unplaced item");
                throw null;
            }
            boolean z4 = k4.f9671x;
            k4.x0(k4.f9666s, k4.f9668u, k4.f9667t);
            if (z4 && !k4.f9652F && (s4 = k4.f9658L.f9674a.s()) != null) {
                s4.S(false);
            }
        } finally {
            k4.f9659l = false;
        }
    }

    public final void Q(boolean z4) {
        C1166s c1166s;
        if (this.f9594d || (c1166s = this.f9602o) == null) {
            return;
        }
        c1166s.y(this, true, z4);
    }

    public final void S(boolean z4) {
        C1166s c1166s;
        if (this.f9594d || (c1166s = this.f9602o) == null) {
            return;
        }
        c1166s.y(this, false, z4);
    }

    public final void V() {
        I.d v4 = v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                int i5 = e4.f9593L;
                e4.f9592K = i5;
                if (i5 != 3) {
                    e4.V();
                }
                i4++;
            } while (i4 < i2);
        }
    }

    public final void W(M0.b bVar) {
        if (Intrinsics.a(this.f9610w, bVar)) {
            return;
        }
        this.f9610w = bVar;
        A();
        E s4 = s();
        if (s4 != null) {
            s4.y();
        }
        z();
        for (S.n nVar = (S.n) this.B.f2912f; nVar != null; nVar = nVar.f3983l) {
            if ((nVar.f3980i & 16) != 0) {
                ((l0) nVar).m();
            } else if (nVar instanceof W.b) {
                ((W.b) nVar).B0();
            }
        }
    }

    public final void X(E e4) {
        if (Intrinsics.a(e4, this.f9596i)) {
            return;
        }
        this.f9596i = e4;
        if (e4 != null) {
            L l4 = this.f9584C;
            if (l4.f9692s == null) {
                l4.f9692s = new J(l4);
            }
            C0223t c0223t = this.B;
            a0 a0Var = ((C1078t) c0223t.f2909c).f9763s;
            for (a0 a0Var2 = (a0) c0223t.f2910d; !Intrinsics.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.f9763s) {
                a0Var2.J0();
            }
        }
        A();
    }

    public final void Y(InterfaceC0945F interfaceC0945F) {
        if (Intrinsics.a(this.f9608u, interfaceC0945F)) {
            return;
        }
        this.f9608u = interfaceC0945F;
        l2.g gVar = this.f9609v;
        if (gVar != null) {
            ((C0205j0) gVar.f7977c).setValue(interfaceC0945F);
        }
        A();
    }

    public final void Z(S.o oVar) {
        if (!(!this.f9594d || this.f9588G == S.l.f3977a)) {
            AbstractC0864b.C("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.f9591J) {
            AbstractC0864b.C("modifier is updated when deactivated");
            throw null;
        }
        if (D()) {
            d(oVar);
        } else {
            this.f9589H = oVar;
        }
    }

    @Override // G.InterfaceC0204j
    public final void a() {
        C0941B c0941b = this.f9585D;
        if (c0941b != null) {
            c0941b.f(true);
        }
        this.f9591J = true;
        C0223t c0223t = this.B;
        for (S.n nVar = (o0) c0223t.f2911e; nVar != null; nVar = nVar.f3982k) {
            if (nVar.f3990s) {
                nVar.w0();
            }
        }
        S.n nVar2 = (o0) c0223t.f2911e;
        for (S.n nVar3 = nVar2; nVar3 != null; nVar3 = nVar3.f3982k) {
            if (nVar3.f3990s) {
                nVar3.y0();
            }
        }
        while (nVar2 != null) {
            if (nVar2.f3990s) {
                nVar2.s0();
            }
            nVar2 = nVar2.f3982k;
        }
        if (D()) {
            B();
        }
    }

    public final void a0() {
        if (this.f9597j <= 0 || !this.f9600m) {
            return;
        }
        int i2 = 0;
        this.f9600m = false;
        I.d dVar = this.f9599l;
        if (dVar == null) {
            dVar = new I.d(new E[16]);
            this.f9599l = dVar;
        }
        dVar.g();
        I.d dVar2 = (I.d) this.f9598k.f7976b;
        int i4 = dVar2.f3332i;
        if (i4 > 0) {
            Object[] objArr = dVar2.f3330d;
            do {
                E e4 = (E) objArr[i2];
                if (e4.f9594d) {
                    dVar.c(dVar.f3332i, e4.v());
                } else {
                    dVar.b(e4);
                }
                i2++;
            } while (i2 < i4);
        }
        L l4 = this.f9584C;
        l4.f9691r.B = true;
        J j4 = l4.f9692s;
        if (j4 != null) {
            j4.f9646y = true;
        }
    }

    @Override // G.InterfaceC0204j
    public final void b() {
        if (!D()) {
            AbstractC0864b.C("onReuse is only expected on attached node");
            throw null;
        }
        C0941B c0941b = this.f9585D;
        if (c0941b != null) {
            c0941b.f(false);
        }
        boolean z4 = this.f9591J;
        C0223t c0223t = this.B;
        if (z4) {
            this.f9591J = false;
            B();
        } else {
            for (S.n nVar = (o0) c0223t.f2911e; nVar != null; nVar = nVar.f3982k) {
                if (nVar.f3990s) {
                    nVar.w0();
                }
            }
            S.n nVar2 = (o0) c0223t.f2911e;
            for (S.n nVar3 = nVar2; nVar3 != null; nVar3 = nVar3.f3982k) {
                if (nVar3.f3990s) {
                    nVar3.y0();
                }
            }
            while (nVar2 != null) {
                if (nVar2.f3990s) {
                    nVar2.s0();
                }
                nVar2 = nVar2.f3982k;
            }
        }
        this.f9595e = y0.k.f11579a.addAndGet(1);
        for (S.n nVar4 = (S.n) c0223t.f2912f; nVar4 != null; nVar4 = nVar4.f3983l) {
            nVar4.r0();
        }
        c0223t.i();
        U(this);
    }

    @Override // G.InterfaceC0204j
    public final void c() {
        C0941B c0941b = this.f9585D;
        if (c0941b != null) {
            c0941b.c();
        }
        C0223t c0223t = this.B;
        a0 a0Var = ((C1078t) c0223t.f2909c).f9763s;
        for (a0 a0Var2 = (a0) c0223t.f2910d; !Intrinsics.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.f9763s) {
            a0Var2.f9765u = true;
            a0Var2.f9759H.invoke();
            if (a0Var2.f9761J != null) {
                a0Var2.j1(null, false);
                a0Var2.f9762r.S(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00be, code lost:
    
        if (r3 >= r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        if (r8 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        if (r4 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
    
        if (r5.f9589H == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c9, code lost:
    
        r6.j(r3, r8, r9, r4, r0 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
    
        n.AbstractC0864b.E("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        n.AbstractC0864b.E("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX WARN: Type inference failed for: r1v14, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [G.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(S.o oVar) {
        W w4;
        ?? r12;
        this.f9588G = oVar;
        ?? r6 = this.B;
        S.n nVar = (S.n) r6.f2912f;
        S.n nVar2 = X.f9731a;
        if (nVar == nVar2) {
            AbstractC0864b.D("padChain called on already padded chain");
            throw null;
        }
        nVar.f3982k = nVar2;
        nVar2.f3983l = nVar;
        I.d dVar = (I.d) r6.f2913g;
        int i2 = dVar != null ? dVar.f3332i : 0;
        I.d dVar2 = (I.d) r6.f2914h;
        if (dVar2 == null) {
            dVar2 = new I.d(new S.m[16]);
        }
        I.d dVar3 = dVar2;
        int i4 = dVar3.f3332i;
        if (i4 < 16) {
            i4 = 16;
        }
        I.d dVar4 = new I.d(new S.o[i4]);
        dVar4.b(oVar);
        C1002F c1002f = null;
        while (dVar4.l()) {
            S.o oVar2 = (S.o) dVar4.n(dVar4.f3332i - 1);
            if (oVar2 instanceof S.i) {
                S.i iVar = (S.i) oVar2;
                dVar4.b(iVar.f3974b);
                dVar4.b(iVar.f3973a);
            } else if (oVar2 instanceof S.m) {
                dVar3.b(oVar2);
            } else {
                if (c1002f == null) {
                    c1002f = new C1002F(1, dVar3);
                }
                oVar2.g(c1002f);
                c1002f = c1002f;
            }
        }
        int i5 = dVar3.f3332i;
        o0 o0Var = (o0) r6.f2911e;
        E e4 = (E) r6.f2908b;
        if (i5 == i2) {
            S.n nVar3 = nVar2.f3983l;
            int i6 = 0;
            while (true) {
                if (nVar3 == null || i6 >= i2) {
                    break;
                }
                if (dVar == null) {
                    AbstractC0864b.E("expected prior modifier list to be non-empty");
                    throw null;
                }
                S.m mVar = (S.m) dVar.f3330d[i6];
                S.m mVar2 = (S.m) dVar3.f3330d[i6];
                char c4 = Intrinsics.a(mVar, mVar2) ? (char) 2 : S.a.a(mVar, mVar2) ? (char) 1 : (char) 0;
                if (c4 == 0) {
                    nVar3 = nVar3.f3982k;
                    break;
                }
                if (c4 == 1) {
                    C0223t.l(mVar, mVar2, nVar3);
                }
                nVar3 = nVar3.f3983l;
                i6++;
            }
        } else {
            S.o oVar3 = e4.f9589H;
            if (oVar3 != null && i2 == 0) {
                for (int i7 = 0; i7 < dVar3.f3332i; i7++) {
                    nVar2 = C0223t.b((S.m) dVar3.f3330d[i7], nVar2);
                }
                for (S.n nVar4 = o0Var.f3982k; nVar4 != null && nVar4 != X.f9731a; nVar4 = nVar4.f3982k) {
                    r0 |= nVar4.f3980i;
                    nVar4.f3981j = r0;
                }
            } else {
                if (i5 == 0) {
                    if (dVar == null) {
                        AbstractC0864b.E("expected prior modifier list to be non-empty");
                        throw null;
                    }
                    S.n nVar5 = nVar2.f3983l;
                    for (int i8 = 0; nVar5 != null && i8 < dVar.f3332i; i8++) {
                        nVar5 = C0223t.c(nVar5).f3983l;
                    }
                    E s4 = e4.s();
                    C1078t c1078t = s4 != null ? (C1078t) s4.B.f2909c : null;
                    C1078t c1078t2 = (C1078t) r6.f2909c;
                    c1078t2.f9764t = c1078t;
                    r6.f2910d = c1078t2;
                    r6.f2913g = dVar3;
                    if (dVar == null) {
                        dVar.g();
                    } else {
                        dVar = null;
                    }
                    r6.f2914h = dVar;
                    w4 = X.f9731a;
                    r12 = w4.f3983l;
                    if (r12 != 0) {
                        o0Var = r12;
                    }
                    o0Var.f3982k = null;
                    w4.f3983l = null;
                    w4.f3981j = -1;
                    w4.f3985n = null;
                    if (o0Var != w4) {
                        AbstractC0864b.D("trimChain did not update the head");
                        throw null;
                    }
                    r6.f2912f = o0Var;
                    if (r0 != 0) {
                        r6.k();
                    }
                    this.f9584C.h();
                    if (this.f9596i == null && r6.f(512)) {
                        X(this);
                        return;
                    }
                    return;
                }
                if (dVar == null) {
                    dVar = new I.d(new S.m[16]);
                }
                r6.j(0, dVar, dVar3, nVar2, (oVar3 != null ? 1 : 0) ^ 1);
            }
            r0 = 1;
            r6.f2913g = dVar3;
            if (dVar == null) {
            }
            r6.f2914h = dVar;
            w4 = X.f9731a;
            r12 = w4.f3983l;
            if (r12 != 0) {
            }
            o0Var.f3982k = null;
            w4.f3983l = null;
            w4.f3981j = -1;
            w4.f3985n = null;
            if (o0Var != w4) {
            }
        }
    }

    public final void e(C1166s c1166s) {
        E e4;
        if (!(this.f9602o == null)) {
            AbstractC0864b.D("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
            throw null;
        }
        E e5 = this.f9601n;
        if (e5 != null && !Intrinsics.a(e5.f9602o, c1166s)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(c1166s);
            sb.append(") than the parent's owner(");
            E s4 = s();
            sb.append(s4 != null ? s4.f9602o : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            E e6 = this.f9601n;
            sb.append(e6 != null ? e6.h(0) : null);
            AbstractC0864b.D(sb.toString());
            throw null;
        }
        E s5 = s();
        L l4 = this.f9584C;
        if (s5 == null) {
            l4.f9691r.f9671x = true;
            J j4 = l4.f9692s;
            if (j4 != null) {
                j4.f9643v = true;
            }
        }
        C0223t c0223t = this.B;
        ((a0) c0223t.f2910d).f9764t = s5 != null ? (C1078t) s5.B.f2909c : null;
        this.f9602o = c1166s;
        this.f9603p = (s5 != null ? s5.f9603p : -1) + 1;
        S.o oVar = this.f9589H;
        if (oVar != null) {
            d(oVar);
        }
        this.f9589H = null;
        if (c0223t.f(8)) {
            B();
        }
        c1166s.getClass();
        E e7 = this.f9601n;
        if (e7 == null || (e4 = e7.f9596i) == null) {
            e4 = this.f9596i;
        }
        X(e4);
        if (this.f9596i == null && c0223t.f(512)) {
            X(this);
        }
        if (!this.f9591J) {
            for (S.n nVar = (S.n) c0223t.f2912f; nVar != null; nVar = nVar.f3983l) {
                nVar.r0();
            }
        }
        I.d dVar = (I.d) this.f9598k.f7976b;
        int i2 = dVar.f3332i;
        if (i2 > 0) {
            Object[] objArr = dVar.f3330d;
            int i4 = 0;
            do {
                ((E) objArr[i4]).e(c1166s);
                i4++;
            } while (i4 < i2);
        }
        if (!this.f9591J) {
            c0223t.i();
        }
        A();
        if (s5 != null) {
            s5.A();
        }
        a0 a0Var = ((C1078t) c0223t.f2909c).f9763s;
        for (a0 a0Var2 = (a0) c0223t.f2910d; !Intrinsics.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.f9763s) {
            a0Var2.j1(a0Var2.f9767w, true);
            f0 f0Var = a0Var2.f9761J;
            if (f0Var != null) {
                f0Var.invalidate();
            }
        }
        l4.h();
        if (this.f9591J) {
            return;
        }
        S.n nVar2 = (S.n) c0223t.f2912f;
        if ((nVar2.f3981j & 7168) != 0) {
            while (nVar2 != null) {
                int i5 = nVar2.f3980i;
                if (((i5 & 4096) != 0) | ((i5 & 1024) != 0) | ((i5 & 2048) != 0)) {
                    b0.a(nVar2);
                }
                nVar2 = nVar2.f3983l;
            }
        }
    }

    public final void f() {
        this.f9593L = this.f9592K;
        this.f9592K = 3;
        I.d v4 = v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (e4.f9592K != 3) {
                    e4.f();
                }
                i4++;
            } while (i4 < i2);
        }
    }

    public final void g() {
        this.f9593L = this.f9592K;
        this.f9592K = 3;
        I.d v4 = v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (e4.f9592K == 2) {
                    e4.g();
                }
                i4++;
            } while (i4 < i2);
        }
    }

    public final String h(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        I.d v4 = v();
        int i5 = v4.f3332i;
        if (i5 > 0) {
            Object[] objArr = v4.f3330d;
            int i6 = 0;
            do {
                sb.append(((E) objArr[i6]).h(i2 + 1));
                i6++;
            } while (i6 < i5);
        }
        String sb2 = sb.toString();
        if (i2 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void i() {
        F f4;
        C1166s c1166s = this.f9602o;
        if (c1166s == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            E s4 = s();
            sb.append(s4 != null ? s4.h(0) : null);
            AbstractC0864b.E(sb.toString());
            throw null;
        }
        E s5 = s();
        L l4 = this.f9584C;
        if (s5 != null) {
            s5.y();
            s5.A();
            l4.f9691r.f9664q = 3;
            J j4 = l4.f9692s;
            if (j4 != null) {
                j4.f9636o = 3;
            }
        }
        F f5 = l4.f9691r.f9673z;
        f5.f9615b = true;
        f5.f9616c = false;
        f5.f9618e = false;
        f5.f9617d = false;
        f5.f9619f = false;
        f5.f9620g = false;
        f5.f9621h = null;
        J j5 = l4.f9692s;
        if (j5 != null && (f4 = j5.f9644w) != null) {
            f4.f9615b = true;
            f4.f9616c = false;
            f4.f9618e = false;
            f4.f9617d = false;
            f4.f9619f = false;
            f4.f9620g = false;
            f4.f9621h = null;
        }
        C0223t c0223t = this.B;
        if (c0223t.f(8)) {
            B();
        }
        S.n nVar = (o0) c0223t.f2911e;
        for (S.n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f3982k) {
            if (nVar2.f3990s) {
                nVar2.y0();
            }
        }
        this.f9604q = true;
        I.d dVar = (I.d) this.f9598k.f7976b;
        int i2 = dVar.f3332i;
        if (i2 > 0) {
            Object[] objArr = dVar.f3330d;
            int i4 = 0;
            do {
                ((E) objArr[i4]).i();
                i4++;
            } while (i4 < i2);
        }
        this.f9604q = false;
        while (nVar != null) {
            if (nVar.f3990s) {
                nVar.s0();
            }
            nVar = nVar.f3982k;
        }
        S s6 = c1166s.f10330M;
        l2.g gVar = s6.f9717b;
        ((l2.g) gVar.f7976b).m(this);
        ((l2.g) gVar.f7977c).m(this);
        ((I.d) s6.f9720e.f7976b).m(this);
        c1166s.f10322E = true;
        this.f9602o = null;
        X(null);
        this.f9603p = 0;
        K k4 = l4.f9691r;
        k4.f9661n = Integer.MAX_VALUE;
        k4.f9660m = Integer.MAX_VALUE;
        k4.f9671x = false;
        J j6 = l4.f9692s;
        if (j6 != null) {
            j6.f9635n = Integer.MAX_VALUE;
            j6.f9634m = Integer.MAX_VALUE;
            j6.f9643v = false;
        }
    }

    public final void j(Z.r rVar, C0531b c0531b) {
        ((a0) this.B.f2910d).G0(rVar, c0531b);
    }

    public final void k() {
        if (this.f9596i != null) {
            R(this, false, 5);
        } else {
            T(this, false, 5);
        }
        K k4 = this.f9584C.f9691r;
        M0.a aVar = k4.f9662o ? new M0.a(k4.f9008j) : null;
        if (aVar != null) {
            C1166s c1166s = this.f9602o;
            if (c1166s != null) {
                c1166s.s(this, aVar.f3539a);
                return;
            }
            return;
        }
        C1166s c1166s2 = this.f9602o;
        if (c1166s2 != null) {
            c1166s2.r(true);
        }
    }

    public final List l() {
        J j4 = this.f9584C.f9692s;
        Intrinsics.c(j4);
        L l4 = j4.f9632D;
        l4.f9674a.n();
        boolean z4 = j4.f9646y;
        I.d dVar = j4.f9645x;
        if (!z4) {
            return dVar.f();
        }
        E e4 = l4.f9674a;
        I.d v4 = e4.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                if (dVar.f3332i <= i4) {
                    J j5 = e5.f9584C.f9692s;
                    Intrinsics.c(j5);
                    dVar.b(j5);
                } else {
                    J j6 = e5.f9584C.f9692s;
                    Intrinsics.c(j6);
                    Object[] objArr2 = dVar.f3330d;
                    Object obj = objArr2[i4];
                    objArr2[i4] = j6;
                }
                i4++;
            } while (i4 < i2);
        }
        dVar.o(((I.a) e4.n()).f3324d.f3332i, dVar.f3332i);
        j4.f9646y = false;
        return dVar.f();
    }

    public final List m() {
        return this.f9584C.f9691r.r0();
    }

    public final List n() {
        return v().f();
    }

    public final y0.i o() {
        if (!D() || this.f9591J) {
            return null;
        }
        if (!this.B.f(8) || this.f9605r != null) {
            return this.f9605r;
        }
        M2.E e4 = new M2.E();
        e4.f3580d = new y0.i();
        i0 snapshotObserver = ((C1166s) H.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f9810d, new A.f0(this, 7, e4));
        y0.i iVar = (y0.i) e4.f3580d;
        this.f9605r = iVar;
        return iVar;
    }

    public final List p() {
        return ((I.d) this.f9598k.f7976b).f();
    }

    public final int q() {
        int i2;
        J j4 = this.f9584C.f9692s;
        if (j4 == null || (i2 = j4.f9636o) == 0) {
            return 3;
        }
        return i2;
    }

    public final l2.g r() {
        l2.g gVar = this.f9609v;
        if (gVar != null) {
            return gVar;
        }
        l2.g gVar2 = new l2.g(this, this.f9608u);
        this.f9609v = gVar2;
        return gVar2;
    }

    public final E s() {
        E e4 = this.f9601n;
        while (e4 != null && e4.f9594d) {
            e4 = e4.f9601n;
        }
        return e4;
    }

    public final int t() {
        return this.f9584C.f9691r.f9661n;
    }

    public final String toString() {
        return AbstractC1125K.o(this) + " children: " + ((I.a) n()).f3324d.f3332i + " measurePolicy: " + this.f9608u;
    }

    public final I.d u() {
        boolean z4 = this.f9607t;
        I.d dVar = this.f9606s;
        if (z4) {
            dVar.g();
            dVar.c(dVar.f3332i, v());
            dVar.p(f9582O);
            this.f9607t = false;
        }
        return dVar;
    }

    public final I.d v() {
        a0();
        if (this.f9597j == 0) {
            return (I.d) this.f9598k.f7976b;
        }
        I.d dVar = this.f9599l;
        Intrinsics.c(dVar);
        return dVar;
    }

    public final void w(long j4, r rVar, boolean z4, boolean z5) {
        C0223t c0223t = this.B;
        a0 a0Var = (a0) c0223t.f2910d;
        Z.M m4 = a0.f9748K;
        ((a0) c0223t.f2910d).S0(a0.f9751N, a0Var.L0(j4, true), rVar, z4, z5);
    }

    public final void x(int i2, E e4) {
        if (!(e4.f9601n == null)) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(e4);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(h(0));
            sb.append(" Other tree: ");
            E e5 = e4.f9601n;
            sb.append(e5 != null ? e5.h(0) : null);
            AbstractC0864b.D(sb.toString());
            throw null;
        }
        if (e4.f9602o != null) {
            AbstractC0864b.D("Cannot insert " + e4 + " because it already has an owner. This tree: " + h(0) + " Other tree: " + e4.h(0));
            throw null;
        }
        e4.f9601n = this;
        l2.g gVar = this.f9598k;
        ((I.d) gVar.f7976b).a(i2, e4);
        ((A3.e) gVar.f7977c).invoke();
        J();
        if (e4.f9594d) {
            this.f9597j++;
        }
        C();
        C1166s c1166s = this.f9602o;
        if (c1166s != null) {
            e4.e(c1166s);
        }
        if (e4.f9584C.f9687n > 0) {
            L l4 = this.f9584C;
            l4.b(l4.f9687n + 1);
        }
    }

    public final void y() {
        if (this.f9587F) {
            C0223t c0223t = this.B;
            a0 a0Var = (C1078t) c0223t.f2909c;
            a0 a0Var2 = ((a0) c0223t.f2910d).f9764t;
            this.f9586E = null;
            while (true) {
                if (Intrinsics.a(a0Var, a0Var2)) {
                    break;
                }
                if ((a0Var != null ? a0Var.f9761J : null) != null) {
                    this.f9586E = a0Var;
                    break;
                }
                a0Var = a0Var != null ? a0Var.f9764t : null;
            }
        }
        a0 a0Var3 = this.f9586E;
        if (a0Var3 != null && a0Var3.f9761J == null) {
            AbstractC0864b.E("layer was not set");
            throw null;
        }
        if (a0Var3 != null) {
            a0Var3.U0();
            return;
        }
        E s4 = s();
        if (s4 != null) {
            s4.y();
        }
    }

    public final void z() {
        C0223t c0223t = this.B;
        a0 a0Var = (a0) c0223t.f2910d;
        C1078t c1078t = (C1078t) c0223t.f2909c;
        while (a0Var != c1078t) {
            Intrinsics.d(a0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C1083y c1083y = (C1083y) a0Var;
            f0 f0Var = c1083y.f9761J;
            if (f0Var != null) {
                f0Var.invalidate();
            }
            a0Var = c1083y.f9763s;
        }
        f0 f0Var2 = ((C1078t) c0223t.f2909c).f9761J;
        if (f0Var2 != null) {
            f0Var2.invalidate();
        }
    }

    public E(int i2, boolean z4) {
        this.f9594d = z4;
        this.f9595e = i2;
        this.f9598k = new l2.g(new I.d(new E[16]), 10, new A3.e(25, this));
        this.f9606s = new I.d(new E[16]);
        this.f9607t = true;
        this.f9608u = f9580M;
        this.f9610w = H.f9626a;
        this.f9611x = M0.k.f3555d;
        this.f9612y = f9581N;
        InterfaceC0229w.f2949a.getClass();
        this.f9613z = C0227v.f2944b;
        this.f9592K = 3;
        this.f9593L = 3;
        this.B = new C0223t(this);
        this.f9584C = new L(this);
        this.f9587F = true;
        this.f9588G = S.l.f3977a;
    }
}
