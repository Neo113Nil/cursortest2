package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dct extends cri implements cnc {
    public static final Parcelable.Creator CREATOR = new dbh(13);
    public final List a;
    public final String b;

    public dct(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.cnc
    public final Status b() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int q = oy.q(parcel, 20293);
        oy.K(parcel, 1, list);
        oy.I(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
