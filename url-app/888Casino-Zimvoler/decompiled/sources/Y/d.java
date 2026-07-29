package Y;

import X.AbstractComponentCallbacksC0048q;
import X0.e;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1022a = c.f1021a;

    public static c a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        while (abstractComponentCallbacksC0048q != null) {
            if (abstractComponentCallbacksC0048q.m()) {
                abstractComponentCallbacksC0048q.j();
            }
            abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q.f980u;
        }
        return f1022a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f1017a.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, String str) {
        e.e(abstractComponentCallbacksC0048q, "fragment");
        e.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0048q, "Attempting to reuse fragment " + abstractComponentCallbacksC0048q + " with previous ID " + str));
        a(abstractComponentCallbacksC0048q).getClass();
    }
}
