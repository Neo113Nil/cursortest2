package defpackage;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ap0 extends pn1 {
    public final boolean x50lh2ztY7Y5;

    public ap0(String str, bp0 bp0Var) {
        super(str, bp0Var, 1);
        this.x50lh2ztY7Y5 = true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean a92UlCVFR9N8() {
        return this.x50lh2ztY7Y5;
    }

    @Override // defpackage.pn1
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ap0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.PxuCJdSBwIXG.equals(serialDescriptor.lS5Rgt96tfkO())) {
                ap0 ap0Var = (ap0) obj;
                if (ap0Var.x50lh2ztY7Y5 && Arrays.equals((SerialDescriptor[]) this.wdg6QnbFHrFF.getValue(), (SerialDescriptor[]) ap0Var.wdg6QnbFHrFF.getValue())) {
                    int Y1f8riQaR6yg = serialDescriptor.Y1f8riQaR6yg();
                    int i2 = this.TSizfFm2Yiuu;
                    if (i2 == Y1f8riQaR6yg) {
                        for (0; i < i2; i + 1) {
                            i = (cs0.wdg6QnbFHrFF(wdg6QnbFHrFF(i).lS5Rgt96tfkO(), serialDescriptor.wdg6QnbFHrFF(i).lS5Rgt96tfkO()) && cs0.wdg6QnbFHrFF(wdg6QnbFHrFF(i).TSizfFm2Yiuu(), serialDescriptor.wdg6QnbFHrFF(i).TSizfFm2Yiuu())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.pn1
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
