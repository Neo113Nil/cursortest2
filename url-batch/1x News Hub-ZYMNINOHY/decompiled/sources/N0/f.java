package N0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f extends O0.a {
    public static final Parcelable.Creator<f> CREATOR = new H.h(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f1016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1018c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1019d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1020e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1021g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1022h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1023i;

    public f(int i3, int i4, int i5, long j3, long j4, String str, String str2, int i6, int i7) {
        this.f1016a = i3;
        this.f1017b = i4;
        this.f1018c = i5;
        this.f1019d = j3;
        this.f1020e = j4;
        this.f = str;
        this.f1021g = str2;
        this.f1022h = i6;
        this.f1023i = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f1016a);
        C2.b.U(parcel, 2, 4);
        parcel.writeInt(this.f1017b);
        C2.b.U(parcel, 3, 4);
        parcel.writeInt(this.f1018c);
        C2.b.U(parcel, 4, 8);
        parcel.writeLong(this.f1019d);
        C2.b.U(parcel, 5, 8);
        parcel.writeLong(this.f1020e);
        C2.b.O(parcel, 6, this.f);
        C2.b.O(parcel, 7, this.f1021g);
        C2.b.U(parcel, 8, 4);
        parcel.writeInt(this.f1022h);
        C2.b.U(parcel, 9, 4);
        parcel.writeInt(this.f1023i);
        C2.b.T(parcel, S2);
    }
}
