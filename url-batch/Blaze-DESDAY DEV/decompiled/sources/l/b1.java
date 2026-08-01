package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b1 extends S.b {
    public static final Parcelable.Creator<b1> CREATOR = new D0.b(5);

    /* renamed from: c, reason: collision with root package name */
    public int f2912c;
    public boolean d;

    public b1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2912c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2912c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
