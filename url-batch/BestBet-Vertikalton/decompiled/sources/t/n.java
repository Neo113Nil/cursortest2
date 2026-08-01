package t;

import G1.AbstractC0001b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0307c;
import u0.C0366e;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f4105f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4106a;

    /* renamed from: b, reason: collision with root package name */
    public int f4107b;

    /* renamed from: c, reason: collision with root package name */
    public int f4108c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f4109e;

    public final void a(ArrayList arrayList) {
        int size = this.f4106a.size();
        if (this.f4109e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.f4109e == nVar.f4107b) {
                    c(this.f4108c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0307c c0307c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f4106a;
        if (arrayList.size() == 0) {
            return 0;
        }
        s.e eVar = (s.e) ((s.d) arrayList.get(0)).f3887T;
        c0307c.t();
        eVar.b(c0307c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((s.d) arrayList.get(i2)).b(c0307c, false);
        }
        if (i == 0 && eVar.f3951z0 > 0) {
            s.j.a(eVar, c0307c, arrayList, 0);
        }
        if (i == 1 && eVar.f3932A0 > 0) {
            s.j.a(eVar, c0307c, arrayList, 1);
        }
        try {
            c0307c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            s.d dVar = (s.d) arrayList.get(i3);
            C0366e c0366e = new C0366e();
            new WeakReference(dVar);
            C0307c.n(dVar.f3876I);
            C0307c.n(dVar.f3877J);
            C0307c.n(dVar.f3878K);
            C0307c.n(dVar.f3879L);
            C0307c.n(dVar.f3880M);
            this.d.add(c0366e);
        }
        if (i == 0) {
            n2 = C0307c.n(eVar.f3876I);
            n3 = C0307c.n(eVar.f3878K);
            c0307c.t();
        } else {
            n2 = C0307c.n(eVar.f3877J);
            n3 = C0307c.n(eVar.f3879L);
            c0307c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, n nVar) {
        Iterator it = this.f4106a.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            ArrayList arrayList = nVar.f4106a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i2 = nVar.f4107b;
            if (i == 0) {
                dVar.f3918n0 = i2;
            } else {
                dVar.o0 = i2;
            }
        }
        this.f4109e = nVar.f4107b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f4108c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f4107b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f4106a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((s.d) it.next()).f3907h0;
        }
        return AbstractC0001b.g(sb2, " >");
    }
}
