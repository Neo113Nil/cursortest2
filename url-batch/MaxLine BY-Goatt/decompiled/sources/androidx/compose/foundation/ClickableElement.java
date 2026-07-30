package androidx.compose.foundation;

import defpackage.bn1;
import defpackage.cm1;
import defpackage.d21;
import defpackage.fb2;
import defpackage.in1;
import defpackage.nu;
import defpackage.ul1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class ClickableElement extends cm1 {
    public final bn1 a;
    public final d21 b;
    public final boolean c;
    public final String d;
    public final fb2 e;
    public final Function0 f;

    public ClickableElement(bn1 bn1Var, d21 d21Var, boolean z, String str, fb2 fb2Var, Function0 function0) {
        this.a = bn1Var;
        this.b = d21Var;
        this.c = z;
        this.d = str;
        this.e = fb2Var;
        this.f = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.b(this.a, clickableElement.a) && Intrinsics.b(this.b, clickableElement.b) && this.c == clickableElement.c && Intrinsics.b(this.d, clickableElement.d) && Intrinsics.b(this.e, clickableElement.e) && this.f == clickableElement.f;
    }

    public final int hashCode() {
        bn1 bn1Var = this.a;
        int hashCode = (bn1Var != null ? bn1Var.hashCode() : 0) * 31;
        d21 d21Var = this.b;
        int i = in1.i((hashCode + (d21Var != null ? d21Var.hashCode() : 0)) * 31, 31, this.c);
        String str = this.d;
        int hashCode2 = (i + (str != null ? str.hashCode() : 0)) * 31;
        fb2 fb2Var = this.e;
        return this.f.hashCode() + ((hashCode2 + (fb2Var != null ? Integer.hashCode(fb2Var.a) : 0)) * 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        return new nu(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        ((nu) ul1Var).M0(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
