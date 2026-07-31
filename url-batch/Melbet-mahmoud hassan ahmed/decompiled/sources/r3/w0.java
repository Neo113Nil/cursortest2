package r3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w0 implements Parcelable.Creator<v0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ v0 createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        Bundle bundle = null;
        o3.d[] dVarArr = null;
        e eVar = null;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                bundle = s3.b.a(parcel, o7);
            } else if (l7 == 2) {
                dVarArr = (o3.d[]) s3.b.i(parcel, o7, o3.d.CREATOR);
            } else if (l7 == 3) {
                i7 = s3.b.q(parcel, o7);
            } else if (l7 != 4) {
                s3.b.t(parcel, o7);
            } else {
                eVar = (e) s3.b.e(parcel, o7, e.CREATOR);
            }
        }
        s3.b.k(parcel, u6);
        return new v0(bundle, dVarArr, i7, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ v0[] newArray(int i7) {
        return new v0[i7];
    }
}
