package U;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class C extends J.c {
    public static final Parcelable.Creator<C> CREATOR = new J.b(1);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f1351c;

    public C(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1351c = parcel.readParcelable(classLoader == null ? u.class.getClassLoader() : classLoader);
    }

    @Override // J.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f1351c, 0);
    }
}
