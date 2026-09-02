package d2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;

/* loaded from: classes.dex */
public final class i extends AbstractC0408a {
    public static final Parcelable.Creator<i> CREATOR = new H.h(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f8269a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8270b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8271c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8272d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8273e;

    public i(int i4, int i5, int i6, boolean z, boolean z4) {
        this.f8269a = i4;
        this.f8270b = z;
        this.f8271c = z4;
        this.f8272d = i5;
        this.f8273e = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = O3.l.D(parcel, 20293);
        O3.l.G(parcel, 1, 4);
        parcel.writeInt(this.f8269a);
        O3.l.G(parcel, 2, 4);
        parcel.writeInt(this.f8270b ? 1 : 0);
        O3.l.G(parcel, 3, 4);
        parcel.writeInt(this.f8271c ? 1 : 0);
        O3.l.G(parcel, 4, 4);
        parcel.writeInt(this.f8272d);
        O3.l.G(parcel, 5, 4);
        parcel.writeInt(this.f8273e);
        O3.l.F(parcel, D3);
    }
}
