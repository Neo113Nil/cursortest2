package r3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x0 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        q qVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z6 = false;
        boolean z7 = false;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    qVar = (q) s3.b.e(parcel, o7, q.CREATOR);
                    break;
                case 2:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 3:
                    z7 = s3.b.m(parcel, o7);
                    break;
                case 4:
                    iArr = s3.b.c(parcel, o7);
                    break;
                case 5:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case 6:
                    iArr2 = s3.b.c(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new e(qVar, z6, z7, iArr, i7, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e[] newArray(int i7) {
        return new e[i7];
    }
}
