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

@Deprecated
/* loaded from: classes.dex */
public final class AFb1vSDK {

    public static final class AFa1uSDK implements IInterface {
        private final IBinder AFAdRevenueData;

        public AFa1uSDK(IBinder iBinder) {
            this.AFAdRevenueData = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFAdRevenueData;
        }

        public final boolean getCurrencyIso4217Code() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.AFAdRevenueData.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final String getRevenue() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFAdRevenueData.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static final class AFa1vSDK {
        private final boolean AFAdRevenueData;
        public final String getCurrencyIso4217Code;

        public AFa1vSDK(String str, boolean z7) {
            this.getCurrencyIso4217Code = str;
            this.AFAdRevenueData = z7;
        }

        public final boolean AFAdRevenueData() {
            return this.AFAdRevenueData;
        }
    }

    public static final class AFa1ySDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getRevenue = new LinkedBlockingQueue<>(1);
        boolean AFAdRevenueData = false;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getRevenue.put(iBinder);
            } catch (InterruptedException e7) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e7);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static AFa1vSDK getMediationNetwork(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1ySDK aFa1ySDK = new AFa1ySDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1ySDK, 1)) {
                context.unbindService(aFa1ySDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1ySDK.AFAdRevenueData) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1ySDK.AFAdRevenueData = true;
            IBinder poll = aFa1ySDK.getRevenue.poll(10L, TimeUnit.SECONDS);
            if (poll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1uSDK aFa1uSDK = new AFa1uSDK(poll);
            return new AFa1vSDK(aFa1uSDK.getRevenue(), aFa1uSDK.getCurrencyIso4217Code());
        } finally {
            context.unbindService(aFa1ySDK);
        }
    }
}
