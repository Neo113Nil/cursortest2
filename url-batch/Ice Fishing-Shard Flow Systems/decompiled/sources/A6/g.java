package A6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z6.C1063c;

/* loaded from: classes.dex */
public final class g implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f104a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f105b = f.f101b;

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        P0.f.d(decoder);
        p elementSerializer = p.f131a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new e((List) new C1063c().a(decoder));
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        e value = (e) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        P0.f.b(encoder);
        p elementSerializer = p.f131a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        new C1063c().b(encoder, value);
    }

    @Override // w6.a
    public final x6.e c() {
        return f105b;
    }
}
