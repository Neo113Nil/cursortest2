package D0;

import C0.g;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends S.b {
    public static final Parcelable.Creator<b> CREATOR = new g(1);

    /* renamed from: c, reason: collision with root package name */
    public boolean f124c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f124c = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f124c ? 1 : 0);
    }
}
