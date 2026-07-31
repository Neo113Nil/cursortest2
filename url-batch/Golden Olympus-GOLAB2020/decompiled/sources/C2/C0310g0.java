package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0310g0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0310g0 f284a = new C0310g0();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f285b = new D0("kotlin.Long", e.g.f73a);

    private C0310g0() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.q());
    }

    public void b(B2.f encoder, long j4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.A(j4);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f285b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
