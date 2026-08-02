package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cif extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(17);
    public final Long a;
    public final List b;

    public cif(Long l, List list) {
        this.a = l;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int q = oy.q(parcel, 20293);
        oy.G(parcel, 1, l);
        oy.K(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
