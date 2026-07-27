package g2;

import f1.C0607a;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2.i f6698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f6699e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f6700i;

    public f(g gVar, l2.i iVar, x xVar) {
        this.f6700i = gVar;
        this.f6698d = iVar;
        this.f6699e = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f6700i;
        C0607a c0607a = gVar.f6702b.f6706d;
        l2.i iVar = this.f6698d;
        o2.s sVar = (o2.s) c0607a.f6561e;
        e eVar = iVar.f7984a;
        o2.s p4 = sVar.p(eVar);
        if (p4.isEmpty()) {
            return;
        }
        h hVar = gVar.f6702b;
        hVar.b(hVar.f6713k.l(eVar, p4));
        this.f6699e.c(null);
    }
}
