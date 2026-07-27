package b2;

import G.C0231x;
import g2.n;
import g2.s;
import g2.w;
import java.util.List;
import o2.C0924c;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f5644e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0519c f5645i;

    public /* synthetic */ i(C0519c c0519c, w wVar, int i2) {
        this.f5643d = i2;
        this.f5645i = c0519c;
        this.f5644e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List o4;
        List list;
        switch (this.f5643d) {
            case 0:
                g2.h hVar = this.f5645i.f5633a;
                w wVar = this.f5644e;
                hVar.getClass();
                C0924c c0924c = g2.c.f6679a;
                l2.i iVar = wVar.f6769f;
                if (c0924c.equals(iVar.f7984a.C())) {
                    s sVar = hVar.f6713k;
                    sVar.getClass();
                    o4 = sVar.o(iVar, wVar, null);
                } else {
                    s sVar2 = hVar.f6714l;
                    sVar2.getClass();
                    o4 = sVar2.o(iVar, wVar, null);
                }
                hVar.b(o4);
                break;
            default:
                g2.h hVar2 = this.f5645i.f5633a;
                hVar2.getClass();
                w wVar2 = this.f5644e;
                C0924c C3 = wVar2.f6769f.f7984a.C();
                if (C3 == null || !C3.equals(g2.c.f6679a)) {
                    s sVar3 = hVar2.f6714l;
                    sVar3.getClass();
                    list = (List) ((C0231x) sVar3.f6757g).a(new n(sVar3, wVar2, 0));
                } else {
                    s sVar4 = hVar2.f6713k;
                    sVar4.getClass();
                    list = (List) ((C0231x) sVar4.f6757g).a(new n(sVar4, wVar2, 0));
                }
                hVar2.b(list);
                break;
        }
    }
}
