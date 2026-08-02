package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hft extends hfk {
    private final Comparator e;

    public hft(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.hfk, defpackage.hdz, defpackage.hea
    public final /* synthetic */ void c(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.hfk
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final hfv g() {
        hjc hjcVar;
        Object[] objArr = this.a;
        int i = this.b;
        Comparator comparator = this.e;
        if (i == 0) {
            hjcVar = hfv.C(comparator);
        } else {
            hnu.u(objArr, i);
            Arrays.sort(objArr, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < (objArr.length >> 1)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            hjcVar = new hjc(hel.i(objArr, i2), comparator);
        }
        this.b = hjcVar.size();
        this.c = true;
        return hjcVar;
    }

    public final void m(Object obj) {
        super.c(obj);
    }

    public final void n(Object... objArr) {
        super.i(objArr);
    }
}
