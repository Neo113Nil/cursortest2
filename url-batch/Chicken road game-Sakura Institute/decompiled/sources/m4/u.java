package m4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends n4.a {
    public static final Parcelable.Creator<u> CREATOR = new d4.a(10);

    /* renamed from: f, reason: collision with root package name */
    public Bundle f6397f;

    /* renamed from: g, reason: collision with root package name */
    public j4.d[] f6398g;

    /* renamed from: h, reason: collision with root package name */
    public int f6399h;

    /* renamed from: i, reason: collision with root package name */
    public b f6400i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int R = a8.m.R(parcel, 20293);
        Bundle bundle = this.f6397f;
        if (bundle != null) {
            int R2 = a8.m.R(parcel, 1);
            parcel.writeBundle(bundle);
            a8.m.S(parcel, R2);
        }
        a8.m.Q(parcel, 2, this.f6398g, i7);
        int i8 = this.f6399h;
        a8.m.T(parcel, 3, 4);
        parcel.writeInt(i8);
        a8.m.O(parcel, 4, this.f6400i, i7);
        a8.m.S(parcel, R);
    }
}
