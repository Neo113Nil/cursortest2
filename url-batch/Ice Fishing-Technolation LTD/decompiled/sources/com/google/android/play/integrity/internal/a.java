package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes2.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f62a;
    private final String b;

    protected a(IBinder iBinder, String str) {
        this.f62a = iBinder;
        this.b = str;
    }

    protected final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f62a;
    }

    protected final void b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f62a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
