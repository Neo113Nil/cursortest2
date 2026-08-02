package s2;

import O3.l;
import a2.C0162b;
import android.os.Parcel;
import android.os.Parcelable;
import d2.o;
import e2.AbstractC0408a;

/* loaded from: classes.dex */
public final class f extends AbstractC0408a {
    public static final Parcelable.Creator<f> CREATOR = new c(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f15237a;

    /* renamed from: b, reason: collision with root package name */
    public final C0162b f15238b;

    /* renamed from: c, reason: collision with root package name */
    public final o f15239c;

    public f(int i4, C0162b c0162b, o oVar) {
        this.f15237a = i4;
        this.f15238b = c0162b;
        this.f15239c = oVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        l.G(parcel, 1, 4);
        parcel.writeInt(this.f15237a);
        l.z(parcel, 2, this.f15238b, i4);
        l.z(parcel, 3, this.f15239c, i4);
        l.F(parcel, D3);
    }
}
