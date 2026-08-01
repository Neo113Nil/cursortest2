package o;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274a {

    /* renamed from: a, reason: collision with root package name */
    public h f3297a;

    /* renamed from: b, reason: collision with root package name */
    public h f3298b;

    /* renamed from: c, reason: collision with root package name */
    public j f3299c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3300e;

    public /* synthetic */ C0274a(int i, Object obj) {
        this.d = i;
        this.f3300e = obj;
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
                ((b) this.f3300e).clear();
                break;
            default:
                ((c) this.f3300e).clear();
                break;
        }
    }

    public final Object b(int i, int i2) {
        switch (this.d) {
            case 0:
                return ((b) this.f3300e).f3332b[(i << 1) + i2];
            default:
                return ((c) this.f3300e).f3306b[i];
        }
    }

    public final Map c() {
        switch (this.d) {
            case 0:
                return (b) this.f3300e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.d) {
            case 0:
                return ((b) this.f3300e).f3333c;
            default:
                return ((c) this.f3300e).f3307c;
        }
    }

    public final int e(Object obj) {
        switch (this.d) {
            case 0:
                return ((b) this.f3300e).e(obj);
            default:
                return ((c) this.f3300e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.d) {
            case 0:
                return ((b) this.f3300e).g(obj);
            default:
                return ((c) this.f3300e).indexOf(obj);
        }
    }

    public final void g(int i) {
        switch (this.d) {
            case 0:
                ((b) this.f3300e).i(i);
                break;
            default:
                ((c) this.f3300e).e(i);
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
