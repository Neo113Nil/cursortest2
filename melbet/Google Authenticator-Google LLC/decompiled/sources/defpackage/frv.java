package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dtk(8);
    public final int a;

    public frv(int i) {
        this.a = i;
    }

    public static frv a(int i) {
        hoq.I(i >= -1, "Invalid AccountId");
        return new frv(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof frv) && this.a == ((frv) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "AccountId{id=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public frv() {
        throw null;
    }
}
