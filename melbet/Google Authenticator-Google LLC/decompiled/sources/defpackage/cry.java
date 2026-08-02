package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cry extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(8);
    public final PendingIntent a;

    public cry(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, pendingIntent, i);
        oy.r(parcel, q);
    }
}
