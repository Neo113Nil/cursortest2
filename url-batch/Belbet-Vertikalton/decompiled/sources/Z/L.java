package Z;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class L extends androidx.lifecycle.O {

    /* renamed from: h, reason: collision with root package name */
    public static final K f1476h = new K(0);
    public final boolean e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1477b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1478c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1479d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1480f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1481g = false;

    public L(boolean z2) {
        this.e = z2;
    }

    @Override // androidx.lifecycle.O
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1480f = true;
    }

    public final void c(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0053q);
        }
        d(abstractComponentCallbacksC0053q.e);
    }

    public final void d(String str) {
        HashMap hashMap = this.f1478c;
        L l2 = (L) hashMap.get(str);
        if (l2 != null) {
            l2.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f1479d;
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) hashMap2.get(str);
        if (q2 != null) {
            q2.a();
            hashMap2.remove(str);
        }
    }

    public final void e(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        if (this.f1481g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1477b.remove(abstractComponentCallbacksC0053q.e) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0053q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l2 = (L) obj;
        return this.f1477b.equals(l2.f1477b) && this.f1478c.equals(l2.f1478c) && this.f1479d.equals(l2.f1479d);
    }

    public final int hashCode() {
        return this.f1479d.hashCode() + ((this.f1478c.hashCode() + (this.f1477b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1477b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1478c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1479d.keySet().iterator();
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
