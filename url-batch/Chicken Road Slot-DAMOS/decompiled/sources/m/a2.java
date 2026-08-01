package m;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a2 extends v3.b {
    public static final Parcelable.Creator<a2> CREATOR = new b1.v(1);

    /* renamed from: i, reason: collision with root package name */
    public int f6025i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6026r;

    public a2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6025i = parcel.readInt();
        this.f6026r = parcel.readInt() != 0;
    }

    @Override // v3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f6025i);
        parcel.writeInt(this.f6026r ? 1 : 0);
    }
}
