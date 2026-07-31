package F;

import I.C0105l;
import I.C0113p;
import l.C0558c;
import r.AbstractC0813j;
import r.C0806c;

/* renamed from: F.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032c extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r.U f1201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f1202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y0 f1203g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q.a f1204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.C f1205i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y1.e f1206j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q.a f1207k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0032c(r.U u3, float f3, Y0 y02, Q.a aVar, B0.C c3, Y1.e eVar, Q.a aVar2) {
        super(2);
        this.f1201e = u3;
        this.f1202f = f3;
        this.f1203g = y02;
        this.f1204h = aVar;
        this.f1205i = c3;
        this.f1206j = eVar;
        this.f1207k = aVar2;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int i3 = 2;
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            s0.h hVar = r.X.f7049a;
            U.l j3 = androidx.compose.foundation.layout.a.j(I2.l.n(new U.g(new C0558c(i3, this.f1201e))), this.f1202f);
            boolean f3 = c0113p.f(null);
            Object G3 = c0113p.G();
            if (f3 || G3 == C0105l.f2272a) {
                G3 = new C0030b();
                c0113p.a0(G3);
            }
            Y0 y02 = this.f1203g;
            long j4 = y02.f1169c;
            C0806c c0806c = AbstractC0813j.f7065e;
            Q.a aVar = this.f1207k;
            AbstractC0044i.c(j3, (C0030b) G3, j4, y02.f1170d, y02.f1171e, this.f1204h, this.f1205i, c0806c, c0806c, this.f1206j, aVar, c0113p, 113246208, 3126);
        }
        return L1.z.f2729a;
    }
}
