package t;

import X.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0286c;
import s.C0296d;
import s.C0297e;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3733f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3734a;

    /* renamed from: b, reason: collision with root package name */
    public int f3735b;

    /* renamed from: c, reason: collision with root package name */
    public int f3736c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3737e;

    public final void a(ArrayList arrayList) {
        int size = this.f3734a.size();
        if (this.f3737e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0312n c0312n = (C0312n) arrayList.get(i);
                if (this.f3737e == c0312n.f3735b) {
                    c(this.f3736c, c0312n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0286c c0286c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3734a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0297e c0297e = (C0297e) ((C0296d) arrayList.get(0)).f3567T;
        c0286c.t();
        c0297e.b(c0286c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0296d) arrayList.get(i2)).b(c0286c, false);
        }
        if (i == 0 && c0297e.f3631z0 > 0) {
            s.j.a(c0297e, c0286c, arrayList, 0);
        }
        if (i == 1 && c0297e.f3612A0 > 0) {
            s.j.a(c0297e, c0286c, arrayList, 1);
        }
        try {
            c0286c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0296d c0296d = (C0296d) arrayList.get(i3);
            I0.e eVar = new I0.e(26);
            new WeakReference(c0296d);
            C0286c.n(c0296d.f3556I);
            C0286c.n(c0296d.f3557J);
            C0286c.n(c0296d.f3558K);
            C0286c.n(c0296d.f3559L);
            C0286c.n(c0296d.f3560M);
            this.d.add(eVar);
        }
        if (i == 0) {
            n2 = C0286c.n(c0297e.f3556I);
            n3 = C0286c.n(c0297e.f3558K);
            c0286c.t();
        } else {
            n2 = C0286c.n(c0297e.f3557J);
            n3 = C0286c.n(c0297e.f3559L);
            c0286c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0312n c0312n) {
        Iterator it = this.f3734a.iterator();
        while (it.hasNext()) {
            C0296d c0296d = (C0296d) it.next();
            ArrayList arrayList = c0312n.f3734a;
            if (!arrayList.contains(c0296d)) {
                arrayList.add(c0296d);
            }
            int i2 = c0312n.f3735b;
            if (i == 0) {
                c0296d.n0 = i2;
            } else {
                c0296d.f3599o0 = i2;
            }
        }
        this.f3737e = c0312n.f3735b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3736c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3735b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3734a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0296d) it.next()).f3587h0;
        }
        return V.e(sb2, " >");
    }
}
