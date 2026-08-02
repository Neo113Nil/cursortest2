package q0;

import java.util.Objects;

/* renamed from: q0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379v extends r {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f15076e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f15077c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15078d;

    public C1379v(T.T t4, Object obj, Object obj2) {
        super(t4);
        this.f15077c = obj;
        this.f15078d = obj2;
    }

    @Override // q0.r, T.T
    public final int b(Object obj) {
        Object obj2;
        if (f15076e.equals(obj) && (obj2 = this.f15078d) != null) {
            obj = obj2;
        }
        return this.f15061b.b(obj);
    }

    @Override // q0.r, T.T
    public final T.Q f(int i4, T.Q q4, boolean z) {
        this.f15061b.f(i4, q4, z);
        if (Objects.equals(q4.f2682b, this.f15078d) && z) {
            q4.f2682b = f15076e;
        }
        return q4;
    }

    @Override // q0.r, T.T
    public final Object l(int i4) {
        Object l4 = this.f15061b.l(i4);
        return Objects.equals(l4, this.f15078d) ? f15076e : l4;
    }

    @Override // q0.r, T.T
    public final T.S m(int i4, T.S s4, long j4) {
        this.f15061b.m(i4, s4, j4);
        if (Objects.equals(s4.f2690a, this.f15077c)) {
            s4.f2690a = T.S.f2688q;
        }
        return s4;
    }
}
