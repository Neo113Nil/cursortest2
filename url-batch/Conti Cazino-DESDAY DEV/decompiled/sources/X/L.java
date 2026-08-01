package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class L extends androidx.lifecycle.M {
    public static final K h = new K(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f843e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f841b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f842c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f844f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f845g = false;

    public L(boolean z2) {
        this.f843e = z2;
    }

    @Override // androidx.lifecycle.M
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f844f = true;
    }

    public final void c(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0048q);
        }
        d(abstractComponentCallbacksC0048q.f971e);
    }

    public final void d(String str) {
        HashMap hashMap = this.f842c;
        L l2 = (L) hashMap.get(str);
        if (l2 != null) {
            l2.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap2.get(str);
        if (o2 != null) {
            o2.a();
            hashMap2.remove(str);
        }
    }

    public final void e(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (this.f845g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f841b.remove(abstractComponentCallbacksC0048q.f971e) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0048q);
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
        return this.f841b.equals(l2.f841b) && this.f842c.equals(l2.f842c) && this.d.equals(l2.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f842c.hashCode() + (this.f841b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f841b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f842c.keySet().iterator();
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
