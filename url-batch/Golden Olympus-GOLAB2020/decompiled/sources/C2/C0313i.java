package C2;

import A2.e;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0313i implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0313i f292a = new C0313i();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f293b = new D0("kotlin.Boolean", e.a.f67a);

    private C0313i() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.e());
    }

    public void b(B2.f encoder, boolean z4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.j(z4);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f293b;
    }

    @Override // y2.InterfaceC3535j
    public /* bridge */ /* synthetic */ void serialize(B2.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
