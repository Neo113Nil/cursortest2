package androidx.lifecycle;

import Y.DialogInterfaceOnCancelListenerC0046m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0286a;

/* loaded from: classes.dex */
public class y {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1908j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1909a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1910b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1911c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1912e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1913f;

    /* renamed from: g, reason: collision with root package name */
    public int f1914g;
    public boolean h;
    public boolean i;

    public y() {
        Object obj = f1908j;
        this.f1913f = obj;
        this.f1912e = obj;
        this.f1914g = -1;
    }

    public static void a(String str) {
        C0286a.D().d.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(x xVar) {
        if (xVar.f1906b) {
            int i = xVar.f1907c;
            int i2 = this.f1914g;
            if (i >= i2) {
                return;
            }
            xVar.f1907c = i2;
            A0.c cVar = xVar.f1905a;
            Object obj = this.f1912e;
            cVar.getClass();
            if (((t) obj) != null) {
                DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m = (DialogInterfaceOnCancelListenerC0046m) cVar.f6b;
                if (dialogInterfaceOnCancelListenerC0046m.f1423Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0046m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0046m.f1427c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + cVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0046m.f1427c0);
                        }
                        dialogInterfaceOnCancelListenerC0046m.f1427c0.setContentView(D2);
                    }
                }
            }
        }
    }

    public final void c(x xVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (xVar != null) {
                b(xVar);
                xVar = null;
            } else {
                n.f fVar = this.f1910b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3553c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((x) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.f1914g++;
        this.f1912e = obj;
        c(null);
    }
}
