package y2;

import android.os.Parcel;
import android.os.Parcelable;
import c4.w0;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        float f7 = 0.0f;
        int i7 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 2:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 3:
                    z7 = s3.b.m(parcel, o7);
                    break;
                case 4:
                    str = s3.b.f(parcel, o7);
                    break;
                case 5:
                    z8 = s3.b.m(parcel, o7);
                    break;
                case 6:
                    f7 = s3.b.n(parcel, o7);
                    break;
                case w0.f2149o /* 7 */:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case w0.f2150p /* 8 */:
                    z9 = s3.b.m(parcel, o7);
                    break;
                case 9:
                    z10 = s3.b.m(parcel, o7);
                    break;
                case 10:
                    z11 = s3.b.m(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new j(z6, z7, str, z8, f7, i7, z9, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i7) {
        return new j[i7];
    }
}
