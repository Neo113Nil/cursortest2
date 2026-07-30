package t1;

import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* renamed from: t1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920g extends AbstractC0943a {
    public static final Parcelable.Creator<C0920g> CREATOR = new I1.c(26);

    /* renamed from: d, reason: collision with root package name */
    public final int f7947d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7948e;

    /* renamed from: i, reason: collision with root package name */
    public final int f7949i;

    /* renamed from: l, reason: collision with root package name */
    public final long f7950l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7951m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7952n;

    /* renamed from: o, reason: collision with root package name */
    public final String f7953o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7954p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7955q;

    public C0920g(int i2, int i5, int i7, long j, long j7, String str, String str2, int i8, int i9) {
        this.f7947d = i2;
        this.f7948e = i5;
        this.f7949i = i7;
        this.f7950l = j;
        this.f7951m = j7;
        this.f7952n = str;
        this.f7953o = str2;
        this.f7954p = i8;
        this.f7955q = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f7947d);
        AbstractC1053a.P(parcel, 2, 4);
        parcel.writeInt(this.f7948e);
        AbstractC1053a.P(parcel, 3, 4);
        parcel.writeInt(this.f7949i);
        AbstractC1053a.P(parcel, 4, 8);
        parcel.writeLong(this.f7950l);
        AbstractC1053a.P(parcel, 5, 8);
        parcel.writeLong(this.f7951m);
        AbstractC1053a.K(parcel, 6, this.f7952n);
        AbstractC1053a.K(parcel, 7, this.f7953o);
        AbstractC1053a.P(parcel, 8, 4);
        parcel.writeInt(this.f7954p);
        AbstractC1053a.P(parcel, 9, 4);
        parcel.writeInt(this.f7955q);
        AbstractC1053a.S(parcel, Q);
    }
}
