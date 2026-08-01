package t;

import X.V;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0315c;
import s.C0340d;
import s.C0341e;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357o {

    /* renamed from: f, reason: collision with root package name */
    public static int f3706f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3707a;

    /* renamed from: b, reason: collision with root package name */
    public int f3708b;

    /* renamed from: c, reason: collision with root package name */
    public int f3709c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3710e;

    public final void a(ArrayList arrayList) {
        int size = this.f3707a.size();
        if (this.f3710e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0357o c0357o = (C0357o) arrayList.get(i);
                if (this.f3710e == c0357o.f3708b) {
                    c(this.f3709c, c0357o);
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
        ArrayList arrayList = this.f3707a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0341e c0341e = (C0341e) ((C0340d) arrayList.get(0)).f3515T;
        c0315c.t();
        c0341e.b(c0315c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0340d) arrayList.get(i2)).b(c0315c, false);
        }
        if (i == 0 && c0341e.f3578z0 > 0) {
            s.j.a(c0341e, c0315c, arrayList, 0);
        }
        if (i == 1 && c0341e.f3560A0 > 0) {
            s.j.a(c0341e, c0315c, arrayList, 1);
        }
        try {
            c0315c.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0340d c0340d = (C0340d) arrayList.get(i3);
            C0356n c0356n = new C0356n();
            new WeakReference(c0340d);
            C0315c.n(c0340d.f3504I);
            C0315c.n(c0340d.f3505J);
            C0315c.n(c0340d.f3506K);
            C0315c.n(c0340d.f3507L);
            C0315c.n(c0340d.f3508M);
            this.d.add(c0356n);
        }
        if (i == 0) {
            n2 = C0315c.n(c0341e.f3504I);
            n3 = C0315c.n(c0341e.f3506K);
            c0315c.t();
        } else {
            n2 = C0315c.n(c0341e.f3505J);
            n3 = C0315c.n(c0341e.f3507L);
            c0315c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, C0357o c0357o) {
        Iterator it = this.f3707a.iterator();
        while (it.hasNext()) {
            C0340d c0340d = (C0340d) it.next();
            ArrayList arrayList = c0357o.f3707a;
            if (!arrayList.contains(c0340d)) {
                arrayList.add(c0340d);
            }
            int i2 = c0357o.f3708b;
            if (i == 0) {
                c0340d.f3545n0 = i2;
            } else {
                c0340d.f3547o0 = i2;
            }
        }
        this.f3710e = c0357o.f3708b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f3709c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3708b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f3707a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C0340d) it.next()).f3535h0;
        }
        return V.e(sb2, " >");
    }
}
