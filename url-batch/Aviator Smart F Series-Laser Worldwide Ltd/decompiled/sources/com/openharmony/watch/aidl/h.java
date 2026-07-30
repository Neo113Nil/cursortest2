package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public interface h extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.NotifyCallback";

    public static abstract class a extends Binder implements h {
        static final int TRANSACTION_onError = 1;
        static final int TRANSACTION_onResult = 2;

        /* renamed from: com.openharmony.watch.aidl.h$a$a, reason: collision with other inner class name */
        private static class C0320a implements h {
            private IBinder mRemote;

            C0320a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return h.DESCRIPTOR;
            }

            @Override // com.openharmony.watch.aidl.h
            public void onError(Notification notification, int i8, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(h.DESCRIPTOR);
                    b.writeTypedObject(obtain, notification, 0);
                    obtain.writeInt(i8);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.openharmony.watch.aidl.h
            public void onResult(Notification notification, int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(h.DESCRIPTOR);
                    b.writeTypedObject(obtain, notification, 0);
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
            attachInterface(this, h.DESCRIPTOR);
        }

        public static h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(h.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof h)) ? new C0320a(iBinder) : (h) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.openharmony.watch.aidl.h
        public abstract /* synthetic */ void onError(Notification notification, int i8, String str);

        @Override // com.openharmony.watch.aidl.h
        public abstract /* synthetic */ void onResult(Notification notification, int i8);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(h.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(h.DESCRIPTOR);
                return true;
            }
            if (i8 == 1) {
                onError((Notification) b.readTypedObject(parcel, Notification.CREATOR), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i8 != 2) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                }
                onResult((Notification) b.readTypedObject(parcel, Notification.CREATOR), parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t7, int i8) {
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t7.writeToParcel(parcel, i8);
            }
        }
    }

    void onError(Notification notification, int i8, String str);

    void onResult(Notification notification, int i8);
}
