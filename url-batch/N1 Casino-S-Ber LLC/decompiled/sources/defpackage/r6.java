package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class r6 implements Runnable {
    public final /* synthetic */ List f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ t6 i;

    public r6(t6 t6Var, ArrayList arrayList, ArrayList arrayList2, int i) {
        this.i = t6Var;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
    
        if (r6[(r3 + 1) + r8] > r6[(r3 - 1) + r8]) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        vf vfVar;
        int i2;
        uf ufVar;
        int i3;
        int i4;
        vf vfVar2;
        vf vfVar3;
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
        k0 k0Var = new k0(7, this);
        int size = this.f.size();
        int size2 = this.g.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        uf ufVar2 = new uf();
        int i20 = 0;
        ufVar2.a = 0;
        ufVar2.b = size;
        ufVar2.c = 0;
        ufVar2.d = size2;
        arrayList2.add(ufVar2);
        int i21 = size + size2;
        int i22 = 1;
        int i23 = (((i21 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i23];
        int i24 = i23 / 2;
        int[] iArr2 = new int[i23];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            uf ufVar3 = (uf) arrayList2.remove(arrayList2.size() - i22);
            if (ufVar3.b() >= i22 && ufVar3.a() >= i22) {
                int a = ((ufVar3.a() + ufVar3.b()) + i22) / 2;
                int i25 = i22 + i24;
                iArr[i25] = ufVar3.a;
                iArr2[i25] = ufVar3.b;
                int i26 = i20;
                while (i26 < a) {
                    int i27 = Math.abs(ufVar3.b() - ufVar3.a()) % 2 == i22 ? i22 : i20;
                    int b = ufVar3.b() - ufVar3.a();
                    int i28 = -i26;
                    int i29 = i28;
                    while (true) {
                        if (i29 > i26) {
                            i3 = i20;
                            i = i24;
                            i4 = a;
                            vfVar2 = null;
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
                            i13 = ((i12 - ufVar3.a) + ufVar3.c) - i10;
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
                            while (i17 < ufVar3.b && i16 < ufVar3.d && k0Var.A(i17, i16)) {
                                i17++;
                                i16++;
                            }
                            iArr[i10 + i] = i17;
                            if (i18 == 0) {
                                int i31 = b - i10;
                                i19 = b;
                                if (i31 >= i28 + 1 && i31 <= i26 - 1 && iArr2[i31 + i] <= i17) {
                                    vfVar2 = new vf();
                                    vfVar2.a = i11;
                                    vfVar2.b = i15;
                                    vfVar2.c = i17;
                                    vfVar2.d = i16;
                                    i3 = 0;
                                    vfVar2.e = false;
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
                        i13 = ((i12 - ufVar3.a) + ufVar3.c) - i10;
                        if (i26 == 0) {
                        }
                        i14 = i12;
                        i15 = i13;
                        int i302 = a;
                        i16 = i13;
                        i17 = i14;
                        i4 = i302;
                        i18 = i27;
                        while (i17 < ufVar3.b) {
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
                    if (vfVar2 != null) {
                        vfVar = vfVar2;
                        break;
                    }
                    int i32 = (ufVar3.b() - ufVar3.a()) % 2 == 0 ? 1 : i3;
                    int b2 = ufVar3.b() - ufVar3.a();
                    int i33 = i28;
                    while (true) {
                        if (i33 > i26) {
                            vfVar3 = null;
                            break;
                        }
                        if (i33 == i28 || (i33 != i26 && iArr2[i33 + 1 + i] < iArr2[(i33 - 1) + i])) {
                            i5 = iArr2[i33 + 1 + i];
                            i6 = i5;
                        } else {
                            i5 = iArr2[(i33 - 1) + i];
                            i6 = i5 - 1;
                        }
                        int i34 = ufVar3.d - ((ufVar3.b - i6) - i33);
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
                        while (i37 > ufVar3.a && i38 > ufVar3.c) {
                            i8 = i33;
                            if (!k0Var.A(i37 - 1, i38 - 1)) {
                                break;
                            }
                            i37--;
                            i38--;
                            i33 = i8;
                        }
                        i8 = i33;
                        iArr2[i8 + i] = i37;
                        if (i36 != 0 && (i9 = i39 - i8) >= i28 && i9 <= i26 && iArr[i9 + i] >= i37) {
                            vfVar3 = new vf();
                            vfVar3.a = i37;
                            vfVar3.b = i38;
                            vfVar3.c = i5;
                            vfVar3.d = i34;
                            vfVar3.e = true;
                            break;
                        }
                        i33 = i8 + 2;
                        i32 = i36;
                        b2 = i39;
                    }
                    if (vfVar3 != null) {
                        vfVar = vfVar3;
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
            vfVar = null;
            if (vfVar != null) {
                if (vfVar.a() > 0) {
                    int i40 = vfVar.d;
                    int i41 = vfVar.b;
                    int i42 = i40 - i41;
                    int i43 = vfVar.c;
                    int i44 = vfVar.a;
                    int i45 = i43 - i44;
                    arrayList.add(i42 != i45 ? vfVar.e ? new rf(i44, i41, vfVar.a()) : i42 > i45 ? new rf(i44, i41 + 1, vfVar.a()) : new rf(i44 + 1, i41, vfVar.a()) : new rf(i44, i41, i45));
                }
                if (arrayList3.isEmpty()) {
                    ufVar = new uf();
                    i2 = 1;
                } else {
                    i2 = 1;
                    ufVar = (uf) arrayList3.remove(arrayList3.size() - 1);
                }
                ufVar.a = ufVar3.a;
                ufVar.c = ufVar3.c;
                ufVar.b = vfVar.a;
                ufVar.d = vfVar.b;
                arrayList2.add(ufVar);
                ufVar3.b = ufVar3.b;
                ufVar3.d = ufVar3.d;
                ufVar3.a = vfVar.c;
                ufVar3.c = vfVar.d;
                arrayList2.add(ufVar3);
            } else {
                i2 = 1;
                arrayList3.add(ufVar3);
            }
            i22 = i2;
            i24 = i;
            i20 = 0;
        }
        Collections.sort(arrayList, e70.c);
        this.i.c.execute(new f1(this, new sf(k0Var, arrayList, iArr, iArr2), 4));
    }
}
