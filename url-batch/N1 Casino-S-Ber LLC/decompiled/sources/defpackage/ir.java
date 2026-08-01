package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ir {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public ir(int i) {
        this.a = 0;
        this.b = i;
        if (i <= 0) {
            t8.k("maxSize <= 0");
            throw null;
        }
        this.f = new k0(29);
        this.g = new dh(26);
    }

    public void a(View view) {
        o30 o30Var = (o30) view.getLayoutParams();
        o30Var.e = this;
        ArrayList arrayList = (ArrayList) this.f;
        arrayList.add(view);
        this.c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.b = Integer.MIN_VALUE;
        }
        if (o30Var.a.i() || o30Var.a.l()) {
            this.d = ((StaggeredGridLayoutManager) this.g).r.c(view) + this.d;
        }
    }

    public void b() {
        p30 y;
        ArrayList arrayList = (ArrayList) this.f;
        View view = (View) arrayList.get(arrayList.size() - 1);
        o30 o30Var = (o30) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        this.c = staggeredGridLayoutManager.r.b(view);
        if (o30Var.f && (y = staggeredGridLayoutManager.B.y(o30Var.a.c())) != null && y.g == 1) {
            int i = this.c;
            int i2 = this.e;
            int[] iArr = y.h;
            this.c = (iArr == null ? 0 : iArr[i2]) + i;
        }
    }

    public void c() {
        p30 y;
        View view = (View) ((ArrayList) this.f).get(0);
        o30 o30Var = (o30) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        this.b = staggeredGridLayoutManager.r.e(view);
        if (o30Var.f && (y = staggeredGridLayoutManager.B.y(o30Var.a.c())) != null && y.g == -1) {
            int i = this.b;
            int i2 = this.e;
            int[] iArr = y.h;
            this.b = i - (iArr != null ? iArr[i2] : 0);
        }
    }

    public void d() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.g).w ? g(r1.size() - 1, -1) : g(0, ((ArrayList) this.f).size());
    }

    public int f() {
        return ((StaggeredGridLayoutManager) this.g).w ? g(0, ((ArrayList) this.f).size()) : g(r1.size() - 1, -1);
    }

    public int g(int i, int i2) {
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
                return xy.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public Object h(Object obj) {
        synchronized (((dh) this.g)) {
            k0 k0Var = (k0) this.f;
            k0Var.getClass();
            Object obj2 = ((LinkedHashMap) k0Var.g).get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public int i(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        b();
        return this.c;
    }

    public View j(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && xy.H(view2) >= i) || ((!staggeredGridLayoutManager.w && xy.H(view2) <= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.w && xy.H(view3) <= i) || ((!staggeredGridLayoutManager.w && xy.H(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int k(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        c();
        return this.b;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        o30 o30Var = (o30) view.getLayoutParams();
        o30Var.e = null;
        if (o30Var.a.i() || o30Var.a.l()) {
            this.d -= ((StaggeredGridLayoutManager) this.g).r.c(view);
        }
        if (size == 1) {
            this.b = Integer.MIN_VALUE;
        }
        this.c = Integer.MIN_VALUE;
    }

    public void m() {
        ArrayList arrayList = (ArrayList) this.f;
        View view = (View) arrayList.remove(0);
        o30 o30Var = (o30) view.getLayoutParams();
        o30Var.e = null;
        if (arrayList.size() == 0) {
            this.c = Integer.MIN_VALUE;
        }
        if (o30Var.a.i() || o30Var.a.l()) {
            this.d -= ((StaggeredGridLayoutManager) this.g).r.c(view);
        }
        this.b = Integer.MIN_VALUE;
    }

    public void n(View view) {
        o30 o30Var = (o30) view.getLayoutParams();
        o30Var.e = this;
        ArrayList arrayList = (ArrayList) this.f;
        arrayList.add(0, view);
        this.b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.c = Integer.MIN_VALUE;
        }
        if (o30Var.a.i() || o30Var.a.l()) {
            this.d = ((StaggeredGridLayoutManager) this.g).r.c(view) + this.d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(Object obj, Object obj2) {
        Object put;
        synchronized (((dh) this.g)) {
            this.c++;
            put = ((LinkedHashMap) ((k0) this.f).g).put(obj, obj2);
            if (put != null) {
                this.c--;
            }
        }
        int i = this.b;
        while (true) {
            synchronized (((dh) this.g)) {
                try {
                    if (this.c < 0 || (((LinkedHashMap) ((k0) this.f).g).isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c <= i || ((LinkedHashMap) ((k0) this.f).g).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) ((k0) this.f).g).entrySet();
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
                    k0 k0Var = (k0) this.f;
                    k0Var.getClass();
                    key.getClass();
                    ((LinkedHashMap) k0Var.g).remove(key);
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
                synchronized (((dh) this.g)) {
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

    public ir(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.a = 1;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
