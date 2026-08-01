package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Q extends S.b {
    public static final Parcelable.Creator<Q> CREATOR = new C0.g(6);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2752c;

    public Q(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2752c = parcel.readParcelable(classLoader == null ? H.class.getClassLoader() : classLoader);
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2752c, 0);
    }
}
