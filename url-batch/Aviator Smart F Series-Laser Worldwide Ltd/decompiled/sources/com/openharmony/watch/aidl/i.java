package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.openharmony.watch.aidl.h;

/* loaded from: classes4.dex */
public interface i extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.NotifyClient";

    public static abstract class a extends Binder implements i {
        static final int TRANSACTION_notify = 1;

        /* renamed from: com.openharmony.watch.aidl.i$a$a, reason: collision with other inner class name */
        private static class C0321a implements i {
            private IBinder mRemote;

            C0321a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return i.DESCRIPTOR;
            }

            @Override // com.openharmony.watch.aidl.i
            public void notify(Device device, Notification notification, h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(i.DESCRIPTOR);
                    b.writeTypedObject(obtain, device, 0);
                    b.writeTypedObject(obtain, notification, 0);
                    obtain.writeStrongInterface(hVar);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, i.DESCRIPTOR);
        }

        public static i asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(i.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new C0321a(iBinder) : (i) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.openharmony.watch.aidl.i
        public abstract /* synthetic */ void notify(Device device, Notification notification, h hVar);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(i.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(i.DESCRIPTOR);
                return true;
            }
            if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            notify((Device) b.readTypedObject(parcel, Device.CREATOR), (Notification) b.readTypedObject(parcel, Notification.CREATOR), h.a.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
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

    void notify(Device device, Notification notification, h hVar);
}
