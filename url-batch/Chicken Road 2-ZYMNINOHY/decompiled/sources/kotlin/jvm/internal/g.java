package kotlin.jvm.internal;

import n3.C1321a;
import u3.InterfaceC1448b;

/* loaded from: classes.dex */
public abstract class g extends b implements f, u3.e {
    private final int arity;
    private final int flags;

    public g(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.arity = i4;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.b
    public InterfaceC1448b computeReflected() {
        q.f14160a.getClass();
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
        if (obj instanceof u3.e) {
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

    @Override // u3.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // u3.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // u3.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // u3.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // u3.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC1448b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public u3.e getReflected() {
        InterfaceC1448b compute = compute();
        if (compute != this) {
            return (u3.e) compute;
        }
        throw new C1321a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
