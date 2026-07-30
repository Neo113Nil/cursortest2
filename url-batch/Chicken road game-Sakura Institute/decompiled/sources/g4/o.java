package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.Meal;
import java.io.IOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o implements q6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4350g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4351h;

    public /* synthetic */ o(Object obj, int i7, Object obj2) {
        this.f4349f = i7;
        this.f4350g = obj;
        this.f4351h = obj2;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f4349f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((q6.c) this.f4351h).f((Meal) this.f4350g);
                return d6.z.f2639a;
            case 1:
                ((g0.z0) this.f4351h).setValue((Meal) this.f4350g);
                return d6.z.f2639a;
            case 2:
                q0 q0Var = (q0) this.f4351h;
                Meal meal = (Meal) this.f4350g;
                r6.k.f(meal, "meal");
                c7.a0.p(androidx.lifecycle.q0.j(q0Var), null, null, new p0(q0Var, meal, null, 0), 3);
                return d6.z.f2639a;
            default:
                z7.n nVar = (z7.n) this.f4350g;
                z7.r rVar = (z7.r) this.f4351h;
                try {
                } catch (IOException e9) {
                    nVar.b(2, 2, e9);
                } catch (Throwable th) {
                    nVar.b(3, 3, null);
                    t7.b.c(rVar);
                    throw th;
                }
                if (!rVar.b(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (rVar.b(false, this)) {
                }
                nVar.b(1, 9, null);
                t7.b.c(rVar);
                return d6.z.f2639a;
        }
    }

    public /* synthetic */ o(Object obj, Meal meal, int i7) {
        this.f4349f = i7;
        this.f4351h = obj;
        this.f4350g = meal;
    }
}
