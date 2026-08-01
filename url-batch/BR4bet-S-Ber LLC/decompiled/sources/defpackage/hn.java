package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hn extends pc0 {
    public static final gn h = new gn(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public hn(boolean z) {
        this.e = z;
    }

    @Override // defpackage.pc0
    public final void c() {
        if (en.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void d(pm pmVar) {
        if (en.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + pmVar);
        }
        e(pmVar.j);
    }

    public final void e(String str) {
        HashMap hashMap = this.c;
        hn hnVar = (hn) hashMap.get(str);
        if (hnVar != null) {
            hnVar.c();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        tc0 tc0Var = (tc0) hashMap2.get(str);
        if (tc0Var != null) {
            tc0Var.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hn.class == obj.getClass()) {
            hn hnVar = (hn) obj;
            if (this.b.equals(hnVar.b) && this.c.equals(hnVar.c) && this.d.equals(hnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(pm pmVar) {
        if (this.g) {
            if (en.G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(pmVar.j) == null || !en.G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + pmVar);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
