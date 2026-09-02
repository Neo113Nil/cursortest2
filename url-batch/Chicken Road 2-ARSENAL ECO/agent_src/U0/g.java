package U0;

import a.AbstractC0219a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends V0.a {
    public static final Parcelable.Creator<g> CREATOR = new I.j(7);

    /* renamed from: f, reason: collision with root package name */
    public final int f2531f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2532g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2533h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2534i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2535j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2536k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2537l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2538m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2539n;

    public g(int i7, int i8, int i9, long j4, long j7, String str, String str2, int i10, int i11) {
        this.f2531f = i7;
        this.f2532g = i8;
        this.f2533h = i9;
        this.f2534i = j4;
        this.f2535j = j7;
        this.f2536k = str;
        this.f2537l = str2;
        this.f2538m = i10;
        this.f2539n = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f2531f);
        AbstractC0219a.R(parcel, 2, 4);
        parcel.writeInt(this.f2532g);
        AbstractC0219a.R(parcel, 3, 4);
        parcel.writeInt(this.f2533h);
        AbstractC0219a.R(parcel, 4, 8);
        parcel.writeLong(this.f2534i);
        AbstractC0219a.R(parcel, 5, 8);
        parcel.writeLong(this.f2535j);
        AbstractC0219a.J(parcel, 6, this.f2536k);
        AbstractC0219a.J(parcel, 7, this.f2537l);
        AbstractC0219a.R(parcel, 8, 4);
        parcel.writeInt(this.f2538m);
        AbstractC0219a.R(parcel, 9, 4);
        parcel.writeInt(this.f2539n);
        AbstractC0219a.Q(parcel, O6);
    }
}
