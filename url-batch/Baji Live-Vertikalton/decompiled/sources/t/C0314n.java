package t;

import X.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0288c;
import s.C0298d;
import s.C0299e;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314n {

    /* renamed from: f, reason: collision with root package name */
    public static int f3767f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3768a;

    /* renamed from: b, reason: collision with root package name */
    public int f3769b;

    /* renamed from: c, reason: collision with root package name */
    public int f3770c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3771e;

    public final void a(ArrayList arrayList) {
        int size = this.f3768a.size();
        if (this.f3771e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0314n c0314n = (C0314n) arrayList.get(i);
                if (this.f3771e == c0314n.f3769b) {
                    c(this.f3770c, c0314n);
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
        ArrayList arrayList = this.f3768a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0299e c0299e = (C0299e) ((C0298d) arrayList.get(0)).f3609T;
        c0288c.t();
        c0299e.b(c0288c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0298d) arrayList.get(i2)).b(c0288c, false);
        }
        if (i == 0 && c0299e.f3673z0 > 0) {
            s.j.a(c0299e, c0288c, arrayList, 0);
        }
        if (i == 1 && c0299e.f3654A0 > 0) {
            s.j.a(c0299e, c0288c, arrayList, 1);
        }
        try {
            c0288c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0298d c0298d = (C0298d) arrayList.get(i3);
            H0.e eVar = new H0.e(27);
            new WeakReference(c0298d);
            C0288c.n(c0298d.f3598I);
            C0288c.n(c0298d.f3599J);
            C0288c.n(c0298d.f3600K);
            C0288c.n(c0298d.f3601L);
            C0288c.n(c0298d.f3602M);
            this.d.add(eVar);
        }
        if (i == 0) {
            n2 = C0288c.n(c0299e.f3598I);
            n3 = C0288c.n(c0299e.f3600K);
            c0288c.t();
        } else {
            n2 = C0288c.n(c0299e.f3599J);
            n3 = C0288c.n(c0299e.f3601L);
            c0288c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0314n c0314n) {
        Iterator it = this.f3768a.iterator();
        while (it.hasNext()) {
            C0298d c0298d = (C0298d) it.next();
            ArrayList arrayList = c0314n.f3768a;
            if (!arrayList.contains(c0298d)) {
                arrayList.add(c0298d);
            }
            int i2 = c0314n.f3769b;
            if (i == 0) {
                c0298d.f3639n0 = i2;
            } else {
                c0298d.f3641o0 = i2;
            }
        }
        this.f3771e = c0314n.f3769b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3770c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3769b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3768a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0298d) it.next()).f3629h0;
        }
        return V.e(sb2, " >");
    }
}
