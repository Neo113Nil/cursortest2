package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clc extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(3);
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final String e;

    public clc(int i, double d, int i2, int i3, String str) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final int hashCode() {
        int i = hpe.a;
        hpb hpbVar = hpl.a;
        hpk hpkVar = new hpk();
        hpkVar.c(this.a);
        long doubleToRawLongBits = Double.doubleToRawLongBits(this.b);
        hpkVar.f(4, (int) doubleToRawLongBits);
        hpkVar.f(4, doubleToRawLongBits >>> 32);
        hpkVar.c(this.c);
        hpkVar.c(this.d);
        String str = this.e;
        if (str != null) {
            hpkVar.e(str, StandardCharsets.UTF_8);
        }
        return ((hoz) hpkVar.k()).a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.t(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.v(parcel, 4, this.d);
        oy.I(parcel, 5, this.e);
        oy.r(parcel, q);
    }
}
