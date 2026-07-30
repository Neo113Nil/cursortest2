package A6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f139a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final x6.f f140b = P0.f.e("kotlinx.serialization.json.JsonNull", x6.h.f8441c, new x6.e[0], x6.g.f8439d);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        P0.f.d(decoder);
        if (!decoder.e()) {
            return v.INSTANCE;
        }
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        throw new B6.i("Expected 'null' literal");
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        v value = (v) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        P0.f.b(encoder);
        encoder.f251a.h("null");
    }

    @Override // w6.a
    public final x6.e c() {
        return f140b;
    }
}
