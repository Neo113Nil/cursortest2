package i1;

import I.j;
import U0.p;
import a.AbstractC0219a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends V0.a {
    public static final Parcelable.Creator<g> CREATOR = new j(18);

    /* renamed from: f, reason: collision with root package name */
    public final int f4426f;

    /* renamed from: g, reason: collision with root package name */
    public final R0.a f4427g;

    /* renamed from: h, reason: collision with root package name */
    public final p f4428h;

    public g(int i7, R0.a aVar, p pVar) {
        this.f4426f = i7;
        this.f4427g = aVar;
        this.f4428h = pVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f4426f);
        AbstractC0219a.I(parcel, 2, this.f4427g, i7);
        AbstractC0219a.I(parcel, 3, this.f4428h, i7);
        AbstractC0219a.Q(parcel, O6);
    }
}
