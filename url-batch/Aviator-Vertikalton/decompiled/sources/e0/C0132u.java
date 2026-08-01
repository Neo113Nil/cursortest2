package e0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132u implements Parcelable {
    public static final Parcelable.Creator<C0132u> CREATOR = new Q.k(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2346a;

    /* renamed from: b, reason: collision with root package name */
    public int f2347b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2348c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2346a);
        parcel.writeInt(this.f2347b);
        parcel.writeInt(this.f2348c ? 1 : 0);
    }
}
