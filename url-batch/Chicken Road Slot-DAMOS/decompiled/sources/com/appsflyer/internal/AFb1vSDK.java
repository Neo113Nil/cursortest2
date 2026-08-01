package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Deprecated
/* loaded from: classes.dex */
public final class AFb1vSDK {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class AFa1tSDK implements IInterface {
        private final IBinder getCurrencyIso4217Code;

        public AFa1tSDK(IBinder iBinder) {
            this.getCurrencyIso4217Code = iBinder;
        }

        public final boolean AFAdRevenueData() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.getCurrencyIso4217Code.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getCurrencyIso4217Code;
        }

        public final String getRevenue() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getCurrencyIso4217Code.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class AFa1ySDK {
        public final String getCurrencyIso4217Code;
        private final boolean getMediationNetwork;

        public AFa1ySDK(String str, boolean z10) {
            this.getCurrencyIso4217Code = str;
            this.getMediationNetwork = z10;
        }

        public final boolean AFAdRevenueData() {
            return this.getMediationNetwork;
        }
    }

    public static AFa1ySDK AFAdRevenueData(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            i0.l("Cannot be called from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1zSDK aFa1zSDK = new AFa1zSDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1zSDK, 1)) {
                context.unbindService(aFa1zSDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1zSDK.AFAdRevenueData) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1zSDK.AFAdRevenueData = true;
            IBinder poll = aFa1zSDK.getRevenue.poll(10L, TimeUnit.SECONDS);
            if (poll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1tSDK aFa1tSDK = new AFa1tSDK(poll);
            return new AFa1ySDK(aFa1tSDK.getRevenue(), aFa1tSDK.AFAdRevenueData());
        } finally {
            context.unbindService(aFa1zSDK);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class AFa1zSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getRevenue = new LinkedBlockingQueue<>(1);
        boolean AFAdRevenueData = false;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getRevenue.put(iBinder);
            } catch (InterruptedException e2) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e2);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
