package X1;

import H.h;
import O3.l;
import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;

/* loaded from: classes.dex */
public final class b extends AbstractC0408a {
    public static final Parcelable.Creator<b> CREATOR = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f3609a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3610b;

    public b(String str, int i4) {
        this.f3609a = str;
        this.f3610b = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        l.A(parcel, 1, this.f3609a);
        l.G(parcel, 2, 4);
        parcel.writeInt(this.f3610b);
        l.F(parcel, D3);
    }
}
