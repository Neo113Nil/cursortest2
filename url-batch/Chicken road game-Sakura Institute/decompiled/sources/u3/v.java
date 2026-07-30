package u3;

import g0.m2;
import g0.z0;
import java.util.List;
import java.util.Map;
import k.h0;
import k.i0;
import k.o0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Map f9025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f9026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.c f9027i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q6.c f9028j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q6.c f9029k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m2 f9030l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z0 f9031m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Map map, i iVar, q6.c cVar, q6.c cVar2, q6.c cVar3, m2 m2Var, z0 z0Var) {
        super(1);
        this.f9025g = map;
        this.f9026h = iVar;
        this.f9027i = cVar;
        this.f9028j = cVar2;
        this.f9029k = cVar3;
        this.f9030l = m2Var;
        this.f9031m = z0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        k.m mVar = (k.m) obj;
        float f9 = 0.0f;
        if (!((List) this.f9030l.getValue()).contains(mVar.b())) {
            return new k.v(h0.f5221b, i0.f5223b, 0.0f, new o0(k.f.f5205g));
        }
        String str = ((t3.h) mVar.b()).f8796k;
        Map map = this.f9025g;
        Float f10 = (Float) map.get(str);
        if (f10 != null) {
            f9 = f10.floatValue();
        } else {
            map.put(((t3.h) mVar.b()).f8796k, Float.valueOf(0.0f));
        }
        if (!r6.k.a(((t3.h) mVar.c()).f8796k, ((t3.h) mVar.b()).f8796k)) {
            f9 = (((Boolean) this.f9026h.f8994c.getValue()).booleanValue() || ((Boolean) this.f9031m.getValue()).booleanValue()) ? f9 - 1.0f : f9 + 1.0f;
        }
        map.put(((t3.h) mVar.c()).f8796k, Float.valueOf(f9));
        return new k.v((h0) this.f9027i.f(mVar), (i0) this.f9028j.f(mVar), f9, (o0) this.f9029k.f(mVar));
    }
}
