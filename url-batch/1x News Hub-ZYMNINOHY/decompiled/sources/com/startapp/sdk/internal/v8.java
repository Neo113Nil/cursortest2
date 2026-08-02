package com.startapp.sdk.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class v8 implements x8 {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f4605a;

    public v8(IBinder iBinder) {
        this.f4605a = iBinder;
    }

    public final Bundle a(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            this.f4605a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle2 = (Bundle) (obtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(obtain2) : null);
            obtain2.recycle();
            obtain.recycle();
            return bundle2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4605a;
    }
}
