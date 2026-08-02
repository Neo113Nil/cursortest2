package N0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: N0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064c extends O0.a {
    public static final Parcelable.Creator<C0064c> CREATOR = new H.h(13);

    /* renamed from: a, reason: collision with root package name */
    public final h f997a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f998b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f999c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1001e;
    public final int[] f;

    public C0064c(h hVar, boolean z, boolean z2, int[] iArr, int i3, int[] iArr2) {
        this.f997a = hVar;
        this.f998b = z;
        this.f999c = z2;
        this.f1000d = iArr;
        this.f1001e = i3;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.N(parcel, 1, this.f997a, i3);
        C2.b.U(parcel, 2, 4);
        parcel.writeInt(this.f998b ? 1 : 0);
        C2.b.U(parcel, 3, 4);
        parcel.writeInt(this.f999c ? 1 : 0);
        int[] iArr = this.f1000d;
        if (iArr != null) {
            int S3 = C2.b.S(parcel, 4);
            parcel.writeIntArray(iArr);
            C2.b.T(parcel, S3);
        }
        C2.b.U(parcel, 5, 4);
        parcel.writeInt(this.f1001e);
        int[] iArr2 = this.f;
        if (iArr2 != null) {
            int S4 = C2.b.S(parcel, 6);
            parcel.writeIntArray(iArr2);
            C2.b.T(parcel, S4);
        }
        C2.b.T(parcel, S2);
    }
}
