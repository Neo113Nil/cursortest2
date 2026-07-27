package Q4;

import P4.T;
import java.util.Map;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class A implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final A f2494a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final z f2495b = z.f2564b;

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        AbstractC1341c.c(decoder);
        T t5 = T.f2344a;
        p pVar = p.f2552a;
        return new y((Map) new P4.B().a(decoder));
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        y value = (y) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC1341c.a(sVar);
        T t5 = T.f2344a;
        p pVar = p.f2552a;
        new P4.B().b(sVar, value);
    }

    @Override // M4.a
    public final N4.e c() {
        return f2495b;
    }
}
