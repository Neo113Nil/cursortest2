package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        o3.b bVar = null;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            int l7 = s3.b.l(o7);
            if (l7 == 1) {
                i8 = s3.b.q(parcel, o7);
            } else if (l7 == 2) {
                str = s3.b.f(parcel, o7);
            } else if (l7 == 3) {
                pendingIntent = (PendingIntent) s3.b.e(parcel, o7, PendingIntent.CREATOR);
            } else if (l7 == 4) {
                bVar = (o3.b) s3.b.e(parcel, o7, o3.b.CREATOR);
            } else if (l7 != 1000) {
                s3.b.t(parcel, o7);
            } else {
                i7 = s3.b.q(parcel, o7);
            }
        }
        s3.b.k(parcel, u6);
        return new Status(i7, i8, str, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status[] newArray(int i7) {
        return new Status[i7];
    }
}
