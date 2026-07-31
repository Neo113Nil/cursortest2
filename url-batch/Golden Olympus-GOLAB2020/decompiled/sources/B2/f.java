package B2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3535j;

/* loaded from: classes3.dex */
public interface f {
    void A(long j4);

    d D(A2.f fVar, int i4);

    void E(String str);

    F2.b a();

    d b(A2.f fVar);

    void e();

    void g(double d4);

    void h(short s4);

    void i(byte b4);

    void j(boolean z4);

    void l(float f4);

    void o(char c4);

    void p(A2.f fVar, int i4);

    void q();

    void t(InterfaceC3535j interfaceC3535j, Object obj);

    f v(A2.f fVar);

    void w(int i4);

    public static final class a {
        public static d a(f fVar, A2.f descriptor, int i4) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return fVar.b(descriptor);
        }

        public static void c(f fVar, InterfaceC3535j serializer, Object obj) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.getDescriptor().c()) {
                fVar.t(serializer, obj);
            } else if (obj == null) {
                fVar.e();
            } else {
                fVar.q();
                fVar.t(serializer, obj);
            }
        }

        public static void d(f fVar, InterfaceC3535j serializer, Object obj) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializer.serialize(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
