package X;

import X0.f;
import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0060q;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f868a = c.f867a;

    public static c a(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        while (abstractComponentCallbacksC0060q != null) {
            if (abstractComponentCallbacksC0060q.i()) {
                abstractComponentCallbacksC0060q.f();
            }
            abstractComponentCallbacksC0060q = abstractComponentCallbacksC0060q.f1413u;
        }
        return f868a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f862a.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q, String str) {
        f.e(abstractComponentCallbacksC0060q, "fragment");
        f.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0060q, "Attempting to reuse fragment " + abstractComponentCallbacksC0060q + " with previous ID " + str));
        a(abstractComponentCallbacksC0060q).getClass();
    }
}
