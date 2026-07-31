package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.aidl.Codecs;

/* loaded from: classes.dex */
public interface IGetInstallReferrerService extends IInterface {
    Bundle getInstallReferrer(Bundle paramaters) throws RemoteException;

    public static abstract class Stub extends BaseStub implements IGetInstallReferrerService {
        private static final String DESCRIPTOR = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
        static final int TRANSACTION_getInstallReferrer = 1;

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IGetInstallReferrerService asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                return (IGetInstallReferrerService) queryLocalInterface;
            }
            return new Proxy(obj);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code != 1) {
                return false;
            }
            Bundle installReferrer = getInstallReferrer((Bundle) Codecs.createParcelable(data, Bundle.CREATOR));
            reply.writeNoException();
            Codecs.writeParcelableAsReturnValue(reply, installReferrer);
            return true;
        }

        public static class Proxy extends BaseProxy implements IGetInstallReferrerService {
            Proxy(IBinder remote) {
                super(remote, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public Bundle getInstallReferrer(Bundle paramaters) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                Codecs.writeParcelable(obtainAndWriteInterfaceToken, paramaters);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) Codecs.createParcelable(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }
        }
    }
}
