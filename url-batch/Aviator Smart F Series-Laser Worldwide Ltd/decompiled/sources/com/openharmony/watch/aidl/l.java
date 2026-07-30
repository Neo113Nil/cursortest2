package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public interface l extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.Receiver";

    public static abstract class a extends Binder implements l {
        static final int TRANSACTION_onReceiveMessage = 1;

        /* renamed from: com.openharmony.watch.aidl.l$a$a, reason: collision with other inner class name */
        private static class C0324a implements l {
            private IBinder mRemote;

            C0324a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return l.DESCRIPTOR;
            }

            @Override // com.openharmony.watch.aidl.l
            public void onReceiveMessage(Message message) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l.DESCRIPTOR);
                    b.writeTypedObject(obtain, message, 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        message.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, l.DESCRIPTOR);
        }

        public static l asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(l.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new C0324a(iBinder) : (l) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.openharmony.watch.aidl.l
        public abstract /* synthetic */ void onReceiveMessage(Message message);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(l.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(l.DESCRIPTOR);
                return true;
            }
            if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            Message message = (Message) b.readTypedObject(parcel, Message.CREATOR);
            onReceiveMessage(message);
            parcel2.writeNoException();
            b.writeTypedObject(parcel2, message, 1);
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

    void onReceiveMessage(Message message);
}
