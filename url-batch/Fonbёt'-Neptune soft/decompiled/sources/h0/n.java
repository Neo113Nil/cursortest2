package h0;

import android.os.Handler;
import x.C0326e;
import x.CallableC0325d;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2336e = 1;

    /* renamed from: f, reason: collision with root package name */
    public Object f2337f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2338g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2339h;

    public /* synthetic */ n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f2336e) {
            case 0:
                synchronized (p.f2348j) {
                    p.a((p) this.f2339h, (C0197e) this.f2337f);
                }
                ((v0.i) this.f2338g).c(null);
                return;
            default:
                try {
                    obj = ((CallableC0325d) this.f2337f).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f2339h).post(new d1.i((C0326e) this.f2338g, obj, 4, false));
                return;
        }
    }

    public n(p pVar, C0197e c0197e, v0.i iVar) {
        this.f2339h = pVar;
        this.f2337f = c0197e;
        this.f2338g = iVar;
    }
}
