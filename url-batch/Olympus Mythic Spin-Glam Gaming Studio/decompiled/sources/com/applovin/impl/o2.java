package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.o2;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class o2 {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements ServiceConnection {
        private final com.applovin.impl.sdk.o a;
        private final s4 b;

        public a(com.applovin.impl.sdk.o oVar, s4 s4Var) {
            this.a = oVar;
            this.b = s4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.k.o().unbindService(this);
            } catch (Exception e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.d("LicenseVerificationManager", "Failed to unbind license service", e);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (com.applovin.impl.sdk.o.a()) {
                this.a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int nextInt = new SecureRandom().nextInt();
            b bVar = new b(this.a, this.b, nextInt, new Runnable() { // from class: com.applovin.impl.o2$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    o2.a.this.a();
                }
            });
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                obtain.writeLong(nextInt);
                obtain.writeString(com.applovin.impl.sdk.k.o().getPackageName());
                obtain.writeStrongBinder(bVar);
                if (iBinder.transact(1, obtain, null, 1)) {
                } else {
                    throw new RemoteException("transact() returned false");
                }
            } catch (Exception e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.a("LicenseVerificationManager", "Failed to check license", e);
                }
                a();
                this.b.a((Object) e);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (com.applovin.impl.sdk.o.a()) {
                this.a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.b.a((Object) illegalStateException);
        }
    }

    private static final class b extends Binder {
        private final com.applovin.impl.sdk.o a;
        private final s4 b;
        private final int c;
        private final Runnable d;

        public b(com.applovin.impl.sdk.o oVar, s4 s4Var, int i, Runnable runnable) {
            this.a = oVar;
            this.b = s4Var;
            this.c = i;
            this.d = runnable;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.a("LicenseVerificationManager", "Verified with code " + readInt);
                }
                this.b.b(p2.a().b(readString).a(readString2).b(readInt).a(this.c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                this.d.run();
                return true;
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th);
                    }
                    this.b.a((Object) new Exception(th));
                    this.d.run();
                    return false;
                } catch (Throwable th2) {
                    this.d.run();
                    throw th2;
                }
            }
        }
    }

    public o2(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
    }

    public s4 a(long j) {
        s4 s4Var = new s4("verify_license");
        if (j > 0) {
            i6.a(j, s4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.a);
        }
        try {
            if (!com.applovin.impl.sdk.k.o().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.b, s4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.k("LicenseVerificationManager", exc.getMessage());
                }
                s4Var.a((Object) exc);
            }
        } catch (Exception e) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("LicenseVerificationManager", "Failed to verify license", e);
            }
            s4Var.a((Object) e);
        }
        return s4Var;
    }
}
