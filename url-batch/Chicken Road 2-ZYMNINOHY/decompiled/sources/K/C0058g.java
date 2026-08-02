package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: K.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058g extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f1356a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1357b;

    /* renamed from: c, reason: collision with root package name */
    public int f1358c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f1360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058g(List list, ArrayList arrayList, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1360e = list;
        this.f1361f = arrayList;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        C0058g c0058g = new C0058g(this.f1360e, this.f1361f, interfaceC0425c);
        c0058g.f1359d = obj;
        return c0058g;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0058g) create(obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1358c;
        if (i4 == 0) {
            O3.l.w(obj);
            obj = this.f1359d;
            it = this.f1360e.iterator();
            list = this.f1361f;
        } else if (i4 == 1) {
            Object obj2 = this.f1357b;
            Iterator it2 = this.f1356a;
            List list2 = (List) this.f1359d;
            O3.l.w(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0057f(1, null));
                this.f1359d = list2;
                this.f1356a = it2;
                this.f1357b = null;
                this.f1358c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f1356a;
            list = (List) this.f1359d;
            O3.l.w(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f1359d = list;
        this.f1356a = it;
        this.f1357b = obj;
        this.f1358c = 1;
        throw null;
    }
}
