package c7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.measurement.z5;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 {
    public static final Object g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static o0 f1961h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f1962i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1963a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f1964b;

    /* renamed from: c, reason: collision with root package name */
    public volatile z5 f1965c;

    /* renamed from: d, reason: collision with root package name */
    public final f7.a f1966d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1967e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1968f;

    public o0(Context context, Looper looper) {
        n0 n0Var = new n0(this);
        this.f1964b = context.getApplicationContext();
        z5 z5Var = new z5(looper, n0Var);
        Looper.getMainLooper();
        this.f1965c = z5Var;
        this.f1966d = f7.a.b();
        this.f1967e = 5000L;
        this.f1968f = 300000L;
    }

    public static o0 a(Context context) {
        synchronized (g) {
            try {
                if (f1961h == null) {
                    f1961h = new o0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1961h;
    }

    public final z6.b b(l0 l0Var, h0 h0Var, String str, Executor executor) {
        z6.b bVar;
        HashMap hashMap = this.f1963a;
        synchronized (hashMap) {
            try {
                m0 m0Var = (m0) hashMap.get(l0Var);
                if (executor == null) {
                    executor = null;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.f1950a.put(h0Var, h0Var);
                    bVar = m0Var.a(str, executor);
                    hashMap.put(l0Var, m0Var);
                } else {
                    this.f1965c.removeMessages(0, l0Var);
                    if (m0Var.f1950a.containsKey(h0Var)) {
                        String l0Var2 = l0Var.toString();
                        StringBuilder sb2 = new StringBuilder(l0Var2.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(l0Var2);
                        throw new IllegalStateException(sb2.toString());
                    }
                    m0Var.f1950a.put(h0Var, h0Var);
                    int i3 = m0Var.f1951b;
                    if (i3 == 1) {
                        h0Var.onServiceConnected(m0Var.f1955f, m0Var.f1953d);
                    } else if (i3 == 2) {
                        bVar = m0Var.a(str, executor);
                    }
                    bVar = null;
                }
                if (m0Var.f1952c) {
                    return z6.b.f10865t;
                }
                if (bVar == null) {
                    bVar = new z6.b(-1, null, null);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z10) {
        l0 l0Var = new l0(str, z10);
        c0.h(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f1963a;
        synchronized (hashMap) {
            try {
                m0 m0Var = (m0) hashMap.get(l0Var);
                if (m0Var == null) {
                    String l0Var2 = l0Var.toString();
                    StringBuilder sb2 = new StringBuilder(l0Var2.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(l0Var2);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!m0Var.f1950a.containsKey(serviceConnection)) {
                    String l0Var3 = l0Var.toString();
                    StringBuilder sb3 = new StringBuilder(l0Var3.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(l0Var3);
                    throw new IllegalStateException(sb3.toString());
                }
                m0Var.f1950a.remove(serviceConnection);
                if (m0Var.f1950a.isEmpty()) {
                    this.f1965c.sendMessageDelayed(this.f1965c.obtainMessage(0, l0Var), this.f1967e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
