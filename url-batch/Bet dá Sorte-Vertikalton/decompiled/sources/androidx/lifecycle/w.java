package androidx.lifecycle;

import X.DialogInterfaceOnCancelListenerC0043m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0252a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1457j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1458a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1459b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1460c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1461e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1462f;

    /* renamed from: g, reason: collision with root package name */
    public int f1463g;
    public boolean h;
    public boolean i;

    public w() {
        Object obj = f1457j;
        this.f1462f = obj;
        this.f1461e = obj;
        this.f1463g = -1;
    }

    public static void a(String str) {
        ((C0252a) C0252a.q().d).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1455b) {
            int i = vVar.f1456c;
            int i2 = this.f1463g;
            if (i >= i2) {
                return;
            }
            vVar.f1456c = i2;
            C.h hVar = vVar.f1454a;
            Object obj = this.f1461e;
            hVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m = (DialogInterfaceOnCancelListenerC0043m) hVar.f150b;
                if (dialogInterfaceOnCancelListenerC0043m.f1018Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0043m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0043m.f1022c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + hVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0043m.f1022c0);
                        }
                        dialogInterfaceOnCancelListenerC0043m.f1022c0.setContentView(D2);
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
                n.f fVar = this.f1459b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3316c.put(dVar, Boolean.FALSE);
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
        this.f1463g++;
        this.f1461e = obj;
        c(null);
    }
}
