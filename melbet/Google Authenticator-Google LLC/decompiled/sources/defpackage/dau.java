package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dau extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(11);
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final daw f;
    private final List g;
    private List h;

    public dau(String str, Long l, List list, String str2, Long l2, Long l3, daw dawVar) {
        this.a = str;
        this.b = l;
        this.g = list;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = dawVar;
    }

    public final List a() {
        List list;
        if (this.h == null && (list = this.g) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((dbd) it.next());
            }
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dau)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dau dauVar = (dau) obj;
        return Objects.equals(this.a, dauVar.a) && Objects.equals(this.b, dauVar.b) && Objects.equals(a(), dauVar.a()) && Objects.equals(this.c, dauVar.c) && Objects.equals(this.d, dauVar.d) && Objects.equals(this.e, dauVar.e) && Objects.equals(this.f, dauVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, a(), this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, str);
        oy.M(parcel, 3, a());
        oy.I(parcel, 4, this.c);
        oy.G(parcel, 5, this.d);
        oy.G(parcel, 6, this.e);
        oy.G(parcel, 7, this.b);
        oy.H(parcel, 8, this.f, i);
        oy.r(parcel, q);
    }
}
