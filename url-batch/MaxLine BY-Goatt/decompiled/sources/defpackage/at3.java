package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class at3 implements p30 {
    public final Object m;
    public final Cloneable n;

    public at3() {
        this.m = new TreeMap();
        this.n = new TreeMap();
    }

    public void a(js0 js0Var, t13 t13Var) {
        dm3 dm3Var = new dm3(t13Var);
        TreeMap treeMap = (TreeMap) this.m;
        for (Integer num : treeMap.keySet()) {
            jb3 clone = ((jb3) t13Var.p).clone();
            kc3 h = ((ic3) treeMap.get(num)).h(js0Var, Collections.singletonList(dm3Var));
            int s = h instanceof xb3 ? ak2.s(((xb3) h).m.doubleValue()) : -1;
            if (s == 2 || s == -1) {
                t13Var.p = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.n;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            kc3 h2 = ((ic3) treeMap2.get((Integer) it.next())).h(js0Var, Collections.singletonList(dm3Var));
            if (h2 instanceof xb3) {
                ak2.s(((xb3) h2).m.doubleValue());
            }
        }
    }

    @Override // defpackage.p30
    public Object g(jt2 jt2Var) {
        ic2 ic2Var = (ic2) this.m;
        Bundle bundle = (Bundle) this.n;
        ic2Var.getClass();
        if (!jt2Var.m()) {
            return jt2Var;
        }
        Bundle bundle2 = (Bundle) jt2Var.i();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? jt2Var : ic2Var.a(bundle).o(of3.o, by1.L);
    }

    public /* synthetic */ at3(ic2 ic2Var, Bundle bundle) {
        this.m = ic2Var;
        this.n = bundle;
    }
}
