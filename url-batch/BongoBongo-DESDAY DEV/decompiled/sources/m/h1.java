package m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h1 extends T.b {
    public static final Parcelable.Creator<h1> CREATOR = new E0.b(5);

    /* renamed from: c, reason: collision with root package name */
    public int f3091c;
    public boolean d;

    public h1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3091c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3091c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
