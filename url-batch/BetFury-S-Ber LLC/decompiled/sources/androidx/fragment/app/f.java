package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class f {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public FragmentManagerViewModel d;

    public final void a(a aVar) {
        if (this.a.contains(aVar)) {
            throw new IllegalStateException("Fragment already added: " + aVar);
        }
        synchronized (this.a) {
            this.a.add(aVar);
        }
        aVar.p = true;
    }

    public final a b(String str) {
        e eVar = (e) this.b.get(str);
        if (eVar != null) {
            return eVar.c;
        }
        return null;
    }

    public final a c(String str) {
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                a aVar = eVar.c;
                if (!str.equals(aVar.j)) {
                    aVar = aVar.y.c.c(str);
                }
                if (aVar != null) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(e eVar) {
        a aVar = eVar.c;
        String str = aVar.j;
        HashMap hashMap = this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(aVar.j, eVar);
        if (c.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + aVar);
        }
    }

    public final void h(e eVar) {
        a aVar = eVar.c;
        if (aVar.F) {
            this.d.removeRetainedFragment(aVar);
        }
        if (((e) this.b.put(aVar.j, null)) != null && c.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + aVar);
        }
    }
}
