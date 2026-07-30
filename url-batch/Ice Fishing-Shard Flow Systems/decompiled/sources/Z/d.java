package Z;

import A.j;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC0228t;
import androidx.fragment.app.Q;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2934a = c.f2931c;

    public static c a(ComponentCallbacksC0228t componentCallbacksC0228t) {
        while (componentCallbacksC0228t != null) {
            if (componentCallbacksC0228t.h()) {
                Intrinsics.checkNotNullExpressionValue(componentCallbacksC0228t.e(), "declaringFragment.parentFragmentManager");
            }
            componentCallbacksC0228t = componentCallbacksC0228t.f3778D;
        }
        return f2934a;
    }

    public static void b(c cVar, f fVar) {
        ComponentCallbacksC0228t componentCallbacksC0228t = fVar.f2935d;
        String name = componentCallbacksC0228t.getClass().getName();
        Set set = cVar.f2932a;
        if (set.contains(b.f2925d)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), fVar);
        }
        if (set.contains(b.f2926e)) {
            j jVar = new j(name, 12, fVar);
            if (!componentCallbacksC0228t.h()) {
                jVar.run();
                throw null;
            }
            Handler handler = componentCallbacksC0228t.e().f3633v.f3824i;
            if (Intrinsics.a(handler.getLooper(), Looper.myLooper())) {
                jVar.run();
                throw null;
            }
            handler.post(jVar);
        }
    }

    public static void c(f fVar) {
        if (Q.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(fVar.f2935d.getClass().getName()), fVar);
        }
    }

    public static final void d(ComponentCallbacksC0228t fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        a aVar = new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        c(aVar);
        c a7 = a(fragment);
        if (a7.f2932a.contains(b.f2927i) && e(a7, fragment.getClass(), a.class)) {
            b(a7, aVar);
        }
    }

    public static boolean e(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f2933b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.a(cls2.getSuperclass(), f.class) || !CollectionsKt.m(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
