package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class x {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f610j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f611a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final m.f f612b = new m.f();
    public int c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f613d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f614e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f615f;
    public int g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f616i;

    public x() {
        Object obj = f610j;
        this.f615f = obj;
        this.f614e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        ((l.a) l.a.W().f2844k).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(w wVar) {
        if (wVar.f608b) {
            if (!wVar.e()) {
                wVar.c(false);
                return;
            }
            int i4 = wVar.c;
            int i5 = this.g;
            if (i4 >= i5) {
                return;
            }
            wVar.c = i5;
            a2.e eVar = wVar.f607a;
            Object obj = this.f614e;
            eVar.getClass();
            r rVar = (r) obj;
            androidx.fragment.app.p pVar = (androidx.fragment.app.p) eVar.g;
            if (rVar == null || !pVar.f489d0) {
                return;
            }
            View D = pVar.D();
            if (D.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (pVar.f492h0 != null) {
                if (androidx.fragment.app.k0.G(3)) {
                    Log.d("FragmentManager", "DialogFragment " + eVar + " setting the content view on " + pVar.f492h0);
                }
                pVar.f492h0.setContentView(D);
            }
        }
    }

    public final void c(w wVar) {
        if (this.h) {
            this.f616i = true;
            return;
        }
        this.h = true;
        do {
            this.f616i = false;
            if (wVar != null) {
                b(wVar);
                wVar = null;
            } else {
                m.f fVar = this.f612b;
                fVar.getClass();
                m.d dVar = new m.d(fVar);
                fVar.h.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.f616i) {
                        break;
                    }
                }
            }
        } while (this.f616i);
        this.h = false;
    }

    public final void d(a2.e eVar) {
        Object obj;
        a("observeForever");
        v vVar = new v(this, eVar);
        m.f fVar = this.f612b;
        m.c a4 = fVar.a(eVar);
        if (a4 != null) {
            obj = a4.g;
        } else {
            m.c cVar = new m.c(eVar, vVar);
            fVar.f2903i++;
            m.c cVar2 = fVar.g;
            if (cVar2 == null) {
                fVar.f2902f = cVar;
                fVar.g = cVar;
            } else {
                cVar2.h = cVar;
                cVar.f2900i = cVar2;
                fVar.g = cVar;
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
        this.g++;
        this.f614e = obj;
        c(null);
    }
}
