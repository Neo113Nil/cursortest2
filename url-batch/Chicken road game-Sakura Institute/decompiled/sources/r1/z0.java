package r1;

import android.content.Context;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7928g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7929h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i7, Object obj) {
        super(0);
        this.f7928g = i7;
        this.f7929h = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [q6.a, r6.l] */
    @Override // q6.a
    public final Object a() {
        switch (this.f7928g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q6.c cVar = (q6.c) this.f7929h;
                z0.n0 n0Var = a1.J;
                cVar.f(n0Var);
                n0Var.f10028t = n0Var.f10023o.g(n0Var.f10025q, n0Var.f10027s, n0Var.f10026r);
                return d6.z.f2639a;
            case 1:
                return new s.g0((p0.i) this.f7929h, e6.v.f2827f);
            case 2:
                c7.a0.c(((s1.p0) this.f7929h).f8342h, null);
                return d6.z.f2639a;
            case 3:
                ((s1.q0) this.f7929h).f8354b = null;
                return d6.z.f2639a;
            case 4:
                return (List) this.f7929h;
            case 5:
                try {
                    return (List) ((r6.l) this.f7929h).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return e6.u.f2826f;
                }
            case 6:
                t3.b0 b0Var = (t3.b0) this.f7929h;
                Context context = b0Var.f8745a;
                t3.h0 h0Var = b0Var.f8766v;
                r6.k.f(context, "context");
                r6.k.f(h0Var, "navigatorProvider");
                return new t3.c0();
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new t3.s((String) this.f7929h);
            case 8:
                return u3.t.b((Context) this.f7929h);
            case q.c.f7259c /* 9 */:
                n.j jVar = (n.j) this.f7929h;
                jVar.f6493a.setValue(n.g.f6491a);
                return d6.z.f2639a;
            case q.c.f7261e /* 10 */:
                return ((w.j0) this.f7929h).d();
            case 11:
                return new w.x0((o.j0) this.f7929h, 0.0f);
            case 12:
                Object systemService = ((y.p) this.f7929h).f9723b.getContext().getSystemService("input_method");
                r6.k.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 13:
                return new BaseInputConnection(((y.u) this.f7929h).f9747a, false);
            case 14:
                return this.f7929h;
            case q.c.f7263g /* 15 */:
                z.g gVar = (z.g) this.f7929h;
                gVar.C = null;
                f.o(gVar);
                f.n(gVar);
                f.m(gVar);
                return Boolean.TRUE;
            default:
                z3.g gVar2 = (z3.g) this.f7929h;
                Context context2 = gVar2.f10085f;
                String str = gVar2.f10086g;
                z3.c cVar2 = new z3.c();
                cVar2.f10073a = null;
                z3.f fVar = new z3.f(context2, str, cVar2, gVar2.f10087h);
                fVar.setWriteAheadLoggingEnabled(gVar2.f10089j);
                return fVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(q6.a aVar) {
        super(0);
        this.f7928g = 5;
        this.f7929h = (r6.l) aVar;
    }
}
