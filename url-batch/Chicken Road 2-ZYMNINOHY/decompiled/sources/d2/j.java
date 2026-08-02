package d2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends AbstractC0408a {
    public static final Parcelable.Creator<j> CREATOR = new H.h(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f8274a;

    /* renamed from: b, reason: collision with root package name */
    public List f8275b;

    public j(int i4, List list) {
        this.f8274a = i4;
        this.f8275b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = O3.l.D(parcel, 20293);
        O3.l.G(parcel, 1, 4);
        parcel.writeInt(this.f8274a);
        O3.l.C(parcel, 2, this.f8275b);
        O3.l.F(parcel, D3);
    }
}
