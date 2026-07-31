package o;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5529a;

    /* renamed from: b, reason: collision with root package name */
    public int f5530b;

    /* renamed from: c, reason: collision with root package name */
    public int f5531c;

    /* renamed from: d, reason: collision with root package name */
    public int f5532d;

    /* renamed from: e, reason: collision with root package name */
    public int f5533e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5534f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5535g;

    public s(int i) {
        this.f5529a = 0;
        this.f5530b = i;
        if (i <= 0) {
            p.a.c("maxSize <= 0");
            throw null;
        }
        this.f5534f = new l4.d(1);
        this.f5535g = new p.b(0);
    }

    public void a() {
        View view = (View) ((ArrayList) this.f5534f).get(r0.size() - 1);
        w4.s0 s0Var = (w4.s0) view.getLayoutParams();
        this.f5531c = ((StaggeredGridLayoutManager) this.f5535g).f945m.c(view);
        s0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f5534f).clear();
        this.f5530b = Integer.MIN_VALUE;
        this.f5531c = Integer.MIN_VALUE;
        this.f5532d = 0;
    }

    public Object c(Object obj) {
        q6.i.e(obj, "key");
        synchronized (((p.b) this.f5535g)) {
            l4.d dVar = (l4.d) this.f5534f;
            dVar.getClass();
            Object obj2 = dVar.f4831a.get(obj);
            if (obj2 != null) {
                this.f5532d++;
                return obj2;
            }
            this.f5533e++;
            return null;
        }
    }

    public int d(int i) {
        int i8 = this.f5531c;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f5534f).size() == 0) {
            return i;
        }
        a();
        return this.f5531c;
    }

    public int e(int i) {
        ArrayList arrayList = (ArrayList) this.f5534f;
        int i8 = this.f5530b;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        w4.s0 s0Var = (w4.s0) view.getLayoutParams();
        this.f5530b = ((StaggeredGridLayoutManager) this.f5535g).f945m.f(view);
        s0Var.getClass();
        return this.f5530b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(Object obj, Object obj2) {
        Object put;
        q6.i.e(obj, "key");
        synchronized (((p.b) this.f5535g)) {
            this.f5531c++;
            l4.d dVar = (l4.d) this.f5534f;
            dVar.getClass();
            put = dVar.f4831a.put(obj, obj2);
            if (put != null) {
                this.f5531c--;
            }
        }
        int i = this.f5530b;
        while (true) {
            synchronized (((p.b) this.f5535g)) {
                try {
                    if (this.f5531c < 0 || (((l4.d) this.f5534f).f4831a.isEmpty() && this.f5531c != 0)) {
                        break;
                    }
                    if (this.f5531c <= i || ((l4.d) this.f5534f).f4831a.isEmpty()) {
                        break;
                    }
                    Set entrySet = ((l4.d) this.f5534f).f4831a.entrySet();
                    q6.i.d(entrySet, "<get-entries>(...)");
                    Set set = entrySet;
                    Object obj3 = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
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
                    l4.d dVar2 = (l4.d) this.f5534f;
                    dVar2.getClass();
                    q6.i.e(key, "key");
                    dVar2.f4831a.remove(key);
                    int i8 = this.f5531c;
                    q6.i.e(value, "value");
                    this.f5531c = i8 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.f5529a) {
            case 0:
                synchronized (((p.b) this.f5535g)) {
                    try {
                        int i = this.f5532d;
                        int i8 = this.f5533e + i;
                        str = "LruCache[maxSize=" + this.f5530b + ",hits=" + this.f5532d + ",misses=" + this.f5533e + ",hitRate=" + (i8 != 0 ? (i * 100) / i8 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public s(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f5529a = 1;
        this.f5535g = staggeredGridLayoutManager;
        this.f5534f = new ArrayList();
        this.f5530b = Integer.MIN_VALUE;
        this.f5531c = Integer.MIN_VALUE;
        this.f5532d = 0;
        this.f5533e = i;
    }
}
