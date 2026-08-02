package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hkm extends hma {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(hky hkyVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(hkyVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.hma
    public final int b() {
        return this.b;
    }

    @Override // defpackage.hma
    public final hky c(int i) {
        if (i < this.b) {
            return (hky) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.hma
    public final Object d(hky hkyVar) {
        int a = a(hkyVar);
        if (a != -1) {
            return hkyVar.c(this.a[a + a + 1]);
        }
        return null;
    }

    @Override // defpackage.hma
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(hky hkyVar, Object obj) {
        int a;
        if (!hkyVar.b && (a = a(hkyVar)) != -1) {
            obj.getClass();
            this.a[a + a + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            objArr = Arrays.copyOf(objArr, length + length);
            this.a = objArr;
        }
        int i2 = this.b;
        int i3 = i2 + i2;
        hkyVar.getClass();
        objArr[i3] = hkyVar;
        obj.getClass();
        objArr[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
