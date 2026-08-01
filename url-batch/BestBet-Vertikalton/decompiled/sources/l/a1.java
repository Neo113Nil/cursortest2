package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 extends S.b {
    public static final Parcelable.Creator<a1> CREATOR = new C0.g(7);

    /* renamed from: c, reason: collision with root package name */
    public int f3368c;
    public boolean d;

    public a1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3368c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3368c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
