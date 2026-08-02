package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cie extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(16);
    public final cid a;
    public final List b;

    public cie(cid cidVar, List list) {
        this.a = cidVar;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cid cidVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, cidVar, i);
        oy.K(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
