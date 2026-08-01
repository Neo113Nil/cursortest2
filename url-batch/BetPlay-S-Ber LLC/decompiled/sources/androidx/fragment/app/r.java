package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class r {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public o d;

    public final void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        q qVar = (q) this.b.get(str);
        if (qVar != null) {
            return qVar.c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (q qVar : this.b.values()) {
            if (qVar != null && (findFragmentByWho = qVar.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (q qVar : this.b.values()) {
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (q qVar : this.b.values()) {
            if (qVar != null) {
                arrayList.add(qVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(q qVar) {
        Fragment fragment = qVar.c;
        String str = fragment.mWho;
        HashMap hashMap = this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, qVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z = fragment.mRetainInstance;
            o oVar = this.d;
            if (z) {
                oVar.c(fragment);
            } else {
                oVar.f(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (n.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(q qVar) {
        Fragment fragment = qVar.c;
        if (fragment.mRetainInstance) {
            this.d.f(fragment);
        }
        if (((q) this.b.put(fragment.mWho, null)) != null && n.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }
}
