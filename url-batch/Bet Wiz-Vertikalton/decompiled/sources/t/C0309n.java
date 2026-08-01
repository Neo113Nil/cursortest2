package t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0283c;
import s.C0293d;
import s.C0294e;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3713f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3714a;

    /* renamed from: b, reason: collision with root package name */
    public int f3715b;

    /* renamed from: c, reason: collision with root package name */
    public int f3716c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3717e;

    public final void a(ArrayList arrayList) {
        int size = this.f3714a.size();
        if (this.f3717e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0309n c0309n = (C0309n) arrayList.get(i);
                if (this.f3717e == c0309n.f3715b) {
                    c(this.f3716c, c0309n);
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
        ArrayList arrayList = this.f3714a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0294e c0294e = (C0294e) ((C0293d) arrayList.get(0)).f3543T;
        c0283c.t();
        c0294e.b(c0283c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0293d) arrayList.get(i2)).b(c0283c, false);
        }
        if (i == 0 && c0294e.f3607z0 > 0) {
            s.j.a(c0294e, c0283c, arrayList, 0);
        }
        if (i == 1 && c0294e.f3588A0 > 0) {
            s.j.a(c0294e, c0283c, arrayList, 1);
        }
        try {
            c0283c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0293d c0293d = (C0293d) arrayList.get(i3);
            I0.e eVar = new I0.e(28);
            new WeakReference(c0293d);
            C0283c.n(c0293d.f3532I);
            C0283c.n(c0293d.f3533J);
            C0283c.n(c0293d.f3534K);
            C0283c.n(c0293d.f3535L);
            C0283c.n(c0293d.f3536M);
            this.d.add(eVar);
        }
        if (i == 0) {
            n2 = C0283c.n(c0294e.f3532I);
            n3 = C0283c.n(c0294e.f3534K);
            c0283c.t();
        } else {
            n2 = C0283c.n(c0294e.f3533J);
            n3 = C0283c.n(c0294e.f3535L);
            c0283c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0309n c0309n) {
        Iterator it = this.f3714a.iterator();
        while (it.hasNext()) {
            C0293d c0293d = (C0293d) it.next();
            ArrayList arrayList = c0309n.f3714a;
            if (!arrayList.contains(c0293d)) {
                arrayList.add(c0293d);
            }
            int i2 = c0309n.f3715b;
            if (i == 0) {
                c0293d.n0 = i2;
            } else {
                c0293d.f3575o0 = i2;
            }
        }
        this.f3717e = c0309n.f3715b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3716c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3715b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3714a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0293d) it.next()).f3563h0;
        }
        return T0.c.e(sb2, " >");
    }
}
