package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: K.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043g extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public Iterator f766e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public int f767g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f768h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f769i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f770j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0043g(List list, ArrayList arrayList, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f769i = list;
        this.f770j = arrayList;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        C0043g c0043g = new C0043g(this.f769i, this.f770j, interfaceC0300c);
        c0043g.f768h = obj;
        return c0043g;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        Iterator it;
        List list;
        int i3 = this.f767g;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            obj = this.f768h;
            it = this.f769i.iterator();
            list = this.f770j;
        } else if (i3 == 1) {
            Object obj2 = this.f;
            Iterator it2 = this.f766e;
            List list2 = (List) this.f768h;
            android.support.v4.media.session.a.T(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0042f(1, null));
                this.f768h = list2;
                this.f766e = it2;
                this.f = null;
                this.f767g = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f766e;
            list = (List) this.f768h;
            android.support.v4.media.session.a.T(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f768h = list;
        this.f766e = it;
        this.f = obj;
        this.f767g = 1;
        throw null;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0043g) b((InterfaceC0300c) obj2, obj)).g(C0195i.f2555a);
    }
}
