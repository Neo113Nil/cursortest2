package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405e extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public Iterator f3555n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3556u;

    /* renamed from: v, reason: collision with root package name */
    public int f3557v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3558w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f3559x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3560y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0405e(List list, ArrayList arrayList, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f3559x = list;
        this.f3560y = arrayList;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        C0405e c0405e = new C0405e(this.f3559x, this.f3560y, interfaceC5133d);
        c0405e.f3558w = obj;
        return c0405e;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0405e) create(obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f3557v;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            obj = this.f3558w;
            it = this.f3559x.iterator();
            list = this.f3560y;
        } else if (i == 1) {
            Object obj2 = this.f3556u;
            Iterator it2 = this.f3555n;
            List list2 = (List) this.f3558w;
            com.bumptech.glide.f.r(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0404d(1, null));
                this.f3558w = list2;
                this.f3555n = it2;
                this.f3556u = null;
                this.f3557v = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f3555n;
            list = (List) this.f3558w;
            com.bumptech.glide.f.r(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f3558w = list;
        this.f3555n = it;
        this.f3556u = obj;
        this.f3557v = 1;
        throw null;
    }
}
