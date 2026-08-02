package j;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r0 extends H.c {
    public static final Parcelable.Creator<r0> CREATOR = new H.b(3);

    /* renamed from: c, reason: collision with root package name */
    public int f3033c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3034d;

    public r0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3033c = parcel.readInt();
        this.f3034d = parcel.readInt() != 0;
    }

    @Override // H.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3033c);
        parcel.writeInt(this.f3034d ? 1 : 0);
    }
}
