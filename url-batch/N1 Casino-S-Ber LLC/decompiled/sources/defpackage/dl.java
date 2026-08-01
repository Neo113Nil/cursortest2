package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class dl extends f90 {
    public static final dh i = new dh(23);
    public final boolean f;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean g = false;
    public boolean h = false;

    public dl(boolean z) {
        this.f = z;
    }

    @Override // defpackage.f90
    public final void b() {
        if (bl.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.g = true;
    }

    public final void c(mk mkVar) {
        if (bl.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + mkVar);
        }
        d(mkVar.j);
    }

    public final void d(String str) {
        HashMap hashMap = this.d;
        dl dlVar = (dl) hashMap.get(str);
        if (dlVar != null) {
            dlVar.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.e;
        i90 i90Var = (i90) hashMap2.get(str);
        if (i90Var != null) {
            i90Var.a();
            hashMap2.remove(str);
        }
    }

    public final void e(mk mkVar) {
        if (this.h) {
            if (bl.G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.c.remove(mkVar.j) == null || !bl.G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + mkVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dl.class == obj.getClass()) {
            dl dlVar = (dl) obj;
            if (this.c.equals(dlVar.c) && this.d.equals(dlVar.d) && this.e.equals(dlVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.e.keySet().iterator();
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
