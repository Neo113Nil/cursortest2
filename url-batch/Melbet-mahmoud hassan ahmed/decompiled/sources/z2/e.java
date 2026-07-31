package z2;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c4.w0;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z6 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 2:
                    str = s3.b.f(parcel, o7);
                    break;
                case 3:
                    str2 = s3.b.f(parcel, o7);
                    break;
                case 4:
                    str3 = s3.b.f(parcel, o7);
                    break;
                case 5:
                    str4 = s3.b.f(parcel, o7);
                    break;
                case 6:
                    str5 = s3.b.f(parcel, o7);
                    break;
                case w0.f2149o /* 7 */:
                    str6 = s3.b.f(parcel, o7);
                    break;
                case w0.f2150p /* 8 */:
                    str7 = s3.b.f(parcel, o7);
                    break;
                case 9:
                    intent = (Intent) s3.b.e(parcel, o7, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = s3.b.p(parcel, o7);
                    break;
                case 11:
                    z6 = s3.b.m(parcel, o7);
                    break;
                default:
                    s3.b.t(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new f(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i7) {
        return new f[i7];
    }
}
