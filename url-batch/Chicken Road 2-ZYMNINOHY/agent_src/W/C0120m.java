package W;

import E1.X;

/* renamed from: W.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3317a;

    /* renamed from: b, reason: collision with root package name */
    public X f3318b = new X();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3319c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3320d;

    public C0120m(Object obj) {
        this.f3317a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0120m.class != obj.getClass()) {
            return false;
        }
        return this.f3317a.equals(((C0120m) obj).f3317a);
    }

    public final int hashCode() {
        return this.f3317a.hashCode();
    }
}
