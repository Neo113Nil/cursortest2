package B2;

import A1.i;
import C2.Q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public interface a {
    int A(Q q3, int i3);

    Decoder E(Q q3, int i3);

    Object d(SerialDescriptor serialDescriptor, int i3, String str);

    boolean e(Q q3, int i3);

    Object g(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj);

    char k(Q q3, int i3);

    float l(Q q3, int i3);

    i m();

    long p(Q q3, int i3);

    double q(Q q3, int i3);

    int r(SerialDescriptor serialDescriptor);

    short x(Q q3, int i3);

    byte y(Q q3, int i3);

    void z(SerialDescriptor serialDescriptor);
}
