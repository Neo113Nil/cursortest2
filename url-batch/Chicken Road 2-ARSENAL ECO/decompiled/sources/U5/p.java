package U5;

import java.util.List;
import k5.C0481k;
import l5.C0512p;
import m1.AbstractC0521b;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class p implements R5.e {

    /* renamed from: a, reason: collision with root package name */
    public final C0481k f2664a;

    public p(InterfaceC0732a interfaceC0732a) {
        this.f2664a = AbstractC0521b.x(interfaceC0732a);
    }

    @Override // R5.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return j().a(name);
    }

    @Override // R5.e
    public final String b() {
        return j().b();
    }

    @Override // R5.e
    public final A3.c c() {
        return j().c();
    }

    @Override // R5.e
    public final int d() {
        return j().d();
    }

    @Override // R5.e
    public final String e(int i7) {
        return j().e(i7);
    }

    @Override // R5.e
    public final List g(int i7) {
        return j().g(i7);
    }

    @Override // R5.e
    public final List getAnnotations() {
        return C0512p.f5303f;
    }

    @Override // R5.e
    public final R5.e h(int i7) {
        return j().h(i7);
    }

    @Override // R5.e
    public final boolean i(int i7) {
        return j().i(i7);
    }

    @Override // R5.e
    public final boolean isInline() {
        return false;
    }

    public final R5.e j() {
        return (R5.e) this.f2664a.getValue();
    }

    @Override // R5.e
    public final void f() {
    }
}
