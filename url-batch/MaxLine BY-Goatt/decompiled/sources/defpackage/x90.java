package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x90 implements pf0 {
    public final int a;
    public final int b;

    public x90(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        i21.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.pf0
    public final void a(qf0 qf0Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = qf0Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(qf0Var.b((i5 - i4) + (-1))) && Character.isLowSurrogate(qf0Var.b(qf0Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = qf0Var.c;
            sg sgVar = qf0Var.a;
            if (i8 + i7 >= sgVar.c()) {
                i6 = sgVar.c() - qf0Var.c;
                break;
            } else {
                i6 = (Character.isHighSurrogate(qf0Var.b((qf0Var.c + i7) + (-1))) && Character.isLowSurrogate(qf0Var.b(qf0Var.c + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = qf0Var.c;
        qf0Var.a(i9, i6 + i9);
        int i10 = qf0Var.b;
        qf0Var.a(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return this.a == x90Var.a && this.b == x90Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return q40.o(sb, this.b, ')');
    }
}
