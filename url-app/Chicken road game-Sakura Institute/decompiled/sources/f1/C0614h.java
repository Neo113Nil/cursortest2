package f1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614h extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public Iterator f6576k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6577l;

    /* renamed from: m, reason: collision with root package name */
    public int f6578m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f6579n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f6580o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6581p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0614h(List list, ArrayList arrayList, C2.a aVar) {
        super(2, aVar);
        this.f6580o = list;
        this.f6581p = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0614h) j((C2.a) obj2, obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0614h c0614h = new C0614h(this.f6580o, this.f6581p, aVar);
        c0614h.f6579n = obj;
        return c0614h;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Iterator it;
        List list;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6578m;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            obj = this.f6579n;
            it = this.f6580o.iterator();
            list = this.f6581p;
        } else if (i2 == 1) {
            Object obj2 = this.f6577l;
            Iterator it2 = this.f6576k;
            List list2 = (List) this.f6579n;
            AbstractC1343r.b(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0613g(1, null));
                this.f6579n = list2;
                this.f6576k = it2;
                this.f6577l = null;
                this.f6578m = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f6576k;
            list = (List) this.f6579n;
            AbstractC1343r.b(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f6579n = list;
        this.f6576k = it;
        this.f6577l = obj;
        this.f6578m = 1;
        throw null;
    }
}
