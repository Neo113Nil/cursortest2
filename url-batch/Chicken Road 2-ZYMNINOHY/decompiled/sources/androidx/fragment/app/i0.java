package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i0 extends androidx.lifecycle.J {

    /* renamed from: j, reason: collision with root package name */
    public static final S.b f4885j = new S.b(1);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4889g;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4886d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f4887e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4888f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f4890h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4891i = false;

    public i0(boolean z) {
        this.f4889g = z;
    }

    @Override // androidx.lifecycle.J
    public final void b() {
        if (f0.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4890h = true;
    }

    public final void c(F f4) {
        if (this.f4891i) {
            if (f0.J(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = f4.mWho;
        HashMap hashMap = this.f4886d;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(f4.mWho, f4);
        if (f0.J(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + f4);
        }
    }

    public final void d(F f4, boolean z) {
        if (f0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + f4);
        }
        f(f4.mWho, z);
    }

    public final void e(String str, boolean z) {
        if (f0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f4886d.equals(i0Var.f4886d) && this.f4887e.equals(i0Var.f4887e) && this.f4888f.equals(i0Var.f4888f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z) {
        HashMap hashMap = this.f4887e;
        i0 i0Var = (i0) hashMap.get(str);
        if (i0Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(i0Var.f4887e.keySet());
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    i0Var.e((String) obj, true);
                }
            }
            i0Var.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f4888f;
        androidx.lifecycle.O o = (androidx.lifecycle.O) hashMap2.get(str);
        if (o != null) {
            o.a();
            hashMap2.remove(str);
        }
    }

    public final void g(F f4) {
        if (this.f4891i) {
            if (f0.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4886d.remove(f4.mWho) == null || !f0.J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + f4);
        }
    }

    public final int hashCode() {
        return this.f4888f.hashCode() + ((this.f4887e.hashCode() + (this.f4886d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4886d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4887e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4888f.keySet().iterator();
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
