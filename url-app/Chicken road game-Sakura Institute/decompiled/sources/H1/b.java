package H1;

import a.AbstractC0345a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends I1.a {
    public static final Parcelable.Creator<b> CREATOR = new E1.l(8);

    /* renamed from: d, reason: collision with root package name */
    public final g f3231d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3232e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3233i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3234j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3235k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f3236l;

    public b(g gVar, boolean z4, boolean z5, int[] iArr, int i2, int[] iArr2) {
        this.f3231d = gVar;
        this.f3232e = z4;
        this.f3233i = z5;
        this.f3234j = iArr;
        this.f3235k = i2;
        this.f3236l = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        AbstractC0345a.K(parcel, 1, this.f3231d, i2);
        AbstractC0345a.P(parcel, 2, 4);
        parcel.writeInt(this.f3232e ? 1 : 0);
        AbstractC0345a.P(parcel, 3, 4);
        parcel.writeInt(this.f3233i ? 1 : 0);
        int[] iArr = this.f3234j;
        if (iArr != null) {
            int N4 = AbstractC0345a.N(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC0345a.O(parcel, N4);
        }
        AbstractC0345a.P(parcel, 5, 4);
        parcel.writeInt(this.f3235k);
        int[] iArr2 = this.f3236l;
        if (iArr2 != null) {
            int N5 = AbstractC0345a.N(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC0345a.O(parcel, N5);
        }
        AbstractC0345a.O(parcel, N3);
    }
}
