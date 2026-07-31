package C2;

import kotlin.jvm.internal.C3239e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class S0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final S0 f247a = new S0();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f248b = S.a("kotlin.UByte", AbstractC3551a.A(C3239e.f41148a));

    private S0() {
    }

    public byte a(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return W1.r.b(decoder.p(getDescriptor()).A());
    }

    public void b(B2.f encoder, byte b4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.v(getDescriptor()).i(b4);
    }

    @Override // y2.InterfaceC3526a
    public /* bridge */ /* synthetic */ Object deserialize(B2.e eVar) {
        return W1.r.a(a(eVar));
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f248b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((W1.r) obj).f());
    }
}
