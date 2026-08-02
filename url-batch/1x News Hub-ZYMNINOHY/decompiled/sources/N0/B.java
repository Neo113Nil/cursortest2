package N0;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f987g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static B f988h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f989i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f990a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f991b;

    /* renamed from: c, reason: collision with root package name */
    public volatile W0.e f992c;

    /* renamed from: d, reason: collision with root package name */
    public final Q0.a f993d;

    /* renamed from: e, reason: collision with root package name */
    public final long f994e;
    public final long f;

    public B(Context context, Looper looper) {
        A a3 = new A(this);
        this.f991b = context.getApplicationContext();
        W0.e eVar = new W0.e(looper, a3);
        Looper.getMainLooper();
        this.f992c = eVar;
        this.f993d = Q0.a.a();
        this.f994e = 5000L;
        this.f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        y yVar = new y(str, z);
        r.d(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f990a) {
            try {
                z zVar = (z) this.f990a.get(yVar);
                if (zVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(yVar.toString()));
                }
                if (!zVar.f1074a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(yVar.toString()));
                }
                zVar.f1074a.remove(serviceConnection);
                if (zVar.f1074a.isEmpty()) {
                    this.f992c.sendMessageDelayed(this.f992c.obtainMessage(0, yVar), this.f994e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(y yVar, u uVar, String str) {
        boolean z;
        synchronized (this.f990a) {
            try {
                z zVar = (z) this.f990a.get(yVar);
                if (zVar == null) {
                    zVar = new z(this, yVar);
                    zVar.f1074a.put(uVar, uVar);
                    zVar.a(str, null);
                    this.f990a.put(yVar, zVar);
                } else {
                    this.f992c.removeMessages(0, yVar);
                    if (zVar.f1074a.containsKey(uVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(yVar.toString()));
                    }
                    zVar.f1074a.put(uVar, uVar);
                    int i3 = zVar.f1075b;
                    if (i3 == 1) {
                        uVar.onServiceConnected(zVar.f, zVar.f1077d);
                    } else if (i3 == 2) {
                        zVar.a(str, null);
                    }
                }
                z = zVar.f1076c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
