package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* loaded from: classes14.dex */
public interface IListenableWorkerImpl extends IInterface {

    public static class Default implements IListenableWorkerImpl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    void interrupt(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void startWork(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    public static abstract class Stub extends Binder implements IListenableWorkerImpl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.work.multiprocess.IListenableWorkerImpl");
                return true;
            }
            if (i == 1) {
                startWork(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 2) {
                interrupt(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        private static class Proxy implements IListenableWorkerImpl {
            private IBinder mRemote;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }
        }
    }
}
