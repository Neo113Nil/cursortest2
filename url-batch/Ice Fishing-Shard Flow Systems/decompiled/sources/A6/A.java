package A6;

import java.util.Map;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import z6.U;

/* loaded from: classes.dex */
public final class A implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final A f90a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final z f91b = z.f142b;

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        P0.f.d(decoder);
        Intrinsics.checkNotNullParameter(H.f6155a, "<this>");
        U u7 = U.f8759a;
        p pVar = p.f131a;
        U keySerializer = U.f8759a;
        p valueSerializer = p.f131a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new y((Map) new z6.B().a(decoder));
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        y value = (y) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        P0.f.b(encoder);
        Intrinsics.checkNotNullParameter(H.f6155a, "<this>");
        U u7 = U.f8759a;
        p pVar = p.f131a;
        U keySerializer = U.f8759a;
        p valueSerializer = p.f131a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        new z6.B().b(encoder, value);
    }

    @Override // w6.a
    public final x6.e c() {
        return f91b;
    }
}
