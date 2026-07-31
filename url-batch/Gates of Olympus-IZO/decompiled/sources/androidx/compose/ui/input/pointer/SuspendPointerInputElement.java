package androidx.compose.ui.input.pointer;

import R1.i;
import U.k;
import Y1.e;
import f.AbstractC0382a;
import java.util.Arrays;
import n0.v;
import t0.T;

/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3730a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3731b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f3732c;

    /* renamed from: d, reason: collision with root package name */
    public final i f3733d;

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendPointerInputElement(Object obj, AbstractC0382a abstractC0382a, e eVar, int i3) {
        abstractC0382a = (i3 & 2) != 0 ? null : abstractC0382a;
        this.f3730a = obj;
        this.f3731b = abstractC0382a;
        this.f3732c = null;
        this.f3733d = (i) eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!Z1.i.a(this.f3730a, suspendPointerInputElement.f3730a) || !Z1.i.a(this.f3731b, suspendPointerInputElement.f3731b)) {
            return false;
        }
        Object[] objArr = suspendPointerInputElement.f3732c;
        Object[] objArr2 = this.f3732c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f3733d == suspendPointerInputElement.f3733d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.i, Y1.e] */
    @Override // t0.T
    public final k h() {
        return new v(this.f3730a, this.f3731b, this.f3732c, this.f3733d);
    }

    public final int hashCode() {
        Object obj = this.f3730a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f3731b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f3732c;
        return this.f3733d.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        v vVar = (v) kVar;
        Object obj = vVar.f6261q;
        Object obj2 = this.f3730a;
        boolean z3 = !Z1.i.a(obj, obj2);
        vVar.f6261q = obj2;
        Object obj3 = vVar.f6262r;
        Object obj4 = this.f3731b;
        if (!Z1.i.a(obj3, obj4)) {
            z3 = true;
        }
        vVar.f6262r = obj4;
        Object[] objArr = vVar.f6263s;
        Object[] objArr2 = this.f3732c;
        if (objArr != null && objArr2 == null) {
            z3 = true;
        }
        if (objArr == null && objArr2 != null) {
            z3 = true;
        }
        boolean z4 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z3 : true;
        vVar.f6263s = objArr2;
        if (z4) {
            vVar.w0();
        }
        vVar.f6264t = this.f3733d;
    }
}
