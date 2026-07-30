package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sx1 extends b51 {
    public int IAToe7bXGz4N = -1;
    public String e6tOsSdd2EFb = "";
    public final g42 jyegZNwi31qc = cs0.jJwa0q7P5wHq;
    public final cr1 pnx5pC0XzaCw;

    public sx1(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.pnx5pC0XzaCw = new cr1(3, bundle, linkedHashMap);
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.op
    public final k42 PxuCJdSBwIXG() {
        return this.jyegZNwi31qc;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final Decoder QrzZRwfaDlRX(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (ni0.kpCQ9veP6n3I(serialDescriptor)) {
            this.e6tOsSdd2EFb = serialDescriptor.e9gEMXR7LXtO(0);
            this.IAToe7bXGz4N = 0;
        }
        return this;
    }

    @Override // defpackage.op
    public final int dgRBjINgWbAK(SerialDescriptor serialDescriptor) {
        String e9gEMXR7LXtO;
        cr1 cr1Var;
        serialDescriptor.getClass();
        int i = this.IAToe7bXGz4N;
        do {
            i++;
            if (i >= serialDescriptor.Y1f8riQaR6yg()) {
                return -1;
            }
            e9gEMXR7LXtO = serialDescriptor.e9gEMXR7LXtO(i);
            cr1Var = this.pnx5pC0XzaCw;
            cr1Var.getClass();
            e9gEMXR7LXtO.getClass();
        } while (!((Bundle) cr1Var.OPXfSBeufaJ8).containsKey(e9gEMXR7LXtO));
        this.IAToe7bXGz4N = i;
        this.e6tOsSdd2EFb = e9gEMXR7LXtO;
        return i;
    }

    @Override // defpackage.b51
    public final Object i68hK7ahKtgp() {
        return jJwa0q7P5wHq();
    }

    public final Object jJwa0q7P5wHq() {
        String str = this.e6tOsSdd2EFb;
        cr1 cr1Var = this.pnx5pC0XzaCw;
        cr1Var.getClass();
        str.getClass();
        dc1 dc1Var = (dc1) ((LinkedHashMap) cr1Var.wdg6QnbFHrFF).get(str);
        Object PxuCJdSBwIXG = dc1Var != null ? dc1Var.PxuCJdSBwIXG(str, (Bundle) cr1Var.OPXfSBeufaJ8) : null;
        if (PxuCJdSBwIXG != null) {
            return PxuCJdSBwIXG;
        }
        rc1.a92UlCVFR9N8(this.e6tOsSdd2EFb, "Unexpected null value for non-nullable argument ");
        return null;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final boolean rtx2ld2ELZv4() {
        String str = this.e6tOsSdd2EFb;
        cr1 cr1Var = this.pnx5pC0XzaCw;
        cr1Var.getClass();
        str.getClass();
        dc1 dc1Var = (dc1) ((LinkedHashMap) cr1Var.wdg6QnbFHrFF).get(str);
        return (dc1Var != null ? dc1Var.PxuCJdSBwIXG(str, (Bundle) cr1Var.OPXfSBeufaJ8) : null) != null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object x50lh2ztY7Y5(KSerializer kSerializer) {
        kSerializer.getClass();
        return jJwa0q7P5wHq();
    }
}
