package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends R.b {
    public static final Parcelable.Creator<b> CREATOR = new B0.b(7);

    /* renamed from: c, reason: collision with root package name */
    public boolean f3785c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f3785c = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3785c ? 1 : 0);
    }
}
