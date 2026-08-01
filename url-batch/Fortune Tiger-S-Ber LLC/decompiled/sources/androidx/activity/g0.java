package androidx.activity;

import java.io.Serializable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements t2.a, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public transient g0 f102f;
    public final Object g;
    public final boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public final int f103i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f104j;

    public g0(int i4, Object obj) {
        this.f104j = i4;
        this.g = obj;
    }

    @Override // t2.a
    public final Object a() {
        switch (this.f104j) {
            case 0:
                ((h0) this.g).e();
                break;
            default:
                ((h0) this.g).e();
                break;
        }
        return m2.c.c;
    }

    public final u2.a b() {
        if (this.h) {
            u2.f.f3430a.getClass();
            return new u2.e();
        }
        u2.f.f3430a.getClass();
        return new u2.b(h0.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return this.f103i == g0Var.f103i && u2.c.a(this.g, g0Var.g) && b().equals(g0Var.b());
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var2 = this.f102f;
        if (g0Var2 == null) {
            u2.f.f3430a.getClass();
            this.f102f = this;
            g0Var2 = this;
        }
        return obj.equals(g0Var2);
    }

    public final int hashCode() {
        b();
        return (((b().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        g0 g0Var = this.f102f;
        if (g0Var == null) {
            u2.f.f3430a.getClass();
            this.f102f = this;
            g0Var = this;
        }
        return g0Var != this ? g0Var.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
