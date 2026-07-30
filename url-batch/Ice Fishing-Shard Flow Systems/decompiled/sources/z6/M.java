package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class M extends C {

    /* renamed from: b, reason: collision with root package name */
    public final String f8749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(x6.e primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f8749b = primitive.b() + "Array";
    }

    @Override // x6.e
    public final String b() {
        return this.f8749b;
    }
}
