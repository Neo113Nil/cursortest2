package i1;

import I.j;
import a.AbstractC0219a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends V0.a {
    public static final Parcelable.Creator<f> CREATOR = new j(17);

    /* renamed from: f, reason: collision with root package name */
    public final List f4424f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4425g;

    public f(String str, ArrayList arrayList) {
        this.f4424f = arrayList;
        this.f4425g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        List<String> list = this.f4424f;
        if (list != null) {
            int O7 = AbstractC0219a.O(parcel, 1);
            parcel.writeStringList(list);
            AbstractC0219a.Q(parcel, O7);
        }
        AbstractC0219a.J(parcel, 2, this.f4425g);
        AbstractC0219a.Q(parcel, O6);
    }
}
