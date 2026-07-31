package B2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3526a;

/* loaded from: classes3.dex */
public interface e {

    public static final class a {
        public static Object a(e eVar, InterfaceC3526a deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return deserializer.deserialize(eVar);
        }
    }

    byte A();

    short E();

    float F();

    double H();

    c b(A2.f fVar);

    boolean e();

    char f();

    int j();

    Void m();

    int n(A2.f fVar);

    String o();

    e p(A2.f fVar);

    long q();

    boolean r();

    Object u(InterfaceC3526a interfaceC3526a);
}
