package androidx.lifecycle;

import X.DialogInterfaceOnCancelListenerC0044m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0275a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1379j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1380a;

    /* renamed from: b, reason: collision with root package name */
    public final n.f f1381b = new n.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1382c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1383e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1384f;

    /* renamed from: g, reason: collision with root package name */
    public int f1385g;
    public boolean h;
    public boolean i;

    public w() {
        Object obj = f1379j;
        this.f1384f = obj;
        this.f1383e = obj;
        this.f1385g = -1;
    }

    public static void a(String str) {
        ((C0275a) C0275a.l().f3188b).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1377b) {
            int i = vVar.f1378c;
            int i2 = this.f1385g;
            if (i >= i2) {
                return;
            }
            vVar.f1378c = i2;
            B0.d dVar = vVar.f1376a;
            Object obj = this.f1383e;
            dVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) dVar.f59b;
                if (dialogInterfaceOnCancelListenerC0044m.f932Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0044m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0044m.f936c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0044m.f936c0);
                        }
                        dialogInterfaceOnCancelListenerC0044m.f936c0.setContentView(D2);
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
                n.f fVar = this.f1381b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f3279c.put(dVar, Boolean.FALSE);
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
        this.f1385g++;
        this.f1383e = obj;
        c(null);
    }
}
