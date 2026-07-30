package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class gu0 extends tr implements fu0, j71 {
    public final int m;
    public final int n;

    public gu0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.m = i;
        this.n = 0;
    }

    @Override // defpackage.tr
    public final g71 computeReflected() {
        d82.a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gu0) {
            gu0 gu0Var = (gu0) obj;
            return getName().equals(gu0Var.getName()) && getSignature().equals(gu0Var.getSignature()) && this.n == gu0Var.n && this.m == gu0Var.m && Intrinsics.b(getBoundReceiver(), gu0Var.getBoundReceiver()) && Intrinsics.b(getOwner(), gu0Var.getOwner());
        }
        if (obj instanceof j71) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.fu0
    public final int getArity() {
        return this.m;
    }

    @Override // defpackage.tr
    public final g71 getReflected() {
        return (j71) super.getReflected();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.tr, defpackage.g71
    public final boolean isSuspend() {
        return ((gu0) ((j71) super.getReflected())).isSuspend();
    }

    public final String toString() {
        g71 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public gu0(int i, Class cls, String str, String str2, int i2) {
        this(i, tr.NO_RECEIVER, cls, str, str2, i2, 0);
    }
}
