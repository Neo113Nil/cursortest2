package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e10 implements b10 {
    public final d4 a;
    public final d4 b;
    public final z00 d;
    public jn0 f;
    public o10 h;
    public final o10 c = new o10(2, null, 14);
    public final c10 e = new c10(this);
    public final mn0 g = new mn0(1);

    public e10(d4 d4Var, d4 d4Var2) {
        this.a = d4Var;
        this.b = d4Var2;
        this.d = new z00(this, d4Var2);
    }

    public final boolean a(boolean z) {
        l7 l7Var;
        if (f() != null) {
            o10 f = f();
            h(null);
            if (f != null) {
                f.A0(j10.d, j10.g);
                if (!f.d.r) {
                    o80.b("visitAncestors called on an unattached node");
                }
                zl0 zl0Var = f.d.i;
                jd0 I = op.I(f);
                while (I != null) {
                    if ((((zl0) I.J.g).h & 1024) != 0) {
                        while (zl0Var != null) {
                            if ((zl0Var.g & 1024) != 0) {
                                zl0 zl0Var2 = zl0Var;
                                eo0 eo0Var = null;
                                while (zl0Var2 != null) {
                                    if (zl0Var2 instanceof o10) {
                                        ((o10) zl0Var2).A0(j10.e, j10.g);
                                    } else if ((zl0Var2.g & 1024) != 0 && (zl0Var2 instanceof zq)) {
                                        int i = 0;
                                        for (zl0 zl0Var3 = ((zq) zl0Var2).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                            if ((zl0Var3.g & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    zl0Var2 = zl0Var3;
                                                } else {
                                                    if (eo0Var == null) {
                                                        eo0Var = new eo0(new zl0[16]);
                                                    }
                                                    if (zl0Var2 != null) {
                                                        eo0Var.b(zl0Var2);
                                                        zl0Var2 = null;
                                                    }
                                                    eo0Var.b(zl0Var3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    zl0Var2 = op.o(eo0Var);
                                }
                            }
                            zl0Var = zl0Var.i;
                        }
                    }
                    I = I.s();
                    zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            a(z);
        } else {
            int ordinal = la0.Q(this.c, i).ordinal();
            if (ordinal == 0) {
                a(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    l.a();
                    return false;
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        d4 d4Var = this.a;
        if (d4Var.isFocused() || d4Var.hasFocus()) {
            d4Var.clearFocus();
        } else if (d4Var.hasFocus()) {
            View findFocus = d4Var.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            d4Var.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016f A[Catch: all -> 0x02da, TryCatch #0 {all -> 0x02da, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:13:0x0023, B:16:0x002f, B:18:0x0035, B:19:0x003a, B:21:0x0042, B:23:0x0047, B:25:0x004d, B:29:0x0053, B:34:0x016f, B:36:0x0175, B:37:0x0178, B:39:0x0183, B:42:0x0191, B:46:0x019b, B:81:0x01a1, B:82:0x01a6, B:75:0x01e0, B:48:0x01aa, B:50:0x01b0, B:52:0x01b4, B:54:0x01bc, B:56:0x01c2, B:62:0x01ca, B:64:0x01d3, B:65:0x01d7, B:60:0x01da, B:84:0x01e5, B:87:0x01e8, B:89:0x01ee, B:96:0x01f2, B:101:0x01fb, B:103:0x0203, B:108:0x0213, B:110:0x0218, B:144:0x021c, B:139:0x0255, B:112:0x021f, B:114:0x0225, B:116:0x0229, B:118:0x0231, B:120:0x0237, B:126:0x023f, B:128:0x0248, B:129:0x024c, B:124:0x024f, B:146:0x025a, B:150:0x026a, B:152:0x026f, B:186:0x0273, B:181:0x02b5, B:154:0x027f, B:156:0x0285, B:158:0x0289, B:160:0x0291, B:162:0x0297, B:168:0x029f, B:170:0x02a8, B:171:0x02ac, B:166:0x02af, B:193:0x02bc, B:195:0x02c3, B:208:0x005b, B:210:0x0061, B:211:0x0064, B:213:0x006c, B:216:0x007a, B:220:0x0084, B:255:0x00d9, B:257:0x00dd, B:222:0x0089, B:224:0x008f, B:226:0x0093, B:228:0x009b, B:230:0x00a1, B:236:0x00a9, B:238:0x00b2, B:239:0x00b6, B:234:0x00b9, B:245:0x00bf, B:259:0x00c4, B:262:0x00c7, B:264:0x00cd, B:271:0x00d1, B:276:0x00e3, B:278:0x00e9, B:279:0x00ec, B:281:0x00f6, B:284:0x0104, B:288:0x010e, B:323:0x0163, B:325:0x0167, B:290:0x0113, B:292:0x0119, B:294:0x011d, B:296:0x0125, B:298:0x012b, B:304:0x0133, B:306:0x013c, B:307:0x0140, B:302:0x0143, B:313:0x0149, B:328:0x014e, B:331:0x0151, B:333:0x0157, B:340:0x015b), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [eo0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [eo0] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [zl0] */
    /* JADX WARN: Type inference failed for: r12v25, types: [zl0] */
    /* JADX WARN: Type inference failed for: r12v29, types: [zl0] */
    /* JADX WARN: Type inference failed for: r12v30, types: [zl0] */
    /* JADX WARN: Type inference failed for: r12v34, types: [zl0] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v42, types: [zl0] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [eo0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, Function0 function0) {
        yq yqVar;
        zl0 zl0Var;
        l7 l7Var;
        yq yqVar2;
        l7 l7Var2;
        int size;
        l7 l7Var3;
        o10 o10Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!i(keyEvent)) {
                return false;
            }
            o10 E = uq1.E(o10Var);
            if (E != null) {
                if (!E.d.r) {
                    o80.b("visitLocalDescendants called on an unattached node");
                }
                zl0 zl0Var2 = E.d;
                if ((zl0Var2.h & 9216) != 0) {
                    zl0Var = null;
                    for (zl0 zl0Var3 = zl0Var2.j; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                        int i = zl0Var3.g;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            zl0Var = zl0Var3;
                        }
                    }
                } else {
                    zl0Var = null;
                }
            }
            if (E != null) {
                if (!E.d.r) {
                    o80.b("visitAncestors called on an unattached node");
                }
                zl0 zl0Var4 = E.d;
                jd0 I = op.I(E);
                loop11: while (true) {
                    if (I == null) {
                        yqVar2 = null;
                        break;
                    }
                    if ((((zl0) I.J.g).h & 8192) != 0) {
                        while (zl0Var4 != null) {
                            if ((zl0Var4.g & 8192) != 0) {
                                eo0 eo0Var = null;
                                zl0 zl0Var5 = zl0Var4;
                                while (zl0Var5 != null) {
                                    if (zl0Var5 instanceof hc0) {
                                        yqVar2 = zl0Var5;
                                        break loop11;
                                    }
                                    if ((zl0Var5.g & 8192) != 0 && (zl0Var5 instanceof zq)) {
                                        zl0 zl0Var6 = ((zq) zl0Var5).t;
                                        int i2 = 0;
                                        zl0Var5 = zl0Var5;
                                        eo0Var = eo0Var;
                                        while (zl0Var6 != null) {
                                            if ((zl0Var6.g & 8192) != 0) {
                                                i2++;
                                                eo0Var = eo0Var;
                                                if (i2 == 1) {
                                                    zl0Var5 = zl0Var6;
                                                } else {
                                                    if (eo0Var == null) {
                                                        eo0Var = new eo0(new zl0[16]);
                                                    }
                                                    if (zl0Var5 != null) {
                                                        eo0Var.b(zl0Var5);
                                                        zl0Var5 = null;
                                                    }
                                                    eo0Var.b(zl0Var6);
                                                }
                                            }
                                            zl0Var6 = zl0Var6.j;
                                            zl0Var5 = zl0Var5;
                                            eo0Var = eo0Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    zl0Var5 = op.o(eo0Var);
                                }
                            }
                            zl0Var4 = zl0Var4.i;
                        }
                    }
                    I = I.s();
                    zl0Var4 = (I == null || (l7Var2 = I.J) == null) ? null : (ig1) l7Var2.f;
                }
                yq yqVar3 = (hc0) yqVar2;
                if (yqVar3 != null) {
                    zl0Var = ((zl0) yqVar3).d;
                    if (zl0Var != null) {
                        if (!zl0Var.d.r) {
                            o80.b("visitAncestors called on an unattached node");
                        }
                        zl0 zl0Var7 = zl0Var.d.i;
                        jd0 I2 = op.I(zl0Var);
                        ArrayList arrayList = null;
                        while (I2 != null) {
                            if ((((zl0) I2.J.g).h & 8192) != 0) {
                                while (zl0Var7 != null) {
                                    if ((zl0Var7.g & 8192) != 0) {
                                        zl0 zl0Var8 = zl0Var7;
                                        eo0 eo0Var2 = null;
                                        while (zl0Var8 != null) {
                                            if (zl0Var8 instanceof hc0) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(zl0Var8);
                                            } else if ((zl0Var8.g & 8192) != 0 && (zl0Var8 instanceof zq)) {
                                                int i3 = 0;
                                                for (zl0 zl0Var9 = ((zq) zl0Var8).t; zl0Var9 != null; zl0Var9 = zl0Var9.j) {
                                                    if ((zl0Var9.g & 8192) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            zl0Var8 = zl0Var9;
                                                        } else {
                                                            if (eo0Var2 == null) {
                                                                eo0Var2 = new eo0(new zl0[16]);
                                                            }
                                                            if (zl0Var8 != null) {
                                                                eo0Var2.b(zl0Var8);
                                                                zl0Var8 = null;
                                                            }
                                                            eo0Var2.b(zl0Var9);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            zl0Var8 = op.o(eo0Var2);
                                        }
                                    }
                                    zl0Var7 = zl0Var7.i;
                                }
                            }
                            I2 = I2.s();
                            zl0Var7 = (I2 == null || (l7Var3 = I2.J) == null) ? null : (ig1) l7Var3.f;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i4 = size - 1;
                                ((hc0) arrayList.get(size)).getClass();
                                if (i4 < 0) {
                                    break;
                                }
                                size = i4;
                            }
                        }
                        zq zqVar = zl0Var.d;
                        ?? r0 = 0;
                        while (zqVar != 0) {
                            if (zqVar instanceof hc0) {
                            } else if ((zqVar.g & 8192) != 0 && (zqVar instanceof zq)) {
                                zl0 zl0Var10 = zqVar.t;
                                int i5 = 0;
                                r0 = r0;
                                zqVar = zqVar;
                                while (zl0Var10 != null) {
                                    if ((zl0Var10.g & 8192) != 0) {
                                        i5++;
                                        r0 = r0;
                                        if (i5 == 1) {
                                            zqVar = zl0Var10;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new eo0(new zl0[16]);
                                            }
                                            if (zqVar != 0) {
                                                r0.b(zqVar);
                                                zqVar = 0;
                                            }
                                            r0.b(zl0Var10);
                                        }
                                    }
                                    zl0Var10 = zl0Var10.j;
                                    r0 = r0;
                                    zqVar = zqVar;
                                }
                                if (i5 == 1) {
                                }
                            }
                            zqVar = op.o(r0);
                        }
                        if (((Boolean) function0.invoke()).booleanValue()) {
                            return true;
                        }
                        zq zqVar2 = zl0Var.d;
                        ?? r14 = 0;
                        while (zqVar2 != 0) {
                            if (zqVar2 instanceof hc0) {
                                if (((hc0) zqVar2).K(keyEvent)) {
                                    return true;
                                }
                            } else if ((zqVar2.g & 8192) != 0 && (zqVar2 instanceof zq)) {
                                zl0 zl0Var11 = zqVar2.t;
                                int i6 = 0;
                                zqVar2 = zqVar2;
                                r14 = r14;
                                while (zl0Var11 != null) {
                                    if ((zl0Var11.g & 8192) != 0) {
                                        i6++;
                                        r14 = r14;
                                        if (i6 == 1) {
                                            zqVar2 = zl0Var11;
                                        } else {
                                            if (r14 == 0) {
                                                r14 = new eo0(new zl0[16]);
                                            }
                                            if (zqVar2 != 0) {
                                                r14.b(zqVar2);
                                                zqVar2 = 0;
                                            }
                                            r14.b(zl0Var11);
                                        }
                                    }
                                    zl0Var11 = zl0Var11.j;
                                    zqVar2 = zqVar2;
                                    r14 = r14;
                                }
                                if (i6 == 1) {
                                }
                            }
                            zqVar2 = op.o(r14);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                if (((hc0) arrayList.get(i7)).K(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!o10Var.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var12 = o10Var.d.i;
            jd0 I3 = op.I(o10Var);
            loop15: while (true) {
                if (I3 == null) {
                    yqVar = null;
                    break;
                }
                if ((((zl0) I3.J.g).h & 8192) != 0) {
                    while (zl0Var12 != null) {
                        if ((zl0Var12.g & 8192) != 0) {
                            zl0 zl0Var13 = zl0Var12;
                            eo0 eo0Var3 = null;
                            while (zl0Var13 != null) {
                                if (zl0Var13 instanceof hc0) {
                                    yqVar = zl0Var13;
                                    break loop15;
                                }
                                if ((zl0Var13.g & 8192) != 0 && (zl0Var13 instanceof zq)) {
                                    zl0 zl0Var14 = ((zq) zl0Var13).t;
                                    int i8 = 0;
                                    zl0Var13 = zl0Var13;
                                    eo0Var3 = eo0Var3;
                                    while (zl0Var14 != null) {
                                        if ((zl0Var14.g & 8192) != 0) {
                                            i8++;
                                            eo0Var3 = eo0Var3;
                                            if (i8 == 1) {
                                                zl0Var13 = zl0Var14;
                                            } else {
                                                if (eo0Var3 == null) {
                                                    eo0Var3 = new eo0(new zl0[16]);
                                                }
                                                if (zl0Var13 != null) {
                                                    eo0Var3.b(zl0Var13);
                                                    zl0Var13 = null;
                                                }
                                                eo0Var3.b(zl0Var14);
                                            }
                                        }
                                        zl0Var14 = zl0Var14.j;
                                        zl0Var13 = zl0Var13;
                                        eo0Var3 = eo0Var3;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                zl0Var13 = op.o(eo0Var3);
                            }
                        }
                        zl0Var12 = zl0Var12.i;
                    }
                }
                I3 = I3.s();
                zl0Var12 = (I3 == null || (l7Var = I3.J) == null) ? null : (ig1) l7Var.f;
            }
            yq yqVar4 = (hc0) yqVar;
            zl0Var = yqVar4 != null ? ((zl0) yqVar4).d : null;
            if (zl0Var != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x011a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i, s11 s11Var, Function1 function1) {
        boolean e;
        o10 o10Var;
        l7 l7Var;
        o10 o10Var2 = this.c;
        o10 E = uq1.E(o10Var2);
        int i2 = 4;
        int i3 = 3;
        d4 d4Var = this.b;
        boolean z = false;
        if (E != null) {
            vc0 layoutDirection = d4Var.getLayoutDirection();
            g10 B0 = E.B0();
            i10 i10Var = B0.h;
            i10 i10Var2 = B0.i;
            if (i == 1) {
                i10Var = B0.b;
            } else if (i == 2) {
                i10Var = B0.c;
            } else if (i == 5) {
                i10Var = B0.d;
            } else if (i == 6) {
                i10Var = B0.e;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        l.a();
                        return null;
                    }
                    i10Var = i10Var2;
                }
                if (i10Var == i10.b) {
                    i10Var = null;
                }
                if (i10Var == null) {
                    i10Var = B0.f;
                }
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    i10Var = i10Var2;
                } else if (ordinal2 != 1) {
                    l.a();
                    return null;
                }
                if (i10Var == i10.b) {
                    i10Var = null;
                }
                if (i10Var == null) {
                    i10Var = B0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    dd0.j("invalid FocusDirection");
                    return null;
                }
                qf qfVar = new qf(i);
                e10 e10Var = (e10) ((d4) op.J(E)).getFocusOwner();
                o10 f = e10Var.f();
                if (i == 7) {
                    B0.j.invoke(qfVar);
                } else {
                    B0.k.invoke(qfVar);
                }
                i10Var = qfVar.b ? i10.c : f != e10Var.f() ? i10.d : i10.b;
            }
            i10 i10Var3 = i10.c;
            if (!Intrinsics.a(i10Var, i10Var3)) {
                if (Intrinsics.a(i10Var, i10.d)) {
                    o10 E2 = uq1.E(o10Var2);
                    if (E2 != null) {
                        return (Boolean) function1.invoke(E2);
                    }
                } else {
                    i10 i10Var4 = i10.b;
                    if (!Intrinsics.a(i10Var, i10Var4)) {
                        if (i10Var == i10Var4) {
                            dd0.j("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (i10Var == i10Var3) {
                            dd0.j("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        eo0 eo0Var = i10Var.a;
                        int i4 = eo0Var.g;
                        if (i4 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = eo0Var.d;
                            boolean z2 = false;
                            for (int i5 = 0; i5 < i4; i5++) {
                                xc xcVar = (xc) objArr[i5];
                                if (!xcVar.d.r) {
                                    o80.b("visitChildren called on an unattached node");
                                }
                                eo0 eo0Var2 = new eo0(new zl0[16]);
                                zl0 zl0Var = xcVar.d;
                                zl0 zl0Var2 = zl0Var.j;
                                if (zl0Var2 == null) {
                                    op.l(eo0Var2, zl0Var);
                                } else {
                                    eo0Var2.b(zl0Var2);
                                }
                                while (true) {
                                    int i6 = eo0Var2.g;
                                    if (i6 != 0) {
                                        zl0 zl0Var3 = (zl0) eo0Var2.k(i6 - 1);
                                        if ((zl0Var3.h & 1024) == 0) {
                                            op.l(eo0Var2, zl0Var3);
                                        } else {
                                            while (true) {
                                                if (zl0Var3 == null) {
                                                    break;
                                                }
                                                if ((zl0Var3.g & 1024) != 0) {
                                                    eo0 eo0Var3 = null;
                                                    while (zl0Var3 != null) {
                                                        if (zl0Var3 instanceof o10) {
                                                            if (((Boolean) function1.invoke((o10) zl0Var3)).booleanValue()) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                        } else if ((zl0Var3.g & 1024) != 0 && (zl0Var3 instanceof zq)) {
                                                            int i7 = 0;
                                                            for (zl0 zl0Var4 = ((zq) zl0Var3).t; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
                                                                if ((zl0Var4.g & 1024) != 0) {
                                                                    i7++;
                                                                    if (i7 == 1) {
                                                                        zl0Var3 = zl0Var4;
                                                                    } else {
                                                                        if (eo0Var3 == null) {
                                                                            eo0Var3 = new eo0(new zl0[16]);
                                                                        }
                                                                        if (zl0Var3 != null) {
                                                                            eo0Var3.b(zl0Var3);
                                                                            zl0Var3 = null;
                                                                        }
                                                                        eo0Var3.b(zl0Var4);
                                                                    }
                                                                }
                                                            }
                                                            if (i7 == 1) {
                                                            }
                                                        }
                                                        zl0Var3 = op.o(eo0Var3);
                                                    }
                                                } else {
                                                    zl0Var3 = zl0Var3.j;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z = z2;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            }
            return null;
        }
        E = null;
        vc0 layoutDirection2 = d4Var.getLayoutDirection();
        z6 z6Var = new z6(E, this, function1, i3);
        if (i == 1 || i == 2) {
            if (i == 1) {
                e = t80.q(o10Var2, z6Var);
            } else {
                if (i != 2) {
                    dd0.j("This function should only be used for 1-D focus search");
                    return null;
                }
                e = t80.e(o10Var2, z6Var);
            }
            return Boolean.valueOf(e);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return gb0.O(i, z6Var, o10Var2, s11Var);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    l.a();
                    return null;
                }
                i2 = 3;
            }
            o10 E3 = uq1.E(o10Var2);
            if (E3 != null) {
                return gb0.O(i2, z6Var, E3, s11Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) s00.a(i))).toString());
        }
        o10 E4 = uq1.E(o10Var2);
        if (E4 != null) {
            if (!E4.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var5 = E4.d.i;
            jd0 I = op.I(E4);
            loop5: while (I != null) {
                if ((((zl0) I.J.g).h & 1024) != 0) {
                    while (zl0Var5 != null) {
                        if ((zl0Var5.g & 1024) != 0) {
                            zl0 zl0Var6 = zl0Var5;
                            eo0 eo0Var4 = null;
                            while (zl0Var6 != null) {
                                if (zl0Var6 instanceof o10) {
                                    o10 o10Var3 = (o10) zl0Var6;
                                    if (o10Var3.B0().a) {
                                        o10Var = o10Var3;
                                        break loop5;
                                    }
                                } else if ((zl0Var6.g & 1024) != 0 && (zl0Var6 instanceof zq)) {
                                    int i8 = 0;
                                    for (zl0 zl0Var7 = ((zq) zl0Var6).t; zl0Var7 != null; zl0Var7 = zl0Var7.j) {
                                        if ((zl0Var7.g & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                zl0Var6 = zl0Var7;
                                            } else {
                                                if (eo0Var4 == null) {
                                                    eo0Var4 = new eo0(new zl0[16]);
                                                }
                                                if (zl0Var6 != null) {
                                                    eo0Var4.b(zl0Var6);
                                                    zl0Var6 = null;
                                                }
                                                eo0Var4.b(zl0Var7);
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                        zl0Var6 = op.o(eo0Var4);
                                    }
                                }
                                zl0Var6 = op.o(eo0Var4);
                            }
                        }
                        zl0Var5 = zl0Var5.i;
                    }
                }
                I = I.s();
                zl0Var5 = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
            }
        }
        o10Var = null;
        if (o10Var != null && o10Var != o10Var2) {
            z = ((Boolean) z6Var.invoke(o10Var)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public final o10 f() {
        o10 o10Var = this.h;
        if (o10Var == null || !o10Var.r) {
            return null;
        }
        return o10Var;
    }

    public final boolean g(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean e = e(i, null, new z3(i, 2));
        boolean booleanValue = e != null ? e.booleanValue() : false;
        if (!booleanValue) {
            c();
        }
        return booleanValue;
    }

    public final void h(o10 o10Var) {
        o10 o10Var2 = this.h;
        this.h = o10Var;
        mn0 mn0Var = this.g;
        Object[] objArr = mn0Var.a;
        int i = mn0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((a10) objArr[i2]).d(o10Var2, o10Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        r12 = r4.d;
        r6 = defpackage.kk1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        if (java.lang.Long.compareUnsigned(r12 * 32, r0 * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = defpackage.y9.j(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0129, code lost:
    
        if (r6 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012b, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0139, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0140, code lost:
    
        if (r16 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0143, code lost:
    
        r16 = java.lang.Long.hashCode(r12[r6]) * r28;
        r17 = r13;
        r13 = (r16 ^ (r16 << 16)) >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0167, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0169, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | ((r16 & 127) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0187, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a0, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a2, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e5, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c9, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f4, code lost:
    
        r37 = r7;
        r4.e = defpackage.q61.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027c, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0280, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0299, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029b, code lost:
    
        r21 = r37 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x029d, code lost:
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0203, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = defpackage.q61.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x021e, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022d, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022f, code lost:
    
        r13 = r6[r12];
        r15 = java.lang.Long.hashCode(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0273, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x026d, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c2, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0344, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0346, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(KeyEvent keyEvent) {
        int i;
        long j;
        boolean z;
        int i2;
        long a = xa0.a(keyEvent.getKeyCode());
        int t = ka0.t(keyEvent);
        int i3 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i4 = 0;
        boolean z2 = true;
        if (t == 2) {
            jn0 jn0Var = this.f;
            if (jn0Var == null) {
                jn0Var = new jn0(3);
                this.f = jn0Var;
            }
            jn0 jn0Var2 = jn0Var;
            int hashCode = Long.hashCode(a) * (-862048943);
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 >>> 7;
            int i7 = i5 & 127;
            int i8 = jn0Var2.c;
            int i9 = i6 & i8;
            int i10 = 0;
            loop0: while (true) {
                long[] jArr = jn0Var2.a;
                int i11 = i9 >> 3;
                int i12 = (i9 & 7) << 3;
                long j3 = (jArr[i11] >>> i12) | ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63));
                int i13 = i3;
                long j4 = i7;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    i2 = (i9 + (Long.numberOfTrailingZeros(j6) >> 3)) & i8;
                    long j7 = j2;
                    if (jn0Var2.b[i2] == a) {
                        z = true;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i10 += 8;
                i9 = (i9 + i10) & i8;
                i3 = i13;
                j2 = j;
            }
            jn0Var2.b[i2] = a;
            return z;
        }
        if (t != 1) {
            return true;
        }
        jn0 jn0Var3 = this.f;
        if (jn0Var3 == null || !jn0Var3.a(a)) {
            return false;
        }
        jn0 jn0Var4 = this.f;
        if (jn0Var4 != null) {
            int hashCode2 = Long.hashCode(a) * (-862048943);
            int i14 = hashCode2 ^ (hashCode2 << 16);
            int i15 = i14 & 127;
            int i16 = jn0Var4.c;
            int i17 = i14 >>> 7;
            loop5: while (true) {
                int i18 = i17 & i16;
                long[] jArr2 = jn0Var4.a;
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                long j8 = ((jArr2[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr2[i19] >>> i20);
                long j9 = (i15 * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j10) >> 3) + i18) & i16;
                    if (jn0Var4.b[i] == a) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i4 += 8;
                i17 = i18 + i4;
            }
            if (i >= 0) {
                jn0Var4.d--;
                long[] jArr3 = jn0Var4.a;
                int i21 = jn0Var4.c;
                int i22 = i >> 3;
                int i23 = (i & 7) << 3;
                long j11 = (jArr3[i22] & (~(255 << i23))) | (254 << i23);
                jArr3[i22] = j11;
                jArr3[(((i - 7) & i21) + (i21 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }
}
