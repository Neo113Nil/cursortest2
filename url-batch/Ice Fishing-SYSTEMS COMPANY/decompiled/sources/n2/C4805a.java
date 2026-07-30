package n2;

import android.os.Parcel;
import android.os.Parcelable;
import f3.C4509h;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4805a extends P2.a {
    public static final Parcelable.Creator<C4805a> CREATOR = new C4509h(2);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39629n;

    public C4805a(boolean z8) {
        this.f39629n = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f39629n ? 1 : 0);
        S0.f.C(parcel, B8);
    }
}
