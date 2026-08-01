package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class s60 {
    public final ArrayList a = new ArrayList();
    public final zg0 b;
    public fv c;
    public fv d;
    public int e;
    public boolean f;

    public s60(zg0 zg0Var, ArrayList arrayList) {
        fv fvVar = fv.e;
        this.c = fvVar;
        this.d = fvVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = zg0Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            fv fvVar2 = zg0Var.c;
            fv fvVar3 = zg0Var.d;
            this.c = fvVar2;
            this.d = fvVar3;
            c();
            b(zg0Var.e);
        }
        this.b = zg0Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dd ddVar = (dd) list.get(i);
            ddVar.getClass();
            if (true == z) {
                s60 s60Var = ddVar.c;
                if (s60Var != null) {
                    throw new IllegalStateException(ddVar + " (" + (i + 1) + "/" + size + ") is already controlled by " + s60Var + " but is still added to " + this);
                }
                ddVar.c = this;
                this.a.add(ddVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            dd ddVar = (dd) arrayList.get(size);
            if (!ddVar.d && ddVar.e != i) {
                ddVar.e = i;
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
        dd ddVar = (dd) arrayList.get(size);
        fv fvVar = this.c;
        fv fvVar2 = this.d;
        ddVar.a = fvVar;
        ddVar.b = fvVar2;
        throw null;
    }
}
