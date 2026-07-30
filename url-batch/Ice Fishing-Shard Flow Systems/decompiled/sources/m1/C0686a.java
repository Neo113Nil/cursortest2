package m1;

import B1.c;
import B1.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.y;
import h0.C0464j;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import q1.ServiceConnectionC0832a;
import q1.f;
import t1.u;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0686a {

    /* renamed from: a, reason: collision with root package name */
    public ServiceConnectionC0832a f6519a;

    /* renamed from: b, reason: collision with root package name */
    public d f6520b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6521c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6522d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public b f6523e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f6524f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6525g;

    public C0686a(Context context) {
        u.f(context);
        Context applicationContext = context.getApplicationContext();
        this.f6524f = applicationContext != null ? applicationContext : context;
        this.f6521c = false;
        this.f6525g = -1L;
    }

    public static C0464j a(Context context) {
        C0686a c0686a = new C0686a(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c0686a.c();
            C0464j e7 = c0686a.e();
            d(e7, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e7;
        } finally {
        }
    }

    public static void d(C0464j c0464j, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (c0464j != null) {
                hashMap.put("limit_ad_tracking", true != c0464j.f5109c ? "0" : "1");
                String str = c0464j.f5108b;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new U5.a(1, hashMap).start();
        }
    }

    public final void b() {
        u.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f6524f == null || this.f6519a == null) {
                    return;
                }
                try {
                    if (this.f6521c) {
                        w1.a.a().b(this.f6524f, this.f6519a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f6521c = false;
                this.f6520b = null;
                this.f6519a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        u.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f6521c) {
                    b();
                }
                Context context = this.f6524f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b7 = f.f7326b.b(context, 12451000);
                    if (b7 != 0 && b7 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC0832a serviceConnectionC0832a = new ServiceConnectionC0832a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!w1.a.a().c(context, context.getClass().getName(), intent, serviceConnectionC0832a, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f6519a = serviceConnectionC0832a;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder a7 = serviceConnectionC0832a.a();
                            int i2 = c.f173e;
                            IInterface queryLocalInterface = a7.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f6520b = queryLocalInterface instanceof d ? (d) queryLocalInterface : new B1.b(a7);
                            this.f6521c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C0464j e() {
        C0464j c0464j;
        u.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f6521c) {
                    synchronized (this.f6522d) {
                        b bVar = this.f6523e;
                        if (bVar == null || !bVar.f6529l) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f6521c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e7) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                    }
                }
                u.f(this.f6519a);
                u.f(this.f6520b);
                try {
                    B1.b bVar2 = (B1.b) this.f6520b;
                    bVar2.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel b7 = bVar2.b(obtain, 1);
                    String readString = b7.readString();
                    b7.recycle();
                    B1.b bVar3 = (B1.b) this.f6520b;
                    bVar3.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i2 = B1.a.f171a;
                    obtain2.writeInt(1);
                    Parcel b8 = bVar3.b(obtain2, 2);
                    boolean z7 = b8.readInt() != 0;
                    b8.recycle();
                    c0464j = new C0464j(1, readString, z7);
                } catch (RemoteException e8) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f6522d) {
            b bVar4 = this.f6523e;
            if (bVar4 != null) {
                bVar4.f6528i.countDown();
                try {
                    this.f6523e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f6525g;
            if (j > 0) {
                this.f6523e = new b(this, j);
            }
        }
        return c0464j;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
