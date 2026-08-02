package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpa implements Cloneable {
    private static final int[] c = new int[0];
    public int[] a;
    public int b;

    public jpa() {
        this.b = 0;
        this.a = c;
    }

    private final void f(int i) {
        if (i > this.a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.a = iArr;
        }
    }

    public final int a() {
        return (this.b + 7) / 8;
    }

    public final void b(boolean z) {
        f(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final void c(jpa jpaVar) {
        int i = jpaVar.b;
        f(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            b(jpaVar.e(i2));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new jpa((int[]) this.a.clone(), this.b);
    }

    public final void d(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i3 = this.b;
        f(i3 + i2);
        while (true) {
            i2--;
            if (i2 < 0) {
                this.b = i3;
                return;
            }
            if (((1 << i2) & i) != 0) {
                int[] iArr = this.a;
                int i4 = i3 / 32;
                iArr[i4] = (1 << (i3 & 31)) | iArr[i4];
            }
            i3++;
        }
    }

    public final boolean e(int i) {
        return (this.a[i / 32] & (1 << (i & 31))) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jpa)) {
            return false;
        }
        jpa jpaVar = (jpa) obj;
        return this.b == jpaVar.b && Arrays.equals(this.a, jpaVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(true != e(i2) ? '.' : 'X');
        }
        return sb.toString();
    }

    public jpa(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }
}
