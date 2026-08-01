package e5;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3889d = 1;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3890e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f3891i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function1 function1, ld.a aVar) {
        super(2, aVar);
        this.f3891i = function1;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f3889d) {
            case 0:
                d dVar = new d(aVar, this.f3891i);
                dVar.f3890e = obj;
                return dVar;
            default:
                d dVar2 = new d(this.f3891i, aVar);
                dVar2.f3890e = obj;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3889d) {
            case 0:
                return ((d) create((b5.j) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                return ((d) create((b4.a) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
        }
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f3889d;
        Function1 function1 = this.f3891i;
        switch (i3) {
            case 0:
                md.a aVar = md.a.f6622d;
                cf.c.M(obj);
                b5.j jVar = (b5.j) this.f3890e;
                jVar.getClass();
                return function1.invoke(jVar.b());
            default:
                md.a aVar2 = md.a.f6622d;
                cf.c.M(obj);
                function1.invoke((b4.a) this.f3890e);
                return Unit.f5554a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ld.a aVar, Function1 function1) {
        super(2, aVar);
        this.f3891i = function1;
    }
}
