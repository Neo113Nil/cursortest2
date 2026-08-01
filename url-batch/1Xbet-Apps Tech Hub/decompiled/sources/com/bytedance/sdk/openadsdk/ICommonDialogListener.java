package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface ICommonDialogListener extends IInterface {

    public static class Default implements ICommonDialogListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnNo() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnYes() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogCancel() throws RemoteException {
        }
    }

    void onDialogBtnNo() throws RemoteException;

    void onDialogBtnYes() throws RemoteException;

    void onDialogCancel() throws RemoteException;

    public static abstract class Stub extends Binder implements ICommonDialogListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonDialogListener");
        }

        public static ICommonDialogListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICommonDialogListener)) {
                return (ICommonDialogListener) queryLocalInterface;
            }
            return new pvs(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnYes();
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnNo();
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            onDialogCancel();
            parcel2.writeNoException();
            return true;
        }

        private static class pvs implements ICommonDialogListener {
            public static ICommonDialogListener pvs;
            private IBinder icD;

            pvs(IBinder iBinder) {
                this.icD = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.icD;
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnYes() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.icD.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDialogBtnYes();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnNo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.icD.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDialogBtnNo();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogCancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.icD.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDialogCancel();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ICommonDialogListener iCommonDialogListener) {
            if (pvs.pvs != null || iCommonDialogListener == null) {
                return false;
            }
            pvs.pvs = iCommonDialogListener;
            return true;
        }

        public static ICommonDialogListener getDefaultImpl() {
            return pvs.pvs;
        }
    }
}
