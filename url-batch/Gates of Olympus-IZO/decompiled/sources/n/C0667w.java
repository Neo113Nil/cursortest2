package n;

import android.view.KeyEvent;
import f.AbstractC0382a;
import f2.InterfaceC0390e;
import h.AbstractC0416e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k2.AbstractC0552y;
import l0.C0571a;
import l0.InterfaceC0573c;
import q.C0771f;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.InterfaceC0904l;
import t0.n0;
import t0.q0;
import z0.C1076a;

/* renamed from: n.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0667w extends AbstractC0905m implements t0.l0, InterfaceC0573c, Z.b, n0, q0 {

    /* renamed from: J, reason: collision with root package name */
    public static final b0 f6168J = new b0(2);

    /* renamed from: A, reason: collision with root package name */
    public n0.v f6169A;
    public InterfaceC0904l B;
    public q.l C;
    public C0771f D;

    /* renamed from: G, reason: collision with root package name */
    public q.j f6172G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6173H;

    /* renamed from: I, reason: collision with root package name */
    public final b0 f6174I;

    /* renamed from: s, reason: collision with root package name */
    public q.j f6175s;

    /* renamed from: t, reason: collision with root package name */
    public W f6176t;

    /* renamed from: u, reason: collision with root package name */
    public String f6177u;

    /* renamed from: v, reason: collision with root package name */
    public z0.f f6178v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6179w;

    /* renamed from: x, reason: collision with root package name */
    public Y1.a f6180x;

    /* renamed from: z, reason: collision with root package name */
    public final C0639J f6182z;

    /* renamed from: y, reason: collision with root package name */
    public final C0635F f6181y = new C0635F();

    /* renamed from: E, reason: collision with root package name */
    public final LinkedHashMap f6170E = new LinkedHashMap();

    /* renamed from: F, reason: collision with root package name */
    public long f6171F = 0;

    public C0667w(q.j jVar, W w3, boolean z3, String str, z0.f fVar, Y1.a aVar) {
        this.f6175s = jVar;
        this.f6176t = w3;
        this.f6177u = str;
        this.f6178v = fVar;
        this.f6179w = z3;
        this.f6180x = aVar;
        this.f6182z = new C0639J(jVar);
        q.j jVar2 = this.f6175s;
        this.f6172G = jVar2;
        this.f6173H = jVar2 == null && this.f6176t != null;
        this.f6174I = f6168J;
    }

    public final void A0() {
        W w3;
        if (this.B == null && (w3 = this.f6176t) != null) {
            if (this.f6175s == null) {
                this.f6175s = new q.j();
            }
            this.f6182z.y0(this.f6175s);
            q.j jVar = this.f6175s;
            Z1.i.c(jVar);
            InterfaceC0904l b2 = w3.b(jVar);
            v0(b2);
            this.B = b2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r3.B == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(q.j jVar, W w3, boolean z3, String str, z0.f fVar, Y1.a aVar) {
        boolean z4;
        InterfaceC0904l interfaceC0904l;
        boolean z5 = false;
        boolean z6 = true;
        if (Z1.i.a(this.f6172G, jVar)) {
            z4 = false;
        } else {
            z0();
            this.f6172G = jVar;
            this.f6175s = jVar;
            z4 = true;
        }
        if (!Z1.i.a(this.f6176t, w3)) {
            this.f6176t = w3;
            z4 = true;
        }
        boolean z7 = this.f6179w;
        C0639J c0639j = this.f6182z;
        if (z7 != z3) {
            InterfaceC0904l interfaceC0904l2 = this.f6181y;
            if (z3) {
                v0(interfaceC0904l2);
                v0(c0639j);
            } else {
                w0(interfaceC0904l2);
                w0(c0639j);
                z0();
            }
            AbstractC0898f.o(this);
            this.f6179w = z3;
        }
        if (!Z1.i.a(this.f6177u, str)) {
            this.f6177u = str;
            AbstractC0898f.o(this);
        }
        if (!Z1.i.a(this.f6178v, fVar)) {
            this.f6178v = fVar;
            AbstractC0898f.o(this);
        }
        this.f6180x = aVar;
        boolean z8 = this.f6173H;
        q.j jVar2 = this.f6172G;
        if (z8 != (jVar2 == null && this.f6176t != null)) {
            if (jVar2 == null && this.f6176t != null) {
                z5 = true;
            }
            this.f6173H = z5;
            if (!z5) {
            }
        }
        z6 = z4;
        if (z6 && ((interfaceC0904l = this.B) != null || !this.f6173H)) {
            if (interfaceC0904l != null) {
                w0(interfaceC0904l);
            }
            this.B = null;
            A0();
        }
        c0639j.y0(this.f6175s);
    }

    @Override // t0.l0
    public final void K() {
        C0771f c0771f;
        q.j jVar = this.f6175s;
        if (jVar != null && (c0771f = this.D) != null) {
            jVar.c(new q.g(c0771f));
        }
        this.D = null;
        n0.v vVar = this.f6169A;
        if (vVar != null) {
            vVar.K();
        }
    }

    @Override // t0.n0
    public final boolean O() {
        return true;
    }

    @Override // t0.l0
    public final void f0(n0.g gVar, n0.h hVar, long j3) {
        long j4 = ((j3 >> 33) << 32) | (((j3 << 32) >> 33) & 4294967295L);
        this.f6171F = I2.l.f((int) (j4 >> 32), (int) (j4 & 4294967295L));
        A0();
        if (this.f6179w && hVar == n0.h.f6217e) {
            int i3 = gVar.f6215b;
            if (n0.s.c(i3, 4)) {
                AbstractC0552y.q(j0(), null, null, new C0652g(this, null), 3);
            } else if (n0.s.c(i3, 5)) {
                AbstractC0552y.q(j0(), null, null, new C0653h(this, null), 3);
            }
        }
        if (this.f6169A == null) {
            C0654i c0654i = new C0654i(this, null);
            n0.g gVar2 = n0.r.f6252a;
            n0.v vVar = new n0.v(null, null, null, c0654i);
            v0(vVar);
            this.f6169A = vVar;
        }
        n0.v vVar2 = this.f6169A;
        if (vVar2 != null) {
            vVar2.f0(gVar, hVar, j3);
        }
    }

    @Override // t0.n0
    public final void h(z0.i iVar) {
        z0.f fVar = this.f6178v;
        if (fVar != null) {
            z0.s.c(iVar, fVar.f8953a);
        }
        String str = this.f6177u;
        A2.l lVar = new A2.l(25, this);
        InterfaceC0390e[] interfaceC0390eArr = z0.s.f9036a;
        iVar.d(z0.h.f8958b, new C1076a(str, lVar));
        if (this.f6179w) {
            this.f6182z.h(iVar);
        } else {
            iVar.d(z0.q.f9018i, L1.z.f2729a);
        }
        y0(iVar);
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    @Override // l0.InterfaceC0573c
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // U.k
    public final void n0() {
        if (!this.f6173H) {
            A0();
        }
        if (this.f6179w) {
            v0(this.f6181y);
            v0(this.f6182z);
        }
    }

    @Override // U.k
    public final void o0() {
        z0();
        if (this.f6172G == null) {
            this.f6175s = null;
        }
        InterfaceC0904l interfaceC0904l = this.B;
        if (interfaceC0904l != null) {
            w0(interfaceC0904l);
        }
        this.B = null;
    }

    @Override // l0.InterfaceC0573c
    public final boolean r(KeyEvent keyEvent) {
        int d3;
        A0();
        boolean z3 = this.f6179w;
        LinkedHashMap linkedHashMap = this.f6170E;
        if (z3) {
            int i3 = AbstractC0668x.f6184b;
            if (AbstractC0382a.i(g2.i.R(keyEvent), 2) && ((d3 = (int) (AbstractC0416e.d(keyEvent.getKeyCode()) >> 32)) == 23 || d3 == 66 || d3 == 160)) {
                if (linkedHashMap.containsKey(new C0571a(AbstractC0416e.d(keyEvent.getKeyCode())))) {
                    return false;
                }
                q.l lVar = new q.l(this.f6171F);
                linkedHashMap.put(new C0571a(AbstractC0416e.d(keyEvent.getKeyCode())), lVar);
                if (this.f6175s != null) {
                    AbstractC0552y.q(j0(), null, null, new C0650e(this, lVar, null), 3);
                }
                return true;
            }
        }
        if (!this.f6179w) {
            return false;
        }
        int i4 = AbstractC0668x.f6184b;
        if (!AbstractC0382a.i(g2.i.R(keyEvent), 1)) {
            return false;
        }
        int d4 = (int) (AbstractC0416e.d(keyEvent.getKeyCode()) >> 32);
        if (d4 != 23 && d4 != 66 && d4 != 160) {
            return false;
        }
        q.l lVar2 = (q.l) linkedHashMap.remove(new C0571a(AbstractC0416e.d(keyEvent.getKeyCode())));
        if (lVar2 != null && this.f6175s != null) {
            AbstractC0552y.q(j0(), null, null, new C0651f(this, lVar2, null), 3);
        }
        this.f6180x.b();
        return true;
    }

    @Override // Z.b
    public final void t(Z.p pVar) {
        if (pVar.a()) {
            A0();
        }
        if (this.f6179w) {
            this.f6182z.t(pVar);
        }
    }

    @Override // t0.q0
    public final Object v() {
        return this.f6174I;
    }

    public final void z0() {
        q.j jVar = this.f6175s;
        LinkedHashMap linkedHashMap = this.f6170E;
        if (jVar != null) {
            q.l lVar = this.C;
            if (lVar != null) {
                jVar.c(new q.k(lVar));
            }
            C0771f c0771f = this.D;
            if (c0771f != null) {
                jVar.c(new q.g(c0771f));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                jVar.c(new q.k((q.l) it.next()));
            }
        }
        this.C = null;
        this.D = null;
        linkedHashMap.clear();
    }

    public void y0(z0.i iVar) {
    }
}
