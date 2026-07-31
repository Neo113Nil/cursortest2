package D2;

import C2.T;
import C2.U;
import kotlinx.serialization.KSerializer;
import n2.AbstractC0730j;
import n2.AbstractC0731k;

/* loaded from: classes.dex */
public abstract class r implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final T f902a;

    static {
        A2.d dVar = A2.d.f238k;
        if (AbstractC0730j.K("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((N.i) U.f724a.values()).iterator();
        while (((T1.e) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((T1.c) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(kSerializer.getDescriptor().d())) {
                throw new IllegalArgumentException(AbstractC0731k.p("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + f2.v.a(kSerializer.getClass()).b() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f902a = new T("kotlinx.serialization.json.JsonLiteral", dVar);
    }
}
