package n7;

import j4.i;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import o7.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface a {
    byte b(r0 r0Var, int i7);

    boolean c(r0 r0Var, int i7);

    float e(r0 r0Var, int i7);

    short f(r0 r0Var, int i7);

    long i(r0 r0Var, int i7);

    char k(r0 r0Var, int i7);

    int m(SerialDescriptor serialDescriptor);

    void n(SerialDescriptor serialDescriptor);

    Object p(SerialDescriptor serialDescriptor, int i7, String str);

    Object q(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj);

    int r(r0 r0Var, int i7);

    i t();

    double u(r0 r0Var, int i7);

    Decoder w(r0 r0Var, int i7);
}
