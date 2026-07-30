package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lj2 implements pf0 {
    public final yd a;
    public final int b;

    public lj2(String str, int i) {
        this.a = new yd(str);
        this.b = i;
    }

    @Override // defpackage.pf0
    public final void a(qf0 qf0Var) {
        int i = qf0Var.d;
        yd ydVar = this.a;
        if (i != -1) {
            int i2 = qf0Var.e;
            String str = ydVar.n;
            String str2 = ydVar.n;
            qf0Var.d(str, i, i2);
            if (str2.length() > 0) {
                qf0Var.e(i, str2.length() + i);
            }
        } else {
            int i3 = qf0Var.b;
            int i4 = qf0Var.c;
            String str3 = ydVar.n;
            String str4 = ydVar.n;
            qf0Var.d(str3, i3, i4);
            if (str4.length() > 0) {
                qf0Var.e(i3, str4.length() + i3);
            }
        }
        int i5 = qf0Var.b;
        int i6 = qf0Var.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int c = d.c(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - ydVar.n.length(), 0, qf0Var.a.c());
        qf0Var.f(c, c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj2)) {
            return false;
        }
        lj2 lj2Var = (lj2) obj;
        return Intrinsics.b(this.a.n, lj2Var.a.n) && this.b == lj2Var.b;
    }

    public final int hashCode() {
        return (this.a.n.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.n);
        sb.append("', newCursorPosition=");
        return q40.o(sb, this.b, ')');
    }
}
