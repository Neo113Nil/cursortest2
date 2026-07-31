package z2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f9155f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f9156a;

    /* renamed from: b, reason: collision with root package name */
    public int f9157b;

    /* renamed from: c, reason: collision with root package name */
    public int f9158c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f9159d;

    /* renamed from: e, reason: collision with root package name */
    public int f9160e;

    public final void a(ArrayList arrayList) {
        int size = this.f9156a.size();
        if (this.f9160e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.f9160e == nVar.f9157b) {
                    c(this.f9158c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(w2.c cVar, int i) {
        int n6;
        int n7;
        ArrayList arrayList = this.f9156a;
        if (arrayList.size() == 0) {
            return 0;
        }
        y2.e eVar = (y2.e) ((y2.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            ((y2.d) arrayList.get(i8)).b(cVar, false);
        }
        if (i == 0 && eVar.f8797z0 > 0) {
            y2.j.a(eVar, cVar, arrayList, 0);
        }
        if (i == 1 && eVar.A0 > 0) {
            y2.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e8) {
            System.err.println(e8.toString() + "\n" + Arrays.toString(e8.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f9159d = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            y2.d dVar = (y2.d) arrayList.get(i9);
            p.b bVar = new p.b(20);
            new WeakReference(dVar);
            w2.c.n(dVar.I);
            w2.c.n(dVar.J);
            w2.c.n(dVar.K);
            w2.c.n(dVar.L);
            w2.c.n(dVar.M);
            this.f9159d.add(bVar);
        }
        if (i == 0) {
            n6 = w2.c.n(eVar.I);
            n7 = w2.c.n(eVar.K);
            cVar.t();
        } else {
            n6 = w2.c.n(eVar.J);
            n7 = w2.c.n(eVar.L);
            cVar.t();
        }
        return n7 - n6;
    }

    public final void c(int i, n nVar) {
        int i8 = nVar.f9157b;
        ArrayList arrayList = this.f9156a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            y2.d dVar = (y2.d) obj;
            ArrayList arrayList2 = nVar.f9156a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i == 0) {
                dVar.f8773n0 = i8;
            } else {
                dVar.f8775o0 = i8;
            }
        }
        this.f9160e = i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f9158c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f9157b);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.f9156a;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            sb2 = sb2 + " " + ((y2.d) obj).f8762h0;
        }
        return sb2 + " >";
    }
}
