package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class day extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(15);
    public final dba a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public day(dba dbaVar, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = dbaVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof day)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        day dayVar = (day) obj;
        return Objects.equals(this.a, dayVar.a) && Objects.equals(this.b, dayVar.b) && Objects.equals(this.c, dayVar.c) && Objects.equals(this.d, dayVar.d) && Objects.equals(this.e, dayVar.e) && Objects.equals(this.f, dayVar.f) && Objects.equals(this.g, dayVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dba dbaVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 2, dbaVar, i);
        oy.I(parcel, 3, this.b);
        oy.I(parcel, 4, this.g);
        oy.I(parcel, 5, this.d);
        oy.I(parcel, 6, this.e);
        oy.I(parcel, 7, this.f);
        oy.I(parcel, 17, this.c);
        oy.r(parcel, q);
    }
}
