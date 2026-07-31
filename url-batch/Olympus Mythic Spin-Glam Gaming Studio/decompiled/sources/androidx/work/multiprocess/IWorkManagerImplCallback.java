package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes9.dex */
public interface IWorkManagerImplCallback extends IInterface {

    public static class Default implements IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    void onFailure(String str);

    void onSuccess(byte[] bArr);

    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IWorkManagerImplCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IWorkManagerImplCallback)) {
                return (IWorkManagerImplCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImplCallback");
                return true;
            }
            if (i == 1) {
                onSuccess(parcel.createByteArray());
            } else if (i == 2) {
                onFailure(parcel.readString());
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        private static class Proxy implements IWorkManagerImplCallback {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }
        }
    }
}
