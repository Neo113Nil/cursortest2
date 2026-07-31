package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class M0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f224a = new M0();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f225b = new D0("kotlin.String", e.i.f75a);

    private M0() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.o();
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, String value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.E(value);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f225b;
    }
}
