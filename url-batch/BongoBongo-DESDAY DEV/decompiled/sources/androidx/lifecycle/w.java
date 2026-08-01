package androidx.lifecycle;

import Z.DialogInterfaceOnCancelListenerC0046m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import n.C0263a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1592j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1593a;

    /* renamed from: b, reason: collision with root package name */
    public final o.f f1594b = new o.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1595c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1596e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1597f;

    /* renamed from: g, reason: collision with root package name */
    public int f1598g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1599h;
    public boolean i;

    public w() {
        Object obj = f1592j;
        this.f1597f = obj;
        this.f1596e = obj;
        this.f1598g = -1;
    }

    public static void a(String str) {
        ((C0263a) C0263a.s().d).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1590b) {
            int i = vVar.f1591c;
            int i2 = this.f1598g;
            if (i >= i2) {
                return;
            }
            vVar.f1591c = i2;
            D.g gVar = vVar.f1589a;
            Object obj = this.f1596e;
            gVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m = (DialogInterfaceOnCancelListenerC0046m) gVar.f122b;
                if (dialogInterfaceOnCancelListenerC0046m.f1142Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0046m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0046m.f1146c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + gVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0046m.f1146c0);
                        }
                        dialogInterfaceOnCancelListenerC0046m.f1146c0.setContentView(D2);
                    }
                }
            }
        }
    }

    public final void c(v vVar) {
        if (this.f1599h) {
            this.i = true;
            return;
        }
        this.f1599h = true;
        do {
            this.i = false;
            if (vVar != null) {
                b(vVar);
                vVar = null;
            } else {
                o.f fVar = this.f1594b;
                fVar.getClass();
                o.d dVar = new o.d(fVar);
                fVar.f3406c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((v) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f1599h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.f1598g++;
        this.f1596e = obj;
        c(null);
    }
}
