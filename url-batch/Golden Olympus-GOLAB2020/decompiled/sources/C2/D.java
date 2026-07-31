package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class D implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final D f188a = new D();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f189b = new D0("kotlin.time.Duration", e.i.f75a);

    private D() {
    }

    public long a(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return kotlin.time.a.f41281c.c(decoder.o());
    }

    public void b(B2.f encoder, long j4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.E(kotlin.time.a.D(j4));
    }

    @Override // y2.InterfaceC3526a
    public /* bridge */ /* synthetic */ Object deserialize(B2.e eVar) {
        return kotlin.time.a.e(a(eVar));
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f189b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((kotlin.time.a) obj).H());
    }
}
