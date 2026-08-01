package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m0 extends androidx.lifecycle.l0 {
    public static final l2.f i = new l2.f(7);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f479f;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f477c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f478e = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f480g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f481h = false;

    public m0(boolean z3) {
        this.f479f = z3;
    }

    @Override // androidx.lifecycle.l0
    public final void b() {
        if (k0.E(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f480g = true;
    }

    public final void c(u uVar) {
        if (k0.E(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + uVar);
        }
        d(uVar.f538j);
    }

    public final void d(String str) {
        HashMap hashMap = this.d;
        m0 m0Var = (m0) hashMap.get(str);
        if (m0Var != null) {
            m0Var.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f478e;
        androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) hashMap2.get(str);
        if (o0Var != null) {
            o0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void e(u uVar) {
        if (this.f481h) {
            if (k0.E(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f477c.remove(uVar.f538j) == null || !k0.E(2)) {
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
            if (this.f477c.equals(m0Var.f477c) && this.d.equals(m0Var.d) && this.f478e.equals(m0Var.f478e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f478e.hashCode() + ((this.d.hashCode() + (this.f477c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f477c.values().iterator();
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
        Iterator it3 = this.f478e.keySet().iterator();
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
