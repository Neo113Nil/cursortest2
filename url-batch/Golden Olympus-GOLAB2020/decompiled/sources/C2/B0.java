package C2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class B0 extends AbstractC0304d0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(A2.f primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f184c = primitive.a() + "Array";
    }

    @Override // A2.f
    public String a() {
        return this.f184c;
    }
}
