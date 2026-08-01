package androidx.lifecycle;

import X.DialogInterfaceOnCancelListenerC0044m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0273a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1485j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1486a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1487b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1488c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1489e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1490f;

    /* renamed from: g, reason: collision with root package name */
    public int f1491g;
    public boolean h;
    public boolean i;

    public w() {
        Object obj = f1485j;
        this.f1490f = obj;
        this.f1489e = obj;
        this.f1491g = -1;
    }

    public static void a(String str) {
        ((C0273a) C0273a.u().d).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1483b) {
            int i = vVar.f1484c;
            int i2 = this.f1491g;
            if (i >= i2) {
                return;
            }
            vVar.f1484c = i2;
            C.g gVar = vVar.f1482a;
            Object obj = this.f1489e;
            gVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) gVar.f67b;
                if (dialogInterfaceOnCancelListenerC0044m.f1044Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0044m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0044m.f1048c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + gVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0044m.f1048c0);
                        }
                        dialogInterfaceOnCancelListenerC0044m.f1048c0.setContentView(D2);
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
                n.f fVar = this.f1487b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3196c.put(dVar, Boolean.FALSE);
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
        this.f1491g++;
        this.f1489e = obj;
        c(null);
    }
}
