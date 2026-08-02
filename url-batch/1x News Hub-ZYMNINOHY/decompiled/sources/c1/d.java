package c1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends O0.a {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.session.b(4);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2624b;

    public d(ArrayList arrayList, String str) {
        this.f2623a = arrayList;
        this.f2624b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        ArrayList arrayList = this.f2623a;
        if (arrayList != null) {
            int S3 = C2.b.S(parcel, 1);
            parcel.writeStringList(arrayList);
            C2.b.T(parcel, S3);
        }
        C2.b.O(parcel, 2, this.f2624b);
        C2.b.T(parcel, S2);
    }
}
