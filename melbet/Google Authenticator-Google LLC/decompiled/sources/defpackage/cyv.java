package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyv extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(12);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final List f;
    private final List g;

    public cyv(boolean z, boolean z2, List list, List list2, String str, boolean z3, List list3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.e = list;
        this.f = list2;
        this.d = z3;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyv)) {
            return false;
        }
        cyv cyvVar = (cyv) obj;
        return this.a == cyvVar.a && this.b == cyvVar.b && Objects.equals(this.f, cyvVar.f) && Objects.equals(this.e, cyvVar.e) && Objects.equals(this.c, cyvVar.c) && this.d == cyvVar.d && Objects.equals(this.g, cyvVar.g);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.e, this.f, this.c, Boolean.valueOf(this.d), this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hel o;
        boolean z = this.a;
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 1, z);
        oy.s(parcel, 2, this.b);
        List list = this.e;
        if (list == null) {
            int i2 = hel.d;
            o = his.a;
        } else {
            o = hel.o(list);
        }
        oy.M(parcel, 3, o);
        List list2 = this.f;
        oy.M(parcel, 4, list2 == null ? his.a : hel.o(list2));
        oy.I(parcel, 5, this.c);
        oy.s(parcel, 6, this.d);
        List list3 = this.g;
        oy.M(parcel, 7, list3 == null ? his.a : hel.o(list3));
        oy.r(parcel, q);
    }
}
