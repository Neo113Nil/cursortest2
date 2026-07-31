package G1;

import F.X0;
import I.C0113p;
import L1.z;
import r.C0803O;

/* loaded from: classes.dex */
public final class a implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1539d = new a();

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        C0113p c0113p = (C0113p) obj2;
        int intValue = ((Number) obj3).intValue();
        Z1.i.f((C0803O) obj, "$this$OutlinedButton");
        if ((intValue & 17) == 16 && c0113p.x()) {
            c0113p.L();
        } else {
            X0.b("Play again", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0113p, 6, 0, 131070);
        }
        return z.f2729a;
    }
}
