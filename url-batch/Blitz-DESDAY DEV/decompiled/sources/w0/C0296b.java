package w0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296b extends T.b {
    public static final Parcelable.Creator<C0296b> CREATOR = new F0.b(7);

    /* renamed from: c, reason: collision with root package name */
    public boolean f3916c;

    public C0296b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0296b.class.getClassLoader();
        }
        this.f3916c = parcel.readInt() == 1;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3916c ? 1 : 0);
    }
}
