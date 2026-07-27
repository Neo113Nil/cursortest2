package M;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: M.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079h extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f1691a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1692b;

    /* renamed from: c, reason: collision with root package name */
    public int f1693c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f1695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079h(List list, ArrayList arrayList, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1695e = list;
        this.f1696f = arrayList;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        C0079h c0079h = new C0079h(this.f1695e, this.f1696f, interfaceC1218d);
        c0079h.f1694d = obj;
        return c0079h;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0079h) create(obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1693c;
        if (i2 == 0) {
            e5.g.y(obj);
            obj = this.f1694d;
            it = this.f1695e.iterator();
            list = this.f1696f;
        } else if (i2 == 1) {
            Object obj2 = this.f1692b;
            Iterator it2 = this.f1691a;
            List list2 = (List) this.f1694d;
            e5.g.y(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0078g(1, null));
                this.f1694d = list2;
                this.f1691a = it2;
                this.f1692b = null;
                this.f1693c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f1691a;
            list = (List) this.f1694d;
            e5.g.y(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f1694d = list;
        this.f1691a = it;
        this.f1692b = obj;
        this.f1693c = 1;
        throw null;
    }
}
