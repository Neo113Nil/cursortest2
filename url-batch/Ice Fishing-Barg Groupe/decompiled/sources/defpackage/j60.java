package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j60 extends pn1 {
    public final qc2 cpQdD2nAriOS;
    public final f42 x50lh2ztY7Y5;

    public j60(String str, int i) {
        super(str, null, i);
        this.x50lh2ztY7Y5 = f42.e9gEMXR7LXtO;
        this.cpQdD2nAriOS = new qc2(new i60(i, str, this));
    }

    @Override // defpackage.pn1, kotlinx.serialization.descriptors.SerialDescriptor
    public final sj0 TSizfFm2Yiuu() {
        return this.x50lh2ztY7Y5;
    }

    @Override // defpackage.pn1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.TSizfFm2Yiuu() == f42.e9gEMXR7LXtO && this.PxuCJdSBwIXG.equals(serialDescriptor.lS5Rgt96tfkO()) && cs0.wdg6QnbFHrFF(fx1.pnx5pC0XzaCw(this), fx1.pnx5pC0XzaCw(serialDescriptor));
    }

    @Override // defpackage.pn1
    public final int hashCode() {
        int hashCode = this.PxuCJdSBwIXG.hashCode();
        ZbWwgt3aGe7A zbWwgt3aGe7A = new ZbWwgt3aGe7A(this);
        int i = 1;
        while (zbWwgt3aGe7A.hasNext()) {
            int i2 = i * 31;
            String str = (String) zbWwgt3aGe7A.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // defpackage.pn1
    public final String toString() {
        return zk.ctD2u3GUHhtA(new un0(2, this), ", ", this.PxuCJdSBwIXG.concat("("), ")", null, 56);
    }

    @Override // defpackage.pn1, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor wdg6QnbFHrFF(int i) {
        return ((SerialDescriptor[]) this.cpQdD2nAriOS.getValue())[i];
    }
}
