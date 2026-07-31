package E2;

import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class I extends AbstractC0372c {

    /* renamed from: f, reason: collision with root package name */
    private final D2.i f524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC0348a json, D2.i value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f524f = value;
        X("primitive");
    }

    @Override // E2.AbstractC0372c
    protected D2.i e0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // E2.AbstractC0372c
    public D2.i s0() {
        return this.f524f;
    }

    @Override // B2.c
    public int t(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }
}
