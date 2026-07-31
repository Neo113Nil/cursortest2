package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r0 extends K.c {
    public static final Parcelable.Creator<r0> CREATOR = new K.b(2);

    /* renamed from: h, reason: collision with root package name */
    public int f5082h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5083i;

    public r0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5082h = parcel.readInt();
        this.f5083i = parcel.readInt() != 0;
    }

    @Override // K.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f5082h);
        parcel.writeInt(this.f5083i ? 1 : 0);
    }
}
