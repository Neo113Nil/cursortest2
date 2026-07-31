package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class K implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final K f219a = new K();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f220b = new D0("kotlin.Float", e.C0001e.f71a);

    private K() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.F());
    }

    public void b(B2.f encoder, float f4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.l(f4);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f220b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
