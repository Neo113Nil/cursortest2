package androidx.lifecycle;

import Y.DialogInterfaceOnCancelListenerC0047m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0260a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1499j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1500a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1501b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1502c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1503e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1504f;

    /* renamed from: g, reason: collision with root package name */
    public int f1505g;
    public boolean h;
    public boolean i;

    public w() {
        Object obj = f1499j;
        this.f1504f = obj;
        this.f1503e = obj;
        this.f1505g = -1;
    }

    public static void a(String str) {
        ((C0260a) C0260a.k().f3122a).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1497b) {
            int i = vVar.f1498c;
            int i2 = this.f1505g;
            if (i >= i2) {
                return;
            }
            vVar.f1498c = i2;
            C.g gVar = vVar.f1496a;
            Object obj = this.f1503e;
            gVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m = (DialogInterfaceOnCancelListenerC0047m) gVar.f115b;
                if (dialogInterfaceOnCancelListenerC0047m.f1064Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0047m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0047m.f1068c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + gVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0047m.f1068c0);
                        }
                        dialogInterfaceOnCancelListenerC0047m.f1068c0.setContentView(D2);
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
                n.f fVar = this.f1501b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3201c.put(dVar, Boolean.FALSE);
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
        this.f1505g++;
        this.f1503e = obj;
        c(null);
    }
}
