package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crg extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(6);
    public final int a;
    public List b;

    public crg(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.M(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
