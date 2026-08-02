package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p0 extends J.c {
    public static final Parcelable.Creator<p0> CREATOR = new J.b(3);

    /* renamed from: c, reason: collision with root package name */
    public int f9866c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9867d;

    public p0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9866c = parcel.readInt();
        this.f9867d = parcel.readInt() != 0;
    }

    @Override // J.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f9866c);
        parcel.writeInt(this.f9867d ? 1 : 0);
    }
}
