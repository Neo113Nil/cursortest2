package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p00 {
    public final ArrayList a = new ArrayList();
    public final d80 b;
    public er c;
    public er d;
    public int e;
    public boolean f;

    public p00(d80 d80Var, ArrayList arrayList) {
        er erVar = er.e;
        this.c = erVar;
        this.d = erVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = d80Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            er erVar2 = d80Var.c;
            er erVar3 = d80Var.d;
            this.c = erVar2;
            this.d = erVar3;
            c();
            b(d80Var.e);
        }
        this.b = d80Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ec ecVar = (ec) list.get(i);
            ecVar.getClass();
            if (true == z) {
                p00 p00Var = ecVar.c;
                if (p00Var != null) {
                    throw new IllegalStateException(ecVar + " (" + (i + 1) + "/" + size + ") is already controlled by " + p00Var + " but is still added to " + this);
                }
                ecVar.c = this;
                this.a.add(ecVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ec ecVar = (ec) arrayList.get(size);
            if (!ecVar.d && ecVar.e != i) {
                ecVar.e = i;
                throw null;
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ec ecVar = (ec) arrayList.get(size);
        er erVar = this.c;
        er erVar2 = this.d;
        ecVar.a = erVar;
        ecVar.b = erVar2;
        throw null;
    }
}
