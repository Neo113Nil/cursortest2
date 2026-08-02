package H0;

import H.h;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends O0.a {
    public static final Parcelable.Creator<b> CREATOR = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f599a;

    /* renamed from: b, reason: collision with root package name */
    public final int f600b;

    public b(String str, int i3) {
        this.f599a = str;
        this.f600b = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.O(parcel, 1, this.f599a);
        C2.b.U(parcel, 2, 4);
        parcel.writeInt(this.f600b);
        C2.b.T(parcel, S2);
    }
}
