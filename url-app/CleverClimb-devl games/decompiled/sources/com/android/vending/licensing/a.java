package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.android.vending.licensing.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0295a extends Binder implements a {

        /* renamed from: com.android.vending.licensing.a$a$a, reason: collision with other inner class name */
        private static class C0296a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f2257a;

            C0296a(IBinder iBinder) {
                this.f2257a = iBinder;
            }

            @Override // com.android.vending.licensing.a
            public void a(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f2257a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2257a;
            }
        }

        public AbstractBinderC0295a() {
            attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0296a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                a(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
            return true;
        }
    }

    void a(int i, String str, String str2);
}
