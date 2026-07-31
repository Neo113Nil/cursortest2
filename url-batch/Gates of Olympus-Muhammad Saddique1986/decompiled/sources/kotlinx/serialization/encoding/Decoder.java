package kotlinx.serialization.encoding;

import B2.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public interface Decoder {
    double C();

    a a(SerialDescriptor serialDescriptor);

    Decoder b(SerialDescriptor serialDescriptor);

    long c();

    Object f(KSerializer kSerializer);

    boolean h();

    int i();

    boolean j();

    char n();

    byte o();

    short s();

    String t();

    float u();
}
