package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h10 extends i1 {
    public static final Parcelable.Creator<h10> CREATOR = new va3(19);
    public final rb2 m;
    public final boolean n;
    public final boolean o;
    public final int[] p;
    public final int q;
    public final int[] r;

    public h10(rb2 rb2Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.m = rb2Var;
        this.n = z;
        this.o = z2;
        this.p = iArr;
        this.q = i;
        this.r = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.V(parcel, 1, this.m, i);
        yk3.d0(parcel, 2, 4);
        parcel.writeInt(this.n ? 1 : 0);
        yk3.d0(parcel, 3, 4);
        parcel.writeInt(this.o ? 1 : 0);
        int[] iArr = this.p;
        if (iArr != null) {
            int b02 = yk3.b0(parcel, 4);
            parcel.writeIntArray(iArr);
            yk3.c0(parcel, b02);
        }
        yk3.d0(parcel, 5, 4);
        parcel.writeInt(this.q);
        int[] iArr2 = this.r;
        if (iArr2 != null) {
            int b03 = yk3.b0(parcel, 6);
            parcel.writeIntArray(iArr2);
            yk3.c0(parcel, b03);
        }
        yk3.c0(parcel, b0);
    }
}
