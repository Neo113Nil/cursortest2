package b8;

import a8.C0436c;
import java.util.List;

/* loaded from: classes2.dex */
public final class g implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f5590a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f5591b = f.f5587b;

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        e value = (e) obj;
        kotlin.jvm.internal.h.e(value, "value");
        p8.g.a(rVar);
        p pVar = p.f5617a;
        new C0436c().a(rVar, value);
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        p8.g.c(decoder);
        p pVar = p.f5617a;
        return new e((List) new C0436c().b(decoder));
    }

    @Override // X7.a
    public final Y7.e c() {
        return f5591b;
    }
}
