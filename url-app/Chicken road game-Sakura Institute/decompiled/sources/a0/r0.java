package a0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.k1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f131g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0.o f132h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0.a f133i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0.o oVar, o0.a aVar) {
        super(2);
        this.f132h = oVar;
        this.f133i = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f131g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                int T = g0.d.T(49);
                a.a.g(this.f132h, this.f133i, (g0.p) obj, T);
                break;
            default:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    pVar.k(AndroidCompositionLocals_androidKt.f738a);
                    String string = ((Context) pVar.k(AndroidCompositionLocals_androidKt.f739b)).getResources().getString(R.string.m3c_dialog);
                    s0.o j8 = androidx.compose.foundation.layout.c.j(this.f132h, d0.m.f2155a, Float.NaN, d0.m.f2156b, Float.NaN);
                    boolean f9 = pVar.f(string);
                    Object G = pVar.G();
                    if (f9 || G == g0.l.f3784a) {
                        G = new d0.k(string, 0);
                        pVar.a0(G);
                    }
                    s0.o j9 = j8.j(y1.k.a(s0.l.f8103a, false, (q6.c) G));
                    p1.f0 e9 = q.n.e(s0.b.f8078f, true);
                    int i7 = pVar.P;
                    k1 m8 = pVar.m();
                    s0.o c4 = s0.a.c(pVar, j9);
                    r1.j.f7810d.getClass();
                    r1.n nVar = r1.i.f7781b;
                    pVar.U();
                    if (pVar.O) {
                        pVar.l(nVar);
                    } else {
                        pVar.d0();
                    }
                    g0.d.Q(pVar, e9, r1.i.f7784e);
                    g0.d.Q(pVar, m8, r1.i.f7783d);
                    r1.h hVar = r1.i.f7785f;
                    if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i7))) {
                        m.q(i7, pVar, i7, hVar);
                    }
                    g0.d.Q(pVar, c4, r1.i.f7782c);
                    this.f133i.d(pVar, 0);
                    pVar.p(true);
                }
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0.o oVar, o0.a aVar, int i7) {
        super(2);
        this.f132h = oVar;
        this.f133i = aVar;
    }
}
