package h1;

import e2.InterfaceC0426e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: h1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489g extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public Iterator f6147h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6148i;

    /* renamed from: j, reason: collision with root package name */
    public int f6149j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6150k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f6151l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6152m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0489g(List list, ArrayList arrayList, V1.d dVar) {
        super(2, dVar);
        this.f6151l = list;
        this.f6152m = arrayList;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0489g) o((V1.d) obj2, obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0489g c0489g = new C0489g(this.f6151l, this.f6152m, dVar);
        c0489g.f6150k = obj;
        return c0489g;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        Iterator it;
        List list;
        int i3 = this.f6149j;
        if (i3 == 0) {
            R1.a.e(obj);
            obj = this.f6150k;
            it = this.f6151l.iterator();
            list = this.f6152m;
        } else if (i3 == 1) {
            Object obj2 = this.f6148i;
            Iterator it2 = this.f6147h;
            List list2 = (List) this.f6150k;
            R1.a.e(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0488f(1, null));
                this.f6150k = list2;
                this.f6147h = it2;
                this.f6148i = null;
                this.f6149j = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f6147h;
            list = (List) this.f6150k;
            R1.a.e(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f6150k = list;
        this.f6147h = it;
        this.f6148i = obj;
        this.f6149j = 1;
        throw null;
    }
}
