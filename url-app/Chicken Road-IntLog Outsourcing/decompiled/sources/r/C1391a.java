package r;

import X.m;
import java.util.Map;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1391a extends m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11671e;

    public /* synthetic */ C1391a(int i2, Object obj) {
        this.f11670d = i2;
        this.f11671e = obj;
    }

    @Override // X.m
    public final void b() {
        switch (this.f11670d) {
            case 0:
                ((C1392b) this.f11671e).clear();
                break;
            default:
                ((C1393c) this.f11671e).clear();
                break;
        }
    }

    @Override // X.m
    public final Object c(int i2, int i3) {
        switch (this.f11670d) {
            case 0:
                return ((C1392b) this.f11671e).f11712b[(i2 << 1) + i3];
            default:
                return ((C1393c) this.f11671e).f11680b[i2];
        }
    }

    @Override // X.m
    public final Map d() {
        switch (this.f11670d) {
            case 0:
                return (C1392b) this.f11671e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // X.m
    public final int e() {
        switch (this.f11670d) {
            case 0:
                return ((C1392b) this.f11671e).f11713c;
            default:
                return ((C1393c) this.f11671e).f11681c;
        }
    }

    @Override // X.m
    public final int f(Object obj) {
        switch (this.f11670d) {
            case 0:
                return ((C1392b) this.f11671e).e(obj);
            default:
                return ((C1393c) this.f11671e).indexOf(obj);
        }
    }

    @Override // X.m
    public final int g(Object obj) {
        switch (this.f11670d) {
            case 0:
                return ((C1392b) this.f11671e).g(obj);
            default:
                return ((C1393c) this.f11671e).indexOf(obj);
        }
    }

    @Override // X.m
    public final void h(Object obj, Object obj2) {
        switch (this.f11670d) {
            case 0:
                ((C1392b) this.f11671e).put(obj, obj2);
                break;
            default:
                ((C1393c) this.f11671e).add(obj);
                break;
        }
    }

    @Override // X.m
    public final void i(int i2) {
        switch (this.f11670d) {
            case 0:
                ((C1392b) this.f11671e).i(i2);
                break;
            default:
                ((C1393c) this.f11671e).f(i2);
                break;
        }
    }

    @Override // X.m
    public final Object j(int i2, Object obj) {
        switch (this.f11670d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                Object[] objArr = ((C1392b) this.f11671e).f11712b;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
