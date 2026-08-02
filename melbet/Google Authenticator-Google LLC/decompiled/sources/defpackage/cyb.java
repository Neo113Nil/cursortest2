package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyb extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(9);
    public final ParcelFileDescriptor a;

    public cyb(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, parcelFileDescriptor, i | 1);
        oy.r(parcel, q);
    }
}
