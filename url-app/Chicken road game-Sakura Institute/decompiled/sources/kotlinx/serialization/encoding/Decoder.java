package kotlinx.serialization.encoding;

import h3.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public interface Decoder {
    double D();

    a a(SerialDescriptor serialDescriptor);

    Decoder d(SerialDescriptor serialDescriptor);

    long e();

    Object h(KSerializer kSerializer);

    boolean k();

    int l();

    boolean m();

    char p();

    byte r();

    short t();

    String u();

    float v();
}
