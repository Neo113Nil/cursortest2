package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class V implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final V f255a = new V();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f256b = new D0("kotlin.Int", e.f.f72a);

    private V() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.j());
    }

    public void b(B2.f encoder, int i4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.w(i4);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f256b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}
