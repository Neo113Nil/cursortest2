package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class b21 implements SerialDescriptor {
    public final SerialDescriptor PxuCJdSBwIXG;

    public b21(SerialDescriptor serialDescriptor) {
        this.PxuCJdSBwIXG = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List OPXfSBeufaJ8(int i) {
        if (i >= 0) {
            return p50.rtx2ld2ELZv4;
        }
        u9.QrzZRwfaDlRX(o0.BRwzKIf41E4i(i, "Illegal index ", ", "), lS5Rgt96tfkO(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int PxuCJdSBwIXG(String str) {
        str.getClass();
        Integer KUoIVIumpKat = pa2.KUoIVIumpKat(str);
        if (KUoIVIumpKat != null) {
            return KUoIVIumpKat.intValue();
        }
        u9.XL4ISE6Oc65B(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final sj0 TSizfFm2Yiuu() {
        return wa2.a92UlCVFR9N8;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int Y1f8riQaR6yg() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean dgRBjINgWbAK(int i) {
        if (i >= 0) {
            return false;
        }
        u9.QrzZRwfaDlRX(o0.BRwzKIf41E4i(i, "Illegal index ", ", "), lS5Rgt96tfkO(), " expects only non-negative indices");
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
        if (!(obj instanceof b21)) {
            return false;
        }
        b21 b21Var = (b21) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, b21Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(lS5Rgt96tfkO(), b21Var.lS5Rgt96tfkO());
    }

    public final int hashCode() {
        return lS5Rgt96tfkO().hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        return lS5Rgt96tfkO() + '(' + this.PxuCJdSBwIXG + ')';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor wdg6QnbFHrFF(int i) {
        if (i >= 0) {
            return this.PxuCJdSBwIXG;
        }
        u9.QrzZRwfaDlRX(o0.BRwzKIf41E4i(i, "Illegal index ", ", "), lS5Rgt96tfkO(), " expects only non-negative indices");
        return null;
    }
}
