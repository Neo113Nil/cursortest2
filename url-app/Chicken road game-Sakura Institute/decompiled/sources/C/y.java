package C;

import D.T;
import D.U;
import p.C0936l;
import p.C0937m;
import p.C0938n;
import p.InterfaceC0934j;
import p.InterfaceC0939o;
import r0.AbstractC1065f;
import r0.InterfaceC1071l;
import r0.InterfaceC1074o;
import r0.InterfaceC1080v;
import z2.C1436t;

/* loaded from: classes.dex */
public abstract class y extends S.n implements InterfaceC1071l, InterfaceC1074o, InterfaceC1080v {
    public boolean B;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC0934j f1143t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1144u;

    /* renamed from: v, reason: collision with root package name */
    public final float f1145v;

    /* renamed from: w, reason: collision with root package name */
    public final T f1146w;

    /* renamed from: x, reason: collision with root package name */
    public final U f1147x;

    /* renamed from: y, reason: collision with root package name */
    public F f1148y;

    /* renamed from: z, reason: collision with root package name */
    public float f1149z;

    /* renamed from: A, reason: collision with root package name */
    public long f1141A = 0;

    /* renamed from: C, reason: collision with root package name */
    public final i.w f1142C = new i.w();

    public y(InterfaceC0934j interfaceC0934j, boolean z4, float f4, T t4, U u4) {
        this.f1143t = interfaceC0934j;
        this.f1144u = z4;
        this.f1145v = f4;
        this.f1146w = t4;
        this.f1147x = u4;
    }

    public abstract void B0(C0937m c0937m, long j4, float f4);

    public abstract void C0(r0.G g4);

    public final void D0(InterfaceC0939o interfaceC0939o) {
        if (interfaceC0939o instanceof C0937m) {
            B0((C0937m) interfaceC0939o, this.f1141A, this.f1149z);
        } else if (interfaceC0939o instanceof C0938n) {
            E0(((C0938n) interfaceC0939o).f8975a);
        } else if (interfaceC0939o instanceof C0936l) {
            E0(((C0936l) interfaceC0939o).f8973a);
        }
    }

    public abstract void E0(C0937m c0937m);

    @Override // r0.InterfaceC1074o
    public final void a(r0.G g4) {
        g4.a();
        F f4 = this.f1148y;
        if (f4 != null) {
            f4.b(g4, this.f1149z, this.f1146w.a());
        }
        C0(g4);
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    @Override // S.n
    public final void t0() {
        W2.B.m(p0(), null, null, new x(this, null), 3);
    }

    @Override // r0.InterfaceC1080v
    public final void z(long j4) {
        this.B = true;
        M0.b bVar = AbstractC1065f.v(this).f9610w;
        this.f1141A = u3.d.U(j4);
        float f4 = this.f1145v;
        this.f1149z = Float.isNaN(f4) ? q.a(bVar, this.f1144u, this.f1141A) : bVar.L(f4);
        i.w wVar = this.f1142C;
        Object[] objArr = wVar.f6974a;
        int i2 = wVar.f6975b;
        for (int i4 = 0; i4 < i2; i4++) {
            D0((InterfaceC0939o) objArr[i4]);
        }
        C1436t.k(wVar.f6974a, 0, wVar.f6975b);
        wVar.f6975b = 0;
    }
}
