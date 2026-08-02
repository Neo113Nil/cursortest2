package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dcq extends cri implements cnc {
    public static final Parcelable.Creator CREATOR = new dbh(12);
    final int a;
    public int b;
    public Intent c;

    public dcq(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.cnc
    public final Status b() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.a);
        oy.v(parcel, 2, this.b);
        oy.H(parcel, 3, this.c, i);
        oy.r(parcel, q);
    }

    public dcq() {
        this(2, 0, null);
    }
}
