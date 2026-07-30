package x;

import com.google.android.gms.internal.ads.CL;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import t0.AbstractC5051n;
import u.AbstractC5088e;
import u.C5086c;
import w.C5144d;
import w.C5145e;

/* renamed from: x.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5198o {

    /* renamed from: f, reason: collision with root package name */
    public static int f41751f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f41752a;

    /* renamed from: b, reason: collision with root package name */
    public int f41753b;

    /* renamed from: c, reason: collision with root package name */
    public int f41754c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f41755d;

    /* renamed from: e, reason: collision with root package name */
    public int f41756e;

    public final void a(ArrayList arrayList) {
        int size = this.f41752a.size();
        if (this.f41756e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C5198o c5198o = (C5198o) arrayList.get(i);
                if (this.f41756e == c5198o.f41753b) {
                    c(this.f41754c, c5198o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C5086c c5086c, int i) {
        int n9;
        int n10;
        ArrayList arrayList = this.f41752a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C5145e c5145e = (C5145e) ((C5144d) arrayList.get(0)).f41432T;
        c5086c.t();
        c5145e.b(c5086c, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((C5144d) arrayList.get(i4)).b(c5086c, false);
        }
        if (i == 0 && c5145e.f41498z0 > 0) {
            w.j.a(c5145e, c5086c, arrayList, 0);
        }
        if (i == 1 && c5145e.f41478A0 > 0) {
            w.j.a(c5145e, c5086c, arrayList, 1);
        }
        try {
            c5086c.p();
        } catch (Exception e6) {
            System.err.println(e6.toString() + "\n" + Arrays.toString(e6.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f41755d = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            C5144d c5144d = (C5144d) arrayList.get(i9);
            C5197n c5197n = new C5197n();
            new WeakReference(c5144d);
            C5086c.n(c5144d.f41422I);
            C5086c.n(c5144d.J);
            C5086c.n(c5144d.f41423K);
            C5086c.n(c5144d.f41424L);
            C5086c.n(c5144d.f41425M);
            this.f41755d.add(c5197n);
        }
        if (i == 0) {
            n9 = C5086c.n(c5145e.f41422I);
            n10 = C5086c.n(c5145e.f41423K);
            c5086c.t();
        } else {
            n9 = C5086c.n(c5145e.J);
            n10 = C5086c.n(c5145e.f41424L);
            c5086c.t();
        }
        return n10 - n9;
    }

    public final void c(int i, C5198o c5198o) {
        Iterator it = this.f41752a.iterator();
        while (it.hasNext()) {
            C5144d c5144d = (C5144d) it.next();
            ArrayList arrayList = c5198o.f41752a;
            if (!arrayList.contains(c5144d)) {
                arrayList.add(c5144d);
            }
            int i4 = c5198o.f41753b;
            if (i == 0) {
                c5144d.f41463n0 = i4;
            } else {
                c5144d.f41465o0 = i4;
            }
        }
        this.f41756e = c5198o.f41753b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f41754c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String e6 = AbstractC5051n.e(this.f41753b, "] <", sb);
        Iterator it = this.f41752a.iterator();
        while (it.hasNext()) {
            C5144d c5144d = (C5144d) it.next();
            StringBuilder c4 = AbstractC5088e.c(e6, " ");
            c4.append(c5144d.f41453h0);
            e6 = c4.toString();
        }
        return CL.j(e6, " >");
    }
}
