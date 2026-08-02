package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sx {
    static int a;
    public final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public sx(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(rv rvVar, int i) {
        int o;
        int o2;
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            return 0;
        }
        sd sdVar = ((sd) arrayList.get(0)).V;
        rvVar.k();
        sdVar.b(rvVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((sd) arrayList.get(i2)).b(rvVar, false);
        }
        if (i == 0) {
            se seVar = (se) sdVar;
            if (seVar.au > 0) {
                ow.i(seVar, rvVar, arrayList, 0);
            }
        }
        if (i == 1) {
            se seVar2 = (se) sdVar;
            if (seVar2.av > 0) {
                ow.i(seVar2, rvVar, arrayList, 1);
            }
        }
        try {
            rvVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new tw((sd) arrayList.get(i3)));
        }
        if (i == 0) {
            se seVar3 = (se) sdVar;
            o = rv.o(seVar3.K);
            o2 = rv.o(seVar3.M);
            rvVar.k();
        } else {
            se seVar4 = (se) sdVar;
            o = rv.o(seVar4.L);
            o2 = rv.o(seVar4.N);
            rvVar.k();
        }
        return o2 - o;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                sx sxVar = (sx) arrayList.get(i);
                if (this.f == sxVar.c) {
                    c(this.d, sxVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, sx sxVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sd sdVar = (sd) arrayList.get(i2);
            sxVar.d(sdVar);
            if (i == 0) {
                sdVar.ap = sxVar.c;
            } else {
                sdVar.aq = sxVar.c;
            }
        }
        this.f = sxVar.c;
    }

    public final boolean d(sd sdVar) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(sdVar)) {
            return false;
        }
        arrayList.add(sdVar);
        return true;
    }

    public final String toString() {
        int i = this.d;
        String str = i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both";
        String str2 = str + " [" + this.c + "] <";
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            str2 = str2 + " " + ((sd) arrayList.get(i2)).aj;
        }
        return str2.concat(" >");
    }
}
