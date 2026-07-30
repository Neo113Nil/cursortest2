package androidx.compose.foundation.layout;

import defpackage.cm1;
import defpackage.pc0;
import defpackage.q40;
import defpackage.rl2;
import defpackage.ul1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class SizeElement extends cm1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return pc0.a(this.a, sizeElement.a) && pc0.a(this.b, sizeElement.b) && pc0.a(this.c, sizeElement.c) && pc0.a(this.d, sizeElement.d) && this.e == sizeElement.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + q40.d(this.d, q40.d(this.c, q40.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        rl2 rl2Var = new rl2();
        rl2Var.A = this.a;
        rl2Var.B = this.b;
        rl2Var.C = this.c;
        rl2Var.D = this.d;
        rl2Var.E = this.e;
        return rl2Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        rl2 rl2Var = (rl2) ul1Var;
        rl2Var.A = this.a;
        rl2Var.B = this.b;
        rl2Var.C = this.c;
        rl2Var.D = this.d;
        rl2Var.E = this.e;
    }

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
