package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dq1 implements SerialDescriptor {
    public final String PxuCJdSBwIXG;
    public final cq1 lS5Rgt96tfkO;

    public dq1(String str, cq1 cq1Var) {
        cq1Var.getClass();
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = cq1Var;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List OPXfSBeufaJ8(int i) {
        RAsUl2FVSrh6();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int PxuCJdSBwIXG(String str) {
        str.getClass();
        RAsUl2FVSrh6();
        throw null;
    }

    public final void RAsUl2FVSrh6() {
        throw new IllegalStateException(o0.gPXPFXrUH4XX(new StringBuilder("Primitive descriptor "), this.PxuCJdSBwIXG, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final sj0 TSizfFm2Yiuu() {
        return this.lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int Y1f8riQaR6yg() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean dgRBjINgWbAK(int i) {
        RAsUl2FVSrh6();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e9gEMXR7LXtO(int i) {
        RAsUl2FVSrh6();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq1)) {
            return false;
        }
        dq1 dq1Var = (dq1) obj;
        return this.PxuCJdSBwIXG.equals(dq1Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, dq1Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return (this.lS5Rgt96tfkO.hashCode() * 31) + this.PxuCJdSBwIXG.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String lS5Rgt96tfkO() {
        return this.PxuCJdSBwIXG;
    }

    public final String toString() {
        return o0.QrzZRwfaDlRX(new StringBuilder("PrimitiveDescriptor("), this.PxuCJdSBwIXG, ')');
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor wdg6QnbFHrFF(int i) {
        RAsUl2FVSrh6();
        throw null;
    }
}
