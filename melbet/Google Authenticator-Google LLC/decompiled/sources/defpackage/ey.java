package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ey {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final ex d;
    private final int e;
    private final int f;

    public ey(ex exVar, List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = exVar;
        int b = exVar.b();
        this.e = b;
        int a = exVar.a();
        this.f = a;
        gui guiVar = list.isEmpty() ? null : (gui) list.get(0);
        if (guiVar == null || guiVar.b != 0 || guiVar.c != 0) {
            list.add(0, new gui(0, 0, 0, null));
        }
        list.add(new gui(b, a, 0, null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gui guiVar2 = (gui) it.next();
            for (int i = 0; i < guiVar2.a; i++) {
                int i2 = guiVar2.b + i;
                int i3 = guiVar2.c + i;
                int i4 = true != this.d.c(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int i5 = 0;
        for (gui guiVar3 : this.a) {
            while (i5 < guiVar3.b) {
                if (this.b[i5] == 0) {
                    int size = this.a.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < size) {
                            gui guiVar4 = (gui) this.a.get(i6);
                            while (i7 < guiVar4.c) {
                                if (this.c[i7] == 0 && this.d.d(i5, i7)) {
                                    int i8 = true != this.d.c(i5, i7) ? 4 : 8;
                                    this.b[i5] = (i7 << 4) | i8;
                                    this.c[i7] = i8 | (i5 << 4);
                                } else {
                                    i7++;
                                }
                            }
                            i7 = guiVar4.b();
                            i6++;
                        }
                    }
                }
                i5++;
            }
            i5 = guiVar3.a();
        }
    }

    private static fa b(Collection collection, int i, boolean z) {
        fa faVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                faVar = null;
                break;
            }
            faVar = (fa) it.next();
            if (faVar.a == i && faVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            fa faVar2 = (fa) it.next();
            if (z) {
                faVar2.b--;
            } else {
                faVar2.b++;
            }
        }
        return faVar;
    }

    public final void a(fe feVar) {
        int i;
        ew ewVar = feVar instanceof ew ? (ew) feVar : new ew(feVar);
        int i2 = this.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.f;
        List list = this.a;
        int i4 = i3;
        int i5 = i2;
        for (int size = list.size() - 1; size >= 0; size--) {
            gui guiVar = (gui) list.get(size);
            int a = guiVar.a();
            int b = guiVar.b();
            while (true) {
                if (i5 <= a) {
                    break;
                }
                i5--;
                int i6 = this.b[i5];
                if ((i6 & 12) != 0) {
                    int i7 = i6 >> 4;
                    fa b2 = b(arrayDeque, i7, false);
                    if (b2 != null) {
                        int i8 = (i2 - b2.b) - 1;
                        ewVar.b(i5, i8);
                        if ((i6 & 4) != 0) {
                            this.d.e(i5, i7);
                            ewVar.d(i8, 1);
                        }
                    } else {
                        arrayDeque.add(new fa(i5, (i2 - i5) - 1, true));
                    }
                } else {
                    ewVar.c(i5, 1);
                    i2--;
                }
            }
            while (i4 > b) {
                i4--;
                int i9 = this.c[i4];
                if ((i9 & 12) != 0) {
                    int i10 = i9 >> 4;
                    if (b(arrayDeque, i10, true) == null) {
                        arrayDeque.add(new fa(i4, i2 - i5, false));
                    } else {
                        ewVar.b((i2 - r12.b) - 1, i5);
                        if ((i9 & 4) != 0) {
                            this.d.e(i10, i4);
                            ewVar.d(i5, 1);
                        }
                    }
                } else {
                    ewVar.a(i5, 1);
                    i2++;
                }
            }
            i5 = guiVar.b;
            i4 = guiVar.c;
            int i11 = i5;
            int i12 = i4;
            for (i = 0; i < guiVar.a; i++) {
                if ((this.b[i11] & 15) == 2) {
                    this.d.e(i11, i12);
                    ewVar.d(i11, 1);
                }
                i11++;
                i12++;
            }
        }
        ewVar.e();
    }
}
