package N;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: N.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058o implements Parcelable {
    public static final Parcelable.Creator<C0058o> CREATOR = new C.k(1);

    /* renamed from: e, reason: collision with root package name */
    public int f763e;

    /* renamed from: f, reason: collision with root package name */
    public int f764f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f765g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f763e);
        parcel.writeInt(this.f764f);
        parcel.writeInt(this.f765g ? 1 : 0);
    }
}
