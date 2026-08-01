package a4;

import b5.d0;
import b5.t;
import ge.a0;
import ge.n;
import ge.x;
import ge.x0;
import ge.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.z0;
import x3.t0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f285d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f286e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f287i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Function1 function1, z0 z0Var, ld.a aVar) {
        super(2, aVar);
        this.f285d = 3;
        this.f286e = function1;
        this.f287i = z0Var;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f285d) {
            case 0:
                l lVar = new l((Set) this.f287i, aVar, 0);
                lVar.f286e = obj;
                return lVar;
            case 1:
                l lVar2 = new l((Function2) this.f287i, aVar);
                lVar2.f286e = obj;
                return lVar2;
            case 2:
                l lVar3 = new l(aVar, (a1.d) this.f287i);
                lVar3.f286e = obj;
                return lVar3;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return new l((Function1) this.f286e, (z0) this.f287i, aVar);
            case j.LONG_FIELD_NUMBER /* 4 */:
                l lVar4 = new l((t0) this.f287i, aVar, 4);
                lVar4.f286e = obj;
                return lVar4;
            default:
                l lVar5 = new l((x4.c) this.f287i, aVar, 5);
                lVar5.f286e = obj;
                return lVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f285d) {
            case 0:
                return ((l) create((b4.a) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 1:
                return ((l) create((x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 2:
                return ((l) create((b5.j) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return ((l) create((x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case j.LONG_FIELD_NUMBER /* 4 */:
                return ((l) create((t0) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                ((l) create((x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f285d;
        ld.a aVar = null;
        int i10 = 0;
        Object obj2 = this.f287i;
        switch (i3) {
            case 0:
                md.a aVar2 = md.a.f6622d;
                cf.c.M(obj);
                Set keySet = ((b4.a) this.f286e).a().keySet();
                ArrayList arrayList = new ArrayList(z.j(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b4.c) it.next()).f1098a);
                }
                Set set = (Set) obj2;
                if (set != m.f288a) {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                    }
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 1:
                md.a aVar3 = md.a.f6622d;
                cf.c.M(obj);
                CoroutineContext.Element m10 = ((x) this.f286e).h().m(kotlin.coroutines.d.f5591n);
                m10.getClass();
                kotlin.coroutines.d dVar = (kotlin.coroutines.d) m10;
                n a9 = a0.a();
                a0.r(x0.f4413d, dVar, y.f4420r, new t(a9, (Function2) obj2, (ld.a) null));
                while (!a9.Q()) {
                    try {
                        return a0.w(dVar, new d0(a9, aVar, i10));
                    } catch (InterruptedException unused) {
                    }
                }
                return a9.E();
            case 2:
                md.a aVar4 = md.a.f6622d;
                cf.c.M(obj);
                b5.j jVar = (b5.j) this.f286e;
                jVar.getClass();
                return ((a1.d) obj2).invoke(jVar.b());
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                md.a aVar5 = md.a.f6622d;
                cf.c.M(obj);
                z0 z0Var = (z0) obj2;
                if (((j9.a) z0Var.getValue()).f5110c) {
                    ((Function1) this.f286e).invoke(new Integer(((j9.a) z0Var.getValue()).f5108a));
                }
                return Unit.f5554a;
            case j.LONG_FIELD_NUMBER /* 4 */:
                md.a aVar6 = md.a.f6622d;
                cf.c.M(obj);
                t0 t0Var = (t0) this.f286e;
                return Boolean.valueOf((t0Var instanceof x3.c) && ((x3.c) t0Var).f10458a <= ((x3.c) ((t0) obj2)).f10458a);
            default:
                md.a aVar7 = md.a.f6622d;
                cf.c.M(obj);
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, ld.a aVar, int i3) {
        super(2, aVar);
        this.f285d = i3;
        this.f287i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Function2 function2, ld.a aVar) {
        super(2, aVar);
        this.f285d = 1;
        this.f287i = (nd.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ld.a aVar, a1.d dVar) {
        super(2, aVar);
        this.f285d = 2;
        this.f287i = dVar;
    }
}
