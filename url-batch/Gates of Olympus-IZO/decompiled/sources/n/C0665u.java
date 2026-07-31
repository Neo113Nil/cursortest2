package n;

import b0.C0265P;

/* renamed from: n.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665u {

    /* renamed from: a, reason: collision with root package name */
    public final float f6162a;

    /* renamed from: b, reason: collision with root package name */
    public final C0265P f6163b;

    public C0665u(float f3, C0265P c0265p) {
        this.f6162a = f3;
        this.f6163b = c0265p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0665u)) {
            return false;
        }
        C0665u c0665u = (C0665u) obj;
        return M0.e.a(this.f6162a, c0665u.f6162a) && this.f6163b.equals(c0665u.f6163b);
    }

    public final int hashCode() {
        return this.f6163b.hashCode() + (Float.hashCode(this.f6162a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) M0.e.b(this.f6162a)) + ", brush=" + this.f6163b + ')';
    }
}
