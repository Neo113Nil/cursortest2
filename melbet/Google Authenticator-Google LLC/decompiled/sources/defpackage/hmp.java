package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hmp extends hmr {
    public final int[] a;
    public final int b;
    private final hma c;
    private final hma d;

    public hmp(hma hmaVar, hma hmaVar2) {
        int h;
        this.c = hmaVar;
        this.d = hmaVar2;
        int b = hmaVar2.b();
        int i = 0;
        hoq.g(b <= 28, "metadata size too large");
        int[] iArr = new int[b];
        this.a = iArr;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            hky e = e(i);
            long j2 = e.d | j;
            if (j2 != j || (h = h(e, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[h] = e.b ? iArr[h] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(hky hkyVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (hkyVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.hmr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.hmr
    public final Object b(hky hkyVar) {
        hoq.g(!hkyVar.b, "key must be single valued");
        int[] iArr = this.a;
        int h = h(hkyVar, iArr, this.b);
        if (h >= 0) {
            return hkyVar.c(f(iArr[h]));
        }
        return null;
    }

    @Override // defpackage.hmr
    public final Set c() {
        return new hmn(this);
    }

    @Override // defpackage.hmr
    public final void d(hmh hmhVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            hky e = e(i2 & 31);
            if (e.b) {
                hmhVar.b(e, new hmo(this, e, i2), obj);
            } else {
                hmhVar.a(e, e.c(f(i2)), obj);
            }
        }
    }

    public final hky e(int i) {
        return (i >= 0 ? this.d : this.c).c(i);
    }

    public final Object f(int i) {
        return (i >= 0 ? this.d : this.c).e(i);
    }
}
