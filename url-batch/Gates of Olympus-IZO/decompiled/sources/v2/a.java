package v2;

import k.C0523b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import w2.Q;

/* loaded from: classes.dex */
public interface a {
    boolean b(Q q2, int i3);

    Object e(SerialDescriptor serialDescriptor, int i3, String str);

    byte f(Q q2, int i3);

    char g(Q q2, int i3);

    Object i(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj);

    float j(Q q2, int i3);

    long n(Q q2, int i3);

    C0523b o();

    Decoder r(Q q2, int i3);

    int s(SerialDescriptor serialDescriptor);

    int w(Q q2, int i3);

    double x(Q q2, int i3);

    short y(Q q2, int i3);

    void z(SerialDescriptor serialDescriptor);
}
