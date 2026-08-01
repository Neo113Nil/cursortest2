package h0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class T extends T.b {
    public static final Parcelable.Creator<T> CREATOR = new E0.b(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2426c;

    public T(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2426c = parcel.readParcelable(classLoader == null ? J.class.getClassLoader() : classLoader);
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2426c, 0);
    }
}
