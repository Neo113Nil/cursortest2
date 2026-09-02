package f1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1399a;

    /* renamed from: b, reason: collision with root package name */
    public int f1400b;

    /* renamed from: c, reason: collision with root package name */
    public int f1401c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1402e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1403f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1404g;

    public j1(int i) {
        this.f1399a = 1;
        this.f1400b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1403f = new a0.a(26);
        this.f1404g = new l2.f(24);
    }

    public void a() {
        View view = (View) ((ArrayList) this.f1403f).get(r0.size() - 1);
        g1 g1Var = (g1) view.getLayoutParams();
        this.f1401c = ((StaggeredGridLayoutManager) this.f1404g).f705r.b(view);
        g1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f1403f).clear();
        this.f1400b = Integer.MIN_VALUE;
        this.f1401c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int c() {
        return ((StaggeredGridLayoutManager) this.f1404g).f710w ? e(r0.size() - 1, -1) : e(0, ((ArrayList) this.f1403f).size());
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.f1404g).f710w ? e(0, ((ArrayList) this.f1403f).size()) : e(r0.size() - 1, -1);
    }

    public int e(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f1404g;
        int k4 = staggeredGridLayoutManager.f705r.k();
        int g4 = staggeredGridLayoutManager.f705r.g();
        int i5 = i4 > i ? 1 : -1;
        while (i != i4) {
            View view = (View) ((ArrayList) this.f1403f).get(i);
            int e4 = staggeredGridLayoutManager.f705r.e(view);
            int b4 = staggeredGridLayoutManager.f705r.b(view);
            boolean z3 = e4 <= g4;
            boolean z4 = b4 >= k4;
            if (z3 && z4 && (e4 < k4 || b4 > g4)) {
                return m0.H(view);
            }
            i += i5;
        }
        return -1;
    }

    public Object f(Object obj) {
        f3.d.e(obj, "key");
        synchronized (((l2.f) this.f1404g)) {
            a0.a aVar = (a0.a) this.f1403f;
            aVar.getClass();
            Object obj2 = ((LinkedHashMap) aVar.f81g).get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.f1402e++;
            return null;
        }
    }

    public int g(int i) {
        int i4 = this.f1401c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (((ArrayList) this.f1403f).size() == 0) {
            return i;
        }
        a();
        return this.f1401c;
    }

    public View h(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f1404g;
        ArrayList arrayList = (ArrayList) this.f1403f;
        View view = null;
        if (i4 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f710w && m0.H(view2) >= i) || ((!staggeredGridLayoutManager.f710w && m0.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            View view3 = (View) arrayList.get(i5);
            if ((staggeredGridLayoutManager.f710w && m0.H(view3) <= i) || ((!staggeredGridLayoutManager.f710w && m0.H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i5++;
            view = view3;
        }
        return view;
    }

    public int i(int i) {
        ArrayList arrayList = (ArrayList) this.f1403f;
        int i4 = this.f1400b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        g1 g1Var = (g1) view.getLayoutParams();
        this.f1400b = ((StaggeredGridLayoutManager) this.f1404g).f705r.e(view);
        g1Var.getClass();
        return this.f1400b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(Object obj, Object obj2) {
        Object put;
        f3.d.e(obj, "key");
        synchronized (((l2.f) this.f1404g)) {
            this.f1401c++;
            a0.a aVar = (a0.a) this.f1403f;
            aVar.getClass();
            put = ((LinkedHashMap) aVar.f81g).put(obj, obj2);
            if (put != null) {
                this.f1401c--;
            }
        }
        int i = this.f1400b;
        while (true) {
            synchronized (((l2.f) this.f1404g)) {
                try {
                    if (this.f1401c < 0 || (((LinkedHashMap) ((a0.a) this.f1403f).f81g).isEmpty() && this.f1401c != 0)) {
                        break;
                    }
                    if (this.f1401c <= i || ((LinkedHashMap) ((a0.a) this.f1403f).f81g).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) ((a0.a) this.f1403f).f81g).entrySet();
                    f3.d.d(entrySet, "map.entries");
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
                    a0.a aVar2 = (a0.a) this.f1403f;
                    aVar2.getClass();
                    f3.d.e(key, "key");
                    ((LinkedHashMap) aVar2.f81g).remove(key);
                    int i4 = this.f1401c;
                    f3.d.e(value, "value");
                    this.f1401c = i4 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.f1399a) {
            case 1:
                synchronized (((l2.f) this.f1404g)) {
                    try {
                        int i = this.d;
                        int i4 = this.f1402e + i;
                        str = "LruCache[maxSize=" + this.f1400b + ",hits=" + this.d + ",misses=" + this.f1402e + ",hitRate=" + (i4 != 0 ? (i * 100) / i4 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public j1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f1399a = 0;
        this.f1404g = staggeredGridLayoutManager;
        this.f1403f = new ArrayList();
        this.f1400b = Integer.MIN_VALUE;
        this.f1401c = Integer.MIN_VALUE;
        this.d = 0;
        this.f1402e = i;
    }
}
