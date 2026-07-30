package g4;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4298f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4299g;

    public /* synthetic */ g1(g7.v vVar) {
        this.f4299g = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r0 == null) goto L19;
     */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Object obj2) {
        switch (this.f4298f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                h1.a((o0.a) this.f4299g, (g0.p) obj, g0.d.T(7));
                return d6.z.f2639a;
            default:
                g7.v vVar = (g7.v) this.f4299g;
                int intValue = ((Integer) obj).intValue();
                h6.g gVar = (h6.g) obj2;
                h6.h key = gVar.getKey();
                h6.g u8 = vVar.f4527g.u(key);
                if (key != c7.u.f1748g) {
                    if (gVar != u8) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    c7.x0 x0Var = (c7.x0) u8;
                    c7.x0 x0Var2 = (c7.x0) gVar;
                    while (true) {
                        c7.x0 x0Var3 = null;
                        if (x0Var2 == null) {
                            x0Var2 = null;
                        } else if (x0Var2 != x0Var && (x0Var2 instanceof h7.p)) {
                            c7.k kVar = (c7.k) c7.f1.f1693g.get((h7.p) x0Var2);
                            if (kVar != null) {
                                x0Var3 = kVar.getParent();
                            }
                            x0Var2 = x0Var3;
                        }
                    }
                    if (x0Var2 != x0Var) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + x0Var2 + ", expected child of " + x0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                return Integer.valueOf(intValue);
        }
    }
}
