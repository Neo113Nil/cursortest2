package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class b7 implements Runnable {
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ int h;
    public final /* synthetic */ d7 i;

    public b7(d7 d7Var, List list, List list2, int i) {
        this.i = d7Var;
        this.f = list;
        this.g = list2;
        this.h = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if (r6[(r3 + 1) + r8] > r6[(r3 - 1) + r8]) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        uh uhVar;
        int i2;
        th thVar;
        int i3;
        int i4;
        uh uhVar2;
        uh uhVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        rc0 rc0Var = new rc0(10, this);
        int size = this.f.size();
        int size2 = this.g.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        th thVar2 = new th();
        int i20 = 0;
        thVar2.a = 0;
        thVar2.b = size;
        thVar2.c = 0;
        thVar2.d = size2;
        arrayList2.add(thVar2);
        int i21 = size + size2;
        int i22 = 1;
        int i23 = (((i21 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i23];
        int i24 = i23 / 2;
        int[] iArr2 = new int[i23];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            th thVar3 = (th) arrayList2.remove(arrayList2.size() - i22);
            if (thVar3.b() >= i22 && thVar3.a() >= i22) {
                int a = ((thVar3.a() + thVar3.b()) + i22) / 2;
                int i25 = i22 + i24;
                iArr[i25] = thVar3.a;
                iArr2[i25] = thVar3.b;
                int i26 = i20;
                while (i26 < a) {
                    int i27 = Math.abs(thVar3.b() - thVar3.a()) % 2 == i22 ? i22 : i20;
                    int b = thVar3.b() - thVar3.a();
                    int i28 = -i26;
                    int i29 = i28;
                    while (true) {
                        if (i29 > i26) {
                            i3 = i20;
                            i = i24;
                            i4 = a;
                            uhVar2 = null;
                            break;
                        }
                        if (i29 != i28) {
                            if (i29 != i26) {
                                i10 = i29;
                            } else {
                                i10 = i29;
                            }
                            i11 = iArr[(i10 - 1) + i24];
                            i12 = i11 + 1;
                            i = i24;
                            i13 = ((i12 - thVar3.a) + thVar3.c) - i10;
                            if (i26 == 0 && i12 == i11) {
                                i14 = i12;
                                i15 = i13 - 1;
                            } else {
                                i14 = i12;
                                i15 = i13;
                            }
                            int i30 = a;
                            i16 = i13;
                            i17 = i14;
                            i4 = i30;
                            i18 = i27;
                            while (i17 < thVar3.b && i16 < thVar3.d && rc0Var.z(i17, i16)) {
                                i17++;
                                i16++;
                            }
                            iArr[i10 + i] = i17;
                            if (i18 == 0) {
                                int i31 = b - i10;
                                i19 = b;
                                if (i31 >= i28 + 1 && i31 <= i26 - 1 && iArr2[i31 + i] <= i17) {
                                    uhVar2 = new uh();
                                    uhVar2.a = i11;
                                    uhVar2.b = i15;
                                    uhVar2.c = i17;
                                    uhVar2.d = i16;
                                    i3 = 0;
                                    uhVar2.e = false;
                                    break;
                                }
                            } else {
                                i19 = b;
                            }
                            i20 = 0;
                            i29 = i10 + 2;
                            i24 = i;
                            a = i4;
                            i27 = i18;
                            b = i19;
                        } else {
                            i10 = i29;
                        }
                        i11 = iArr[i10 + 1 + i24];
                        i12 = i11;
                        i = i24;
                        i13 = ((i12 - thVar3.a) + thVar3.c) - i10;
                        if (i26 == 0) {
                        }
                        i14 = i12;
                        i15 = i13;
                        int i302 = a;
                        i16 = i13;
                        i17 = i14;
                        i4 = i302;
                        i18 = i27;
                        while (i17 < thVar3.b) {
                            i17++;
                            i16++;
                        }
                        iArr[i10 + i] = i17;
                        if (i18 == 0) {
                        }
                        i20 = 0;
                        i29 = i10 + 2;
                        i24 = i;
                        a = i4;
                        i27 = i18;
                        b = i19;
                    }
                    if (uhVar2 != null) {
                        uhVar = uhVar2;
                        break;
                    }
                    int i32 = (thVar3.b() - thVar3.a()) % 2 == 0 ? 1 : i3;
                    int b2 = thVar3.b() - thVar3.a();
                    int i33 = i28;
                    while (true) {
                        if (i33 > i26) {
                            uhVar3 = null;
                            break;
                        }
                        if (i33 == i28 || (i33 != i26 && iArr2[i33 + 1 + i] < iArr2[(i33 - 1) + i])) {
                            i5 = iArr2[i33 + 1 + i];
                            i6 = i5;
                        } else {
                            i5 = iArr2[(i33 - 1) + i];
                            i6 = i5 - 1;
                        }
                        int i34 = thVar3.d - ((thVar3.b - i6) - i33);
                        if (i26 == 0 || i6 != i5) {
                            i7 = i34;
                        } else {
                            i7 = i34;
                            i34++;
                        }
                        int i35 = i7;
                        int i36 = i32;
                        int i37 = i6;
                        int i38 = i35;
                        int i39 = b2;
                        while (i37 > thVar3.a && i38 > thVar3.c) {
                            i8 = i33;
                            if (!rc0Var.z(i37 - 1, i38 - 1)) {
                                break;
                            }
                            i37--;
                            i38--;
                            i33 = i8;
                        }
                        i8 = i33;
                        iArr2[i8 + i] = i37;
                        if (i36 != 0 && (i9 = i39 - i8) >= i28 && i9 <= i26 && iArr[i9 + i] >= i37) {
                            uhVar3 = new uh();
                            uhVar3.a = i37;
                            uhVar3.b = i38;
                            uhVar3.c = i5;
                            uhVar3.d = i34;
                            uhVar3.e = true;
                            break;
                        }
                        i33 = i8 + 2;
                        i32 = i36;
                        b2 = i39;
                    }
                    if (uhVar3 != null) {
                        uhVar = uhVar3;
                        break;
                    }
                    i26++;
                    i24 = i;
                    a = i4;
                    i22 = 1;
                    i20 = 0;
                }
            }
            i = i24;
            uhVar = null;
            if (uhVar != null) {
                if (uhVar.a() > 0) {
                    int i40 = uhVar.d;
                    int i41 = uhVar.b;
                    int i42 = i40 - i41;
                    int i43 = uhVar.c;
                    int i44 = uhVar.a;
                    int i45 = i43 - i44;
                    arrayList.add(i42 != i45 ? uhVar.e ? new qh(i44, i41, uhVar.a()) : i42 > i45 ? new qh(i44, i41 + 1, uhVar.a()) : new qh(i44 + 1, i41, uhVar.a()) : new qh(i44, i41, i45));
                }
                if (arrayList3.isEmpty()) {
                    thVar = new th();
                    i2 = 1;
                } else {
                    i2 = 1;
                    thVar = (th) arrayList3.remove(arrayList3.size() - 1);
                }
                thVar.a = thVar3.a;
                thVar.c = thVar3.c;
                thVar.b = uhVar.a;
                thVar.d = uhVar.b;
                arrayList2.add(thVar);
                thVar3.b = thVar3.b;
                thVar3.d = thVar3.d;
                thVar3.a = uhVar.c;
                thVar3.c = uhVar.d;
                arrayList2.add(thVar3);
            } else {
                i2 = 1;
                arrayList3.add(thVar3);
            }
            i22 = i2;
            i24 = i;
            i20 = 0;
        }
        Collections.sort(arrayList, kr.b);
        this.i.c.execute(new g1(this, new rh(rc0Var, arrayList, iArr, iArr2), 4));
    }
}
