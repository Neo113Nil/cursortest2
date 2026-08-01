package a2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends p0.b {
    public static final Parcelable.Creator<d> CREATOR = new c(0);
    public boolean h;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt() == 1;
    }

    @Override // p0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
