package j3;

import M2.F;
import i3.T;
import i3.U;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public abstract class s implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final T f7221a;

    static {
        g3.d kind = g3.d.f6792p;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kotlin.text.y.x("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        A2.e eVar = U.f7046a;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Object it = ((A2.j) U.f7046a.values()).iterator();
        while (((A2.h) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((A2.f) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(kSerializer.getDescriptor().d())) {
                throw new IllegalArgumentException(kotlin.text.n.b("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + F.a(kSerializer.getClass()).b() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f7221a = new T("kotlinx.serialization.json.JsonLiteral", kind);
    }
}
