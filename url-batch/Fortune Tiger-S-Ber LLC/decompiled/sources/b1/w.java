package b1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new androidx.fragment.app.b(6);

    /* renamed from: f, reason: collision with root package name */
    public int f935f;
    public int g;
    public boolean h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f935f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
