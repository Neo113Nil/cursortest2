package N0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h extends O0.a {
    public static final Parcelable.Creator<h> CREATOR = new H.h(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f1027a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1028b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1029c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1030d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1031e;

    public h(int i3, boolean z, boolean z2, int i4, int i5) {
        this.f1027a = i3;
        this.f1028b = z;
        this.f1029c = z2;
        this.f1030d = i4;
        this.f1031e = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f1027a);
        C2.b.U(parcel, 2, 4);
        parcel.writeInt(this.f1028b ? 1 : 0);
        C2.b.U(parcel, 3, 4);
        parcel.writeInt(this.f1029c ? 1 : 0);
        C2.b.U(parcel, 4, 4);
        parcel.writeInt(this.f1030d);
        C2.b.U(parcel, 5, 4);
        parcel.writeInt(this.f1031e);
        C2.b.T(parcel, S2);
    }
}
