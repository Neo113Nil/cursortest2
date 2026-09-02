package d2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import g2.C0440a;
import java.util.HashMap;
import m2.HandlerC1312d;

/* renamed from: d2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381C {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f8223g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static C0381C f8224h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f8225i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8226a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f8227b;

    /* renamed from: c, reason: collision with root package name */
    public volatile HandlerC1312d f8228c;

    /* renamed from: d, reason: collision with root package name */
    public final C0440a f8229d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8230e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8231f;

    public C0381C(Context context, Looper looper) {
        C0380B c0380b = new C0380B(this);
        this.f8227b = context.getApplicationContext();
        HandlerC1312d handlerC1312d = new HandlerC1312d(looper, c0380b);
        Looper.getMainLooper();
        this.f8228c = handlerC1312d;
        this.f8229d = C0440a.a();
        this.f8230e = 5000L;
        this.f8231f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        z zVar = new z(str, z);
        s.d(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8226a) {
            try {
                ServiceConnectionC0379A serviceConnectionC0379A = (ServiceConnectionC0379A) this.f8226a.get(zVar);
                if (serviceConnectionC0379A == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(zVar.toString()));
                }
                if (!serviceConnectionC0379A.f8215a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(zVar.toString()));
                }
                serviceConnectionC0379A.f8215a.remove(serviceConnection);
                if (serviceConnectionC0379A.f8215a.isEmpty()) {
                    this.f8228c.sendMessageDelayed(this.f8228c.obtainMessage(0, zVar), this.f8230e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(z zVar, v vVar, String str) {
        boolean z;
        synchronized (this.f8226a) {
            try {
                ServiceConnectionC0379A serviceConnectionC0379A = (ServiceConnectionC0379A) this.f8226a.get(zVar);
                if (serviceConnectionC0379A == null) {
                    serviceConnectionC0379A = new ServiceConnectionC0379A(this, zVar);
                    serviceConnectionC0379A.f8215a.put(vVar, vVar);
                    serviceConnectionC0379A.a(str, null);
                    this.f8226a.put(zVar, serviceConnectionC0379A);
                } else {
                    this.f8228c.removeMessages(0, zVar);
                    if (serviceConnectionC0379A.f8215a.containsKey(vVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(zVar.toString()));
                    }
                    serviceConnectionC0379A.f8215a.put(vVar, vVar);
                    int i4 = serviceConnectionC0379A.f8216b;
                    if (i4 == 1) {
                        vVar.onServiceConnected(serviceConnectionC0379A.f8220f, serviceConnectionC0379A.f8218d);
                    } else if (i4 == 2) {
                        serviceConnectionC0379A.a(str, null);
                    }
                }
                z = serviceConnectionC0379A.f8217c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
