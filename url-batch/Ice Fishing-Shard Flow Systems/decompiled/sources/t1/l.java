package t1;

import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class l extends AbstractC0943a {
    public static final Parcelable.Creator<l> CREATOR = new I1.c(25);

    /* renamed from: d, reason: collision with root package name */
    public final int f7967d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7968e;

    /* renamed from: i, reason: collision with root package name */
    public final long f7969i;

    /* renamed from: l, reason: collision with root package name */
    public final int f7970l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7971m;

    public l(int i2, String str, long j, int i5, boolean z7) {
        this.f7967d = i2;
        this.f7968e = str;
        this.f7969i = j;
        this.f7970l = i5;
        this.f7971m = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f7967d);
        AbstractC1053a.K(parcel, 2, this.f7968e);
        AbstractC1053a.P(parcel, 3, 8);
        parcel.writeLong(this.f7969i);
        AbstractC1053a.P(parcel, 4, 4);
        parcel.writeInt(this.f7970l);
        AbstractC1053a.P(parcel, 5, 4);
        parcel.writeInt(this.f7971m ? 1 : 0);
        AbstractC1053a.S(parcel, Q);
    }
}
