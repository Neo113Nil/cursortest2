package P;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: P.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143h extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public Iterator f2089d;

    /* renamed from: e, reason: collision with root package name */
    public R.c f2090e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2091i;

    /* renamed from: l, reason: collision with root package name */
    public int f2092l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2093m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f2094n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2095o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0143h(List list, ArrayList arrayList, V5.b bVar) {
        super(2, bVar);
        this.f2094n = list;
        this.f2095o = arrayList;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C0143h c0143h = new C0143h(this.f2094n, this.f2095o, bVar);
        c0143h.f2093m = obj;
        return c0143h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0143h) create(obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        R.c cVar;
        Iterator it2;
        Object obj2;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2092l;
        if (i2 == 0) {
            V6.b.P(obj);
            obj = this.f2093m;
            it = this.f2094n.iterator();
            list = this.f2095o;
        } else if (i2 == 1) {
            obj2 = this.f2091i;
            R.c cVar2 = this.f2090e;
            it2 = this.f2089d;
            List list2 = (List) this.f2093m;
            V6.b.P(obj);
            cVar = cVar2;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new C0142g(cVar, null));
                this.f2093m = list;
                this.f2089d = it2;
                this.f2090e = null;
                this.f2091i = null;
                this.f2092l = 2;
                obj = cVar.f2362b.invoke(new R.e((SharedPreferences) cVar.f2365e.getValue(), cVar.f2366f), obj2, this);
                if (obj != aVar) {
                    it = it2;
                }
                return aVar;
            }
            obj = obj2;
            it = it2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f2089d;
            list = (List) this.f2093m;
            V6.b.P(obj);
        }
        if (!it.hasNext()) {
            R.c cVar3 = (R.c) it.next();
            this.f2093m = list;
            this.f2089d = it;
            this.f2090e = cVar3;
            this.f2091i = obj;
            this.f2092l = 1;
            Object a7 = cVar3.a(obj, this);
            if (a7 != aVar) {
                Iterator it3 = it;
                obj2 = obj;
                obj = a7;
                cVar = cVar3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return aVar;
        }
    }
}
