package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sw implements Parcelable {
    public final int rtx2ld2ELZv4;
    public static final rw Companion = new rw();
    public static final Parcelable.Creator<sw> CREATOR = new BUo4iHFctTZi(1);

    public sw(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw) && this.rtx2ld2ELZv4 == ((sw) obj).rtx2ld2ELZv4;
    }

    public final int hashCode() {
        return Integer.hashCode(this.rtx2ld2ELZv4);
    }

    public final String toString() {
        return o0.r3s1LDPKFs1S(new StringBuilder("DefaultLazyKey(index="), this.rtx2ld2ELZv4, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.rtx2ld2ELZv4);
    }
}
