package q;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.InterfaceC1050c;
import q0.InterfaceC1054g;

/* renamed from: q.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043v implements InterfaceC1050c {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f9345a;

    /* renamed from: b, reason: collision with root package name */
    public m0 f9346b;

    public C1043v(Function1 function1) {
        this.f9345a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1043v) && ((C1043v) obj).f9345a == this.f9345a;
    }

    public final int hashCode() {
        return this.f9345a.hashCode();
    }

    @Override // q0.InterfaceC1050c
    public final void k(InterfaceC1054g interfaceC1054g) {
        m0 m0Var = (m0) interfaceC1054g.g(q0.f9327a);
        if (Intrinsics.a(m0Var, this.f9346b)) {
            return;
        }
        this.f9346b = m0Var;
        this.f9345a.invoke(m0Var);
    }
}
