package a3;

import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f221e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f222i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f223r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z10, n nVar, long j, ld.a aVar) {
        super(2, aVar);
        this.f221e = z10;
        this.f222i = nVar;
        this.f223r = j;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        return new j(this.f221e, this.f222i, this.f223r, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f6622d;
        int i3 = this.f220d;
        if (i3 == 0) {
            cf.c.M(obj);
            w1.c cVar = this.f222i.f233d;
            if (this.f221e) {
                this.f220d = 2;
                obj = cVar.a(this.f223r, 0L, this);
            } else {
                this.f220d = 1;
                obj = cVar.a(0L, this.f223r, this);
            }
            return aVar;
        }
        if (i3 == 1) {
            cf.c.M(obj);
            ((x2.p) obj).getClass();
        } else {
            if (i3 != 2) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            ((x2.p) obj).getClass();
        }
        return Unit.f5554a;
    }
}
