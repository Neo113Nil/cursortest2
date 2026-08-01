package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class mx {
    public final ArrayList a = new ArrayList();
    public final a50 b;
    public to c;
    public to d;
    public int e;
    public boolean f;

    public mx(a50 a50Var, ArrayList arrayList) {
        to toVar = to.e;
        this.c = toVar;
        this.d = toVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = a50Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            to toVar2 = a50Var.c;
            to toVar3 = a50Var.d;
            this.c = toVar2;
            this.d = toVar3;
            c();
            b(a50Var.e);
        }
        this.b = a50Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jb jbVar = (jb) list.get(i);
            jbVar.getClass();
            if (true == z) {
                mx mxVar = jbVar.c;
                if (mxVar != null) {
                    throw new IllegalStateException(jbVar + " (" + (i + 1) + "/" + size + ") is already controlled by " + mxVar + " but is still added to " + this);
                }
                jbVar.c = this;
                this.a.add(jbVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jb jbVar = (jb) arrayList.get(size);
            if (!jbVar.d && jbVar.e != i) {
                jbVar.e = i;
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
        jb jbVar = (jb) arrayList.get(size);
        to toVar = this.c;
        to toVar2 = this.d;
        jbVar.a = toVar;
        jbVar.b = toVar2;
        throw null;
    }
}
