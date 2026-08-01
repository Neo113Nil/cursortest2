package q;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256a {

    /* renamed from: a, reason: collision with root package name */
    public h f3336a;

    /* renamed from: b, reason: collision with root package name */
    public h f3337b;

    /* renamed from: c, reason: collision with root package name */
    public j f3338c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3339e;

    public /* synthetic */ C0256a(int i, Object obj) {
        this.d = i;
        this.f3339e = obj;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final void a() {
        switch (this.d) {
            case 0:
                ((b) this.f3339e).clear();
                break;
            default:
                ((c) this.f3339e).clear();
                break;
        }
    }

    public final Object b(int i, int i2) {
        switch (this.d) {
            case 0:
                return ((b) this.f3339e).f3371b[(i << 1) + i2];
            default:
                return ((c) this.f3339e).f3345b[i];
        }
    }

    public final Map c() {
        switch (this.d) {
            case 0:
                return (b) this.f3339e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.d) {
            case 0:
                return ((b) this.f3339e).f3372c;
            default:
                return ((c) this.f3339e).f3346c;
        }
    }

    public final int e(Object obj) {
        switch (this.d) {
            case 0:
                return ((b) this.f3339e).e(obj);
            default:
                return ((c) this.f3339e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.d) {
            case 0:
                return ((b) this.f3339e).g(obj);
            default:
                return ((c) this.f3339e).indexOf(obj);
        }
    }

    public final void g(int i) {
        switch (this.d) {
            case 0:
                ((b) this.f3339e).i(i);
                break;
            default:
                ((c) this.f3339e).e(i);
                break;
        }
    }

    public final Object[] i(Object[] objArr, int i) {
        int d = d();
        if (objArr.length < d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = b(i2, i);
        }
        if (objArr.length > d) {
            objArr[d] = null;
        }
        return objArr;
    }
}
