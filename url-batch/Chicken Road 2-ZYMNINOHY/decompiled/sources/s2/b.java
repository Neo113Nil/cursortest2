package s2;

import O3.l;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;

/* loaded from: classes.dex */
public final class b extends AbstractC0408a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f15231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15232b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f15233c;

    public b(int i4, int i5, Intent intent) {
        this.f15231a = i4;
        this.f15232b = i5;
        this.f15233c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        l.G(parcel, 1, 4);
        parcel.writeInt(this.f15231a);
        l.G(parcel, 2, 4);
        parcel.writeInt(this.f15232b);
        l.z(parcel, 3, this.f15233c, i4);
        l.F(parcel, D3);
    }
}
