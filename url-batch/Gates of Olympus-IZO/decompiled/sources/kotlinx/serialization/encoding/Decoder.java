package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import v2.a;

/* loaded from: classes.dex */
public interface Decoder {
    double A();

    a a(SerialDescriptor serialDescriptor);

    Decoder c(SerialDescriptor serialDescriptor);

    long d();

    Object h(KSerializer kSerializer);

    boolean k();

    int l();

    boolean m();

    char p();

    byte q();

    short t();

    String u();

    float v();
}
