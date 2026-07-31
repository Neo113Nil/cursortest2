package kotlin.jvm.internal;

import m2.InterfaceC3262b;

/* loaded from: classes3.dex */
public abstract class o extends AbstractC3240f implements InterfaceC3248n, m2.f {
    private final int arity;
    private final int flags;

    public o(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.arity = i4;
        this.flags = i5 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC3240f
    protected InterfaceC3262b computeReflected() {
        return H.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && this.flags == oVar.flags && this.arity == oVar.arity && Intrinsics.areEqual(getBoundReceiver(), oVar.getBoundReceiver()) && Intrinsics.areEqual(getOwner(), oVar.getOwner());
        }
        if (obj instanceof m2.f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3248n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // m2.f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // m2.f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // m2.f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // m2.f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC3240f, m2.InterfaceC3262b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC3262b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3240f
    public m2.f getReflected() {
        return (m2.f) super.getReflected();
    }
}
