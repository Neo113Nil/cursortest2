package U0;

import a.AbstractC0219a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z extends V0.a {
    public static final Parcelable.Creator<z> CREATOR = new I.j(11);

    /* renamed from: f, reason: collision with root package name */
    public Bundle f2591f;

    /* renamed from: g, reason: collision with root package name */
    public R0.c[] f2592g;

    /* renamed from: h, reason: collision with root package name */
    public int f2593h;

    /* renamed from: i, reason: collision with root package name */
    public C0213d f2594i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.H(parcel, 1, this.f2591f);
        AbstractC0219a.K(parcel, 2, this.f2592g, i7);
        int i8 = this.f2593h;
        AbstractC0219a.R(parcel, 3, 4);
        parcel.writeInt(i8);
        AbstractC0219a.I(parcel, 4, this.f2594i, i7);
        AbstractC0219a.Q(parcel, O6);
    }
}
