package E2;

import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3526a;
import y2.InterfaceC3535j;

/* loaded from: classes3.dex */
public abstract class J {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(AbstractC0348a abstractC0348a, InterfaceC3526a deserializer, V reader) {
        Intrinsics.checkNotNullParameter(abstractC0348a, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(reader, "reader");
        U u4 = new U(reader, null, 2, 0 == true ? 1 : 0);
        try {
            Object u5 = new W(abstractC0348a, c0.OBJ, u4, deserializer.getDescriptor(), null).u(deserializer);
            u4.w();
            return u5;
        } finally {
            u4.U();
        }
    }

    public static final void b(AbstractC0348a abstractC0348a, Q writer, InterfaceC3535j serializer, Object obj) {
        Intrinsics.checkNotNullParameter(abstractC0348a, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new X(writer, abstractC0348a, c0.OBJ, new D2.n[c0.values().length]).t(serializer, obj);
    }
}
