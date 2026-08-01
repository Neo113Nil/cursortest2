package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class fz {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public fz(int i) {
        this.a = 0;
        this.b = i;
        if (i <= 0) {
            s9.k("maxSize <= 0");
            throw null;
        }
        this.f = new gz(0);
        this.g = new xy(0);
    }

    public void a() {
        View view = (View) ((ArrayList) this.f).get(r0.size() - 1);
        we0 we0Var = (we0) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).r.b(view);
        we0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int c() {
        return ((StaggeredGridLayoutManager) this.g).w ? e(r1.size() - 1, -1) : e(0, ((ArrayList) this.f).size());
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.g).w ? e(0, ((ArrayList) this.f).size()) : e(r1.size() - 1, -1);
    }

    public int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int k = staggeredGridLayoutManager.r.k();
        int g = staggeredGridLayoutManager.r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f).get(i);
            int e = staggeredGridLayoutManager.r.e(view);
            int b = staggeredGridLayoutManager.r.b(view);
            boolean z = e <= g;
            boolean z2 = b >= k;
            if (z && z2 && (e < k || b > g)) {
                return h80.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public Object f(Object obj) {
        synchronized (((xy) this.g)) {
            gz gzVar = (gz) this.f;
            gzVar.getClass();
            Object obj2 = gzVar.a.get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public int g(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public View h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && h80.H(view2) >= i) || ((!staggeredGridLayoutManager.w && h80.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.w && h80.H(view3) <= i) || ((!staggeredGridLayoutManager.w && h80.H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int i(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        we0 we0Var = (we0) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.g).r.e(view);
        we0Var.getClass();
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(Object obj, Object obj2) {
        Object put;
        synchronized (((xy) this.g)) {
            this.c++;
            put = ((gz) this.f).a.put(obj, obj2);
            if (put != null) {
                this.c--;
            }
        }
        int i = this.b;
        while (true) {
            synchronized (((xy) this.g)) {
                try {
                    if (this.c < 0 || (((gz) this.f).a.isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c <= i || ((gz) this.f).a.isEmpty()) {
                        break;
                    }
                    Set entrySet = ((gz) this.f).a.entrySet();
                    entrySet.getClass();
                    Object obj3 = null;
                    if (entrySet instanceof List) {
                        List list = (List) entrySet;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = entrySet.iterator();
                        if (it.hasNext()) {
                            obj3 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    gz gzVar = (gz) this.f;
                    gzVar.getClass();
                    key.getClass();
                    gzVar.a.remove(key);
                    int i2 = this.c;
                    value.getClass();
                    this.c = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 0:
                synchronized (((xy) this.g)) {
                    try {
                        int i = this.d;
                        int i2 = this.e + i;
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public fz(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.a = 1;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
