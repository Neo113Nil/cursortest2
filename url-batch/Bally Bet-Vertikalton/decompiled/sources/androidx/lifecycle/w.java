package androidx.lifecycle;

import X.DialogInterfaceOnCancelListenerC0045m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0276a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1382j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1383a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1384b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1385c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1386e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1387f;

    /* renamed from: g, reason: collision with root package name */
    public int f1388g;
    public boolean h;
    public boolean i;

    public w() {
        Object obj = f1382j;
        this.f1387f = obj;
        this.f1386e = obj;
        this.f1388g = -1;
    }

    public static void a(String str) {
        ((C0276a) C0276a.l().f3172b).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1380b) {
            int i = vVar.f1381c;
            int i2 = this.f1388g;
            if (i >= i2) {
                return;
            }
            vVar.f1381c = i2;
            B0.d dVar = vVar.f1379a;
            Object obj = this.f1386e;
            dVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m = (DialogInterfaceOnCancelListenerC0045m) dVar.f59b;
                if (dialogInterfaceOnCancelListenerC0045m.f935Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0045m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0045m.f939c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0045m.f939c0);
                        }
                        dialogInterfaceOnCancelListenerC0045m.f939c0.setContentView(D2);
                    }
                }
            }
        }
    }

    public final void c(v vVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (vVar != null) {
                b(vVar);
                vVar = null;
            } else {
                n.f fVar = this.f1384b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3263c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((v) ((Map.Entry) dVar.next()).getValue());
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
        this.f1388g++;
        this.f1386e = obj;
        c(null);
    }
}
