package com.aiming.mdt.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.aiming.mdt.a.C0076;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.aiming.mdt.utils.ʻʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0272 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f808;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private String f809;

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f810;

    /* renamed from: ʽ, reason: contains not printable characters */
    private String f811;

    /* renamed from: com.aiming.mdt.utils.ʻʼ$ʻ, reason: contains not printable characters */
    static final class ServiceConnectionC0273 implements ServiceConnection {

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean f812;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private final LinkedBlockingQueue<IBinder> f813;

        private ServiceConnectionC0273() {
            this.f812 = false;
            this.f813 = new LinkedBlockingQueue<>(1);
        }

        /* synthetic */ ServiceConnectionC0273(byte b2) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f813.put(iBinder);
            } catch (Throwable th) {
                C0282.m972("AdvertisingIdClient", th);
                C0076.m232().m236(th);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        final IBinder m936() {
            if (this.f812) {
                throw new IllegalStateException();
            }
            this.f812 = true;
            return this.f813.take();
        }
    }

    /* renamed from: com.aiming.mdt.utils.ʻʼ$ʻʼ, reason: contains not printable characters */
    public static final class C0274 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final String f814;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private final boolean f815;

        C0274(String str, boolean z) {
            this.f814 = str;
            this.f815 = z;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final String m937() {
            return this.f814;
        }
    }

    /* renamed from: com.aiming.mdt.utils.ʻʼ$ʼ, reason: contains not printable characters */
    static final class C0275 implements IInterface {

        /* renamed from: ʻ, reason: contains not printable characters */
        private IBinder f816;

        C0275(IBinder iBinder) {
            this.f816 = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f816;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        final boolean m938(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f816.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final String m939() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f816.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Looper] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.ServiceConnection] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* renamed from: ʻ, reason: contains not printable characters */
    public static C0274 m927(Context context) {
        ServiceConnectionC0273 serviceConnectionC0273;
        ?? myLooper = Looper.myLooper();
        try {
            if (myLooper == Looper.getMainLooper()) {
                C0282.m971("getAdvertisingIdInfo Cannot be called from the main thread");
                return null;
            }
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                serviceConnectionC0273 = new ServiceConnectionC0273((byte) 0);
                try {
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (!context.bindService(intent, serviceConnectionC0273, 1)) {
                        context.unbindService(serviceConnectionC0273);
                        return null;
                    }
                    C0275 c0275 = new C0275(serviceConnectionC0273.m936());
                    C0274 c0274 = new C0274(c0275.m939(), c0275.m938(true));
                    context.unbindService(serviceConnectionC0273);
                    return c0274;
                } catch (Exception e) {
                    e = e;
                    if (!(e instanceof PackageManager.NameNotFoundException)) {
                        throw e;
                    }
                    if (serviceConnectionC0273 != null) {
                        context.unbindService(serviceConnectionC0273);
                    }
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                serviceConnectionC0273 = null;
            } catch (Throwable th) {
                th = th;
                myLooper = 0;
                if (myLooper != 0) {
                    context.unbindService(myLooper);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public String m928() {
        return this.f809;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m929(String str) {
        this.f810 = str;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public int m930() {
        return this.f808;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public void m931(String str) {
        this.f809 = str;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public String m932() {
        return this.f810;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public void m933(String str) {
        this.f811 = str;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public String m934() {
        return this.f811;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m935(int i) {
        this.f808 = i;
    }
}
