package i;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p0 extends E.c {
    public static final Parcelable.Creator<p0> CREATOR = new E.b(3);

    /* renamed from: g, reason: collision with root package name */
    public int f2280g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2281h;

    public p0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2280g = parcel.readInt();
        this.f2281h = parcel.readInt() != 0;
    }

    @Override // E.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f2280g);
        parcel.writeInt(this.f2281h ? 1 : 0);
    }
}
