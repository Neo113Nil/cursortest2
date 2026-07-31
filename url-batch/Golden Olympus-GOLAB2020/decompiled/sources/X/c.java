package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.T;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f9658a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static C0067c f9659b = C0067c.f9670d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* renamed from: X.c$c, reason: collision with other inner class name */
    public static final class C0067c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f9669c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final C0067c f9670d = new C0067c(T.e(), null, MapsKt.emptyMap());

        /* renamed from: a, reason: collision with root package name */
        private final Set f9671a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f9672b;

        /* renamed from: X.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public C0067c(Set flags, b bVar, Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f9671a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f9672b = linkedHashMap;
        }

        public final Set a() {
            return this.f9671a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f9672b;
        }
    }

    private c() {
    }

    private final C0067c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.z0() != null) {
                    C0067c z02 = parentFragmentManager.z0();
                    Intrinsics.checkNotNull(z02);
                    return z02;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f9659b;
    }

    private final void c(C0067c c0067c, final m mVar) {
        Fragment c4 = mVar.c();
        final String name = c4.getClass().getName();
        if (c0067c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, mVar);
        }
        c0067c.b();
        if (c0067c.a().contains(a.PENALTY_DEATH)) {
            o(c4, new Runnable() { // from class: X.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, mVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, m violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(m mVar) {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + mVar.c().getClass().getName(), mVar);
        }
    }

    public static final void f(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        X.a aVar = new X.a(fragment, previousFragmentId);
        c cVar = f9658a;
        cVar.e(aVar);
        C0067c b4 = cVar.b(fragment);
        if (b4.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.p(b4, fragment.getClass(), aVar.getClass())) {
            cVar.c(b4, aVar);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f9658a;
        cVar.e(dVar);
        C0067c b4 = cVar.b(fragment);
        if (b4.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.p(b4, fragment.getClass(), dVar.getClass())) {
            cVar.c(b4, dVar);
        }
    }

    public static final void h(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f9658a;
        cVar.e(eVar);
        C0067c b4 = cVar.b(fragment);
        if (b4.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.p(b4, fragment.getClass(), eVar.getClass())) {
            cVar.c(b4, eVar);
        }
    }

    public static final void i(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        f fVar = new f(fragment);
        c cVar = f9658a;
        cVar.e(fVar);
        C0067c b4 = cVar.b(fragment);
        if (b4.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.p(b4, fragment.getClass(), fVar.getClass())) {
            cVar.c(b4, fVar);
        }
    }

    public static final void j(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        g gVar = new g(fragment);
        c cVar = f9658a;
        cVar.e(gVar);
        C0067c b4 = cVar.b(fragment);
        if (b4.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.p(b4, fragment.getClass(), gVar.getClass())) {
            cVar.c(b4, gVar);
        }
    }

    public static final void k(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        i iVar = new i(fragment);
        c cVar = f9658a;
        cVar.e(iVar);
        C0067c b4 = cVar.b(fragment);
        if (b4.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.p(b4, fragment.getClass(), iVar.getClass())) {
            cVar.c(b4, iVar);
        }
    }

    public static final void l(Fragment violatingFragment, Fragment targetFragment, int i4) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        j jVar = new j(violatingFragment, targetFragment, i4);
        c cVar = f9658a;
        cVar.e(jVar);
        C0067c b4 = cVar.b(violatingFragment);
        if (b4.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.p(b4, violatingFragment.getClass(), jVar.getClass())) {
            cVar.c(b4, jVar);
        }
    }

    public static final void m(Fragment fragment, boolean z4) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        k kVar = new k(fragment, z4);
        c cVar = f9658a;
        cVar.e(kVar);
        C0067c b4 = cVar.b(fragment);
        if (b4.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.p(b4, fragment.getClass(), kVar.getClass())) {
            cVar.c(b4, kVar);
        }
    }

    public static final void n(Fragment fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        n nVar = new n(fragment, container);
        c cVar = f9658a;
        cVar.e(nVar);
        C0067c b4 = cVar.b(fragment);
        if (b4.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.p(b4, fragment.getClass(), nVar.getClass())) {
            cVar.c(b4, nVar);
        }
    }

    private final void o(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler g4 = fragment.getParentFragmentManager().t0().g();
        Intrinsics.checkNotNullExpressionValue(g4, "fragment.parentFragmentManager.host.handler");
        if (Intrinsics.areEqual(g4.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            g4.post(runnable);
        }
    }

    private final boolean p(C0067c c0067c, Class cls, Class cls2) {
        Set set = (Set) c0067c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), m.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
