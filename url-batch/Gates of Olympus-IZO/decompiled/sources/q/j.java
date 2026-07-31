package q;

import L1.z;
import m2.EnumC0626a;
import n2.AbstractC0682G;
import n2.C0681F;
import n2.InterfaceC0700f;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C0681F f6817a = AbstractC0682G.a(0, 16, EnumC0626a.f5930e);

    @Override // q.i
    public final InterfaceC0700f a() {
        return this.f6817a;
    }

    public final Object b(h hVar, R1.c cVar) {
        Object emit = this.f6817a.emit(hVar, cVar);
        return emit == Q1.a.f3113d ? emit : z.f2729a;
    }

    public final void c(h hVar) {
        this.f6817a.c(hVar);
    }
}
