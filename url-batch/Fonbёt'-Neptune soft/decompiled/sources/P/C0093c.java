package P;

import java.util.ArrayList;

/* renamed from: P.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093c extends t {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f880e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f881f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f882g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f883h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f884i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f885j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f886k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f887l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f888m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f889n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f890o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // P.t
    public final void a() {
        ArrayList arrayList = this.f882g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            A0.b.h(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f880e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f942a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f881f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList4 = this.f883h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            A0.b.h(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.f885j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    A0.b.h(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f884i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList9 = this.f886k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    A0.b.h(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f889n);
            c(this.f888m);
            c(this.f887l);
            c(this.f890o);
            ArrayList arrayList11 = this.f943b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // P.t
    public final boolean b() {
        return (this.f881f.isEmpty() && this.f883h.isEmpty() && this.f882g.isEmpty() && this.f880e.isEmpty() && this.f888m.isEmpty() && this.f889n.isEmpty() && this.f887l.isEmpty() && this.f890o.isEmpty() && this.f885j.isEmpty() && this.f884i.isEmpty() && this.f886k.isEmpty()) ? false : true;
    }
}
