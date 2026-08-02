package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m0 extends J.c {
    public static final Parcelable.Creator<m0> CREATOR = new J.b(3);

    /* renamed from: c, reason: collision with root package name */
    public int f14047c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14048d;

    public m0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14047c = parcel.readInt();
        this.f14048d = parcel.readInt() != 0;
    }

    @Override // J.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f14047c);
        parcel.writeInt(this.f14048d ? 1 : 0);
    }
}
