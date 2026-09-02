package d2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;

/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385c extends AbstractC0408a {
    public static final Parcelable.Creator<C0385c> CREATOR = new H.h(20);

    /* renamed from: a, reason: collision with root package name */
    public final i f8234a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8235b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8236c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f8237d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8238e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8239f;

    public C0385c(i iVar, boolean z, boolean z4, int[] iArr, int i4, int[] iArr2) {
        this.f8234a = iVar;
        this.f8235b = z;
        this.f8236c = z4;
        this.f8237d = iArr;
        this.f8238e = i4;
        this.f8239f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = O3.l.D(parcel, 20293);
        O3.l.z(parcel, 1, this.f8234a, i4);
        O3.l.G(parcel, 2, 4);
        parcel.writeInt(this.f8235b ? 1 : 0);
        O3.l.G(parcel, 3, 4);
        parcel.writeInt(this.f8236c ? 1 : 0);
        int[] iArr = this.f8237d;
        if (iArr != null) {
            int D4 = O3.l.D(parcel, 4);
            parcel.writeIntArray(iArr);
            O3.l.F(parcel, D4);
        }
        O3.l.G(parcel, 5, 4);
        parcel.writeInt(this.f8238e);
        int[] iArr2 = this.f8239f;
        if (iArr2 != null) {
            int D5 = O3.l.D(parcel, 6);
            parcel.writeIntArray(iArr2);
            O3.l.F(parcel, D5);
        }
        O3.l.F(parcel, D3);
    }
}
