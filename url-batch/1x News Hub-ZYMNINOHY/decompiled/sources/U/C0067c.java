package U;

import E1.AbstractC0033i;
import java.util.ArrayList;

/* renamed from: U.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067c extends t {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1391e;
    public ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1392g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1393h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f1394i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f1395j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f1396k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1397l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1398m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1399n;
    public ArrayList o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // U.t
    public final void a() {
        ArrayList arrayList = this.f1392g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            AbstractC0033i.p(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f1391e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f1447a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList4 = this.f1393h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            AbstractC0033i.p(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.f1395j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    AbstractC0033i.p(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f1394i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList9 = this.f1396k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    AbstractC0033i.p(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f1399n);
            c(this.f1398m);
            c(this.f1397l);
            c(this.o);
            ArrayList arrayList11 = this.f1448b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // U.t
    public final boolean b() {
        return (this.f.isEmpty() && this.f1393h.isEmpty() && this.f1392g.isEmpty() && this.f1391e.isEmpty() && this.f1398m.isEmpty() && this.f1399n.isEmpty() && this.f1397l.isEmpty() && this.o.isEmpty() && this.f1395j.isEmpty() && this.f1394i.isEmpty() && this.f1396k.isEmpty()) ? false : true;
    }
}
