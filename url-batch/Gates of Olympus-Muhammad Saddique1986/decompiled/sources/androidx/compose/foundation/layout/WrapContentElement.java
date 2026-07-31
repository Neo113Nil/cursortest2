package androidx.compose.foundation.layout;

import U.p;
import e2.InterfaceC0426e;
import f2.j;
import f2.k;
import m.AbstractC0625j;
import r.c0;
import t0.U;

/* loaded from: classes.dex */
final class WrapContentElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final int f4823a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4824b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4825c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4826d;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i3, boolean z3, InterfaceC0426e interfaceC0426e, Object obj) {
        this.f4823a = i3;
        this.f4824b = z3;
        this.f4825c = (k) interfaceC0426e;
        this.f4826d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f4823a == wrapContentElement.f4823a && this.f4824b == wrapContentElement.f4824b && j.a(this.f4826d, wrapContentElement.f4826d);
    }

    public final int hashCode() {
        return this.f4826d.hashCode() + A.k.e(AbstractC0625j.b(this.f4823a) * 31, 31, this.f4824b);
    }

    @Override // t0.U
    public final p l() {
        c0 c0Var = new c0();
        c0Var.f8042q = this.f4823a;
        c0Var.f8043r = this.f4824b;
        c0Var.f8044s = this.f4825c;
        return c0Var;
    }

    @Override // t0.U
    public final void m(p pVar) {
        c0 c0Var = (c0) pVar;
        c0Var.f8042q = this.f4823a;
        c0Var.f8043r = this.f4824b;
        c0Var.f8044s = this.f4825c;
    }
}
