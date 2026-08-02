package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czv extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(7);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final long g;

    public czv(String str, int i, int i2, String str2, String str3, int i3, long j) {
        this.b = i;
        this.a = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = i3;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czv)) {
            return false;
        }
        czv czvVar = (czv) obj;
        return this.b == czvVar.b && this.c == czvVar.c && Objects.equals(this.d, czvVar.d) && Objects.equals(this.a, czvVar.a) && Objects.equals(this.e, czvVar.e) && this.f == czvVar.f && this.g == czvVar.g;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.a, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.v(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.I(parcel, 4, this.d);
        oy.I(parcel, 5, this.e);
        oy.v(parcel, 6, this.f);
        oy.w(parcel, 7, this.g);
        oy.r(parcel, q);
    }
}
