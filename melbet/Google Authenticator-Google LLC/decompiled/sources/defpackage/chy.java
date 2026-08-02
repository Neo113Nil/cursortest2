package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chy extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(11);
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public chy(String str, List list, List list2, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = z2;
    }

    public static ggb a() {
        ggb ggbVar = new ggb();
        ggbVar.j(false);
        ggbVar.a = (byte) (ggbVar.a | 2);
        return ggbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.K(parcel, 2, this.b);
        oy.K(parcel, 3, this.c);
        oy.s(parcel, 4, this.d);
        oy.s(parcel, 5, this.e);
        oy.r(parcel, q);
    }
}
