package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxo extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(6);
    public final byte[] a;

    public cxo(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int q = oy.q(parcel, 20293);
        oy.A(parcel, 1, bArr);
        oy.r(parcel, q);
    }
}
