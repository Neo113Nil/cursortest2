package Y;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class L extends androidx.lifecycle.O {
    public static final K h = new K(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1334e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1332b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1333c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1335f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1336g = false;

    public L(boolean z2) {
        this.f1334e = z2;
    }

    @Override // androidx.lifecycle.O
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1335f = true;
    }

    public final void c(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0050q);
        }
        d(abstractComponentCallbacksC0050q.f1462e);
    }

    public final void d(String str) {
        HashMap hashMap = this.f1333c;
        L l2 = (L) hashMap.get(str);
        if (l2 != null) {
            l2.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) hashMap2.get(str);
        if (q2 != null) {
            q2.a();
            hashMap2.remove(str);
        }
    }

    public final void e(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        if (this.f1336g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1332b.remove(abstractComponentCallbacksC0050q.f1462e) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0050q);
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
        return this.f1332b.equals(l2.f1332b) && this.f1333c.equals(l2.f1333c) && this.d.equals(l2.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f1333c.hashCode() + (this.f1332b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1332b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1333c.keySet().iterator();
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
