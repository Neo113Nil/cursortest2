package v0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309b extends S.b {
    public static final Parcelable.Creator<C0309b> CREATOR = new D0.b(7);

    /* renamed from: c, reason: collision with root package name */
    public boolean f3993c;

    public C0309b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0309b.class.getClassLoader();
        }
        this.f3993c = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3993c ? 1 : 0);
    }
}
