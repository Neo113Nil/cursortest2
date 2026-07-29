package com.youappi.sdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: com.youappi.sdk.utils.a$a, reason: collision with other inner class name */
    public static final class C0414a {

        /* renamed from: a, reason: collision with root package name */
        private final String f9520a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f9521b;

        C0414a(String str, boolean z) {
            this.f9520a = str;
            this.f9521b = z;
        }

        public String a() {
            return this.f9520a;
        }
    }

    private static final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        boolean f9522a;

        /* renamed from: b, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f9523b;

        private b() {
            this.f9522a = false;
            this.f9523b = new LinkedBlockingQueue<>(1);
        }

        public IBinder a() {
            if (this.f9522a) {
                throw new IllegalStateException();
            }
            this.f9522a = true;
            return this.f9523b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f9523b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static final class c implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        private IBinder f9524a;

        public c(IBinder iBinder) {
            this.f9524a = iBinder;
        }

        public String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f9524a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.f9524a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f9524a;
        }
    }

    public static C0414a a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (!context.bindService(intent, bVar, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                try {
                    c cVar = new c(bVar.a());
                    return new C0414a(cVar.a(), cVar.a(true));
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                context.unbindService(bVar);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
