package B2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3526a;

/* loaded from: classes3.dex */
public interface c {

    public static final class a {
        public static int a(c cVar, A2.f descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, A2.f fVar, int i4, InterfaceC3526a interfaceC3526a, Object obj, int i5, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i5 & 8) != 0) {
                obj = null;
            }
            return cVar.y(fVar, i4, interfaceC3526a, obj);
        }
    }

    Object B(A2.f fVar, int i4, InterfaceC3526a interfaceC3526a, Object obj);

    long C(A2.f fVar, int i4);

    double D(A2.f fVar, int i4);

    char G(A2.f fVar, int i4);

    F2.b a();

    void c(A2.f fVar);

    int g(A2.f fVar);

    String h(A2.f fVar, int i4);

    byte k(A2.f fVar, int i4);

    e l(A2.f fVar, int i4);

    int s(A2.f fVar, int i4);

    int t(A2.f fVar);

    boolean v();

    float w(A2.f fVar, int i4);

    boolean x(A2.f fVar, int i4);

    Object y(A2.f fVar, int i4, InterfaceC3526a interfaceC3526a, Object obj);

    short z(A2.f fVar, int i4);
}
