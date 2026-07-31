package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f13609a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13610b;

    protected a(IBinder iBinder, String str) {
        this.f13609a = iBinder;
        this.f13610b = str;
    }

    protected final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13610b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13609a;
    }

    protected final void b(int i4, Parcel parcel) {
        try {
            this.f13609a.transact(i4, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
