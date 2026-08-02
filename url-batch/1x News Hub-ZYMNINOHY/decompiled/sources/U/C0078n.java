package U;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: U.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078n implements Parcelable {
    public static final Parcelable.Creator<C0078n> CREATOR = new H.h(15);

    /* renamed from: a, reason: collision with root package name */
    public int f1443a;

    /* renamed from: b, reason: collision with root package name */
    public int f1444b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1445c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1443a);
        parcel.writeInt(this.f1444b);
        parcel.writeInt(this.f1445c ? 1 : 0);
    }
}
