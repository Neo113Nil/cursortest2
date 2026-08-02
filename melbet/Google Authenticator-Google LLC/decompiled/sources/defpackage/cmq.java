package defpackage;

import android.os.Looper;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmq {
    public Object a;
    public Object b;

    public final cmr a() {
        if (this.b == null) {
            this.b = new ox(null);
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new cmr((ox) this.b, (Looper) this.a);
    }

    public final bnc b() {
        iwm.a(this.b, jqw.class);
        iwm.a(this.a, jrn.class);
        return new bnc();
    }

    public final void c() {
        Object obj = this.a;
        if (obj != null) {
            Arrays.fill((int[]) obj, -1);
        }
        this.b = null;
    }

    public final void d(int i) {
        Object obj = this.a;
        if (obj == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.a = iArr;
            Arrays.fill(iArr, -1);
            return;
        }
        int[] iArr2 = (int[]) obj;
        int length = iArr2.length;
        if (i >= length) {
            while (length <= i) {
                length += length;
            }
            int[] iArr3 = new int[length];
            this.a = iArr3;
            int length2 = iArr2.length;
            System.arraycopy(obj, 0, iArr3, 0, length2);
            int[] iArr4 = (int[]) this.a;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final void e(int i, int i2) {
        Object obj = this.a;
        if (obj == null || i >= ((int[]) obj).length) {
            return;
        }
        int i3 = i + i2;
        d(i3);
        Object obj2 = this.a;
        System.arraycopy(obj2, i, obj2, i3, (((int[]) obj2).length - i) - i2);
        Arrays.fill((int[]) this.a, i, i3, -1);
        ?? r0 = this.b;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                lx lxVar = (lx) this.b.get(size);
                int i4 = lxVar.a;
                if (i4 >= i) {
                    lxVar.a = i4 + i2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    public final void f(int i, int i2) {
        Object obj = this.a;
        if (obj == null || i >= ((int[]) obj).length) {
            return;
        }
        int i3 = i + i2;
        d(i3);
        Object obj2 = this.a;
        System.arraycopy(obj2, i3, obj2, i, (((int[]) obj2).length - i) - i2);
        int[] iArr = (int[]) this.a;
        int length = iArr.length;
        Arrays.fill(iArr, length - i2, length, -1);
        ?? r1 = this.b;
        if (r1 != 0) {
            for (int size = r1.size() - 1; size >= 0; size--) {
                lx lxVar = (lx) this.b.get(size);
                int i4 = lxVar.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        lxVar.a = i4 - i2;
                    }
                }
            }
        }
    }
}
