package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class tq {
    public static final sq a = sq.a;

    public static sq a(a aVar) {
        while (aVar != null) {
            if (aVar.x != null && aVar.p) {
                aVar.j();
            }
            aVar = aVar.z;
        }
        return a;
    }

    public static void b(oq oqVar) {
        if (c.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(oqVar.f.getClass().getName()), oqVar);
        }
    }

    public static final void c(a aVar, String str) {
        str.getClass();
        b(new oq(aVar, "Attempting to reuse fragment " + aVar + " with previous ID " + str));
        a(aVar).getClass();
        rq rqVar = rq.PENALTY_LOG;
    }
}
