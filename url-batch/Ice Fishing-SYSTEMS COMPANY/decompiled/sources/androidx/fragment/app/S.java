package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class S extends androidx.lifecycle.S {

    /* renamed from: g, reason: collision with root package name */
    public static final Q f4996g = new Q(0);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5000d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4997a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4998b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4999c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f5001e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5002f = false;

    public S(boolean z8) {
        this.f5000d = z8;
    }

    public final void b(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (N.E(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0485s);
        }
        c(abstractComponentCallbacksC0485s.f5178x);
    }

    public final void c(String str) {
        HashMap hashMap = this.f4998b;
        S s3 = (S) hashMap.get(str);
        if (s3 != null) {
            s3.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f4999c;
        androidx.lifecycle.X x3 = (androidx.lifecycle.X) hashMap2.get(str);
        if (x3 != null) {
            x3.a();
            hashMap2.remove(str);
        }
    }

    public final void d(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (this.f5002f) {
            if (N.E(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4997a.remove(abstractComponentCallbacksC0485s.f5178x) == null || !N.E(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0485s);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S.class == obj.getClass()) {
            S s3 = (S) obj;
            if (this.f4997a.equals(s3.f4997a) && this.f4998b.equals(s3.f4998b) && this.f4999c.equals(s3.f4999c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4999c.hashCode() + ((this.f4998b.hashCode() + (this.f4997a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.S
    public final void onCleared() {
        if (N.E(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f5001e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4997a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4998b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4999c.keySet().iterator();
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
