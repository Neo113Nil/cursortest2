package androidx.compose.foundation.text.modifiers;

import defpackage.cm1;
import defpackage.dz1;
import defpackage.hp0;
import defpackage.in1;
import defpackage.ow2;
import defpackage.pw2;
import defpackage.q40;
import defpackage.ul1;
import defpackage.yh2;
import defpackage.z71;
import defpackage.zm3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends cm1 {
    public final String a;
    public final pw2 b;
    public final hp0 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public TextStringSimpleElement(String str, pw2 pw2Var, hp0 hp0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = pw2Var;
        this.c = hp0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return Intrinsics.b(this.a, textStringSimpleElement.a) && Intrinsics.b(this.b, textStringSimpleElement.b) && Intrinsics.b(this.c, textStringSimpleElement.c) && this.d == textStringSimpleElement.d && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g;
    }

    public final int hashCode() {
        return (((in1.i(q40.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        ow2 ow2Var = new ow2();
        ow2Var.A = this.a;
        ow2Var.B = this.b;
        ow2Var.C = this.c;
        ow2Var.D = this.d;
        ow2Var.E = this.e;
        ow2Var.F = this.f;
        ow2Var.G = this.g;
        return ow2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.cm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(ul1 ul1Var) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        hp0 hp0Var;
        hp0 hp0Var2;
        int i5;
        int i6;
        ow2 ow2Var = (ow2) ul1Var;
        ow2Var.getClass();
        pw2 pw2Var = ow2Var.B;
        boolean z4 = false;
        boolean z5 = true;
        pw2 pw2Var2 = this.b;
        if (pw2Var2 == pw2Var) {
            pw2Var2.getClass();
        } else if (!pw2Var2.a.b(pw2Var.a)) {
            z = true;
            str = ow2Var.A;
            str2 = this.a;
            if (!Intrinsics.b(str, str2)) {
                ow2Var.A = str2;
                ow2Var.K = null;
                z4 = true;
            }
            boolean z6 = !ow2Var.B.c(pw2Var2);
            ow2Var.B = pw2Var2;
            i = ow2Var.G;
            i2 = this.g;
            if (i != i2) {
                ow2Var.G = i2;
                z6 = true;
            }
            i3 = ow2Var.F;
            i4 = this.f;
            if (i3 != i4) {
                ow2Var.F = i4;
                z6 = true;
            }
            z2 = ow2Var.E;
            z3 = this.e;
            if (z2 != z3) {
                ow2Var.E = z3;
                z6 = true;
            }
            hp0Var = ow2Var.C;
            hp0Var2 = this.c;
            if (!Intrinsics.b(hp0Var, hp0Var2)) {
                ow2Var.C = hp0Var2;
                z6 = true;
            }
            i5 = ow2Var.D;
            i6 = this.d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                ow2Var.D = i6;
            }
            if (!z4 || z5) {
                dz1 G0 = ow2Var.G0();
                String str3 = ow2Var.A;
                pw2 pw2Var3 = ow2Var.B;
                hp0 hp0Var3 = ow2Var.C;
                int i7 = ow2Var.D;
                boolean z7 = ow2Var.E;
                int i8 = ow2Var.F;
                int i9 = ow2Var.G;
                G0.a = str3;
                G0.b = pw2Var3;
                G0.c = hp0Var3;
                G0.d = i7;
                G0.e = z7;
                G0.f = i8;
                G0.g = i9;
                G0.c();
            }
            if (ow2Var.z) {
                return;
            }
            if (z4 || (z && ow2Var.J != null)) {
                yh2.l(ow2Var);
            }
            if (z4 || z5) {
                zm3.C(ow2Var);
                z71.F(ow2Var);
            }
            if (z) {
                z71.F(ow2Var);
                return;
            }
            return;
        }
        z = false;
        str = ow2Var.A;
        str2 = this.a;
        if (!Intrinsics.b(str, str2)) {
        }
        boolean z62 = !ow2Var.B.c(pw2Var2);
        ow2Var.B = pw2Var2;
        i = ow2Var.G;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = ow2Var.F;
        i4 = this.f;
        if (i3 != i4) {
        }
        z2 = ow2Var.E;
        z3 = this.e;
        if (z2 != z3) {
        }
        hp0Var = ow2Var.C;
        hp0Var2 = this.c;
        if (!Intrinsics.b(hp0Var, hp0Var2)) {
        }
        i5 = ow2Var.D;
        i6 = this.d;
        if (i5 != i6) {
        }
        if (!z4) {
        }
        dz1 G02 = ow2Var.G0();
        String str32 = ow2Var.A;
        pw2 pw2Var32 = ow2Var.B;
        hp0 hp0Var32 = ow2Var.C;
        int i72 = ow2Var.D;
        boolean z72 = ow2Var.E;
        int i82 = ow2Var.F;
        int i92 = ow2Var.G;
        G02.a = str32;
        G02.b = pw2Var32;
        G02.c = hp0Var32;
        G02.d = i72;
        G02.e = z72;
        G02.f = i82;
        G02.g = i92;
        G02.c();
        if (ow2Var.z) {
        }
    }
}
