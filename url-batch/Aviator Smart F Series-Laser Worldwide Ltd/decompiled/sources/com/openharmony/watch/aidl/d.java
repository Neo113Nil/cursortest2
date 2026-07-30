package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public interface d extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.DeviceCallback";

    public static abstract class a extends Binder implements d {
        static final int TRANSACTION_onGetResult = 1;

        /* renamed from: com.openharmony.watch.aidl.d$a$a, reason: collision with other inner class name */
        private static class C0316a implements d {
            private IBinder mRemote;

            C0316a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return d.DESCRIPTOR;
            }

            @Override // com.openharmony.watch.aidl.d
            public void onGetResult(List<Device> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(d.DESCRIPTOR);
                    b.writeTypedList(obtain, list, 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.readTypedList(list, Device.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, d.DESCRIPTOR);
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(d.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new C0316a(iBinder) : (d) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.openharmony.watch.aidl.d
        public abstract /* synthetic */ void onGetResult(List list);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(d.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(d.DESCRIPTOR);
                return true;
            }
            if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Device.CREATOR);
            onGetResult(createTypedArrayList);
            parcel2.writeNoException();
            b.writeTypedList(parcel2, createTypedArrayList, 1);
            return true;
        }
    }

    public static class b {
        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i8) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i9 = 0; i9 < size; i9++) {
                writeTypedObject(parcel, list.get(i9), i8);
            }
        }

        private static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t7, int i8) {
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t7.writeToParcel(parcel, i8);
            }
        }
    }

    void onGetResult(List<Device> list);
}
