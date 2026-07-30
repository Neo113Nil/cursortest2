package defpackage;

import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c42 implements SerialDescriptor, kh {
    public final SerialDescriptor PxuCJdSBwIXG;
    public final Set TSizfFm2Yiuu;
    public final String lS5Rgt96tfkO;

    public c42(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.PxuCJdSBwIXG = serialDescriptor;
        this.lS5Rgt96tfkO = serialDescriptor.lS5Rgt96tfkO() + '?';
        this.TSizfFm2Yiuu = fx1.pnx5pC0XzaCw(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List OPXfSBeufaJ8(int i) {
        return this.PxuCJdSBwIXG.OPXfSBeufaJ8(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int PxuCJdSBwIXG(String str) {
        str.getClass();
        return this.PxuCJdSBwIXG.PxuCJdSBwIXG(str);
    }

    @Override // defpackage.kh
    public final Set RAsUl2FVSrh6() {
        return this.TSizfFm2Yiuu;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final sj0 TSizfFm2Yiuu() {
        return this.PxuCJdSBwIXG.TSizfFm2Yiuu();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int Y1f8riQaR6yg() {
        return this.PxuCJdSBwIXG.Y1f8riQaR6yg();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean a92UlCVFR9N8() {
        return this.PxuCJdSBwIXG.a92UlCVFR9N8();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean dgRBjINgWbAK(int i) {
        return this.PxuCJdSBwIXG.dgRBjINgWbAK(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e9gEMXR7LXtO(int i) {
        return this.PxuCJdSBwIXG.e9gEMXR7LXtO(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c42) {
            return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ((c42) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.PxuCJdSBwIXG.getAnnotations();
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String lS5Rgt96tfkO() {
        return this.lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean rtx2ld2ELZv4() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.PxuCJdSBwIXG);
        sb.append('?');
        return sb.toString();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor wdg6QnbFHrFF(int i) {
        return this.PxuCJdSBwIXG.wdg6QnbFHrFF(i);
    }
}
