package c;

import a0.x0;
import androidx.lifecycle.q0;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.g0;
import java.util.Iterator;
import p2.q;
import p2.s;
import p2.v;
import s.o;
import s.u;
import s.y;
import s1.c3;
import s1.i1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1430b;

    public /* synthetic */ g(int i7, Object obj) {
        this.f1429a = i7;
        this.f1430b = obj;
    }

    @Override // g0.g0
    public final void a() {
        switch (this.f1429a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Iterator it = ((e) this.f1430b).f1221b.iterator();
                while (it.hasNext()) {
                    ((b.c) it.next()).cancel();
                }
                break;
            case 1:
                s sVar = (s) this.f1430b;
                sVar.dismiss();
                q qVar = sVar.f7169l;
                c3 c3Var = qVar.f8121h;
                if (c3Var != null) {
                    c3Var.a();
                }
                qVar.f8121h = null;
                qVar.requestLayout();
                break;
            case 2:
                v vVar = (v) this.f1430b;
                c3 c3Var2 = vVar.f8121h;
                if (c3Var2 != null) {
                    c3Var2.a();
                }
                vVar.f8121h = null;
                vVar.requestLayout();
                q0.k(vVar, null);
                vVar.f7183s.removeViewImmediate(vVar);
                break;
            case 3:
                ((o) this.f1430b).f8044d = null;
                break;
            case 4:
                ((y) this.f1430b).f8072c = null;
                break;
            case 5:
                u uVar = (u) this.f1430b;
                int e9 = uVar.f8064d.e();
                for (int i7 = 0; i7 < e9; i7++) {
                    uVar.b();
                }
                break;
            case 6:
                ((i1) this.f1430b).f8242a.a();
                break;
            default:
                ((x0) this.f1430b).k();
                break;
        }
    }
}
