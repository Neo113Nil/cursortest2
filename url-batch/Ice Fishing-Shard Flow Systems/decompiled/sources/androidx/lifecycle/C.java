package androidx.lifecycle;

import android.os.Looper;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0226q;
import java.util.Map;
import o.C0793a;
import p.C0814d;
import p.C0816f;

/* loaded from: classes.dex */
public class C {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f3837k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f3838a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C0816f f3839b = new C0816f();

    /* renamed from: c, reason: collision with root package name */
    public int f3840c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3841d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f3842e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f3843f;

    /* renamed from: g, reason: collision with root package name */
    public int f3844g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3845h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3846i;
    public final F.b j;

    public C() {
        Object obj = f3837k;
        this.f3843f = obj;
        this.j = new F.b(11, this);
        this.f3842e = obj;
        this.f3844g = -1;
    }

    public static void a(String str) {
        C0793a.T().f7106b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(r4.f.d("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(B b7) {
        if (b7.f3834b) {
            int i2 = b7.f3835c;
            int i5 = this.f3844g;
            if (i2 >= i5) {
                return;
            }
            b7.f3835c = i5;
            l2.c cVar = b7.f3833a;
            Object obj = this.f3842e;
            cVar.getClass();
            InterfaceC0256w interfaceC0256w = (InterfaceC0256w) obj;
            DialogInterfaceOnCancelListenerC0226q dialogInterfaceOnCancelListenerC0226q = (DialogInterfaceOnCancelListenerC0226q) cVar.f6269d;
            if (interfaceC0256w == null || !dialogInterfaceOnCancelListenerC0226q.f3755f0) {
                return;
            }
            dialogInterfaceOnCancelListenerC0226q.getClass();
            throw new IllegalStateException("Fragment " + dialogInterfaceOnCancelListenerC0226q + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public final void c(B b7) {
        if (this.f3845h) {
            this.f3846i = true;
            return;
        }
        this.f3845h = true;
        do {
            this.f3846i = false;
            if (b7 != null) {
                b(b7);
                b7 = null;
            } else {
                C0816f c0816f = this.f3839b;
                c0816f.getClass();
                C0814d c0814d = new C0814d(c0816f);
                c0816f.f7149i.put(c0814d, Boolean.FALSE);
                while (c0814d.hasNext()) {
                    b((B) ((Map.Entry) c0814d.next()).getValue());
                    if (this.f3846i) {
                        break;
                    }
                }
            }
        } while (this.f3846i);
        this.f3845h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.f3844g++;
        this.f3842e = obj;
        c(null);
    }
}
