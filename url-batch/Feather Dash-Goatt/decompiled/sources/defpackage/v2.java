package defpackage;

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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class v2 {
    public static final Object h = new Object();
    public static volatile v2 i;
    public qd a;
    public gu1 b;
    public boolean c;
    public final Object d = new Object();
    public rt1 e;
    public final Context f;
    public final long g;

    public v2(Context context) {
        y90.i(context);
        this.f = context.getApplicationContext();
        this.c = false;
        this.g = 30000L;
    }

    public static u2 a(Context context) {
        v2 v2Var = i;
        if (v2Var == null) {
            synchronized (h) {
                try {
                    v2Var = i;
                    if (v2Var == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        v2Var = new v2(context);
                        i = v2Var;
                    }
                } finally {
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if (au1.c == null) {
            synchronized (au1.d) {
                try {
                    if (au1.c == null) {
                        au1.c = new au1(context);
                    }
                } finally {
                }
            }
        }
        au1 au1Var = au1.c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            u2 f = v2Var.f();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            e(f, elapsedRealtime2, null);
            au1Var.a(0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, System.currentTimeMillis());
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + elapsedRealtime2 + "ms");
            return f;
        } catch (Throwable th) {
            e(null, -1L, th);
            au1Var.a(!(th instanceof IOException) ? !(th instanceof h50) ? th instanceof IllegalStateException ? 8 : -1 : 9 : 1, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, System.currentTimeMillis());
            throw th;
        }
    }

    public static void e(u2 u2Var, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (u2Var != null) {
                hashMap.put("limit_ad_tracking", true != u2Var.g ? "0" : "1");
                String str = (String) u2Var.e;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new kt1(hashMap).start();
        }
    }

    public final void b() {
        y90.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        s40.s().C(this.f, this.a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        y90.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b = d50.b.b(context, 12451000);
                    if (b != 0 && b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    qd qdVar = new qd();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!s40.s().F(context, context.getClass().getName(), intent, qdVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = qdVar;
                        try {
                            IBinder a = qdVar.a();
                            int i2 = cu1.b;
                            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = queryLocalInterface instanceof gu1 ? (gu1) queryLocalInterface : new yt1(a);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new h50();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void d() {
        try {
            if (!this.c) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    c();
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } finally {
        }
    }

    public final u2 f() {
        u2 u2Var;
        y90.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            d();
            y90.i(this.a);
            y90.i(this.b);
            try {
                yt1 yt1Var = (yt1) this.b;
                yt1Var.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                Parcel a = yt1Var.a(obtain, 1);
                String readString = a.readString();
                a.recycle();
                yt1 yt1Var2 = (yt1) this.b;
                yt1Var2.getClass();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i2 = tt1.a;
                obtain2.writeInt(1);
                Parcel a2 = yt1Var2.a(obtain2, 2);
                int i3 = 0;
                if (a2.readInt() == 0) {
                    z = false;
                }
                a2.recycle();
                u2Var = new u2(readString, z, i3);
            } catch (RemoteException e) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                throw new IOException("Remote exception", e);
            }
        }
        synchronized (this.d) {
            rt1 rt1Var = this.e;
            if (rt1Var != null) {
                rt1Var.g.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new rt1(this, j);
            }
        }
        return u2Var;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
