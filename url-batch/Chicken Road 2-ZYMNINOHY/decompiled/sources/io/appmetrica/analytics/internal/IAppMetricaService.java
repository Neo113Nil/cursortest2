package io.appmetrica.analytics.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IAppMetricaService extends IInterface {
    public static final String DESCRIPTOR = "io.appmetrica.analytics.internal.IAppMetricaService";

    public static class Default implements IAppMetricaService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void pauseUserSession(Bundle bundle) throws RemoteException {
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void reportData(int i4, Bundle bundle) throws RemoteException {
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void resumeUserSession(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAppMetricaService {
        public Stub() {
            attachInterface(this, IAppMetricaService.DESCRIPTOR);
        }

        public static IAppMetricaService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppMetricaService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAppMetricaService)) ? new b(iBinder) : (IAppMetricaService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(IAppMetricaService.DESCRIPTOR);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(IAppMetricaService.DESCRIPTOR);
                return true;
            }
            if (i4 == 1) {
                resumeUserSession((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            } else if (i4 == 2) {
                pauseUserSession((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            } else {
                if (i4 != 3) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                reportData(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            }
            return true;
        }
    }

    public static class _Parcel {
    }

    void pauseUserSession(Bundle bundle) throws RemoteException;

    void reportData(int i4, Bundle bundle) throws RemoteException;

    void resumeUserSession(Bundle bundle) throws RemoteException;
}
