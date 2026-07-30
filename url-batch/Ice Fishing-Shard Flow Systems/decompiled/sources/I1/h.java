package I1;

import android.os.Parcel;
import android.os.Parcelable;
import t1.r;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class h extends AbstractC0943a {
    public static final Parcelable.Creator<h> CREATOR = new c(2);

    /* renamed from: d, reason: collision with root package name */
    public final int f1274d;

    /* renamed from: e, reason: collision with root package name */
    public final q1.b f1275e;

    /* renamed from: i, reason: collision with root package name */
    public final r f1276i;

    public h(int i2, q1.b bVar, r rVar) {
        this.f1274d = i2;
        this.f1275e = bVar;
        this.f1276i = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f1274d);
        AbstractC1053a.J(parcel, 2, this.f1275e, i2);
        AbstractC1053a.J(parcel, 3, this.f1276i, i2);
        AbstractC1053a.S(parcel, Q);
    }
}
