package t;

import M1.B;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final s f7610a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7612c;

    /* renamed from: d, reason: collision with root package name */
    public final k f7613d;

    /* renamed from: e, reason: collision with root package name */
    public final u f7614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f7615f;

    public l(s sVar, int i3, int i4, k kVar, u uVar) {
        this.f7615f = sVar;
        this.f7610a = sVar;
        this.f7611b = i3;
        this.f7612c = i4;
        this.f7613d = kVar;
        this.f7614e = uVar;
    }

    public final long a(int i3, int i4) {
        int i5;
        s sVar = this.f7610a;
        int[] iArr = sVar.f7667a;
        if (i4 == 1) {
            i5 = iArr[i3];
        } else {
            int i6 = (i4 + i3) - 1;
            int[] iArr2 = sVar.f7668b;
            i5 = (iArr2[i6] + iArr[i6]) - iArr2[i3];
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 >= 0) {
            return I2.l.s(i5, i5, 0, Integer.MAX_VALUE);
        }
        B.O("width(" + i5 + ") must be >= 0");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    public final r b(int i3) {
        E2.n q2 = this.f7614e.q(i3);
        ?? r6 = q2.f844c;
        int size = r6.size();
        int i4 = q2.f843b;
        int i5 = (size == 0 || i4 + size == this.f7611b) ? 0 : this.f7612c;
        q[] qVarArr = new q[size];
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            int i8 = (int) ((C0892b) r6.get(i7)).f7571a;
            q a3 = this.f7613d.a(i4 + i7, a(i6, i8), i6, i8, i5);
            i6 += i8;
            qVarArr[i7] = a3;
        }
        return new r(i3, qVarArr, this.f7615f, r6, i5);
    }
}
