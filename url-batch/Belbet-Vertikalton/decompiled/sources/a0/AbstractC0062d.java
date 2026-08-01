package a0;

import Z.AbstractComponentCallbacksC0053q;
import android.util.Log;
import j1.h;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0062d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0061c f1665a = C0061c.f1664a;

    public static C0061c a(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        while (abstractComponentCallbacksC0053q != null) {
            if (abstractComponentCallbacksC0053q.m()) {
                abstractComponentCallbacksC0053q.j();
            }
            abstractComponentCallbacksC0053q = abstractComponentCallbacksC0053q.f1625u;
        }
        return f1665a;
    }

    public static void b(C0059a c0059a) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0059a.f1659a.getClass().getName()), c0059a);
        }
    }

    public static final void c(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q, String str) {
        h.e(abstractComponentCallbacksC0053q, "fragment");
        h.e(str, "previousFragmentId");
        b(new C0059a(abstractComponentCallbacksC0053q, "Attempting to reuse fragment " + abstractComponentCallbacksC0053q + " with previous ID " + str));
        a(abstractComponentCallbacksC0053q).getClass();
    }
}
