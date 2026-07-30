package coil.compose;

import defpackage.cm1;
import defpackage.f6;
import defpackage.kj;
import defpackage.o20;
import defpackage.q20;
import defpackage.q40;
import defpackage.ql2;
import defpackage.ul1;
import defpackage.z71;
import defpackage.zm3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ContentPainterElement extends cm1 {
    public final kj a;
    public final f6 b;
    public final q20 c;

    public ContentPainterElement(kj kjVar, f6 f6Var, q20 q20Var) {
        this.a = kjVar;
        this.b = f6Var;
        this.c = q20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContentPainterElement) {
            ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
            if (this.a == contentPainterElement.a && Intrinsics.b(this.b, contentPainterElement.b) && Intrinsics.b(this.c, contentPainterElement.c) && Float.compare(1.0f, 1.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return q40.d(1.0f, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // defpackage.cm1
    public final ul1 i() {
        o20 o20Var = new o20();
        o20Var.A = this.a;
        o20Var.B = this.b;
        o20Var.C = this.c;
        o20Var.D = 1.0f;
        return o20Var;
    }

    @Override // defpackage.cm1
    public final void m(ul1 ul1Var) {
        o20 o20Var = (o20) ul1Var;
        long h = o20Var.A.h();
        kj kjVar = this.a;
        boolean a = ql2.a(h, kjVar.h());
        o20Var.A = kjVar;
        o20Var.B = this.b;
        o20Var.C = this.c;
        o20Var.D = 1.0f;
        if (!a) {
            zm3.C(o20Var);
        }
        z71.F(o20Var);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.a + ", alignment=" + this.b + ", contentScale=" + this.c + ", alpha=1.0, colorFilter=null)";
    }
}
