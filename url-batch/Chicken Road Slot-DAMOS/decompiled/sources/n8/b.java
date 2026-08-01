package n8;

import b1.w;
import ge.x;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.z0;
import n4.h;
import nd.i;
import o4.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7178d = 0;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7179e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7180i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7181r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z0 z0Var, o oVar, w wVar, ld.a aVar) {
        super(2, aVar);
        this.f7179e = z0Var;
        this.f7180i = oVar;
        this.f7181r = wVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f7178d) {
            case 0:
                b bVar = new b((b4.c) this.f7180i, (Long) this.f7181r, aVar);
                bVar.f7179e = obj;
                return bVar;
            default:
                return new b((z0) this.f7179e, (o) this.f7180i, (w) this.f7181r, aVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7178d) {
            case 0:
                return ((b) create((b4.a) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                return ((b) create((x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
        }
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        int i3 = this.f7178d;
        Object obj2 = this.f7181r;
        Object obj3 = this.f7180i;
        switch (i3) {
            case 0:
                md.a aVar = md.a.f6622d;
                cf.c.M(obj);
                ((b4.a) this.f7179e).c((b4.c) obj3, (Long) obj2);
                break;
            default:
                md.a aVar2 = md.a.f6622d;
                cf.c.M(obj);
                o oVar = (o) obj3;
                w wVar = (w) obj2;
                for (h hVar : (Set) ((z0) this.f7179e).getValue()) {
                    if (!((List) oVar.b().f7081e.f5239d.getValue()).contains(hVar) && !wVar.contains(hVar)) {
                        oVar.b().c(hVar);
                    }
                }
                break;
        }
        return Unit.f5554a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b4.c cVar, Long l10, ld.a aVar) {
        super(2, aVar);
        this.f7180i = cVar;
        this.f7181r = l10;
    }
}
