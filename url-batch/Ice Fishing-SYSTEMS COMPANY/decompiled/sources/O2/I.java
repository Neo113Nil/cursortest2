package O2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2369g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static I f2370h;
    public static HandlerThread i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2371a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f2372b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Z2.e f2373c;

    /* renamed from: d, reason: collision with root package name */
    public final R2.b f2374d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2375e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2376f;

    public I(Context context, Looper looper) {
        H h9 = new H(this);
        this.f2372b = context.getApplicationContext();
        Z2.e eVar = new Z2.e(looper, h9, 2);
        Looper.getMainLooper();
        this.f2373c = eVar;
        this.f2374d = R2.b.a();
        this.f2375e = com.anythink.basead.exoplayer.f.f7344a;
        this.f2376f = 300000L;
    }

    public static I a(Context context) {
        synchronized (f2369g) {
            try {
                if (f2370h == null) {
                    f2370h = new I(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2370h;
    }

    public final L2.b b(F f6, B b9, String str, Executor executor) {
        L2.b bVar;
        HashMap hashMap = this.f2371a;
        synchronized (hashMap) {
            try {
                G g9 = (G) hashMap.get(f6);
                if (executor == null) {
                    executor = null;
                }
                if (g9 == null) {
                    g9 = new G(this, f6);
                    g9.f2361n.put(b9, b9);
                    bVar = g9.a(str, executor);
                    hashMap.put(f6, g9);
                } else {
                    this.f2373c.removeMessages(0, f6);
                    if (g9.f2361n.containsKey(b9)) {
                        String f9 = f6.toString();
                        StringBuilder sb = new StringBuilder(f9.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(f9);
                        throw new IllegalStateException(sb.toString());
                    }
                    g9.f2361n.put(b9, b9);
                    int i4 = g9.f2362u;
                    if (i4 == 1) {
                        b9.onServiceConnected(g9.f2366y, g9.f2364w);
                    } else if (i4 == 2) {
                        bVar = g9.a(str, executor);
                    }
                    bVar = null;
                }
                if (g9.f2363v) {
                    return L2.b.f1710y;
                }
                if (bVar == null) {
                    bVar = new L2.b(-1, null, null);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z8) {
        F f6 = new F(str, z8);
        w.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f2371a;
        synchronized (hashMap) {
            try {
                G g9 = (G) hashMap.get(f6);
                if (g9 == null) {
                    String f9 = f6.toString();
                    StringBuilder sb = new StringBuilder(f9.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(f9);
                    throw new IllegalStateException(sb.toString());
                }
                if (!g9.f2361n.containsKey(serviceConnection)) {
                    String f10 = f6.toString();
                    StringBuilder sb2 = new StringBuilder(f10.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(f10);
                    throw new IllegalStateException(sb2.toString());
                }
                g9.f2361n.remove(serviceConnection);
                if (g9.f2361n.isEmpty()) {
                    this.f2373c.sendMessageDelayed(this.f2373c.obtainMessage(0, f6), this.f2375e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
