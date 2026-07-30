package A6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f131a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final x6.f f132b = P0.f.e("kotlinx.serialization.json.JsonElement", x6.b.f8420b, new x6.e[0], o.f128e);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return P0.f.d(decoder).d0();
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        l value = (l) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        P0.f.b(encoder);
        if (value instanceof C) {
            encoder.m(D.f92a, value);
        } else if (value instanceof y) {
            encoder.m(A.f90a, value);
        } else if (value instanceof e) {
            encoder.m(g.f104a, value);
        }
    }

    @Override // w6.a
    public final x6.e c() {
        return f132b;
    }
}
