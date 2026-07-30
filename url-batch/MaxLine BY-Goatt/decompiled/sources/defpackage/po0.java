package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import com.facebook.internal.Utility;
import defpackage.po0;
import defpackage.ul1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class po0 implements no0 {
    public final t7 a;
    public final t7 b;
    public final lo0 d;
    public fn1 f;
    public yo0 h;
    public final yo0 c = new yo0(null, 6);
    public final FocusOwnerImpl$modifier$1 e = new cm1() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return po0.this.c.hashCode();
        }

        @Override // defpackage.cm1
        public final ul1 i() {
            return po0.this.c;
        }

        @Override // defpackage.cm1
        public final /* bridge */ /* synthetic */ void m(ul1 ul1Var) {
        }
    };
    public final jn1 g = new jn1(1);

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public po0(t7 t7Var, t7 t7Var2) {
        this.a = t7Var;
        this.b = t7Var2;
        this.d = new lo0(this, t7Var2);
    }

    public final boolean a(boolean z) {
        fs1 fs1Var;
        yo0 yo0Var = this.h;
        if (yo0Var != null) {
            g(null);
            yo0Var.G0(xo0.m, xo0.p);
            if (!yo0Var.m.z) {
                h21.b("visitAncestors called on an unattached node");
            }
            ul1 ul1Var = yo0Var.m.q;
            i91 J = s03.J(yo0Var);
            while (J != null) {
                if ((J.P.f.p & 1024) != 0) {
                    while (ul1Var != null) {
                        if ((ul1Var.o & 1024) != 0) {
                            ul1 ul1Var2 = ul1Var;
                            eo1 eo1Var = null;
                            while (ul1Var2 != null) {
                                if (ul1Var2 instanceof yo0) {
                                    ((yo0) ul1Var2).G0(xo0.n, xo0.p);
                                } else if ((ul1Var2.o & 1024) != 0 && (ul1Var2 instanceof p90)) {
                                    int i = 0;
                                    for (ul1 ul1Var3 = ((p90) ul1Var2).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                                        if ((ul1Var3.o & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                ul1Var2 = ul1Var3;
                                            } else {
                                                if (eo1Var == null) {
                                                    eo1Var = new eo1(new ul1[16]);
                                                }
                                                if (ul1Var2 != null) {
                                                    eo1Var.b(ul1Var2);
                                                    ul1Var2 = null;
                                                }
                                                eo1Var.b(ul1Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ul1Var2 = s03.c(eo1Var);
                            }
                        }
                        ul1Var = ul1Var.q;
                    }
                }
                J = J.u();
                ul1Var = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            a(z);
        } else {
            int ordinal = zm3.G(this.c).ordinal();
            if (ordinal == 0) {
                a(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    a.b();
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
        t7 t7Var = this.a;
        if (t7Var.isFocused() || t7Var.hasFocus()) {
            t7Var.clearFocus();
        } else if (t7Var.hasFocus()) {
            View findFocus = t7Var.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            t7Var.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:13:0x0023, B:16:0x002f, B:18:0x0035, B:19:0x003a, B:21:0x0042, B:23:0x0047, B:25:0x004d, B:29:0x0053, B:34:0x016b, B:36:0x0171, B:37:0x0174, B:39:0x017f, B:42:0x018b, B:46:0x0195, B:81:0x019b, B:82:0x01a0, B:75:0x01dc, B:48:0x01a4, B:50:0x01aa, B:52:0x01ae, B:54:0x01b6, B:56:0x01bc, B:58:0x01c0, B:62:0x01c6, B:64:0x01cf, B:65:0x01d3, B:60:0x01d6, B:84:0x01e1, B:87:0x01e4, B:89:0x01ea, B:96:0x01ee, B:101:0x01f5, B:103:0x01fd, B:111:0x0214, B:112:0x0216, B:114:0x021b, B:148:0x021f, B:143:0x0263, B:116:0x022b, B:118:0x0231, B:120:0x0235, B:122:0x023d, B:124:0x0243, B:126:0x0247, B:130:0x024d, B:132:0x0256, B:133:0x025a, B:128:0x025d, B:154:0x0268, B:158:0x0278, B:160:0x027d, B:194:0x0281, B:189:0x02c5, B:162:0x028d, B:164:0x0293, B:166:0x0297, B:168:0x029f, B:170:0x02a5, B:172:0x02a9, B:176:0x02af, B:178:0x02b8, B:179:0x02bc, B:174:0x02bf, B:201:0x02cc, B:203:0x02d3, B:210:0x02e6, B:211:0x02e8, B:218:0x005b, B:220:0x0061, B:221:0x0064, B:223:0x006c, B:226:0x0078, B:230:0x0082, B:265:0x00d7, B:267:0x00db, B:232:0x0087, B:234:0x008d, B:236:0x0091, B:238:0x0099, B:240:0x009f, B:242:0x00a3, B:246:0x00a9, B:248:0x00b2, B:249:0x00b6, B:244:0x00b9, B:255:0x00bf, B:269:0x00c4, B:272:0x00c7, B:274:0x00cd, B:281:0x00d1, B:286:0x00e1, B:288:0x00e7, B:289:0x00ea, B:291:0x00f4, B:294:0x0100, B:298:0x010a, B:333:0x015f, B:335:0x0163, B:300:0x010f, B:302:0x0115, B:304:0x0119, B:306:0x0121, B:308:0x0127, B:310:0x012b, B:314:0x0131, B:316:0x013a, B:317:0x013e, B:312:0x0141, B:323:0x0147, B:338:0x014c, B:341:0x014f, B:343:0x0155, B:350:0x0159), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [eo1] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [eo1] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [ul1] */
    /* JADX WARN: Type inference failed for: r12v24, types: [ul1] */
    /* JADX WARN: Type inference failed for: r12v28, types: [ul1] */
    /* JADX WARN: Type inference failed for: r12v29, types: [ul1] */
    /* JADX WARN: Type inference failed for: r12v35, types: [ul1] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v45, types: [ul1] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [eo1] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, Function0 function0) {
        o90 o90Var;
        ul1 ul1Var;
        fs1 fs1Var;
        o90 o90Var2;
        fs1 fs1Var2;
        fs1 fs1Var3;
        yo0 yo0Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!h(keyEvent)) {
                return false;
            }
            yo0 A = j8.A(yo0Var);
            if (A != null) {
                if (!A.m.z) {
                    h21.b("visitLocalDescendants called on an unattached node");
                }
                ul1 ul1Var2 = A.m;
                if ((ul1Var2.p & 9216) != 0) {
                    ul1Var = null;
                    for (ul1 ul1Var3 = ul1Var2.r; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                        int i = ul1Var3.o;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            ul1Var = ul1Var3;
                        }
                    }
                } else {
                    ul1Var = null;
                }
            }
            if (A != null) {
                if (!A.m.z) {
                    h21.b("visitAncestors called on an unattached node");
                }
                ul1 ul1Var4 = A.m;
                i91 J = s03.J(A);
                loop11: while (true) {
                    if (J == null) {
                        o90Var2 = null;
                        break;
                    }
                    if ((J.P.f.p & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                        while (ul1Var4 != null) {
                            if ((ul1Var4.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                eo1 eo1Var = null;
                                ul1 ul1Var5 = ul1Var4;
                                while (ul1Var5 != null) {
                                    if (ul1Var5 instanceof b81) {
                                        o90Var2 = ul1Var5;
                                        break loop11;
                                    }
                                    if ((ul1Var5.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0 && (ul1Var5 instanceof p90)) {
                                        ul1 ul1Var6 = ((p90) ul1Var5).B;
                                        int i2 = 0;
                                        ul1Var5 = ul1Var5;
                                        eo1Var = eo1Var;
                                        while (ul1Var6 != null) {
                                            if ((ul1Var6.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                                i2++;
                                                eo1Var = eo1Var;
                                                if (i2 == 1) {
                                                    Unit unit = Unit.a;
                                                    ul1Var5 = ul1Var6;
                                                } else {
                                                    if (eo1Var == null) {
                                                        eo1Var = new eo1(new ul1[16]);
                                                    }
                                                    if (ul1Var5 != null) {
                                                        eo1Var.b(ul1Var5);
                                                        ul1Var5 = null;
                                                    }
                                                    eo1Var.b(ul1Var6);
                                                }
                                            }
                                            ul1Var6 = ul1Var6.r;
                                            ul1Var5 = ul1Var5;
                                            eo1Var = eo1Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    ul1Var5 = s03.c(eo1Var);
                                }
                            }
                            ul1Var4 = ul1Var4.q;
                        }
                    }
                    J = J.u();
                    ul1Var4 = (J == null || (fs1Var2 = J.P) == null) ? null : fs1Var2.e;
                }
                o90 o90Var3 = (b81) o90Var2;
                if (o90Var3 != null) {
                    ul1Var = ((ul1) o90Var3).m;
                    if (ul1Var != null) {
                        if (!ul1Var.m.z) {
                            h21.b("visitAncestors called on an unattached node");
                        }
                        ul1 ul1Var7 = ul1Var.m.q;
                        i91 J2 = s03.J(ul1Var);
                        ArrayList arrayList = null;
                        while (J2 != null) {
                            if ((J2.P.f.p & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                while (ul1Var7 != null) {
                                    if ((ul1Var7.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                        ul1 ul1Var8 = ul1Var7;
                                        eo1 eo1Var2 = null;
                                        while (ul1Var8 != null) {
                                            if (ul1Var8 instanceof b81) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(ul1Var8);
                                            } else if ((ul1Var8.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0 && (ul1Var8 instanceof p90)) {
                                                int i3 = 0;
                                                for (ul1 ul1Var9 = ((p90) ul1Var8).B; ul1Var9 != null; ul1Var9 = ul1Var9.r) {
                                                    if ((ul1Var9.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            Unit unit2 = Unit.a;
                                                            ul1Var8 = ul1Var9;
                                                        } else {
                                                            if (eo1Var2 == null) {
                                                                eo1Var2 = new eo1(new ul1[16]);
                                                            }
                                                            if (ul1Var8 != null) {
                                                                eo1Var2.b(ul1Var8);
                                                                ul1Var8 = null;
                                                            }
                                                            eo1Var2.b(ul1Var9);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            ul1Var8 = s03.c(eo1Var2);
                                        }
                                    }
                                    ul1Var7 = ul1Var7.q;
                                }
                            }
                            J2 = J2.u();
                            ul1Var7 = (J2 == null || (fs1Var3 = J2.P) == null) ? null : fs1Var3.e;
                        }
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            if (size >= 0) {
                                while (true) {
                                    int i4 = size - 1;
                                    if (((b81) arrayList.get(size)).n(keyEvent)) {
                                        return true;
                                    }
                                    if (i4 < 0) {
                                        break;
                                    }
                                    size = i4;
                                }
                            }
                            Unit unit3 = Unit.a;
                        }
                        p90 p90Var = ul1Var.m;
                        ?? r0 = 0;
                        while (p90Var != 0) {
                            if (p90Var instanceof b81) {
                                if (((b81) p90Var).n(keyEvent)) {
                                    return true;
                                }
                            } else if ((p90Var.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var10 = p90Var.B;
                                int i5 = 0;
                                r0 = r0;
                                p90Var = p90Var;
                                while (ul1Var10 != null) {
                                    if ((ul1Var10.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                        i5++;
                                        r0 = r0;
                                        if (i5 == 1) {
                                            Unit unit4 = Unit.a;
                                            p90Var = ul1Var10;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r0.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r0.b(ul1Var10);
                                        }
                                    }
                                    ul1Var10 = ul1Var10.r;
                                    r0 = r0;
                                    p90Var = p90Var;
                                }
                                if (i5 == 1) {
                                }
                            }
                            p90Var = s03.c(r0);
                        }
                        if (((Boolean) function0.invoke()).booleanValue()) {
                            return true;
                        }
                        p90 p90Var2 = ul1Var.m;
                        ?? r14 = 0;
                        while (p90Var2 != 0) {
                            if (p90Var2 instanceof b81) {
                                if (((b81) p90Var2).V(keyEvent)) {
                                    return true;
                                }
                            } else if ((p90Var2.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0 && (p90Var2 instanceof p90)) {
                                ul1 ul1Var11 = p90Var2.B;
                                int i6 = 0;
                                p90Var2 = p90Var2;
                                r14 = r14;
                                while (ul1Var11 != null) {
                                    if ((ul1Var11.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                        i6++;
                                        r14 = r14;
                                        if (i6 == 1) {
                                            Unit unit5 = Unit.a;
                                            p90Var2 = ul1Var11;
                                        } else {
                                            if (r14 == 0) {
                                                r14 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var2 != 0) {
                                                r14.b(p90Var2);
                                                p90Var2 = 0;
                                            }
                                            r14.b(ul1Var11);
                                        }
                                    }
                                    ul1Var11 = ul1Var11.r;
                                    p90Var2 = p90Var2;
                                    r14 = r14;
                                }
                                if (i6 == 1) {
                                }
                            }
                            p90Var2 = s03.c(r14);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                if (((b81) arrayList.get(i7)).V(keyEvent)) {
                                    return true;
                                }
                            }
                            Unit unit6 = Unit.a;
                        }
                        Unit unit7 = Unit.a;
                    }
                    return false;
                }
            }
            if (!yo0Var.m.z) {
                h21.b("visitAncestors called on an unattached node");
            }
            ul1 ul1Var12 = yo0Var.m.q;
            i91 J3 = s03.J(yo0Var);
            loop15: while (true) {
                if (J3 == null) {
                    o90Var = null;
                    break;
                }
                if ((J3.P.f.p & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                    while (ul1Var12 != null) {
                        if ((ul1Var12.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                            ul1 ul1Var13 = ul1Var12;
                            eo1 eo1Var3 = null;
                            while (ul1Var13 != null) {
                                if (ul1Var13 instanceof b81) {
                                    o90Var = ul1Var13;
                                    break loop15;
                                }
                                if ((ul1Var13.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0 && (ul1Var13 instanceof p90)) {
                                    ul1 ul1Var14 = ((p90) ul1Var13).B;
                                    int i8 = 0;
                                    ul1Var13 = ul1Var13;
                                    eo1Var3 = eo1Var3;
                                    while (ul1Var14 != null) {
                                        if ((ul1Var14.o & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
                                            i8++;
                                            eo1Var3 = eo1Var3;
                                            if (i8 == 1) {
                                                Unit unit8 = Unit.a;
                                                ul1Var13 = ul1Var14;
                                            } else {
                                                if (eo1Var3 == null) {
                                                    eo1Var3 = new eo1(new ul1[16]);
                                                }
                                                if (ul1Var13 != null) {
                                                    eo1Var3.b(ul1Var13);
                                                    ul1Var13 = null;
                                                }
                                                eo1Var3.b(ul1Var14);
                                            }
                                        }
                                        ul1Var14 = ul1Var14.r;
                                        ul1Var13 = ul1Var13;
                                        eo1Var3 = eo1Var3;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                ul1Var13 = s03.c(eo1Var3);
                            }
                        }
                        ul1Var12 = ul1Var12.q;
                    }
                }
                J3 = J3.u();
                ul1Var12 = (J3 == null || (fs1Var = J3.P) == null) ? null : fs1Var.e;
            }
            o90 o90Var4 = (b81) o90Var;
            ul1Var = o90Var4 != null ? ((ul1) o90Var4).m : null;
            if (ul1Var != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean e(int i, w72 w72Var, Function1 function1) {
        Boolean bool;
        Boolean bool2;
        boolean k;
        yo0 yo0Var;
        fs1 fs1Var;
        yo0 yo0Var2 = this.c;
        yo0 A = j8.A(yo0Var2);
        int i2 = 4;
        t7 t7Var = this.b;
        if (A != null) {
            u81 layoutDirection = t7Var.getLayoutDirection();
            bool2 = null;
            bool2 = null;
            bool = 0;
            ro0 H0 = A.H0();
            to0 to0Var = H0.h;
            to0 to0Var2 = H0.i;
            if (i == 1) {
                to0Var = H0.b;
            } else if (i == 2) {
                to0Var = H0.c;
            } else if (i == 5) {
                to0Var = H0.d;
            } else if (i == 6) {
                to0Var = H0.e;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        a.b();
                        return null;
                    }
                    to0Var = to0Var2;
                }
                if (to0Var == to0.b) {
                    to0Var = null;
                }
                if (to0Var == null) {
                    to0Var = H0.f;
                }
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    to0Var = to0Var2;
                } else if (ordinal2 != 1) {
                    a.b();
                    return null;
                }
                if (to0Var == to0.b) {
                    to0Var = null;
                }
                if (to0Var == null) {
                    to0Var = H0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    lh.g("invalid FocusDirection");
                    return null;
                }
                no0 focusOwner = ((t7) s03.K(A)).getFocusOwner();
                yo0 yo0Var3 = ((po0) focusOwner).h;
                if (i == 7) {
                    H0.j.getClass();
                    Unit unit = Unit.a;
                } else {
                    H0.k.getClass();
                    Unit unit2 = Unit.a;
                }
                to0Var = yo0Var3 != ((po0) focusOwner).h ? to0.d : to0.b;
            }
            if (!Intrinsics.b(to0Var, to0.c)) {
                if (Intrinsics.b(to0Var, to0.d)) {
                    yo0 A2 = j8.A(yo0Var2);
                    if (A2 != null) {
                        return (Boolean) function1.invoke(A2);
                    }
                } else if (!Intrinsics.b(to0Var, to0.b)) {
                    return Boolean.valueOf(to0Var.a(function1));
                }
            }
            return bool2;
        }
        bool = 0;
        A = null;
        u81 layoutDirection2 = t7Var.getLayoutDirection();
        oc ocVar = new oc(A, this, function1, 9);
        if (i == 1 || i == 2) {
            if (i == 1) {
                k = yj1.t(yo0Var2, ocVar);
            } else {
                if (i != 2) {
                    lh.g("This function should only be used for 1-D focus search");
                    return bool;
                }
                k = yj1.k(yo0Var2, ocVar);
            }
            return Boolean.valueOf(k);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return mh2.s(i, ocVar, yo0Var2, w72Var);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    a.b();
                    return bool;
                }
                i2 = 3;
            }
            yo0 A3 = j8.A(yo0Var2);
            bool2 = bool;
            if (A3 != null) {
                return mh2.s(i2, ocVar, A3, w72Var);
            }
            return bool2;
        }
        if (i != 8) {
            b71.w(fo0.a(i), "Focus search invoked with invalid FocusDirection ");
            return bool;
        }
        yo0 A4 = j8.A(yo0Var2);
        boolean z = false;
        if (A4 != null) {
            if (!A4.m.z) {
                h21.b("visitAncestors called on an unattached node");
            }
            ul1 ul1Var = A4.m.q;
            i91 J = s03.J(A4);
            loop0: while (J != null) {
                if ((J.P.f.p & 1024) != 0) {
                    while (ul1Var != null) {
                        if ((ul1Var.o & 1024) != 0) {
                            ul1 ul1Var2 = ul1Var;
                            eo1 eo1Var = bool;
                            while (ul1Var2 != null) {
                                if (ul1Var2 instanceof yo0) {
                                    yo0 yo0Var4 = (yo0) ul1Var2;
                                    if (yo0Var4.H0().a) {
                                        yo0Var = yo0Var4;
                                        break loop0;
                                    }
                                } else if ((ul1Var2.o & 1024) != 0 && (ul1Var2 instanceof p90)) {
                                    int i3 = 0;
                                    for (ul1 ul1Var3 = ((p90) ul1Var2).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                                        if ((ul1Var3.o & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                ul1Var2 = ul1Var3;
                                            } else {
                                                if (eo1Var == null) {
                                                    eo1Var = new eo1(new ul1[16]);
                                                }
                                                if (ul1Var2 != null) {
                                                    eo1Var.b(ul1Var2);
                                                    ul1Var2 = bool;
                                                }
                                                eo1Var.b(ul1Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                ul1Var2 = s03.c(eo1Var);
                            }
                        }
                        ul1Var = ul1Var.q;
                    }
                }
                J = J.u();
                ul1Var = (J == null || (fs1Var = J.P) == null) ? bool : fs1Var.e;
            }
        }
        yo0Var = bool;
        if (yo0Var != null && yo0Var != yo0Var2) {
            z = ((Boolean) ocVar.invoke(yo0Var)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public final boolean f(int i) {
        boolean z;
        View view;
        c82 c82Var = new c82();
        c82Var.m = Boolean.FALSE;
        yo0 yo0Var = this.h;
        t7 t7Var = this.a;
        Boolean e = e(i, t7Var.getEmbeddedViewFocusRect(), new oo0(i, 0, c82Var));
        if (!Intrinsics.b(e, Boolean.TRUE) || yo0Var == this.h) {
            if (e != null && c82Var.m != null) {
                if (!e.booleanValue() || !((Boolean) c82Var.m).booleanValue()) {
                    if (i != 1 && i != 2) {
                        if (i != 7 && i != 8) {
                            Integer V = ll3.V(i);
                            if (V != null) {
                                int intValue = V.intValue();
                                w72 embeddedViewFocusRect = t7Var.getEmbeddedViewFocusRect();
                                Rect I = embeddedViewFocusRect != null ? bd3.I(embeddedViewFocusRect) : null;
                                Object obj = io0.f.get();
                                obj.getClass();
                                io0 io0Var = (io0) obj;
                                if (I == null) {
                                    view = io0Var.b(intValue, t7Var.findFocus(), t7Var);
                                } else {
                                    io0Var.a.set(I);
                                    Rect rect = io0Var.a;
                                    ArrayList<View> arrayList = io0Var.e;
                                    try {
                                        arrayList.clear();
                                        if (Build.VERSION.SDK_INT < 26) {
                                            tk3.w(t7Var, arrayList, t7Var.isInTouchMode());
                                        } else {
                                            t7Var.addFocusables(arrayList, intValue, t7Var.isInTouchMode() ? 1 : 0);
                                        }
                                        View a = arrayList.isEmpty() ? null : io0Var.a(intValue, rect, null, t7Var, arrayList);
                                        arrayList.clear();
                                        view = a;
                                    } catch (Throwable th) {
                                        arrayList.clear();
                                        throw th;
                                    }
                                }
                                if (view != null) {
                                    z = ll3.T(view, Integer.valueOf(intValue), I);
                                    if (!z) {
                                    }
                                }
                            } else {
                                lh.g("Invalid focus direction");
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    } else if (b(i, false, false)) {
                        Boolean e2 = e(i, null, new p7(i, 2));
                        if (e2 != null ? e2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g(yo0 yo0Var) {
        i91 J;
        sh2 w;
        i91 J2;
        sh2 w2;
        yo0 yo0Var2 = this.h;
        this.h = yo0Var;
        jn1 jn1Var = this.g;
        Object[] objArr = jn1Var.a;
        int i = jn1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            v6 v6Var = (v6) ((mo0) objArr[i2]);
            v6Var.getClass();
            if (yo0Var2 != null && (J2 = s03.J(yo0Var2)) != null && (w2 = J2.w()) != null && w2.m.b(rh2.g)) {
                v6Var.a.g(v6Var.c, J2.n);
            }
            if (yo0Var != null && (J = s03.J(yo0Var)) != null && (w = J.w()) != null && w.m.b(rh2.g)) {
                int i3 = J.n;
                v6Var.d.a.l(i3, new u6(v6Var, i3));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0350, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        r12 = r4.d;
        r6 = defpackage.q13.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        if (java.lang.Long.compare((r12 * 32) ^ Long.MIN_VALUE, (r0 * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        if (r14 >= r13) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
    
        r15 = r5;
        r18 = r6;
        r39 = 128;
        r5 = defpackage.oi.r(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r18;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        if (r6 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012d, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r22 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013b, code lost:
    
        if (r22 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0142, code lost:
    
        if (r22 == 254) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
    
        r18 = java.lang.Long.hashCode(r12[r6]) * r28;
        r22 = r13;
        r13 = (r18 ^ (r18 << 16)) >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0167, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018c, code lost:
    
        r15 = r7;
        r7 = r14 >> 3;
        r25 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x019d, code lost:
    
        if (((r25 >> r8) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019f, code lost:
    
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | ((r18 & 127) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r36];
        r12[r36] = r33;
        r6 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e4, code lost:
    
        r0[r0.length - r15] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + r15;
        r7 = r15;
        r13 = r22;
        r15 = r29;
        r5 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c7, code lost:
    
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | ((r18 & 127) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r36];
        r12[r36] = r5;
        r6 = r36 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0169, code lost:
    
        r15 = r7;
        r0[r8] = (r0[r8] & (~(255 << r9))) | ((r18 & 127) << r9);
        r0[r0.length - r15] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r7 = r15;
        r13 = r22;
        r15 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f8, code lost:
    
        r15 = r7;
        r4.e = defpackage.oe2.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0204, code lost:
    
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0287, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028b, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a4, code lost:
    
        if (((r6 >> r8) & 255) != r39) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a6, code lost:
    
        r21 = r37 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a8, code lost:
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r37 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0208, code lost:
    
        r15 = 1;
        r39 = 128;
        r0 = defpackage.oe2.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0222, code lost:
    
        if (r12 >= r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0232, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0234, code lost:
    
        r13 = r6[r12];
        r16 = java.lang.Long.hashCode(r13) * r28;
        r16 = r16 ^ (r16 << 16);
        r37 = r15;
        r15 = r4.b(r16 >>> 7);
        r17 = r0;
        r0 = r16 & 127;
        r16 = r5;
        r18 = r6;
        r5 = r0;
        r0 = r15 >> 3;
        r19 = (r15 & 7) << 3;
        r5 = (r17[r0] & (~(255 << r19))) | (r5 << r19);
        r17[r0] = r5;
        r17[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x027c, code lost:
    
        r12 = r12 + 1;
        r5 = r16;
        r0 = r17;
        r6 = r18;
        r15 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0274, code lost:
    
        r17 = r0;
        r16 = r5;
        r18 = r6;
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00be, code lost:
    
        r37 = 1;
        r39 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x034e, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(KeyEvent keyEvent) {
        int i;
        long j;
        int i2;
        boolean z;
        long x = z71.x(keyEvent);
        int D = z71.D(keyEvent);
        int i3 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i4 = 0;
        int i5 = 1;
        if (D == 2) {
            fn1 fn1Var = this.f;
            if (fn1Var == null) {
                fn1Var = new fn1(3);
                this.f = fn1Var;
            }
            fn1 fn1Var2 = fn1Var;
            int hashCode = Long.hashCode(x) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & 127;
            int i9 = fn1Var2.c;
            int i10 = i7 & i9;
            int i11 = 0;
            loop0: while (true) {
                long[] jArr = fn1Var2.a;
                int i12 = i10 >> 3;
                int i13 = (i10 & 7) << 3;
                long j3 = (jArr[i12] >>> i13) | ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63));
                int i14 = i3;
                long j4 = i8;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    i2 = (i10 + (Long.numberOfTrailingZeros(j6) >> 3)) & i9;
                    long j7 = j2;
                    if (fn1Var2.b[i2] == x) {
                        z = 1;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i11 += 8;
                i10 = (i10 + i11) & i9;
                i3 = i14;
                j2 = j;
            }
            fn1Var2.b[i2] = x;
            return z;
        }
        if (D != 1) {
            return true;
        }
        fn1 fn1Var3 = this.f;
        if (fn1Var3 == null || !fn1Var3.a(x)) {
            return false;
        }
        fn1 fn1Var4 = this.f;
        if (fn1Var4 != null) {
            int hashCode2 = Long.hashCode(x) * (-862048943);
            int i15 = hashCode2 ^ (hashCode2 << 16);
            int i16 = i15 & 127;
            int i17 = fn1Var4.c;
            int i18 = i15 >>> 7;
            loop5: while (true) {
                int i19 = i18 & i17;
                long[] jArr2 = fn1Var4.a;
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                long j8 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
                long j9 = (i16 * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j10) >> 3) + i19) & i17;
                    if (fn1Var4.b[i] == x) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i4 += 8;
                i18 = i19 + i4;
            }
            if (i >= 0) {
                fn1Var4.d--;
                long[] jArr3 = fn1Var4.a;
                int i22 = fn1Var4.c;
                int i23 = i >> 3;
                int i24 = (i & 7) << 3;
                long j11 = (jArr3[i23] & (~(255 << i24))) | (254 << i24);
                jArr3[i23] = j11;
                jArr3[(((i - 7) & i22) + (i22 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }
}
