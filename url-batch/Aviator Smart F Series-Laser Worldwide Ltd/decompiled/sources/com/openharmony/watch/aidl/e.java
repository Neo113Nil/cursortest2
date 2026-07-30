package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.openharmony.watch.aidl.d;
import com.openharmony.watch.aidl.f;

/* loaded from: classes4.dex */
public interface e extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.DeviceClient";

    public static abstract class a extends Binder implements e {
        static final int TRANSACTION_getAvailableKbytes = 2;
        static final int TRANSACTION_getBondedDevices = 1;
        static final int TRANSACTION_registerDeviceConnectionCallback = 3;
        static final int TRANSACTION_unregisterDeviceConnectionCallback = 4;

        /* renamed from: com.openharmony.watch.aidl.e$a$a, reason: collision with other inner class name */
        private static class C0317a implements e {
            private IBinder mRemote;

            C0317a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.openharmony.watch.aidl.e
            public long getAvailableKbytes(Device device) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(e.DESCRIPTOR);
                    b.writeTypedObject(obtain, device, 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.openharmony.watch.aidl.e
            public void getBondedDevices(d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(e.DESCRIPTOR);
                    obtain.writeStrongInterface(dVar);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return e.DESCRIPTOR;
            }

            @Override // com.openharmony.watch.aidl.e
            public void registerDeviceConnectionCallback(f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(e.DESCRIPTOR);
                    obtain.writeStrongInterface(fVar);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.openharmony.watch.aidl.e
            public void unregisterDeviceConnectionCallback(f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(e.DESCRIPTOR);
                    obtain.writeStrongInterface(fVar);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, e.DESCRIPTOR);
        }

        public static e asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(e.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof e)) ? new C0317a(iBinder) : (e) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.openharmony.watch.aidl.e
        public abstract /* synthetic */ long getAvailableKbytes(Device device);

        @Override // com.openharmony.watch.aidl.e
        public abstract /* synthetic */ void getBondedDevices(d dVar);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(e.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(e.DESCRIPTOR);
                return true;
            }
            if (i8 == 1) {
                getBondedDevices(d.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i8 == 2) {
                long availableKbytes = getAvailableKbytes((Device) b.readTypedObject(parcel, Device.CREATOR));
                parcel2.writeNoException();
                parcel2.writeLong(availableKbytes);
            } else if (i8 == 3) {
                registerDeviceConnectionCallback(f.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i8 != 4) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                }
                unregisterDeviceConnectionCallback(f.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // com.openharmony.watch.aidl.e
        public abstract /* synthetic */ void registerDeviceConnectionCallback(f fVar);

        @Override // com.openharmony.watch.aidl.e
        public abstract /* synthetic */ void unregisterDeviceConnectionCallback(f fVar);
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

    long getAvailableKbytes(Device device);

    void getBondedDevices(d dVar);

    void registerDeviceConnectionCallback(f fVar);

    void unregisterDeviceConnectionCallback(f fVar);
}
