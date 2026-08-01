package v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s.C0265c;
import u.C0275d;
import u.C0276e;

/* renamed from: v.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3830f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3831a;

    /* renamed from: b, reason: collision with root package name */
    public int f3832b;

    /* renamed from: c, reason: collision with root package name */
    public int f3833c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3834e;

    public final void a(ArrayList arrayList) {
        int size = this.f3831a.size();
        if (this.f3834e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0291n c0291n = (C0291n) arrayList.get(i);
                if (this.f3834e == c0291n.f3832b) {
                    c(this.f3833c, c0291n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0265c c0265c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3831a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0276e c0276e = (C0276e) ((C0275d) arrayList.get(0)).f3659T;
        c0265c.t();
        c0276e.b(c0265c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0275d) arrayList.get(i2)).b(c0265c, false);
        }
        if (i == 0 && c0276e.f3723z0 > 0) {
            u.j.a(c0276e, c0265c, arrayList, 0);
        }
        if (i == 1 && c0276e.f3704A0 > 0) {
            u.j.a(c0276e, c0265c, arrayList, 1);
        }
        try {
            c0265c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0275d c0275d = (C0275d) arrayList.get(i3);
            z1.n nVar = new z1.n();
            new WeakReference(c0275d);
            C0265c.n(c0275d.f3648I);
            C0265c.n(c0275d.f3649J);
            C0265c.n(c0275d.f3650K);
            C0265c.n(c0275d.f3651L);
            C0265c.n(c0275d.f3652M);
            this.d.add(nVar);
        }
        if (i == 0) {
            n2 = C0265c.n(c0276e.f3648I);
            n3 = C0265c.n(c0276e.f3650K);
            c0265c.t();
        } else {
            n2 = C0265c.n(c0276e.f3649J);
            n3 = C0265c.n(c0276e.f3651L);
            c0265c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0291n c0291n) {
        Iterator it = this.f3831a.iterator();
        while (it.hasNext()) {
            C0275d c0275d = (C0275d) it.next();
            ArrayList arrayList = c0291n.f3831a;
            if (!arrayList.contains(c0275d)) {
                arrayList.add(c0275d);
            }
            int i2 = c0291n.f3832b;
            if (i == 0) {
                c0275d.f3690n0 = i2;
            } else {
                c0275d.f3692o0 = i2;
            }
        }
        this.f3834e = c0291n.f3832b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3833c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3832b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3831a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0275d) it.next()).f3679h0;
        }
        return X0.a.f(sb2, " >");
    }
}
