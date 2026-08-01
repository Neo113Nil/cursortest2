package androidx.lifecycle;

import Y.DialogInterfaceOnCancelListenerC0047m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0263a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1530j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1531a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1532b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1533c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1534e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1535f;

    /* renamed from: g, reason: collision with root package name */
    public int f1536g;
    public boolean h;
    public boolean i;

    public w() {
        Object obj = f1530j;
        this.f1535f = obj;
        this.f1534e = obj;
        this.f1536g = -1;
    }

    public static void a(String str) {
        ((C0263a) C0263a.t().d).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1528b) {
            int i = vVar.f1529c;
            int i2 = this.f1536g;
            if (i >= i2) {
                return;
            }
            vVar.f1529c = i2;
            C.g gVar = vVar.f1527a;
            Object obj = this.f1534e;
            gVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m = (DialogInterfaceOnCancelListenerC0047m) gVar.f80b;
                if (dialogInterfaceOnCancelListenerC0047m.f1091Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0047m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0047m.f1095c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + gVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0047m.f1095c0);
                        }
                        dialogInterfaceOnCancelListenerC0047m.f1095c0.setContentView(D2);
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
                n.f fVar = this.f1532b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3234c.put(dVar, Boolean.FALSE);
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
        this.f1536g++;
        this.f1534e = obj;
        c(null);
    }
}
