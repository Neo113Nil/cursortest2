package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmp extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(11);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public cmp(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cmp)) {
            return false;
        }
        cmp cmpVar = (cmp) obj;
        return this.a == cmpVar.a && this.b == cmpVar.b && this.c == cmpVar.c && this.d == cmpVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.a + ", dataOwnerProductId=" + this.b + ", processingReason=" + this.c + ", isUserData=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.v(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.s(parcel, 4, this.d);
        oy.r(parcel, q);
    }
}
