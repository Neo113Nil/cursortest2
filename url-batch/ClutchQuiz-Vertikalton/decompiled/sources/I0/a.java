package I0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends R.b {
    public static final Parcelable.Creator<a> CREATOR = new A0.b(1);

    /* renamed from: c, reason: collision with root package name */
    public boolean f267c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f267c = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f267c ? 1 : 0);
    }
}
