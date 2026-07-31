package m;

import e2.InterfaceC0424c;
import l.AbstractC0576b;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636v implements InterfaceC0624i {

    /* renamed from: a, reason: collision with root package name */
    public final G1.g f6891a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f6892b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6893c;

    /* renamed from: d, reason: collision with root package name */
    public final r f6894d;

    /* renamed from: e, reason: collision with root package name */
    public final r f6895e;

    /* renamed from: f, reason: collision with root package name */
    public final r f6896f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6897g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6898h;

    public C0636v(C0637w c0637w, u0 u0Var, Object obj, r rVar) {
        r rVar2 = rVar;
        G1.g gVar = new G1.g(7, c0637w.f6908a);
        this.f6891a = gVar;
        this.f6892b = u0Var;
        this.f6893c = obj;
        r rVar3 = (r) u0Var.f6889a.n(obj);
        this.f6894d = rVar3;
        this.f6895e = AbstractC0620e.f(rVar);
        if (((r) gVar.f2096h) == null) {
            gVar.f2096h = rVar3.c();
        }
        r rVar4 = (r) gVar.f2096h;
        String str = "targetVector";
        if (rVar4 == null) {
            f2.j.j("targetVector");
            throw null;
        }
        int b3 = rVar4.b();
        int i3 = 0;
        while (i3 < b3) {
            r rVar5 = (r) gVar.f2096h;
            if (rVar5 == null) {
                f2.j.j(str);
                throw null;
            }
            float a3 = rVar3.a(i3);
            float a4 = rVar2.a(i3);
            l.K k3 = (l.K) ((B.Y) gVar.f2093e).f334d;
            double b4 = k3.b(a4);
            double d3 = l.L.f6464a;
            float f3 = k3.f6462a * k3.f6463b;
            rVar5.e((Math.signum(a4) * ((float) (Math.exp((d3 / (d3 - 1.0d)) * b4) * f3))) + a3, i3);
            i3++;
            rVar2 = rVar;
            rVar3 = rVar3;
            str = str;
        }
        String str2 = str;
        r rVar6 = (r) gVar.f2096h;
        if (rVar6 == null) {
            f2.j.j(str2);
            throw null;
        }
        this.f6897g = u0Var.f6890b.n(rVar6);
        G1.g gVar2 = this.f6891a;
        r rVar7 = this.f6894d;
        if (((r) gVar2.f2095g) == null) {
            gVar2.f2095g = rVar7.c();
        }
        r rVar8 = (r) gVar2.f2095g;
        if (rVar8 == null) {
            f2.j.j("velocityVector");
            throw null;
        }
        int b5 = rVar8.b();
        long j3 = 0;
        for (int i4 = 0; i4 < b5; i4++) {
            rVar7.getClass();
            j3 = Math.max(j3, ((long) (Math.exp(((l.K) ((B.Y) gVar2.f2093e).f334d).b(rVar.a(i4)) / (l.L.f6464a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f6898h = j3;
        r f4 = AbstractC0620e.f(this.f6891a.i(j3, this.f6894d, rVar));
        this.f6896f = f4;
        int b6 = f4.b();
        for (int i5 = 0; i5 < b6; i5++) {
            r rVar9 = this.f6896f;
            float a5 = rVar9.a(i5);
            this.f6891a.getClass();
            this.f6891a.getClass();
            rVar9.e(O2.d.x(a5, -0.0f, 0.0f), i5);
        }
    }

    @Override // m.InterfaceC0624i
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC0624i
    public final Object b(long j3) {
        if (f(j3)) {
            return this.f6897g;
        }
        InterfaceC0424c interfaceC0424c = this.f6892b.f6890b;
        G1.g gVar = this.f6891a;
        r rVar = (r) gVar.f2094f;
        r rVar2 = this.f6894d;
        if (rVar == null) {
            gVar.f2094f = rVar2.c();
        }
        r rVar3 = (r) gVar.f2094f;
        String str = "valueVector";
        if (rVar3 == null) {
            f2.j.j("valueVector");
            throw null;
        }
        int b3 = rVar3.b();
        int i3 = 0;
        while (i3 < b3) {
            r rVar4 = (r) gVar.f2094f;
            if (rVar4 == null) {
                f2.j.j(str);
                throw null;
            }
            float a3 = rVar2.a(i3);
            long j4 = j3 / 1000000;
            l.J a4 = ((l.K) ((B.Y) gVar.f2093e).f334d).a(this.f6895e.a(i3));
            String str2 = str;
            long j5 = a4.f6461c;
            rVar4.e((Math.signum(a4.f6459a) * a4.f6460b * AbstractC0576b.a(j5 > 0 ? j4 / j5 : 1.0f).f6472a) + a3, i3);
            i3++;
            str = str2;
        }
        String str3 = str;
        r rVar5 = (r) gVar.f2094f;
        if (rVar5 != null) {
            return interfaceC0424c.n(rVar5);
        }
        f2.j.j(str3);
        throw null;
    }

    @Override // m.InterfaceC0624i
    public final long c() {
        return this.f6898h;
    }

    @Override // m.InterfaceC0624i
    public final u0 d() {
        return this.f6892b;
    }

    @Override // m.InterfaceC0624i
    public final Object e() {
        return this.f6897g;
    }

    @Override // m.InterfaceC0624i
    public final r g(long j3) {
        if (f(j3)) {
            return this.f6896f;
        }
        return this.f6891a.i(j3, this.f6894d, this.f6895e);
    }
}
