package v6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c7.c0;
import c7.p0;
import java.io.IOException;
import java.util.HashMap;
import l7.d;
import z6.g;
import z6.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f9968h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static volatile a f9969i;

    /* renamed from: a, reason: collision with root package name */
    public z6.a f9970a;

    /* renamed from: b, reason: collision with root package name */
    public d f9971b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9972c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9973d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public b f9974e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f9975f;
    public final long g;

    public a(Context context) {
        c0.g(context);
        this.f9975f = context.getApplicationContext();
        this.f9972c = false;
        this.g = 30000L;
    }

    public static p0 a(Context context) {
        a aVar = f9969i;
        if (aVar == null) {
            synchronized (f9968h) {
                try {
                    aVar = f9969i;
                    if (aVar == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        aVar = new a(context);
                        f9969i = aVar;
                    }
                } finally {
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if (c.f9979c == null) {
            synchronized (c.f9980d) {
                try {
                    if (c.f9979c == null) {
                        c.f9979c = new c(context);
                    }
                } finally {
                }
            }
        }
        c cVar = c.f9979c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            p0 f3 = aVar.f();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            e(f3, elapsedRealtime2, null);
            cVar.a(0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, System.currentTimeMillis());
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + elapsedRealtime2 + "ms");
            return f3;
        } catch (Throwable th) {
            e(null, -1L, th);
            cVar.a(!(th instanceof IOException) ? !(th instanceof h) ? th instanceof IllegalStateException ? 8 : -1 : 9 : 1, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, System.currentTimeMillis());
            throw th;
        }
    }

    public static void e(p0 p0Var, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (p0Var != null) {
                hashMap.put("limit_ad_tracking", true != p0Var.f1972c ? "0" : "1");
                String str = p0Var.f1971b;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new kd.a(hashMap).start();
        }
    }

    public final void b() {
        c0.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f9975f == null || this.f9970a == null) {
                    return;
                }
                try {
                    if (this.f9972c) {
                        f7.a.b().c(this.f9975f, this.f9970a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f9972c = false;
                this.f9971b = null;
                this.f9970a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        c0.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f9972c) {
                    return;
                }
                Context context = this.f9975f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b10 = g.f10882b.b(context, 12451000);
                    if (b10 != 0 && b10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    z6.a aVar = new z6.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!f7.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f9970a = aVar;
                        try {
                            IBinder a9 = aVar.a();
                            int i3 = l7.c.f5891d;
                            IInterface queryLocalInterface = a9.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f9971b = queryLocalInterface instanceof d ? (d) queryLocalInterface : new l7.b(a9);
                            this.f9972c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void d() {
        try {
            if (!this.f9972c) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    c();
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.f9972c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
        } finally {
        }
    }

    public final p0 f() {
        p0 p0Var;
        c0.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            d();
            c0.g(this.f9970a);
            c0.g(this.f9971b);
            try {
                l7.b bVar = (l7.b) this.f9971b;
                bVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                Parcel C = bVar.C(obtain, 1);
                String readString = C.readString();
                C.recycle();
                l7.b bVar2 = (l7.b) this.f9971b;
                bVar2.getClass();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i3 = l7.a.f5889a;
                obtain2.writeInt(1);
                Parcel C2 = bVar2.C(obtain2, 2);
                boolean z10 = C2.readInt() != 0;
                C2.recycle();
                p0Var = new p0(readString, z10, 1);
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception", e2);
            }
        }
        synchronized (this.f9973d) {
            b bVar3 = this.f9974e;
            if (bVar3 != null) {
                bVar3.f9978i.countDown();
                try {
                    this.f9974e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.f9974e = new b(this, j);
            }
        }
        return p0Var;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
