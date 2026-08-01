package androidx.lifecycle;

import X.DialogInterfaceOnCancelListenerC0044m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0255a;

/* loaded from: classes.dex */
public class y {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1527j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1528a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1529b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1530c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1531e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1532f;

    /* renamed from: g, reason: collision with root package name */
    public int f1533g;
    public boolean h;
    public boolean i;

    public y() {
        Object obj = f1527j;
        this.f1532f = obj;
        this.f1531e = obj;
        this.f1533g = -1;
    }

    public static void a(String str) {
        C0255a.q().f3093g.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(x xVar) {
        if (xVar.f1525b) {
            int i = xVar.f1526c;
            int i2 = this.f1533g;
            if (i >= i2) {
                return;
            }
            xVar.f1526c = i2;
            A0.h hVar = xVar.f1524a;
            Object obj = this.f1531e;
            hVar.getClass();
            if (((t) obj) != null) {
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) hVar.f30b;
                if (dialogInterfaceOnCancelListenerC0044m.f1070Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0044m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0044m.f1074c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + hVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0044m.f1074c0);
                        }
                        dialogInterfaceOnCancelListenerC0044m.f1074c0.setContentView(D2);
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
                n.f fVar = this.f1529b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3114c.put(dVar, Boolean.FALSE);
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
        this.f1533g++;
        this.f1531e = obj;
        c(null);
    }
}
