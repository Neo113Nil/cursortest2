package b;

import a.AbstractC0219a;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import n.BinderC0533a;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259b implements InterfaceC0261d {

    /* renamed from: d, reason: collision with root package name */
    public IBinder f3600d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3600d;
    }

    public final boolean b(BinderC0533a binderC0533a, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0261d.f3602b);
            obtain.writeStrongInterface(binderC0533a);
            AbstractC0219a.M(obtain, uri);
            AbstractC0219a.M(obtain, bundle);
            obtain.writeInt(-1);
            this.f3600d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean c(BinderC0533a binderC0533a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0261d.f3602b);
            obtain.writeStrongInterface(binderC0533a);
            this.f3600d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0261d.f3602b);
            obtain.writeLong(0L);
            this.f3600d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
