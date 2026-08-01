package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class O extends androidx.lifecycle.P {
    public static final N h = new N(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1258e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1255b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1256c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1257d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1259f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1260g = false;

    public O(boolean z2) {
        this.f1258e = z2;
    }

    @Override // androidx.lifecycle.P
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1259f = true;
    }

    public final void c(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0060q);
        }
        d(abstractComponentCallbacksC0060q.f1398e);
    }

    public final void d(String str) {
        HashMap hashMap = this.f1256c;
        O o2 = (O) hashMap.get(str);
        if (o2 != null) {
            o2.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f1257d;
        androidx.lifecycle.U u2 = (androidx.lifecycle.U) hashMap2.get(str);
        if (u2 != null) {
            u2.a();
            hashMap2.remove(str);
        }
    }

    public final void e(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (this.f1260g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1255b.remove(abstractComponentCallbacksC0060q.f1398e) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0060q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O.class != obj.getClass()) {
            return false;
        }
        O o2 = (O) obj;
        return this.f1255b.equals(o2.f1255b) && this.f1256c.equals(o2.f1256c) && this.f1257d.equals(o2.f1257d);
    }

    public final int hashCode() {
        return this.f1257d.hashCode() + ((this.f1256c.hashCode() + (this.f1255b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1255b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1256c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1257d.keySet().iterator();
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
