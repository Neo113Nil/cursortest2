package t;

import X.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0283c;
import s.C0295d;
import s.C0296e;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3858f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3859a;

    /* renamed from: b, reason: collision with root package name */
    public int f3860b;

    /* renamed from: c, reason: collision with root package name */
    public int f3861c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3862e;

    public final void a(ArrayList arrayList) {
        int size = this.f3859a.size();
        if (this.f3862e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0311n c0311n = (C0311n) arrayList.get(i);
                if (this.f3862e == c0311n.f3860b) {
                    c(this.f3861c, c0311n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0283c c0283c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3859a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0296e c0296e = (C0296e) ((C0295d) arrayList.get(0)).f3681T;
        c0283c.t();
        c0296e.b(c0283c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0295d) arrayList.get(i2)).b(c0283c, false);
        }
        if (i == 0 && c0296e.f3744z0 > 0) {
            s.j.a(c0296e, c0283c, arrayList, 0);
        }
        if (i == 1 && c0296e.f3725A0 > 0) {
            s.j.a(c0296e, c0283c, arrayList, 1);
        }
        try {
            c0283c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0295d c0295d = (C0295d) arrayList.get(i3);
            I0.e eVar = new I0.e(27);
            new WeakReference(c0295d);
            C0283c.n(c0295d.f3670I);
            C0283c.n(c0295d.f3671J);
            C0283c.n(c0295d.f3672K);
            C0283c.n(c0295d.f3673L);
            C0283c.n(c0295d.f3674M);
            this.d.add(eVar);
        }
        if (i == 0) {
            n2 = C0283c.n(c0296e.f3670I);
            n3 = C0283c.n(c0296e.f3672K);
            c0283c.t();
        } else {
            n2 = C0283c.n(c0296e.f3671J);
            n3 = C0283c.n(c0296e.f3673L);
            c0283c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0311n c0311n) {
        Iterator it = this.f3859a.iterator();
        while (it.hasNext()) {
            C0295d c0295d = (C0295d) it.next();
            ArrayList arrayList = c0311n.f3859a;
            if (!arrayList.contains(c0295d)) {
                arrayList.add(c0295d);
            }
            int i2 = c0311n.f3860b;
            if (i == 0) {
                c0295d.n0 = i2;
            } else {
                c0295d.f3712o0 = i2;
            }
        }
        this.f3862e = c0311n.f3860b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3861c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3860b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3859a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0295d) it.next()).f3701h0;
        }
        return V.e(sb2, " >");
    }
}
