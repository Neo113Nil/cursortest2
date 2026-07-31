package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class V0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final V0 f257a = new V0();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f258b = S.a("kotlin.UInt", AbstractC3551a.E(kotlin.jvm.internal.r.f41161a));

    private V0() {
    }

    public int a(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return W1.t.b(decoder.p(getDescriptor()).j());
    }

    public void b(B2.f encoder, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.v(getDescriptor()).w(i4);
    }

    @Override // y2.InterfaceC3526a
    public /* bridge */ /* synthetic */ Object deserialize(B2.e eVar) {
        return W1.t.a(a(eVar));
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f258b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((W1.t) obj).f());
    }
}
