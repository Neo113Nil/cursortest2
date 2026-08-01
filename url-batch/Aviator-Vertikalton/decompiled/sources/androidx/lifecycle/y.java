package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m;
import java.util.Map;
import m.C0301a;

/* loaded from: classes.dex */
public class y {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1510j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1511a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1512b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1513c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1514d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1515e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1516f;

    /* renamed from: g, reason: collision with root package name */
    public int f1517g;
    public boolean h;
    public boolean i;

    public y() {
        Object obj = f1510j;
        this.f1516f = obj;
        this.f1515e = obj;
        this.f1517g = -1;
    }

    public static void a(String str) {
        ((C0301a) C0301a.u().f3532d).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(x xVar) {
        if (xVar.f1507b) {
            int i = xVar.f1508c;
            int i2 = this.f1517g;
            if (i >= i2) {
                return;
            }
            xVar.f1508c = i2;
            B0.d dVar = xVar.f1506a;
            Object obj = this.f1515e;
            dVar.getClass();
            if (((InterfaceC0086t) obj) != null) {
                DialogInterfaceOnCancelListenerC0056m dialogInterfaceOnCancelListenerC0056m = (DialogInterfaceOnCancelListenerC0056m) dVar.f67b;
                if (dialogInterfaceOnCancelListenerC0056m.f1357Y) {
                    View z2 = dialogInterfaceOnCancelListenerC0056m.z();
                    if (z2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0056m.f1361c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0056m.f1361c0);
                        }
                        dialogInterfaceOnCancelListenerC0056m.f1361c0.setContentView(z2);
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
                n.f fVar = this.f1512b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3626c.put(dVar, Boolean.FALSE);
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
        this.f1517g++;
        this.f1515e = obj;
        c(null);
    }
}
