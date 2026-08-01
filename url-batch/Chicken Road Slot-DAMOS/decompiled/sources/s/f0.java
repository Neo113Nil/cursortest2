package s;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends nd.h implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public de.e f8299e;

    /* renamed from: i, reason: collision with root package name */
    public g0 f8300i;

    /* renamed from: r, reason: collision with root package name */
    public long[] f8301r;

    /* renamed from: s, reason: collision with root package name */
    public int f8302s;

    /* renamed from: t, reason: collision with root package name */
    public int f8303t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8304u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g0 f8305v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ de.e f8306w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, de.e eVar, ld.a aVar) {
        super(aVar);
        this.f8305v = g0Var;
        this.f8306w = eVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        f0 f0Var = new f0(this.f8305v, this.f8306w, aVar);
        f0Var.f8304u = obj;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((de.g) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        de.g gVar;
        g0 g0Var;
        long[] jArr;
        int i3;
        de.e eVar;
        md.a aVar = md.a.f6622d;
        int i10 = this.f8303t;
        if (i10 == 0) {
            cf.c.M(obj);
            gVar = (de.g) this.f8304u;
            g0Var = this.f8305v;
            e0 e0Var = g0Var.f8310e;
            jArr = e0Var.f8291c;
            i3 = e0Var.f8293e;
            eVar = this.f8306w;
        } else {
            if (i10 != 1) {
                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = this.f8302s;
            jArr = this.f8301r;
            g0Var = this.f8300i;
            eVar = this.f8299e;
            gVar = (de.g) this.f8304u;
            cf.c.M(obj);
        }
        if (i3 == Integer.MAX_VALUE) {
            return Unit.f5554a;
        }
        int i11 = (int) ((jArr[i3] >> 31) & 2147483647L);
        eVar.f3713e = i3;
        Object obj2 = g0Var.f8310e.f8290b[i3];
        this.f8304u = gVar;
        this.f8299e = eVar;
        this.f8300i = g0Var;
        this.f8301r = jArr;
        this.f8302s = i11;
        this.f8303t = 1;
        gVar.a(obj2, this);
        return aVar;
    }
}
