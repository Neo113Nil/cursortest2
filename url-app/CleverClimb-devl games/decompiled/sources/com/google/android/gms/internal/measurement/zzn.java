package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzn implements IInterface {
    private final IBinder zzqd;
    private final String zzqe;

    protected zzn(IBinder iBinder, String str) {
        this.zzqd = iBinder;
        this.zzqe = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zzqd;
    }

    protected final Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzqe);
        return obtain;
    }

    protected final Parcel transactAndReadException(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zzqd.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void transactAndReadExceptionReturnVoid(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zzqd.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final void transactOneway(int i, Parcel parcel) throws RemoteException {
        try {
            this.zzqd.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
