package W;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class A extends K.c {
    public static final Parcelable.Creator<A> CREATOR = new K.b(1);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f3257c;

    public A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3257c = parcel.readParcelable(classLoader == null ? t.class.getClassLoader() : classLoader);
    }

    @Override // K.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f3257c, 0);
    }
}
