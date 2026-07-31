package j4;

import a4.i;
import androidx.lifecycle.u;
import c.j;
import java.util.Map;
import m0.g0;
import o.j0;
import p4.p;
import q6.s;
import v0.h;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4016d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f4013a = i;
        this.f4014b = obj;
        this.f4015c = obj2;
        this.f4016d = obj3;
    }

    @Override // m0.g0
    public final void a() {
        switch (this.f4013a) {
            case 0:
                ((u) this.f4014b).g().f((a) this.f4015c);
                j jVar = (j) ((s) this.f4016d).f6205d;
                if (jVar != null) {
                    jVar.a();
                    break;
                }
                break;
            case 1:
                p pVar = (p) this.f4014b;
                o4.d dVar = (o4.d) this.f4015c;
                pVar.b().c(dVar);
                ((w0.p) this.f4016d).remove(dVar);
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                w0.p pVar2 = (w0.p) this.f4014b;
                Object obj = this.f4015c;
                pVar2.remove(obj);
                ((q.p) this.f4016d).f5889d.k(obj);
                break;
            default:
                v0.d dVar2 = (v0.d) this.f4014b;
                j0 j0Var = dVar2.f7436e;
                Object obj2 = this.f4015c;
                Object k3 = j0Var.k(obj2);
                h hVar = (h) this.f4016d;
                if (k3 == hVar) {
                    Map map = dVar2.f7435d;
                    Map d8 = hVar.d();
                    if (!d8.isEmpty()) {
                        map.put(obj2, d8);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }
}
