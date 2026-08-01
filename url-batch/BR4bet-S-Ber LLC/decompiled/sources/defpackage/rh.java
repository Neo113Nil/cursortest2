package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class rh {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final rc0 d;
    public final int e;
    public final int f;
    public final boolean g;

    public rh(rc0 rc0Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        qh qhVar;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = rc0Var;
        b7 b7Var = (b7) rc0Var.g;
        int size = b7Var.f.size();
        this.e = size;
        int size2 = b7Var.g.size();
        this.f = size2;
        this.g = true;
        qh qhVar2 = arrayList.isEmpty() ? null : (qh) arrayList.get(0);
        if (qhVar2 == null || qhVar2.a != 0 || qhVar2.b != 0) {
            arrayList.add(0, new qh(0, 0, 0));
        }
        arrayList.add(new qh(size, size2, 0));
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj = arrayList.get(i3);
            i3++;
            qh qhVar3 = (qh) obj;
            for (int i4 = 0; i4 < qhVar3.c; i4++) {
                int i5 = qhVar3.a + i4;
                int i6 = qhVar3.b + i4;
                int i7 = rc0Var.y(i5, i6) ? 1 : 2;
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
                qh qhVar4 = (qh) obj2;
                while (true) {
                    i = qhVar4.a;
                    if (i8 < i) {
                        if (iArr[i8] == 0) {
                            int size5 = arrayList.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i10 < size5) {
                                    qhVar = (qh) arrayList.get(i10);
                                    while (true) {
                                        i2 = qhVar.b;
                                        if (i11 < i2) {
                                            if (iArr2[i11] == 0 && rc0Var.z(i8, i11)) {
                                                int i12 = rc0Var.y(i8, i11) ? 8 : 4;
                                                iArr[i8] = (i11 << 4) | i12;
                                                iArr2[i11] = i12 | (i8 << 4);
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                i11 = qhVar.c + i2;
                                i10++;
                            }
                        }
                        i8++;
                    }
                }
                i8 = qhVar4.c + i;
            }
        }
    }

    public static sh a(ArrayDeque arrayDeque, int i, boolean z) {
        sh shVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                shVar = null;
                break;
            }
            shVar = (sh) it.next();
            if (shVar.a == i && shVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            sh shVar2 = (sh) it.next();
            if (z) {
                shVar2.b--;
            } else {
                shVar2.b++;
            }
        }
        return shVar;
    }
}
