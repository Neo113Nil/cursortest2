package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w90 implements pf0 {
    public final int a;
    public final int b;

    public w90(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        i21.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.pf0
    public final void a(qf0 qf0Var) {
        int i = qf0Var.c;
        sg sgVar = qf0Var.a;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = sgVar.c();
        }
        qf0Var.a(qf0Var.c, Math.min(i3, sgVar.c()));
        int i4 = qf0Var.b;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        qf0Var.a(Math.max(0, i6), qf0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w90)) {
            return false;
        }
        w90 w90Var = (w90) obj;
        return this.a == w90Var.a && this.b == w90Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return q40.o(sb, this.b, ')');
    }
}
