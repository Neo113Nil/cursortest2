package o;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304a {

    /* renamed from: a, reason: collision with root package name */
    public h f3664a;

    /* renamed from: b, reason: collision with root package name */
    public h f3665b;

    /* renamed from: c, reason: collision with root package name */
    public j f3666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3668e;

    public /* synthetic */ C0304a(int i, Object obj) {
        this.f3667d = i;
        this.f3668e = obj;
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
        switch (this.f3667d) {
            case 0:
                ((b) this.f3668e).clear();
                break;
            default:
                ((c) this.f3668e).clear();
                break;
        }
    }

    public final Object b(int i, int i2) {
        switch (this.f3667d) {
            case 0:
                return ((b) this.f3668e).f3706b[(i << 1) + i2];
            default:
                return ((c) this.f3668e).f3674b[i];
        }
    }

    public final Map c() {
        switch (this.f3667d) {
            case 0:
                return (b) this.f3668e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f3667d) {
            case 0:
                return ((b) this.f3668e).f3707c;
            default:
                return ((c) this.f3668e).f3675c;
        }
    }

    public final int e(Object obj) {
        switch (this.f3667d) {
            case 0:
                return ((b) this.f3668e).e(obj);
            default:
                return ((c) this.f3668e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.f3667d) {
            case 0:
                return ((b) this.f3668e).g(obj);
            default:
                return ((c) this.f3668e).indexOf(obj);
        }
    }

    public final void g(int i) {
        switch (this.f3667d) {
            case 0:
                ((b) this.f3668e).i(i);
                break;
            default:
                ((c) this.f3668e).e(i);
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
