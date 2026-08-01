package a3;

import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f225e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f226i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, long j, ld.a aVar) {
        super(2, aVar);
        this.f225e = nVar;
        this.f226i = j;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        return new k(this.f225e, this.f226i, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f6622d;
        int i3 = this.f224d;
        if (i3 == 0) {
            cf.c.M(obj);
            w1.c cVar = this.f225e.f233d;
            this.f224d = 1;
            if (cVar.b(this.f226i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
        }
        return Unit.f5554a;
    }
}
