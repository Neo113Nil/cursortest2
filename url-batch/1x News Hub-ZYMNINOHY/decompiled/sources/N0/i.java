package N0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends O0.a {
    public static final Parcelable.Creator<i> CREATOR = new H.h(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f1032a;

    /* renamed from: b, reason: collision with root package name */
    public List f1033b;

    public i(int i3, List list) {
        this.f1032a = i3;
        this.f1033b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f1032a);
        C2.b.Q(parcel, 2, this.f1033b);
        C2.b.T(parcel, S2);
    }
}
