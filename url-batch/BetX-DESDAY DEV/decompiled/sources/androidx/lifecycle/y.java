package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m;
import java.util.Map;
import m.C0303a;

/* loaded from: classes.dex */
public class y {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1511j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1512a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1513b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1514c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1515d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1516e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1517f;

    /* renamed from: g, reason: collision with root package name */
    public int f1518g;
    public boolean h;
    public boolean i;

    public y() {
        Object obj = f1511j;
        this.f1517f = obj;
        this.f1516e = obj;
        this.f1518g = -1;
    }

    public static void a(String str) {
        ((C0303a) C0303a.u().f3536d).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(x xVar) {
        if (xVar.f1508b) {
            int i = xVar.f1509c;
            int i2 = this.f1518g;
            if (i >= i2) {
                return;
            }
            xVar.f1509c = i2;
            B0.d dVar = xVar.f1507a;
            Object obj = this.f1516e;
            dVar.getClass();
            if (((InterfaceC0086t) obj) != null) {
                DialogInterfaceOnCancelListenerC0056m dialogInterfaceOnCancelListenerC0056m = (DialogInterfaceOnCancelListenerC0056m) dVar.f66b;
                if (dialogInterfaceOnCancelListenerC0056m.f1358Y) {
                    View z2 = dialogInterfaceOnCancelListenerC0056m.z();
                    if (z2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0056m.f1362c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0056m.f1362c0);
                        }
                        dialogInterfaceOnCancelListenerC0056m.f1362c0.setContentView(z2);
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
                n.f fVar = this.f1513b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3630c.put(dVar, Boolean.FALSE);
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
        this.f1518g++;
        this.f1516e = obj;
        c(null);
    }
}
