package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cid extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(15);
    public final String a;
    public final String b;
    public final String c;

    public cid(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cid)) {
            return false;
        }
        cid cidVar = (cid) obj;
        return Objects.equals(this.a, cidVar.a) && Objects.equals(this.c, cidVar.c) && Objects.equals(this.b, cidVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    public final String toString() {
        return "Account=" + this.c + ",obfuscated gaiaId=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.I(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.r(parcel, q);
    }
}
