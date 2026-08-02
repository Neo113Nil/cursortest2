package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chz extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(12);
    public final List a;
    public final List b;

    public chz(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int q = oy.q(parcel, 20293);
        oy.M(parcel, 1, list);
        oy.M(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
