package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.k0;
import java.util.List;
import l.BinderC0193a;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f1730c;

    public final boolean a(BinderC0193a binderC0193a, Uri uri, Bundle bundle, List list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f1732b);
            obtain.writeStrongInterface(binderC0193a);
            k0.L(obtain, uri);
            k0.L(obtain, bundle);
            if (list == null) {
                obtain.writeInt(-1);
            } else {
                int size = list.size();
                obtain.writeInt(size);
                for (int i2 = 0; i2 < size; i2++) {
                    k0.L(obtain, (Parcelable) list.get(i2));
                }
            }
            this.f1730c.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1730c;
    }

    public final boolean b(BinderC0193a binderC0193a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f1732b);
            obtain.writeStrongInterface(binderC0193a);
            this.f1730c.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f1732b);
            obtain.writeLong(0L);
            this.f1730c.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
