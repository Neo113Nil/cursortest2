package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class x {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f640j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f641a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final n.f f642b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f643c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f644e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f645f;

    /* renamed from: g, reason: collision with root package name */
    public int f646g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f647h;
    public boolean i;

    public x() {
        Object obj = f640j;
        this.f645f = obj;
        this.f644e = obj;
        this.f646g = -1;
    }

    public static void a(String str) {
        ((m.a) m.a.t0().f2680k).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(w wVar) {
        if (wVar.f638g) {
            if (!wVar.e()) {
                wVar.c(false);
                return;
            }
            int i = wVar.f639h;
            int i4 = this.f646g;
            if (i >= i4) {
                return;
            }
            wVar.f639h = i4;
            a0.a aVar = wVar.f637f;
            Object obj = this.f644e;
            aVar.getClass();
            r rVar = (r) obj;
            androidx.fragment.app.p pVar = (androidx.fragment.app.p) aVar.f81g;
            if (rVar == null || !pVar.d0) {
                return;
            }
            View D = pVar.D();
            if (D.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (pVar.f503h0 != null) {
                if (androidx.fragment.app.k0.E(3)) {
                    Log.d("FragmentManager", "DialogFragment " + aVar + " setting the content view on " + pVar.f503h0);
                }
                pVar.f503h0.setContentView(D);
            }
        }
    }

    public final void c(w wVar) {
        if (this.f647h) {
            this.i = true;
            return;
        }
        this.f647h = true;
        do {
            this.i = false;
            if (wVar != null) {
                b(wVar);
                wVar = null;
            } else {
                n.f fVar = this.f642b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f2708h.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f647h = false;
    }

    public final void d(a0.a aVar) {
        Object obj;
        a("observeForever");
        v vVar = new v(this, aVar);
        n.f fVar = this.f642b;
        n.c a2 = fVar.a(aVar);
        if (a2 != null) {
            obj = a2.f2701g;
        } else {
            n.c cVar = new n.c(aVar, vVar);
            fVar.i++;
            n.c cVar2 = fVar.f2707g;
            if (cVar2 == null) {
                fVar.f2706f = cVar;
                fVar.f2707g = cVar;
            } else {
                cVar2.f2702h = cVar;
                cVar.i = cVar2;
                fVar.f2707g = cVar;
            }
            obj = null;
        }
        w wVar = (w) obj;
        if (wVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (wVar != null) {
            return;
        }
        vVar.c(true);
    }

    public final void e(Object obj) {
        a("setValue");
        this.f646g++;
        this.f644e = obj;
        c(null);
    }
}
