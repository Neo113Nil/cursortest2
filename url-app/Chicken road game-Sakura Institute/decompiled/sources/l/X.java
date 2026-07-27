package l;

import A.AbstractC0017m;
import f1.C0607a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class X implements InterfaceC0799z {

    /* renamed from: a, reason: collision with root package name */
    public final float f7658a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7659b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7660c;

    public X(float f4, float f5, Object obj) {
        this.f7658a = f4;
        this.f7659b = f5;
        this.f7660c = obj;
    }

    @Override // l.InterfaceC0787m
    public final x0 a(v0 v0Var) {
        Object obj = this.f7660c;
        return new C0607a(this.f7658a, this.f7659b, obj == null ? null : (AbstractC0792s) v0Var.f7853a.invoke(obj));
    }

    @Override // l.InterfaceC0799z
    public final z0 e() {
        v0 v0Var = w0.f7856a;
        Object obj = this.f7660c;
        return new C0607a(this.f7658a, this.f7659b, obj == null ? null : (AbstractC0792s) d0.f7716o.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x2 = (X) obj;
        return x2.f7658a == this.f7658a && x2.f7659b == this.f7659b && Intrinsics.a(x2.f7660c, this.f7660c);
    }

    public final int hashCode() {
        Object obj = this.f7660c;
        return Float.hashCode(this.f7659b) + AbstractC0017m.a(this.f7658a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ X(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
