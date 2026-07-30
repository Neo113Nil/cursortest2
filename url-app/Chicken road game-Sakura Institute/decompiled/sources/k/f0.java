package k;

import com.android.installreferrer.api.InstallReferrerClient;
import l.l1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5206g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0 f5207h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, int i7) {
        super(1);
        this.f5206g = i7;
        this.f5207h = g0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5206g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l1 l1Var = (l1) obj;
                w wVar = w.f5278f;
                w wVar2 = w.f5279g;
                boolean a3 = l1Var.a(wVar, wVar2);
                Object obj2 = null;
                g0 g0Var = this.f5207h;
                if (a3) {
                    t tVar = g0Var.f5215v.f5222a.f5258b;
                    if (tVar != null) {
                        obj2 = tVar.f5265c;
                    }
                } else if (l1Var.a(wVar2, w.f5280h)) {
                    t tVar2 = g0Var.f5216w.f5225a.f5258b;
                    if (tVar2 != null) {
                        obj2 = tVar2.f5265c;
                    }
                } else {
                    obj2 = b0.f5179d;
                }
                return obj2 == null ? b0.f5179d : obj2;
            default:
                l1 l1Var2 = (l1) obj;
                w wVar3 = w.f5278f;
                w wVar4 = w.f5279g;
                if (l1Var2.a(wVar3, wVar4)) {
                    return b0.f5178c;
                }
                if (!l1Var2.a(wVar4, w.f5280h)) {
                    return b0.f5178c;
                }
                q0 q0Var = this.f5207h.f5216w.f5225a;
                return b0.f5178c;
        }
    }
}
