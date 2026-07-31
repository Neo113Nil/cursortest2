package m;

import e2.AbstractC0381e;
import l.AbstractC0557b;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611v implements InterfaceC0599i {

    /* renamed from: a, reason: collision with root package name */
    public final A2.k f5866a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f5867b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5868c;

    /* renamed from: d, reason: collision with root package name */
    public final r f5869d;

    /* renamed from: e, reason: collision with root package name */
    public final r f5870e;

    /* renamed from: f, reason: collision with root package name */
    public final r f5871f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5872g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5873h;

    public C0611v(C0612w c0612w, y0 y0Var, Object obj, r rVar) {
        r rVar2 = rVar;
        A2.k kVar = new A2.k(7, c0612w.f5875a);
        this.f5866a = kVar;
        this.f5867b = y0Var;
        this.f5868c = obj;
        r rVar3 = (r) y0Var.f5883a.j(obj);
        this.f5869d = rVar3;
        this.f5870e = AbstractC0595e.e(rVar);
        if (((r) kVar.f111e) == null) {
            kVar.f111e = rVar3.c();
        }
        r rVar4 = (r) kVar.f111e;
        String str = "targetVector";
        if (rVar4 == null) {
            Z1.i.j("targetVector");
            throw null;
        }
        int b2 = rVar4.b();
        int i3 = 0;
        while (i3 < b2) {
            r rVar5 = (r) kVar.f111e;
            if (rVar5 == null) {
                Z1.i.j(str);
                throw null;
            }
            float a3 = rVar3.a(i3);
            float a4 = rVar2.a(i3);
            l.J j3 = (l.J) ((A2.g) kVar.f108b).f83b;
            double b3 = j3.b(a4);
            double d3 = l.K.f5443a;
            float f3 = j3.f5441a * j3.f5442b;
            rVar5.e((Math.signum(a4) * ((float) (Math.exp((d3 / (d3 - 1.0d)) * b3) * f3))) + a3, i3);
            i3++;
            rVar2 = rVar;
            rVar3 = rVar3;
            str = str;
        }
        String str2 = str;
        r rVar6 = (r) kVar.f111e;
        if (rVar6 == null) {
            Z1.i.j(str2);
            throw null;
        }
        this.f5872g = y0Var.f5884b.j(rVar6);
        A2.k kVar2 = this.f5866a;
        r rVar7 = this.f5869d;
        if (((r) kVar2.f110d) == null) {
            kVar2.f110d = rVar7.c();
        }
        r rVar8 = (r) kVar2.f110d;
        if (rVar8 == null) {
            Z1.i.j("velocityVector");
            throw null;
        }
        int b4 = rVar8.b();
        long j4 = 0;
        for (int i4 = 0; i4 < b4; i4++) {
            rVar7.getClass();
            j4 = Math.max(j4, ((long) (Math.exp(((l.J) ((A2.g) kVar2.f108b).f83b).b(rVar.a(i4)) / (l.K.f5443a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f5873h = j4;
        r e3 = AbstractC0595e.e(this.f5866a.i(j4, this.f5869d, rVar));
        this.f5871f = e3;
        int b5 = e3.b();
        for (int i5 = 0; i5 < b5; i5++) {
            r rVar9 = this.f5871f;
            float a5 = rVar9.a(i5);
            this.f5866a.getClass();
            this.f5866a.getClass();
            rVar9.e(AbstractC0381e.q(a5, -0.0f, 0.0f), i5);
        }
    }

    @Override // m.InterfaceC0599i
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC0599i
    public final Object b(long j3) {
        if (f(j3)) {
            return this.f5872g;
        }
        Y1.c cVar = this.f5867b.f5884b;
        A2.k kVar = this.f5866a;
        r rVar = (r) kVar.f109c;
        r rVar2 = this.f5869d;
        if (rVar == null) {
            kVar.f109c = rVar2.c();
        }
        r rVar3 = (r) kVar.f109c;
        String str = "valueVector";
        if (rVar3 == null) {
            Z1.i.j("valueVector");
            throw null;
        }
        int b2 = rVar3.b();
        int i3 = 0;
        while (i3 < b2) {
            r rVar4 = (r) kVar.f109c;
            if (rVar4 == null) {
                Z1.i.j(str);
                throw null;
            }
            float a3 = rVar2.a(i3);
            long j4 = j3 / 1000000;
            l.I a4 = ((l.J) ((A2.g) kVar.f108b).f83b).a(this.f5870e.a(i3));
            String str2 = str;
            long j5 = a4.f5440c;
            rVar4.e((Math.signum(a4.f5438a) * a4.f5439b * AbstractC0557b.a(j5 > 0 ? j4 / j5 : 1.0f).f5451a) + a3, i3);
            i3++;
            str = str2;
        }
        String str3 = str;
        r rVar5 = (r) kVar.f109c;
        if (rVar5 != null) {
            return cVar.j(rVar5);
        }
        Z1.i.j(str3);
        throw null;
    }

    @Override // m.InterfaceC0599i
    public final long c() {
        return this.f5873h;
    }

    @Override // m.InterfaceC0599i
    public final y0 d() {
        return this.f5867b;
    }

    @Override // m.InterfaceC0599i
    public final Object e() {
        return this.f5872g;
    }

    @Override // m.InterfaceC0599i
    public final r g(long j3) {
        if (f(j3)) {
            return this.f5871f;
        }
        return this.f5866a.i(j3, this.f5869d, this.f5870e);
    }
}
