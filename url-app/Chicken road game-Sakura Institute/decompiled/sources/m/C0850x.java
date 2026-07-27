package m;

import a.AbstractC0345a;
import android.view.KeyEvent;
import j0.C0706a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC0819q;
import l0.C0802C;
import l0.C0811i;
import l0.EnumC0812j;
import p.C0931g;
import p.C0932h;
import p.C0935k;
import p.C0936l;
import p.C0937m;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.InterfaceC1072m;
import y0.C1317a;

/* renamed from: m.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0850x extends AbstractC1073n implements r0.l0, j0.d, X.c, r0.n0, r0.q0 {

    /* renamed from: M, reason: collision with root package name */
    public static final f0 f8213M = new f0(2);

    /* renamed from: A, reason: collision with root package name */
    public Function0 f8214A;

    /* renamed from: C, reason: collision with root package name */
    public final J f8215C;

    /* renamed from: D, reason: collision with root package name */
    public C0802C f8216D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC1072m f8217E;

    /* renamed from: F, reason: collision with root package name */
    public C0937m f8218F;

    /* renamed from: G, reason: collision with root package name */
    public C0931g f8219G;

    /* renamed from: J, reason: collision with root package name */
    public C0935k f8222J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f8223K;

    /* renamed from: L, reason: collision with root package name */
    public final f0 f8224L;

    /* renamed from: v, reason: collision with root package name */
    public C0935k f8225v;

    /* renamed from: w, reason: collision with root package name */
    public W f8226w;

    /* renamed from: x, reason: collision with root package name */
    public String f8227x;

    /* renamed from: y, reason: collision with root package name */
    public y0.f f8228y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8229z;
    public final F B = new F();

    /* renamed from: H, reason: collision with root package name */
    public final LinkedHashMap f8220H = new LinkedHashMap();

    /* renamed from: I, reason: collision with root package name */
    public long f8221I = 0;

    public C0850x(C0935k c0935k, W w4, boolean z4, String str, y0.f fVar, Function0 function0) {
        this.f8225v = c0935k;
        this.f8226w = w4;
        this.f8227x = str;
        this.f8228y = fVar;
        this.f8229z = z4;
        this.f8214A = function0;
        this.f8215C = new J(c0935k);
        C0935k c0935k2 = this.f8225v;
        this.f8222J = c0935k2;
        this.f8223K = c0935k2 == null && this.f8226w != null;
        this.f8224L = f8213M;
    }

    public void E0(y0.i iVar) {
    }

    public final void F0() {
        C0935k c0935k = this.f8225v;
        LinkedHashMap linkedHashMap = this.f8220H;
        if (c0935k != null) {
            C0937m c0937m = this.f8218F;
            if (c0937m != null) {
                c0935k.c(new C0936l(c0937m));
            }
            C0931g c0931g = this.f8219G;
            if (c0931g != null) {
                c0935k.c(new C0932h(c0931g));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                c0935k.c(new C0936l((C0937m) it.next()));
            }
        }
        this.f8218F = null;
        this.f8219G = null;
        linkedHashMap.clear();
    }

    public final void G0() {
        W w4;
        if (this.f8217E == null && (w4 = this.f8226w) != null) {
            if (this.f8225v == null) {
                this.f8225v = new C0935k();
            }
            this.f8215C.E0(this.f8225v);
            C0935k c0935k = this.f8225v;
            Intrinsics.c(c0935k);
            InterfaceC1072m a4 = w4.a(c0935k);
            B0(a4);
            this.f8217E = a4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r3.f8217E == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(C0935k c0935k, W w4, boolean z4, String str, y0.f fVar, Function0 function0) {
        boolean z5;
        InterfaceC1072m interfaceC1072m;
        boolean z6 = false;
        boolean z7 = true;
        if (Intrinsics.a(this.f8222J, c0935k)) {
            z5 = false;
        } else {
            F0();
            this.f8222J = c0935k;
            this.f8225v = c0935k;
            z5 = true;
        }
        if (!Intrinsics.a(this.f8226w, w4)) {
            this.f8226w = w4;
            z5 = true;
        }
        boolean z8 = this.f8229z;
        J j4 = this.f8215C;
        if (z8 != z4) {
            InterfaceC1072m interfaceC1072m2 = this.B;
            if (z4) {
                B0(interfaceC1072m2);
                B0(j4);
            } else {
                C0(interfaceC1072m2);
                C0(j4);
                F0();
            }
            AbstractC1065f.p(this);
            this.f8229z = z4;
        }
        if (!Intrinsics.a(this.f8227x, str)) {
            this.f8227x = str;
            AbstractC1065f.p(this);
        }
        if (!Intrinsics.a(this.f8228y, fVar)) {
            this.f8228y = fVar;
            AbstractC1065f.p(this);
        }
        this.f8214A = function0;
        boolean z9 = this.f8223K;
        C0935k c0935k2 = this.f8222J;
        if (z9 != (c0935k2 == null && this.f8226w != null)) {
            if (c0935k2 == null && this.f8226w != null) {
                z6 = true;
            }
            this.f8223K = z6;
            if (!z6) {
            }
        }
        z7 = z5;
        if (z7 && ((interfaceC1072m = this.f8217E) != null || !this.f8223K)) {
            if (interfaceC1072m != null) {
                C0(interfaceC1072m);
            }
            this.f8217E = null;
            G0();
        }
        j4.E0(this.f8225v);
    }

    @Override // X.c
    public final void Q(X.s sVar) {
        if (sVar.a()) {
            G0();
        }
        if (this.f8229z) {
            this.f8215C.Q(sVar);
        }
    }

    @Override // r0.l0
    public final void S() {
        C0931g c0931g;
        C0935k c0935k = this.f8225v;
        if (c0935k != null && (c0931g = this.f8219G) != null) {
            c0935k.c(new C0932h(c0931g));
        }
        this.f8219G = null;
        C0802C c0802c = this.f8216D;
        if (c0802c != null) {
            c0802c.S();
        }
    }

    @Override // r0.n0
    public final boolean X() {
        return true;
    }

    @Override // r0.l0
    public final void Z(C0811i c0811i, EnumC0812j enumC0812j, long j4) {
        long j5 = ((j4 >> 33) << 32) | (((j4 << 32) >> 33) & 4294967295L);
        this.f8221I = AbstractC0345a.c((int) (j5 >> 32), (int) (j5 & 4294967295L));
        G0();
        if (this.f8229z && enumC0812j == EnumC0812j.f7911e) {
            int i2 = c0811i.f7909c;
            if (AbstractC0819q.d(i2, 4)) {
                W2.B.m(p0(), null, null, new C0834g(this, null), 3);
            } else if (AbstractC0819q.d(i2, 5)) {
                W2.B.m(p0(), null, null, new C0835h(this, null), 3);
            }
        }
        if (this.f8216D == null) {
            C0836i c0836i = new C0836i(this, null);
            C0811i c0811i2 = l0.w.f7951a;
            C0802C c0802c = new C0802C(null, null, null, c0836i);
            B0(c0802c);
            this.f8216D = c0802c;
        }
        C0802C c0802c2 = this.f8216D;
        if (c0802c2 != null) {
            c0802c2.Z(c0811i, enumC0812j, j4);
        }
    }

    @Override // j0.d
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // r0.n0
    public final void p(y0.i iVar) {
        y0.f fVar = this.f8228y;
        if (fVar != null) {
            y0.s.d(iVar, fVar.f11545a);
        }
        String str = this.f8227x;
        A3.e eVar = new A3.e(18, this);
        S2.e[] eVarArr = y0.s.f11639a;
        iVar.s(y0.h.f11551b, new C1317a(str, eVar));
        if (this.f8229z) {
            this.f8215C.p(iVar);
        } else {
            iVar.s(y0.q.f11620i, Unit.f7487a);
        }
        E0(iVar);
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    @Override // j0.d
    public final boolean r(KeyEvent keyEvent) {
        int A4;
        G0();
        boolean z4 = this.f8229z;
        LinkedHashMap linkedHashMap = this.f8220H;
        if (z4) {
            int i2 = AbstractC0851y.f8231b;
            if (j0.c.w(j0.c.C(keyEvent), 2) && ((A4 = (int) (j0.c.A(keyEvent) >> 32)) == 23 || A4 == 66 || A4 == 160)) {
                if (linkedHashMap.containsKey(new C0706a(u3.d.d(keyEvent.getKeyCode())))) {
                    return false;
                }
                C0937m c0937m = new C0937m(this.f8221I);
                linkedHashMap.put(new C0706a(u3.d.d(keyEvent.getKeyCode())), c0937m);
                if (this.f8225v != null) {
                    W2.B.m(p0(), null, null, new C0832e(this, c0937m, null), 3);
                }
                return true;
            }
        }
        if (!this.f8229z) {
            return false;
        }
        int i4 = AbstractC0851y.f8231b;
        if (!j0.c.w(j0.c.C(keyEvent), 1)) {
            return false;
        }
        int A5 = (int) (j0.c.A(keyEvent) >> 32);
        if (A5 != 23 && A5 != 66 && A5 != 160) {
            return false;
        }
        C0937m c0937m2 = (C0937m) linkedHashMap.remove(new C0706a(u3.d.d(keyEvent.getKeyCode())));
        if (c0937m2 != null && this.f8225v != null) {
            W2.B.m(p0(), null, null, new C0833f(this, c0937m2, null), 3);
        }
        this.f8214A.invoke();
        return true;
    }

    @Override // S.n
    public final void t0() {
        if (!this.f8223K) {
            G0();
        }
        if (this.f8229z) {
            B0(this.B);
            B0(this.f8215C);
        }
    }

    @Override // r0.q0
    public final Object u() {
        return this.f8224L;
    }

    @Override // S.n
    public final void u0() {
        F0();
        if (this.f8222J == null) {
            this.f8225v = null;
        }
        InterfaceC1072m interfaceC1072m = this.f8217E;
        if (interfaceC1072m != null) {
            C0(interfaceC1072m);
        }
        this.f8217E = null;
    }
}
