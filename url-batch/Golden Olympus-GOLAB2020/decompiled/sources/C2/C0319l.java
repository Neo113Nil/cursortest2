package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0319l implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0319l f304a = new C0319l();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f305b = new D0("kotlin.Byte", e.b.f68a);

    private C0319l() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.A());
    }

    public void b(B2.f encoder, byte b4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.i(b4);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f305b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}
