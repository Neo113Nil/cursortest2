package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbd extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(20);
    public final String a;
    public final Integer b;
    public final Integer c;

    public dbd(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbd)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dbd dbdVar = (dbd) obj;
        return Objects.equals(this.a, dbdVar.a) && Objects.equals(this.b, dbdVar.b) && Objects.equals(this.c, dbdVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, str);
        oy.E(parcel, 3, this.b);
        oy.E(parcel, 4, this.c);
        oy.r(parcel, q);
    }
}
