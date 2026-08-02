package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fd {
    private static final Comparator a = new ju(1);

    /* JADX WARN: Removed duplicated region for block: B:108:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a A[LOOP:5: B:56:0x0186->B:62:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1 A[EDGE_INSN: B:63:0x01a1->B:64:0x01a1 BREAK  A[LOOP:5: B:56:0x0186->B:62:0x019a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ey a(ex exVar) {
        int i;
        int i2;
        fc fcVar;
        int i3;
        int i4;
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
        int i20;
        int i21;
        int i22;
        int i23;
        int b = exVar.b();
        int a2 = exVar.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new fb(b, a2));
        int i24 = b + a2;
        int i25 = 1;
        int i26 = (i24 + 1) / 2;
        int i27 = i26 + i26 + 1;
        int[] iArr = new int[i27];
        int[] iArr2 = new int[i27];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            fb fbVar = (fb) arrayList2.remove(arrayList2.size() - 1);
            if (fbVar.b() > 0 && fbVar.a() > 0) {
                int i28 = i27 >> 1;
                int b2 = ((fbVar.b() + fbVar.a()) + i25) / 2;
                int i29 = i28 + 1;
                iArr[i29] = fbVar.a;
                iArr2[i29] = fbVar.b;
                int i30 = 0;
                while (i30 < b2) {
                    int i31 = -i30;
                    int abs = Math.abs(fbVar.b() - fbVar.a()) % 2;
                    int b3 = fbVar.b() - fbVar.a();
                    int i32 = i31;
                    while (true) {
                        if (i32 > i30) {
                            i = i27;
                            i3 = i28;
                            i4 = b2;
                            fcVar = null;
                            break;
                        }
                        if (i32 != i31) {
                            int i33 = (i32 - 1) + i28;
                            if (i32 == i30 || iArr[i32 + 1 + i28] <= iArr[i33]) {
                                i17 = iArr[i33];
                                i18 = i17 + 1;
                                i = i27;
                                int i34 = (fbVar.c + (i18 - fbVar.a)) - i32;
                                if (i30 != 0) {
                                    i3 = i28;
                                    i19 = i32;
                                    i4 = b2;
                                    i20 = i18;
                                    i21 = 0;
                                } else if (i18 != i17) {
                                    i3 = i28;
                                    i19 = i32;
                                    i4 = b2;
                                    i20 = i18;
                                    i21 = i30;
                                } else {
                                    i3 = i28;
                                    i20 = i18;
                                    i22 = i34 - 1;
                                    i19 = i32;
                                    i4 = b2;
                                    i21 = i30;
                                    while (i20 < fbVar.b && i34 < fbVar.d && exVar.d(i20, i34)) {
                                        i20++;
                                        i34++;
                                    }
                                    iArr[i19 + i3] = i20;
                                    if (abs == 1) {
                                        int i35 = b3 - i19;
                                        i23 = abs;
                                        if (i35 >= (-i21) + 1 && i35 <= i21 - 1 && iArr2[i35 + i3] <= i20) {
                                            fcVar = new fc();
                                            fcVar.a = i17;
                                            fcVar.b = i22;
                                            fcVar.c = i20;
                                            fcVar.d = i34;
                                            fcVar.e = false;
                                            break;
                                        }
                                    } else {
                                        i23 = abs;
                                    }
                                    i32 = i19 + 2;
                                    i27 = i;
                                    i28 = i3;
                                    b2 = i4;
                                    abs = i23;
                                }
                                i22 = i34;
                                while (i20 < fbVar.b) {
                                    i20++;
                                    i34++;
                                }
                                iArr[i19 + i3] = i20;
                                if (abs == 1) {
                                }
                                i32 = i19 + 2;
                                i27 = i;
                                i28 = i3;
                                b2 = i4;
                                abs = i23;
                            }
                        }
                        i17 = iArr[i32 + 1 + i28];
                        i18 = i17;
                        i = i27;
                        int i342 = (fbVar.c + (i18 - fbVar.a)) - i32;
                        if (i30 != 0) {
                        }
                        i22 = i342;
                        while (i20 < fbVar.b) {
                        }
                        iArr[i19 + i3] = i20;
                        if (abs == 1) {
                        }
                        i32 = i19 + 2;
                        i27 = i;
                        i28 = i3;
                        b2 = i4;
                        abs = i23;
                    }
                    if (fcVar != null) {
                        i2 = 1;
                        break;
                    }
                    int b4 = fbVar.b() - fbVar.a();
                    int b5 = fbVar.b() - fbVar.a();
                    int i36 = i31;
                    while (true) {
                        if (i36 > i30) {
                            i2 = 1;
                            fcVar = null;
                            break;
                        }
                        if (i36 != i31) {
                            int i37 = (i36 - 1) + i3;
                            if (i36 == i30 || iArr2[i36 + 1 + i3] >= iArr2[i37]) {
                                i5 = iArr2[i37];
                                i6 = i5 - 1;
                                i7 = fbVar.d - ((fbVar.b - i6) - i36);
                                if (i30 != 0) {
                                    i8 = b4;
                                    i9 = b5;
                                    i10 = i7;
                                    i11 = 0;
                                } else if (i6 != i5) {
                                    i8 = b4;
                                    i9 = b5;
                                    i11 = i30;
                                    i10 = i7;
                                } else {
                                    i10 = i7 + 1;
                                    i8 = b4;
                                    i9 = b5;
                                    i11 = i30;
                                }
                                while (i6 > fbVar.a && i7 > fbVar.c) {
                                    i15 = i6 - 1;
                                    i12 = i36;
                                    i16 = i7 - 1;
                                    if (exVar.d(i15, i16)) {
                                        break;
                                    }
                                    i6 = i15;
                                    i7 = i16;
                                    i36 = i12;
                                }
                                i12 = i36;
                                i13 = i8 % 2;
                                iArr2[i12 + i3] = i6;
                                if (i13 != 0 && (i14 = i9 - i12) >= (-i11) && i14 <= i11 && iArr[i14 + i3] >= i6) {
                                    fc fcVar2 = new fc();
                                    fcVar2.a = i6;
                                    fcVar2.b = i7;
                                    fcVar2.c = i5;
                                    fcVar2.d = i10;
                                    i2 = 1;
                                    fcVar2.e = true;
                                    fcVar = fcVar2;
                                    break;
                                }
                                i36 = i12 + 2;
                                b4 = i8;
                                b5 = i9;
                            }
                        }
                        i5 = iArr2[i36 + 1 + i3];
                        i6 = i5;
                        i7 = fbVar.d - ((fbVar.b - i6) - i36);
                        if (i30 != 0) {
                        }
                        while (i6 > fbVar.a) {
                            i15 = i6 - 1;
                            i12 = i36;
                            i16 = i7 - 1;
                            if (exVar.d(i15, i16)) {
                            }
                        }
                        i12 = i36;
                        i13 = i8 % 2;
                        iArr2[i12 + i3] = i6;
                        if (i13 != 0) {
                        }
                        i36 = i12 + 2;
                        b4 = i8;
                        b5 = i9;
                    }
                    if (fcVar != null) {
                        break;
                    }
                    i30++;
                    i25 = i2;
                    i27 = i;
                    i28 = i3;
                    b2 = i4;
                }
            }
            i = i27;
            i2 = i25;
            fcVar = null;
            if (fcVar != null) {
                if (fcVar.a() > 0) {
                    int i38 = fcVar.d;
                    int i39 = fcVar.b;
                    int i40 = i38 - i39;
                    int i41 = fcVar.c;
                    int i42 = fcVar.a;
                    int i43 = i41 - i42;
                    arrayList.add(i40 != i43 ? fcVar.e ? new gui(i42, i39, fcVar.a(), null) : i40 > i43 ? new gui(i42, i39 + 1, fcVar.a(), null) : new gui(i42 + 1, i39, fcVar.a(), null) : new gui(i42, i39, i43, null));
                }
                fb fbVar2 = arrayList3.isEmpty() ? new fb() : (fb) arrayList3.remove(arrayList3.size() - 1);
                fbVar2.a = fbVar.a;
                fbVar2.c = fbVar.c;
                fbVar2.b = fcVar.a;
                fbVar2.d = fcVar.b;
                arrayList2.add(fbVar2);
                int i44 = fbVar.b;
                int i45 = fbVar.d;
                fbVar.a = fcVar.c;
                fbVar.c = fcVar.d;
                arrayList2.add(fbVar);
            } else {
                arrayList3.add(fbVar);
            }
            i25 = i2;
            i27 = i;
        }
        Collections.sort(arrayList, a);
        return new ey(exVar, arrayList, iArr, iArr2);
    }
}
