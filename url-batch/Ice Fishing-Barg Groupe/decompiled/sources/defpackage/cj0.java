package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cj0 implements SerialDescriptor {
    public final String PxuCJdSBwIXG;
    public final SerialDescriptor TSizfFm2Yiuu;
    public final SerialDescriptor lS5Rgt96tfkO;

    public cj0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = serialDescriptor;
        this.TSizfFm2Yiuu = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List OPXfSBeufaJ8(int i) {
        if (i >= 0) {
            return p50.rtx2ld2ELZv4;
        }
        u9.e9gEMXR7LXtO(o0.gPXPFXrUH4XX(o0.BRwzKIf41E4i(i, "Illegal index ", ", "), this.PxuCJdSBwIXG, " expects only non-negative indices"));
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int PxuCJdSBwIXG(String str) {
        str.getClass();
        Integer KUoIVIumpKat = pa2.KUoIVIumpKat(str);
        if (KUoIVIumpKat != null) {
            return KUoIVIumpKat.intValue();
        }
        u9.XL4ISE6Oc65B(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final sj0 TSizfFm2Yiuu() {
        return wa2.RAsUl2FVSrh6;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int Y1f8riQaR6yg() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean dgRBjINgWbAK(int i) {
        if (i >= 0) {
            return false;
        }
        u9.e9gEMXR7LXtO(o0.gPXPFXrUH4XX(o0.BRwzKIf41E4i(i, "Illegal index ", ", "), this.PxuCJdSBwIXG, " expects only non-negative indices"));
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e9gEMXR7LXtO(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj0)) {
            return false;
        }
        cj0 cj0Var = (cj0) obj;
        return this.PxuCJdSBwIXG.equals(cj0Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO.equals(cj0Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu.equals(cj0Var.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String lS5Rgt96tfkO() {
        return this.PxuCJdSBwIXG;
    }

    public final String toString() {
        return this.PxuCJdSBwIXG + '(' + this.lS5Rgt96tfkO + ", " + this.TSizfFm2Yiuu + ')';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor wdg6QnbFHrFF(int i) {
        if (i < 0) {
            u9.e9gEMXR7LXtO(o0.gPXPFXrUH4XX(o0.BRwzKIf41E4i(i, "Illegal index ", ", "), this.PxuCJdSBwIXG, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.lS5Rgt96tfkO;
        }
        if (i2 == 1) {
            return this.TSizfFm2Yiuu;
        }
        u9.rtx2ld2ELZv4("Unreached");
        return null;
    }
}
