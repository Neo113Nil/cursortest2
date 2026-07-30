package kotlinx.serialization.encoding;

import defpackage.fx1;
import defpackage.k42;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public interface Encoder {
    void OPXfSBeufaJ8(int i);

    k42 PxuCJdSBwIXG();

    void QrzZRwfaDlRX(char c);

    void RAsUl2FVSrh6(boolean z);

    void TSizfFm2Yiuu();

    void Y1f8riQaR6yg(double d);

    void a92UlCVFR9N8(byte b);

    default fx1 cpQdD2nAriOS(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return lS5Rgt96tfkO(serialDescriptor);
    }

    default void dgRBjINgWbAK(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        kSerializer.serialize(this, obj);
    }

    void e9gEMXR7LXtO(short s);

    void gPXPFXrUH4XX(String str);

    fx1 lS5Rgt96tfkO(SerialDescriptor serialDescriptor);

    void r3s1LDPKFs1S(long j);

    void rtx2ld2ELZv4(SerialDescriptor serialDescriptor, int i);

    Encoder wdg6QnbFHrFF(SerialDescriptor serialDescriptor);

    void x50lh2ztY7Y5(float f);
}
