package L0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends S.b {
    public static final Parcelable.Creator<a> CREATOR = new C0.g(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f699c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f699c = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f699c ? 1 : 0);
    }
}
