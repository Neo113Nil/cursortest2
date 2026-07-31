package i4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                arrayList = s3.b.h(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                str = s3.b.f(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h[] newArray(int i7) {
        return new h[i7];
    }
}
