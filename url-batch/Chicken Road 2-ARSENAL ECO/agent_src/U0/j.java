package U0;

import a.AbstractC0219a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends V0.a {
    public static final Parcelable.Creator<j> CREATOR = new I.j(6);

    /* renamed from: f, reason: collision with root package name */
    public final int f2547f;

    /* renamed from: g, reason: collision with root package name */
    public List f2548g;

    public j(int i7, List list) {
        this.f2547f = i7;
        this.f2548g = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f2547f);
        AbstractC0219a.L(parcel, 2, this.f2548g);
        AbstractC0219a.Q(parcel, O6);
    }
}
