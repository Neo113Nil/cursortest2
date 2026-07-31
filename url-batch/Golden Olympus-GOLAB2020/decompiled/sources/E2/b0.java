package E2;

import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3526a;

/* loaded from: classes3.dex */
public abstract class b0 {
    public static final Object a(AbstractC0348a abstractC0348a, String discriminator, D2.w element, InterfaceC3526a deserializer) {
        Intrinsics.checkNotNullParameter(abstractC0348a, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new M(abstractC0348a, element, discriminator, deserializer.getDescriptor()).u(deserializer);
    }
}
