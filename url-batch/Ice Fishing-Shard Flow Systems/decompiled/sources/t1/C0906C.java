package t1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* renamed from: t1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906C extends AbstractC0943a {
    public static final Parcelable.Creator<C0906C> CREATOR = new C0907D(0);

    /* renamed from: d, reason: collision with root package name */
    public Bundle f7897d;

    /* renamed from: e, reason: collision with root package name */
    public q1.d[] f7898e;

    /* renamed from: i, reason: collision with root package name */
    public int f7899i;

    /* renamed from: l, reason: collision with root package name */
    public C0917d f7900l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.H(parcel, 1, this.f7897d);
        AbstractC1053a.L(parcel, 2, this.f7898e, i2);
        int i5 = this.f7899i;
        AbstractC1053a.P(parcel, 3, 4);
        parcel.writeInt(i5);
        AbstractC1053a.J(parcel, 4, this.f7900l, i2);
        AbstractC1053a.S(parcel, Q);
    }
}
