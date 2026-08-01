package n;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g1 extends T.b {
    public static final Parcelable.Creator<g1> CREATOR = new H0.b(5);

    /* renamed from: c, reason: collision with root package name */
    public int f3617c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3618d;

    public g1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3617c = parcel.readInt();
        this.f3618d = parcel.readInt() != 0;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3617c);
        parcel.writeInt(this.f3618d ? 1 : 0);
    }
}
