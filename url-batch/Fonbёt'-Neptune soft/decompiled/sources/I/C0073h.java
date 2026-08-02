package I;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: I.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073h extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f647i;

    /* renamed from: j, reason: collision with root package name */
    public Object f648j;

    /* renamed from: k, reason: collision with root package name */
    public int f649k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f650l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f651m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f652n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073h(List list, ArrayList arrayList, H0.d dVar) {
        super(2, dVar);
        this.f651m = list;
        this.f652n = arrayList;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        C0073h c0073h = new C0073h(this.f651m, this.f652n, dVar);
        c0073h.f650l = obj;
        return c0073h;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0073h) b((H0.d) obj2, obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        Iterator it;
        List list;
        int i2 = this.f649k;
        if (i2 == 0) {
            i1.a.G(obj);
            obj = this.f650l;
            it = this.f651m.iterator();
            list = this.f652n;
        } else if (i2 == 1) {
            Object obj2 = this.f648j;
            Iterator it2 = this.f647i;
            List list2 = (List) this.f650l;
            i1.a.G(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0072g(1, null));
                this.f650l = list2;
                this.f647i = it2;
                this.f648j = null;
                this.f649k = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f647i;
            list = (List) this.f650l;
            i1.a.G(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f650l = list;
        this.f647i = it;
        this.f648j = obj;
        this.f649k = 1;
        throw null;
    }
}
