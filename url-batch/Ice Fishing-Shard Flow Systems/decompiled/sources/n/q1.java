package n;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q1 extends N.c {
    public static final Parcelable.Creator<q1> CREATOR = new N.b(3);

    /* renamed from: i, reason: collision with root package name */
    public int f6871i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6872l;

    public q1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6871i = parcel.readInt();
        this.f6872l = parcel.readInt() != 0;
    }

    @Override // N.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f6871i);
        parcel.writeInt(this.f6872l ? 1 : 0);
    }
}
