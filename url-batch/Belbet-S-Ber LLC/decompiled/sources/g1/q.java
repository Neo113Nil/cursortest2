package g1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1758a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1759b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1760c;
    public final a0.a d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1761e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1762f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1763g;

    public q(a0.a aVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        p pVar;
        int i4;
        this.f1758a = arrayList;
        this.f1759b = iArr;
        this.f1760c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = aVar;
        c cVar = (c) aVar.f79g;
        int size = cVar.f1620f.size();
        this.f1761e = size;
        int size2 = cVar.f1621g.size();
        this.f1762f = size2;
        this.f1763g = true;
        p pVar2 = arrayList.isEmpty() ? null : (p) arrayList.get(0);
        if (pVar2 == null || pVar2.f1749a != 0 || pVar2.f1750b != 0) {
            arrayList.add(0, new p(0, 0, 0));
        }
        arrayList.add(new p(size, size2, 0));
        int size3 = arrayList.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj = arrayList.get(i5);
            i5++;
            p pVar3 = (p) obj;
            for (int i6 = 0; i6 < pVar3.f1751c; i6++) {
                int i7 = pVar3.f1749a + i6;
                int i8 = pVar3.f1750b + i6;
                int i9 = aVar.B(i7, i8) ? 1 : 2;
                iArr[i7] = (i8 << 4) | i9;
                iArr2[i8] = (i7 << 4) | i9;
            }
        }
        if (this.f1763g) {
            int size4 = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size4) {
                Object obj2 = arrayList.get(i11);
                i11++;
                p pVar4 = (p) obj2;
                while (true) {
                    i = pVar4.f1749a;
                    if (i10 < i) {
                        if (iArr[i10] == 0) {
                            int size5 = arrayList.size();
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                if (i12 < size5) {
                                    pVar = (p) arrayList.get(i12);
                                    while (true) {
                                        i4 = pVar.f1750b;
                                        if (i13 < i4) {
                                            if (iArr2[i13] == 0 && aVar.C(i10, i13)) {
                                                int i14 = aVar.B(i10, i13) ? 8 : 4;
                                                iArr[i10] = (i13 << 4) | i14;
                                                iArr2[i13] = i14 | (i10 << 4);
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                }
                                i13 = pVar.f1751c + i4;
                                i12++;
                            }
                        }
                        i10++;
                    }
                }
                i10 = pVar4.f1751c + i;
            }
        }
    }

    public static r a(ArrayDeque arrayDeque, int i, boolean z4) {
        r rVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = (r) it.next();
            if (rVar.f1784a == i && rVar.f1786c == z4) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            r rVar2 = (r) it.next();
            if (z4) {
                rVar2.f1785b--;
            } else {
                rVar2.f1785b++;
            }
        }
        return rVar;
    }
}
