package F;

import a.AbstractC0086a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: F.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026h extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f363i;

    /* renamed from: j, reason: collision with root package name */
    public Object f364j;

    /* renamed from: k, reason: collision with root package name */
    public int f365k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f366l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f367m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f368n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0026h(List list, ArrayList arrayList, G0.d dVar) {
        super(2, dVar);
        this.f367m = list;
        this.f368n = arrayList;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        C0026h c0026h = new C0026h(this.f367m, this.f368n, dVar);
        c0026h.f366l = obj;
        return c0026h;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((C0026h) b((G0.d) obj2, obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        Iterator it;
        List list;
        int i2 = this.f365k;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            obj = this.f366l;
            it = this.f367m.iterator();
            list = this.f368n;
        } else if (i2 == 1) {
            Object obj2 = this.f364j;
            Iterator it2 = this.f363i;
            List list2 = (List) this.f366l;
            AbstractC0086a.I(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0025g(1, null));
                this.f366l = list2;
                this.f363i = it2;
                this.f364j = null;
                this.f365k = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f363i;
            list = (List) this.f366l;
            AbstractC0086a.I(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f366l = list;
        this.f363i = it;
        this.f364j = obj;
        this.f365k = 1;
        throw null;
    }
}
