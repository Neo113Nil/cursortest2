package U0;

import a.AbstractC0219a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i extends V0.a {
    public static final Parcelable.Creator<i> CREATOR = new I.j(10);

    /* renamed from: f, reason: collision with root package name */
    public final int f2542f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2543g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2544h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2545i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2546j;

    public i(int i7, boolean z5, boolean z6, int i8, int i9) {
        this.f2542f = i7;
        this.f2543g = z5;
        this.f2544h = z6;
        this.f2545i = i8;
        this.f2546j = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f2542f);
        AbstractC0219a.R(parcel, 2, 4);
        parcel.writeInt(this.f2543g ? 1 : 0);
        AbstractC0219a.R(parcel, 3, 4);
        parcel.writeInt(this.f2544h ? 1 : 0);
        AbstractC0219a.R(parcel, 4, 4);
        parcel.writeInt(this.f2545i);
        AbstractC0219a.R(parcel, 5, 4);
        parcel.writeInt(this.f2546j);
        AbstractC0219a.Q(parcel, O6);
    }
}
