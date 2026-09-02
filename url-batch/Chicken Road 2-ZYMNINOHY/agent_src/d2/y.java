package d2;

import a2.C0164d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;

/* loaded from: classes.dex */
public final class y extends AbstractC0408a {
    public static final Parcelable.Creator<y> CREATOR = new H.h(19);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f8309a;

    /* renamed from: b, reason: collision with root package name */
    public C0164d[] f8310b;

    /* renamed from: c, reason: collision with root package name */
    public int f8311c;

    /* renamed from: d, reason: collision with root package name */
    public C0385c f8312d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = O3.l.D(parcel, 20293);
        Bundle bundle = this.f8309a;
        if (bundle != null) {
            int D4 = O3.l.D(parcel, 1);
            parcel.writeBundle(bundle);
            O3.l.F(parcel, D4);
        }
        O3.l.B(parcel, 2, this.f8310b, i4);
        int i5 = this.f8311c;
        O3.l.G(parcel, 3, 4);
        parcel.writeInt(i5);
        O3.l.z(parcel, 4, this.f8312d, i4);
        O3.l.F(parcel, D3);
    }
}
