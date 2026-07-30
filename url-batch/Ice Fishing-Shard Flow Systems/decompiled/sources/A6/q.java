package A6;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements x6.e {

    /* renamed from: a, reason: collision with root package name */
    public final R5.q f133a;

    public q(Function0 function0) {
        this.f133a = R5.i.b(function0);
    }

    @Override // x6.e
    public final int a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return k().a(name);
    }

    @Override // x6.e
    public final String b() {
        return k().b();
    }

    @Override // x6.e
    public final V6.b c() {
        return k().c();
    }

    @Override // x6.e
    public final int d() {
        return k().d();
    }

    @Override // x6.e
    public final String e(int i2) {
        return k().e(i2);
    }

    @Override // x6.e
    public final boolean f() {
        return false;
    }

    @Override // x6.e
    public final List getAnnotations() {
        return kotlin.collections.A.f6115d;
    }

    @Override // x6.e
    public final List h(int i2) {
        return k().h(i2);
    }

    @Override // x6.e
    public final x6.e i(int i2) {
        return k().i(i2);
    }

    @Override // x6.e
    public final boolean j(int i2) {
        return k().j(i2);
    }

    public final x6.e k() {
        return (x6.e) this.f133a.getValue();
    }

    @Override // x6.e
    public final void g() {
    }
}
