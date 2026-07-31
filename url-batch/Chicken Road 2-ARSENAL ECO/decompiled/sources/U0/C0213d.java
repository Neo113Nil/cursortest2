package U0;

import a.AbstractC0219a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: U0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213d extends V0.a {
    public static final Parcelable.Creator<C0213d> CREATOR = new I.j(12);

    /* renamed from: f, reason: collision with root package name */
    public final i f2509f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2510g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2511h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2512i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2513j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f2514k;

    public C0213d(i iVar, boolean z5, boolean z6, int[] iArr, int i7, int[] iArr2) {
        this.f2509f = iVar;
        this.f2510g = z5;
        this.f2511h = z6;
        this.f2512i = iArr;
        this.f2513j = i7;
        this.f2514k = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.I(parcel, 1, this.f2509f, i7);
        AbstractC0219a.R(parcel, 2, 4);
        parcel.writeInt(this.f2510g ? 1 : 0);
        AbstractC0219a.R(parcel, 3, 4);
        parcel.writeInt(this.f2511h ? 1 : 0);
        int[] iArr = this.f2512i;
        if (iArr != null) {
            int O7 = AbstractC0219a.O(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC0219a.Q(parcel, O7);
        }
        AbstractC0219a.R(parcel, 5, 4);
        parcel.writeInt(this.f2513j);
        int[] iArr2 = this.f2514k;
        if (iArr2 != null) {
            int O8 = AbstractC0219a.O(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC0219a.Q(parcel, O8);
        }
        AbstractC0219a.Q(parcel, O6);
    }
}
