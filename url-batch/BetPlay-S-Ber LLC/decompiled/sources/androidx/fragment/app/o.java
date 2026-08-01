package androidx.fragment.app;

import android.util.Log;
import defpackage.m90;
import defpackage.q90;
import defpackage.vg;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class o extends m90 {
    public static final vg j = new vg(24);
    public final boolean g;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public boolean h = false;
    public boolean i = false;

    public o(boolean z) {
        this.g = z;
    }

    @Override // defpackage.m90
    public final void b() {
        if (n.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void c(Fragment fragment) {
        if (this.i) {
            if (n.G(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.mWho;
        HashMap hashMap = this.d;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (n.G(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void d(Fragment fragment) {
        if (n.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        e(fragment.mWho);
    }

    public final void e(String str) {
        HashMap hashMap = this.e;
        o oVar = (o) hashMap.get(str);
        if (oVar != null) {
            oVar.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f;
        q90 q90Var = (q90) hashMap2.get(str);
        if (q90Var != null) {
            q90Var.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.d.equals(oVar.d) && this.e.equals(oVar.e) && this.f.equals(oVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(Fragment fragment) {
        if (this.i) {
            if (n.G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.remove(fragment.mWho) == null || !n.G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
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
