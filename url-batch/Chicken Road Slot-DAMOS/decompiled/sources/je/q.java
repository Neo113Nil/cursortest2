package je;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends nd.i implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public f f5219d;

    /* renamed from: e, reason: collision with root package name */
    public int f5220e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ f f5221i;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5222r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ nd.i f5223s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Function2 function2, ld.a aVar) {
        super(3, aVar);
        this.f5223s = (nd.i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        q qVar = new q(this.f5223s, (ld.a) obj3);
        qVar.f5221i = (f) obj;
        qVar.f5222r = obj2;
        return qVar.invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r0.b(r8, r7) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r8 == r2) goto L15;
     */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar = this.f5221i;
        Object obj2 = this.f5222r;
        md.a aVar = md.a.f6622d;
        int i3 = this.f5220e;
        if (i3 == 0) {
            cf.c.M(obj);
            this.f5221i = null;
            this.f5222r = null;
            this.f5219d = fVar;
            this.f5220e = 1;
            obj = this.f5223s.invoke(obj2, this);
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    cf.c.M(obj);
                    return Unit.f5554a;
                }
                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = this.f5219d;
            cf.c.M(obj);
        }
        this.f5221i = null;
        this.f5222r = null;
        this.f5219d = null;
        this.f5220e = 2;
    }
}
