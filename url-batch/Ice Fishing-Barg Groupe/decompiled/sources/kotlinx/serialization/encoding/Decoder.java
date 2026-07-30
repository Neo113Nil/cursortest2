package kotlinx.serialization.encoding;

import defpackage.k42;
import defpackage.op;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public interface Decoder {
    short IAToe7bXGz4N();

    char OPXfSBeufaJ8();

    k42 PxuCJdSBwIXG();

    Decoder QrzZRwfaDlRX(SerialDescriptor serialDescriptor);

    long TSizfFm2Yiuu();

    int VhhvGxCb8gfr();

    boolean a92UlCVFR9N8();

    double aF05bpZJlKEP();

    String e6tOsSdd2EFb();

    float jyegZNwi31qc();

    op lS5Rgt96tfkO(SerialDescriptor serialDescriptor);

    byte pnx5pC0XzaCw();

    boolean rtx2ld2ELZv4();

    int wdg6QnbFHrFF(SerialDescriptor serialDescriptor);

    default Object x50lh2ztY7Y5(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.deserialize(this);
    }
}
