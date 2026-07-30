package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408A extends N.c {
    public static final Parcelable.Creator<C0408A> CREATOR = new N.b(1);

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f4854i;

    public C0408A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4854i = parcel.readParcelable(classLoader == null ? AbstractC0440t.class.getClassLoader() : classLoader);
    }

    @Override // N.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f4854i, 0);
    }
}
