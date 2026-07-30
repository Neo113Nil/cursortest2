package kotlin.jvm.internal;

import k6.InterfaceC0607b;
import k6.InterfaceC0610e;

/* loaded from: classes.dex */
public abstract class m extends AbstractC0639d implements l, InterfaceC0610e {

    /* renamed from: d, reason: collision with root package name */
    private final int f6166d;

    public m(int i2, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f6166d = i2;
    }

    @Override // kotlin.jvm.internal.AbstractC0639d
    public final InterfaceC0607b computeReflected() {
        E.f6153a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return getName().equals(mVar.getName()) && getSignature().equals(mVar.getSignature()) && Intrinsics.a(getBoundReceiver(), mVar.getBoundReceiver()) && Intrinsics.a(getOwner(), mVar.getOwner());
        }
        if (obj instanceof InterfaceC0610e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.l
    public final int getArity() {
        return this.f6166d;
    }

    @Override // kotlin.jvm.internal.AbstractC0639d
    public final InterfaceC0607b getReflected() {
        return (InterfaceC0610e) super.getReflected();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.AbstractC0639d, k6.InterfaceC0607b
    public final boolean isSuspend() {
        return ((m) ((InterfaceC0610e) super.getReflected())).isSuspend();
    }

    public final String toString() {
        InterfaceC0607b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
