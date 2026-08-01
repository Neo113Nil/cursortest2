package x3;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10459d;

    /* renamed from: e, reason: collision with root package name */
    public int f10460e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f10461i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f10462r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10463s;

    /* renamed from: t, reason: collision with root package name */
    public Object f10464t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(z zVar, int i3, ld.a aVar, int i10) {
        super(2, aVar);
        this.f10459d = i10;
        this.f10462r = zVar;
        this.f10463s = i3;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f10459d) {
            case 0:
                u uVar = new u(this.f10462r, this.f10463s, aVar, 0);
                uVar.f10461i = ((Boolean) obj).booleanValue();
                return uVar;
            default:
                u uVar2 = new u(this.f10462r, this.f10463s, aVar, 1);
                uVar2.f10461i = ((Boolean) obj).booleanValue();
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f10459d;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ld.a aVar = (ld.a) obj2;
        switch (i3) {
        }
        return ((u) create(bool, aVar)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i3;
        boolean z10;
        t0 t0Var;
        boolean z11;
        boolean z12;
        Object obj2;
        int i10;
        switch (this.f10459d) {
            case 0:
                md.a aVar = md.a.f6622d;
                boolean z13 = this.f10460e;
                z zVar = this.f10462r;
                try {
                } catch (Throwable th2) {
                    if (z13 != 0) {
                        s0 i11 = zVar.i();
                        this.f10464t = th2;
                        this.f10461i = z13;
                        this.f10460e = 2;
                        Integer a9 = i11.a();
                        if (a9 == aVar) {
                            return aVar;
                        }
                        z10 = z13;
                        th = th2;
                        obj = a9;
                    } else {
                        boolean z14 = z13;
                        th = th2;
                        i3 = this.f10463s;
                        z10 = z14;
                    }
                }
                if (z13 == 0) {
                    cf.c.M(obj);
                    boolean z15 = this.f10461i;
                    this.f10461i = z15;
                    this.f10460e = 1;
                    obj = z.g(zVar, z15, this);
                    z13 = z15;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (z13 != 1) {
                        if (z13 != 2) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z10 = this.f10461i;
                        th = (Throwable) this.f10464t;
                        cf.c.M(obj);
                        i3 = ((Number) obj).intValue();
                        o0 o0Var = new o0(th, i3);
                        z11 = z10;
                        t0Var = o0Var;
                        return new Pair(t0Var, Boolean.valueOf(z11));
                    }
                    boolean z16 = this.f10461i;
                    cf.c.M(obj);
                    z13 = z16;
                }
                t0Var = (t0) obj;
                z11 = z13;
                return new Pair(t0Var, Boolean.valueOf(z11));
            default:
                md.a aVar2 = md.a.f6622d;
                int i12 = this.f10460e;
                z zVar2 = this.f10462r;
                if (i12 == 0) {
                    cf.c.M(obj);
                    z12 = this.f10461i;
                    this.f10461i = z12;
                    this.f10460e = 1;
                    obj = zVar2.j(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.f10464t;
                        cf.c.M(obj);
                        i10 = ((Number) obj).intValue();
                        return new c(obj2 != null ? obj2.hashCode() : 0, i10, obj2);
                    }
                    z12 = this.f10461i;
                    cf.c.M(obj);
                }
                if (!z12) {
                    obj2 = obj;
                    i10 = this.f10463s;
                    return new c(obj2 != null ? obj2.hashCode() : 0, i10, obj2);
                }
                s0 i13 = zVar2.i();
                this.f10464t = obj;
                this.f10460e = 2;
                Integer a10 = i13.a();
                if (a10 == aVar2) {
                    return aVar2;
                }
                obj2 = obj;
                obj = a10;
                i10 = ((Number) obj).intValue();
                return new c(obj2 != null ? obj2.hashCode() : 0, i10, obj2);
        }
    }
}
