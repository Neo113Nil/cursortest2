package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public interface a extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.CancelFileTransferCallBack";

    /* renamed from: com.openharmony.watch.aidl.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0314a extends Binder implements a {
        static final int TRANSACTION_onCancelFileTransferResult = 1;

        /* renamed from: com.openharmony.watch.aidl.a$a$a, reason: collision with other inner class name */
        private static class C0315a implements a {
            private IBinder mRemote;

            C0315a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return a.DESCRIPTOR;
            }

            @Override // com.openharmony.watch.aidl.a
            public void onCancelFileTransferResult(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0314a() {
            attachInterface(this, a.DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0315a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.openharmony.watch.aidl.a
        public abstract /* synthetic */ void onCancelFileTransferResult(int i8);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(a.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(a.DESCRIPTOR);
                return true;
            }
            if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            onCancelFileTransferResult(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onCancelFileTransferResult(int i8);
}
