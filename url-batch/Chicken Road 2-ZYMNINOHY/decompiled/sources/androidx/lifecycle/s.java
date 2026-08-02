package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0215t;
import androidx.fragment.app.f0;
import java.util.Map;
import m.C1276d;
import m.C1278f;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5064j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f5065a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C1278f f5066b = new C1278f();

    /* renamed from: c, reason: collision with root package name */
    public int f5067c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5068d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f5069e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f5070f;

    /* renamed from: g, reason: collision with root package name */
    public int f5071g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5072h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5073i;

    public s() {
        Object obj = f5064j;
        this.f5070f = obj;
        this.f5069e = obj;
        this.f5071g = -1;
    }

    public static void a(String str) {
        ((l.a) l.a.z().f14162c).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC1514c.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(r rVar) {
        if (rVar.f5061b) {
            int i4 = rVar.f5062c;
            int i5 = this.f5071g;
            if (i4 >= i5) {
                return;
            }
            rVar.f5062c = i5;
            androidx.fragment.app.A a3 = rVar.f5060a;
            Object obj = this.f5069e;
            a3.getClass();
            InterfaceC0235n interfaceC0235n = (InterfaceC0235n) obj;
            DialogInterfaceOnCancelListenerC0215t dialogInterfaceOnCancelListenerC0215t = (DialogInterfaceOnCancelListenerC0215t) a3.f4715b;
            if (interfaceC0235n == null || !dialogInterfaceOnCancelListenerC0215t.f4971f) {
                return;
            }
            View requireView = dialogInterfaceOnCancelListenerC0215t.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (dialogInterfaceOnCancelListenerC0215t.f4975j != null) {
                if (f0.J(3)) {
                    Log.d("FragmentManager", "DialogFragment " + a3 + " setting the content view on " + dialogInterfaceOnCancelListenerC0215t.f4975j);
                }
                dialogInterfaceOnCancelListenerC0215t.f4975j.setContentView(requireView);
            }
        }
    }

    public final void c(r rVar) {
        if (this.f5072h) {
            this.f5073i = true;
            return;
        }
        this.f5072h = true;
        do {
            this.f5073i = false;
            if (rVar != null) {
                b(rVar);
                rVar = null;
            } else {
                C1278f c1278f = this.f5066b;
                c1278f.getClass();
                C1276d c1276d = new C1276d(c1278f);
                c1278f.f14290c.put(c1276d, Boolean.FALSE);
                while (c1276d.hasNext()) {
                    b((r) ((Map.Entry) c1276d.next()).getValue());
                    if (this.f5073i) {
                        break;
                    }
                }
            }
        } while (this.f5073i);
        this.f5072h = false;
    }
}
