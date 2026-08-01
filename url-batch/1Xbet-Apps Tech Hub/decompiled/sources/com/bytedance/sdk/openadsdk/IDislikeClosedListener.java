package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface IDislikeClosedListener extends IInterface {

    public static class Default implements IDislikeClosedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
        public void onItemClickClosed() throws RemoteException {
        }
    }

    void onItemClickClosed() throws RemoteException;

    public static abstract class Stub extends Binder implements IDislikeClosedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IDislikeClosedListener");
        }

        public static IDislikeClosedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDislikeClosedListener)) {
                return (IDislikeClosedListener) queryLocalInterface;
            }
            return new pvs(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            onItemClickClosed();
            parcel2.writeNoException();
            return true;
        }

        private static class pvs implements IDislikeClosedListener {
            public static IDislikeClosedListener pvs;
            private IBinder icD;

            pvs(IBinder iBinder) {
                this.icD = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.icD;
            }

            @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
            public void onItemClickClosed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    if (!this.icD.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onItemClickClosed();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IDislikeClosedListener iDislikeClosedListener) {
            if (pvs.pvs != null || iDislikeClosedListener == null) {
                return false;
            }
            pvs.pvs = iDislikeClosedListener;
            return true;
        }

        public static IDislikeClosedListener getDefaultImpl() {
            return pvs.pvs;
        }
    }
}
