package androidx.compose.ui.input.pointer;

import defpackage.bu2;
import defpackage.cm1;
import defpackage.qr2;
import defpackage.ul1;
import defpackage.vr2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends cm1 {
    public final Object a;
    public final Object b;
    public final qr2 c;

    public SuspendPointerInputElement(Object obj, bu2 bu2Var, qr2 qr2Var, int i) {
        bu2Var = (i & 2) != 0 ? null : bu2Var;
        this.a = obj;
        this.b = bu2Var;
        this.c = qr2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return Intrinsics.b(this.a, suspendPointerInputElement.a) && Intrinsics.b(this.b, suspendPointerInputElement.b) && this.c == suspendPointerInputElement.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new vr2(this.a, this.b, this.c);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        vr2 vr2Var = (vr2) ul1Var;
        Object obj = vr2Var.A;
        Object obj2 = this.a;
        boolean z = !Intrinsics.b(obj, obj2);
        vr2Var.A = obj2;
        Object obj3 = vr2Var.B;
        Object obj4 = this.b;
        if (!Intrinsics.b(obj3, obj4)) {
            z = true;
        }
        vr2Var.B = obj4;
        if (vr2Var.D.getClass() == qr2.class ? z : true) {
            vr2Var.I0();
        }
        vr2Var.D = this.c;
    }
}
