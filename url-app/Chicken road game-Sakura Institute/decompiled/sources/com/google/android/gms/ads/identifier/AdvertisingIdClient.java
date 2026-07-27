package com.google.android.gms.ads.identifier;

import E1.a;
import E1.f;
import E1.g;
import H1.o;
import O1.b;
import O1.c;
import O1.d;
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
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class AdvertisingIdClient {
    a zza;
    d zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzg;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z4) {
            this.zza = str;
            this.zzb = z4;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z4 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z4);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean z4;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            o.c("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            zzb zzbVar = advertisingIdClient.zze;
                            if (zzbVar == null || !zzbVar.zzb) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e4) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e4);
                        }
                    }
                    o.d(advertisingIdClient.zza);
                    o.d(advertisingIdClient.zzb);
                    try {
                        b bVar = (b) advertisingIdClient.zzb;
                        bVar.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel a4 = bVar.a(obtain, 6);
                        int i2 = O1.a.f3631a;
                        z4 = a4.readInt() != 0;
                        a4.recycle();
                    } catch (RemoteException e5) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            return z4;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z4) {
    }

    private final Info zzd(int i2) {
        Info info;
        o.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        zzb zzbVar = this.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e4) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e4);
                    }
                }
                o.d(this.zza);
                o.d(this.zzb);
                try {
                    b bVar = (b) this.zzb;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel a4 = bVar.a(obtain, 1);
                    String readString = a4.readString();
                    a4.recycle();
                    b bVar2 = (b) this.zzb;
                    bVar2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i4 = O1.a.f3631a;
                    obtain2.writeInt(1);
                    Parcel a5 = bVar2.a(obtain2, 2);
                    boolean z4 = a5.readInt() != 0;
                    a5.recycle();
                    info = new Info(readString, z4);
                } catch (RemoteException e5) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j4 = this.zzf;
            if (j4 > 0) {
                this.zze = new zzb(this, j4);
            }
        }
    }

    public final void finalize() {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return zzd(-1);
    }

    public void start() {
        zzb(true);
    }

    public final void zza() {
        o.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        K1.a.a().b(this.zzg, this.zza);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(boolean z4) {
        o.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b4 = f.f2290b.b(context, 12451000);
                    if (b4 != 0 && b4 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    a aVar = new a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!K1.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = aVar;
                        try {
                            IBinder a4 = aVar.a(TimeUnit.MILLISECONDS);
                            int i2 = c.f3633a;
                            IInterface queryLocalInterface = a4.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.zzb = queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(a4);
                            this.zzc = true;
                            if (z4) {
                                zze();
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

    public final boolean zzc(Info info, boolean z4, float f4, long j4, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (info != null) {
            hashMap.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j4));
        new zza(this, hashMap).start();
        return true;
    }

    public AdvertisingIdClient(Context context, long j4, boolean z4, boolean z5) {
        Context applicationContext;
        this.zzd = new Object();
        o.d(context);
        if (z4 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j4;
    }
}
