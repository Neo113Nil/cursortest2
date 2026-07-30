package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ws1 extends t0 {
    public static final Parcelable.Creator<ws1> CREATOR = new g2(11);
    public final List d;
    public final String e;

    public ws1(String str, ArrayList arrayList) {
        this.d = arrayList;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        List<String> list = this.d;
        if (list != null) {
            int P2 = y90.P(parcel, 1);
            parcel.writeStringList(list);
            y90.Q(parcel, P2);
        }
        y90.M(parcel, 2, this.e);
        y90.Q(parcel, P);
    }
}
