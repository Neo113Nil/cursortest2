package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0328p0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3527b f317a;

    /* renamed from: b, reason: collision with root package name */
    private final A2.f f318b;

    public C0328p0(InterfaceC3527b serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f317a = serializer;
        this.f318b = new G0(serializer.getDescriptor());
    }

    @Override // y2.InterfaceC3526a
    public Object deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.r() ? decoder.u(this.f317a) : decoder.m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0328p0.class == obj.getClass() && Intrinsics.areEqual(this.f317a, ((C0328p0) obj).f317a);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return this.f318b;
    }

    public int hashCode() {
        return this.f317a.hashCode();
    }

    @Override // y2.InterfaceC3535j
    public void serialize(B2.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj == null) {
            encoder.e();
        } else {
            encoder.q();
            encoder.t(this.f317a, obj);
        }
    }
}
