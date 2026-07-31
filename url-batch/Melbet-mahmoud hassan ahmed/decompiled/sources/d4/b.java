package d4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c4.w0;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<s0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        long j7 = 0;
        long j8 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z6 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    j7 = s3.b.r(parcel, o7);
                    break;
                case 2:
                    j8 = s3.b.r(parcel, o7);
                    break;
                case 3:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 4:
                    str = s3.b.f(parcel, o7);
                    break;
                case 5:
                    str2 = s3.b.f(parcel, o7);
                    break;
                case 6:
                    str3 = s3.b.f(parcel, o7);
                    break;
                case w0.f2149o /* 7 */:
                    bundle = s3.b.a(parcel, o7);
                    break;
                case w0.f2150p /* 8 */:
                    str4 = s3.b.f(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new s0(j7, j8, z6, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s0[] newArray(int i7) {
        return new s0[i7];
    }
}
