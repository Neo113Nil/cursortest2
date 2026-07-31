package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.C3534i;
import y2.InterfaceC3527b;

/* renamed from: C2.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0326o0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0326o0 f313a = new C0326o0();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f314b = C0324n0.f309a;

    private C0326o0() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new C3534i("'kotlin.Nothing' does not have instances");
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, Void value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new C3534i("'kotlin.Nothing' cannot be serialized");
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f314b;
    }
}
