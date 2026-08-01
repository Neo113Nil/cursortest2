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
    public static int f3768f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3769a;

    /* renamed from: b, reason: collision with root package name */
    public int f3770b;

    /* renamed from: c, reason: collision with root package name */
    public int f3771c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3772e;

    public final void a(ArrayList arrayList) {
        int size = this.f3769a.size();
        if (this.f3772e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0314n c0314n = (C0314n) arrayList.get(i);
                if (this.f3772e == c0314n.f3770b) {
                    c(this.f3771c, c0314n);
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
        ArrayList arrayList = this.f3769a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0299e c0299e = (C0299e) ((C0298d) arrayList.get(0)).f3610T;
        c0288c.t();
        c0299e.b(c0288c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0298d) arrayList.get(i2)).b(c0288c, false);
        }
        if (i == 0 && c0299e.f3674z0 > 0) {
            s.j.a(c0299e, c0288c, arrayList, 0);
        }
        if (i == 1 && c0299e.f3655A0 > 0) {
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
            C0288c.n(c0298d.f3599I);
            C0288c.n(c0298d.f3600J);
            C0288c.n(c0298d.f3601K);
            C0288c.n(c0298d.f3602L);
            C0288c.n(c0298d.f3603M);
            this.d.add(eVar);
        }
        if (i == 0) {
            n2 = C0288c.n(c0299e.f3599I);
            n3 = C0288c.n(c0299e.f3601K);
            c0288c.t();
        } else {
            n2 = C0288c.n(c0299e.f3600J);
            n3 = C0288c.n(c0299e.f3602L);
            c0288c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0314n c0314n) {
        Iterator it = this.f3769a.iterator();
        while (it.hasNext()) {
            C0298d c0298d = (C0298d) it.next();
            ArrayList arrayList = c0314n.f3769a;
            if (!arrayList.contains(c0298d)) {
                arrayList.add(c0298d);
            }
            int i2 = c0314n.f3770b;
            if (i == 0) {
                c0298d.f3640n0 = i2;
            } else {
                c0298d.f3642o0 = i2;
            }
        }
        this.f3772e = c0314n.f3770b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3771c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3770b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3769a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0298d) it.next()).f3630h0;
        }
        return V.e(sb2, " >");
    }
}
