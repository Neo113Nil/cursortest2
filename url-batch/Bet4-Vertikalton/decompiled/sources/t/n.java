package t;

import Y.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0285c;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3790f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3791a;

    /* renamed from: b, reason: collision with root package name */
    public int f3792b;

    /* renamed from: c, reason: collision with root package name */
    public int f3793c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3794e;

    public final void a(ArrayList arrayList) {
        int size = this.f3791a.size();
        if (this.f3794e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.f3794e == nVar.f3792b) {
                    c(this.f3793c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0285c c0285c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3791a;
        if (arrayList.size() == 0) {
            return 0;
        }
        s.e eVar = (s.e) ((s.d) arrayList.get(0)).f3567T;
        c0285c.t();
        eVar.b(c0285c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((s.d) arrayList.get(i2)).b(c0285c, false);
        }
        if (i == 0 && eVar.z0 > 0) {
            s.j.a(eVar, c0285c, arrayList, 0);
        }
        if (i == 1 && eVar.f3611A0 > 0) {
            s.j.a(eVar, c0285c, arrayList, 1);
        }
        try {
            c0285c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            s.d dVar = (s.d) arrayList.get(i3);
            J0.e eVar2 = new J0.e(26);
            new WeakReference(dVar);
            C0285c.n(dVar.f3556I);
            C0285c.n(dVar.f3557J);
            C0285c.n(dVar.f3558K);
            C0285c.n(dVar.f3559L);
            C0285c.n(dVar.f3560M);
            this.d.add(eVar2);
        }
        if (i == 0) {
            n2 = C0285c.n(eVar.f3556I);
            n3 = C0285c.n(eVar.f3558K);
            c0285c.t();
        } else {
            n2 = C0285c.n(eVar.f3557J);
            n3 = C0285c.n(eVar.f3559L);
            c0285c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, n nVar) {
        Iterator it = this.f3791a.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            ArrayList arrayList = nVar.f3791a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i2 = nVar.f3792b;
            if (i == 0) {
                dVar.f3597n0 = i2;
            } else {
                dVar.o0 = i2;
            }
        }
        this.f3794e = nVar.f3792b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3793c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3792b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3791a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((s.d) it.next()).f3587h0;
        }
        return V.f(sb2, " >");
    }
}
