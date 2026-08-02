package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4931a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4932b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4933c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public i0 f4934d;

    public final void a(F f4) {
        if (this.f4931a.contains(f4)) {
            throw new IllegalStateException("Fragment already added: " + f4);
        }
        synchronized (this.f4931a) {
            this.f4931a.add(f4);
        }
        f4.mAdded = true;
    }

    public final F b(String str) {
        m0 m0Var = (m0) this.f4932b.get(str);
        if (m0Var != null) {
            return m0Var.f4925c;
        }
        return null;
    }

    public final F c(String str) {
        F findFragmentByWho;
        for (m0 m0Var : this.f4932b.values()) {
            if (m0Var != null && (findFragmentByWho = m0Var.f4925c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f4932b.values()) {
            if (m0Var != null) {
                arrayList.add(m0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f4932b.values()) {
            if (m0Var != null) {
                arrayList.add(m0Var.f4925c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f4931a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f4931a) {
            arrayList = new ArrayList(this.f4931a);
        }
        return arrayList;
    }

    public final void g(m0 m0Var) {
        F f4 = m0Var.f4925c;
        String str = f4.mWho;
        HashMap hashMap = this.f4932b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(f4.mWho, m0Var);
        if (f4.mRetainInstanceChangedWhileDetached) {
            if (f4.mRetainInstance) {
                this.f4934d.c(f4);
            } else {
                this.f4934d.g(f4);
            }
            f4.mRetainInstanceChangedWhileDetached = false;
        }
        if (f0.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + f4);
        }
    }

    public final void h(m0 m0Var) {
        F f4 = m0Var.f4925c;
        if (f4.mRetainInstance) {
            this.f4934d.g(f4);
        }
        String str = f4.mWho;
        HashMap hashMap = this.f4932b;
        if (hashMap.get(str) == m0Var && ((m0) hashMap.put(f4.mWho, null)) != null && f0.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + f4);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.f4933c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
