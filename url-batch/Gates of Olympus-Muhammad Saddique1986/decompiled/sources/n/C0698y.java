package n;

import android.view.KeyEvent;
import e2.InterfaceC0422a;
import h2.AbstractC0508a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l0.C0591a;
import l2.InterfaceC0604e;
import n0.C0702C;
import n0.C0711i;
import n0.EnumC0712j;
import q2.AbstractC0837y;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.InterfaceC0999l;

/* renamed from: n.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0698y extends AbstractC1000m implements t0.m0, l0.d, Z.c, t0.o0, t0.r0 {

    /* renamed from: J, reason: collision with root package name */
    public static final i0 f7225J = new i0(2);

    /* renamed from: A, reason: collision with root package name */
    public C0702C f7226A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0999l f7227B;
    public q.m C;
    public q.g D;

    /* renamed from: G, reason: collision with root package name */
    public q.k f7230G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7231H;

    /* renamed from: I, reason: collision with root package name */
    public final i0 f7232I;

    /* renamed from: s, reason: collision with root package name */
    public q.k f7233s;

    /* renamed from: t, reason: collision with root package name */
    public Z f7234t;

    /* renamed from: u, reason: collision with root package name */
    public String f7235u;

    /* renamed from: v, reason: collision with root package name */
    public A0.f f7236v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7237w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC0422a f7238x;

    /* renamed from: z, reason: collision with root package name */
    public final C0669L f7240z;

    /* renamed from: y, reason: collision with root package name */
    public final C0665H f7239y = new C0665H();

    /* renamed from: E, reason: collision with root package name */
    public final LinkedHashMap f7228E = new LinkedHashMap();

    /* renamed from: F, reason: collision with root package name */
    public long f7229F = 0;

    public C0698y(q.k kVar, Z z3, boolean z4, String str, A0.f fVar, InterfaceC0422a interfaceC0422a) {
        this.f7233s = kVar;
        this.f7234t = z3;
        this.f7235u = str;
        this.f7236v = fVar;
        this.f7237w = z4;
        this.f7238x = interfaceC0422a;
        this.f7240z = new C0669L(kVar);
        q.k kVar2 = this.f7233s;
        this.f7230G = kVar2;
        this.f7231H = kVar2 == null && this.f7234t != null;
        this.f7232I = f7225J;
    }

    public final void C0() {
        q.k kVar = this.f7233s;
        LinkedHashMap linkedHashMap = this.f7228E;
        if (kVar != null) {
            q.m mVar = this.C;
            if (mVar != null) {
                kVar.c(new q.l(mVar));
            }
            q.g gVar = this.D;
            if (gVar != null) {
                kVar.c(new q.h(gVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                kVar.c(new q.l((q.m) it.next()));
            }
        }
        this.C = null;
        this.D = null;
        linkedHashMap.clear();
    }

    public final void D0() {
        Z z3;
        if (this.f7227B == null && (z3 = this.f7234t) != null) {
            if (this.f7233s == null) {
                this.f7233s = new q.k();
            }
            this.f7240z.B0(this.f7233s);
            q.k kVar = this.f7233s;
            f2.j.c(kVar);
            InterfaceC0999l b3 = z3.b(kVar);
            y0(b3);
            this.f7227B = b3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r3.f7227B == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(q.k kVar, Z z3, boolean z4, String str, A0.f fVar, InterfaceC0422a interfaceC0422a) {
        boolean z5;
        InterfaceC0999l interfaceC0999l;
        boolean z6 = false;
        boolean z7 = true;
        if (f2.j.a(this.f7230G, kVar)) {
            z5 = false;
        } else {
            C0();
            this.f7230G = kVar;
            this.f7233s = kVar;
            z5 = true;
        }
        if (!f2.j.a(this.f7234t, z3)) {
            this.f7234t = z3;
            z5 = true;
        }
        boolean z8 = this.f7237w;
        C0669L c0669l = this.f7240z;
        if (z8 != z4) {
            InterfaceC0999l interfaceC0999l2 = this.f7239y;
            if (z4) {
                y0(interfaceC0999l2);
                y0(c0669l);
            } else {
                z0(interfaceC0999l2);
                z0(c0669l);
                C0();
            }
            AbstractC0993f.o(this);
            this.f7237w = z4;
        }
        if (!f2.j.a(this.f7235u, str)) {
            this.f7235u = str;
            AbstractC0993f.o(this);
        }
        if (!f2.j.a(this.f7236v, fVar)) {
            this.f7236v = fVar;
            AbstractC0993f.o(this);
        }
        this.f7238x = interfaceC0422a;
        boolean z9 = this.f7231H;
        q.k kVar2 = this.f7230G;
        if (z9 != (kVar2 == null && this.f7234t != null)) {
            if (kVar2 == null && this.f7234t != null) {
                z6 = true;
            }
            this.f7231H = z6;
            if (!z6) {
            }
        }
        z7 = z5;
        if (z7 && ((interfaceC0999l = this.f7227B) != null || !this.f7231H)) {
            if (interfaceC0999l != null) {
                z0(interfaceC0999l);
            }
            this.f7227B = null;
            D0();
        }
        c0669l.B0(this.f7233s);
    }

    @Override // t0.m0
    public final void N() {
        q.g gVar;
        q.k kVar = this.f7233s;
        if (kVar != null && (gVar = this.D) != null) {
            kVar.c(new q.h(gVar));
        }
        this.D = null;
        C0702C c0702c = this.f7226A;
        if (c0702c != null) {
            c0702c.N();
        }
    }

    @Override // t0.o0
    public final boolean R() {
        return true;
    }

    @Override // t0.m0
    public final void g0(C0711i c0711i, EnumC0712j enumC0712j, long j3) {
        long j4 = ((j3 >> 33) << 32) | (((j3 << 32) >> 33) & 4294967295L);
        this.f7229F = l0.c.e((int) (j4 >> 32), (int) (j4 & 4294967295L));
        D0();
        if (this.f7237w && enumC0712j == EnumC0712j.f7296e) {
            int i3 = c0711i.f7294c;
            if (n0.q.d(i3, 4)) {
                AbstractC0837y.r(m0(), null, null, new C0681g(this, null), 3);
            } else if (n0.q.d(i3, 5)) {
                AbstractC0837y.r(m0(), null, null, new C0682h(this, null), 3);
            }
        }
        if (this.f7226A == null) {
            C0683i c0683i = new C0683i(this, null);
            C0711i c0711i2 = n0.w.f7336a;
            C0702C c0702c = new C0702C(null, null, null, c0683i);
            y0(c0702c);
            this.f7226A = c0702c;
        }
        C0702C c0702c2 = this.f7226A;
        if (c0702c2 != null) {
            c0702c2.g0(c0711i, enumC0712j, j3);
        }
    }

    @Override // t0.o0
    public final void j(A0.i iVar) {
        A0.f fVar = this.f7236v;
        if (fVar != null) {
            A0.u.d(iVar, fVar.f98a);
        }
        String str = this.f7235u;
        A.h hVar = new A.h(25, this);
        InterfaceC0604e[] interfaceC0604eArr = A0.u.f193a;
        iVar.c(A0.h.f104b, new A0.a(str, hVar));
        if (this.f7237w) {
            this.f7240z.j(iVar);
        } else {
            iVar.c(A0.s.f174i, R1.y.f4171a);
        }
        B0(iVar);
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    @Override // l0.d
    public final boolean o(KeyEvent keyEvent) {
        return false;
    }

    @Override // U.p
    public final void q0() {
        if (!this.f7231H) {
            D0();
        }
        if (this.f7237w) {
            y0(this.f7239y);
            y0(this.f7240z);
        }
    }

    @Override // U.p
    public final void r0() {
        C0();
        if (this.f7230G == null) {
            this.f7233s = null;
        }
        InterfaceC0999l interfaceC0999l = this.f7227B;
        if (interfaceC0999l != null) {
            z0(interfaceC0999l);
        }
        this.f7227B = null;
    }

    @Override // l0.d
    public final boolean t(KeyEvent keyEvent) {
        int y3;
        D0();
        boolean z3 = this.f7237w;
        LinkedHashMap linkedHashMap = this.f7228E;
        if (z3) {
            int i3 = AbstractC0699z.f7251b;
            if (AbstractC0508a.y(l0.c.z(keyEvent), 2) && ((y3 = (int) (l0.c.y(keyEvent) >> 32)) == 23 || y3 == 66 || y3 == 160)) {
                if (linkedHashMap.containsKey(new C0591a(l0.c.d(keyEvent.getKeyCode())))) {
                    return false;
                }
                q.m mVar = new q.m(this.f7229F);
                linkedHashMap.put(new C0591a(l0.c.d(keyEvent.getKeyCode())), mVar);
                if (this.f7233s != null) {
                    AbstractC0837y.r(m0(), null, null, new C0679e(this, mVar, null), 3);
                }
                return true;
            }
        }
        if (!this.f7237w) {
            return false;
        }
        int i4 = AbstractC0699z.f7251b;
        if (!AbstractC0508a.y(l0.c.z(keyEvent), 1)) {
            return false;
        }
        int y4 = (int) (l0.c.y(keyEvent) >> 32);
        if (y4 != 23 && y4 != 66 && y4 != 160) {
            return false;
        }
        q.m mVar2 = (q.m) linkedHashMap.remove(new C0591a(l0.c.d(keyEvent.getKeyCode())));
        if (mVar2 != null && this.f7233s != null) {
            AbstractC0837y.r(m0(), null, null, new C0680f(this, mVar2, null), 3);
        }
        this.f7238x.b();
        return true;
    }

    @Override // Z.c
    public final void u(Z.s sVar) {
        if (sVar.a()) {
            D0();
        }
        if (this.f7237w) {
            this.f7240z.u(sVar);
        }
    }

    @Override // t0.r0
    public final Object w() {
        return this.f7232I;
    }

    public void B0(A0.i iVar) {
    }
}
