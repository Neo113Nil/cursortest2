package t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0317c;
import s.C0327d;
import s.C0328e;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343n {

    /* renamed from: f, reason: collision with root package name */
    public static int f4189f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4190a;

    /* renamed from: b, reason: collision with root package name */
    public int f4191b;

    /* renamed from: c, reason: collision with root package name */
    public int f4192c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4193d;

    /* renamed from: e, reason: collision with root package name */
    public int f4194e;

    public final void a(ArrayList arrayList) {
        int size = this.f4190a.size();
        if (this.f4194e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0343n c0343n = (C0343n) arrayList.get(i);
                if (this.f4194e == c0343n.f4191b) {
                    c(this.f4192c, c0343n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0317c c0317c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f4190a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0328e c0328e = (C0328e) ((C0327d) arrayList.get(0)).f4027T;
        c0317c.t();
        c0328e.b(c0317c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0327d) arrayList.get(i2)).b(c0317c, false);
        }
        if (i == 0 && c0328e.f4091z0 > 0) {
            s.j.a(c0328e, c0317c, arrayList, 0);
        }
        if (i == 1 && c0328e.f4072A0 > 0) {
            s.j.a(c0328e, c0317c, arrayList, 1);
        }
        try {
            c0317c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f4193d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0327d c0327d = (C0327d) arrayList.get(i3);
            H0.e eVar = new H0.e(28);
            new WeakReference(c0327d);
            C0317c.n(c0327d.f4016I);
            C0317c.n(c0327d.f4017J);
            C0317c.n(c0327d.f4018K);
            C0317c.n(c0327d.f4019L);
            C0317c.n(c0327d.f4020M);
            this.f4193d.add(eVar);
        }
        if (i == 0) {
            n2 = C0317c.n(c0328e.f4016I);
            n3 = C0317c.n(c0328e.f4018K);
            c0317c.t();
        } else {
            n2 = C0317c.n(c0328e.f4017J);
            n3 = C0317c.n(c0328e.f4019L);
            c0317c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0343n c0343n) {
        Iterator it = this.f4190a.iterator();
        while (it.hasNext()) {
            C0327d c0327d = (C0327d) it.next();
            ArrayList arrayList = c0343n.f4190a;
            if (!arrayList.contains(c0327d)) {
                arrayList.add(c0327d);
            }
            int i2 = c0343n.f4191b;
            if (i == 0) {
                c0327d.f4057n0 = i2;
            } else {
                c0327d.f4059o0 = i2;
            }
        }
        this.f4194e = c0343n.f4191b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f4192c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f4191b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f4190a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0327d) it.next()).f4048h0;
        }
        return X0.e.e(sb2, " >");
    }
}
