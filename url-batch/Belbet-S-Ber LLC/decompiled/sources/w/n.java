package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3766f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3767a;

    /* renamed from: b, reason: collision with root package name */
    public int f3768b;

    /* renamed from: c, reason: collision with root package name */
    public int f3769c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3770e;

    public final void a(ArrayList arrayList) {
        int size = this.f3767a.size();
        if (this.f3770e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.f3770e == nVar.f3768b) {
                    c(this.f3769c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(t.c cVar, int i) {
        int n4;
        int n5;
        ArrayList arrayList = this.f3767a;
        if (arrayList.size() == 0) {
            return 0;
        }
        v.e eVar = (v.e) ((v.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((v.d) arrayList.get(i4)).b(cVar, false);
        }
        if (i == 0 && eVar.f3657z0 > 0) {
            v.j.a(eVar, cVar, arrayList, 0);
        }
        if (i == 1 && eVar.A0 > 0) {
            v.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e4) {
            System.err.println(e4.toString() + "\n" + Arrays.toString(e4.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            v.d dVar = (v.d) arrayList.get(i5);
            o2.f fVar = new o2.f(29);
            new WeakReference(dVar);
            t.c.n(dVar.I);
            t.c.n(dVar.J);
            t.c.n(dVar.K);
            t.c.n(dVar.L);
            t.c.n(dVar.M);
            this.d.add(fVar);
        }
        if (i == 0) {
            n4 = t.c.n(eVar.I);
            n5 = t.c.n(eVar.K);
            cVar.t();
        } else {
            n4 = t.c.n(eVar.J);
            n5 = t.c.n(eVar.L);
            cVar.t();
        }
        return n5 - n4;
    }

    public final void c(int i, n nVar) {
        int i4 = nVar.f3768b;
        ArrayList arrayList = this.f3767a;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            v.d dVar = (v.d) obj;
            ArrayList arrayList2 = nVar.f3767a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i == 0) {
                dVar.f3633n0 = i4;
            } else {
                dVar.f3635o0 = i4;
            }
        }
        this.f3770e = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3769c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3768b);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.f3767a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb2 = sb2 + " " + ((v.d) obj).f3623h0;
        }
        return a4.b.g(sb2, " >");
    }
}
