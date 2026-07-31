package Q1;

import R1.y;
import e2.InterfaceC0428g;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends X1.i implements InterfaceC0428g {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ J1.c f3974h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ List f3975i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ List f3976j;

    @Override // e2.InterfaceC0428g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        e eVar = new e(4, (V1.d) obj4);
        eVar.f3974h = (J1.c) obj;
        eVar.f3975i = (List) obj2;
        eVar.f3976j = (List) obj3;
        return eVar.q(y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        return new d(this.f3974h, this.f3975i.size(), S1.l.X0(this.f3976j, 5));
    }
}
