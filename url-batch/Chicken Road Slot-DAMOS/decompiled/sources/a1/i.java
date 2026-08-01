package a1;

import androidx.lifecycle.u;
import b1.w;
import java.util.Map;
import n0.a0;
import s.h0;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i3) {
        this.f28a = i3;
        this.f29b = obj;
        this.f30c = obj2;
        this.f31d = obj3;
    }

    @Override // n0.a0
    public final void a() {
        switch (this.f28a) {
            case 0:
                j jVar = (j) this.f29b;
                h0 h0Var = jVar.f34b;
                Object obj = this.f30c;
                Object k10 = h0Var.k(obj);
                q qVar = (q) this.f31d;
                if (k10 == qVar) {
                    Map map = jVar.f33a;
                    Map d10 = qVar.d();
                    if (!d10.isEmpty()) {
                        map.put(obj, d10);
                        break;
                    } else {
                        map.remove(obj);
                        break;
                    }
                }
                break;
            case 1:
                ((u) this.f29b).g().f((i4.a) this.f30c);
                e.d dVar = (e.d) ((b0) this.f31d).f10141d;
                if (dVar != null) {
                    dVar.a();
                    break;
                }
                break;
            case 2:
                o4.o oVar = (o4.o) this.f29b;
                n4.h hVar = (n4.h) this.f30c;
                oVar.b().c(hVar);
                ((w) this.f31d).remove(hVar);
                break;
            default:
                w wVar = (w) this.f29b;
                Object obj2 = this.f30c;
                wVar.remove(obj2);
                ((u.o) this.f31d).f9539d.k(obj2);
                break;
        }
    }
}
