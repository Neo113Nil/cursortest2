package androidx.lifecycle;

import Z.DialogInterfaceOnCancelListenerC0049m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import o.C0318a;

/* loaded from: classes.dex */
public class y {
    public static final Object j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1959a;

    /* renamed from: b, reason: collision with root package name */
    public final p.f f1960b = new p.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1961c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1962d;
    public volatile Object e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1963f;

    /* renamed from: g, reason: collision with root package name */
    public int f1964g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1965h;
    public boolean i;

    public y() {
        Object obj = j;
        this.f1963f = obj;
        this.e = obj;
        this.f1964g = -1;
    }

    public static void a(String str) {
        C0318a.l0().f3765b.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(x xVar) {
        if (xVar.f1956b) {
            int i = xVar.f1957c;
            int i2 = this.f1964g;
            if (i >= i2) {
                return;
            }
            xVar.f1957c = i2;
            C1.d dVar = xVar.f1955a;
            Object obj = this.e;
            dVar.getClass();
            if (((t) obj) != null) {
                DialogInterfaceOnCancelListenerC0049m dialogInterfaceOnCancelListenerC0049m = (DialogInterfaceOnCancelListenerC0049m) dVar.f145b;
                if (dialogInterfaceOnCancelListenerC0049m.f1572Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0049m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0049m.f1576c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0049m.f1576c0);
                        }
                        dialogInterfaceOnCancelListenerC0049m.f1576c0.setContentView(D2);
                    }
                }
            }
        }
    }

    public final void c(x xVar) {
        if (this.f1965h) {
            this.i = true;
            return;
        }
        this.f1965h = true;
        do {
            this.i = false;
            if (xVar != null) {
                b(xVar);
                xVar = null;
            } else {
                p.f fVar = this.f1960b;
                fVar.getClass();
                p.d dVar = new p.d(fVar);
                fVar.f3787c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((x) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f1965h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.f1964g++;
        this.e = obj;
        c(null);
    }
}
