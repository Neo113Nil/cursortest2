package H1;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f3311g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static y f3312h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f3313i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3314a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f3315b;

    /* renamed from: c, reason: collision with root package name */
    public volatile P1.e f3316c;

    /* renamed from: d, reason: collision with root package name */
    public final K1.a f3317d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3318e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3319f;

    public y(Context context, Looper looper) {
        x xVar = new x(this);
        this.f3315b = context.getApplicationContext();
        P1.e eVar = new P1.e(looper, xVar);
        Looper.getMainLooper();
        this.f3316c = eVar;
        this.f3317d = K1.a.a();
        this.f3318e = 5000L;
        this.f3319f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z4) {
        v vVar = new v(str, z4);
        o.e(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3314a) {
            try {
                w wVar = (w) this.f3314a.get(vVar);
                if (wVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(vVar.toString()));
                }
                if (!wVar.f3303a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(vVar.toString()));
                }
                wVar.f3303a.remove(serviceConnection);
                if (wVar.f3303a.isEmpty()) {
                    this.f3316c.sendMessageDelayed(this.f3316c.obtainMessage(0, vVar), this.f3318e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(v vVar, r rVar, String str) {
        boolean z4;
        synchronized (this.f3314a) {
            try {
                w wVar = (w) this.f3314a.get(vVar);
                if (wVar == null) {
                    wVar = new w(this, vVar);
                    wVar.f3303a.put(rVar, rVar);
                    wVar.a(str, null);
                    this.f3314a.put(vVar, wVar);
                } else {
                    this.f3316c.removeMessages(0, vVar);
                    if (wVar.f3303a.containsKey(rVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(vVar.toString()));
                    }
                    wVar.f3303a.put(rVar, rVar);
                    int i2 = wVar.f3304b;
                    if (i2 == 1) {
                        rVar.onServiceConnected(wVar.f3308f, wVar.f3306d);
                    } else if (i2 == 2) {
                        wVar.a(str, null);
                    }
                }
                z4 = wVar.f3305c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
