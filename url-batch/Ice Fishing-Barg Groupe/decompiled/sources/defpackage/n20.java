package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class n20 {
    public static final float PxuCJdSBwIXG = 0.125f / 18.0f;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (defpackage.bf1.lS5Rgt96tfkO(r14, 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object PxuCJdSBwIXG(oc2 oc2Var, long j, ct ctVar) {
        g20 g20Var;
        int i;
        yt1 yt1Var;
        Object PxuCJdSBwIXG2;
        su suVar;
        Object obj;
        Object obj2;
        if (ctVar instanceof g20) {
            g20Var = (g20) ctVar;
            int i2 = g20Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g20Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj3 = g20Var.cpQdD2nAriOS;
                i = g20Var.r3s1LDPKFs1S;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj3);
                    if (!e9gEMXR7LXtO(oc2Var.cpQdD2nAriOS.IAToe7bXGz4N, j)) {
                        yt1Var = new yt1();
                        yt1Var.rtx2ld2ELZv4 = j;
                        g20Var.dgRBjINgWbAK = oc2Var;
                        g20Var.x50lh2ztY7Y5 = yt1Var;
                        g20Var.r3s1LDPKFs1S = 1;
                        PxuCJdSBwIXG2 = oc2Var.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, g20Var);
                        suVar = su.rtx2ld2ELZv4;
                        if (PxuCJdSBwIXG2 != suVar) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yt1 yt1Var2 = g20Var.x50lh2ztY7Y5;
                oc2 oc2Var2 = g20Var.dgRBjINgWbAK;
                ng0.tmVwIGCQF4zR(obj3);
                yt1 yt1Var3 = yt1Var2;
                oc2Var = oc2Var2;
                qn1 qn1Var = (qn1) obj3;
                List list = qn1Var.PxuCJdSBwIXG;
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i4);
                    if (vi0.gPXPFXrUH4XX(((ao1) obj).PxuCJdSBwIXG, yt1Var3.rtx2ld2ELZv4)) {
                        break;
                    }
                    i4++;
                }
                ao1 ao1Var = (ao1) obj;
                if (ao1Var == null) {
                    if (ni0.x50lh2ztY7Y5(ao1Var)) {
                        List list2 = qn1Var.PxuCJdSBwIXG;
                        int size2 = list2.size();
                        while (true) {
                            if (i3 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list2.get(i3);
                            if (((ao1) obj2).Y1f8riQaR6yg) {
                                break;
                            }
                            i3++;
                        }
                        ao1 ao1Var2 = (ao1) obj2;
                        if (ao1Var2 != null) {
                            yt1Var3.rtx2ld2ELZv4 = ao1Var2.PxuCJdSBwIXG;
                            yt1Var = yt1Var3;
                            g20Var.dgRBjINgWbAK = oc2Var;
                            g20Var.x50lh2ztY7Y5 = yt1Var;
                            g20Var.r3s1LDPKFs1S = 1;
                            PxuCJdSBwIXG2 = oc2Var.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, g20Var);
                            suVar = su.rtx2ld2ELZv4;
                            if (PxuCJdSBwIXG2 != suVar) {
                                return suVar;
                            }
                            yt1 yt1Var4 = yt1Var;
                            obj3 = PxuCJdSBwIXG2;
                            yt1Var3 = yt1Var4;
                        }
                    } else {
                        long EpkonXwzFgDB = ni0.EpkonXwzFgDB(ao1Var, true);
                        bf1.Companion.getClass();
                    }
                    qn1 qn1Var2 = (qn1) obj3;
                    List list3 = qn1Var2.PxuCJdSBwIXG;
                    int size3 = list3.size();
                    int i32 = 0;
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                    }
                    ao1 ao1Var3 = (ao1) obj;
                    if (ao1Var3 == null) {
                        ao1Var3 = null;
                    }
                }
                if (ao1Var3 == null || ao1Var3.lS5Rgt96tfkO()) {
                    return null;
                }
                return ao1Var3;
            }
        }
        g20Var = new g20(ctVar);
        Object obj32 = g20Var.cpQdD2nAriOS;
        i = g20Var.r3s1LDPKFs1S;
        if (i != 0) {
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0602 -> B:56:0x060a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x062b -> B:60:0x03ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0252 -> B:144:0x03c8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x03ae -> B:141:0x03b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0694 -> B:12:0x069d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0463 -> B:66:0x0411). Please report as a decompilation issue!!! */
    public static final java.lang.Object RAsUl2FVSrh6(defpackage.oc2 r27, defpackage.ao1 r28, defpackage.kb r29, defpackage.ai r30, defpackage.l4 r31, defpackage.m31 r32, defpackage.r3s1LDPKFs1S r33, defpackage.nc r34) {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n20.RAsUl2FVSrh6(oc2, ao1, kb, ai, l4, m31, r3s1LDPKFs1S, nc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0164 -> B:11:0x016a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object TSizfFm2Yiuu(oc2 oc2Var, long j, l4 l4Var, nc ncVar) {
        j20 j20Var;
        int i;
        oc2 oc2Var2;
        float a92UlCVFR9N8;
        yt1 yt1Var;
        ij0 ij0Var;
        pe0 pe0Var;
        yt1 yt1Var2;
        oc2 oc2Var3;
        yt1 yt1Var3;
        int size;
        int i2;
        ao1 ao1Var;
        Object obj;
        ao1 ao1Var2;
        Object obj2;
        int i3;
        Object PxuCJdSBwIXG2;
        if (ncVar instanceof j20) {
            j20Var = (j20) ncVar;
            int i4 = j20Var.XL4ISE6Oc65B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                j20Var.XL4ISE6Oc65B = i4 - Integer.MIN_VALUE;
                Object obj3 = j20Var.BRwzKIf41E4i;
                i = j20Var.XL4ISE6Oc65B;
                int i5 = 1;
                ao1 ao1Var3 = null;
                su suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj3);
                    ho1.Companion.getClass();
                    bf1.Companion.getClass();
                    oc2Var2 = oc2Var;
                    if (e9gEMXR7LXtO(oc2Var2.cpQdD2nAriOS.IAToe7bXGz4N, j)) {
                        return null;
                    }
                    a92UlCVFR9N8 = a92UlCVFR9N8(oc2Var2.a92UlCVFR9N8(), 1);
                    yt1Var = new yt1();
                    yt1Var.rtx2ld2ELZv4 = j;
                    ij0Var = new ij0(0L, ao1Var3);
                    pe0Var = l4Var;
                    j20Var.dgRBjINgWbAK = pe0Var;
                    j20Var.x50lh2ztY7Y5 = oc2Var2;
                    j20Var.cpQdD2nAriOS = yt1Var;
                    j20Var.r3s1LDPKFs1S = ij0Var;
                    j20Var.QrzZRwfaDlRX = ao1Var3;
                    j20Var.gPXPFXrUH4XX = a92UlCVFR9N8;
                    j20Var.XL4ISE6Oc65B = i5;
                    PxuCJdSBwIXG2 = oc2Var2.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, j20Var);
                    if (PxuCJdSBwIXG2 != suVar) {
                    }
                    return suVar;
                }
                if (i == 1) {
                    float f = j20Var.gPXPFXrUH4XX;
                    ij0Var = j20Var.r3s1LDPKFs1S;
                    yt1 yt1Var4 = j20Var.cpQdD2nAriOS;
                    oc2Var3 = j20Var.x50lh2ztY7Y5;
                    pe0 pe0Var2 = j20Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj3);
                    yt1Var2 = yt1Var4;
                    a92UlCVFR9N8 = f;
                    pe0Var = pe0Var2;
                    yt1Var3 = yt1Var2;
                    qn1 qn1Var = (qn1) obj3;
                    List list = qn1Var.PxuCJdSBwIXG;
                    size = list.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2 = i3 + 1;
                        ao1Var3 = ao1Var;
                    }
                    ao1Var2 = (ao1) obj;
                    if (ao1Var2 != null) {
                        return ao1Var;
                    }
                    if (ni0.x50lh2ztY7Y5(ao1Var2)) {
                    }
                    j20Var.dgRBjINgWbAK = pe0Var;
                    j20Var.x50lh2ztY7Y5 = oc2Var2;
                    j20Var.cpQdD2nAriOS = yt1Var;
                    j20Var.r3s1LDPKFs1S = ij0Var;
                    j20Var.QrzZRwfaDlRX = ao1Var3;
                    j20Var.gPXPFXrUH4XX = a92UlCVFR9N8;
                    j20Var.XL4ISE6Oc65B = i5;
                    PxuCJdSBwIXG2 = oc2Var2.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, j20Var);
                    if (PxuCJdSBwIXG2 != suVar) {
                    }
                    return suVar;
                }
                if (i != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f2 = j20Var.gPXPFXrUH4XX;
                ao1 ao1Var4 = j20Var.QrzZRwfaDlRX;
                ij0 ij0Var2 = j20Var.r3s1LDPKFs1S;
                yt1 yt1Var5 = j20Var.cpQdD2nAriOS;
                oc2 oc2Var4 = j20Var.x50lh2ztY7Y5;
                pe0 pe0Var3 = j20Var.dgRBjINgWbAK;
                ng0.tmVwIGCQF4zR(obj3);
                yt1Var3 = yt1Var5;
                oc2Var3 = oc2Var4;
                int i6 = 1;
                ao1Var = null;
                char c = 2;
                float f3 = f2;
                pe0Var = pe0Var3;
                if (!ao1Var4.lS5Rgt96tfkO()) {
                    return ao1Var;
                }
                i5 = i6;
                ij0Var = ij0Var2;
                a92UlCVFR9N8 = f3;
                oc2Var2 = oc2Var3;
                yt1Var = yt1Var3;
                ao1Var3 = ao1Var;
                j20Var.dgRBjINgWbAK = pe0Var;
                j20Var.x50lh2ztY7Y5 = oc2Var2;
                j20Var.cpQdD2nAriOS = yt1Var;
                j20Var.r3s1LDPKFs1S = ij0Var;
                j20Var.QrzZRwfaDlRX = ao1Var3;
                j20Var.gPXPFXrUH4XX = a92UlCVFR9N8;
                j20Var.XL4ISE6Oc65B = i5;
                PxuCJdSBwIXG2 = oc2Var2.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, j20Var);
                if (PxuCJdSBwIXG2 != suVar) {
                    yt1Var2 = yt1Var;
                    oc2Var3 = oc2Var2;
                    obj3 = PxuCJdSBwIXG2;
                    yt1Var3 = yt1Var2;
                    qn1 qn1Var2 = (qn1) obj3;
                    List list2 = qn1Var2.PxuCJdSBwIXG;
                    size = list2.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            ao1Var = ao1Var3;
                            obj = ao1Var;
                            break;
                        }
                        obj = list2.get(i2);
                        ao1Var = ao1Var3;
                        i3 = i2;
                        if (vi0.gPXPFXrUH4XX(((ao1) obj).PxuCJdSBwIXG, yt1Var3.rtx2ld2ELZv4)) {
                            break;
                        }
                        i2 = i3 + 1;
                        ao1Var3 = ao1Var;
                    }
                    ao1Var2 = (ao1) obj;
                    if (ao1Var2 != null || ao1Var2.lS5Rgt96tfkO()) {
                        return ao1Var;
                    }
                    if (ni0.x50lh2ztY7Y5(ao1Var2)) {
                        i6 = 1;
                        long PxuCJdSBwIXG3 = ij0Var.PxuCJdSBwIXG(ni0.EpkonXwzFgDB(ao1Var2, true), a92UlCVFR9N8, true);
                        if ((9223372034707292159L & PxuCJdSBwIXG3) != 9205357640488583168L) {
                            pe0Var.rtx2ld2ELZv4(ao1Var2, new bf1(PxuCJdSBwIXG3));
                            if (ao1Var2.lS5Rgt96tfkO()) {
                                return ao1Var2;
                            }
                            ij0.e9gEMXR7LXtO(ij0Var);
                            ao1Var3 = ao1Var;
                            i5 = 1;
                            oc2Var2 = oc2Var3;
                            yt1Var = yt1Var3;
                        } else {
                            j20Var.dgRBjINgWbAK = pe0Var;
                            j20Var.x50lh2ztY7Y5 = oc2Var3;
                            j20Var.cpQdD2nAriOS = yt1Var3;
                            j20Var.r3s1LDPKFs1S = ij0Var;
                            j20Var.QrzZRwfaDlRX = ao1Var2;
                            j20Var.gPXPFXrUH4XX = a92UlCVFR9N8;
                            c = 2;
                            j20Var.XL4ISE6Oc65B = 2;
                            if (oc2Var3.PxuCJdSBwIXG(rn1.wdg6QnbFHrFF, j20Var) != suVar) {
                                float f4 = a92UlCVFR9N8;
                                ij0Var2 = ij0Var;
                                ao1Var4 = ao1Var2;
                                f3 = f4;
                                if (!ao1Var4.lS5Rgt96tfkO()) {
                                }
                            }
                        }
                    } else {
                        List list3 = qn1Var2.PxuCJdSBwIXG;
                        int size2 = list3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                obj2 = ao1Var;
                                break;
                            }
                            obj2 = list3.get(i7);
                            if (((ao1) obj2).Y1f8riQaR6yg) {
                                break;
                            }
                            i7++;
                        }
                        ao1 ao1Var5 = (ao1) obj2;
                        if (ao1Var5 == null) {
                            return ao1Var;
                        }
                        yt1Var3.rtx2ld2ELZv4 = ao1Var5.PxuCJdSBwIXG;
                        ao1Var3 = ao1Var;
                        i5 = 1;
                        oc2Var2 = oc2Var3;
                        yt1Var = yt1Var3;
                    }
                    j20Var.dgRBjINgWbAK = pe0Var;
                    j20Var.x50lh2ztY7Y5 = oc2Var2;
                    j20Var.cpQdD2nAriOS = yt1Var;
                    j20Var.r3s1LDPKFs1S = ij0Var;
                    j20Var.QrzZRwfaDlRX = ao1Var3;
                    j20Var.gPXPFXrUH4XX = a92UlCVFR9N8;
                    j20Var.XL4ISE6Oc65B = i5;
                    PxuCJdSBwIXG2 = oc2Var2.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, j20Var);
                    if (PxuCJdSBwIXG2 != suVar) {
                    }
                }
                return suVar;
            }
        }
        j20Var = new j20(ncVar);
        Object obj32 = j20Var.BRwzKIf41E4i;
        i = j20Var.XL4ISE6Oc65B;
        int i52 = 1;
        ao1 ao1Var32 = null;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Y1f8riQaR6yg(oc2 oc2Var, long j, le0 le0Var, ct ctVar) {
        l20 l20Var;
        int i;
        su suVar;
        ao1 ao1Var;
        if (ctVar instanceof l20) {
            l20Var = (l20) ctVar;
            int i2 = l20Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l20Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = l20Var.cpQdD2nAriOS;
                i = l20Var.r3s1LDPKFs1S;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l20Var.dgRBjINgWbAK = oc2Var;
                    l20Var.x50lh2ztY7Y5 = le0Var;
                    l20Var.r3s1LDPKFs1S = 1;
                    obj = PxuCJdSBwIXG(oc2Var, j, l20Var);
                    suVar = su.rtx2ld2ELZv4;
                    if (obj == suVar) {
                    }
                    ao1Var = (ao1) obj;
                    if (ao1Var == null) {
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    le0 le0Var2 = l20Var.x50lh2ztY7Y5;
                    oc2 oc2Var2 = l20Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                    le0Var = le0Var2;
                    oc2Var = oc2Var2;
                    ao1Var = (ao1) obj;
                    if (ao1Var == null) {
                        if (ni0.x50lh2ztY7Y5(ao1Var)) {
                            return Boolean.TRUE;
                        }
                        le0Var.OPXfSBeufaJ8(ao1Var);
                        j = ao1Var.PxuCJdSBwIXG;
                        l20Var.dgRBjINgWbAK = oc2Var;
                        l20Var.x50lh2ztY7Y5 = le0Var;
                        l20Var.r3s1LDPKFs1S = 1;
                        obj = PxuCJdSBwIXG(oc2Var, j, l20Var);
                        suVar = su.rtx2ld2ELZv4;
                        if (obj == suVar) {
                            return suVar;
                        }
                        ao1Var = (ao1) obj;
                        if (ao1Var == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        l20Var = new l20(ctVar);
        Object obj2 = l20Var.cpQdD2nAriOS;
        i = l20Var.r3s1LDPKFs1S;
        if (i != 0) {
        }
    }

    public static final float a92UlCVFR9N8(vq2 vq2Var, int i) {
        ho1.Companion.getClass();
        return i == 2 ? vq2Var.Y1f8riQaR6yg() * PxuCJdSBwIXG : vq2Var.Y1f8riQaR6yg();
    }

    public static final boolean e9gEMXR7LXtO(qn1 qn1Var, long j) {
        Object obj;
        List list = qn1Var.PxuCJdSBwIXG;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (vi0.gPXPFXrUH4XX(((ao1) obj).PxuCJdSBwIXG, j)) {
                break;
            }
            i++;
        }
        ao1 ao1Var = (ao1) obj;
        if (ao1Var != null && ao1Var.Y1f8riQaR6yg) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[Catch: sn1 -> 0x00a4, TRY_LEAVE, TryCatch #0 {sn1 -> 0x00a4, blocks: (B:11:0x0028, B:12:0x0097, B:14:0x009b, B:34:0x007b), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r9v3, types: [zt1] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lS5Rgt96tfkO(oc2 oc2Var, long j, ct ctVar) {
        h20 h20Var;
        int i;
        Object obj;
        ao1 ao1Var;
        vt1 vt1Var;
        try {
            if (ctVar instanceof h20) {
                h20Var = (h20) ctVar;
                int i2 = h20Var.QrzZRwfaDlRX;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    h20Var.QrzZRwfaDlRX = i2 - Integer.MIN_VALUE;
                    Object obj2 = h20Var.r3s1LDPKFs1S;
                    i = h20Var.QrzZRwfaDlRX;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj2);
                        if (!e9gEMXR7LXtO(oc2Var.cpQdD2nAriOS.IAToe7bXGz4N, j)) {
                            List list = oc2Var.cpQdD2nAriOS.IAToe7bXGz4N.PxuCJdSBwIXG;
                            int size = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    obj = null;
                                    break;
                                }
                                obj = list.get(i3);
                                if (vi0.gPXPFXrUH4XX(((ao1) obj).PxuCJdSBwIXG, j)) {
                                    break;
                                }
                                i3++;
                            }
                            ao1Var = (ao1) obj;
                            if (ao1Var != null) {
                                zt1 zt1Var = new zt1();
                                zt1 zt1Var2 = new zt1();
                                zt1Var2.rtx2ld2ELZv4 = ao1Var;
                                long TSizfFm2Yiuu = oc2Var.a92UlCVFR9N8().TSizfFm2Yiuu();
                                vt1 vt1Var2 = new vt1();
                                pe0 i20Var = new i20(vt1Var2, zt1Var2, zt1Var, null);
                                h20Var.dgRBjINgWbAK = ao1Var;
                                h20Var.x50lh2ztY7Y5 = zt1Var;
                                h20Var.cpQdD2nAriOS = vt1Var2;
                                h20Var.QrzZRwfaDlRX = 1;
                                Object OPXfSBeufaJ8 = oc2Var.OPXfSBeufaJ8(TSizfFm2Yiuu, i20Var, h20Var);
                                Object obj3 = su.rtx2ld2ELZv4;
                                if (OPXfSBeufaJ8 == obj3) {
                                    return obj3;
                                }
                                vt1Var = vt1Var2;
                                j = zt1Var;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt1Var = h20Var.cpQdD2nAriOS;
                    zt1 zt1Var3 = h20Var.x50lh2ztY7Y5;
                    ao1Var = h20Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj2);
                    j = zt1Var3;
                    if (vt1Var.rtx2ld2ELZv4) {
                        ao1 ao1Var2 = (ao1) j.rtx2ld2ELZv4;
                        return ao1Var2 == null ? ao1Var : ao1Var2;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            if (vt1Var.rtx2ld2ELZv4) {
            }
            return null;
        } catch (sn1 unused) {
            ao1 ao1Var3 = (ao1) j.rtx2ld2ELZv4;
            return ao1Var3 == null ? ao1Var : ao1Var3;
        }
        h20Var = new h20(ctVar);
        Object obj22 = h20Var.r3s1LDPKFs1S;
        i = h20Var.QrzZRwfaDlRX;
    }
}
