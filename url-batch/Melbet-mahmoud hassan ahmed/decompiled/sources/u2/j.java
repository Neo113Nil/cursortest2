package u2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        boolean z6 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                z6 = s3.b.m(parcel, o7);
            } else if (l7 != 2) {
                s3.b.t(parcel, o7);
            } else {
                iBinder = s3.b.p(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new a(z6, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i7) {
        return new a[i7];
    }
}
