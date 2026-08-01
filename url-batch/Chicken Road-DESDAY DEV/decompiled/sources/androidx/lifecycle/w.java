package androidx.lifecycle;

import X.DialogInterfaceOnCancelListenerC0044m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0274a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1440j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1441a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1442b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1443c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1444e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1445f;

    /* renamed from: g, reason: collision with root package name */
    public int f1446g;
    public boolean h;
    public boolean i;

    public w() {
        Object obj = f1440j;
        this.f1445f = obj;
        this.f1444e = obj;
        this.f1446g = -1;
    }

    public static void a(String str) {
        ((C0274a) C0274a.w().d).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1438b) {
            int i = vVar.f1439c;
            int i2 = this.f1446g;
            if (i >= i2) {
                return;
            }
            vVar.f1439c = i2;
            C.g gVar = vVar.f1437a;
            Object obj = this.f1444e;
            gVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) gVar.f66b;
                if (dialogInterfaceOnCancelListenerC0044m.f1004Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0044m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0044m.f1008c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + gVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0044m.f1008c0);
                        }
                        dialogInterfaceOnCancelListenerC0044m.f1008c0.setContentView(D2);
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
                n.f fVar = this.f1442b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3283c.put(dVar, Boolean.FALSE);
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
        this.f1446g++;
        this.f1444e = obj;
        c(null);
    }
}
