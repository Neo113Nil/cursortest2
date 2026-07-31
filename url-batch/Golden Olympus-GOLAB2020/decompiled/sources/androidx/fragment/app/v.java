package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class v extends V {

    /* renamed from: w, reason: collision with root package name */
    private static final Y.b f12511w = new a();

    /* renamed from: s, reason: collision with root package name */
    private final boolean f12515s;

    /* renamed from: p, reason: collision with root package name */
    private final HashMap f12512p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    private final HashMap f12513q = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    private final HashMap f12514r = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    private boolean f12516t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f12517u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12518v = false;

    class a implements Y.b {
        a() {
        }

        @Override // androidx.lifecycle.Y.b
        public V create(Class cls) {
            return new v(true);
        }
    }

    v(boolean z4) {
        this.f12515s = z4;
    }

    private void e(String str) {
        v vVar = (v) this.f12513q.get(str);
        if (vVar != null) {
            vVar.onCleared();
            this.f12513q.remove(str);
        }
        b0 b0Var = (b0) this.f12514r.get(str);
        if (b0Var != null) {
            b0Var.a();
            this.f12514r.remove(str);
        }
    }

    static v h(b0 b0Var) {
        return (v) new Y(b0Var, f12511w).a(v.class);
    }

    void b(Fragment fragment) {
        if (this.f12518v) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f12512p.containsKey(fragment.mWho)) {
                return;
            }
            this.f12512p.put(fragment.mWho, fragment);
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void c(Fragment fragment) {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        e(fragment.mWho);
    }

    void d(String str) {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f12512p.equals(vVar.f12512p) && this.f12513q.equals(vVar.f12513q) && this.f12514r.equals(vVar.f12514r)) {
                return true;
            }
        }
        return false;
    }

    Fragment f(String str) {
        return (Fragment) this.f12512p.get(str);
    }

    v g(Fragment fragment) {
        v vVar = (v) this.f12513q.get(fragment.mWho);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this.f12515s);
        this.f12513q.put(fragment.mWho, vVar2);
        return vVar2;
    }

    public int hashCode() {
        return (((this.f12512p.hashCode() * 31) + this.f12513q.hashCode()) * 31) + this.f12514r.hashCode();
    }

    Collection i() {
        return new ArrayList(this.f12512p.values());
    }

    b0 j(Fragment fragment) {
        b0 b0Var = (b0) this.f12514r.get(fragment.mWho);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0();
        this.f12514r.put(fragment.mWho, b0Var2);
        return b0Var2;
    }

    boolean k() {
        return this.f12516t;
    }

    void l(Fragment fragment) {
        if (this.f12518v) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f12512p.remove(fragment.mWho) == null || !FragmentManager.G0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void m(boolean z4) {
        this.f12518v = z4;
    }

    boolean n(Fragment fragment) {
        if (this.f12512p.containsKey(fragment.mWho)) {
            return this.f12515s ? this.f12516t : !this.f12517u;
        }
        return true;
    }

    @Override // androidx.lifecycle.V
    protected void onCleared() {
        if (FragmentManager.G0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f12516t = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f12512p.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f12513q.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f12514r.keySet().iterator();
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
