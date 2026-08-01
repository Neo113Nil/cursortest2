package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p5 implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2664d;

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f2665e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2666f;

    public /* synthetic */ p5(IBinder iBinder, String str, int i3) {
        this.f2664d = i3;
        this.f2665e = iBinder;
        this.f2666f = str;
    }

    public void C(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2665e.transact(i3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel D(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2665e.transact(i3, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel E(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2665e.transact(i3, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel F() {
        switch (this.f2664d) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f2666f);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f2666f);
                return obtain2;
        }
    }

    public void G(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2665e.transact(i3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void H(Parcel parcel) {
        try {
            this.f2665e.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f2664d) {
        }
        return this.f2665e;
    }
}
