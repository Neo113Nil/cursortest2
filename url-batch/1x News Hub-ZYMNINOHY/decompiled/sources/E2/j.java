package E2;

import b2.C0195i;
import d2.InterfaceC0300c;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class j extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ InterfaceC1210u f437e;
    public final /* synthetic */ l f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f438g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f439h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F2.d f440i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f441j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, String str, l lVar2, F2.d dVar, long j3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = lVar;
        this.f438g = str;
        this.f439h = lVar2;
        this.f440i = dVar;
        this.f441j = j3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        j jVar = new j(this.f, this.f438g, this.f439h, this.f440i, this.f441j, interfaceC0300c);
        jVar.f437e = (InterfaceC1210u) obj;
        return jVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        android.support.v4.media.session.a.T(obj);
        InterfaceC1210u interfaceC1210u = this.f437e;
        l lVar = this.f;
        p pVar = lVar.f445a;
        String str = this.f438g;
        pVar.c("Now loading ".concat(str));
        int load = lVar.f450g.f452a.load(str, 1);
        lVar.f450g.f453b.put(new Integer(load), this.f439h);
        lVar.f448d = new Integer(load);
        lVar.f445a.c("time to call load() for " + this.f440i + ": " + (System.currentTimeMillis() - this.f441j) + " player=" + interfaceC1210u);
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj);
        C0195i c0195i = C0195i.f2555a;
        jVar.g(c0195i);
        return c0195i;
    }
}
