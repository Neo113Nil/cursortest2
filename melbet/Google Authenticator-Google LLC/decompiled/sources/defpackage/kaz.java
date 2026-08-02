package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kaz implements kbb {
    final int a;
    final kbb[] b;
    private final int c;

    private kaz(int i, kbb[] kbbVarArr, int i2) {
        this.a = i;
        this.b = kbbVarArr;
        this.c = i2;
    }

    static kbb b(kbb kbbVar, int i, kbb kbbVar2, int i2, int i3) {
        int i4 = (i >>> i3) & 31;
        int i5 = (i2 >>> i3) & 31;
        int i6 = 1 << i4;
        int i7 = 1 << i5;
        if (i6 == i7) {
            kbb b = b(kbbVar, i, kbbVar2, i2, i3 + 5);
            return new kaz(i6, new kbb[]{b}, ((kaz) b).c);
        }
        kbb kbbVar3 = i4 > i5 ? kbbVar : kbbVar2;
        if (i4 > i5) {
            kbbVar = kbbVar2;
        }
        return new kaz(i6 | i7, new kbb[]{kbbVar, kbbVar3}, kbbVar.a() + kbbVar3.a());
    }

    private final int e(int i) {
        return Integer.bitCount(this.a & (i - 1));
    }

    @Override // defpackage.kbb
    public final int a() {
        return this.c;
    }

    @Override // defpackage.kbb
    public final kbb c(Object obj, Object obj2, int i, int i2) {
        int i3 = this.a;
        int i4 = 1 << ((i >>> i2) & 31);
        int e = e(i4);
        int i5 = i3 & i4;
        kbb[] kbbVarArr = this.b;
        if (i5 != 0) {
            kbb[] kbbVarArr2 = (kbb[]) Arrays.copyOf(kbbVarArr, kbbVarArr.length);
            kbb c = kbbVarArr[e].c(obj, obj2, i, i2 + 5);
            kbbVarArr2[e] = c;
            return new kaz(i3, kbbVarArr2, (this.c + c.a()) - kbbVarArr[e].a());
        }
        int i6 = i3 | i4;
        int length = kbbVarArr.length;
        kbb[] kbbVarArr3 = new kbb[length + 1];
        System.arraycopy(kbbVarArr, 0, kbbVarArr3, 0, e);
        kbbVarArr3[e] = new kba(obj, obj2, 0);
        System.arraycopy(kbbVarArr, e, kbbVarArr3, e + 1, length - e);
        return new kaz(i6, kbbVarArr3, this.c + 1);
    }

    @Override // defpackage.kbb
    public final Object d(Object obj, int i, int i2) {
        int i3 = 1 << ((i >>> i2) & 31);
        if ((this.a & i3) == 0) {
            return null;
        }
        return this.b[e(i3)].d(obj, i, i2 + 5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.a)));
        for (kbb kbbVar : this.b) {
            sb.append(kbbVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
