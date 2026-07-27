package Q4;

import a.AbstractC0169a;
import f4.C0434k;
import g4.C0471p;
import java.util.List;
import n2.AbstractC1341c;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class q implements N4.e {

    /* renamed from: a, reason: collision with root package name */
    public final C0434k f2554a;

    public q(InterfaceC1430a interfaceC1430a) {
        this.f2554a = AbstractC0169a.A(interfaceC1430a);
    }

    @Override // N4.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return j().a(name);
    }

    @Override // N4.e
    public final String b() {
        return j().b();
    }

    @Override // N4.e
    public final AbstractC1341c c() {
        return j().c();
    }

    @Override // N4.e
    public final int d() {
        return j().d();
    }

    @Override // N4.e
    public final String e(int i2) {
        return j().e(i2);
    }

    @Override // N4.e
    public final List g(int i2) {
        return j().g(i2);
    }

    @Override // N4.e
    public final List getAnnotations() {
        return C0471p.f5750a;
    }

    @Override // N4.e
    public final N4.e h(int i2) {
        return j().h(i2);
    }

    @Override // N4.e
    public final boolean i(int i2) {
        return j().i(i2);
    }

    @Override // N4.e
    public final boolean isInline() {
        return false;
    }

    public final N4.e j() {
        return (N4.e) this.f2554a.getValue();
    }

    @Override // N4.e
    public final void f() {
    }
}
