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
public final class daz extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(16);
    public final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;

    public daz(String str, List list, List list2, List list3, List list4, List list5, List list6) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
    }

    public final List a() {
        List list;
        if (this.m == null && (list = this.g) != null) {
            this.m = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.m.add((dbc) it.next());
            }
        }
        return this.m;
    }

    public final List b() {
        List list;
        if (this.l == null && (list = this.f) != null) {
            this.l = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.l.add((dav) it.next());
            }
        }
        return this.l;
    }

    public final List c() {
        List list;
        if (this.j == null && (list = this.d) != null) {
            this.j = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.j.add((dax) it.next());
            }
        }
        return this.j;
    }

    public final List d() {
        List list;
        if (this.h == null && (list = this.b) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((day) it.next());
            }
        }
        return this.h;
    }

    public final List e() {
        List list;
        if (this.k == null && (list = this.e) != null) {
            this.k = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.k.add((dbb) it.next());
            }
        }
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof daz)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        daz dazVar = (daz) obj;
        return Objects.equals(this.a, dazVar.a) && Objects.equals(d(), dazVar.d()) && Objects.equals(f(), dazVar.f()) && Objects.equals(c(), dazVar.c()) && Objects.equals(e(), dazVar.e()) && Objects.equals(b(), dazVar.b()) && Objects.equals(a(), dazVar.a());
    }

    public final List f() {
        List list;
        if (this.i == null && (list = this.c) != null) {
            this.i = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.i.add((dbc) it.next());
            }
        }
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, d(), f(), c(), e(), b(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, str);
        oy.M(parcel, 4, d());
        oy.M(parcel, 5, f());
        oy.M(parcel, 9, b());
        oy.M(parcel, 11, c());
        oy.M(parcel, 13, e());
        oy.M(parcel, 148, a());
        oy.r(parcel, q);
    }
}
