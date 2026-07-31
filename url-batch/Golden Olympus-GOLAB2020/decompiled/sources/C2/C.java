package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class C implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final C f185a = new C();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f186b = new D0("kotlin.Double", e.d.f70a);

    private C() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.H());
    }

    public void b(B2.f encoder, double d4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(d4);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f186b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
