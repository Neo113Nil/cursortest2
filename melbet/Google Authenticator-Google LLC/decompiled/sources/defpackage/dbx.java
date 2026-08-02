package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbx extends cri {
    public final String b;
    public final int c;
    public final String[] d;
    public final byte[] e;
    public final boolean f;
    public final int[] g;
    public final String h;
    public final byte[] i;
    public final int j;
    public final int k;
    public static final byte[] a = new byte[0];
    public static final Parcelable.Creator CREATOR = new dbh(8);

    public dbx(String str, int i, String[] strArr, byte[] bArr, boolean z, int[] iArr, String str2, byte[] bArr2, int i2, int i3) {
        this.b = str;
        this.c = i;
        this.d = strArr;
        this.e = bArr;
        this.f = z;
        this.g = iArr;
        this.h = str2;
        this.i = bArr2;
        this.j = i2;
        this.k = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dbx) {
            dbx dbxVar = (dbx) obj;
            if (this.b.equals(dbxVar.b) && this.c == dbxVar.c && Arrays.equals(this.d, dbxVar.d) && Arrays.equals(this.e, dbxVar.e) && this.f == dbxVar.f && Arrays.equals(this.g, dbxVar.g) && this.h.equals(dbxVar.h) && Arrays.equals(this.i, dbxVar.i) && this.j == dbxVar.j && this.k == dbxVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), this.d, this.e, Boolean.valueOf(this.f), this.g, this.h, this.i, Integer.valueOf(this.j), Integer.valueOf(this.k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, this.b);
        oy.v(parcel, 2, this.c);
        oy.J(parcel, 3, this.d);
        oy.A(parcel, 4, this.e);
        oy.s(parcel, 5, this.f);
        oy.D(parcel, 6, this.g);
        oy.I(parcel, 7, this.h);
        oy.A(parcel, 8, this.i);
        oy.v(parcel, 9, this.j);
        oy.v(parcel, 10, this.k);
        oy.r(parcel, q);
    }
}
