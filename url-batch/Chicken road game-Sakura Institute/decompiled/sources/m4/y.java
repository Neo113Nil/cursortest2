package m4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f6413g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static y f6414h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f6415i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6416a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f6417b;

    /* renamed from: c, reason: collision with root package name */
    public volatile u4.e f6418c;

    /* renamed from: d, reason: collision with root package name */
    public final p4.a f6419d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6420e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6421f;

    public y(Context context, Looper looper) {
        x xVar = new x(this);
        this.f6417b = context.getApplicationContext();
        u4.e eVar = new u4.e(looper, xVar);
        Looper.getMainLooper();
        this.f6418c = eVar;
        this.f6419d = p4.a.a();
        this.f6420e = 5000L;
        this.f6421f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z8) {
        v vVar = new v(str, z8);
        o.e(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6416a) {
            try {
                w wVar = (w) this.f6416a.get(vVar);
                if (wVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(vVar.toString()));
                }
                if (!wVar.f6405a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(vVar.toString()));
                }
                wVar.f6405a.remove(serviceConnection);
                if (wVar.f6405a.isEmpty()) {
                    this.f6418c.sendMessageDelayed(this.f6418c.obtainMessage(0, vVar), this.f6420e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(v vVar, r rVar, String str) {
        boolean z8;
        synchronized (this.f6416a) {
            try {
                w wVar = (w) this.f6416a.get(vVar);
                if (wVar == null) {
                    wVar = new w(this, vVar);
                    wVar.f6405a.put(rVar, rVar);
                    wVar.a(str, null);
                    this.f6416a.put(vVar, wVar);
                } else {
                    this.f6418c.removeMessages(0, vVar);
                    if (wVar.f6405a.containsKey(rVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(vVar.toString()));
                    }
                    wVar.f6405a.put(rVar, rVar);
                    int i7 = wVar.f6406b;
                    if (i7 == 1) {
                        rVar.onServiceConnected(wVar.f6410f, wVar.f6408d);
                    } else if (i7 == 2) {
                        wVar.a(str, null);
                    }
                }
                z8 = wVar.f6407c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }
}
