package r3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        String str2 = null;
        long j7 = 0;
        long j8 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case 2:
                    i8 = s3.b.q(parcel, o7);
                    break;
                case 3:
                    i9 = s3.b.q(parcel, o7);
                    break;
                case 4:
                    j7 = s3.b.r(parcel, o7);
                    break;
                case 5:
                    j8 = s3.b.r(parcel, o7);
                    break;
                case 6:
                    str = s3.b.f(parcel, o7);
                    break;
                case c4.w0.f2149o /* 7 */:
                    str2 = s3.b.f(parcel, o7);
                    break;
                case c4.w0.f2150p /* 8 */:
                    i10 = s3.b.q(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new m(i7, i8, i9, j7, j8, str, str2, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m[] newArray(int i7) {
        return new m[i7];
    }
}
