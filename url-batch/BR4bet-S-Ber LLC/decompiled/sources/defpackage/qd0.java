package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qd0 {
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
                qd0 qd0Var = (qd0) arrayList.get(i);
                if (this.e == qd0Var.b) {
                    c(this.c, qd0Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(ys ysVar, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        be beVar = (be) ((ae) arrayList.get(0)).T;
        ysVar.t();
        beVar.b(ysVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ae) arrayList.get(i2)).b(ysVar, false);
        }
        if (i == 0 && beVar.z0 > 0) {
            mz.e(beVar, ysVar, arrayList, 0);
        }
        if (i == 1 && beVar.A0 > 0) {
            mz.e(beVar, ysVar, arrayList, 1);
        }
        try {
            ysVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ae aeVar = (ae) arrayList.get(i3);
            ky kyVar = new ky(20);
            new WeakReference(aeVar);
            ys.n(aeVar.I);
            ys.n(aeVar.J);
            ys.n(aeVar.K);
            ys.n(aeVar.L);
            ys.n(aeVar.M);
            this.d.add(kyVar);
        }
        if (i == 0) {
            n = ys.n(beVar.I);
            n2 = ys.n(beVar.K);
            ysVar.t();
        } else {
            n = ys.n(beVar.J);
            n2 = ys.n(beVar.L);
            ysVar.t();
        }
        return n2 - n;
    }

    public final void c(int i, qd0 qd0Var) {
        int i2 = qd0Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ae aeVar = (ae) obj;
            ArrayList arrayList2 = qd0Var.a;
            if (!arrayList2.contains(aeVar)) {
                arrayList2.add(aeVar);
            }
            if (i == 0) {
                aeVar.n0 = i2;
            } else {
                aeVar.o0 = i2;
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
            sb2 = sb2 + " " + ((ae) obj).h0;
        }
        return sb2.concat(" >");
    }
}
