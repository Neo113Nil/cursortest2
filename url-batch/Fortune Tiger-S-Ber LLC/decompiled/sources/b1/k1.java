package b1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f830a;

    /* renamed from: b, reason: collision with root package name */
    public int f831b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f832d;

    /* renamed from: e, reason: collision with root package name */
    public int f833e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f834f;
    public final Object g;

    public k1(int i4) {
        this.f830a = 1;
        this.f831b = i4;
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f834f = new a2.e(27);
        this.g = new g2.f(18);
    }

    public void a() {
        View view = (View) ((ArrayList) this.f834f).get(r0.size() - 1);
        h1 h1Var = (h1) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).f673r.b(view);
        h1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f834f).clear();
        this.f831b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.f832d = 0;
    }

    public int c() {
        return ((StaggeredGridLayoutManager) this.g).f678w ? e(r0.size() - 1, -1) : e(0, ((ArrayList) this.f834f).size());
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.g).f678w ? e(0, ((ArrayList) this.f834f).size()) : e(r0.size() - 1, -1);
    }

    public int e(int i4, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int k4 = staggeredGridLayoutManager.f673r.k();
        int g = staggeredGridLayoutManager.f673r.g();
        int i6 = i5 > i4 ? 1 : -1;
        while (i4 != i5) {
            View view = (View) ((ArrayList) this.f834f).get(i4);
            int e4 = staggeredGridLayoutManager.f673r.e(view);
            int b2 = staggeredGridLayoutManager.f673r.b(view);
            boolean z3 = e4 <= g;
            boolean z4 = b2 >= k4;
            if (z3 && z4 && (e4 < k4 || b2 > g)) {
                return n0.H(view);
            }
            i4 += i6;
        }
        return -1;
    }

    public Object f(Object obj) {
        u2.c.e(obj, "key");
        synchronized (((g2.f) this.g)) {
            a2.e eVar = (a2.e) this.f834f;
            eVar.getClass();
            Object obj2 = ((LinkedHashMap) eVar.g).get(obj);
            if (obj2 != null) {
                this.f832d++;
                return obj2;
            }
            this.f833e++;
            return null;
        }
    }

    public int g(int i4) {
        int i5 = this.c;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (((ArrayList) this.f834f).size() == 0) {
            return i4;
        }
        a();
        return this.c;
    }

    public View h(int i4, int i5) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f834f;
        View view = null;
        if (i5 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f678w && n0.H(view2) >= i4) || ((!staggeredGridLayoutManager.f678w && n0.H(view2) <= i4) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            View view3 = (View) arrayList.get(i6);
            if ((staggeredGridLayoutManager.f678w && n0.H(view3) <= i4) || ((!staggeredGridLayoutManager.f678w && n0.H(view3) >= i4) || !view3.hasFocusable())) {
                break;
            }
            i6++;
            view = view3;
        }
        return view;
    }

    public int i(int i4) {
        ArrayList arrayList = (ArrayList) this.f834f;
        int i5 = this.f831b;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (arrayList.size() == 0) {
            return i4;
        }
        View view = (View) arrayList.get(0);
        h1 h1Var = (h1) view.getLayoutParams();
        this.f831b = ((StaggeredGridLayoutManager) this.g).f673r.e(view);
        h1Var.getClass();
        return this.f831b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(Object obj, Object obj2) {
        Object put;
        u2.c.e(obj, "key");
        synchronized (((g2.f) this.g)) {
            this.c++;
            a2.e eVar = (a2.e) this.f834f;
            eVar.getClass();
            put = ((LinkedHashMap) eVar.g).put(obj, obj2);
            if (put != null) {
                this.c--;
            }
        }
        int i4 = this.f831b;
        while (true) {
            synchronized (((g2.f) this.g)) {
                try {
                    if (this.c < 0 || (((LinkedHashMap) ((a2.e) this.f834f).g).isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c <= i4 || ((LinkedHashMap) ((a2.e) this.f834f).g).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) ((a2.e) this.f834f).g).entrySet();
                    u2.c.d(entrySet, "map.entries");
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
                    a2.e eVar2 = (a2.e) this.f834f;
                    eVar2.getClass();
                    u2.c.e(key, "key");
                    ((LinkedHashMap) eVar2.g).remove(key);
                    int i5 = this.c;
                    u2.c.e(value, "value");
                    this.c = i5 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.f830a) {
            case 1:
                synchronized (((g2.f) this.g)) {
                    try {
                        int i4 = this.f832d;
                        int i5 = this.f833e + i4;
                        str = "LruCache[maxSize=" + this.f831b + ",hits=" + this.f832d + ",misses=" + this.f833e + ",hitRate=" + (i5 != 0 ? (i4 * 100) / i5 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public k1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.f830a = 0;
        this.g = staggeredGridLayoutManager;
        this.f834f = new ArrayList();
        this.f831b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.f832d = 0;
        this.f833e = i4;
    }
}
