package kotlin.jvm.internal;

import m2.InterfaceC3262b;

/* loaded from: classes3.dex */
public abstract class C extends AbstractC3240f implements m2.h {
    private final boolean syntheticJavaProperty;

    public C() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.AbstractC3240f
    public InterfaceC3262b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c4 = (C) obj;
            return getOwner().equals(c4.getOwner()) && getName().equals(c4.getName()) && getSignature().equals(c4.getSignature()) && Intrinsics.areEqual(getBoundReceiver(), c4.getBoundReceiver());
        }
        if (obj instanceof m2.h) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // m2.h
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // m2.h
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC3262b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3240f
    public m2.h getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (m2.h) super.getReflected();
    }

    public C(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.syntheticJavaProperty = (i4 & 2) == 2;
    }
}
