package X3;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import o3.p;
import x3.InterfaceC1560u;

/* loaded from: classes.dex */
public final class i extends h3.g implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f3630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y3.d f3631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, String str, k kVar2, Y3.d dVar, long j4, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f3628b = kVar;
        this.f3629c = str;
        this.f3630d = kVar2;
        this.f3631e = dVar;
        this.f3632f = j4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        i iVar = new i(this.f3628b, this.f3629c, this.f3630d, this.f3631e, this.f3632f, interfaceC0425c);
        iVar.f3627a = obj;
        return iVar;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        i iVar = (i) create((InterfaceC1560u) obj, (InterfaceC0425c) obj2);
        C0297i c0297i = C0297i.f5732a;
        iVar.invokeSuspend(c0297i);
        return c0297i;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1560u interfaceC1560u = (InterfaceC1560u) this.f3627a;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        O3.l.w(obj);
        k kVar = this.f3628b;
        o oVar = kVar.f3637a;
        StringBuilder sb = new StringBuilder("Now loading ");
        String str = this.f3629c;
        sb.append(str);
        oVar.c(sb.toString());
        int load = kVar.f3643g.f3645a.load(str, 1);
        kVar.f3643g.f3646b.put(new Integer(load), this.f3630d);
        kVar.f3640d = new Integer(load);
        kVar.f3637a.c("time to call load() for " + this.f3631e + ": " + (System.currentTimeMillis() - this.f3632f) + " player=" + interfaceC1560u);
        return C0297i.f5732a;
    }
}
