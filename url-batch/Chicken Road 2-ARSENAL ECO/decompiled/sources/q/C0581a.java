package q;

import Q.n;
import java.util.Map;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581a extends n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5702e;

    public /* synthetic */ C0581a(int i7, Object obj) {
        this.f5701d = i7;
        this.f5702e = obj;
    }

    @Override // Q.n
    public final void b() {
        switch (this.f5701d) {
            case 0:
                ((C0582b) this.f5702e).clear();
                break;
            default:
                ((C0583c) this.f5702e).clear();
                break;
        }
    }

    @Override // Q.n
    public final Object c(int i7, int i8) {
        switch (this.f5701d) {
            case 0:
                return ((C0582b) this.f5702e).f5743g[(i7 << 1) + i8];
            default:
                return ((C0583c) this.f5702e).f5711g[i7];
        }
    }

    @Override // Q.n
    public final Map d() {
        switch (this.f5701d) {
            case 0:
                return (C0582b) this.f5702e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // Q.n
    public final int e() {
        switch (this.f5701d) {
            case 0:
                return ((C0582b) this.f5702e).f5744h;
            default:
                return ((C0583c) this.f5702e).f5712h;
        }
    }

    @Override // Q.n
    public final int f(Object obj) {
        switch (this.f5701d) {
            case 0:
                return ((C0582b) this.f5702e).d(obj);
            default:
                C0583c c0583c = (C0583c) this.f5702e;
                return obj == null ? c0583c.d() : c0583c.c(obj.hashCode(), obj);
        }
    }

    @Override // Q.n
    public final int g(Object obj) {
        switch (this.f5701d) {
            case 0:
                return ((C0582b) this.f5702e).f(obj);
            default:
                C0583c c0583c = (C0583c) this.f5702e;
                return obj == null ? c0583c.d() : c0583c.c(obj.hashCode(), obj);
        }
    }

    @Override // Q.n
    public final void h(Object obj, Object obj2) {
        switch (this.f5701d) {
            case 0:
                ((C0582b) this.f5702e).put(obj, obj2);
                break;
            default:
                ((C0583c) this.f5702e).add(obj);
                break;
        }
    }

    @Override // Q.n
    public final void i(int i7) {
        switch (this.f5701d) {
            case 0:
                ((C0582b) this.f5702e).g(i7);
                break;
            default:
                ((C0583c) this.f5702e).e(i7);
                break;
        }
    }

    @Override // Q.n
    public final Object j(int i7, Object obj) {
        switch (this.f5701d) {
            case 0:
                int i8 = (i7 << 1) + 1;
                Object[] objArr = ((C0582b) this.f5702e).f5743g;
                Object obj2 = objArr[i8];
                objArr[i8] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
