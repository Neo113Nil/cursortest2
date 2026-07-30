package s;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f7985h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(d0 d0Var, int i7) {
        super(1);
        this.f7984g = i7;
        this.f7985h = d0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f7984g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r.h hVar = (r.h) this.f7985h.f7991s.a();
                int c4 = hVar.c();
                int i7 = 0;
                while (true) {
                    if (i7 >= c4) {
                        i7 = -1;
                    } else if (!hVar.d(i7).equals(obj)) {
                        i7++;
                    }
                }
                return Integer.valueOf(i7);
            default:
                int intValue = ((Number) obj).intValue();
                d0 d0Var = this.f7985h;
                r.h hVar2 = (r.h) d0Var.f7991s.a();
                if (intValue >= 0 && intValue < hVar2.c()) {
                    c7.a0.p(d0Var.o0(), null, null, new c0(d0Var, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder n8 = a0.m.n(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                n8.append(hVar2.c());
                n8.append(')');
                throw new IllegalArgumentException(n8.toString().toString());
        }
    }
}
