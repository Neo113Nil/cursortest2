package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class o52 extends tr implements t71 {
    private final boolean syntheticJavaProperty;

    public o52(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // defpackage.tr
    public g71 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o52) {
            o52 o52Var = (o52) obj;
            return getOwner().equals(o52Var.getOwner()) && getName().equals(o52Var.getName()) && getSignature().equals(o52Var.getSignature()) && Intrinsics.b(getBoundReceiver(), o52Var.getBoundReceiver());
        }
        if (obj instanceof t71) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.tr
    public t71 getReflected() {
        if (!this.syntheticJavaProperty) {
            return (t71) super.getReflected();
        }
        ch2.h("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.t71
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.t71
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        g71 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public o52() {
        this.syntheticJavaProperty = false;
    }
}
