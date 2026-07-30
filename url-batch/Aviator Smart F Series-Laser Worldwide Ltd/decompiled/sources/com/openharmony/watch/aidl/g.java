package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public interface g extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.IBinderFactory";
    public static final int DEVICE_CLIENT = 0;
    public static final int NOTIFY_CLIENT = 2;
    public static final int P2P_CLIENT = 1;

    public static abstract class a extends Binder implements g {
        static final int TRANSACTION_generateBinder = 1;

        /* renamed from: com.openharmony.watch.aidl.g$a$a, reason: collision with other inner class name */
        private static class C0319a implements g {
            private IBinder mRemote;

            C0319a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.openharmony.watch.aidl.g
            public IBinder generateBinder(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(g.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return g.DESCRIPTOR;
            }
        }

        public a() {
            attachInterface(this, g.DESCRIPTOR);
        }

        public static g asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(g.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof g)) ? new C0319a(iBinder) : (g) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public abstract /* synthetic */ IBinder generateBinder(int i8);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(g.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(g.DESCRIPTOR);
                return true;
            }
            if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            IBinder generateBinder = generateBinder(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(generateBinder);
            return true;
        }
    }

    IBinder generateBinder(int i8);
}
