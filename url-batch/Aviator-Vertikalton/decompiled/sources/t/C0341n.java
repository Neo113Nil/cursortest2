package t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0315c;
import s.C0325d;
import s.C0326e;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341n {

    /* renamed from: f, reason: collision with root package name */
    public static int f4185f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4186a;

    /* renamed from: b, reason: collision with root package name */
    public int f4187b;

    /* renamed from: c, reason: collision with root package name */
    public int f4188c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4189d;

    /* renamed from: e, reason: collision with root package name */
    public int f4190e;

    public final void a(ArrayList arrayList) {
        int size = this.f4186a.size();
        if (this.f4190e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0341n c0341n = (C0341n) arrayList.get(i);
                if (this.f4190e == c0341n.f4187b) {
                    c(this.f4188c, c0341n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0315c c0315c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f4186a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0326e c0326e = (C0326e) ((C0325d) arrayList.get(0)).f4023T;
        c0315c.t();
        c0326e.b(c0315c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0325d) arrayList.get(i2)).b(c0315c, false);
        }
        if (i == 0 && c0326e.f4087z0 > 0) {
            s.j.a(c0326e, c0315c, arrayList, 0);
        }
        if (i == 1 && c0326e.f4068A0 > 0) {
            s.j.a(c0326e, c0315c, arrayList, 1);
        }
        try {
            c0315c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f4189d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0325d c0325d = (C0325d) arrayList.get(i3);
            H0.e eVar = new H0.e(28);
            new WeakReference(c0325d);
            C0315c.n(c0325d.f4012I);
            C0315c.n(c0325d.f4013J);
            C0315c.n(c0325d.f4014K);
            C0315c.n(c0325d.f4015L);
            C0315c.n(c0325d.f4016M);
            this.f4189d.add(eVar);
        }
        if (i == 0) {
            n2 = C0315c.n(c0326e.f4012I);
            n3 = C0315c.n(c0326e.f4014K);
            c0315c.t();
        } else {
            n2 = C0315c.n(c0326e.f4013J);
            n3 = C0315c.n(c0326e.f4015L);
            c0315c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0341n c0341n) {
        Iterator it = this.f4186a.iterator();
        while (it.hasNext()) {
            C0325d c0325d = (C0325d) it.next();
            ArrayList arrayList = c0341n.f4186a;
            if (!arrayList.contains(c0325d)) {
                arrayList.add(c0325d);
            }
            int i2 = c0341n.f4187b;
            if (i == 0) {
                c0325d.f4053n0 = i2;
            } else {
                c0325d.f4055o0 = i2;
            }
        }
        this.f4190e = c0341n.f4187b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f4188c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f4187b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f4186a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0325d) it.next()).f4044h0;
        }
        return X0.e.e(sb2, " >");
    }
}
