package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class dae extends bms implements IInterface {
    public dae() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        if (i == 12) {
            parcel.readInt();
            bmt.b(parcel);
            return true;
        }
        if (i == 15) {
            parcel.readInt();
            parcel.readString();
            bmt.b(parcel);
            return true;
        }
        if (i == 16) {
            parcel.readInt();
            bmt.b(parcel);
            return true;
        }
        if (i == 18) {
            parcel.readInt();
            bmt.b(parcel);
            return true;
        }
        if (i == 19) {
            bmt.b(parcel);
            return true;
        }
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) bmt.a(parcel, Bundle.CREATOR);
                bmt.b(parcel);
                b(readInt, bundle);
                return true;
            case 2:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) bmt.a(parcel, Bundle.CREATOR);
                DataHolder dataHolder = (DataHolder) bmt.a(parcel, DataHolder.CREATOR);
                bmt.b(parcel);
                c(readInt2, bundle2, dataHolder);
                return true;
            case 3:
                parcel.readInt();
                bmt.b(parcel);
                throw new RuntimeException("Shouldn't be called");
            case 4:
                parcel.readInt();
                bmt.b(parcel);
                return true;
            case 5:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) bmt.a(parcel, Bundle.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bmt.a(parcel, ParcelFileDescriptor.CREATOR);
                Bundle bundle4 = (Bundle) bmt.a(parcel, Bundle.CREATOR);
                bmt.b(parcel);
                d(readInt3, bundle3, parcelFileDescriptor, bundle4);
                return true;
            case 6:
                parcel.readInt();
                bmt.b(parcel);
                return true;
            case 7:
                parcel.readInt();
                bmt.b(parcel);
                return true;
            case 8:
                parcel.readInt();
                bmt.b(parcel);
                return true;
            default:
                return false;
        }
    }

    public void b(int i, Bundle bundle) {
    }

    public void c(int i, Bundle bundle, DataHolder dataHolder) {
    }

    public void d(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
    }
}
