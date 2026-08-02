package P;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D extends H.c {
    public static final Parcelable.Creator<D> CREATOR = new H.b(1);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f833c;

    public D(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f833c = parcel.readParcelable(classLoader == null ? v.class.getClassLoader() : classLoader);
    }

    @Override // H.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f833c, 0);
    }
}
