package D1;

import i1.C0465b;
import i1.C0467d;

/* loaded from: classes.dex */
public final class x extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C c3, String str, String str2, P1.d dVar) {
        super(2, dVar);
        this.f577f = c3;
        this.f578g = str;
        this.f579h = str2;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        x xVar = new x(this.f577f, this.f578g, this.f579h, dVar);
        xVar.f576e = obj;
        return xVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        x xVar = (x) create((C0465b) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        xVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        C0465b c0465b = (C0465b) this.f576e;
        C c3 = this.f577f;
        C0467d c0467d = c3.f521b;
        String str = this.f578g;
        c0465b.getClass();
        Z1.i.f(c0467d, "key");
        c0465b.c(c0467d, str);
        String str2 = this.f579h;
        if (str2 != null && str2.length() != 0) {
            C0467d c0467d2 = c3.f522c;
            Z1.i.f(c0467d2, "key");
            c0465b.c(c0467d2, str2);
        }
        return L1.z.f2729a;
    }
}
