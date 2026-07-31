package y2;

import C2.AbstractC0299b;
import C2.AbstractC0301c;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3531f {
    public static final InterfaceC3526a a(AbstractC0299b abstractC0299b, B2.c decoder, String str) {
        Intrinsics.checkNotNullParameter(abstractC0299b, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC3526a c4 = abstractC0299b.c(decoder, str);
        if (c4 != null) {
            return c4;
        }
        AbstractC0301c.a(str, abstractC0299b.e());
        throw new W1.f();
    }

    public static final InterfaceC3535j b(AbstractC0299b abstractC0299b, B2.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(abstractC0299b, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC3535j d4 = abstractC0299b.d(encoder, value);
        if (d4 != null) {
            return d4;
        }
        AbstractC0301c.b(H.b(value.getClass()), abstractC0299b.e());
        throw new W1.f();
    }
}
