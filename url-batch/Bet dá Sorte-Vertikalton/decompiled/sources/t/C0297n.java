package t;

import X.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0271c;
import s.C0281d;
import s.C0282e;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3810f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3811a;

    /* renamed from: b, reason: collision with root package name */
    public int f3812b;

    /* renamed from: c, reason: collision with root package name */
    public int f3813c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3814e;

    public final void a(ArrayList arrayList) {
        int size = this.f3811a.size();
        if (this.f3814e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0297n c0297n = (C0297n) arrayList.get(i);
                if (this.f3814e == c0297n.f3812b) {
                    c(this.f3813c, c0297n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0271c c0271c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f3811a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0282e c0282e = (C0282e) ((C0281d) arrayList.get(0)).f3621T;
        c0271c.t();
        c0282e.b(c0271c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0281d) arrayList.get(i2)).b(c0271c, false);
        }
        if (i == 0 && c0282e.f3684z0 > 0) {
            s.j.a(c0282e, c0271c, arrayList, 0);
        }
        if (i == 1 && c0282e.f3665A0 > 0) {
            s.j.a(c0282e, c0271c, arrayList, 1);
        }
        try {
            c0271c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0281d c0281d = (C0281d) arrayList.get(i3);
            M0.e eVar = new M0.e(26);
            new WeakReference(c0281d);
            C0271c.n(c0281d.f3610I);
            C0271c.n(c0281d.f3611J);
            C0271c.n(c0281d.f3612K);
            C0271c.n(c0281d.f3613L);
            C0271c.n(c0281d.f3614M);
            this.d.add(eVar);
        }
        if (i == 0) {
            n2 = C0271c.n(c0282e.f3610I);
            n3 = C0271c.n(c0282e.f3612K);
            c0271c.t();
        } else {
            n2 = C0271c.n(c0282e.f3611J);
            n3 = C0271c.n(c0282e.f3613L);
            c0271c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0297n c0297n) {
        Iterator it = this.f3811a.iterator();
        while (it.hasNext()) {
            C0281d c0281d = (C0281d) it.next();
            ArrayList arrayList = c0297n.f3811a;
            if (!arrayList.contains(c0281d)) {
                arrayList.add(c0281d);
            }
            int i2 = c0297n.f3812b;
            if (i == 0) {
                c0281d.n0 = i2;
            } else {
                c0281d.f3652o0 = i2;
            }
        }
        this.f3814e = c0297n.f3812b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3813c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3812b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3811a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0281d) it.next()).f3641h0;
        }
        return V.e(sb2, " >");
    }
}
