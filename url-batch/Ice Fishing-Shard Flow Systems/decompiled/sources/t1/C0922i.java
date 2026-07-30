package t1;

import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* renamed from: t1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922i extends AbstractC0943a {
    public static final Parcelable.Creator<C0922i> CREATOR = new I1.c(29);

    /* renamed from: d, reason: collision with root package name */
    public final int f7959d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7960e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7961i;

    /* renamed from: l, reason: collision with root package name */
    public final int f7962l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7963m;

    public C0922i(int i2, boolean z7, boolean z8, int i5, int i7) {
        this.f7959d = i2;
        this.f7960e = z7;
        this.f7961i = z8;
        this.f7962l = i5;
        this.f7963m = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f7959d);
        AbstractC1053a.P(parcel, 2, 4);
        parcel.writeInt(this.f7960e ? 1 : 0);
        AbstractC1053a.P(parcel, 3, 4);
        parcel.writeInt(this.f7961i ? 1 : 0);
        AbstractC1053a.P(parcel, 4, 4);
        parcel.writeInt(this.f7962l);
        AbstractC1053a.P(parcel, 5, 4);
        parcel.writeInt(this.f7963m);
        AbstractC1053a.S(parcel, Q);
    }
}
