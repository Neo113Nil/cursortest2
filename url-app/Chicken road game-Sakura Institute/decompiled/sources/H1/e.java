package H1;

import a.AbstractC0345a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends I1.a {
    public static final Parcelable.Creator<e> CREATOR = new E1.l(5);

    /* renamed from: d, reason: collision with root package name */
    public final int f3253d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3254e;

    /* renamed from: i, reason: collision with root package name */
    public final int f3255i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3256j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3257k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3258l;

    /* renamed from: m, reason: collision with root package name */
    public final String f3259m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3260n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3261o;

    public e(int i2, int i4, int i5, long j4, long j5, String str, String str2, int i6, int i7) {
        this.f3253d = i2;
        this.f3254e = i4;
        this.f3255i = i5;
        this.f3256j = j4;
        this.f3257k = j5;
        this.f3258l = str;
        this.f3259m = str2;
        this.f3260n = i6;
        this.f3261o = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        AbstractC0345a.P(parcel, 1, 4);
        parcel.writeInt(this.f3253d);
        AbstractC0345a.P(parcel, 2, 4);
        parcel.writeInt(this.f3254e);
        AbstractC0345a.P(parcel, 3, 4);
        parcel.writeInt(this.f3255i);
        AbstractC0345a.P(parcel, 4, 8);
        parcel.writeLong(this.f3256j);
        AbstractC0345a.P(parcel, 5, 8);
        parcel.writeLong(this.f3257k);
        AbstractC0345a.L(parcel, 6, this.f3258l);
        AbstractC0345a.L(parcel, 7, this.f3259m);
        AbstractC0345a.P(parcel, 8, 4);
        parcel.writeInt(this.f3260n);
        AbstractC0345a.P(parcel, 9, 4);
        parcel.writeInt(this.f3261o);
        AbstractC0345a.O(parcel, N3);
    }
}
