package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class r implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final r f326a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f327b = new D0("kotlin.Char", e.c.f69a);

    private r() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.f());
    }

    public void b(B2.f encoder, char c4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.o(c4);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f327b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
