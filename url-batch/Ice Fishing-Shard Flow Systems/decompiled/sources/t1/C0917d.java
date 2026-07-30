package t1;

import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* renamed from: t1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917d extends AbstractC0943a {
    public static final Parcelable.Creator<C0917d> CREATOR = new C0907D(1);

    /* renamed from: d, reason: collision with root package name */
    public final C0922i f7925d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7926e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7927i;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f7928l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7929m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f7930n;

    public C0917d(C0922i c0922i, boolean z7, boolean z8, int[] iArr, int i2, int[] iArr2) {
        this.f7925d = c0922i;
        this.f7926e = z7;
        this.f7927i = z8;
        this.f7928l = iArr;
        this.f7929m = i2;
        this.f7930n = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.J(parcel, 1, this.f7925d, i2);
        AbstractC1053a.P(parcel, 2, 4);
        parcel.writeInt(this.f7926e ? 1 : 0);
        AbstractC1053a.P(parcel, 3, 4);
        parcel.writeInt(this.f7927i ? 1 : 0);
        int[] iArr = this.f7928l;
        if (iArr != null) {
            int Q4 = AbstractC1053a.Q(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC1053a.S(parcel, Q4);
        }
        AbstractC1053a.P(parcel, 5, 4);
        parcel.writeInt(this.f7929m);
        int[] iArr2 = this.f7930n;
        if (iArr2 != null) {
            int Q7 = AbstractC1053a.Q(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC1053a.S(parcel, Q7);
        }
        AbstractC1053a.S(parcel, Q);
    }
}
