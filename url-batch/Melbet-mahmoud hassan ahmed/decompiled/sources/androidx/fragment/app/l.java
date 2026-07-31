package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
class l extends u {

    /* renamed from: i, reason: collision with root package name */
    private static final v.a f744i = new a();

    /* renamed from: f, reason: collision with root package name */
    private final boolean f748f;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<Fragment> f745c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, l> f746d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, w> f747e = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f749g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f750h = false;

    static class a implements v.a {
        a() {
        }

        @Override // androidx.lifecycle.v.a
        public <T extends u> T a(Class<T> cls) {
            return new l(true);
        }
    }

    l(boolean z6) {
        this.f748f = z6;
    }

    static l g(w wVar) {
        return (l) new v(wVar, f744i).a(l.class);
    }

    @Override // androidx.lifecycle.u
    protected void c() {
        if (j.M) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f749g = true;
    }

    boolean d(Fragment fragment) {
        return this.f745c.add(fragment);
    }

    void e(Fragment fragment) {
        if (j.M) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = this.f746d.get(fragment.f599j);
        if (lVar != null) {
            lVar.c();
            this.f746d.remove(fragment.f599j);
        }
        w wVar = this.f747e.get(fragment.f599j);
        if (wVar != null) {
            wVar.a();
            this.f747e.remove(fragment.f599j);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f745c.equals(lVar.f745c) && this.f746d.equals(lVar.f746d) && this.f747e.equals(lVar.f747e);
    }

    l f(Fragment fragment) {
        l lVar = this.f746d.get(fragment.f599j);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.f748f);
        this.f746d.put(fragment.f599j, lVar2);
        return lVar2;
    }

    Collection<Fragment> h() {
        return this.f745c;
    }

    public int hashCode() {
        return (((this.f745c.hashCode() * 31) + this.f746d.hashCode()) * 31) + this.f747e.hashCode();
    }

    w i(Fragment fragment) {
        w wVar = this.f747e.get(fragment.f599j);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w();
        this.f747e.put(fragment.f599j, wVar2);
        return wVar2;
    }

    boolean j() {
        return this.f749g;
    }

    boolean k(Fragment fragment) {
        return this.f745c.remove(fragment);
    }

    boolean l(Fragment fragment) {
        if (this.f745c.contains(fragment)) {
            return this.f748f ? this.f749g : !this.f750h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f745c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f746d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f747e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
