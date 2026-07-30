package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class w93 implements IInterface {
    public final /* synthetic */ int g;
    public final IBinder h;
    public final String i;

    public /* synthetic */ w93(IBinder iBinder, String str, int i) {
        this.g = i;
        this.h = iBinder;
        this.i = str;
    }

    public void H(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.h.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void I(Parcel parcel) {
        try {
            this.h.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.g) {
        }
        return this.h;
    }

    public Parcel b(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.h.transact(i, parcel, obtain, 0);
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

    public Parcel c(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.h.transact(i, parcel, obtain, 0);
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

    public Parcel d() {
        int i = this.g;
        String str = this.i;
        switch (i) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
        }
    }
}
