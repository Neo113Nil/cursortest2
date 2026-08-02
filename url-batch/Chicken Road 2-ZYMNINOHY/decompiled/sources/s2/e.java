package s2;

import O3.l;
import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends AbstractC0408a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final List f15235a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15236b;

    public e(ArrayList arrayList, String str) {
        this.f15235a = arrayList;
        this.f15236b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        List<String> list = this.f15235a;
        if (list != null) {
            int D4 = l.D(parcel, 1);
            parcel.writeStringList(list);
            l.F(parcel, D4);
        }
        l.A(parcel, 2, this.f15236b);
        l.F(parcel, D3);
    }
}
