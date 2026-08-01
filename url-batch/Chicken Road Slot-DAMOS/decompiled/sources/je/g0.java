package je;

import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends nd.i implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public int f5163d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ f f5164e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f5165i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i0 f5166r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, ld.a aVar) {
        super(3, aVar);
        this.f5166r = i0Var;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        g0 g0Var = new g0(this.f5166r, (ld.a) obj3);
        g0Var.f5164e = (f) obj;
        g0Var.f5165i = intValue;
        return g0Var.invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if (r0.b(r11, r10) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (ge.a0.i(Long.MAX_VALUE, r10) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r0.b(r11, r10) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r0.b(r11, r10) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (ge.a0.i(0, r10) == r2) goto L32;
     */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar = this.f5164e;
        int i3 = this.f5165i;
        md.a aVar = md.a.f6622d;
        int i10 = this.f5163d;
        if (i10 == 0) {
            cf.c.M(obj);
            if (i3 > 0) {
                d0 d0Var = d0.f5150d;
                this.f5164e = null;
                this.f5165i = i3;
                this.f5163d = 1;
            } else {
                this.f5164e = fVar;
                this.f5165i = i3;
                this.f5163d = 2;
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                cf.c.M(obj);
                d0 d0Var2 = d0.f5151e;
                this.f5164e = fVar;
                this.f5165i = i3;
                this.f5163d = 3;
            } else if (i10 == 3) {
                cf.c.M(obj);
                this.f5164e = fVar;
                this.f5165i = i3;
                this.f5163d = 4;
            } else if (i10 == 4) {
                cf.c.M(obj);
                d0 d0Var3 = d0.f5152i;
                this.f5164e = null;
                this.f5165i = i3;
                this.f5163d = 5;
            } else if (i10 != 5) {
                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cf.c.M(obj);
        return Unit.f5554a;
    }
}
