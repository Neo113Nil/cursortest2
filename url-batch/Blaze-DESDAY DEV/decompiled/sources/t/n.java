package t;

import Y.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0288c;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3758f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3759a;

    /* renamed from: b, reason: collision with root package name */
    public int f3760b;

    /* renamed from: c, reason: collision with root package name */
    public int f3761c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3762e;

    public final void a(ArrayList arrayList) {
        int size = this.f3759a.size();
        if (this.f3762e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.f3762e == nVar.f3760b) {
                    c(this.f3761c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0288c c0288c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3759a;
        if (arrayList.size() == 0) {
            return 0;
        }
        s.e eVar = (s.e) ((s.d) arrayList.get(0)).f3593T;
        c0288c.t();
        eVar.b(c0288c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((s.d) arrayList.get(i2)).b(c0288c, false);
        }
        if (i == 0 && eVar.z0 > 0) {
            s.j.a(eVar, c0288c, arrayList, 0);
        }
        if (i == 1 && eVar.f3638A0 > 0) {
            s.j.a(eVar, c0288c, arrayList, 1);
        }
        try {
            c0288c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            s.d dVar = (s.d) arrayList.get(i3);
            J0.e eVar2 = new J0.e(27);
            new WeakReference(dVar);
            C0288c.n(dVar.f3582I);
            C0288c.n(dVar.f3583J);
            C0288c.n(dVar.f3584K);
            C0288c.n(dVar.f3585L);
            C0288c.n(dVar.f3586M);
            this.d.add(eVar2);
        }
        if (i == 0) {
            n2 = C0288c.n(eVar.f3582I);
            n3 = C0288c.n(eVar.f3584K);
            c0288c.t();
        } else {
            n2 = C0288c.n(eVar.f3583J);
            n3 = C0288c.n(eVar.f3585L);
            c0288c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, n nVar) {
        Iterator it = this.f3759a.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            ArrayList arrayList = nVar.f3759a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i2 = nVar.f3760b;
            if (i == 0) {
                dVar.f3624n0 = i2;
            } else {
                dVar.o0 = i2;
            }
        }
        this.f3762e = nVar.f3760b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3761c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3760b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3759a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((s.d) it.next()).f3613h0;
        }
        return V.f(sb2, " >");
    }
}
