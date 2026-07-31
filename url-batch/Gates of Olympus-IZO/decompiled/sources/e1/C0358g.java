package e1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: e1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358g extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Iterator f4694e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4695f;

    /* renamed from: g, reason: collision with root package name */
    public int f4696g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4697h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f4698i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4699j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0358g(List list, ArrayList arrayList, P1.d dVar) {
        super(2, dVar);
        this.f4698i = list;
        this.f4699j = arrayList;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0358g c0358g = new C0358g(this.f4698i, this.f4699j, dVar);
        c0358g.f4697h = obj;
        return c0358g;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0358g) create(obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4696g;
        if (i3 == 0) {
            I2.l.Q(obj);
            obj = this.f4697h;
            it = this.f4698i.iterator();
            list = this.f4699j;
        } else if (i3 == 1) {
            Object obj2 = this.f4695f;
            Iterator it2 = this.f4694e;
            List list2 = (List) this.f4697h;
            I2.l.Q(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0357f(1, null));
                this.f4697h = list2;
                this.f4694e = it2;
                this.f4695f = null;
                this.f4696g = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f4694e;
            list = (List) this.f4697h;
            I2.l.Q(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f4697h = list;
        this.f4694e = it;
        this.f4695f = obj;
        this.f4696g = 1;
        throw null;
    }
}
