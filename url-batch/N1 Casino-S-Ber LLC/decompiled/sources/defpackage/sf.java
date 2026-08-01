package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class sf {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final k0 d;
    public final int e;
    public final int f;
    public final boolean g;

    public sf(k0 k0Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        rf rfVar;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = k0Var;
        r6 r6Var = (r6) k0Var.g;
        int size = r6Var.f.size();
        this.e = size;
        int size2 = r6Var.g.size();
        this.f = size2;
        this.g = true;
        rf rfVar2 = arrayList.isEmpty() ? null : (rf) arrayList.get(0);
        if (rfVar2 == null || rfVar2.a != 0 || rfVar2.b != 0) {
            arrayList.add(0, new rf(0, 0, 0));
        }
        arrayList.add(new rf(size, size2, 0));
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj = arrayList.get(i3);
            i3++;
            rf rfVar3 = (rf) obj;
            for (int i4 = 0; i4 < rfVar3.c; i4++) {
                int i5 = rfVar3.a + i4;
                int i6 = rfVar3.b + i4;
                int i7 = k0Var.z(i5, i6) ? 1 : 2;
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
                rf rfVar4 = (rf) obj2;
                while (true) {
                    i = rfVar4.a;
                    if (i8 < i) {
                        if (iArr[i8] == 0) {
                            int size5 = arrayList.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i10 < size5) {
                                    rfVar = (rf) arrayList.get(i10);
                                    while (true) {
                                        i2 = rfVar.b;
                                        if (i11 < i2) {
                                            if (iArr2[i11] == 0 && k0Var.A(i8, i11)) {
                                                int i12 = k0Var.z(i8, i11) ? 8 : 4;
                                                iArr[i8] = (i11 << 4) | i12;
                                                iArr2[i11] = i12 | (i8 << 4);
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                i11 = rfVar.c + i2;
                                i10++;
                            }
                        }
                        i8++;
                    }
                }
                i8 = rfVar4.c + i;
            }
        }
    }

    public static tf a(ArrayDeque arrayDeque, int i, boolean z) {
        tf tfVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                tfVar = null;
                break;
            }
            tfVar = (tf) it.next();
            if (tfVar.a == i && tfVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            tf tfVar2 = (tf) it.next();
            if (z) {
                tfVar2.b--;
            } else {
                tfVar2.b++;
            }
        }
        return tfVar;
    }
}
