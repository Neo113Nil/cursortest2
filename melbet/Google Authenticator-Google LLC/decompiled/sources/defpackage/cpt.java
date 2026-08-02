package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpt extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(18);
    public List a;

    public cpt(List list) {
        this.a = list;
    }

    public final List a() {
        List list = this.a;
        if (list != null) {
            return list;
        }
        int i = hel.d;
        return his.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.M(parcel, 1, a());
        oy.r(parcel, q);
    }
}
