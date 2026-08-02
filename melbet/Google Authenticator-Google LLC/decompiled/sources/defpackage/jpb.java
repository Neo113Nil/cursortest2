package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpb implements Cloneable {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public jpb(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.d = new int[i3 * i2];
    }

    public final boolean a(int i, int i2) {
        return ((this.d[(i2 * this.c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new jpb(this.a, this.b, this.c, (int[]) this.d.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jpb)) {
            return false;
        }
        jpb jpbVar = (jpb) obj;
        return this.a == jpbVar.a && this.b == jpbVar.b && this.c == jpbVar.c && Arrays.equals(this.d, jpbVar.d);
    }

    public final int hashCode() {
        int i = this.a;
        return (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b * (this.a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                sb.append(true != a(i2, i) ? "  " : "X ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private jpb(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }
}
