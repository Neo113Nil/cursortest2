package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ns implements SerialDescriptor {
    public final d42 PxuCJdSBwIXG;
    public final String TSizfFm2Yiuu;
    public final eu0 lS5Rgt96tfkO;

    public ns(d42 d42Var, eu0 eu0Var) {
        eu0Var.getClass();
        this.PxuCJdSBwIXG = d42Var;
        this.lS5Rgt96tfkO = eu0Var;
        this.TSizfFm2Yiuu = d42Var.PxuCJdSBwIXG + '<' + ((ck) eu0Var).TSizfFm2Yiuu() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List OPXfSBeufaJ8(int i) {
        return this.PxuCJdSBwIXG.rtx2ld2ELZv4[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int PxuCJdSBwIXG(String str) {
        str.getClass();
        return this.PxuCJdSBwIXG.PxuCJdSBwIXG(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final sj0 TSizfFm2Yiuu() {
        return this.PxuCJdSBwIXG.lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int Y1f8riQaR6yg() {
        return this.PxuCJdSBwIXG.TSizfFm2Yiuu;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean a92UlCVFR9N8() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean dgRBjINgWbAK(int i) {
        return this.PxuCJdSBwIXG.OPXfSBeufaJ8[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e9gEMXR7LXtO(int i) {
        return this.PxuCJdSBwIXG.a92UlCVFR9N8[i];
    }

    public final boolean equals(Object obj) {
        ns nsVar = obj instanceof ns ? (ns) obj : null;
        return nsVar != null && this.PxuCJdSBwIXG.equals(nsVar.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(nsVar.lS5Rgt96tfkO, this.lS5Rgt96tfkO);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.PxuCJdSBwIXG.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + (((ck) this.lS5Rgt96tfkO).hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String lS5Rgt96tfkO() {
        return this.TSizfFm2Yiuu;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean rtx2ld2ELZv4() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.lS5Rgt96tfkO + ", original: " + this.PxuCJdSBwIXG + ')';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor wdg6QnbFHrFF(int i) {
        return this.PxuCJdSBwIXG.RAsUl2FVSrh6[i];
    }
}
