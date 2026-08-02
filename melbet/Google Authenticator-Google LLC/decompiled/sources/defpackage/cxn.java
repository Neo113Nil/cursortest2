package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxn extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(5);
    public final byte[] a;
    public final cxi b;
    public final long c;
    public final int d;

    public cxn(int i, byte[] bArr, cxi cxiVar, long j) {
        int A = a.A(i);
        this.d = A == 0 ? 1 : A;
        this.a = bArr;
        this.b = cxiVar;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d - 1;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.A(parcel, 2, this.a);
        oy.H(parcel, 3, this.b, i);
        oy.w(parcel, 4, this.c);
        oy.r(parcel, q);
    }
}
