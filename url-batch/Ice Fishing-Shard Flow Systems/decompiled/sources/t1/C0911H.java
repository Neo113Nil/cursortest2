package t1;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: t1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911H {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f7913g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static C0911H f7914h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f7915i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7916a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f7917b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1.e f7918c;

    /* renamed from: d, reason: collision with root package name */
    public final w1.a f7919d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7920e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7921f;

    public C0911H(Context context, Looper looper) {
        C0910G c0910g = new C0910G(this);
        this.f7917b = context.getApplicationContext();
        C1.e eVar = new C1.e(looper, c0910g);
        Looper.getMainLooper();
        this.f7918c = eVar;
        this.f7919d = w1.a.a();
        this.f7920e = 5000L;
        this.f7921f = 300000L;
    }

    public final q1.b a(C0908E c0908e, z zVar, String str) {
        q1.b bVar;
        HashMap hashMap = this.f7916a;
        synchronized (hashMap) {
            try {
                ServiceConnectionC0909F serviceConnectionC0909F = (ServiceConnectionC0909F) hashMap.get(c0908e);
                if (serviceConnectionC0909F == null) {
                    serviceConnectionC0909F = new ServiceConnectionC0909F(this, c0908e);
                    serviceConnectionC0909F.f7905a.put(zVar, zVar);
                    bVar = serviceConnectionC0909F.a(str, null);
                    hashMap.put(c0908e, serviceConnectionC0909F);
                } else {
                    this.f7918c.removeMessages(0, c0908e);
                    if (serviceConnectionC0909F.f7905a.containsKey(zVar)) {
                        String c0908e2 = c0908e.toString();
                        StringBuilder sb = new StringBuilder(c0908e2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(c0908e2);
                        throw new IllegalStateException(sb.toString());
                    }
                    serviceConnectionC0909F.f7905a.put(zVar, zVar);
                    int i2 = serviceConnectionC0909F.f7906b;
                    if (i2 == 1) {
                        zVar.onServiceConnected(serviceConnectionC0909F.f7910f, serviceConnectionC0909F.f7908d);
                    } else if (i2 == 2) {
                        bVar = serviceConnectionC0909F.a(str, null);
                    }
                    bVar = null;
                }
                if (serviceConnectionC0909F.f7907c) {
                    return q1.b.f7309n;
                }
                if (bVar == null) {
                    bVar = new q1.b(-1, null, null);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z7) {
        C0908E c0908e = new C0908E(str, z7);
        u.g(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f7916a;
        synchronized (hashMap) {
            try {
                ServiceConnectionC0909F serviceConnectionC0909F = (ServiceConnectionC0909F) hashMap.get(c0908e);
                if (serviceConnectionC0909F == null) {
                    String c0908e2 = c0908e.toString();
                    StringBuilder sb = new StringBuilder(c0908e2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(c0908e2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!serviceConnectionC0909F.f7905a.containsKey(serviceConnection)) {
                    String c0908e3 = c0908e.toString();
                    StringBuilder sb2 = new StringBuilder(c0908e3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(c0908e3);
                    throw new IllegalStateException(sb2.toString());
                }
                serviceConnectionC0909F.f7905a.remove(serviceConnection);
                if (serviceConnectionC0909F.f7905a.isEmpty()) {
                    this.f7918c.sendMessageDelayed(this.f7918c.obtainMessage(0, c0908e), this.f7920e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
