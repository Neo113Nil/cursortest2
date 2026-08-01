package w0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311b extends T.b {
    public static final Parcelable.Creator<C0311b> CREATOR = new E0.b(7);

    /* renamed from: c, reason: collision with root package name */
    public boolean f4182c;

    public C0311b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0311b.class.getClassLoader();
        }
        this.f4182c = parcel.readInt() == 1;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4182c ? 1 : 0);
    }
}
