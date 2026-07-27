package H1;

import a.AbstractC0345a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u extends I1.a {
    public static final Parcelable.Creator<u> CREATOR = new E1.l(7);

    /* renamed from: d, reason: collision with root package name */
    public Bundle f3295d;

    /* renamed from: e, reason: collision with root package name */
    public E1.d[] f3296e;

    /* renamed from: i, reason: collision with root package name */
    public int f3297i;

    /* renamed from: j, reason: collision with root package name */
    public b f3298j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        Bundle bundle = this.f3295d;
        if (bundle != null) {
            int N4 = AbstractC0345a.N(parcel, 1);
            parcel.writeBundle(bundle);
            AbstractC0345a.O(parcel, N4);
        }
        AbstractC0345a.M(parcel, 2, this.f3296e, i2);
        AbstractC0345a.P(parcel, 3, 4);
        parcel.writeInt(this.f3297i);
        AbstractC0345a.K(parcel, 4, this.f3298j, i2);
        AbstractC0345a.O(parcel, N3);
    }
}
