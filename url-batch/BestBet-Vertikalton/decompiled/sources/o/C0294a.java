package o;

import h0.r;
import java.util.Map;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294a extends r {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3558e;

    public /* synthetic */ C0294a(int i, Object obj) {
        this.d = i;
        this.f3558e = obj;
    }

    @Override // h0.r
    public final void b() {
        switch (this.d) {
            case 0:
                ((b) this.f3558e).clear();
                break;
            default:
                ((c) this.f3558e).clear();
                break;
        }
    }

    @Override // h0.r
    public final Object c(int i, int i2) {
        switch (this.d) {
            case 0:
                return ((b) this.f3558e).f3590b[(i << 1) + i2];
            default:
                return ((c) this.f3558e).f3564b[i];
        }
    }

    @Override // h0.r
    public final Map d() {
        switch (this.d) {
            case 0:
                return (b) this.f3558e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // h0.r
    public final int e() {
        switch (this.d) {
            case 0:
                return ((b) this.f3558e).f3591c;
            default:
                return ((c) this.f3558e).f3565c;
        }
    }

    @Override // h0.r
    public final int f(Object obj) {
        switch (this.d) {
            case 0:
                return ((b) this.f3558e).e(obj);
            default:
                return ((c) this.f3558e).indexOf(obj);
        }
    }

    @Override // h0.r
    public final int g(Object obj) {
        switch (this.d) {
            case 0:
                return ((b) this.f3558e).g(obj);
            default:
                return ((c) this.f3558e).indexOf(obj);
        }
    }

    @Override // h0.r
    public final void h(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((b) this.f3558e).put(obj, obj2);
                break;
            default:
                ((c) this.f3558e).add(obj);
                break;
        }
    }

    @Override // h0.r
    public final void i(int i) {
        switch (this.d) {
            case 0:
                ((b) this.f3558e).i(i);
                break;
            default:
                ((c) this.f3558e).e(i);
                break;
        }
    }

    @Override // h0.r
    public final Object j(int i, Object obj) {
        switch (this.d) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((b) this.f3558e).f3590b;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
