package g1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1856a;

    /* renamed from: b, reason: collision with root package name */
    public int f1857b;

    /* renamed from: c, reason: collision with root package name */
    public int f1858c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1859e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1860f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1861g;

    public y1(int i) {
        this.f1856a = 1;
        this.f1857b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1860f = new q3.a(1);
        this.f1861g = new o2.f(24);
    }

    public void a() {
        View view = (View) ((ArrayList) this.f1860f).get(r0.size() - 1);
        v1 v1Var = (v1) view.getLayoutParams();
        this.f1858c = ((StaggeredGridLayoutManager) this.f1861g).f806r.b(view);
        v1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f1860f).clear();
        this.f1857b = Integer.MIN_VALUE;
        this.f1858c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int c() {
        return ((StaggeredGridLayoutManager) this.f1861g).f811w ? e(r0.size() - 1, -1) : e(0, ((ArrayList) this.f1860f).size());
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.f1861g).f811w ? e(0, ((ArrayList) this.f1860f).size()) : e(r0.size() - 1, -1);
    }

    public int e(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f1861g;
        int k4 = staggeredGridLayoutManager.f806r.k();
        int g3 = staggeredGridLayoutManager.f806r.g();
        int i5 = i4 > i ? 1 : -1;
        while (i != i4) {
            View view = (View) ((ArrayList) this.f1860f).get(i);
            int e4 = staggeredGridLayoutManager.f806r.e(view);
            int b2 = staggeredGridLayoutManager.f806r.b(view);
            boolean z4 = e4 <= g3;
            boolean z5 = b2 >= k4;
            if (z4 && z5 && (e4 < k4 || b2 > g3)) {
                return a1.G(view);
            }
            i += i5;
        }
        return -1;
    }

    public Object f(Object obj) {
        i3.d.e(obj, "key");
        synchronized (((o2.f) this.f1861g)) {
            q3.a aVar = (q3.a) this.f1860f;
            aVar.getClass();
            Object obj2 = ((LinkedHashMap) aVar.f3172a).get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.f1859e++;
            return null;
        }
    }

    public int g(int i) {
        int i4 = this.f1858c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (((ArrayList) this.f1860f).size() == 0) {
            return i;
        }
        a();
        return this.f1858c;
    }

    public View h(int i, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f1861g;
        ArrayList arrayList = (ArrayList) this.f1860f;
        View view = null;
        if (i4 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f811w && a1.G(view2) >= i) || ((!staggeredGridLayoutManager.f811w && a1.G(view2) <= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.f811w && a1.G(view3) <= i) || ((!staggeredGridLayoutManager.f811w && a1.G(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i5++;
            view = view3;
        }
        return view;
    }

    public int i(int i) {
        ArrayList arrayList = (ArrayList) this.f1860f;
        int i4 = this.f1857b;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        v1 v1Var = (v1) view.getLayoutParams();
        this.f1857b = ((StaggeredGridLayoutManager) this.f1861g).f806r.e(view);
        v1Var.getClass();
        return this.f1857b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(Object obj, Object obj2) {
        Object put;
        i3.d.e(obj, "key");
        synchronized (((o2.f) this.f1861g)) {
            this.f1858c++;
            q3.a aVar = (q3.a) this.f1860f;
            aVar.getClass();
            put = ((LinkedHashMap) aVar.f3172a).put(obj, obj2);
            if (put != null) {
                this.f1858c--;
            }
        }
        int i = this.f1857b;
        while (true) {
            synchronized (((o2.f) this.f1861g)) {
                try {
                    if (this.f1858c < 0 || (((LinkedHashMap) ((q3.a) this.f1860f).f3172a).isEmpty() && this.f1858c != 0)) {
                        break;
                    }
                    if (this.f1858c <= i || ((LinkedHashMap) ((q3.a) this.f1860f).f3172a).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) ((q3.a) this.f1860f).f3172a).entrySet();
                    i3.d.d(entrySet, "map.entries");
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
                    q3.a aVar2 = (q3.a) this.f1860f;
                    aVar2.getClass();
                    i3.d.e(key, "key");
                    ((LinkedHashMap) aVar2.f3172a).remove(key);
                    int i4 = this.f1858c;
                    i3.d.e(value, "value");
                    this.f1858c = i4 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.f1856a) {
            case 1:
                synchronized (((o2.f) this.f1861g)) {
                    try {
                        int i = this.d;
                        int i4 = this.f1859e + i;
                        str = "LruCache[maxSize=" + this.f1857b + ",hits=" + this.d + ",misses=" + this.f1859e + ",hitRate=" + (i4 != 0 ? (i * 100) / i4 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public y1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f1856a = 0;
        this.f1861g = staggeredGridLayoutManager;
        this.f1860f = new ArrayList();
        this.f1857b = Integer.MIN_VALUE;
        this.f1858c = Integer.MIN_VALUE;
        this.d = 0;
        this.f1859e = i;
    }
}
