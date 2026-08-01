package u;

import Z.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import r.C0288c;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3938f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3939a;

    /* renamed from: b, reason: collision with root package name */
    public int f3940b;

    /* renamed from: c, reason: collision with root package name */
    public int f3941c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3942e;

    public final void a(ArrayList arrayList) {
        int size = this.f3939a.size();
        if (this.f3942e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.f3942e == nVar.f3940b) {
                    c(this.f3941c, nVar);
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
        ArrayList arrayList = this.f3939a;
        if (arrayList.size() == 0) {
            return 0;
        }
        t.e eVar = (t.e) ((t.d) arrayList.get(0)).f3769T;
        c0288c.t();
        eVar.b(c0288c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((t.d) arrayList.get(i2)).b(c0288c, false);
        }
        if (i == 0 && eVar.f3833z0 > 0) {
            t.j.a(eVar, c0288c, arrayList, 0);
        }
        if (i == 1 && eVar.A0 > 0) {
            t.j.a(eVar, c0288c, arrayList, 1);
        }
        try {
            c0288c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            t.d dVar = (t.d) arrayList.get(i3);
            K0.e eVar2 = new K0.e(28);
            new WeakReference(dVar);
            C0288c.n(dVar.f3758I);
            C0288c.n(dVar.f3759J);
            C0288c.n(dVar.f3760K);
            C0288c.n(dVar.f3761L);
            C0288c.n(dVar.f3762M);
            this.d.add(eVar2);
        }
        if (i == 0) {
            n2 = C0288c.n(eVar.f3758I);
            n3 = C0288c.n(eVar.f3760K);
            c0288c.t();
        } else {
            n2 = C0288c.n(eVar.f3759J);
            n3 = C0288c.n(eVar.f3761L);
            c0288c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, n nVar) {
        Iterator it = this.f3939a.iterator();
        while (it.hasNext()) {
            t.d dVar = (t.d) it.next();
            ArrayList arrayList = nVar.f3939a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i2 = nVar.f3940b;
            if (i == 0) {
                dVar.f3800n0 = i2;
            } else {
                dVar.f3802o0 = i2;
            }
        }
        this.f3942e = nVar.f3940b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3941c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3940b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3939a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((t.d) it.next()).f3790h0;
        }
        return V.f(sb2, " >");
    }
}
