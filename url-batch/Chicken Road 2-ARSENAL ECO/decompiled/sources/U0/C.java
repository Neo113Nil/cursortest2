package U0;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2497g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static C f2498h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f2499i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2500a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f2501b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c1.e f2502c;

    /* renamed from: d, reason: collision with root package name */
    public final X0.a f2503d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2504e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2505f;

    public C(Context context, Looper looper) {
        Q0.l lVar = new Q0.l(1, this);
        this.f2501b = context.getApplicationContext();
        c1.e eVar = new c1.e(looper, lVar);
        Looper.getMainLooper();
        this.f2502c = eVar;
        this.f2503d = X0.a.a();
        this.f2504e = 5000L;
        this.f2505f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z5) {
        A a7 = new A(str, z5);
        t.g(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f2500a) {
            try {
                B b7 = (B) this.f2500a.get(a7);
                if (b7 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(a7.toString()));
                }
                if (!b7.f2490a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(a7.toString()));
                }
                b7.f2490a.remove(serviceConnection);
                if (b7.f2490a.isEmpty()) {
                    this.f2502c.sendMessageDelayed(this.f2502c.obtainMessage(0, a7), this.f2504e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(A a7, w wVar, String str) {
        boolean z5;
        synchronized (this.f2500a) {
            try {
                B b7 = (B) this.f2500a.get(a7);
                if (b7 == null) {
                    b7 = new B(this, a7);
                    b7.f2490a.put(wVar, wVar);
                    b7.a(str, null);
                    this.f2500a.put(a7, b7);
                } else {
                    this.f2502c.removeMessages(0, a7);
                    if (b7.f2490a.containsKey(wVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(a7.toString()));
                    }
                    b7.f2490a.put(wVar, wVar);
                    int i7 = b7.f2491b;
                    if (i7 == 1) {
                        wVar.onServiceConnected(b7.f2495f, b7.f2493d);
                    } else if (i7 == 2) {
                        b7.a(str, null);
                    }
                }
                z5 = b7.f2492c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }
}
