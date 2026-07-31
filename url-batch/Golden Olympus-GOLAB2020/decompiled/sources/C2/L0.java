package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class L0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f222a = new L0();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f223b = new D0("kotlin.Short", e.h.f74a);

    private L0() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.E());
    }

    public void b(B2.f encoder, short s4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(s4);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f223b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
