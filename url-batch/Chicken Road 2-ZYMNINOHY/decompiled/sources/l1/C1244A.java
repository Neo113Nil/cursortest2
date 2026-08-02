package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244A extends J.c {
    public static final Parcelable.Creator<C1244A> CREATOR = new J.b(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f14164c;

    public C1244A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14164c = parcel.readParcelable(classLoader == null ? t.class.getClassLoader() : classLoader);
    }

    @Override // J.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeParcelable(this.f14164c, 0);
    }
}
