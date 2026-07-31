package u1;

import I.InterfaceC0142c0;
import I.W0;
import e2.InterfaceC0424c;
import java.util.List;
import java.util.Map;
import l.C0579e;
import l.C0586l;
import l.G;
import l.H;
import l.N;
import t1.C1028h;

/* loaded from: classes.dex */
public final class w extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f9650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f9651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9652g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9653h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9654i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W0 f9655j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f9656k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Map map, i iVar, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, InterfaceC0424c interfaceC0424c3, W0 w02, InterfaceC0142c0 interfaceC0142c0) {
        super(1);
        this.f9650e = map;
        this.f9651f = iVar;
        this.f9652g = interfaceC0424c;
        this.f9653h = interfaceC0424c2;
        this.f9654i = interfaceC0424c3;
        this.f9655j = w02;
        this.f9656k = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        C0586l c0586l = (C0586l) obj;
        float f3 = 0.0f;
        if (!((List) this.f9655j.getValue()).contains(c0586l.b())) {
            return new l.w(G.f6452b, H.f6454b, 0.0f, new N(true, C0579e.f6486f));
        }
        String str = ((C1028h) c0586l.b()).f8878i;
        Map map = this.f9650e;
        Float f4 = (Float) map.get(str);
        if (f4 != null) {
            f3 = f4.floatValue();
        } else {
            map.put(((C1028h) c0586l.b()).f8878i, Float.valueOf(0.0f));
        }
        if (!f2.j.a(((C1028h) c0586l.c()).f8878i, ((C1028h) c0586l.b()).f8878i)) {
            f3 = (((Boolean) this.f9651f.f9593c.getValue()).booleanValue() || ((Boolean) this.f9656k.getValue()).booleanValue()) ? f3 - 1.0f : f3 + 1.0f;
        }
        map.put(((C1028h) c0586l.c()).f8878i, Float.valueOf(f3));
        return new l.w((G) this.f9652g.n(c0586l), (H) this.f9653h.n(c0586l), f3, (N) this.f9654i.n(c0586l));
    }
}
