package g1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new androidx.fragment.app.b(10);

    /* renamed from: f, reason: collision with root package name */
    public int f1663f;

    /* renamed from: g, reason: collision with root package name */
    public int f1664g;
    public boolean h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1663f);
        parcel.writeInt(this.f1664g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
