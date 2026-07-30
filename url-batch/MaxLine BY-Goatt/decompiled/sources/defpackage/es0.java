package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class es0 extends n53 {
    public static final ds0 h = new ds0(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public es0(boolean z) {
        this.e = z;
    }

    @Override // defpackage.n53
    public final void d() {
        if (as0.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void e(fr0 fr0Var) {
        if (this.g) {
            if (as0.G(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fr0Var.mWho;
        HashMap hashMap = this.b;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(fr0Var.mWho, fr0Var);
        if (as0.G(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fr0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && es0.class == obj.getClass()) {
            es0 es0Var = (es0) obj;
            if (this.b.equals(es0Var.b) && this.c.equals(es0Var.c) && this.d.equals(es0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(fr0 fr0Var) {
        if (as0.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fr0Var);
        }
        g(fr0Var.mWho);
    }

    public final void g(String str) {
        HashMap hashMap = this.c;
        es0 es0Var = (es0) hashMap.get(str);
        if (es0Var != null) {
            es0Var.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        t53 t53Var = (t53) hashMap2.get(str);
        if (t53Var != null) {
            t53Var.a();
            hashMap2.remove(str);
        }
    }

    public final void h(fr0 fr0Var) {
        if (this.g) {
            if (as0.G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(fr0Var.mWho) == null || !as0.G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fr0Var);
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
