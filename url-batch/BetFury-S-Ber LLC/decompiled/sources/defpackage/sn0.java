package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sn0 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                sn0 sn0Var = (sn0) arrayList.get(i);
                if (this.e == sn0Var.b) {
                    c(this.c, sn0Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(xx xxVar, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        sf sfVar = (sf) ((rf) arrayList.get(0)).U;
        xxVar.t();
        sfVar.b(xxVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((rf) arrayList.get(i2)).b(xxVar, false);
        }
        if (i == 0 && sfVar.z0 > 0) {
            mv.b(sfVar, xxVar, arrayList, 0);
        }
        if (i == 1 && sfVar.A0 > 0) {
            mv.b(sfVar, xxVar, arrayList, 1);
        }
        try {
            xxVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            rf rfVar = (rf) arrayList.get(i3);
            xy xyVar = new xy(28);
            new WeakReference(rfVar);
            xx.n(rfVar.I);
            xx.n(rfVar.J);
            xx.n(rfVar.K);
            xx.n(rfVar.L);
            xx.n(rfVar.M);
            this.d.add(xyVar);
        }
        if (i == 0) {
            n = xx.n(sfVar.I);
            n2 = xx.n(sfVar.K);
            xxVar.t();
        } else {
            n = xx.n(sfVar.J);
            n2 = xx.n(sfVar.L);
            xxVar.t();
        }
        return n2 - n;
    }

    public final void c(int i, sn0 sn0Var) {
        int i2 = sn0Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            rf rfVar = (rf) obj;
            ArrayList arrayList2 = sn0Var.a;
            if (!arrayList2.contains(rfVar)) {
                arrayList2.add(rfVar);
            }
            if (i == 0) {
                rfVar.o0 = i2;
            } else {
                rfVar.p0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.b);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            sb2 = sb2 + " " + ((rf) obj).i0;
        }
        return sb2.concat(" >");
    }
}
