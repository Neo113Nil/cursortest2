package A6;

import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final D f92a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final x6.f f93b = P0.f.e("kotlinx.serialization.json.JsonPrimitive", x6.c.j, new x6.e[0], x6.g.f8439d);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        l d02 = P0.f.d(decoder).d0();
        if (d02 instanceof C) {
            return (C) d02;
        }
        throw B6.m.b(-1, "Unexpected JSON element, expected JsonPrimitive, had " + E.a(d02.getClass()), d02.toString());
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        C value = (C) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        P0.f.b(encoder);
        if (value instanceof v) {
            encoder.m(w.f139a, v.INSTANCE);
        } else {
            encoder.m(t.f136a, (s) value);
        }
    }

    @Override // w6.a
    public final x6.e c() {
        return f93b;
    }
}
