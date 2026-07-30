package I1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class g extends AbstractC0943a {
    public static final Parcelable.Creator<g> CREATOR = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public final List f1272d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1273e;

    public g(String str, ArrayList arrayList) {
        this.f1272d = arrayList;
        this.f1273e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        List<String> list = this.f1272d;
        if (list != null) {
            int Q4 = AbstractC1053a.Q(parcel, 1);
            parcel.writeStringList(list);
            AbstractC1053a.S(parcel, Q4);
        }
        AbstractC1053a.K(parcel, 2, this.f1273e);
        AbstractC1053a.S(parcel, Q);
    }
}
