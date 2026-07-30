package t1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* renamed from: t1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923j extends AbstractC0943a {
    public static final Parcelable.Creator<C0923j> CREATOR = new I1.c(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f7964d;

    /* renamed from: e, reason: collision with root package name */
    public List f7965e;

    public C0923j(int i2, List list) {
        this.f7964d = i2;
        this.f7965e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f7964d);
        AbstractC1053a.M(parcel, 2, this.f7965e);
        AbstractC1053a.S(parcel, Q);
    }
}
