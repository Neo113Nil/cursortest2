package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class V extends S.b {
    public static final Parcelable.Creator<V> CREATOR = new D0.b(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2303c;

    public V(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2303c = parcel.readParcelable(classLoader == null ? L.class.getClassLoader() : classLoader);
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2303c, 0);
    }
}
