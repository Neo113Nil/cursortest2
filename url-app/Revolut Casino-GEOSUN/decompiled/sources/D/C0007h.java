package D;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u0.C0247g;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f196i;

    /* renamed from: j, reason: collision with root package name */
    public Object f197j;

    /* renamed from: k, reason: collision with root package name */
    public int f198k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f199l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f200m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f201n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007h(List list, ArrayList arrayList, w0.d dVar) {
        super(2, dVar);
        this.f200m = list;
        this.f201n = arrayList;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        C0007h c0007h = new C0007h(this.f200m, this.f201n, dVar);
        c0007h.f199l = obj;
        return c0007h;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0007h) b(obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        Iterator it;
        List list;
        int i2 = this.f198k;
        if (i2 == 0) {
            o.g.z(obj);
            obj = this.f199l;
            it = this.f200m.iterator();
            list = this.f201n;
        } else if (i2 == 1) {
            Object obj2 = this.f197j;
            Iterator it2 = this.f196i;
            List list2 = (List) this.f199l;
            o.g.z(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0006g(1, null));
                this.f199l = list2;
                this.f196i = it2;
                this.f197j = null;
                this.f198k = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f196i;
            list = (List) this.f199l;
            o.g.z(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f199l = list;
        this.f196i = it;
        this.f197j = obj;
        this.f198k = 1;
        throw null;
    }
}
