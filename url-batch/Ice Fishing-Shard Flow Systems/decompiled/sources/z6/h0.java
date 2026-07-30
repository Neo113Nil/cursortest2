package z6;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 implements w6.a {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f8790b = new h0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f8791a = new I(Unit.f6114a);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f8791a.a(decoder);
        return Unit.f6114a;
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8791a.b(encoder, value);
    }

    @Override // w6.a
    public final x6.e c() {
        return this.f8791a.c();
    }
}
