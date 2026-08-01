package defpackage;

import androidx.fragment.app.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dq {
    public boolean a;
    public final Serializable b;
    public final Object c;
    public final Object d;

    public dq(c cVar) {
        this.d = cVar;
        this.b = new ArrayList();
        this.a = false;
        this.c = new CopyOnWriteArrayList();
    }

    public void a(boolean z) {
        j30 j30Var;
        this.a = z;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t40 t40Var = (t40) obj;
            boolean z2 = t40Var.e && z;
            if (t40Var.b != z2) {
                t40Var.b = z2;
                wi wiVar = t40Var.c;
                if (wiVar != null && (j30Var = (j30) wiVar.g) != null) {
                    j30Var.b();
                }
            }
        }
    }

    public dq(int i) {
        this.b = new ReentrantLock();
        this.c = new long[i];
        this.d = new boolean[i];
    }
}
