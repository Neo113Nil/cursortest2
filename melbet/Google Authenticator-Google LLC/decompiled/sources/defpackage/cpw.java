package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpw extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(20);
    public final cre a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public cpw(cre creVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = creVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cre creVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, creVar, i);
        oy.s(parcel, 2, this.b);
        oy.s(parcel, 3, this.c);
        oy.D(parcel, 4, this.d);
        oy.v(parcel, 5, this.e);
        oy.D(parcel, 6, this.f);
        oy.r(parcel, q);
    }
}
