package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class O extends androidx.lifecycle.P {
    public static final N h = new N(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1259e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1256b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1257c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1258d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1260f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1261g = false;

    public O(boolean z2) {
        this.f1259e = z2;
    }

    @Override // androidx.lifecycle.P
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1260f = true;
    }

    public final void c(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0060q);
        }
        d(abstractComponentCallbacksC0060q.f1399e);
    }

    public final void d(String str) {
        HashMap hashMap = this.f1257c;
        O o2 = (O) hashMap.get(str);
        if (o2 != null) {
            o2.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f1258d;
        androidx.lifecycle.U u2 = (androidx.lifecycle.U) hashMap2.get(str);
        if (u2 != null) {
            u2.a();
            hashMap2.remove(str);
        }
    }

    public final void e(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        if (this.f1261g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1256b.remove(abstractComponentCallbacksC0060q.f1399e) == null || !Log.isLoggable("FragmentManager", 2)) {
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
        return this.f1256b.equals(o2.f1256b) && this.f1257c.equals(o2.f1257c) && this.f1258d.equals(o2.f1258d);
    }

    public final int hashCode() {
        return this.f1258d.hashCode() + ((this.f1257c.hashCode() + (this.f1256b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1256b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1257c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1258d.keySet().iterator();
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
