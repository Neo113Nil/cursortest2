package Z;

import Y.AbstractComponentCallbacksC0051q;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1178a = c.f1177a;

    public static c a(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        while (abstractComponentCallbacksC0051q != null) {
            if (abstractComponentCallbacksC0051q.m()) {
                abstractComponentCallbacksC0051q.j();
            }
            abstractComponentCallbacksC0051q = abstractComponentCallbacksC0051q.f1144u;
        }
        return f1178a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f1173a.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q, String str) {
        g1.d.e(abstractComponentCallbacksC0051q, "fragment");
        g1.d.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0051q, "Attempting to reuse fragment " + abstractComponentCallbacksC0051q + " with previous ID " + str));
        a(abstractComponentCallbacksC0051q).getClass();
    }
}
