package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: d, reason: collision with root package name */
    public IBinder f794d;

    public final boolean C(p.a aVar, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeStrongBinder(aVar);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeTypedList(null);
            if (!this.f794d.transact(4, obtain, obtain2, 0)) {
                int i3 = b.f795d;
            }
            obtain2.readException();
            boolean z10 = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z10;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final boolean D(p.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeStrongBinder(aVar);
            if (!this.f794d.transact(3, obtain, obtain2, 0)) {
                int i3 = b.f795d;
            }
            obtain2.readException();
            boolean z10 = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z10;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final boolean E() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeLong(0L);
            if (!this.f794d.transact(2, obtain, obtain2, 0)) {
                int i3 = b.f795d;
            }
            obtain2.readException();
            boolean z10 = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z10;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f794d;
    }
}
