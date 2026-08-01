package Y;

import X.AbstractComponentCallbacksC0047q;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1103a = c.f1102a;

    public static c a(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        while (abstractComponentCallbacksC0047q != null) {
            if (abstractComponentCallbacksC0047q.m()) {
                abstractComponentCallbacksC0047q.j();
            }
            abstractComponentCallbacksC0047q = abstractComponentCallbacksC0047q.f1071u;
        }
        return f1103a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f1098a.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q, String str) {
        b1.d.e(abstractComponentCallbacksC0047q, "fragment");
        b1.d.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0047q, "Attempting to reuse fragment " + abstractComponentCallbacksC0047q + " with previous ID " + str));
        a(abstractComponentCallbacksC0047q).getClass();
    }
}
