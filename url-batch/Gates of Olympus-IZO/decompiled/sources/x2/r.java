package x2;

import h2.AbstractC0447i;
import h2.AbstractC0448j;
import kotlinx.serialization.KSerializer;
import w2.T;
import w2.U;

/* loaded from: classes.dex */
public abstract class r implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final T f8762a;

    static {
        u2.d dVar = u2.d.f8536j;
        if (AbstractC0447i.t0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((N.i) U.f8637a.values()).iterator();
        while (((N1.f) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((N1.d) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(kSerializer.getDescriptor().d())) {
                throw new IllegalArgumentException(AbstractC0448j.a0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + Z1.u.a(kSerializer.getClass()).b() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f8762a = new T("kotlinx.serialization.json.JsonLiteral", dVar);
    }
}
