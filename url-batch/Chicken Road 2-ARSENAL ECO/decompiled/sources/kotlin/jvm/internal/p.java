package kotlin.jvm.internal;

import H5.C0164y;

/* loaded from: classes.dex */
public abstract class p extends b implements D5.l {
    private final boolean syntheticJavaProperty;

    public p(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.b
    public D5.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return getOwner().equals(pVar.getOwner()) && getName().equals(pVar.getName()) && getSignature().equals(pVar.getSignature()) && i.a(getBoundReceiver(), pVar.getBoundReceiver());
        }
        if (obj instanceof D5.l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // D5.l
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // D5.l
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        D5.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public D5.l getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        D5.b compute = compute();
        if (compute != this) {
            return (D5.l) compute;
        }
        throw new C0164y("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
