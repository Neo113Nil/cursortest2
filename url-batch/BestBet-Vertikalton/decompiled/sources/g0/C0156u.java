package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156u implements Parcelable {
    public static final Parcelable.Creator<C0156u> CREATOR = new F0.b(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2935a;

    /* renamed from: b, reason: collision with root package name */
    public int f2936b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2937c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2935a);
        parcel.writeInt(this.f2936b);
        parcel.writeInt(this.f2937c ? 1 : 0);
    }
}
