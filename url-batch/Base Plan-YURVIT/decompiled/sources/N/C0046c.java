package N;

import java.util.ArrayList;

/* renamed from: N.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046c extends u {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f703e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f704f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f705g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f706h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f707i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f708j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f709k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f710l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f711m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f712n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f713o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // N.u
    public final void a() {
        ArrayList arrayList = this.f707i;
        ArrayList arrayList2 = this.f708j;
        ArrayList arrayList3 = this.f704f;
        ArrayList arrayList4 = this.f709k;
        ArrayList arrayList5 = this.f706h;
        ArrayList arrayList6 = this.f703e;
        ArrayList arrayList7 = this.f705g;
        int size = arrayList7.size() - 1;
        if (size >= 0) {
            L.d.h(arrayList7.get(size));
            throw null;
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            if (arrayList6.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f768a != null) {
                throw null;
            }
            arrayList6.remove(size2);
        }
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        int size4 = arrayList5.size() - 1;
        if (size4 >= 0) {
            L.d.h(arrayList5.get(size4));
            throw null;
        }
        arrayList5.clear();
        if (b()) {
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList2.get(size5);
                int size6 = arrayList8.size() - 1;
                if (size6 >= 0) {
                    L.d.h(arrayList8.get(size6));
                    throw null;
                }
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList.get(size7);
                int size8 = arrayList9.size() - 1;
                if (size8 >= 0) {
                    arrayList9.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            for (int size9 = arrayList4.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList4.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    L.d.h(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f712n);
            c(this.f711m);
            c(this.f710l);
            c(this.f713o);
            ArrayList arrayList11 = this.f769b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // N.u
    public final boolean b() {
        return (this.f704f.isEmpty() && this.f706h.isEmpty() && this.f705g.isEmpty() && this.f703e.isEmpty() && this.f711m.isEmpty() && this.f712n.isEmpty() && this.f710l.isEmpty() && this.f713o.isEmpty() && this.f708j.isEmpty() && this.f707i.isEmpty() && this.f709k.isEmpty()) ? false : true;
    }
}
