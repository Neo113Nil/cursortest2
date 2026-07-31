package D2;

import A2.j;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class v implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final v f425a = new v();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f426b = A2.i.d("kotlinx.serialization.json.JsonNull", j.b.f98a, new A2.f[0], null, 8, null);

    private v() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m.g(decoder);
        if (decoder.r()) {
            throw new E2.B("Expected 'null' literal");
        }
        decoder.m();
        return u.INSTANCE;
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, u value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m.h(encoder);
        encoder.e();
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f426b;
    }
}
