package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckn extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(1);
    public final String a;
    public final int b;
    public int c;

    public ckn(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckn)) {
            return false;
        }
        ckn cknVar = (ckn) obj;
        return Objects.equals(this.a, cknVar.a) && this.b == cknVar.b && this.c == cknVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, this.a);
        oy.v(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.r(parcel, q);
    }
}
