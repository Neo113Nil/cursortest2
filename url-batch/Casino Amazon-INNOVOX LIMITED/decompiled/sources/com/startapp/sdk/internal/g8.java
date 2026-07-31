package com.startapp.sdk.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class g8 implements i8 {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f249a;

    public g8(IBinder iBinder) {
        this.f249a = iBinder;
    }

    public final Bundle a(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            this.f249a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return (Bundle) (obtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f249a;
    }
}
