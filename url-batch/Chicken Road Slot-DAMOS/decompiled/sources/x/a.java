package x;

import ge.c1;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public z.i f10167d;

    /* renamed from: e, reason: collision with root package name */
    public int f10168e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c1 f10169i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f10170r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z.f f10171s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c1 c1Var, long j, z.f fVar, ld.a aVar) {
        super(2, aVar);
        this.f10169i = c1Var;
        this.f10170r = j;
        this.f10171s = fVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        return new a(this.f10169i, this.f10170r, this.f10171s, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r2.a(r1, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.a(r8, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r7.f10169i.w(r7) == r0) goto L20;
     */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z.i iVar;
        md.a aVar = md.a.f6622d;
        int i3 = this.f10168e;
        z.f fVar = this.f10171s;
        if (i3 == 0) {
            cf.c.M(obj);
            this.f10168e = 1;
        } else if (i3 == 1) {
            cf.c.M(obj);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    cf.c.M(obj);
                    return Unit.f5554a;
                }
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iVar = this.f10167d;
            cf.c.M(obj);
            this.f10167d = null;
            this.f10168e = 3;
        }
        z.h hVar = new z.h(this.f10170r);
        iVar = new z.i(hVar);
        this.f10167d = iVar;
        this.f10168e = 2;
    }
}
