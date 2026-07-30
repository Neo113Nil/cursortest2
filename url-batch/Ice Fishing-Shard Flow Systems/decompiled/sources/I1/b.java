package I1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class b extends AbstractC0943a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);

    /* renamed from: d, reason: collision with root package name */
    public final int f1268d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1269e;

    /* renamed from: i, reason: collision with root package name */
    public final Intent f1270i;

    public b(int i2, int i5, Intent intent) {
        this.f1268d = i2;
        this.f1269e = i5;
        this.f1270i = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f1268d);
        AbstractC1053a.P(parcel, 2, 4);
        parcel.writeInt(this.f1269e);
        AbstractC1053a.J(parcel, 3, this.f1270i, i2);
        AbstractC1053a.S(parcel, Q);
    }
}
