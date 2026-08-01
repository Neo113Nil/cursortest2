package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c1 extends T.b {
    public static final Parcelable.Creator<c1> CREATOR = new F0.b(5);

    /* renamed from: c, reason: collision with root package name */
    public int f2970c;
    public boolean d;

    public c1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2970c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2970c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
