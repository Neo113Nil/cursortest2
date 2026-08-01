package h0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Q extends T.b {
    public static final Parcelable.Creator<Q> CREATOR = new F0.b(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2405c;

    public Q(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2405c = parcel.readParcelable(classLoader == null ? I.class.getClassLoader() : classLoader);
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2405c, 0);
    }
}
