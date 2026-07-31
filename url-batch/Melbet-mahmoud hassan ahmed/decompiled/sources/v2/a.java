package v2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o3.f;
import o3.g;
import o3.j;
import r3.o;
import y3.e;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private o3.a f22802a;

    /* renamed from: b, reason: collision with root package name */
    private y3.d f22803b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22804c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f22805d;

    /* renamed from: e, reason: collision with root package name */
    private b f22806e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f22807f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f22808g;

    /* renamed from: h, reason: collision with root package name */
    private final long f22809h;

    /* renamed from: v2.a$a, reason: collision with other inner class name */
    public static final class C0146a {

        /* renamed from: a, reason: collision with root package name */
        private final String f22810a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f22811b;

        public C0146a(String str, boolean z6) {
            this.f22810a = str;
            this.f22811b = z6;
        }

        public final String a() {
            return this.f22810a;
        }

        public final boolean b() {
            return this.f22811b;
        }

        public final String toString() {
            String str = this.f22810a;
            boolean z6 = this.f22811b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z6);
            return sb.toString();
        }
    }

    static class b extends Thread {

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<a> f22812f;

        /* renamed from: g, reason: collision with root package name */
        private long f22813g;

        /* renamed from: h, reason: collision with root package name */
        CountDownLatch f22814h = new CountDownLatch(1);

        /* renamed from: i, reason: collision with root package name */
        boolean f22815i = false;

        public b(a aVar, long j7) {
            this.f22812f = new WeakReference<>(aVar);
            this.f22813g = j7;
            start();
        }

        private final void a() {
            a aVar = this.f22812f.get();
            if (aVar != null) {
                aVar.a();
                this.f22815i = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f22814h.await(this.f22813g, TimeUnit.MILLISECONDS)) {
                    return;
                }
                a();
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    public a(Context context) {
        this(context, 30000L, false, false);
    }

    private a(Context context, long j7, boolean z6, boolean z7) {
        Context applicationContext;
        this.f22805d = new Object();
        o.i(context);
        if (z6 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f22807f = context;
        this.f22804c = false;
        this.f22809h = j7;
        this.f22808g = z7;
    }

    public static C0146a b(Context context) {
        c cVar = new c(context);
        boolean a7 = cVar.a("gads:ad_id_app_context:enabled", false);
        float b7 = cVar.b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String c7 = cVar.c("gads:ad_id_use_shared_preference:experiment_id", "");
        a aVar = new a(context, -1L, a7, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.i(false);
            C0146a c8 = aVar.c();
            aVar.j(c8, a7, b7, SystemClock.elapsedRealtime() - elapsedRealtime, c7, null);
            return c8;
        } finally {
        }
    }

    public static boolean d(Context context) {
        c cVar = new c(context);
        a aVar = new a(context, -1L, cVar.a("gads:ad_id_app_context:enabled", false), cVar.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.i(false);
            return aVar.k();
        } finally {
            aVar.a();
        }
    }

    private static o3.a f(Context context, boolean z6) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int h7 = f.f().h(context, j.f19861a);
            if (h7 != 0 && h7 != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z6 ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            o3.a aVar = new o3.a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (u3.a.b().a(context, intent, aVar, 1)) {
                    return aVar;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g(9);
        }
    }

    private static y3.d g(Context context, o3.a aVar) {
        try {
            return e.E(aVar.a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void h() {
        synchronized (this.f22805d) {
            b bVar = this.f22806e;
            if (bVar != null) {
                bVar.f22814h.countDown();
                try {
                    this.f22806e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f22809h > 0) {
                this.f22806e = new b(this, this.f22809h);
            }
        }
    }

    private final void i(boolean z6) {
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f22804c) {
                a();
            }
            o3.a f7 = f(this.f22807f, this.f22808g);
            this.f22802a = f7;
            this.f22803b = g(this.f22807f, f7);
            this.f22804c = true;
            if (z6) {
                h();
            }
        }
    }

    private final boolean j(C0146a c0146a, boolean z6, float f7, long j7, String str, Throwable th) {
        if (Math.random() > f7) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z6 ? "1" : "0");
        if (c0146a != null) {
            hashMap.put("limit_ad_tracking", c0146a.b() ? "1" : "0");
        }
        if (c0146a != null && c0146a.a() != null) {
            hashMap.put("ad_id_size", Integer.toString(c0146a.a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j7));
        new v2.b(this, hashMap).start();
        return true;
    }

    private final boolean k() {
        boolean c7;
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f22804c) {
                synchronized (this.f22805d) {
                    b bVar = this.f22806e;
                    if (bVar == null || !bVar.f22815i) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    i(false);
                    if (!this.f22804c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e7) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                }
            }
            o.i(this.f22802a);
            o.i(this.f22803b);
            try {
                c7 = this.f22803b.c();
            } catch (RemoteException e8) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                throw new IOException("Remote exception");
            }
        }
        h();
        return c7;
    }

    public final void a() {
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f22807f == null || this.f22802a == null) {
                return;
            }
            try {
                if (this.f22804c) {
                    u3.a.b().c(this.f22807f, this.f22802a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f22804c = false;
            this.f22803b = null;
            this.f22802a = null;
        }
    }

    public C0146a c() {
        C0146a c0146a;
        o.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f22804c) {
                synchronized (this.f22805d) {
                    b bVar = this.f22806e;
                    if (bVar == null || !bVar.f22815i) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    i(false);
                    if (!this.f22804c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e7) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                }
            }
            o.i(this.f22802a);
            o.i(this.f22803b);
            try {
                c0146a = new C0146a(this.f22803b.I3(), this.f22803b.b0(true));
            } catch (RemoteException e8) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                throw new IOException("Remote exception");
            }
        }
        h();
        return c0146a;
    }

    public void e() {
        i(true);
    }

    protected void finalize() {
        a();
        super.finalize();
    }
}
