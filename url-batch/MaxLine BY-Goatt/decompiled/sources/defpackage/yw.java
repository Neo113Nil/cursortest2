package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yw implements pf0 {
    public final yd a;
    public final int b;

    public yw(String str, int i) {
        this(new yd(str), i);
    }

    @Override // defpackage.pf0
    public final void a(qf0 qf0Var) {
        int i = qf0Var.d;
        yd ydVar = this.a;
        if (i != -1) {
            qf0Var.d(ydVar.n, i, qf0Var.e);
        } else {
            qf0Var.d(ydVar.n, qf0Var.b, qf0Var.c);
        }
        int i2 = qf0Var.b;
        int i3 = qf0Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int c = d.c(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - ydVar.n.length(), 0, qf0Var.a.c());
        qf0Var.f(c, c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw)) {
            return false;
        }
        yw ywVar = (yw) obj;
        return Intrinsics.b(this.a.n, ywVar.a.n) && this.b == ywVar.b;
    }

    public final int hashCode() {
        return (this.a.n.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.n);
        sb.append("', newCursorPosition=");
        return q40.o(sb, this.b, ')');
    }

    public yw(yd ydVar, int i) {
        this.a = ydVar;
        this.b = i;
    }
}
