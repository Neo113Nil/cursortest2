package g0;

import java.util.ArrayList;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422b extends AbstractC0439s {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4894e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f4895f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f4896g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4897h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f4898i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f4899k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f4900l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4901m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4902n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4903o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size >= 0) {
            throw C4.p.f(arrayList, size);
        }
    }

    @Override // g0.AbstractC0439s
    public final void a() {
        ArrayList arrayList = this.f4898i;
        ArrayList arrayList2 = this.j;
        ArrayList arrayList3 = this.f4895f;
        ArrayList arrayList4 = this.f4899k;
        ArrayList arrayList5 = this.f4897h;
        ArrayList arrayList6 = this.f4894e;
        ArrayList arrayList7 = this.f4896g;
        int size = arrayList7.size() - 1;
        if (size >= 0) {
            C4.p.o(arrayList7.get(size));
            throw null;
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            if (arrayList6.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f4958a != null) {
                throw null;
            }
            arrayList6.remove(size2);
        }
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            throw C4.p.f(arrayList3, size3);
        }
        int size4 = arrayList5.size() - 1;
        if (size4 >= 0) {
            C4.p.o(arrayList5.get(size4));
            throw null;
        }
        arrayList5.clear();
        if (b()) {
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList2.get(size5);
                int size6 = arrayList8.size() - 1;
                if (size6 >= 0) {
                    C4.p.o(arrayList8.get(size6));
                    throw null;
                }
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList.get(size7);
                int size8 = arrayList9.size() - 1;
                if (size8 >= 0) {
                    throw C4.p.f(arrayList9, size8);
                }
            }
            for (int size9 = arrayList4.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList4.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    C4.p.o(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f4902n);
            c(this.f4901m);
            c(this.f4900l);
            c(this.f4903o);
            ArrayList arrayList11 = this.f4959b;
            if (arrayList11.size() > 0) {
                throw C4.p.f(arrayList11, 0);
            }
            arrayList11.clear();
        }
    }

    @Override // g0.AbstractC0439s
    public final boolean b() {
        return (this.f4895f.isEmpty() && this.f4897h.isEmpty() && this.f4896g.isEmpty() && this.f4894e.isEmpty() && this.f4901m.isEmpty() && this.f4902n.isEmpty() && this.f4900l.isEmpty() && this.f4903o.isEmpty() && this.j.isEmpty() && this.f4898i.isEmpty() && this.f4899k.isEmpty()) ? false : true;
    }
}
