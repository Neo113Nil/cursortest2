package B;

import T.C0097o;
import e0.C0392b;
import e1.C0400d;
import e1.C0401e;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m0.C1296i;
import m0.C1297j;
import t0.C1433h;
import t0.C1434i;
import t0.q;
import t0.r;
import v2.AbstractC1478z;
import v2.C1476x;
import v2.Z;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150a;

    public /* synthetic */ c(int i4) {
        this.f150a = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f150a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b4 = bArr[i4];
                    byte b5 = bArr2[i4];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return 0;
            case 1:
                return Integer.compare(((W0.d) obj2).f3417b, ((W0.d) obj).f3417b);
            case 2:
                C0392b c0392b = (C0392b) obj;
                C0392b c0392b2 = (C0392b) obj2;
                int compare = Integer.compare(c0392b.f8344c, c0392b2.f8344c);
                return compare != 0 ? compare : c0392b.f8343b.compareTo(c0392b2.f8343b);
            case 3:
                return Integer.compare(((C0401e) obj).f8441a.f8444b, ((C0401e) obj2).f8441a.f8444b);
            case 4:
                return Long.compare(((C0400d) obj).f8438b, ((C0400d) obj2).f8438b);
            case 5:
                return ((h0.d) obj).f9067a.compareTo(((h0.d) obj2).f9067a);
            case 6:
                return C1297j.b(((C1296i) obj).f14389a.f14385c, ((C1296i) obj2).f14389a.f14385c);
            case 7:
                return ((C0097o) obj2).f2865j - ((C0097o) obj).f2865j;
            case 8:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 9:
                return Integer.compare(((C1434i) ((List) obj).get(0)).f15315f, ((C1434i) ((List) obj2).get(0)).f15315f);
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i5 = 14;
                return C1476x.f(q.c((q) Collections.max(list, new c(13)), (q) Collections.max(list2, new c(13)))).a(list.size(), list2.size()).b((q) Collections.max(list, new c(i5)), (q) Collections.max(list2, new c(i5)), new c(i5)).e();
            case 11:
                return ((C1433h) Collections.max((List) obj)).compareTo((C1433h) Collections.max((List) obj2));
            case 12:
                return ((t0.n) ((List) obj).get(0)).compareTo((t0.n) ((List) obj2).get(0));
            case 13:
                return q.c((q) obj, (q) obj2);
            case 14:
                q qVar = (q) obj;
                q qVar2 = (q) obj2;
                boolean z = qVar.f15349e;
                int i6 = qVar.f15354j;
                Z a3 = (z && qVar.f15352h) ? r.f15365k : r.f15365k.a();
                qVar.f15350f.getClass();
                return AbstractC1478z.f15691a.b(Integer.valueOf(qVar.f15355k), Integer.valueOf(qVar2.f15355k), a3).b(Integer.valueOf(i6), Integer.valueOf(qVar2.f15354j), a3).e();
            case 15:
                return ((u0.r) obj).f15493a - ((u0.r) obj2).f15493a;
            default:
                return Float.compare(((u0.r) obj).f15495c, ((u0.r) obj2).f15495c);
        }
    }
}
