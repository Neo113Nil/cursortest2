package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends n4.a {
    public static final Parcelable.Creator<b> CREATOR = new d4.a(11);

    /* renamed from: f, reason: collision with root package name */
    public final g f6333f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6334g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6335h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f6336i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6337j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f6338k;

    public b(g gVar, boolean z8, boolean z9, int[] iArr, int i7, int[] iArr2) {
        this.f6333f = gVar;
        this.f6334g = z8;
        this.f6335h = z9;
        this.f6336i = iArr;
        this.f6337j = i7;
        this.f6338k = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int R = a8.m.R(parcel, 20293);
        a8.m.O(parcel, 1, this.f6333f, i7);
        a8.m.T(parcel, 2, 4);
        parcel.writeInt(this.f6334g ? 1 : 0);
        a8.m.T(parcel, 3, 4);
        parcel.writeInt(this.f6335h ? 1 : 0);
        int[] iArr = this.f6336i;
        if (iArr != null) {
            int R2 = a8.m.R(parcel, 4);
            parcel.writeIntArray(iArr);
            a8.m.S(parcel, R2);
        }
        a8.m.T(parcel, 5, 4);
        parcel.writeInt(this.f6337j);
        int[] iArr2 = this.f6338k;
        if (iArr2 != null) {
            int R3 = a8.m.R(parcel, 6);
            parcel.writeIntArray(iArr2);
            a8.m.S(parcel, R3);
        }
        a8.m.S(parcel, R);
    }
}
