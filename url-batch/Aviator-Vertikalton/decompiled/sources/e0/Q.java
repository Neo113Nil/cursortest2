package e0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Q extends R.b {
    public static final Parcelable.Creator<Q> CREATOR = new B0.b(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2140c;

    public Q(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2140c = parcel.readParcelable(classLoader == null ? I.class.getClassLoader() : classLoader);
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2140c, 0);
    }
}
