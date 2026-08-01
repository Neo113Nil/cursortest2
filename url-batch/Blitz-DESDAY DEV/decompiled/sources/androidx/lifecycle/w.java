package androidx.lifecycle;

import Z.DialogInterfaceOnCancelListenerC0043m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import m.C0227a;
import n.C0243d;
import n.C0245f;

/* loaded from: classes.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1587j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1588a;

    /* renamed from: b, reason: collision with root package name */
    public final C0245f f1589b = new C0245f();

    /* renamed from: c, reason: collision with root package name */
    public int f1590c = 0;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1591e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1592f;

    /* renamed from: g, reason: collision with root package name */
    public int f1593g;
    public boolean h;
    public boolean i;

    public w() {
        Object obj = f1587j;
        this.f1592f = obj;
        this.f1591e = obj;
        this.f1593g = -1;
    }

    public static void a(String str) {
        ((C0227a) C0227a.k().f3117a).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(v vVar) {
        if (vVar.f1585b) {
            int i = vVar.f1586c;
            int i2 = this.f1593g;
            if (i >= i2) {
                return;
            }
            vVar.f1586c = i2;
            E.g gVar = vVar.f1584a;
            Object obj = this.f1591e;
            gVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m = (DialogInterfaceOnCancelListenerC0043m) gVar.f170b;
                if (dialogInterfaceOnCancelListenerC0043m.f1153Y) {
                    View D2 = dialogInterfaceOnCancelListenerC0043m.D();
                    if (D2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0043m.f1157c0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + gVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0043m.f1157c0);
                        }
                        dialogInterfaceOnCancelListenerC0043m.f1157c0.setContentView(D2);
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
                C0245f c0245f = this.f1589b;
                c0245f.getClass();
                C0243d c0243d = new C0243d(c0245f);
                c0245f.f3225c.put(c0243d, Boolean.FALSE);
                while (c0243d.hasNext()) {
                    b((v) ((Map.Entry) c0243d.next()).getValue());
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
        this.f1593g++;
        this.f1591e = obj;
        c(null);
    }
}
