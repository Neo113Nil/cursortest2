package p7;

import kotlinx.serialization.KSerializer;
import o7.t0;
import o7.u0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f7235a;

    static {
        m7.d dVar = m7.d.f6449o;
        if (z6.h.G("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((f6.i) u0.f6950a.values()).iterator();
        while (((f6.f) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((f6.d) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(kSerializer.getDescriptor().b())) {
                throw new IllegalArgumentException(z6.i.m("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + r6.w.a(kSerializer.getClass()).b() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f7235a = new t0("kotlinx.serialization.json.JsonLiteral", dVar);
    }
}
