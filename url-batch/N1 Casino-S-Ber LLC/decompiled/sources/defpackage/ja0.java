package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ja0 {
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
                ja0 ja0Var = (ja0) arrayList.get(i);
                if (this.e == ja0Var.b) {
                    c(this.c, ja0Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(kq kqVar, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        bd bdVar = (bd) ((ad) arrayList.get(0)).T;
        kqVar.t();
        bdVar.b(kqVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ad) arrayList.get(i2)).b(kqVar, false);
        }
        if (i == 0 && bdVar.z0 > 0) {
            jw.f(bdVar, kqVar, arrayList, 0);
        }
        if (i == 1 && bdVar.A0 > 0) {
            jw.f(bdVar, kqVar, arrayList, 1);
        }
        try {
            kqVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ad adVar = (ad) arrayList.get(i3);
            vw vwVar = new vw(17);
            new WeakReference(adVar);
            kq.n(adVar.I);
            kq.n(adVar.J);
            kq.n(adVar.K);
            kq.n(adVar.L);
            kq.n(adVar.M);
            this.d.add(vwVar);
        }
        if (i == 0) {
            n = kq.n(bdVar.I);
            n2 = kq.n(bdVar.K);
            kqVar.t();
        } else {
            n = kq.n(bdVar.J);
            n2 = kq.n(bdVar.L);
            kqVar.t();
        }
        return n2 - n;
    }

    public final void c(int i, ja0 ja0Var) {
        int i2 = ja0Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ad adVar = (ad) obj;
            ArrayList arrayList2 = ja0Var.a;
            if (!arrayList2.contains(adVar)) {
                arrayList2.add(adVar);
            }
            if (i == 0) {
                adVar.n0 = i2;
            } else {
                adVar.o0 = i2;
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
            sb2 = sb2 + " " + ((ad) obj).h0;
        }
        return sb2.concat(" >");
    }
}
