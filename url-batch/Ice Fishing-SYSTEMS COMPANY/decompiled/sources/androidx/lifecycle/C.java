package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n;
import java.util.Map;
import n.C4798b;
import o.C4820c;
import o.C4821d;
import o.C4823f;

/* loaded from: classes.dex */
public class C {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f5202k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f5203a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C4823f f5204b = new C4823f();

    /* renamed from: c, reason: collision with root package name */
    public int f5205c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5206d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f5207e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f5208f;

    /* renamed from: g, reason: collision with root package name */
    public int f5209g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5210h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final F3.C f5211j;

    public C() {
        Object obj = f5202k;
        this.f5208f = obj;
        this.f5211j = new F3.C(16, this);
        this.f5207e = obj;
        this.f5209g = -1;
    }

    public static void a(String str) {
        C4798b.J().f39614n.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(D.y.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(B b9) {
        if (b9.f5199u) {
            if (!b9.d()) {
                b9.b(false);
                return;
            }
            int i = b9.f5200v;
            int i4 = this.f5209g;
            if (i >= i4) {
                return;
            }
            b9.f5200v = i4;
            I0.j jVar = b9.f5198n;
            Object obj = this.f5207e;
            jVar.getClass();
            if (((InterfaceC0513v) obj) != null) {
                DialogInterfaceOnCancelListenerC0481n dialogInterfaceOnCancelListenerC0481n = (DialogInterfaceOnCancelListenerC0481n) jVar.f1233u;
                if (dialogInterfaceOnCancelListenerC0481n.f5116E0) {
                    View z8 = dialogInterfaceOnCancelListenerC0481n.z();
                    if (z8.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0481n.f5120I0 != null) {
                        if (androidx.fragment.app.N.E(3)) {
                            Log.d("FragmentManager", "DialogFragment " + jVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0481n.f5120I0);
                        }
                        dialogInterfaceOnCancelListenerC0481n.f5120I0.setContentView(z8);
                    }
                }
            }
        }
    }

    public final void c(B b9) {
        if (this.f5210h) {
            this.i = true;
            return;
        }
        this.f5210h = true;
        do {
            this.i = false;
            if (b9 != null) {
                b(b9);
                b9 = null;
            } else {
                C4823f c4823f = this.f5204b;
                c4823f.getClass();
                C4821d c4821d = new C4821d(c4823f);
                c4823f.f39672v.put(c4821d, Boolean.FALSE);
                while (c4821d.hasNext()) {
                    b((B) ((Map.Entry) c4821d.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f5210h = false;
    }

    public final void d(I0.j jVar) {
        Object obj;
        a("observeForever");
        A a9 = new A(this, jVar);
        C4823f c4823f = this.f5204b;
        C4820c a10 = c4823f.a(jVar);
        if (a10 != null) {
            obj = a10.f39664u;
        } else {
            C4820c c4820c = new C4820c(jVar, a9);
            c4823f.f39673w++;
            C4820c c4820c2 = c4823f.f39671u;
            if (c4820c2 == null) {
                c4823f.f39670n = c4820c;
                c4823f.f39671u = c4820c;
            } else {
                c4820c2.f39665v = c4820c;
                c4820c.f39666w = c4820c2;
                c4823f.f39671u = c4820c;
            }
            obj = null;
        }
        B b9 = (B) obj;
        if (b9 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b9 != null) {
            return;
        }
        a9.b(true);
    }

    public final void e(Object obj) {
        a("setValue");
        this.f5209g++;
        this.f5207e = obj;
        c(null);
    }
}
