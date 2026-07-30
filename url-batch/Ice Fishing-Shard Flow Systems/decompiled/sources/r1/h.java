package r1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class h extends AbstractC0943a {
    public static final Parcelable.Creator<h> CREATOR = new o(1);

    /* renamed from: d, reason: collision with root package name */
    public final int f7443d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7444e;

    /* renamed from: i, reason: collision with root package name */
    public final int f7445i;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7446l;

    public h(int i2, int i5, int i7, boolean z7) {
        this.f7443d = i2;
        this.f7444e = i5;
        this.f7445i = i7;
        this.f7446l = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f7443d == hVar.f7443d && this.f7444e == hVar.f7444e && this.f7445i == hVar.f7445i && this.f7446l == hVar.f7446l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7443d), Integer.valueOf(this.f7444e), Integer.valueOf(this.f7445i), Boolean.valueOf(this.f7446l)});
    }

    public final String toString() {
        int i2 = this.f7443d;
        int length = String.valueOf(i2).length();
        int i5 = this.f7444e;
        int length2 = String.valueOf(i5).length();
        int i7 = this.f7445i;
        int length3 = String.valueOf(i7).length();
        boolean z7 = this.f7446l;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z7).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i2);
        sb.append(", dataOwnerProductId=");
        sb.append(i5);
        sb.append(", processingReason=");
        sb.append(i7);
        sb.append(", isUserData=");
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f7443d);
        AbstractC1053a.P(parcel, 2, 4);
        parcel.writeInt(this.f7444e);
        AbstractC1053a.P(parcel, 3, 4);
        parcel.writeInt(this.f7445i);
        AbstractC1053a.P(parcel, 4, 4);
        parcel.writeInt(this.f7446l ? 1 : 0);
        AbstractC1053a.S(parcel, Q);
    }
}
