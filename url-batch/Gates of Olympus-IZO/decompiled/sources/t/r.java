package t;

import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f7660a;

    /* renamed from: b, reason: collision with root package name */
    public final q[] f7661b;

    /* renamed from: c, reason: collision with root package name */
    public final s f7662c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7663d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7664e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7665f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7666g;

    public r(int i3, q[] qVarArr, s sVar, List list, int i4) {
        this.f7660a = i3;
        this.f7661b = qVarArr;
        this.f7662c = sVar;
        this.f7663d = list;
        this.f7664e = i4;
        int i5 = 0;
        for (q qVar : qVarArr) {
            i5 = Math.max(i5, qVar.f7654l);
        }
        this.f7665f = i5;
        int i6 = i5 + this.f7664e;
        this.f7666g = i6 >= 0 ? i6 : 0;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    public final q[] a(int i3, int i4, int i5) {
        q[] qVarArr = this.f7661b;
        int length = qVarArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            q qVar = qVarArr[i6];
            int i9 = i7 + 1;
            int i10 = (int) ((C0892b) this.f7663d.get(i7)).f7571a;
            qVar.h(i3, this.f7662c.f7668b[i8], i4, i5, this.f7660a, i8);
            i8 += i10;
            i6++;
            i7 = i9;
        }
        return qVarArr;
    }
}
