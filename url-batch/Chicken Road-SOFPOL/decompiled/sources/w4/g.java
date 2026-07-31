package w4;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f7911g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f7912h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f7913j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f7914k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f7915l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f7916m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f7917n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f7918o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f7919p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f7920q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f7921r;

    public static void e(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((p0) arrayList.get(size)).getClass();
        throw null;
    }

    @Override // w4.a0
    public final void b(p0 p0Var) {
        p0Var.getClass();
        throw null;
    }

    @Override // w4.a0
    public final void c() {
        ArrayList arrayList = this.f7917n;
        ArrayList arrayList2 = this.f7915l;
        ArrayList arrayList3 = this.f7916m;
        ArrayList arrayList4 = this.f7914k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.f7912h;
        ArrayList arrayList7 = this.f7913j;
        int size = arrayList7.size() - 1;
        if (size >= 0) {
            ((f) arrayList7.get(size)).getClass();
            throw null;
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            a((p0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size() - 1;
        if (size3 >= 0) {
            ((p0) arrayList5.get(size3)).getClass();
            throw null;
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ((e) arrayList4.get(size4)).getClass();
        }
        arrayList4.clear();
        if (d()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                int size6 = arrayList8.size() - 1;
                if (size6 >= 0) {
                    ((f) arrayList8.get(size6)).getClass();
                    throw null;
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                int size8 = arrayList9.size() - 1;
                if (size8 >= 0) {
                    ((p0) arrayList9.get(size8)).getClass();
                    throw null;
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ((e) arrayList10.get(size10)).getClass();
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            e(this.f7920q);
            e(this.f7919p);
            e(this.f7918o);
            e(this.f7921r);
            ArrayList arrayList11 = this.f7879b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // w4.a0
    public final boolean d() {
        return (this.i.isEmpty() && this.f7914k.isEmpty() && this.f7913j.isEmpty() && this.f7912h.isEmpty() && this.f7919p.isEmpty() && this.f7920q.isEmpty() && this.f7918o.isEmpty() && this.f7921r.isEmpty() && this.f7916m.isEmpty() && this.f7915l.isEmpty() && this.f7917n.isEmpty()) ? false : true;
    }

    public final void f() {
        if (d()) {
            return;
        }
        ArrayList arrayList = this.f7879b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void g(ArrayList arrayList, p0 p0Var) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((e) arrayList.get(size)).getClass();
        p0Var.getClass();
        throw null;
    }
}
