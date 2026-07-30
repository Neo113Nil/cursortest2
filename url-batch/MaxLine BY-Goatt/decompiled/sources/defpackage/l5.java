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
import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class l5 {
    public so a;
    public ag3 b;
    public boolean c;
    public final Object d = new Object();
    public dd3 e;
    public final Context f;
    public final long g;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String toString() {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(this.b);
            return sb.toString();
        }
    }

    public l5(Context context) {
        ll3.v(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    public static a a(Context context) {
        l5 l5Var = new l5(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l5Var.c();
            a e = l5Var.e();
            d(e, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e;
        } finally {
        }
    }

    public static void d(a aVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
            hashMap.put("app_context", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            if (aVar != null) {
                if (true != aVar.b) {
                    str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = aVar.a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new ib3(hashMap).start();
        }
    }

    public final void b() {
        ll3.u("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        i10.b().c(this.f, this.a);
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
        ll3.u("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b = tv0.b.b(context, 12451000);
                    if (b != 0 && b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    so soVar = new so();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!i10.b().a(context, intent, soVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = soVar;
                        try {
                            IBinder a2 = soVar.a();
                            int i = mf3.g;
                            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = queryLocalInterface instanceof ag3 ? (ag3) queryLocalInterface : new qe3(a2);
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
                    throw new ne();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a e() {
        a aVar;
        ll3.u("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        dd3 dd3Var = this.e;
                        if (dd3Var == null || !dd3Var.p) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                ll3.v(this.a);
                ll3.v(this.b);
                try {
                    qe3 qe3Var = (qe3) this.b;
                    qe3Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel b = qe3Var.b(obtain, 1);
                    String readString = b.readString();
                    b.recycle();
                    qe3 qe3Var2 = (qe3) this.b;
                    qe3Var2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = vd3.a;
                    obtain2.writeInt(1);
                    Parcel b2 = qe3Var2.b(obtain2, 2);
                    if (b2.readInt() == 0) {
                        z = false;
                    }
                    b2.recycle();
                    aVar = new a(readString, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            dd3 dd3Var2 = this.e;
            if (dd3Var2 != null) {
                dd3Var2.o.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new dd3(this, j);
            }
        }
        return aVar;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
