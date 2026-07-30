package o2;

import L2.f;
import L2.g;
import O2.w;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4829b {

    /* renamed from: a, reason: collision with root package name */
    public L2.a f39689a;

    /* renamed from: b, reason: collision with root package name */
    public X2.d f39690b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39691c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f39692d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public C4831d f39693e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f39694f;

    /* renamed from: g, reason: collision with root package name */
    public final long f39695g;

    public C4829b(Context context, long j9, boolean z8) {
        Context applicationContext;
        w.h(context);
        if (z8 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f39694f = context;
        this.f39691c = false;
        this.f39695g = j9;
    }

    public static C4828a a(Context context) {
        C4829b c4829b = new C4829b(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c4829b.d(false);
            C4828a f6 = c4829b.f();
            e(f6, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return f6;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean z8;
        C4829b c4829b = new C4829b(context, -1L, false);
        try {
            c4829b.d(false);
            w.g("Calling this from your main thread can lead to deadlock");
            synchronized (c4829b) {
                try {
                    if (!c4829b.f39691c) {
                        synchronized (c4829b.f39692d) {
                            C4831d c4831d = c4829b.f39693e;
                            if (c4831d == null || !c4831d.f39701w) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            c4829b.d(false);
                            if (!c4829b.f39691c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e6) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e6);
                        }
                    }
                    w.h(c4829b.f39689a);
                    w.h(c4829b.f39690b);
                    try {
                        X2.b bVar = (X2.b) c4829b.f39690b;
                        bVar.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel i02 = bVar.i0(obtain, 6);
                        int i = X2.a.f3827a;
                        z8 = i02.readInt() != 0;
                        i02.recycle();
                    } catch (RemoteException e9) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c4829b.g();
            return z8;
        } finally {
            c4829b.c();
        }
    }

    public static void e(C4828a c4828a, long j9, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (c4828a != null) {
                hashMap.put("limit_ad_tracking", true != c4828a.f39688b ? "0" : "1");
                String str = c4828a.f39687a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j9));
            new C4830c(0, hashMap).start();
        }
    }

    public final void c() {
        w.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f39694f == null || this.f39689a == null) {
                    return;
                }
                try {
                    if (this.f39691c) {
                        R2.b.a().b(this.f39694f, this.f39689a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f39691c = false;
                this.f39690b = null;
                this.f39689a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z8) {
        w.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f39691c) {
                    c();
                }
                Context context = this.f39694f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int c4 = f.f1726b.c(context, 12451000);
                    if (c4 != 0 && c4 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    L2.a aVar = new L2.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!R2.b.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f39689a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder a9 = aVar.a();
                            int i = X2.c.f3829n;
                            IInterface queryLocalInterface = a9.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f39690b = queryLocalInterface instanceof X2.d ? (X2.d) queryLocalInterface : new X2.b(a9);
                            this.f39691c = true;
                            if (z8) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C4828a f() {
        C4828a c4828a;
        w.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f39691c) {
                    synchronized (this.f39692d) {
                        C4831d c4831d = this.f39693e;
                        if (c4831d == null || !c4831d.f39701w) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f39691c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e6) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e6);
                    }
                }
                w.h(this.f39689a);
                w.h(this.f39690b);
                try {
                    X2.b bVar = (X2.b) this.f39690b;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel i02 = bVar.i0(obtain, 1);
                    String readString = i02.readString();
                    i02.recycle();
                    X2.b bVar2 = (X2.b) this.f39690b;
                    bVar2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = X2.a.f3827a;
                    obtain2.writeInt(1);
                    Parcel i03 = bVar2.i0(obtain2, 2);
                    boolean z8 = i03.readInt() != 0;
                    i03.recycle();
                    c4828a = new C4828a(readString, z8);
                } catch (RemoteException e9) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c4828a;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f39692d) {
            C4831d c4831d = this.f39693e;
            if (c4831d != null) {
                c4831d.f39700v.countDown();
                try {
                    this.f39693e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j9 = this.f39695g;
            if (j9 > 0) {
                this.f39693e = new C4831d(this, j9);
            }
        }
    }
}
