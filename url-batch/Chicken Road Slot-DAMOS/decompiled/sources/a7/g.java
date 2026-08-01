package a7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends d7.a {
    public static final Parcelable.Creator<g> CREATOR = new o(1);

    /* renamed from: d, reason: collision with root package name */
    public final int f321d;

    /* renamed from: e, reason: collision with root package name */
    public final int f322e;

    /* renamed from: i, reason: collision with root package name */
    public final int f323i;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f324r;

    public g(int i3, int i10, int i11, boolean z10) {
        this.f321d = i3;
        this.f322e = i10;
        this.f323i = i11;
        this.f324r = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f321d == gVar.f321d && this.f322e == gVar.f322e && this.f323i == gVar.f323i && this.f324r == gVar.f324r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f321d), Integer.valueOf(this.f322e), Integer.valueOf(this.f323i), Boolean.valueOf(this.f324r)});
    }

    public final String toString() {
        int i3 = this.f321d;
        int length = String.valueOf(i3).length();
        int i10 = this.f322e;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f323i;
        int length3 = String.valueOf(i11).length();
        boolean z10 = this.f324r;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z10).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i3);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i10);
        sb2.append(", processingReason=");
        sb2.append(i11);
        sb2.append(", isUserData=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f321d);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f322e);
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(this.f323i);
        cf.c.Y(parcel, 4, 4);
        parcel.writeInt(this.f324r ? 1 : 0);
        cf.c.a0(parcel, Z);
    }
}
