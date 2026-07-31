package kotlin.jvm.internal;

import H5.C0164y;

/* loaded from: classes.dex */
public abstract class g extends b implements f, D5.e {
    private final int arity;
    private final int flags;

    public g(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.arity = i7;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public D5.b computeReflected() {
        t.f5234a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && i.a(getBoundReceiver(), gVar.getBoundReceiver()) && i.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof D5.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // D5.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // D5.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // D5.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // D5.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.b, D5.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        D5.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public D5.e getReflected() {
        D5.b compute = compute();
        if (compute != this) {
            return (D5.e) compute;
        }
        throw new C0164y("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
