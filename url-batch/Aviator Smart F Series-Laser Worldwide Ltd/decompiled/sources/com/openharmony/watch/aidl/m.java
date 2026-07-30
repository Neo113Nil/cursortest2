package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public interface m extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.SendCallback";

    public static abstract class a extends Binder implements m {
        static final int TRANSACTION_onSendProgress = 1;
        static final int TRANSACTION_onSendResult = 2;

        /* renamed from: com.openharmony.watch.aidl.m$a$a, reason: collision with other inner class name */
        private static class C0325a implements m {
            private IBinder mRemote;

            C0325a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return m.DESCRIPTOR;
            }

            @Override // com.openharmony.watch.aidl.m
            public void onSendProgress(long j8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m.DESCRIPTOR);
                    obtain.writeLong(j8);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.openharmony.watch.aidl.m
            public void onSendResult(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, m.DESCRIPTOR);
        }

        public static m asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(m.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new C0325a(iBinder) : (m) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.openharmony.watch.aidl.m
        public abstract /* synthetic */ void onSendProgress(long j8);

        @Override // com.openharmony.watch.aidl.m
        public abstract /* synthetic */ void onSendResult(int i8);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(m.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(m.DESCRIPTOR);
                return true;
            }
            if (i8 == 1) {
                onSendProgress(parcel.readLong());
                parcel2.writeNoException();
            } else {
                if (i8 != 2) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                }
                onSendResult(parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onSendProgress(long j8);

    void onSendResult(int i8);
}
