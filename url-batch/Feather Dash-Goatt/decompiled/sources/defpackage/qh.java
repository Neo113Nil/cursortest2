package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qh extends t0 {
    public static final Parcelable.Creator<qh> CREATOR = new g2(16);
    public final Intent d;

    public qh(Intent intent) {
        this.d = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.L(parcel, 1, this.d, i);
        y90.Q(parcel, P);
    }
}
