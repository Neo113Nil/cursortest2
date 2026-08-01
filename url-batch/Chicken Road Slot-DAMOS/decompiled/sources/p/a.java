package p;

import a4.j;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        switch (i3) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.LONG_FIELD_NUMBER /* 4 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.STRING_FIELD_NUMBER /* 5 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return super.onTransact(i3, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
