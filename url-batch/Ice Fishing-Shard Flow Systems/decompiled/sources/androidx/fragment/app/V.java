package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class V extends androidx.lifecycle.W {

    /* renamed from: g, reason: collision with root package name */
    public static final U f3647g = new U(0);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3651d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3648a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3649b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3650c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3652e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3653f = false;

    public V(boolean z7) {
        this.f3651d = z7;
    }

    public final void b(ComponentCallbacksC0228t componentCallbacksC0228t, boolean z7) {
        if (Q.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC0228t);
        }
        d(componentCallbacksC0228t.f3803m, z7);
    }

    public final void c(String str, boolean z7) {
        if (Q.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        d(str, z7);
    }

    public final void d(String str, boolean z7) {
        HashMap hashMap = this.f3649b;
        V v7 = (V) hashMap.get(str);
        if (v7 != null) {
            if (z7) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(v7.f3649b.keySet());
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    v7.c((String) obj, true);
                }
            }
            v7.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f3650c;
        androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) hashMap2.get(str);
        if (b0Var != null) {
            b0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void e(ComponentCallbacksC0228t componentCallbacksC0228t) {
        if (this.f3653f) {
            if (Q.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3648a.remove(componentCallbacksC0228t.f3803m) == null || !Q.J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC0228t);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V.class == obj.getClass()) {
            V v7 = (V) obj;
            if (this.f3648a.equals(v7.f3648a) && this.f3649b.equals(v7.f3649b) && this.f3650c.equals(v7.f3650c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3650c.hashCode() + ((this.f3649b.hashCode() + (this.f3648a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.W
    public final void onCleared() {
        if (Q.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3652e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3648a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3649b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3650c.keySet().iterator();
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
