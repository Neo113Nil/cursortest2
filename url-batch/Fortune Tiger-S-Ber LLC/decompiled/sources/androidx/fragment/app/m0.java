package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m0 extends androidx.lifecycle.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static final g2.f f469i = new g2.f(7);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f472f;
    public final HashMap c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f470d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f471e = new HashMap();
    public boolean g = false;
    public boolean h = false;

    public m0(boolean z3) {
        this.f472f = z3;
    }

    @Override // androidx.lifecycle.l0
    public final void b() {
        if (k0.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.g = true;
    }

    public final void c(u uVar) {
        if (k0.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + uVar);
        }
        d(uVar.f522j);
    }

    public final void d(String str) {
        HashMap hashMap = this.f470d;
        m0 m0Var = (m0) hashMap.get(str);
        if (m0Var != null) {
            m0Var.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f471e;
        androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) hashMap2.get(str);
        if (o0Var != null) {
            o0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void e(u uVar) {
        if (this.h) {
            if (k0.G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.c.remove(uVar.f522j) == null || !k0.G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + uVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.c.equals(m0Var.c) && this.f470d.equals(m0Var.f470d) && this.f471e.equals(m0Var.f471e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f471e.hashCode() + ((this.f470d.hashCode() + (this.c.hashCode() * 31)) * 31);
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
        Iterator it2 = this.f470d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f471e.keySet().iterator();
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
