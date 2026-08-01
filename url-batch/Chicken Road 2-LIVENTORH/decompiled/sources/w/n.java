package w;

import androidx.fragment.app.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3544f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3545a;

    /* renamed from: b, reason: collision with root package name */
    public int f3546b;

    /* renamed from: c, reason: collision with root package name */
    public int f3547c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3548e;

    public final void a(ArrayList arrayList) {
        int size = this.f3545a.size();
        if (this.f3548e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.f3548e == nVar.f3546b) {
                    c(this.f3547c, nVar);
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
        ArrayList arrayList = this.f3545a;
        if (arrayList.size() == 0) {
            return 0;
        }
        v.e eVar = (v.e) ((v.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((v.d) arrayList.get(i4)).b(cVar, false);
        }
        if (i == 0 && eVar.f3438z0 > 0) {
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
            l2.f fVar = new l2.f(29);
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
        int i4 = nVar.f3546b;
        ArrayList arrayList = this.f3545a;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            v.d dVar = (v.d) obj;
            ArrayList arrayList2 = nVar.f3545a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i == 0) {
                dVar.f3414n0 = i4;
            } else {
                dVar.f3416o0 = i4;
            }
        }
        this.f3548e = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3547c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3546b);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.f3545a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb2 = sb2 + " " + ((v.d) obj).f3404h0;
        }
        return w0.f(sb2, " >");
    }
}
