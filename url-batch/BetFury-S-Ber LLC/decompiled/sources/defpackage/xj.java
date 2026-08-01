package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xj {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final o0 d;
    public final int e;
    public final int f;
    public final boolean g;

    public xj(o0 o0Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        wj wjVar;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = o0Var;
        k7 k7Var = (k7) o0Var.g;
        int size = k7Var.f.size();
        this.e = size;
        int size2 = k7Var.g.size();
        this.f = size2;
        this.g = true;
        wj wjVar2 = arrayList.isEmpty() ? null : (wj) arrayList.get(0);
        if (wjVar2 == null || wjVar2.a != 0 || wjVar2.b != 0) {
            arrayList.add(0, new wj(0, 0, 0));
        }
        arrayList.add(new wj(size, size2, 0));
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj = arrayList.get(i3);
            i3++;
            wj wjVar3 = (wj) obj;
            for (int i4 = 0; i4 < wjVar3.c; i4++) {
                int i5 = wjVar3.a + i4;
                int i6 = wjVar3.b + i4;
                int i7 = o0Var.v(i5, i6) ? 1 : 2;
                iArr[i5] = (i6 << 4) | i7;
                iArr2[i6] = (i5 << 4) | i7;
            }
        }
        if (this.g) {
            int size4 = arrayList.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size4) {
                Object obj2 = arrayList.get(i9);
                i9++;
                wj wjVar4 = (wj) obj2;
                while (true) {
                    i = wjVar4.a;
                    if (i8 < i) {
                        if (iArr[i8] == 0) {
                            int size5 = arrayList.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i10 < size5) {
                                    wjVar = (wj) arrayList.get(i10);
                                    while (true) {
                                        i2 = wjVar.b;
                                        if (i11 < i2) {
                                            if (iArr2[i11] == 0 && o0Var.w(i8, i11)) {
                                                int i12 = o0Var.v(i8, i11) ? 8 : 4;
                                                iArr[i8] = (i11 << 4) | i12;
                                                iArr2[i11] = i12 | (i8 << 4);
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                i11 = wjVar.c + i2;
                                i10++;
                            }
                        }
                        i8++;
                    }
                }
                i8 = wjVar4.c + i;
            }
        }
    }

    public static yj a(ArrayDeque arrayDeque, int i, boolean z) {
        yj yjVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                yjVar = null;
                break;
            }
            yjVar = (yj) it.next();
            if (yjVar.a == i && yjVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            yj yjVar2 = (yj) it.next();
            if (z) {
                yjVar2.b--;
            } else {
                yjVar2.b++;
            }
        }
        return yjVar;
    }
}
