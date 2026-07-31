package l;

import H.k;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import b.InterfaceC0114a;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0193a extends Binder implements InterfaceC0114a {
    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str = InterfaceC0114a.f1729a;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i2) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                parcel.readInt();
                return true;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                parcel.readString();
                return true;
            case k.LONG_FIELD_NUMBER /* 4 */:
                parcel2.writeNoException();
                return true;
            case k.STRING_FIELD_NUMBER /* 5 */:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel.readInt();
                parcel.readInt();
                return true;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                parcel.readInt();
                parcel.readInt();
                return true;
            case 9:
                return true;
            case 10:
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                return true;
            case 11:
                return true;
            case 12:
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
