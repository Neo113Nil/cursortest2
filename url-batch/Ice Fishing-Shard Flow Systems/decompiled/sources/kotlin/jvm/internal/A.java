package kotlin.jvm.internal;

import k6.InterfaceC0607b;
import k6.InterfaceC0618m;

/* loaded from: classes.dex */
public abstract class A extends AbstractC0639d implements InterfaceC0618m {
    private final boolean syntheticJavaProperty;

    public A() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.AbstractC0639d
    public InterfaceC0607b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A) {
            A a7 = (A) obj;
            return getOwner().equals(a7.getOwner()) && getName().equals(a7.getName()) && getSignature().equals(a7.getSignature()) && Intrinsics.a(getBoundReceiver(), a7.getBoundReceiver());
        }
        if (obj instanceof InterfaceC0618m) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // k6.InterfaceC0618m
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // k6.InterfaceC0618m
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC0607b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC0639d
    public InterfaceC0618m getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC0618m) super.getReflected();
    }

    public A(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.syntheticJavaProperty = false;
    }
}
