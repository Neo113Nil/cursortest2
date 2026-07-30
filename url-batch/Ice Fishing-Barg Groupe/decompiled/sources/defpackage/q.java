package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q {
    public static volatile q OPXfSBeufaJ8;
    public static final Object rtx2ld2ELZv4 = new Object();
    public yd PxuCJdSBwIXG;
    public final Context a92UlCVFR9N8;
    public zw2 e9gEMXR7LXtO;
    public ix2 lS5Rgt96tfkO;
    public final Object Y1f8riQaR6yg = new Object();
    public boolean TSizfFm2Yiuu = false;
    public final long RAsUl2FVSrh6 = 30000;

    public q(Context context) {
        this.a92UlCVFR9N8 = context.getApplicationContext();
    }

    public static void Y1f8riQaR6yg(p pVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (pVar != null) {
                hashMap.put("limit_ad_tracking", true != pVar.lS5Rgt96tfkO ? "0" : "1");
                String str = pVar.TSizfFm2Yiuu;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new vw2(hashMap).start();
        }
    }

    public final void PxuCJdSBwIXG() {
        jh0.dgRBjINgWbAK("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.a92UlCVFR9N8 == null || this.PxuCJdSBwIXG == null) {
                    return;
                }
                try {
                    if (this.TSizfFm2Yiuu) {
                        dr.PxuCJdSBwIXG().lS5Rgt96tfkO(this.a92UlCVFR9N8, this.PxuCJdSBwIXG);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.TSizfFm2Yiuu = false;
                this.lS5Rgt96tfkO = null;
                this.PxuCJdSBwIXG = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void TSizfFm2Yiuu() {
        try {
            if (!this.TSizfFm2Yiuu) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    lS5Rgt96tfkO();
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.TSizfFm2Yiuu) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } finally {
        }
    }

    public final p e9gEMXR7LXtO() {
        p pVar;
        jh0.dgRBjINgWbAK("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            TSizfFm2Yiuu();
            jh0.x50lh2ztY7Y5(this.PxuCJdSBwIXG);
            jh0.x50lh2ztY7Y5(this.lS5Rgt96tfkO);
            try {
                dx2 dx2Var = (dx2) this.lS5Rgt96tfkO;
                dx2Var.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                Parcel PxuCJdSBwIXG = dx2Var.PxuCJdSBwIXG(obtain, 1);
                String readString = PxuCJdSBwIXG.readString();
                PxuCJdSBwIXG.recycle();
                dx2 dx2Var2 = (dx2) this.lS5Rgt96tfkO;
                dx2Var2.getClass();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i = ax2.PxuCJdSBwIXG;
                obtain2.writeInt(1);
                Parcel PxuCJdSBwIXG2 = dx2Var2.PxuCJdSBwIXG(obtain2, 2);
                if (PxuCJdSBwIXG2.readInt() == 0) {
                    z = false;
                }
                PxuCJdSBwIXG2.recycle();
                pVar = new p(0, readString, z);
            } catch (RemoteException e) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                throw new IOException("Remote exception", e);
            }
        }
        synchronized (this.Y1f8riQaR6yg) {
            zw2 zw2Var = this.e9gEMXR7LXtO;
            if (zw2Var != null) {
                zw2Var.wdg6QnbFHrFF.countDown();
                try {
                    this.e9gEMXR7LXtO.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.RAsUl2FVSrh6;
            if (j > 0) {
                this.e9gEMXR7LXtO = new zw2(this, j);
            }
        }
        return pVar;
    }

    public final void finalize() {
        PxuCJdSBwIXG();
        super.finalize();
    }

    public final void lS5Rgt96tfkO() {
        jh0.dgRBjINgWbAK("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.TSizfFm2Yiuu) {
                    return;
                }
                Context context = this.a92UlCVFR9N8;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int lS5Rgt96tfkO = ch0.lS5Rgt96tfkO.lS5Rgt96tfkO(context, 12451000);
                    if (lS5Rgt96tfkO != 0 && lS5Rgt96tfkO != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    yd ydVar = new yd();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!dr.PxuCJdSBwIXG().TSizfFm2Yiuu(context, context.getClass().getName(), intent, ydVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.PxuCJdSBwIXG = ydVar;
                        try {
                            IBinder PxuCJdSBwIXG = ydVar.PxuCJdSBwIXG();
                            int i = fx2.TSizfFm2Yiuu;
                            IInterface queryLocalInterface = PxuCJdSBwIXG.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.lS5Rgt96tfkO = queryLocalInterface instanceof ix2 ? (ix2) queryLocalInterface : new dx2(PxuCJdSBwIXG);
                            this.TSizfFm2Yiuu = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new gh0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
