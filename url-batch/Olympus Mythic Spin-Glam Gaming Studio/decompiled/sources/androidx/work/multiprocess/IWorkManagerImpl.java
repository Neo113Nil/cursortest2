package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* loaded from: classes11.dex */
public interface IWorkManagerImpl extends IInterface {

    public static class Default implements IWorkManagerImpl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback);

    void cancelAllWorkByTag(String str, IWorkManagerImplCallback iWorkManagerImplCallback);

    void cancelUniqueWork(String str, IWorkManagerImplCallback iWorkManagerImplCallback);

    void cancelWorkById(String str, IWorkManagerImplCallback iWorkManagerImplCallback);

    void enqueueContinuation(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void enqueueWorkRequests(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void queryWorkInfo(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void setForegroundAsync(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void setProgress(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void updateUniquePeriodicWorkRequest(String str, byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    public static abstract class Stub extends Binder implements IWorkManagerImpl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch (i) {
                case 1:
                    enqueueWorkRequests(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    updateUniquePeriodicWorkRequest(parcel.readString(), parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    enqueueContinuation(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    cancelWorkById(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    cancelAllWorkByTag(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    cancelUniqueWork(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    cancelAllWork(IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    queryWorkInfo(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 9:
                    setProgress(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 10:
                    setForegroundAsync(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements IWorkManagerImpl {
            private IBinder mRemote;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }
        }
    }
}
