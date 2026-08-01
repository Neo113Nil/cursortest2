package x3;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public wd.a0 f10488d;

    /* renamed from: e, reason: collision with root package name */
    public int f10489e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10490i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ wd.a0 f10491r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f10492s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10493t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f10494u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wd.a0 a0Var, z zVar, Object obj, boolean z10, ld.a aVar) {
        super(2, aVar);
        this.f10491r = a0Var;
        this.f10492s = zVar;
        this.f10493t = obj;
        this.f10494u = z10;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        y yVar = new y(this.f10491r, this.f10492s, this.f10493t, this.f10494u, aVar);
        yVar.f10490i = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((k0) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k0 k0Var;
        wd.a0 a0Var;
        md.a aVar = md.a.f6622d;
        int i3 = this.f10489e;
        Object obj2 = this.f10493t;
        z zVar = this.f10492s;
        wd.a0 a0Var2 = this.f10491r;
        if (i3 == 0) {
            cf.c.M(obj);
            k0 k0Var2 = (k0) this.f10490i;
            s0 i10 = zVar.i();
            this.f10490i = k0Var2;
            this.f10488d = a0Var2;
            this.f10489e = 1;
            Integer num = new Integer(((AtomicInteger) i10.f10452b.f9767e).incrementAndGet());
            if (num != aVar) {
                k0Var = k0Var2;
                obj = num;
                a0Var = a0Var2;
            }
            return aVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            if (this.f10494u) {
                zVar.f10502v.b(new c(obj2 != null ? obj2.hashCode() : 0, a0Var2.f10139d, obj2));
            }
            return Unit.f5554a;
        }
        a0Var = this.f10488d;
        k0Var = (k0) this.f10490i;
        cf.c.M(obj);
        a0Var.f10139d = ((Number) obj).intValue();
        this.f10490i = null;
        this.f10488d = null;
        this.f10489e = 2;
        if (k0Var.f10348b.get()) {
            kotlin.collections.i0.l("This scope has already been closed.");
            return null;
        }
        Object a9 = j0.a(k0Var.f10347a, new w(k0Var, obj2, null), this);
        if (a9 != aVar) {
            a9 = Unit.f5554a;
        }
    }
}
