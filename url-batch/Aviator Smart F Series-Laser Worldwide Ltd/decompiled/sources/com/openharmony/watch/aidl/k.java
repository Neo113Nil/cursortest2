package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public interface k extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.PingCallback";

    public static abstract class a extends Binder implements k {
        static final int TRANSACTION_onPingResult = 1;

        /* renamed from: com.openharmony.watch.aidl.k$a$a, reason: collision with other inner class name */
        private static class C0323a implements k {
            private IBinder mRemote;

            C0323a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return k.DESCRIPTOR;
            }

            @Override // com.openharmony.watch.aidl.k
            public void onPingResult(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, k.DESCRIPTOR);
        }

        public static k asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(k.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new C0323a(iBinder) : (k) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.openharmony.watch.aidl.k
        public abstract /* synthetic */ void onPingResult(int i8);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(k.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(k.DESCRIPTOR);
                return true;
            }
            if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            onPingResult(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onPingResult(int i8);
}
