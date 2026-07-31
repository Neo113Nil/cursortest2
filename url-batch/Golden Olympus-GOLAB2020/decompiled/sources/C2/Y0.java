package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class Y0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0 f265a = new Y0();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f266b = S.a("kotlin.ULong", AbstractC3551a.F(kotlin.jvm.internal.t.f41162a));

    private Y0() {
    }

    public long a(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return W1.v.b(decoder.p(getDescriptor()).q());
    }

    public void b(B2.f encoder, long j4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.v(getDescriptor()).A(j4);
    }

    @Override // y2.InterfaceC3526a
    public /* bridge */ /* synthetic */ Object deserialize(B2.e eVar) {
        return W1.v.a(a(eVar));
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f266b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((W1.v) obj).f());
    }
}
