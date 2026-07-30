package l1;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import r1.p1;
import r1.q1;
import s.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5819g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r6.v f5820h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r6.v vVar, int i7) {
        super(1);
        this.f5819g = 3;
        this.f5820h = vVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5819g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p pVar = (p) obj;
                r6.v vVar = this.f5820h;
                Object obj2 = vVar.f7968f;
                if (obj2 == null && pVar.f5824s) {
                    vVar.f7968f = pVar;
                } else if (obj2 != null) {
                    pVar.getClass();
                }
                return Boolean.TRUE;
            case 1:
                q1 q1Var = (q1) obj;
                r6.k.d(q1Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                s.y yVar = ((l0) q1Var).f8036s;
                r6.v vVar2 = this.f5820h;
                List list = (List) vVar2.f7968f;
                if (list != null) {
                    list.add(yVar);
                } else {
                    list = e6.m.Y(yVar);
                }
                vVar2.f7968f = list;
                return p1.f7877g;
            case 2:
                String str = (String) obj;
                r6.k.f(str, "key");
                Object obj3 = this.f5820h.f7968f;
                boolean z8 = true;
                if (obj3 != null && ((Bundle) obj3).containsKey(str)) {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                Boolean B = x0.d.B((x0.r) obj);
                this.f5820h.f7968f = B;
                return Boolean.valueOf(B != null ? B.booleanValue() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(r6.v vVar, int i7, byte b9) {
        super(1);
        this.f5819g = i7;
        this.f5820h = vVar;
    }
}
