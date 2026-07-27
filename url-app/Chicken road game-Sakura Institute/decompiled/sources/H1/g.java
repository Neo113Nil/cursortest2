package H1;

import a.AbstractC0345a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends I1.a {
    public static final Parcelable.Creator<g> CREATOR = new E1.l(6);

    /* renamed from: d, reason: collision with root package name */
    public final int f3264d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3265e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3266i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3267j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3268k;

    public g(int i2, int i4, int i5, boolean z4, boolean z5) {
        this.f3264d = i2;
        this.f3265e = z4;
        this.f3266i = z5;
        this.f3267j = i4;
        this.f3268k = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        AbstractC0345a.P(parcel, 1, 4);
        parcel.writeInt(this.f3264d);
        AbstractC0345a.P(parcel, 2, 4);
        parcel.writeInt(this.f3265e ? 1 : 0);
        AbstractC0345a.P(parcel, 3, 4);
        parcel.writeInt(this.f3266i ? 1 : 0);
        AbstractC0345a.P(parcel, 4, 4);
        parcel.writeInt(this.f3267j);
        AbstractC0345a.P(parcel, 5, 4);
        parcel.writeInt(this.f3268k);
        AbstractC0345a.O(parcel, N3);
    }
}
