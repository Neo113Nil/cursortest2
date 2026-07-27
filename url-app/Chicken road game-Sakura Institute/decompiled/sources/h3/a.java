package h3;

import A0.q;
import i3.Q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public interface a {
    void A(SerialDescriptor serialDescriptor);

    short B(Q q2, int i2);

    byte F(Q q2, int i2);

    int b(Q q2, int i2);

    float c(Q q2, int i2);

    Object f(SerialDescriptor serialDescriptor, int i2, String str);

    double g(Q q2, int i2);

    Object j(SerialDescriptor serialDescriptor, int i2, KSerializer kSerializer, Object obj);

    q n();

    long o(Q q2, int i2);

    char q(Q q2, int i2);

    int s(SerialDescriptor serialDescriptor);

    Decoder y(Q q2, int i2);

    boolean z(Q q2, int i2);
}
