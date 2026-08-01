package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class k7 implements Runnable {
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ int h;
    public final /* synthetic */ m7 i;

    public k7(m7 m7Var, List list, List list2, int i) {
        this.i = m7Var;
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
        ak akVar;
        int i2;
        zj zjVar;
        int i3;
        int i4;
        ak akVar2;
        ak akVar3;
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
        o0 o0Var = new o0(9, this);
        int size = this.f.size();
        int size2 = this.g.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zj zjVar2 = new zj();
        int i20 = 0;
        zjVar2.a = 0;
        zjVar2.b = size;
        zjVar2.c = 0;
        zjVar2.d = size2;
        arrayList2.add(zjVar2);
        int i21 = size + size2;
        int i22 = 1;
        int i23 = (((i21 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i23];
        int i24 = i23 / 2;
        int[] iArr2 = new int[i23];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            zj zjVar3 = (zj) arrayList2.remove(arrayList2.size() - i22);
            if (zjVar3.b() >= i22 && zjVar3.a() >= i22) {
                int a = ((zjVar3.a() + zjVar3.b()) + i22) / 2;
                int i25 = i22 + i24;
                iArr[i25] = zjVar3.a;
                iArr2[i25] = zjVar3.b;
                int i26 = i20;
                while (i26 < a) {
                    int i27 = Math.abs(zjVar3.b() - zjVar3.a()) % 2 == i22 ? i22 : i20;
                    int b = zjVar3.b() - zjVar3.a();
                    int i28 = -i26;
                    int i29 = i28;
                    while (true) {
                        if (i29 > i26) {
                            i3 = i20;
                            i = i24;
                            i4 = a;
                            akVar2 = null;
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
                            i13 = ((i12 - zjVar3.a) + zjVar3.c) - i10;
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
                            while (i17 < zjVar3.b && i16 < zjVar3.d && o0Var.w(i17, i16)) {
                                i17++;
                                i16++;
                            }
                            iArr[i10 + i] = i17;
                            if (i18 == 0) {
                                int i31 = b - i10;
                                i19 = b;
                                if (i31 >= i28 + 1 && i31 <= i26 - 1 && iArr2[i31 + i] <= i17) {
                                    akVar2 = new ak();
                                    akVar2.a = i11;
                                    akVar2.b = i15;
                                    akVar2.c = i17;
                                    akVar2.d = i16;
                                    i3 = 0;
                                    akVar2.e = false;
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
                        i13 = ((i12 - zjVar3.a) + zjVar3.c) - i10;
                        if (i26 == 0) {
                        }
                        i14 = i12;
                        i15 = i13;
                        int i302 = a;
                        i16 = i13;
                        i17 = i14;
                        i4 = i302;
                        i18 = i27;
                        while (i17 < zjVar3.b) {
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
                    if (akVar2 != null) {
                        akVar = akVar2;
                        break;
                    }
                    int i32 = (zjVar3.b() - zjVar3.a()) % 2 == 0 ? 1 : i3;
                    int b2 = zjVar3.b() - zjVar3.a();
                    int i33 = i28;
                    while (true) {
                        if (i33 > i26) {
                            akVar3 = null;
                            break;
                        }
                        if (i33 == i28 || (i33 != i26 && iArr2[i33 + 1 + i] < iArr2[(i33 - 1) + i])) {
                            i5 = iArr2[i33 + 1 + i];
                            i6 = i5;
                        } else {
                            i5 = iArr2[(i33 - 1) + i];
                            i6 = i5 - 1;
                        }
                        int i34 = zjVar3.d - ((zjVar3.b - i6) - i33);
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
                        while (i37 > zjVar3.a && i38 > zjVar3.c) {
                            i8 = i33;
                            if (!o0Var.w(i37 - 1, i38 - 1)) {
                                break;
                            }
                            i37--;
                            i38--;
                            i33 = i8;
                        }
                        i8 = i33;
                        iArr2[i8 + i] = i37;
                        if (i36 != 0 && (i9 = i39 - i8) >= i28 && i9 <= i26 && iArr[i9 + i] >= i37) {
                            akVar3 = new ak();
                            akVar3.a = i37;
                            akVar3.b = i38;
                            akVar3.c = i5;
                            akVar3.d = i34;
                            akVar3.e = true;
                            break;
                        }
                        i33 = i8 + 2;
                        i32 = i36;
                        b2 = i39;
                    }
                    if (akVar3 != null) {
                        akVar = akVar3;
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
            akVar = null;
            if (akVar != null) {
                if (akVar.a() > 0) {
                    int i40 = akVar.d;
                    int i41 = akVar.b;
                    int i42 = i40 - i41;
                    int i43 = akVar.c;
                    int i44 = akVar.a;
                    int i45 = i43 - i44;
                    arrayList.add(i42 != i45 ? akVar.e ? new wj(i44, i41, akVar.a()) : i42 > i45 ? new wj(i44, i41 + 1, akVar.a()) : new wj(i44 + 1, i41, akVar.a()) : new wj(i44, i41, i45));
                }
                if (arrayList3.isEmpty()) {
                    zjVar = new zj();
                    i2 = 1;
                } else {
                    i2 = 1;
                    zjVar = (zj) arrayList3.remove(arrayList3.size() - 1);
                }
                zjVar.a = zjVar3.a;
                zjVar.c = zjVar3.c;
                zjVar.b = akVar.a;
                zjVar.d = akVar.b;
                arrayList2.add(zjVar);
                zjVar3.b = zjVar3.b;
                zjVar3.d = zjVar3.d;
                zjVar3.a = akVar.c;
                zjVar3.c = akVar.d;
                arrayList2.add(zjVar3);
            } else {
                i2 = 1;
                arrayList3.add(zjVar3);
            }
            i22 = i2;
            i24 = i;
            i20 = 0;
        }
        Collections.sort(arrayList, n9.f);
        this.i.c.execute(new j1(this, new xj(o0Var, arrayList, iArr, iArr2), 4));
    }
}
