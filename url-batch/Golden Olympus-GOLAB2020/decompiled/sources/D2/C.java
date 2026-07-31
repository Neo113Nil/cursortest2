package D2;

import E2.C0394z;
import E2.J;
import E2.K;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3526a;
import y2.InterfaceC3535j;

/* loaded from: classes3.dex */
public abstract class C {
    public static final Object a(AbstractC0348a abstractC0348a, InterfaceC3526a deserializer, InputStream stream) {
        Intrinsics.checkNotNullParameter(abstractC0348a, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        C0394z c0394z = new C0394z(stream);
        try {
            return J.a(abstractC0348a, deserializer, c0394z);
        } finally {
            c0394z.b();
        }
    }

    public static final void b(AbstractC0348a abstractC0348a, InterfaceC3535j serializer, Object obj, OutputStream stream) {
        Intrinsics.checkNotNullParameter(abstractC0348a, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(stream, "stream");
        K k4 = new K(stream);
        try {
            J.b(abstractC0348a, k4, serializer, obj);
        } finally {
            k4.h();
        }
    }
}
