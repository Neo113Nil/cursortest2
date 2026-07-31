package r1;

import I.InterfaceC0088c0;
import I.X0;
import java.util.List;
import java.util.Map;
import l.C0561f;
import l.C0568m;
import l.F;
import l.G;
import l.M;
import q1.C0784h;

/* loaded from: classes.dex */
public final class x extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f7280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0857i f7281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7283h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7284i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X0 f7285j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f7286k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Map map, C0857i c0857i, Y1.c cVar, Y1.c cVar2, Y1.c cVar3, X0 x02, InterfaceC0088c0 interfaceC0088c0) {
        super(1);
        this.f7280e = map;
        this.f7281f = c0857i;
        this.f7282g = cVar;
        this.f7283h = cVar2;
        this.f7284i = cVar3;
        this.f7285j = x02;
        this.f7286k = interfaceC0088c0;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        C0568m c0568m = (C0568m) obj;
        float f3 = 0.0f;
        if (!((List) this.f7285j.getValue()).contains(c0568m.b())) {
            return new l.w(F.f5431b, G.f5433b, 0.0f, new M(true, C0561f.f5466e));
        }
        String str = ((C0784h) c0568m.b()).f6899i;
        Map map = this.f7280e;
        Float f4 = (Float) map.get(str);
        if (f4 != null) {
            f3 = f4.floatValue();
        } else {
            map.put(((C0784h) c0568m.b()).f6899i, Float.valueOf(0.0f));
        }
        if (!Z1.i.a(((C0784h) c0568m.c()).f6899i, ((C0784h) c0568m.b()).f6899i)) {
            f3 = (((Boolean) this.f7281f.f7223c.getValue()).booleanValue() || ((Boolean) this.f7286k.getValue()).booleanValue()) ? f3 - 1.0f : f3 + 1.0f;
        }
        map.put(((C0784h) c0568m.c()).f6899i, Float.valueOf(f3));
        return new l.w((F) this.f7282g.j(c0568m), (G) this.f7283h.j(c0568m), f3, (M) this.f7284i.j(c0568m));
    }
}
