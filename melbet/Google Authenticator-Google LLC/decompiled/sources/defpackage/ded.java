package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ded extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(20);
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;

    public ded(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, this.a);
        oy.s(parcel, 3, this.b);
        oy.K(parcel, 4, this.c);
        oy.v(parcel, 5, this.d);
        oy.I(parcel, 6, this.e);
        oy.s(parcel, 7, this.f);
        oy.r(parcel, q);
    }
}
