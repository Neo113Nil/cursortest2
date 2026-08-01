package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class qa0 {
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
                qa0 qa0Var = (qa0) arrayList.get(i);
                if (this.e == qa0Var.b) {
                    c(this.c, qa0Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(xq xqVar, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        fd fdVar = (fd) ((ed) arrayList.get(0)).T;
        xqVar.t();
        fdVar.b(xqVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ed) arrayList.get(i2)).b(xqVar, false);
        }
        if (i == 0 && fdVar.z0 > 0) {
            op.c(fdVar, xqVar, arrayList, 0);
        }
        if (i == 1 && fdVar.A0 > 0) {
            op.c(fdVar, xqVar, arrayList, 1);
        }
        try {
            xqVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ed edVar = (ed) arrayList.get(i3);
            ix ixVar = new ix(18);
            new WeakReference(edVar);
            xq.n(edVar.I);
            xq.n(edVar.J);
            xq.n(edVar.K);
            xq.n(edVar.L);
            xq.n(edVar.M);
            this.d.add(ixVar);
        }
        if (i == 0) {
            n = xq.n(fdVar.I);
            n2 = xq.n(fdVar.K);
            xqVar.t();
        } else {
            n = xq.n(fdVar.J);
            n2 = xq.n(fdVar.L);
            xqVar.t();
        }
        return n2 - n;
    }

    public final void c(int i, qa0 qa0Var) {
        int i2 = qa0Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ed edVar = (ed) obj;
            ArrayList arrayList2 = qa0Var.a;
            if (!arrayList2.contains(edVar)) {
                arrayList2.add(edVar);
            }
            if (i == 0) {
                edVar.n0 = i2;
            } else {
                edVar.o0 = i2;
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
            sb2 = sb2 + " " + ((ed) obj).h0;
        }
        return sb2.concat(" >");
    }
}
