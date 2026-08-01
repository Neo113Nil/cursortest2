package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class x {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f743j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f744a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final n.f f745b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f746c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f747e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f748f;

    /* renamed from: g, reason: collision with root package name */
    public int f749g;
    public boolean h;
    public boolean i;

    public x() {
        Object obj = f743j;
        this.f748f = obj;
        this.f747e = obj;
        this.f749g = -1;
    }

    public static void a(String str) {
        ((m.a) m.a.Z().f2720o).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(w wVar) {
        if (wVar.f741b) {
            if (!wVar.e()) {
                wVar.c(false);
                return;
            }
            int i = wVar.f742c;
            int i4 = this.f749g;
            if (i >= i4) {
                return;
            }
            wVar.f742c = i4;
            a0.a aVar = wVar.f740a;
            Object obj = this.f747e;
            aVar.getClass();
            r rVar = (r) obj;
            androidx.fragment.app.p pVar = (androidx.fragment.app.p) aVar.f79g;
            if (rVar == null || !pVar.f610f0) {
                return;
            }
            View D = pVar.D();
            if (D.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (pVar.f613j0 != null) {
                if (androidx.fragment.app.k0.H(3)) {
                    Log.d("FragmentManager", "DialogFragment " + aVar + " setting the content view on " + pVar.f613j0);
                }
                pVar.f613j0.setContentView(D);
            }
        }
    }

    public final void c(w wVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (wVar != null) {
                b(wVar);
                wVar = null;
            } else {
                n.f fVar = this.f745b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.h.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(a0.a aVar) {
        Object obj;
        a("observeForever");
        v vVar = new v(this, aVar);
        n.f fVar = this.f745b;
        n.c a5 = fVar.a(aVar);
        if (a5 != null) {
            obj = a5.f2743g;
        } else {
            n.c cVar = new n.c(aVar, vVar);
            fVar.i++;
            n.c cVar2 = fVar.f2747g;
            if (cVar2 == null) {
                fVar.f2746f = cVar;
                fVar.f2747g = cVar;
            } else {
                cVar2.h = cVar;
                cVar.i = cVar2;
                fVar.f2747g = cVar;
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
        this.f749g++;
        this.f747e = obj;
        c(null);
    }
}
