package a0;

import Z.AbstractComponentCallbacksC0047q;
import android.util.Log;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0056d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0055c f1311a = C0055c.f1310a;

    public static C0055c a(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        while (abstractComponentCallbacksC0047q != null) {
            if (abstractComponentCallbacksC0047q.m()) {
                abstractComponentCallbacksC0047q.j();
            }
            abstractComponentCallbacksC0047q = abstractComponentCallbacksC0047q.f1206u;
        }
        return f1311a;
    }

    public static void b(C0053a c0053a) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0053a.f1306a.getClass().getName()), c0053a);
        }
    }

    public static final void c(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q, String str) {
        g1.d.e(abstractComponentCallbacksC0047q, "fragment");
        g1.d.e(str, "previousFragmentId");
        b(new C0053a(abstractComponentCallbacksC0047q, "Attempting to reuse fragment " + abstractComponentCallbacksC0047q + " with previous ID " + str));
        a(abstractComponentCallbacksC0047q).getClass();
    }
}
