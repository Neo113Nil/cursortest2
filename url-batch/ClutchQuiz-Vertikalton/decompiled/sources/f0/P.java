package f0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class P extends R.b {
    public static final Parcelable.Creator<P> CREATOR = new A0.b(5);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2168c;

    public P(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2168c = parcel.readParcelable(classLoader == null ? H.class.getClassLoader() : classLoader);
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2168c, 0);
    }
}
