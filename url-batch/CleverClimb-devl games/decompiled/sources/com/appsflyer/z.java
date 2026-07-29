package com.appsflyer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
final class z {

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3519a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3520b;

        a(String str, boolean z) {
            this.f3519a = str;
            this.f3520b = z;
        }

        public final String a() {
            return this.f3519a;
        }

        final boolean b() {
            return this.f3520b;
        }
    }

    static a a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            byte b2 = 0;
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            c cVar = new c(b2);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        b bVar = new b(cVar.a());
                        return new a(bVar.a(), bVar.b());
                    }
                    if (context != null) {
                        context.unbindService(cVar);
                    }
                    throw new IOException("Google Play connection failed");
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                if (context != null) {
                    context.unbindService(cVar);
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static final class c implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3522a;

        /* renamed from: b, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f3523b;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private c() {
            this.f3522a = false;
            this.f3523b = new LinkedBlockingQueue<>(1);
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f3523b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final IBinder a() throws InterruptedException {
            if (this.f3522a) {
                throw new IllegalStateException();
            }
            this.f3522a = true;
            return this.f3523b.take();
        }
    }

    static final class b implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        private IBinder f3521a;

        b(IBinder iBinder) {
            this.f3521a = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f3521a;
        }

        public final String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f3521a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        final boolean b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f3521a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
