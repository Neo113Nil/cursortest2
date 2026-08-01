package u;

import kotlin.jvm.functions.Function1;
import v.u0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f9510e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, int i3) {
        super(1);
        this.f9509d = i3;
        this.f9510e = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9509d) {
            case 0:
                u0 u0Var = (u0) obj;
                w wVar = w.f9555d;
                w wVar2 = w.f9556e;
                v.j0 j0Var = null;
                if (!u0Var.b(wVar, wVar2)) {
                    if (u0Var.b(wVar2, w.f9557i)) {
                        m0 m0Var = this.f9510e.D.f9520a;
                    } else {
                        j0Var = d0.f9501d;
                    }
                }
                return j0Var == null ? d0.f9501d : j0Var;
            default:
                u0 u0Var2 = (u0) obj;
                w wVar3 = w.f9555d;
                w wVar4 = w.f9556e;
                if (u0Var2.b(wVar3, wVar4)) {
                    return d0.f9500c;
                }
                if (!u0Var2.b(wVar4, w.f9557i)) {
                    return d0.f9500c;
                }
                m0 m0Var2 = this.f9510e.D.f9520a;
                return d0.f9500c;
        }
    }
}
