package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n7.a;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface Decoder {
    double A();

    a a(SerialDescriptor serialDescriptor);

    long d();

    Object g(KSerializer kSerializer);

    boolean h();

    boolean j();

    char l();

    Decoder o(SerialDescriptor serialDescriptor);

    int s();

    byte v();

    short x();

    String y();

    float z();
}
