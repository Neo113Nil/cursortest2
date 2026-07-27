package W;

import b2.AbstractC0279e;
import java.util.ArrayList;

/* renamed from: W.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158c extends s {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3300e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3301f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3302g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3303h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3304i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3305j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3306k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3307l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3308m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3309n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3310o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // W.s
    public final void a() {
        ArrayList arrayList = this.f3302g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            AbstractC0279e.o(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f3300e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f3363a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f3301f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList4 = this.f3303h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            AbstractC0279e.o(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.f3305j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    AbstractC0279e.o(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f3304i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList9 = this.f3306k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    AbstractC0279e.o(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f3309n);
            c(this.f3308m);
            c(this.f3307l);
            c(this.f3310o);
            ArrayList arrayList11 = this.f3364b;
            if (arrayList11.size() > 0) {
                AbstractC0279e.o(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // W.s
    public final boolean b() {
        return (this.f3301f.isEmpty() && this.f3303h.isEmpty() && this.f3302g.isEmpty() && this.f3300e.isEmpty() && this.f3308m.isEmpty() && this.f3309n.isEmpty() && this.f3307l.isEmpty() && this.f3310o.isEmpty() && this.f3305j.isEmpty() && this.f3304i.isEmpty() && this.f3306k.isEmpty()) ? false : true;
    }
}
