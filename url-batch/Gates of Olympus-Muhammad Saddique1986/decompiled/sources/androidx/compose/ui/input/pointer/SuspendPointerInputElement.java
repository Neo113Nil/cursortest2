package androidx.compose.ui.input.pointer;

import U.p;
import e2.InterfaceC0426e;
import f2.j;
import java.util.Arrays;
import n0.C0702C;
import t0.U;
import x.Z;

/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4929a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4930b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f4931c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0426e f4932d;

    public SuspendPointerInputElement(Object obj, Z z3, InterfaceC0426e interfaceC0426e, int i3) {
        z3 = (i3 & 2) != 0 ? null : z3;
        this.f4929a = obj;
        this.f4930b = z3;
        this.f4931c = null;
        this.f4932d = interfaceC0426e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!j.a(this.f4929a, suspendPointerInputElement.f4929a) || !j.a(this.f4930b, suspendPointerInputElement.f4930b)) {
            return false;
        }
        Object[] objArr = this.f4931c;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f4931c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f4931c != null) {
            return false;
        }
        return this.f4932d == suspendPointerInputElement.f4932d;
    }

    public final int hashCode() {
        Object obj = this.f4929a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f4930b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f4931c;
        return this.f4932d.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // t0.U
    public final p l() {
        return new C0702C(this.f4929a, this.f4930b, this.f4931c, this.f4932d);
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0702C c0702c = (C0702C) pVar;
        Object obj = c0702c.f7259q;
        Object obj2 = this.f4929a;
        boolean z3 = !j.a(obj, obj2);
        c0702c.f7259q = obj2;
        Object obj3 = c0702c.f7260r;
        Object obj4 = this.f4930b;
        if (!j.a(obj3, obj4)) {
            z3 = true;
        }
        c0702c.f7260r = obj4;
        Object[] objArr = c0702c.f7261s;
        Object[] objArr2 = this.f4931c;
        if (objArr != null && objArr2 == null) {
            z3 = true;
        }
        if (objArr == null && objArr2 != null) {
            z3 = true;
        }
        boolean z4 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z3 : true;
        c0702c.f7261s = objArr2;
        if (z4) {
            c0702c.A0();
        }
        c0702c.f7262t = this.f4932d;
    }
}
