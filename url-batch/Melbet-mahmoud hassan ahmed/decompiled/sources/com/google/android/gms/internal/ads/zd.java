package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class zd implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f15077f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15078g;

    protected zd(IBinder iBinder, String str) {
        this.f15077f = iBinder;
        this.f15078g = str;
    }

    protected final void B3(int i7, Parcel parcel) {
        try {
            this.f15077f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15078g);
        return obtain;
    }

    protected final void O0(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15077f.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15077f;
    }

    protected final Parcel q0(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15077f.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }
}
