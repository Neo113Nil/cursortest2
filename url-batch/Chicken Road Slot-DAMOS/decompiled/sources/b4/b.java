package b4;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import nd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1094d;

    /* renamed from: e, reason: collision with root package name */
    public int f1095e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1096i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f1097r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Function2 function2, ld.a aVar, int i3) {
        super(2, aVar);
        this.f1094d = i3;
        switch (i3) {
            case 1:
                this.f1097r = (i) function2;
                super(2, aVar);
                break;
            default:
                this.f1097r = (i) function2;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f1094d) {
            case 0:
                b bVar = new b(this.f1097r, aVar, 0);
                bVar.f1096i = obj;
                return bVar;
            default:
                b bVar2 = new b(this.f1097r, aVar, 1);
                bVar2.f1096i = obj;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        ld.a aVar2 = (ld.a) obj2;
        switch (this.f1094d) {
        }
        return ((b) create(aVar, aVar2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r5v13, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1094d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f1095e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    a aVar2 = (a) this.f1096i;
                    this.f1095e = 1;
                    obj = this.f1097r.invoke(aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                a aVar3 = (a) obj;
                aVar3.getClass();
                ((AtomicBoolean) aVar3.f1093b.f3701e).set(true);
                return aVar3;
            default:
                md.a aVar4 = md.a.f6622d;
                int i10 = this.f1095e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    a aVar5 = new a(new LinkedHashMap(((a) this.f1096i).a()), false);
                    this.f1096i = aVar5;
                    this.f1095e = 1;
                    return this.f1097r.invoke(aVar5, this) == aVar4 ? aVar4 : aVar5;
                }
                if (i10 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a aVar6 = (a) this.f1096i;
                cf.c.M(obj);
                return aVar6;
        }
    }
}
