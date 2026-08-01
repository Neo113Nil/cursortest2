package q;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331a {

    /* renamed from: a, reason: collision with root package name */
    public h f3887a;

    /* renamed from: b, reason: collision with root package name */
    public h f3888b;

    /* renamed from: c, reason: collision with root package name */
    public j f3889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3890d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0331a(int i, Object obj) {
        this.f3890d = i;
        this.e = obj;
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
        switch (this.f3890d) {
            case 0:
                ((b) this.e).clear();
                break;
            default:
                ((c) this.e).clear();
                break;
        }
    }

    public final Object b(int i, int i2) {
        switch (this.f3890d) {
            case 0:
                return ((b) this.e).f3924b[(i << 1) + i2];
            default:
                return ((c) this.e).f3896b[i];
        }
    }

    public final Map c() {
        switch (this.f3890d) {
            case 0:
                return (b) this.e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f3890d) {
            case 0:
                return ((b) this.e).f3925c;
            default:
                return ((c) this.e).f3897c;
        }
    }

    public final int e(Object obj) {
        switch (this.f3890d) {
            case 0:
                return ((b) this.e).e(obj);
            default:
                return ((c) this.e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.f3890d) {
            case 0:
                return ((b) this.e).g(obj);
            default:
                return ((c) this.e).indexOf(obj);
        }
    }

    public final void g(int i) {
        switch (this.f3890d) {
            case 0:
                ((b) this.e).i(i);
                break;
            default:
                ((c) this.e).e(i);
                break;
        }
    }

    public final Object[] i(Object[] objArr, int i) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d2);
        }
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        if (objArr.length > d2) {
            objArr[d2] = null;
        }
        return objArr;
    }
}
