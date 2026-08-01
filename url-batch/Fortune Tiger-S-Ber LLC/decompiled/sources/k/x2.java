package k;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class x2 extends p0.b {
    public static final Parcelable.Creator<x2> CREATOR = new a2.c(4);
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2687i;

    public x2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt();
        this.f2687i = parcel.readInt() != 0;
    }

    @Override // p0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.h);
        parcel.writeInt(this.f2687i ? 1 : 0);
    }
}
