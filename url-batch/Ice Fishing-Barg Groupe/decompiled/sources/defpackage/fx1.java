package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.os.Build;
import android.view.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fx1 implements Encoder {
    public static Boolean BRwzKIf41E4i = null;
    public static final f50 PxuCJdSBwIXG;
    public static Boolean QrzZRwfaDlRX = null;
    public static final f50 RAsUl2FVSrh6;
    public static final /* synthetic */ int XL4ISE6Oc65B = 0;
    public static final f50 a92UlCVFR9N8;
    public static final float cpQdD2nAriOS = 24.0f;
    public static Boolean gPXPFXrUH4XX = null;
    public static Boolean r3s1LDPKFs1S = null;
    public static final float x50lh2ztY7Y5 = 24.0f;
    public static final int[] lS5Rgt96tfkO = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] TSizfFm2Yiuu = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] Y1f8riQaR6yg = {3, 6};
    public static final int[] e9gEMXR7LXtO = {1, 2, 4, 5, 7, 8};
    public static final SerialDescriptor[] rtx2ld2ELZv4 = new SerialDescriptor[0];
    public static final nw1 OPXfSBeufaJ8 = new nw1();
    public static final long[] wdg6QnbFHrFF = new long[0];
    public static final fb0 dgRBjINgWbAK = new fb0(17);

    static {
        int i = 1;
        PxuCJdSBwIXG = new f50("CLOSED", i);
        a92UlCVFR9N8 = new f50("NULL", i);
        RAsUl2FVSrh6 = new f50("UNINITIALIZED", i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        if (r15 == r11) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:
    
        if (r13 == r11) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016e, code lost:
    
        if (r9 == r11) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a4, code lost:
    
        if (r8 == r11) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0243, code lost:
    
        if (r4 == r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02f2, code lost:
    
        if (r9 == r11) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ed  */
    /* JADX WARN: Type inference failed for: r7v10, types: [on] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BRwzKIf41E4i(gl2 gl2Var, le0 le0Var, n61 n61Var, e60 e60Var, k70 k70Var, pe0 pe0Var, on onVar, hp hpVar, int i) {
        on onVar2;
        to toVar;
        e60 e60Var2;
        boolean a92UlCVFR9N82;
        k70 k70Var2;
        boolean a92UlCVFR9N83;
        Object nLZGh9p8gVSu;
        d91 d91Var;
        boolean rtx2ld2ELZv42;
        Object nLZGh9p8gVSu2;
        Object a92UlCVFR9N84;
        u50 u50Var;
        boolean z;
        Object nLZGh9p8gVSu3;
        Object nLZGh9p8gVSu4;
        hl2 hl2Var;
        hl2 hl2Var2;
        jx1 jx1Var;
        boolean z2;
        cl2 cl2Var;
        boolean rtx2ld2ELZv43;
        Object nLZGh9p8gVSu5;
        e60 e60Var3;
        k70 k70Var3;
        boolean RAsUl2FVSrh62;
        Object nLZGh9p8gVSu6;
        Object nLZGh9p8gVSu7;
        boolean z3;
        on onVar3;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1912839215);
        int i2 = i | (tf0Var.a92UlCVFR9N8(gl2Var) ? 4 : 2) | (tf0Var.rtx2ld2ELZv4(le0Var) ? 32 : 16) | (tf0Var.a92UlCVFR9N8(n61Var) ? 256 : 128) | (tf0Var.a92UlCVFR9N8(e60Var) ? 2048 : 1024) | (tf0Var.a92UlCVFR9N8(k70Var) ? 16384 : 8192) | (tf0Var.rtx2ld2ELZv4(pe0Var) ? 131072 : 65536) | 1572864;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (4793491 & i2) != 4793490)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            mj1 mj1Var = gl2Var.Y1f8riQaR6yg;
            to toVar2 = gl2Var.PxuCJdSBwIXG;
            if (((Boolean) le0Var.OPXfSBeufaJ8(mj1Var.getValue())).booleanValue() || ((Boolean) le0Var.OPXfSBeufaJ8(toVar2.a92UlCVFR9N8())).booleanValue() || gl2Var.RAsUl2FVSrh6() || gl2Var.Y1f8riQaR6yg()) {
                tf0Var.IXK6ba3ucyzm(-232386135);
                int i3 = i2 & 14;
                int i4 = i3 | 48;
                int i5 = i4 & 14;
                int i6 = 6;
                boolean z4 = ((i5 ^ 6) > 4 && tf0Var.a92UlCVFR9N8(gl2Var)) || (i4 & 6) == 4;
                Object nLZGh9p8gVSu8 = tf0Var.nLZGh9p8gVSu();
                jx1 jx1Var2 = fp.lS5Rgt96tfkO;
                if (!z4) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu8 = toVar2.a92UlCVFR9N8();
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu8);
                if (gl2Var.RAsUl2FVSrh6()) {
                    nLZGh9p8gVSu8 = toVar2.a92UlCVFR9N8();
                }
                tf0Var.IXK6ba3ucyzm(1844425648);
                u50 JLGWdXyAxbxj = JLGWdXyAxbxj(gl2Var, le0Var, nLZGh9p8gVSu8, tf0Var);
                tf0Var.gPXPFXrUH4XX(false);
                Object value = gl2Var.Y1f8riQaR6yg.getValue();
                tf0Var.IXK6ba3ucyzm(1844425648);
                u50 JLGWdXyAxbxj2 = JLGWdXyAxbxj(gl2Var, le0Var, value, tf0Var);
                tf0Var.gPXPFXrUH4XX(false);
                int i7 = i5 | 3072;
                int i8 = (i7 & 14) ^ 6;
                boolean z5 = (i8 > 4 && tf0Var.a92UlCVFR9N8(gl2Var)) || (i7 & 6) == 4;
                Object nLZGh9p8gVSu9 = tf0Var.nLZGh9p8gVSu();
                if (!z5) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu9 = new gl2(new e91(JLGWdXyAxbxj), gl2Var, gl2Var.TSizfFm2Yiuu.concat(" > EnterExitTransition"));
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu9);
                gl2 gl2Var2 = (gl2) nLZGh9p8gVSu9;
                boolean a92UlCVFR9N85 = ((i8 > 4 && tf0Var.a92UlCVFR9N8(gl2Var)) || (i7 & 6) == 4) | tf0Var.a92UlCVFR9N8(gl2Var2);
                Object nLZGh9p8gVSu10 = tf0Var.nLZGh9p8gVSu();
                if (!a92UlCVFR9N85) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu10 = new xf2(i6, gl2Var, gl2Var2);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu10);
                mm2.rtx2ld2ELZv4(gl2Var2, (le0) nLZGh9p8gVSu10, tf0Var);
                if (gl2Var.RAsUl2FVSrh6()) {
                    gl2Var2.dgRBjINgWbAK(JLGWdXyAxbxj, JLGWdXyAxbxj2);
                } else {
                    gl2Var2.gPXPFXrUH4XX(JLGWdXyAxbxj2);
                    gl2Var2.dgRBjINgWbAK.setValue(Boolean.FALSE);
                }
                lm2 lm2Var = z50.PxuCJdSBwIXG;
                boolean a92UlCVFR9N86 = tf0Var.a92UlCVFR9N8(gl2Var2);
                Object nLZGh9p8gVSu11 = tf0Var.nLZGh9p8gVSu();
                if (!a92UlCVFR9N86) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu11 = sj0.tmVwIGCQF4zR(e60Var);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu11);
                d91 d91Var2 = (d91) nLZGh9p8gVSu11;
                to toVar3 = gl2Var2.PxuCJdSBwIXG;
                to toVar4 = gl2Var2.PxuCJdSBwIXG;
                mj1 mj1Var2 = gl2Var2.Y1f8riQaR6yg;
                Object a92UlCVFR9N87 = toVar3.a92UlCVFR9N8();
                Object value2 = mj1Var2.getValue();
                u50 u50Var2 = u50.OPXfSBeufaJ8;
                if (a92UlCVFR9N87 == value2 && toVar4.a92UlCVFR9N8() == u50Var2) {
                    if (gl2Var2.RAsUl2FVSrh6()) {
                        d91Var2.setValue(e60Var);
                    } else {
                        e60.Companion.getClass();
                        d91Var2.setValue(e60.PxuCJdSBwIXG);
                    }
                } else if (mj1Var2.getValue() == u50Var2) {
                    e60 e60Var4 = (e60) d91Var2.getValue();
                    e60Var4.getClass();
                    m70 m70Var = ((f60) e60Var).lS5Rgt96tfkO.PxuCJdSBwIXG;
                    if (m70Var == null) {
                        m70Var = ((f60) e60Var4).lS5Rgt96tfkO.PxuCJdSBwIXG;
                    }
                    hl2 hl2Var3 = ((f60) e60Var).lS5Rgt96tfkO;
                    Map map = ((f60) e60Var4).lS5Rgt96tfkO.TSizfFm2Yiuu;
                    Map map2 = hl2Var3.TSizfFm2Yiuu;
                    map.getClass();
                    map2.getClass();
                    toVar = toVar4;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.putAll(map2);
                    d91Var2.setValue(new f60(new hl2(m70Var, (sj0) null, linkedHashMap, 32)));
                    e60Var2 = (e60) d91Var2.getValue();
                    a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(gl2Var2);
                    Object nLZGh9p8gVSu12 = tf0Var.nLZGh9p8gVSu();
                    if (!a92UlCVFR9N82) {
                        hp.Companion.getClass();
                    }
                    nLZGh9p8gVSu12 = sj0.tmVwIGCQF4zR(k70Var);
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu12);
                    d91 d91Var3 = (d91) nLZGh9p8gVSu12;
                    if (toVar.a92UlCVFR9N8() == mj1Var2.getValue() || toVar.a92UlCVFR9N8() != u50Var2) {
                        if (mj1Var2.getValue() != u50Var2) {
                            k70 k70Var4 = (k70) d91Var3.getValue();
                            k70Var4.getClass();
                            m70 m70Var2 = ((l70) k70Var).TSizfFm2Yiuu.PxuCJdSBwIXG;
                            if (m70Var2 == null) {
                                m70Var2 = ((l70) k70Var4).TSizfFm2Yiuu.PxuCJdSBwIXG;
                            }
                            hl2 hl2Var4 = ((l70) k70Var).TSizfFm2Yiuu;
                            hl2 hl2Var5 = ((l70) k70Var4).TSizfFm2Yiuu;
                            boolean z6 = hl2Var4.lS5Rgt96tfkO || hl2Var5.lS5Rgt96tfkO;
                            Map map3 = hl2Var5.TSizfFm2Yiuu;
                            Map map4 = hl2Var4.TSizfFm2Yiuu;
                            map3.getClass();
                            map4.getClass();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                            linkedHashMap2.putAll(map4);
                            d91Var3.setValue(new l70(new hl2(m70Var2, (sj0) null, z6, linkedHashMap2)));
                        }
                    } else if (gl2Var2.RAsUl2FVSrh6()) {
                        d91Var3.setValue(k70Var);
                    } else {
                        k70.Companion.getClass();
                        d91Var3.setValue(k70.PxuCJdSBwIXG);
                    }
                    k70Var2 = (k70) d91Var3.getValue();
                    d91 Pf0ThKz3j5YS = sj0.Pf0ThKz3j5YS(pe0Var, tf0Var);
                    Object rtx2ld2ELZv44 = pe0Var.rtx2ld2ELZv4(toVar.a92UlCVFR9N8(), mj1Var2.getValue());
                    a92UlCVFR9N83 = tf0Var.a92UlCVFR9N8(gl2Var2) | tf0Var.a92UlCVFR9N8(Pf0ThKz3j5YS);
                    Object nLZGh9p8gVSu13 = tf0Var.nLZGh9p8gVSu();
                    cl2 cl2Var2 = null;
                    if (!a92UlCVFR9N83) {
                        hp.Companion.getClass();
                    }
                    nLZGh9p8gVSu13 = new rtx2ld2ELZv4(gl2Var2, Pf0ThKz3j5YS, false ? 1 : 0, 1);
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu13);
                    pe0 pe0Var2 = (pe0) nLZGh9p8gVSu13;
                    nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                    hp.Companion.getClass();
                    if (nLZGh9p8gVSu == jx1Var2) {
                        nLZGh9p8gVSu = sj0.tmVwIGCQF4zR(rtx2ld2ELZv44);
                        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                    }
                    d91Var = (d91) nLZGh9p8gVSu;
                    rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(pe0Var2);
                    nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                    if (!rtx2ld2ELZv42 || nLZGh9p8gVSu2 == jx1Var2) {
                        nLZGh9p8gVSu2 = new a82(pe0Var2, d91Var, false ? 1 : 0, 0);
                        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                    }
                    mm2.wdg6QnbFHrFF(tf0Var, (pe0) nLZGh9p8gVSu2, no2.PxuCJdSBwIXG);
                    a92UlCVFR9N84 = toVar.a92UlCVFR9N8();
                    u50Var = u50.wdg6QnbFHrFF;
                    if (a92UlCVFR9N84 != u50Var && mj1Var2.getValue() == u50Var && ((Boolean) d91Var.getValue()).booleanValue()) {
                        tf0Var.IXK6ba3ucyzm(-229368781);
                        z3 = false;
                        tf0Var.gPXPFXrUH4XX(false);
                        onVar3 = onVar;
                    } else {
                        tf0Var.IXK6ba3ucyzm(-230699766);
                        z = i3 != 4;
                        nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                        if (!z || nLZGh9p8gVSu3 == jx1Var2) {
                            nLZGh9p8gVSu3 = new d8();
                            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
                        }
                        d8 d8Var = (d8) nLZGh9p8gVSu3;
                        nLZGh9p8gVSu4 = tf0Var.nLZGh9p8gVSu();
                        if (nLZGh9p8gVSu4 == jx1Var2) {
                            nLZGh9p8gVSu4 = dq.QrzZRwfaDlRX;
                            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu4);
                        }
                        ae0 ae0Var = (ae0) nLZGh9p8gVSu4;
                        tf0Var.IXK6ba3ucyzm(-167964673);
                        tf0Var.gPXPFXrUH4XX(false);
                        tf0Var.IXK6ba3ucyzm(-167961890);
                        tf0Var.gPXPFXrUH4XX(false);
                        hl2 hl2Var6 = ((f60) e60Var2).lS5Rgt96tfkO;
                        hl2 hl2Var7 = ((l70) k70Var2).TSizfFm2Yiuu;
                        hl2Var = ((f60) e60Var2).lS5Rgt96tfkO;
                        tf0Var.IXK6ba3ucyzm(-911382324);
                        tf0Var.gPXPFXrUH4XX(false);
                        tf0Var.IXK6ba3ucyzm(-911179709);
                        tf0Var.gPXPFXrUH4XX(false);
                        tf0Var.IXK6ba3ucyzm(-910935677);
                        tf0Var.gPXPFXrUH4XX(false);
                        float[] fArr = wl.PxuCJdSBwIXG;
                        tf0Var.IXK6ba3ucyzm(-910130296);
                        tf0Var.gPXPFXrUH4XX(false);
                        k61 k61Var = n61.Companion;
                        hl2Var2 = ((l70) k70Var2).TSizfFm2Yiuu;
                        lm2 lm2Var2 = b51.QrzZRwfaDlRX;
                        if (hl2Var.PxuCJdSBwIXG == null || hl2Var2.PxuCJdSBwIXG != null) {
                            jx1Var = jx1Var2;
                            z2 = false;
                            tf0Var.IXK6ba3ucyzm(-703709976);
                            tf0Var.gPXPFXrUH4XX(false);
                            cl2Var = null;
                        } else {
                            tf0Var.IXK6ba3ucyzm(-703879421);
                            Object nLZGh9p8gVSu14 = tf0Var.nLZGh9p8gVSu();
                            if (nLZGh9p8gVSu14 == jx1Var2) {
                                nLZGh9p8gVSu14 = "Built-in alpha";
                                tf0Var.JTxCbbCwomzt("Built-in alpha");
                            }
                            jx1Var = jx1Var2;
                            cl2Var = bs0.r3s1LDPKFs1S(gl2Var2, lm2Var2, (String) nLZGh9p8gVSu14, tf0Var, 384, 0);
                            z2 = false;
                            tf0Var.gPXPFXrUH4XX(false);
                        }
                        tf0Var.IXK6ba3ucyzm(-703472888);
                        tf0Var.gPXPFXrUH4XX(z2);
                        tf0Var.IXK6ba3ucyzm(-703222904);
                        tf0Var.gPXPFXrUH4XX(z2);
                        rtx2ld2ELZv43 = tf0Var.rtx2ld2ELZv4(cl2Var) | tf0Var.a92UlCVFR9N8(e60Var2) | tf0Var.a92UlCVFR9N8(k70Var2) | tf0Var.rtx2ld2ELZv4(null) | tf0Var.a92UlCVFR9N8(gl2Var2) | tf0Var.rtx2ld2ELZv4(null);
                        nLZGh9p8gVSu5 = tf0Var.nLZGh9p8gVSu();
                        if (!rtx2ld2ELZv43 || nLZGh9p8gVSu5 == jx1Var) {
                            e60Var3 = e60Var2;
                            nLZGh9p8gVSu5 = new w50(cl2Var, cl2Var2, gl2Var2, e60Var3, k70Var2, false ? 1 : 0);
                            k70Var3 = k70Var2;
                            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu5);
                        } else {
                            e60Var3 = e60Var2;
                            k70Var3 = k70Var2;
                        }
                        w50 w50Var = (w50) nLZGh9p8gVSu5;
                        RAsUl2FVSrh62 = tf0Var.RAsUl2FVSrh6(true) | tf0Var.a92UlCVFR9N8(ae0Var);
                        nLZGh9p8gVSu6 = tf0Var.nLZGh9p8gVSu();
                        if (!RAsUl2FVSrh62 || nLZGh9p8gVSu6 == jx1Var) {
                            nLZGh9p8gVSu6 = new y50(ae0Var, true);
                            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu6);
                        }
                        n61 TSizfFm2Yiuu2 = zv.pnx5pC0XzaCw(k61Var, (le0) nLZGh9p8gVSu6).TSizfFm2Yiuu(new v50(gl2Var2, e60Var3, k70Var3, ae0Var, w50Var)).TSizfFm2Yiuu(k61Var);
                        tf0Var.IXK6ba3ucyzm(-7404393);
                        tf0Var.gPXPFXrUH4XX(false);
                        n61 TSizfFm2Yiuu3 = n61Var.TSizfFm2Yiuu(TSizfFm2Yiuu2.TSizfFm2Yiuu(k61Var));
                        nLZGh9p8gVSu7 = tf0Var.nLZGh9p8gVSu();
                        if (nLZGh9p8gVSu7 == jx1Var) {
                            nLZGh9p8gVSu7 = new z7(d8Var);
                            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu7);
                        }
                        z7 z7Var = (z7) nLZGh9p8gVSu7;
                        int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
                        il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
                        n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu3);
                        yo.Companion.getClass();
                        dq dqVar = xo.lS5Rgt96tfkO;
                        tf0Var.ngxnMNrpiKat();
                        if (tf0Var.zf8DYfih6EZu) {
                            tf0Var.hVNtCUZb4tYH();
                        } else {
                            tf0Var.dgRBjINgWbAK(dqVar);
                        }
                        th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, z7Var);
                        th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
                        Integer valueOf = Integer.valueOf(hashCode);
                        p7 p7Var = xo.RAsUl2FVSrh6;
                        if (tf0Var.zf8DYfih6EZu) {
                            tf0Var.lS5Rgt96tfkO(p7Var, valueOf);
                        }
                        th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
                        th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
                        ?? r7 = onVar;
                        r7.a92UlCVFR9N8(d8Var, tf0Var, 48);
                        tf0Var.gPXPFXrUH4XX(true);
                        z3 = false;
                        tf0Var.gPXPFXrUH4XX(false);
                        onVar3 = r7;
                    }
                    tf0Var.gPXPFXrUH4XX(z3);
                    onVar2 = onVar3;
                }
                toVar = toVar4;
                e60Var2 = (e60) d91Var2.getValue();
                a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(gl2Var2);
                Object nLZGh9p8gVSu122 = tf0Var.nLZGh9p8gVSu();
                if (!a92UlCVFR9N82) {
                }
                nLZGh9p8gVSu122 = sj0.tmVwIGCQF4zR(k70Var);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu122);
                d91 d91Var32 = (d91) nLZGh9p8gVSu122;
                if (toVar.a92UlCVFR9N8() == mj1Var2.getValue()) {
                }
                if (mj1Var2.getValue() != u50Var2) {
                }
                k70Var2 = (k70) d91Var32.getValue();
                d91 Pf0ThKz3j5YS2 = sj0.Pf0ThKz3j5YS(pe0Var, tf0Var);
                Object rtx2ld2ELZv442 = pe0Var.rtx2ld2ELZv4(toVar.a92UlCVFR9N8(), mj1Var2.getValue());
                a92UlCVFR9N83 = tf0Var.a92UlCVFR9N8(gl2Var2) | tf0Var.a92UlCVFR9N8(Pf0ThKz3j5YS2);
                Object nLZGh9p8gVSu132 = tf0Var.nLZGh9p8gVSu();
                cl2 cl2Var22 = null;
                if (!a92UlCVFR9N83) {
                }
                nLZGh9p8gVSu132 = new rtx2ld2ELZv4(gl2Var2, Pf0ThKz3j5YS2, false ? 1 : 0, 1);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu132);
                pe0 pe0Var22 = (pe0) nLZGh9p8gVSu132;
                nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                hp.Companion.getClass();
                if (nLZGh9p8gVSu == jx1Var2) {
                }
                d91Var = (d91) nLZGh9p8gVSu;
                rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(pe0Var22);
                nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                if (!rtx2ld2ELZv42) {
                }
                nLZGh9p8gVSu2 = new a82(pe0Var22, d91Var, false ? 1 : 0, 0);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                mm2.wdg6QnbFHrFF(tf0Var, (pe0) nLZGh9p8gVSu2, no2.PxuCJdSBwIXG);
                a92UlCVFR9N84 = toVar.a92UlCVFR9N8();
                u50Var = u50.wdg6QnbFHrFF;
                if (a92UlCVFR9N84 != u50Var) {
                }
                tf0Var.IXK6ba3ucyzm(-230699766);
                if (i3 != 4) {
                }
                nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                if (!z) {
                }
                nLZGh9p8gVSu3 = new d8();
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
                d8 d8Var2 = (d8) nLZGh9p8gVSu3;
                nLZGh9p8gVSu4 = tf0Var.nLZGh9p8gVSu();
                if (nLZGh9p8gVSu4 == jx1Var2) {
                }
                ae0 ae0Var2 = (ae0) nLZGh9p8gVSu4;
                tf0Var.IXK6ba3ucyzm(-167964673);
                tf0Var.gPXPFXrUH4XX(false);
                tf0Var.IXK6ba3ucyzm(-167961890);
                tf0Var.gPXPFXrUH4XX(false);
                hl2 hl2Var62 = ((f60) e60Var2).lS5Rgt96tfkO;
                hl2 hl2Var72 = ((l70) k70Var2).TSizfFm2Yiuu;
                hl2Var = ((f60) e60Var2).lS5Rgt96tfkO;
                tf0Var.IXK6ba3ucyzm(-911382324);
                tf0Var.gPXPFXrUH4XX(false);
                tf0Var.IXK6ba3ucyzm(-911179709);
                tf0Var.gPXPFXrUH4XX(false);
                tf0Var.IXK6ba3ucyzm(-910935677);
                tf0Var.gPXPFXrUH4XX(false);
                float[] fArr2 = wl.PxuCJdSBwIXG;
                tf0Var.IXK6ba3ucyzm(-910130296);
                tf0Var.gPXPFXrUH4XX(false);
                k61 k61Var2 = n61.Companion;
                hl2Var2 = ((l70) k70Var2).TSizfFm2Yiuu;
                lm2 lm2Var22 = b51.QrzZRwfaDlRX;
                if (hl2Var.PxuCJdSBwIXG == null || hl2Var2.PxuCJdSBwIXG != null) {
                }
                tf0Var.IXK6ba3ucyzm(-703472888);
                tf0Var.gPXPFXrUH4XX(z2);
                tf0Var.IXK6ba3ucyzm(-703222904);
                tf0Var.gPXPFXrUH4XX(z2);
                rtx2ld2ELZv43 = tf0Var.rtx2ld2ELZv4(cl2Var) | tf0Var.a92UlCVFR9N8(e60Var2) | tf0Var.a92UlCVFR9N8(k70Var2) | tf0Var.rtx2ld2ELZv4(null) | tf0Var.a92UlCVFR9N8(gl2Var2) | tf0Var.rtx2ld2ELZv4(null);
                nLZGh9p8gVSu5 = tf0Var.nLZGh9p8gVSu();
                if (rtx2ld2ELZv43) {
                }
                e60Var3 = e60Var2;
                nLZGh9p8gVSu5 = new w50(cl2Var, cl2Var22, gl2Var2, e60Var3, k70Var2, false ? 1 : 0);
                k70Var3 = k70Var2;
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu5);
                w50 w50Var2 = (w50) nLZGh9p8gVSu5;
                RAsUl2FVSrh62 = tf0Var.RAsUl2FVSrh6(true) | tf0Var.a92UlCVFR9N8(ae0Var2);
                nLZGh9p8gVSu6 = tf0Var.nLZGh9p8gVSu();
                if (!RAsUl2FVSrh62) {
                }
                nLZGh9p8gVSu6 = new y50(ae0Var2, true);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu6);
                n61 TSizfFm2Yiuu22 = zv.pnx5pC0XzaCw(k61Var2, (le0) nLZGh9p8gVSu6).TSizfFm2Yiuu(new v50(gl2Var2, e60Var3, k70Var3, ae0Var2, w50Var2)).TSizfFm2Yiuu(k61Var2);
                tf0Var.IXK6ba3ucyzm(-7404393);
                tf0Var.gPXPFXrUH4XX(false);
                n61 TSizfFm2Yiuu32 = n61Var.TSizfFm2Yiuu(TSizfFm2Yiuu22.TSizfFm2Yiuu(k61Var2));
                nLZGh9p8gVSu7 = tf0Var.nLZGh9p8gVSu();
                if (nLZGh9p8gVSu7 == jx1Var) {
                }
                z7 z7Var2 = (z7) nLZGh9p8gVSu7;
                int hashCode2 = Long.hashCode(tf0Var.wLFCmsViZrNT);
                il1 x50lh2ztY7Y522 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu32);
                yo.Companion.getClass();
                dq dqVar2 = xo.lS5Rgt96tfkO;
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                }
                th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, z7Var2);
                th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y522);
                Integer valueOf2 = Integer.valueOf(hashCode2);
                p7 p7Var2 = xo.RAsUl2FVSrh6;
                if (tf0Var.zf8DYfih6EZu) {
                }
                th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
                th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj2);
                ?? r72 = onVar;
                r72.a92UlCVFR9N8(d8Var2, tf0Var, 48);
                tf0Var.gPXPFXrUH4XX(true);
                z3 = false;
                tf0Var.gPXPFXrUH4XX(false);
                onVar3 = r72;
                tf0Var.gPXPFXrUH4XX(z3);
                onVar2 = onVar3;
            } else {
                tf0Var.IXK6ba3ucyzm(-229362829);
                tf0Var.gPXPFXrUH4XX(false);
                onVar2 = onVar;
            }
        } else {
            onVar2 = onVar;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new a8(gl2Var, le0Var, n61Var, e60Var, k70Var, pe0Var, onVar2, i);
        }
    }

    public static z11 BjEWd04qc7Mw() {
        return new z11(10);
    }

    public static List D0aTLcX6Uhyo(Object... objArr) {
        if (objArr.length <= 0) {
            return p50.rtx2ld2ELZv4;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int EcgxDIVH5in8(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i3 - i2 <= i : i2 > i) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return i - i2;
            }
        }
        return i;
    }

    public static void GlTbNTgfSMqy() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void HGgCfDnf0ga9(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final String HqMwxkFaipxD(String str, int i) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    public static n61 IAToe7bXGz4N(n61 n61Var, e81 e81Var, uw1 uw1Var, boolean z, ae0 ae0Var) {
        n61 VhhvGxCb8gfr;
        if (uw1Var != null) {
            VhhvGxCb8gfr = new ik(e81Var, uw1Var, false, z, null, ae0Var);
        } else if (uw1Var == null) {
            VhhvGxCb8gfr = new ik(e81Var, null, false, z, null, ae0Var);
        } else if (e81Var != null) {
            k61 k61Var = n61.Companion;
            fq fqVar = vn0.PxuCJdSBwIXG;
            wn0 wn0Var = new wn0(e81Var, uw1Var);
            k61Var.getClass();
            VhhvGxCb8gfr = wn0Var.TSizfFm2Yiuu(new ik(e81Var, null, false, z, null, ae0Var));
        } else {
            VhhvGxCb8gfr = ov2.VhhvGxCb8gfr(n61.Companion, new jk(uw1Var, z, ae0Var));
        }
        return n61Var.TSizfFm2Yiuu(VhhvGxCb8gfr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void IXK6ba3ucyzm(i30 i30Var) {
        if (((m61) i30Var).rtx2ld2ELZv4.S9EYkSpbGuxq) {
            zv.POWyO8hTM6YC(i30Var, 1).c();
        }
    }

    public static final Object IxJ9cAW40yOk(hu huVar, Object obj, Object obj2, pe0 pe0Var, bt btVar) {
        Object rtx2ld2ELZv42;
        Object JHNfcAUfKc4G = hq0.JHNfcAUfKc4G(huVar, obj2);
        try {
            x82 x82Var = new x82(btVar, huVar);
            if (pe0Var == null) {
                rtx2ld2ELZv42 = ng0.amuv7NJvPxHu(pe0Var, obj, x82Var);
            } else {
                mm2.S9EYkSpbGuxq(2, pe0Var);
                rtx2ld2ELZv42 = pe0Var.rtx2ld2ELZv4(obj, x82Var);
            }
            hq0.Pf0ThKz3j5YS(huVar, JHNfcAUfKc4G);
            if (rtx2ld2ELZv42 == su.rtx2ld2ELZv4) {
                btVar.getClass();
            }
            return rtx2ld2ELZv42;
        } catch (Throwable th) {
            hq0.Pf0ThKz3j5YS(huVar, JHNfcAUfKc4G);
            throw th;
        }
    }

    public static final n61 J54yh1s3n4Aq(n61 n61Var, le0 le0Var) {
        return n61Var.TSizfFm2Yiuu(new o30(le0Var));
    }

    public static final boolean JHNfcAUfKc4G(KeyEvent keyEvent) {
        long XL4ISE6Oc65B2 = jh0.XL4ISE6Oc65B(keyEvent);
        nu0 nu0Var = ou0.Companion;
        nu0Var.getClass();
        if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B2, ou0.rtx2ld2ELZv4)) {
            return true;
        }
        nu0Var.getClass();
        if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B2, ou0.XL4ISE6Oc65B)) {
            return true;
        }
        nu0Var.getClass();
        if (ou0.PxuCJdSBwIXG(XL4ISE6Oc65B2, ou0.rZjpSjn4zoMv)) {
            return true;
        }
        nu0Var.getClass();
        return ou0.PxuCJdSBwIXG(XL4ISE6Oc65B2, ou0.BRwzKIf41E4i);
    }

    public static final u50 JLGWdXyAxbxj(gl2 gl2Var, le0 le0Var, Object obj, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.getClass();
        hi0.Companion.getClass();
        tf0Var.zf8DYfih6EZu(-422486745, 0, gl2Var, null);
        boolean RAsUl2FVSrh62 = gl2Var.RAsUl2FVSrh6();
        to toVar = gl2Var.PxuCJdSBwIXG;
        u50 u50Var = u50.rtx2ld2ELZv4;
        u50 u50Var2 = u50.wdg6QnbFHrFF;
        u50 u50Var3 = u50.OPXfSBeufaJ8;
        if (RAsUl2FVSrh62) {
            tf0Var.IXK6ba3ucyzm(-212166497);
            tf0Var.gPXPFXrUH4XX(false);
            if (((Boolean) le0Var.OPXfSBeufaJ8(obj)).booleanValue()) {
                u50Var = u50Var3;
            } else if (((Boolean) le0Var.OPXfSBeufaJ8(toVar.a92UlCVFR9N8())).booleanValue()) {
                u50Var = u50Var2;
            }
        } else {
            tf0Var.IXK6ba3ucyzm(-211892364);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
                nLZGh9p8gVSu = sj0.tmVwIGCQF4zR(Boolean.FALSE);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            d91 d91Var = (d91) nLZGh9p8gVSu;
            if (((Boolean) le0Var.OPXfSBeufaJ8(toVar.a92UlCVFR9N8())).booleanValue()) {
                d91Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) le0Var.OPXfSBeufaJ8(obj)).booleanValue()) {
                u50Var = u50Var3;
            } else if (((Boolean) d91Var.getValue()).booleanValue()) {
                u50Var = u50Var2;
            }
            tf0Var.gPXPFXrUH4XX(false);
        }
        tf0Var.gPXPFXrUH4XX(false);
        return u50Var;
    }

    public static final String JTxCbbCwomzt(eu0 eu0Var) {
        String TSizfFm2Yiuu2 = ((ck) eu0Var).TSizfFm2Yiuu();
        if (TSizfFm2Yiuu2 == null) {
            TSizfFm2Yiuu2 = "<local class name not available>";
        }
        return o0.x50lh2ztY7Y5("Serializer for class '", TSizfFm2Yiuu2, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static /* synthetic */ z82 KUoIVIumpKat(ru ruVar, hu huVar, pe0 pe0Var, int i) {
        if ((i & 1) != 0) {
            huVar = n50.rtx2ld2ELZv4;
        }
        return yQRudnv4La6p(ruVar, huVar, (i & 2) != 0 ? uu.rtx2ld2ELZv4 : uu.dgRBjINgWbAK, pe0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] Nlhe969cAGO8(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static final Object OYiFbU3x63rc(hu huVar, pe0 pe0Var, bt btVar) {
        hu e9gEMXR7LXtO2 = btVar.e9gEMXR7LXtO();
        hu RfyTYNmI9Srp = !((Boolean) huVar.IAToe7bXGz4N(new jm(6, (byte) 0), Boolean.FALSE)).booleanValue() ? e9gEMXR7LXtO2.RfyTYNmI9Srp(huVar) : zv.RfyTYNmI9Srp(e9gEMXR7LXtO2, huVar, false);
        ki0.ZbWwgt3aGe7A(RfyTYNmI9Srp);
        if (RfyTYNmI9Srp == e9gEMXR7LXtO2) {
            f02 f02Var = new f02(btVar, RfyTYNmI9Srp);
            return sj0.i68hK7ahKtgp(f02Var, f02Var, pe0Var);
        }
        ih0 ih0Var = ih0.x50lh2ztY7Y5;
        if (cs0.wdg6QnbFHrFF(RfyTYNmI9Srp.S2OOm9zPNm0h(ih0Var), e9gEMXR7LXtO2.S2OOm9zPNm0h(ih0Var))) {
            ko2 ko2Var = new ko2(btVar, RfyTYNmI9Srp);
            hu huVar2 = ko2Var.x50lh2ztY7Y5;
            Object JHNfcAUfKc4G = hq0.JHNfcAUfKc4G(huVar2, null);
            try {
                return sj0.i68hK7ahKtgp(ko2Var, ko2Var, pe0Var);
            } finally {
                hq0.Pf0ThKz3j5YS(huVar2, JHNfcAUfKc4G);
            }
        }
        f00 f00Var = new f00(btVar, RfyTYNmI9Srp);
        try {
            bs0.rZjpSjn4zoMv(ng0.IAToe7bXGz4N(ng0.QrzZRwfaDlRX(f00Var, f00Var, pe0Var)), no2.PxuCJdSBwIXG);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f00.r3s1LDPKFs1S;
            do {
                int i = atomicIntegerFieldUpdater.get(f00Var);
                if (i != 0) {
                    if (i != 2) {
                        u9.rtx2ld2ELZv4("Already suspended");
                        return null;
                    }
                    Object gGoUzNp9JO5I = f2.gGoUzNp9JO5I(f00Var.i68hK7ahKtgp());
                    if (gGoUzNp9JO5I instanceof sm) {
                        throw ((sm) gGoUzNp9JO5I).PxuCJdSBwIXG;
                    }
                    return gGoUzNp9JO5I;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(f00Var, 0, 1));
            return su.rtx2ld2ELZv4;
        } catch (Throwable th) {
            f00Var.RAsUl2FVSrh6(new uv1(th));
            throw th;
        }
    }

    public static final Object POWyO8hTM6YC(a22 a22Var, long j, pe0 pe0Var) {
        while (true) {
            if (a22Var.e9gEMXR7LXtO >= j && !a22Var.RAsUl2FVSrh6()) {
                return a22Var;
            }
            Object e9gEMXR7LXtO2 = a22Var.e9gEMXR7LXtO();
            f50 f50Var = PxuCJdSBwIXG;
            if (e9gEMXR7LXtO2 == f50Var) {
                return f50Var;
            }
            a22 a22Var2 = (a22) ((jq) e9gEMXR7LXtO2);
            if (a22Var2 == null) {
                a22Var2 = (a22) pe0Var.rtx2ld2ELZv4(Long.valueOf(a22Var.e9gEMXR7LXtO + 1), a22Var);
                if (a22Var.wdg6QnbFHrFF(a22Var2)) {
                    if (a22Var.RAsUl2FVSrh6()) {
                        a22Var.OPXfSBeufaJ8();
                    }
                }
            }
            a22Var = a22Var2;
        }
    }

    public static ArrayList PsecLrZVVK61(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new aa(objArr, true));
    }

    public static final void RfyTYNmI9Srp(twy4zb2fCtqq twy4zb2fctqq, d32 d32Var) {
        z22 z22Var = d32Var.Y1f8riQaR6yg;
        v81 v81Var = z22Var.rtx2ld2ELZv4;
        Object RAsUl2FVSrh62 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.IAToe7bXGz4N);
        if (RAsUl2FVSrh62 == null) {
            RAsUl2FVSrh62 = null;
        }
        ww1 ww1Var = (ww1) RAsUl2FVSrh62;
        if (mm2.gPXPFXrUH4XX(d32Var)) {
            ww1.Companion.getClass();
            if (ww1Var != null && ww1Var.PxuCJdSBwIXG == 8) {
                return;
            }
            Object RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(y22.pnx5pC0XzaCw);
            if (RAsUl2FVSrh63 == null) {
                RAsUl2FVSrh63 = null;
            }
            nxJAScVArhE9 nxjascvarhe9 = (nxJAScVArhE9) RAsUl2FVSrh63;
            if (nxjascvarhe9 != null) {
                twy4zb2fctqq.PxuCJdSBwIXG(new cJeY36nTk9tz(null, R.id.accessibilityActionPageUp, nxjascvarhe9.PxuCJdSBwIXG, null));
            }
            Object RAsUl2FVSrh64 = v81Var.RAsUl2FVSrh6(y22.e6tOsSdd2EFb);
            if (RAsUl2FVSrh64 == null) {
                RAsUl2FVSrh64 = null;
            }
            nxJAScVArhE9 nxjascvarhe92 = (nxJAScVArhE9) RAsUl2FVSrh64;
            if (nxjascvarhe92 != null) {
                twy4zb2fctqq.PxuCJdSBwIXG(new cJeY36nTk9tz(null, R.id.accessibilityActionPageDown, nxjascvarhe92.PxuCJdSBwIXG, null));
            }
            Object RAsUl2FVSrh65 = v81Var.RAsUl2FVSrh6(y22.IAToe7bXGz4N);
            if (RAsUl2FVSrh65 == null) {
                RAsUl2FVSrh65 = null;
            }
            nxJAScVArhE9 nxjascvarhe93 = (nxJAScVArhE9) RAsUl2FVSrh65;
            if (nxjascvarhe93 != null) {
                twy4zb2fctqq.PxuCJdSBwIXG(new cJeY36nTk9tz(null, R.id.accessibilityActionPageLeft, nxjascvarhe93.PxuCJdSBwIXG, null));
            }
            Object RAsUl2FVSrh66 = v81Var.RAsUl2FVSrh6(y22.jyegZNwi31qc);
            if (RAsUl2FVSrh66 == null) {
                RAsUl2FVSrh66 = null;
            }
            nxJAScVArhE9 nxjascvarhe94 = (nxJAScVArhE9) RAsUl2FVSrh66;
            if (nxjascvarhe94 != null) {
                twy4zb2fctqq.PxuCJdSBwIXG(new cJeY36nTk9tz(null, R.id.accessibilityActionPageRight, nxjascvarhe94.PxuCJdSBwIXG, null));
            }
        }
    }

    public static int S2OOm9zPNm0h(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            rc1.Y1f8riQaR6yg(size, size2, ") is greater than size (", "toIndex (");
            return 0;
        }
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int QrzZRwfaDlRX2 = zv.QrzZRwfaDlRX((Comparable) arrayList.get(i3), comparable);
            if (QrzZRwfaDlRX2 < 0) {
                i = i3 + 1;
            } else {
                if (QrzZRwfaDlRX2 <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    public static ArrayList S9EYkSpbGuxq(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new aa(objArr, true));
    }

    public static nx VhhvGxCb8gfr(ru ruVar, pe0 pe0Var) {
        nx nxVar = new nx(zv.nLZGh9p8gVSu(ruVar, n50.rtx2ld2ELZv4), true);
        nxVar.uURZJOrwXbxn(uu.rtx2ld2ELZv4, nxVar, pe0Var);
        return nxVar;
    }

    public static final List VzNxmvWisHL1(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : jJwa0q7P5wHq(list.get(0)) : p50.rtx2ld2ELZv4;
    }

    public static j8 XL4ISE6Oc65B(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new j8(b51.QrzZRwfaDlRX, Float.valueOf(0.0f), new k8(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static z11 ZbWwgt3aGe7A(z11 z11Var) {
        z11Var.a92UlCVFR9N8();
        z11Var.wdg6QnbFHrFF = true;
        return z11Var.OPXfSBeufaJ8 > 0 ? z11Var : z11.dgRBjINgWbAK;
    }

    public static byte[] aF05bpZJlKEP(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static boolean bEKsvqmvPh2y(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (r3s1LDPKFs1S == null) {
            r3s1LDPKFs1S = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        r3s1LDPKFs1S.booleanValue();
        if (QrzZRwfaDlRX == null) {
            QrzZRwfaDlRX = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!QrzZRwfaDlRX.booleanValue()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return i < 26 || i >= 30;
    }

    public static long e4HgwifUDUCA(InputStream inputStream, int i) {
        byte[] v6yxfmkxNKhL = v6yxfmkxNKhL(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (v6yxfmkxNKhL[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static n61 e6tOsSdd2EFb(int i, ae0 ae0Var, n61 n61Var, String str, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return n61Var.TSizfFm2Yiuu(new ik(null, null, true, z2, str, ae0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fRTaYY6FBZcX(bt btVar, le0 le0Var, ex1 ex1Var, boolean z, boolean z2) {
        lv lvVar;
        int i;
        boolean z3;
        le0 le0Var2;
        ex1 ex1Var2;
        boolean z4;
        if (btVar instanceof lv) {
            lvVar = (lv) btVar;
            int i2 = lvVar.gPXPFXrUH4XX;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lvVar.gPXPFXrUH4XX = i2 - Integer.MIN_VALUE;
                lv lvVar2 = lvVar;
                Object obj = lvVar2.QrzZRwfaDlRX;
                i = lvVar2.gPXPFXrUH4XX;
                su suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    if (ex1Var.RAsUl2FVSrh6() && ex1Var.OPXfSBeufaJ8() && ex1Var.rtx2ld2ELZv4()) {
                        mv mvVar = new mv(null, le0Var, ex1Var, z2, z);
                        lvVar2.gPXPFXrUH4XX = 1;
                        Object wdg6QnbFHrFF2 = ex1Var.wdg6QnbFHrFF(z, mvVar, lvVar2);
                        if (wdg6QnbFHrFF2 != suVar) {
                            return wdg6QnbFHrFF2;
                        }
                    } else {
                        z3 = z2;
                        lvVar2.dgRBjINgWbAK = ex1Var;
                        lvVar2.x50lh2ztY7Y5 = le0Var;
                        lvVar2.cpQdD2nAriOS = z;
                        lvVar2.r3s1LDPKFs1S = z3;
                        lvVar2.gPXPFXrUH4XX = 2;
                        hu wLFCmsViZrNT = wLFCmsViZrNT(ex1Var, z3, lvVar2);
                        if (wLFCmsViZrNT != suVar) {
                            le0Var2 = le0Var;
                            ex1Var2 = ex1Var;
                            obj = wLFCmsViZrNT;
                            z4 = z;
                        }
                    }
                }
                if (i == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        ng0.tmVwIGCQF4zR(obj);
                        return obj;
                    }
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = lvVar2.r3s1LDPKFs1S;
                boolean z5 = lvVar2.cpQdD2nAriOS;
                le0 le0Var3 = lvVar2.x50lh2ztY7Y5;
                ex1 ex1Var3 = lvVar2.dgRBjINgWbAK;
                ng0.tmVwIGCQF4zR(obj);
                z4 = z5;
                le0Var2 = le0Var3;
                ex1Var2 = ex1Var3;
                kv kvVar = new kv(null, le0Var2, ex1Var2, z4, z3);
                lvVar2.dgRBjINgWbAK = null;
                lvVar2.x50lh2ztY7Y5 = null;
                lvVar2.gPXPFXrUH4XX = 3;
                Object OYiFbU3x63rc = OYiFbU3x63rc((hu) obj, kvVar, lvVar2);
                return OYiFbU3x63rc != suVar ? suVar : OYiFbU3x63rc;
            }
        }
        lvVar = new lv(btVar);
        lv lvVar22 = lvVar;
        Object obj2 = lvVar22.QrzZRwfaDlRX;
        i = lvVar22.gPXPFXrUH4XX;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        kv kvVar2 = new kv(null, le0Var2, ex1Var2, z4, z3);
        lvVar22.dgRBjINgWbAK = null;
        lvVar22.x50lh2ztY7Y5 = null;
        lvVar22.gPXPFXrUH4XX = 3;
        Object OYiFbU3x63rc2 = OYiFbU3x63rc((hu) obj2, kvVar2, lvVar22);
        if (OYiFbU3x63rc2 != suVar2) {
        }
    }

    public static final op0 hVNtCUZb4tYH(String str, String str2) {
        return new op0(17, str2 + " when parsing an Instant from \"" + HqMwxkFaipxD(str, 64) + '\"', str);
    }

    public static final n61 hnJvRxDXo0hm(k61 k61Var, vg2 vg2Var) {
        se2 se2Var = new se2(vg2Var);
        k61Var.getClass();
        return se2Var;
    }

    public static final n61 i68hK7ahKtgp(n61 n61Var, va0 va0Var) {
        return n61Var.TSizfFm2Yiuu(new wa0(va0Var));
    }

    public static final void iSxsmagYqzHM(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static List jJwa0q7P5wHq(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static final SerialDescriptor[] jyegZNwi31qc(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? rtx2ld2ELZv4 : serialDescriptorArr;
    }

    public static j8 kpCQ9veP6n3I(j8 j8Var, float f) {
        float f2 = ((k8) j8Var.wdg6QnbFHrFF).PxuCJdSBwIXG;
        return new j8(j8Var.rtx2ld2ELZv4, Float.valueOf(f), new k8(f2), j8Var.dgRBjINgWbAK, j8Var.x50lh2ztY7Y5, j8Var.cpQdD2nAriOS);
    }

    public static void mFd1aGiJX24N() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final eu0 ngxnMNrpiKat(ju0 ju0Var) {
        eu0 lS5Rgt96tfkO2 = ((mu0) ju0Var).lS5Rgt96tfkO();
        if (lS5Rgt96tfkO2 instanceof eu0) {
            return lS5Rgt96tfkO2;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + lS5Rgt96tfkO2);
    }

    public static final sk nxJAScVArhE9(dr2 dr2Var) {
        sk skVar;
        dr2Var.getClass();
        synchronized (dgRBjINgWbAK) {
            skVar = (sk) dr2Var.TSizfFm2Yiuu("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (skVar == null) {
                hu huVar = n50.rtx2ld2ELZv4;
                try {
                    yw ywVar = j00.PxuCJdSBwIXG;
                    huVar = h41.PxuCJdSBwIXG.cpQdD2nAriOS;
                } catch (ce1 | IllegalStateException unused) {
                }
                sk skVar2 = new sk(huVar.RfyTYNmI9Srp(new mb2(null)));
                dr2Var.PxuCJdSBwIXG("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", skVar2);
                skVar = skVar2;
            }
        }
        return skVar;
    }

    public static final n61 ozEBbv0hFTAB(n61 n61Var, le0 le0Var) {
        return n61Var.TSizfFm2Yiuu(new e30(le0Var));
    }

    public static final Set pnx5pC0XzaCw(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof kh) {
            return ((kh) serialDescriptor).RAsUl2FVSrh6();
        }
        HashSet hashSet = new HashSet(serialDescriptor.Y1f8riQaR6yg());
        int Y1f8riQaR6yg2 = serialDescriptor.Y1f8riQaR6yg();
        for (int i = 0; i < Y1f8riQaR6yg2; i++) {
            hashSet.add(serialDescriptor.e9gEMXR7LXtO(i));
        }
        return hashSet;
    }

    public static final n61 qudtW7lwm99e(n61 n61Var, qe0 qe0Var) {
        return n61Var.TSizfFm2Yiuu(new dw0(qe0Var));
    }

    public static final ca0 rZjpSjn4zoMv(ex1 ex1Var, String[] strArr, le0 le0Var) {
        vi1 vi1Var;
        ns0 Y1f8riQaR6yg2 = ex1Var.Y1f8riQaR6yg();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        gm2 gm2Var = Y1f8riQaR6yg2.lS5Rgt96tfkO;
        gm2Var.getClass();
        n42 n42Var = new n42();
        int i = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = gm2Var.TSizfFm2Yiuu;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                n42Var.addAll(set);
            } else {
                n42Var.add(str);
            }
        }
        String[] strArr3 = (String[]) ng0.a92UlCVFR9N8(n42Var).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i >= length) {
                vi1Var = new vi1(strArr3, iArr);
                break;
            }
            String str2 = strArr3[i];
            LinkedHashMap linkedHashMap2 = gm2Var.a92UlCVFR9N8;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                u9.XL4ISE6Oc65B("There is no table with name ".concat(str2));
                vi1Var = null;
                break;
            }
            iArr[i] = num.intValue();
            i++;
        }
        String[] strArr4 = (String[]) vi1Var.rtx2ld2ELZv4;
        int[] iArr2 = (int[]) vi1Var.OPXfSBeufaJ8;
        strArr4.getClass();
        iArr2.getClass();
        return new ca0(hq0.QrzZRwfaDlRX(new ny1(new e4(gm2Var, iArr2, strArr4, null, 14)), -1), ex1Var, le0Var);
    }

    public static final op0 rxipThha848g(String str, String str2, int i, le0 le0Var) {
        char charAt = str.charAt(i);
        if (((Boolean) le0Var.OPXfSBeufaJ8(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return hVNtCUZb4tYH(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i);
    }

    public static final n61 tmVwIGCQF4zR(n61 n61Var, le0 le0Var) {
        return n61Var.TSizfFm2Yiuu(new n30(le0Var));
    }

    public static final boolean twy4zb2fCtqq(Throwable th, ae0 ae0Var) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = vs0.PxuCJdSBwIXG;
        hz hzVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        } else {
            Method method = nm1.lS5Rgt96tfkO;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = p50.rtx2ld2ELZv4;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            }
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) asList.get(i)) instanceof hz) {
                return false;
            }
        }
        try {
            so soVar = (so) ae0Var.PxuCJdSBwIXG();
            if (soVar != null) {
                boolean z2 = soVar.lS5Rgt96tfkO;
                List list = soVar.PxuCJdSBwIXG;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((uo) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                soVar.getClass();
                hzVar = new hz(soVar);
            }
        } catch (Throwable th2) {
            hzVar = th2;
        }
        if (hzVar != null) {
            f2.RAsUl2FVSrh6(th, hzVar);
        }
        return z;
    }

    public static final Object uURZJOrwXbxn(hu huVar, pe0 pe0Var) {
        t60 t60Var;
        hu RfyTYNmI9Srp;
        Thread currentThread = Thread.currentThread();
        gu guVar = ih0.x50lh2ztY7Y5;
        ju juVar = (ju) huVar.S2OOm9zPNm0h(guVar);
        n50 n50Var = n50.rtx2ld2ELZv4;
        if (juVar == null) {
            t60Var = nj2.PxuCJdSBwIXG();
            RfyTYNmI9Srp = zv.RfyTYNmI9Srp(n50Var, huVar.RfyTYNmI9Srp(t60Var), true);
            yw ywVar = j00.PxuCJdSBwIXG;
            if (RfyTYNmI9Srp != ywVar && RfyTYNmI9Srp.S2OOm9zPNm0h(guVar) == null) {
                RfyTYNmI9Srp = RfyTYNmI9Srp.RfyTYNmI9Srp(ywVar);
            }
        } else {
            t60Var = (t60) nj2.PxuCJdSBwIXG.get();
            RfyTYNmI9Srp = zv.RfyTYNmI9Srp(n50Var, huVar, true);
            yw ywVar2 = j00.PxuCJdSBwIXG;
            if (RfyTYNmI9Srp != ywVar2 && RfyTYNmI9Srp.S2OOm9zPNm0h(guVar) == null) {
                RfyTYNmI9Srp = RfyTYNmI9Srp.RfyTYNmI9Srp(ywVar2);
            }
        }
        wd wdVar = new wd(RfyTYNmI9Srp, currentThread, t60Var);
        wdVar.uURZJOrwXbxn(uu.rtx2ld2ELZv4, wdVar, pe0Var);
        t60 t60Var2 = wdVar.r3s1LDPKFs1S;
        if (t60Var2 != null) {
            int i = t60.cpQdD2nAriOS;
            t60Var2.xbgXKYA2cIfu(false);
        }
        while (!Thread.interrupted()) {
            try {
                long nxJAScVArhE9 = t60Var2 != null ? t60Var2.nxJAScVArhE9() : Long.MAX_VALUE;
                if (!(wdVar.i68hK7ahKtgp() instanceof pn0)) {
                    if (t60Var2 != null) {
                        int i2 = t60.cpQdD2nAriOS;
                        t60Var2.zf8DYfih6EZu(false);
                    }
                    Object gGoUzNp9JO5I = f2.gGoUzNp9JO5I(wdVar.i68hK7ahKtgp());
                    sm smVar = gGoUzNp9JO5I instanceof sm ? (sm) gGoUzNp9JO5I : null;
                    if (smVar == null) {
                        return gGoUzNp9JO5I;
                    }
                    throw smVar.PxuCJdSBwIXG;
                }
                LockSupport.parkNanos(wdVar, nxJAScVArhE9);
            } catch (Throwable th) {
                if (t60Var2 != null) {
                    int i3 = t60.cpQdD2nAriOS;
                    t60Var2.zf8DYfih6EZu(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        wdVar.VhhvGxCb8gfr(interruptedException);
        throw interruptedException;
    }

    public static final int uVlwi32qvXeJ(String str, int i) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static final void uy1Qfkdvj4xZ(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static byte[] v6yxfmkxNKhL(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                u9.rtx2ld2ELZv4(o0.wdg6QnbFHrFF("Not enough bytes to read: ", i));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public static final hu wLFCmsViZrNT(ex1 ex1Var, boolean z, ct ctVar) {
        qk2 qk2Var = (qk2) ctVar.e9gEMXR7LXtO().S2OOm9zPNm0h(qk2.OPXfSBeufaJ8);
        hu huVar = qk2Var != null ? qk2Var.rtx2ld2ELZv4 : null;
        if (!ex1Var.RAsUl2FVSrh6()) {
            at atVar = ex1Var.PxuCJdSBwIXG;
            if (atVar == null) {
                cs0.tmVwIGCQF4zR("coroutineScope");
                throw null;
            }
            hu huVar2 = atVar.rtx2ld2ELZv4;
            if (huVar == null) {
                huVar = n50.rtx2ld2ELZv4;
            }
            return huVar2.RfyTYNmI9Srp(huVar);
        }
        if (huVar != null) {
            at atVar2 = ex1Var.PxuCJdSBwIXG;
            if (atVar2 != null) {
                return atVar2.rtx2ld2ELZv4.RfyTYNmI9Srp(huVar);
            }
            cs0.tmVwIGCQF4zR("coroutineScope");
            throw null;
        }
        if (z) {
            hu huVar3 = ex1Var.lS5Rgt96tfkO;
            if (huVar3 != null) {
                return huVar3;
            }
            cs0.tmVwIGCQF4zR("transactionContext");
            throw null;
        }
        at atVar3 = ex1Var.PxuCJdSBwIXG;
        if (atVar3 != null) {
            return atVar3.rtx2ld2ELZv4;
        }
        cs0.tmVwIGCQF4zR("coroutineScope");
        throw null;
    }

    public static void wnqUPcAvl7HT(ByteArrayOutputStream byteArrayOutputStream, int i) {
        HGgCfDnf0ga9(byteArrayOutputStream, i, 2);
    }

    public static int xbgXKYA2cIfu(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final z82 yQRudnv4La6p(ru ruVar, hu huVar, uu uuVar, pe0 pe0Var) {
        hu nLZGh9p8gVSu = zv.nLZGh9p8gVSu(ruVar, huVar);
        uuVar.getClass();
        z82 oz0Var = uuVar == uu.OPXfSBeufaJ8 ? new oz0(nLZGh9p8gVSu, pe0Var) : new z82(nLZGh9p8gVSu, true);
        oz0Var.uURZJOrwXbxn(uuVar, oz0Var, pe0Var);
        return oz0Var;
    }

    public static final void zf8DYfih6EZu(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    public abstract void EpkonXwzFgDB(SerialDescriptor serialDescriptor, int i);

    @Override // kotlinx.serialization.encoding.Encoder
    public void OPXfSBeufaJ8(int i) {
        Pf0ThKz3j5YS(Integer.valueOf(i));
    }

    public void Pf0ThKz3j5YS(Object obj) {
        obj.getClass();
        throw new i42("Non-serializable " + bu1.PxuCJdSBwIXG(obj.getClass()) + " is not supported by " + bu1.PxuCJdSBwIXG(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void QrzZRwfaDlRX(char c) {
        Pf0ThKz3j5YS(Character.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void RAsUl2FVSrh6(boolean z) {
        Pf0ThKz3j5YS(Boolean.valueOf(z));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void Y1f8riQaR6yg(double d) {
        Pf0ThKz3j5YS(Double.valueOf(d));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void a92UlCVFR9N8(byte b) {
        Pf0ThKz3j5YS(Byte.valueOf(b));
    }

    public void amuv7NJvPxHu(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        EpkonXwzFgDB(serialDescriptor, i);
        gPXPFXrUH4XX(str);
    }

    public boolean cJeY36nTk9tz(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e9gEMXR7LXtO(short s) {
        Pf0ThKz3j5YS(Short.valueOf(s));
    }

    public void gGoUzNp9JO5I(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void gPXPFXrUH4XX(String str) {
        str.getClass();
        Pf0ThKz3j5YS(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public fx1 lS5Rgt96tfkO(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    public void nLZGh9p8gVSu(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        EpkonXwzFgDB(serialDescriptor, i);
        OPXfSBeufaJ8(i2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void r3s1LDPKFs1S(long j) {
        Pf0ThKz3j5YS(Long.valueOf(j));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void rtx2ld2ELZv4(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        Pf0ThKz3j5YS(Integer.valueOf(i));
    }

    public void ryVscX7ZL4Ux(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        EpkonXwzFgDB(serialDescriptor, i);
        dgRBjINgWbAK(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract Encoder wdg6QnbFHrFF(SerialDescriptor serialDescriptor);

    @Override // kotlinx.serialization.encoding.Encoder
    public void x50lh2ztY7Y5(float f) {
        Pf0ThKz3j5YS(Float.valueOf(f));
    }

    public Encoder xfACYKDMU6Dj(aq1 aq1Var, int i) {
        aq1Var.getClass();
        EpkonXwzFgDB(aq1Var, i);
        return wdg6QnbFHrFF(aq1Var.wdg6QnbFHrFF(i));
    }
}
