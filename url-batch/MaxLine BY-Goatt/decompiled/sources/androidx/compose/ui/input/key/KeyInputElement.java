package androidx.compose.ui.input.key;

import defpackage.c81;
import defpackage.cm1;
import defpackage.ul1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class KeyInputElement extends cm1 {
    public final Function1 a;
    public final Function1 b;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.a = function1;
        this.b = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.a == keyInputElement.a && this.b == keyInputElement.b;
    }

    public final int hashCode() {
        Function1 function1 = this.a;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.b;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        c81 c81Var = new c81();
        c81Var.A = this.a;
        c81Var.B = this.b;
        return c81Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        c81 c81Var = (c81) ul1Var;
        c81Var.A = this.a;
        c81Var.B = this.b;
    }
}
