package m5;

import D4.InterfaceC0022w;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class j extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11227c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f11228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n5.d f11229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, String str, l lVar2, n5.d dVar, long j2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f11226b = lVar;
        this.f11227c = str;
        this.f11228d = lVar2;
        this.f11229e = dVar;
        this.f11230f = j2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        j jVar = new j(this.f11226b, this.f11227c, this.f11228d, this.f11229e, this.f11230f, interfaceC1218d);
        jVar.f11225a = obj;
        return jVar;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2);
        v vVar = v.f5689a;
        jVar.invokeSuspend(vVar);
        return vVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        InterfaceC0022w interfaceC0022w = (InterfaceC0022w) this.f11225a;
        l lVar = this.f11226b;
        n nVar = lVar.f11235a;
        StringBuilder sb = new StringBuilder("Now loading ");
        String str = this.f11227c;
        sb.append(str);
        nVar.c(sb.toString());
        int load = lVar.f11241g.f11243a.load(str, 1);
        lVar.f11241g.f11244b.put(new Integer(load), this.f11228d);
        lVar.f11238d = new Integer(load);
        lVar.f11235a.c("time to call load() for " + this.f11229e + ": " + (System.currentTimeMillis() - this.f11230f) + " player=" + interfaceC0022w);
        return v.f5689a;
    }
}
