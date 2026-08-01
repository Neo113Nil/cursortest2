package t;

import androidx.fragment.app.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3349f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3350a;

    /* renamed from: b, reason: collision with root package name */
    public int f3351b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3352d;

    /* renamed from: e, reason: collision with root package name */
    public int f3353e;

    public final void a(ArrayList arrayList) {
        int size = this.f3350a.size();
        if (this.f3353e != -1 && size > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                n nVar = (n) arrayList.get(i4);
                if (this.f3353e == nVar.f3351b) {
                    c(this.c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(q.c cVar, int i4) {
        int n3;
        int n4;
        ArrayList arrayList = this.f3350a;
        if (arrayList.size() == 0) {
            return 0;
        }
        s.e eVar = (s.e) ((s.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ((s.d) arrayList.get(i5)).b(cVar, false);
        }
        if (i4 == 0 && eVar.f3279z0 > 0) {
            s.j.a(eVar, cVar, arrayList, 0);
        }
        if (i4 == 1 && eVar.A0 > 0) {
            s.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e4) {
            System.err.println(e4.toString() + "\n" + Arrays.toString(e4.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f3352d = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            s.d dVar = (s.d) arrayList.get(i6);
            g2.f fVar = new g2.f(23);
            new WeakReference(dVar);
            q.c.n(dVar.I);
            q.c.n(dVar.J);
            q.c.n(dVar.K);
            q.c.n(dVar.L);
            q.c.n(dVar.M);
            this.f3352d.add(fVar);
        }
        if (i4 == 0) {
            n3 = q.c.n(eVar.I);
            n4 = q.c.n(eVar.K);
            cVar.t();
        } else {
            n3 = q.c.n(eVar.J);
            n4 = q.c.n(eVar.L);
            cVar.t();
        }
        return n4 - n3;
    }

    public final void c(int i4, n nVar) {
        int i5 = nVar.f3351b;
        ArrayList arrayList = this.f3350a;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            s.d dVar = (s.d) obj;
            ArrayList arrayList2 = nVar.f3350a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i4 == 0) {
                dVar.f3255n0 = i5;
            } else {
                dVar.f3257o0 = i5;
            }
        }
        this.f3353e = i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i4 = this.c;
        sb.append(i4 == 0 ? "Horizontal" : i4 == 1 ? "Vertical" : i4 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3351b);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.f3350a;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            sb2 = sb2 + " " + ((s.d) obj).f3243h0;
        }
        return w0.f(sb2, " >");
    }
}
