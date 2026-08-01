package a0;

import Z.AbstractComponentCallbacksC0050q;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1302a = c.f1301a;

    public static c a(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        while (abstractComponentCallbacksC0050q != null) {
            if (abstractComponentCallbacksC0050q.m()) {
                abstractComponentCallbacksC0050q.j();
            }
            abstractComponentCallbacksC0050q = abstractComponentCallbacksC0050q.f1197u;
        }
        return f1302a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f1297a.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q, String str) {
        h1.d.e(abstractComponentCallbacksC0050q, "fragment");
        h1.d.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0050q, "Attempting to reuse fragment " + abstractComponentCallbacksC0050q + " with previous ID " + str));
        a(abstractComponentCallbacksC0050q).getClass();
    }
}
