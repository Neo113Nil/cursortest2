package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class b1 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f271a = new b1();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f272b = S.a("kotlin.UShort", AbstractC3551a.G(kotlin.jvm.internal.J.f41135a));

    private b1() {
    }

    public short a(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return W1.y.b(decoder.p(getDescriptor()).E());
    }

    public void b(B2.f encoder, short s4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.v(getDescriptor()).h(s4);
    }

    @Override // y2.InterfaceC3526a
    public /* bridge */ /* synthetic */ Object deserialize(B2.e eVar) {
        return W1.y.a(a(eVar));
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f272b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((W1.y) obj).f());
    }
}
