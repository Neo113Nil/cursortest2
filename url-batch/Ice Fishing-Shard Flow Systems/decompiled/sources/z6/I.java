package z6;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8742a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.collections.A f8743b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8744c;

    public I(Unit objectInstance) {
        Intrinsics.checkNotNullParameter("kotlin.Unit", "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f8742a = objectInstance;
        this.f8743b = kotlin.collections.A.f6115d;
        this.f8744c = R5.i.a(R5.j.f2417d, new P.V(7, this));
    }

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        x6.e c7 = c();
        y6.a t6 = decoder.t(c7);
        int o7 = t6.o(c());
        if (o7 != -1) {
            throw new w6.c(C4.p.g(o7, "Unexpected index "));
        }
        Unit unit = Unit.f6114a;
        t6.b(c7);
        return this.f8742a;
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.a(c()).p(c());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R5.h, java.lang.Object] */
    @Override // w6.a
    public final x6.e c() {
        return (x6.e) this.f8744c.getValue();
    }
}
