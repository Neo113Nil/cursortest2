package v;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends nd.i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public g f9717d;

    /* renamed from: e, reason: collision with root package name */
    public wd.z f9718e;

    /* renamed from: i, reason: collision with root package name */
    public int f9719i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f9720r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9721s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q0 f9722t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f9723u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Object obj, q0 q0Var, long j, ld.a aVar) {
        super(1, aVar);
        this.f9720r = bVar;
        this.f9721s = obj;
        this.f9722t = q0Var;
        this.f9723u = j;
    }

    @Override // nd.a
    public final ld.a create(ld.a aVar) {
        return new a(this.f9720r, this.f9721s, this.f9722t, this.f9723u, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((ld.a) obj)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        g gVar;
        wd.z zVar;
        q0 q0Var = this.f9722t;
        md.a aVar = md.a.f6622d;
        int i3 = this.f9719i;
        b bVar = this.f9720r;
        try {
            if (i3 == 0) {
                cf.c.M(obj);
                bVar.f9734a.f9799i = (l) ((Function1) c.f9754k.f1868d).invoke(this.f9721s);
                bVar.f9736c.setValue(q0Var.f9864c);
                bVar.f9735b.setValue(Boolean.TRUE);
                g gVar2 = bVar.f9734a;
                g gVar3 = new g(gVar2.f9797d, gVar2.f9798e.getValue(), c.c(gVar2.f9799i), gVar2.f9800r, Long.MIN_VALUE, gVar2.f9802t);
                wd.z zVar2 = new wd.z();
                long j = this.f9723u;
                a1.g gVar4 = new a1.g(bVar, gVar3, zVar2, 4);
                this.f9717d = gVar3;
                this.f9718e = zVar2;
                this.f9719i = 1;
                if (c.a(gVar3, q0Var, j, gVar4, this) == aVar) {
                    return aVar;
                }
                gVar = gVar3;
                zVar = zVar2;
            } else {
                if (i3 != 1) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zVar = this.f9718e;
                gVar = this.f9717d;
                cf.c.M(obj);
            }
            d dVar = zVar.f10164d ? d.f9768d : d.f9769e;
            g gVar5 = bVar.f9734a;
            gVar5.f9799i.d();
            gVar5.f9800r = Long.MIN_VALUE;
            bVar.f9735b.setValue(Boolean.FALSE);
            return new c6.l(13, gVar, dVar);
        } catch (CancellationException e2) {
            g gVar6 = bVar.f9734a;
            gVar6.f9799i.d();
            gVar6.f9800r = Long.MIN_VALUE;
            bVar.f9735b.setValue(Boolean.FALSE);
            throw e2;
        }
    }
}
