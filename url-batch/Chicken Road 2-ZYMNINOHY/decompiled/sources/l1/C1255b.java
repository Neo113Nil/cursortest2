package l1;

import E.AbstractC0005f;
import java.util.ArrayList;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1255b extends AbstractC1271r {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f14194e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f14195f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f14196g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f14197h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f14198i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f14199j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f14200k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f14201l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f14202m;
    public ArrayList n;
    public ArrayList o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size >= 0) {
            throw AbstractC0005f.g(size, arrayList);
        }
    }

    @Override // l1.AbstractC1271r
    public final void a() {
        ArrayList arrayList = this.f14198i;
        ArrayList arrayList2 = this.f14199j;
        ArrayList arrayList3 = this.f14195f;
        ArrayList arrayList4 = this.f14200k;
        ArrayList arrayList5 = this.f14197h;
        ArrayList arrayList6 = this.f14194e;
        ArrayList arrayList7 = this.f14196g;
        int size = arrayList7.size() - 1;
        if (size >= 0) {
            AbstractC0005f.x(arrayList7.get(size));
            throw null;
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            if (arrayList6.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f14249a != null) {
                throw null;
            }
            arrayList6.remove(size2);
        }
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            throw AbstractC0005f.g(size3, arrayList3);
        }
        int size4 = arrayList5.size() - 1;
        if (size4 >= 0) {
            AbstractC0005f.x(arrayList5.get(size4));
            throw null;
        }
        arrayList5.clear();
        if (b()) {
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList2.get(size5);
                int size6 = arrayList8.size() - 1;
                if (size6 >= 0) {
                    AbstractC0005f.x(arrayList8.get(size6));
                    throw null;
                }
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList.get(size7);
                int size8 = arrayList9.size() - 1;
                if (size8 >= 0) {
                    throw AbstractC0005f.g(size8, arrayList9);
                }
            }
            for (int size9 = arrayList4.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList4.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    AbstractC0005f.x(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.n);
            c(this.f14202m);
            c(this.f14201l);
            c(this.o);
            ArrayList arrayList11 = this.f14250b;
            if (arrayList11.size() > 0) {
                throw AbstractC0005f.g(0, arrayList11);
            }
            arrayList11.clear();
        }
    }

    @Override // l1.AbstractC1271r
    public final boolean b() {
        return (this.f14195f.isEmpty() && this.f14197h.isEmpty() && this.f14196g.isEmpty() && this.f14194e.isEmpty() && this.f14202m.isEmpty() && this.n.isEmpty() && this.f14201l.isEmpty() && this.o.isEmpty() && this.f14199j.isEmpty() && this.f14198i.isEmpty() && this.f14200k.isEmpty()) ? false : true;
    }
}
