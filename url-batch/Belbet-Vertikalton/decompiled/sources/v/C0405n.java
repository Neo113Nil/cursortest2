package v;

import G1.AbstractC0001b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s.C0378c;
import u.C0387d;
import u.C0388e;

/* renamed from: v.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405n {

    /* renamed from: f, reason: collision with root package name */
    public static int f4431f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4432a;

    /* renamed from: b, reason: collision with root package name */
    public int f4433b;

    /* renamed from: c, reason: collision with root package name */
    public int f4434c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4435d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.f4432a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0405n c0405n = (C0405n) arrayList.get(i);
                if (this.e == c0405n.f4433b) {
                    c(this.f4434c, c0405n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0378c c0378c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f4432a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0388e c0388e = (C0388e) ((C0387d) arrayList.get(0)).f4247T;
        c0378c.t();
        c0388e.b(c0378c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0387d) arrayList.get(i2)).b(c0378c, false);
        }
        if (i == 0 && c0388e.f4311z0 > 0) {
            u.j.a(c0388e, c0378c, arrayList, 0);
        }
        if (i == 1 && c0388e.f4292A0 > 0) {
            u.j.a(c0388e, c0378c, arrayList, 1);
        }
        try {
            c0378c.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f4435d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0387d c0387d = (C0387d) arrayList.get(i3);
            p0.i iVar = new p0.i();
            new WeakReference(c0387d);
            C0378c.n(c0387d.f4236I);
            C0378c.n(c0387d.f4237J);
            C0378c.n(c0387d.f4238K);
            C0378c.n(c0387d.f4239L);
            C0378c.n(c0387d.f4240M);
            this.f4435d.add(iVar);
        }
        if (i == 0) {
            n2 = C0378c.n(c0388e.f4236I);
            n3 = C0378c.n(c0388e.f4238K);
            c0378c.t();
        } else {
            n2 = C0378c.n(c0388e.f4237J);
            n3 = C0378c.n(c0388e.f4239L);
            c0378c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0405n c0405n) {
        Iterator it = this.f4432a.iterator();
        while (it.hasNext()) {
            C0387d c0387d = (C0387d) it.next();
            ArrayList arrayList = c0405n.f4432a;
            if (!arrayList.contains(c0387d)) {
                arrayList.add(c0387d);
            }
            int i2 = c0405n.f4433b;
            if (i == 0) {
                c0387d.f4278n0 = i2;
            } else {
                c0387d.o0 = i2;
            }
        }
        this.e = c0405n.f4433b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f4434c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f4433b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f4432a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0387d) it.next()).f4268h0;
        }
        return AbstractC0001b.f(sb2, " >");
    }
}
