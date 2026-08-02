package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chd extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(3);
    public final int a;
    public final int b;
    public final String c;
    public final byte[][] d;
    public final byte[] e;
    public final byte[] f;

    public chd(int i, int i2, String str, byte[][] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.v(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.B(parcel, 4, this.d);
        oy.A(parcel, 5, this.e);
        oy.A(parcel, 6, this.f);
        oy.r(parcel, q);
    }
}
