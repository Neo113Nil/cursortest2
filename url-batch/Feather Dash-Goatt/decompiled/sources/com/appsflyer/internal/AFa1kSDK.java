package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class AFa1kSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventType;
    private static int afDebugLog;
    private static long afErrorLog;
    private static int afInfoLog;
    private static int afLogForce;
    private static byte[] d;
    private static Object e;
    private static long force;
    public static final Map i;
    private static byte[] unregisterClient;
    private static long v;
    private static Object w;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0035 -> B:4:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, byte b, byte b2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = b2 + 1;
        int i6 = 119 - b;
        int i7 = i2 + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            $12 = ($13 + 65) % 128;
            int i8 = i6;
            i4 = 0;
            int i9 = i7;
            int i10 = i9 + 1;
            i6 = (i7 + (-i8)) - 1;
            i7 = i10;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                String str = new String(bArr2, 0);
                int i11 = $12 + 71;
                $13 = i11 % 128;
                if (i11 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            i8 = bArr[i7];
            int i12 = i6;
            i9 = i7;
            i7 = i12;
            int i102 = i9 + 1;
            i6 = (i7 + (-i8)) - 1;
            i7 = i102;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:15|(40:956|957|958|959|960|(0)(0)|952|949|(0)|30|31|32|(0)|34|(0)|55|(0)|68|69|70|71|72|73|74|(0)(0)|77|(0)|909|(0)|81|82|83|(0)(0)|86|(0)(0)|89|90|(0)|903|904)|17|18|(0)(0)|952|949|(0)|30|31|32|(0)|34|(0)|55|(0)|68|69|70|71|72|73|74|(0)(0)|77|(0)|909|(0)|81|82|83|(0)(0)|86|(0)(0)|89|90|(0)|903|904) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x053f, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(194, r9[r30], r9[r31])).getMethod($$c(281, r9[r23], r9[15]), null).invoke(r0, null)).booleanValue() != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01ee, code lost:
    
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x16cf, code lost:
    
        r4 = r64;
        r0 = r61.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
        com.appsflyer.internal.AFa1kSDK.w = r0.newInstance(r2, java.lang.Boolean.valueOf(!r41));
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x16f5, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x16f8, code lost:
    
        r5 = r58;
        r2 = r66;
        r6 = 1;
        r11 = false;
        r21 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x1706, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x1707, code lost:
    
        r2 = r66;
        r15 = r15;
        r53 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x04ab, code lost:
    
        if ((r12 % 2) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x04cf, code lost:
    
        r5 = r25 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x04d2, code lost:
    
        r34 = 6;
        r36 = 159;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x1562  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x16cf A[EDGE_INSN: B:324:0x16cf->B:325:0x16cf BREAK  A[LOOP:1: B:155:0x0af6->B:293:0x1688], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x1931 A[Catch: Exception -> 0x19e5, TryCatch #11 {Exception -> 0x19e5, blocks: (B:8:0x013f, B:10:0x0154, B:36:0x035b, B:44:0x19cb, B:46:0x19d1, B:48:0x19d2, B:51:0x19d4, B:53:0x19da, B:54:0x19db, B:58:0x03c1, B:64:0x0401, B:66:0x0407, B:67:0x0408, B:68:0x0409, B:70:0x0454, B:73:0x0461, B:83:0x04b6, B:86:0x04c1, B:89:0x04cc, B:94:0x04e0, B:334:0x18d6, B:336:0x1931, B:340:0x1935, B:330:0x19b0, B:338:0x1941, B:345:0x1954, B:352:0x198c, B:354:0x1992, B:355:0x1993, B:923:0x030a, B:928:0x0310, B:934:0x19dd, B:936:0x19e3, B:937:0x19e4, B:348:0x1963, B:349:0x198a, B:41:0x039e, B:38:0x0367, B:931:0x033a, B:61:0x03d1), top: B:7:0x013f, inners: #38, #80, #85, #87, #99 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x035b A[Catch: Exception -> 0x19e5, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x19e5, blocks: (B:8:0x013f, B:10:0x0154, B:36:0x035b, B:44:0x19cb, B:46:0x19d1, B:48:0x19d2, B:51:0x19d4, B:53:0x19da, B:54:0x19db, B:58:0x03c1, B:64:0x0401, B:66:0x0407, B:67:0x0408, B:68:0x0409, B:70:0x0454, B:73:0x0461, B:83:0x04b6, B:86:0x04c1, B:89:0x04cc, B:94:0x04e0, B:334:0x18d6, B:336:0x1931, B:340:0x1935, B:330:0x19b0, B:338:0x1941, B:345:0x1954, B:352:0x198c, B:354:0x1992, B:355:0x1993, B:923:0x030a, B:928:0x0310, B:934:0x19dd, B:936:0x19e3, B:937:0x19e4, B:348:0x1963, B:349:0x198a, B:41:0x039e, B:38:0x0367, B:931:0x033a, B:61:0x03d1), top: B:7:0x013f, inners: #38, #80, #85, #87, #99 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:881:0x0557 A[Catch: all -> 0x0558, TryCatch #24 {all -> 0x0558, blocks: (B:117:0x0571, B:125:0x05d0, B:127:0x05d6, B:128:0x05d7, B:879:0x0551, B:881:0x0557, B:882:0x056a, B:120:0x05ac, B:121:0x05ce), top: B:102:0x0502, inners: #84 }] */
    /* JADX WARN: Removed duplicated region for block: B:882:0x056a A[Catch: all -> 0x0558, TryCatch #24 {all -> 0x0558, blocks: (B:117:0x0571, B:125:0x05d0, B:127:0x05d6, B:128:0x05d7, B:879:0x0551, B:881:0x0557, B:882:0x056a, B:120:0x05ac, B:121:0x05ce), top: B:102:0x0502, inners: #84 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:900:0x1994  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:907:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:912:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:918:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:938:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:955:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:956:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04e4  */
    /* JADX WARN: Type inference failed for: r0v190, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v85, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r25v30 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v109 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v110 */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v112 */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v120 */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v123 */
    /* JADX WARN: Type inference failed for: r2v124 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v79, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r53v24 */
    /* JADX WARN: Type inference failed for: r53v25 */
    /* JADX WARN: Type inference failed for: r53v28 */
    /* JADX WARN: Type inference failed for: r53v29 */
    /* JADX WARN: Type inference failed for: r53v30 */
    /* JADX WARN: Type inference failed for: r53v31 */
    /* JADX WARN: Type inference failed for: r53v32 */
    /* JADX WARN: Type inference failed for: r53v37 */
    /* JADX WARN: Type inference failed for: r53v48 */
    /* JADX WARN: Type inference failed for: r53v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r53v50 */
    /* JADX WARN: Type inference failed for: r53v51 */
    /* JADX WARN: Type inference failed for: r53v54 */
    /* JADX WARN: Type inference failed for: r53v55 */
    /* JADX WARN: Type inference failed for: r53v56, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r53v58 */
    /* JADX WARN: Type inference failed for: r53v60 */
    /* JADX WARN: Type inference failed for: r53v61 */
    /* JADX WARN: Type inference failed for: r53v62 */
    /* JADX WARN: Type inference failed for: r53v63 */
    /* JADX WARN: Type inference failed for: r53v71 */
    /* JADX WARN: Type inference failed for: r5v295, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    static {
        String $$c;
        char c;
        char c2;
        boolean z;
        String str;
        Object obj;
        Class<?> cls;
        byte[] bArr;
        char c3;
        Object invoke;
        char c4;
        char c5;
        char c6;
        Object obj2;
        char c7;
        Class<?> cls2;
        int i2;
        short s;
        Object invoke2;
        char c8;
        char c9;
        int i3;
        int i4;
        int i5;
        boolean z2;
        ?? r4;
        byte[] bArr2;
        Class cls3;
        int i6;
        int i7;
        String str2;
        boolean[] zArr;
        boolean[] zArr2;
        int i8;
        Object[] objArr;
        boolean[] zArr3;
        boolean z3;
        boolean[] zArr4;
        int i9;
        Class cls4;
        Class cls5;
        boolean[] zArr5;
        Class cls6;
        Class cls7;
        int i10;
        boolean z4;
        Object obj3;
        boolean z5;
        boolean[] zArr6;
        boolean[] zArr7;
        Random random;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        int i11;
        int i12;
        int i13;
        Object obj14;
        Throwable th;
        ZipFile zipFile;
        boolean[] zArr8;
        byte[] bArr3;
        Object newInstance;
        Class cls8;
        int i14;
        ZipFile zipFile2;
        boolean[] zArr9;
        Class cls9;
        ZipFile zipFile3;
        Object obj15;
        char c10;
        Class cls10;
        Class cls11;
        String str3;
        boolean[] zArr10;
        boolean[] zArr11;
        Object invoke3;
        Class cls12;
        boolean[] zArr12;
        Class cls13;
        boolean[] zArr13;
        Class cls14;
        ZipFile zipFile4;
        Throwable th2;
        boolean z6;
        Object obj16;
        Method method;
        Throwable cause;
        int i15;
        boolean z7;
        init$0();
        int i16 = $11;
        $10 = ((i16 ^ 97) + ((i16 & 97) << 1)) % 128;
        try {
            byte[] bArr4 = $$a;
            Class<?> cls15 = Class.forName($$c(bArr4[112], bArr4[287], bArr4[282]));
            String $$c2 = $$c(bArr4[282], bArr4[8], bArr4[7]);
            Class cls16 = Integer.TYPE;
            int intValue = ((Integer) cls15.getMethod($$c2, cls16, cls16, cls16).invoke(null, 38, 40, 106)).intValue();
            boolean[] zArr14 = 0;
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i17 = ((-202706953) | (~currentTimeMillis)) * (-490);
            int i18 = (((~((currentTimeMillis & (-1818194153)) | ((-1818194153) ^ currentTimeMillis))) | 1615487200) * 490) + ((-293994192) ^ i17) + ((i17 & (-293994192)) << 1);
            int i19 = ((i18 | 762112198) << 1) - (i18 ^ 762112198);
            int i20 = ((-2023572438) ^ intValue) | ((-2023572438) & intValue);
            int i21 = (i20 ^ 291186941) | (i20 & 291186941);
            int i22 = i21 * (-627);
            int i23 = 3;
            int i24 = 1;
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i25 = i21 * 593769;
            int i26 = -(-(i19 * 949));
            int i27 = (i25 & i26) + (i25 | i26);
            int i28 = ~i22;
            int i29 = ~i19;
            int i30 = -(-(((~((i29 ^ currentTimeMillis2) | (i29 & currentTimeMillis2))) | i28) * (-948)));
            int i31 = (i27 & i30) + (i27 | i30);
            int i32 = ~i19;
            int i33 = i28 | i32;
            int i34 = ~currentTimeMillis2;
            int i35 = (((~((2023572437 & intValue) | (2023572437 ^ intValue))) | (-291186942)) * (-627)) + (((i22 & i32) | (i22 ^ i32)) * 948) + ((~((i33 & i34) | (i33 ^ i34))) * (-948)) + i31;
            int i36 = ~((~intValue) | (-2023572438));
            int i37 = ~(intValue | (-291186942));
            int i38 = ((i37 & i36) | (i36 ^ i37)) * 627;
            if ((i35 ^ i38) + ((i38 & i35) << 1) == 0) {
                return;
            }
            force = -694760234487655886L;
            afLogForce = -6;
            AFInAppEventType = new HashMap();
            i = new HashMap();
            try {
                $$c = $$c(bArr4[324], bArr4[200], bArr4[175]);
                if (w == null) {
                    byte b = bArr4[230];
                    int currentTimeMillis3 = (int) System.currentTimeMillis();
                    int i39 = b * (-903);
                    int i40 = ((-905) ^ i39) + (((-905) & i39) << 1);
                    int i41 = ~currentTimeMillis3;
                    c = 324;
                    int i42 = ~currentTimeMillis3;
                    int i43 = (i41 | (~((i42 ^ b) | (i42 & b)))) * (-1808);
                    int i44 = ((i40 | i43) << 1) - (i40 ^ i43);
                    int i45 = ~b;
                    z = false;
                    int i46 = ~((i45 ^ currentTimeMillis3) | (i45 & currentTimeMillis3));
                    c2 = 200;
                    int i47 = ~currentTimeMillis3;
                    int i48 = ~((i47 ^ (-1)) | i47 | b);
                    int i49 = -(-(((i46 ^ i48) | (i46 & i48)) * 904));
                    int i50 = ~b;
                    int i51 = ~(currentTimeMillis3 | i45);
                    str = $$c((short) ((((i50 & i51) | (i50 ^ i51)) * 904) + (i44 ^ i49) + ((i44 & i49) << 1)), bArr4[200], bArr4[34]);
                } else {
                    c = 324;
                    c2 = 200;
                    z = false;
                    str = null;
                }
                try {
                    obj = Class.forName($$c(bArr4[367], bArr4[287], (byte) (-bArr4[205]))).getMethod($$c(92, bArr4[c2], bArr4[602]), null).invoke(null, null);
                } catch (Exception unused) {
                    obj = null;
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            if (obj != null) {
                try {
                    cls = obj.getClass();
                    bArr = $$a;
                    c3 = '\r';
                } catch (Exception unused2) {
                    c3 = '\r';
                    invoke = null;
                    c4 = c3;
                    if (obj != null) {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        try {
                            Class<?> cls17 = obj.getClass();
                            short s2 = (short) ($$b & 1008);
                            byte[] bArr5 = $$a;
                            c5 = 25;
                            try {
                                c6 = '+';
                            } catch (Exception unused3) {
                                c6 = '+';
                                obj2 = null;
                                c7 = c5;
                                if (obj != null) {
                                    try {
                                        cls2 = obj.getClass();
                                        int i52 = $$b;
                                        int currentTimeMillis4 = (int) System.currentTimeMillis();
                                        int i53 = 329 - (~(-(-(i52 * (-163)))));
                                        i2 = 2;
                                        int i54 = ~currentTimeMillis4;
                                        int i55 = ~((i54 ^ i52) | (i54 & i52));
                                        int i56 = (((i55 ^ 2) | (i55 & 2)) * (-328)) + i53;
                                        int i57 = ((currentTimeMillis4 ^ 2) | (currentTimeMillis4 & 2)) * 164;
                                        int i58 = (i56 & i57) + (i56 | i57);
                                        int i59 = ~i52;
                                        int i60 = ~(((-3) ^ i59) | (i59 & (-3)));
                                        int i61 = ~i52;
                                        int i62 = ~((i61 ^ currentTimeMillis4) | (i61 & currentTimeMillis4));
                                        int i63 = (i60 ^ i62) | (i60 & i62);
                                        int i64 = ~currentTimeMillis4;
                                        int i65 = (i64 & 2) | (i64 ^ 2);
                                        int i66 = ~((i52 & i65) | (i65 ^ i52));
                                        int i67 = ((i63 & i66) | (i63 ^ i66)) * 164;
                                        s = (short) ((i58 ^ i67) + ((i58 & i67) << 1));
                                    } catch (Exception unused4) {
                                        i2 = 2;
                                        invoke2 = null;
                                        if (invoke == null) {
                                            if (str != null) {
                                                StringBuilder sb = new StringBuilder();
                                                c8 = 219;
                                                c9 = 356;
                                                sb.append($$c(184, (byte) (-$$a[727]), r11[c7]));
                                                sb.append(str);
                                                String sb2 = sb.toString();
                                                System.currentTimeMillis();
                                                System.currentTimeMillis();
                                                try {
                                                    invoke = Class.forName($$c(194, r11[356], r11[219])).getDeclaredConstructor(String.class).newInstance(sb2);
                                                    if (invoke2 == null) {
                                                        byte b2 = $$a[c9];
                                                        try {
                                                            Object invoke4 = Class.forName($$c(218, r0[c9], r0[608])).getMethod($$c(233, r0[c4], r0[c7]), String.class).invoke(null, $$c(205, b2, b2));
                                                            $10 = ($11 + 73) % 128;
                                                            try {
                                                                invoke2 = Class.forName($$c(194, r0[c9], r0[c8])).getDeclaredConstructor(String.class).newInstance(invoke4);
                                                            } catch (Throwable th3) {
                                                                Throwable cause2 = th3.getCause();
                                                                if (cause2 == null) {
                                                                    throw th3;
                                                                }
                                                                throw cause2;
                                                            }
                                                        } catch (Throwable th4) {
                                                            Throwable cause3 = th4.getCause();
                                                            if (cause3 == null) {
                                                                throw th4;
                                                            }
                                                            throw cause3;
                                                        }
                                                    }
                                                    if (obj2 == null && invoke != null) {
                                                        byte[] bArr6 = $$a;
                                                        try {
                                                            Object[] objArr2 = new Object[i2];
                                                            objArr2[1] = $$c(243, bArr6[c2], bArr6[5]);
                                                            objArr2[z ? 1 : 0] = invoke;
                                                            obj2 = Class.forName($$c(194, bArr6[c9], bArr6[c8])).getDeclaredConstructor(Class.forName($$c(194, bArr6[c9], bArr6[c8])), String.class).newInstance(objArr2);
                                                        } catch (Throwable th5) {
                                                            Throwable cause4 = th5.getCause();
                                                            if (cause4 == null) {
                                                                throw th5;
                                                            }
                                                            throw cause4;
                                                        }
                                                    }
                                                    byte[] bArr7 = $$a;
                                                    Object[] objArr3 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr7[c9], bArr7[c8])), 7);
                                                    objArr3[z ? 1 : 0] = null;
                                                    objArr3[1] = obj2;
                                                    objArr3[2] = invoke;
                                                    objArr3[3] = invoke2;
                                                    objArr3[4] = obj2;
                                                    objArr3[5] = invoke;
                                                    objArr3[6] = invoke2;
                                                    boolean[] zArr15 = {false, true, true, true, true, true, true};
                                                    boolean[] zArr16 = {false, false, false, false, true, true, true};
                                                    int i68 = 4;
                                                    boolean[] zArr17 = new boolean[7];
                                                    zArr17[z ? 1 : 0] = z;
                                                    zArr17[1] = z;
                                                    zArr17[2] = true;
                                                    zArr17[3] = true;
                                                    zArr17[4] = z;
                                                    zArr17[5] = true;
                                                    zArr17[6] = true;
                                                    int i69 = $$b;
                                                    char c11 = 159;
                                                    short s3 = (short) ((i69 ^ 80) | (i69 & 80));
                                                    int i70 = 6;
                                                    Class<?> cls18 = Class.forName($$c(s3, bArr7[287], bArr7[c]));
                                                    i15 = cls18.getDeclaredField($$c(275, bArr7[90], bArr7[159])).getInt(cls18);
                                                    if (i15 < 34) {
                                                        $11 = ($10 + 81) % 128;
                                                        i3 = 1;
                                                    } else {
                                                        i3 = z ? 1 : 0;
                                                    }
                                                    if (i15 == 29) {
                                                        int i71 = $10;
                                                        int i72 = ((i71 | 61) << 1) - (i71 ^ 61);
                                                        $11 = i72 % 128;
                                                    }
                                                    if (i15 >= 26) {
                                                        z7 = true;
                                                        zArr17[z ? 1 : 0] = z7;
                                                        zArr17[1] = i15 >= 21 ? true : z ? 1 : 0;
                                                        zArr17[4] = i15 >= 21 ? true : z ? 1 : 0;
                                                        i4 = z ? 1 : 0;
                                                        i5 = i4;
                                                        bArr2 = Throwable.class;
                                                        r4 = byte[].class;
                                                        z2 = z;
                                                        while (i4 == 0 && i5 < 9) {
                                                            if (zArr17[i5]) {
                                                                cls3 = r4;
                                                                i6 = i3;
                                                                i7 = i4;
                                                                str2 = $$c;
                                                                zArr = zArr15;
                                                                zArr2 = zArr16;
                                                                i8 = i5;
                                                                objArr = objArr3;
                                                                zArr3 = zArr17;
                                                                z3 = z2 ? 1 : 0;
                                                                zArr4 = zArr14;
                                                                cls4 = bArr2;
                                                            } else {
                                                                try {
                                                                    z4 = zArr15[i5];
                                                                    obj3 = objArr3[i5];
                                                                    z5 = zArr16[i5];
                                                                    if (z4) {
                                                                        int i73 = $11;
                                                                        i7 = i73 & 51;
                                                                        i6 = i73 | 51;
                                                                        $10 = (i7 + i6) % 128;
                                                                        try {
                                                                            if (obj3 != null) {
                                                                                System.currentTimeMillis();
                                                                                System.currentTimeMillis();
                                                                                try {
                                                                                    byte[] bArr8 = $$a;
                                                                                    i6 = i3;
                                                                                    try {
                                                                                        i7 = i4;
                                                                                        try {
                                                                                            str2 = $$c;
                                                                                            try {
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                cause = th.getCause();
                                                                                                if (cause == null) {
                                                                                                    throw th;
                                                                                                }
                                                                                                throw cause;
                                                                                            }
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                            cause = th.getCause();
                                                                                            if (cause == null) {
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                        cause = th.getCause();
                                                                                        if (cause == null) {
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th9) {
                                                                                    th = th9;
                                                                                }
                                                                            } else {
                                                                                i6 = i3;
                                                                                i7 = i4;
                                                                                str2 = $$c;
                                                                            }
                                                                            StringBuilder sb3 = new StringBuilder();
                                                                            byte[] bArr9 = $$a;
                                                                            sb3.append($$c(288, bArr9[102], bArr9[9]));
                                                                            sb3.append(obj3);
                                                                            sb3.append($$c(292, bArr9[1116], bArr9[112]));
                                                                            String sb4 = sb3.toString();
                                                                            int i74 = $10;
                                                                            $11 = (((i74 | 107) << 1) - (i74 ^ 107)) % 128;
                                                                            try {
                                                                                throw ((Throwable) Class.forName($$c(292, bArr9[c9], bArr9[191])).getDeclaredConstructor(String.class).newInstance(sb4));
                                                                            } catch (Throwable th10) {
                                                                                Throwable cause5 = th10.getCause();
                                                                                if (cause5 == null) {
                                                                                    throw th10;
                                                                                }
                                                                                throw cause5;
                                                                            }
                                                                        } catch (Throwable th11) {
                                                                            th = th11;
                                                                            cls5 = r4;
                                                                            zArr = zArr15;
                                                                            zArr2 = zArr16;
                                                                            i9 = i5;
                                                                            objArr = objArr3;
                                                                            zArr3 = zArr17;
                                                                            zArr5 = zArr14;
                                                                            cls7 = bArr2;
                                                                            cls6 = cls5;
                                                                            int currentTimeMillis5 = (int) System.currentTimeMillis();
                                                                            i8 = i9;
                                                                            int i75 = ~currentTimeMillis5;
                                                                            int i76 = ((369 - (~(-(-(i8 * 370))))) - (~(-(-((((i8 ^ 1) | (i8 & 1)) | i75) * (-369)))))) - 1;
                                                                            int i77 = ~(((-2) ^ i75) | ((-2) & i75));
                                                                            int i78 = (((i77 & i8) | (i8 ^ i77)) * (-369)) + i76;
                                                                            int i79 = ~i8;
                                                                            int i80 = ~((i79 & 1) | (i79 ^ 1));
                                                                            int i81 = ~((currentTimeMillis5 ^ 1) | (currentTimeMillis5 & 1));
                                                                            int i82 = (i80 & i81) | (i80 ^ i81);
                                                                            int i83 = ~currentTimeMillis5;
                                                                            int i84 = ((-2) & i83) | ((-2) ^ i83);
                                                                            int i85 = ~((i84 & i8) | (i84 ^ i8));
                                                                            int i86 = ((i85 & i82) | (i82 ^ i85)) * 369;
                                                                            i10 = (i78 ^ i86) + ((i86 & i78) << 1);
                                                                            while (i10 < 7) {
                                                                            }
                                                                            byte[] bArr10 = $$a;
                                                                            try {
                                                                                throw ((Throwable) Class.forName($$c(292, bArr10[c9], bArr10[191])).getDeclaredConstructor(String.class, cls7).newInstance($$c(1106, bArr10[102], bArr10[287]), th));
                                                                            } catch (Throwable th12) {
                                                                                Throwable cause6 = th12.getCause();
                                                                                if (cause6 == null) {
                                                                                    throw th12;
                                                                                }
                                                                                throw cause6;
                                                                            }
                                                                        }
                                                                    }
                                                                    i6 = i3;
                                                                    i7 = i4;
                                                                    str2 = $$c;
                                                                } catch (Throwable th13) {
                                                                    th = th13;
                                                                    cls5 = r4;
                                                                    i6 = i3;
                                                                    i7 = i4;
                                                                    str2 = $$c;
                                                                }
                                                                if (z4) {
                                                                    try {
                                                                        random = new Random();
                                                                        try {
                                                                            byte[] bArr11 = $$a;
                                                                            zArr = zArr15;
                                                                            try {
                                                                                try {
                                                                                    random.setSeed(((Long) Class.forName($$c(218, bArr11[c9], bArr11[608])).getMethod($$c(310, bArr11[c2], bArr11[c4]), null).invoke(null, null)).longValue() ^ (-1617463033));
                                                                                    obj4 = null;
                                                                                    obj5 = null;
                                                                                    obj6 = null;
                                                                                    obj7 = null;
                                                                                } catch (Throwable th14) {
                                                                                    th = th14;
                                                                                    zArr6 = zArr14;
                                                                                    objArr = objArr3;
                                                                                    zArr2 = zArr16;
                                                                                    i9 = i5;
                                                                                    zArr3 = zArr17;
                                                                                    zArr7 = zArr6;
                                                                                    cls6 = r4;
                                                                                    cls7 = bArr2;
                                                                                    zArr5 = zArr7;
                                                                                    int currentTimeMillis52 = (int) System.currentTimeMillis();
                                                                                    i8 = i9;
                                                                                    int i752 = ~currentTimeMillis52;
                                                                                    int i762 = ((369 - (~(-(-(i8 * 370))))) - (~(-(-((((i8 ^ 1) | (i8 & 1)) | i752) * (-369)))))) - 1;
                                                                                    int i772 = ~(((-2) ^ i752) | ((-2) & i752));
                                                                                    int i782 = (((i772 & i8) | (i8 ^ i772)) * (-369)) + i762;
                                                                                    int i792 = ~i8;
                                                                                    int i802 = ~((i792 & 1) | (i792 ^ 1));
                                                                                    int i812 = ~((currentTimeMillis52 ^ 1) | (currentTimeMillis52 & 1));
                                                                                    int i822 = (i802 & i812) | (i802 ^ i812);
                                                                                    int i832 = ~currentTimeMillis52;
                                                                                    int i842 = ((-2) & i832) | ((-2) ^ i832);
                                                                                    int i852 = ~((i842 & i8) | (i842 ^ i8));
                                                                                    int i862 = ((i852 & i822) | (i822 ^ i852)) * 369;
                                                                                    i10 = (i782 ^ i862) + ((i862 & i782) << 1);
                                                                                    while (i10 < 7) {
                                                                                    }
                                                                                    byte[] bArr102 = $$a;
                                                                                    throw ((Throwable) Class.forName($$c(292, bArr102[c9], bArr102[191])).getDeclaredConstructor(String.class, cls7).newInstance($$c(1106, bArr102[102], bArr102[287]), th));
                                                                                }
                                                                            } catch (Throwable th15) {
                                                                                th = th15;
                                                                                Throwable cause7 = th.getCause();
                                                                                if (cause7 == null) {
                                                                                    throw th;
                                                                                }
                                                                                throw cause7;
                                                                            }
                                                                        } catch (Throwable th16) {
                                                                            th = th16;
                                                                        }
                                                                    } catch (Throwable th17) {
                                                                        th = th17;
                                                                        zArr = zArr15;
                                                                    }
                                                                    while (obj4 == null) {
                                                                        if (obj5 == null) {
                                                                            obj12 = obj4;
                                                                            obj13 = obj5;
                                                                            i11 = i70;
                                                                        } else {
                                                                            obj12 = obj4;
                                                                            obj13 = obj5;
                                                                            i11 = obj6 == null ? 5 : obj7 == null ? i68 : i23;
                                                                        }
                                                                        Object obj17 = obj6;
                                                                        Object obj18 = obj7;
                                                                        int currentTimeMillis6 = (int) System.currentTimeMillis();
                                                                        int i87 = 235 - (~(i11 * 471));
                                                                        int i88 = ~((-2) | (~currentTimeMillis6));
                                                                        int i89 = (i87 - (~(-(-(((i11 ^ i88) | (i88 & i11)) * (-235)))))) - 1;
                                                                        int i90 = ~(((-2) ^ currentTimeMillis6) | ((-2) & currentTimeMillis6));
                                                                        int i91 = -(-(((i11 ^ i90) | (i90 & i11)) * (-470)));
                                                                        int i92 = (i89 & i91) + (i91 | i89);
                                                                        int i93 = ~i11;
                                                                        int i94 = ~((i93 & 1) | (i93 ^ 1));
                                                                        int i95 = ((-2) ^ i11) | ((-2) & i11);
                                                                        int i96 = ~((i95 ^ currentTimeMillis6) | (i95 & currentTimeMillis6));
                                                                        StringBuilder sb5 = new StringBuilder((((i94 ^ i96) | (i94 & i96)) * 235) + i92);
                                                                        sb5.append('.');
                                                                        int i97 = z2 ? 1 : 0;
                                                                        while (i97 < i11) {
                                                                            if (z5) {
                                                                                int nextInt = random.nextInt(26);
                                                                                if (random.nextBoolean()) {
                                                                                    int i98 = $11;
                                                                                    i12 = i11;
                                                                                    $10 = ((i98 ^ 25) + ((i98 & 25) << 1)) % 128;
                                                                                    int i99 = -(-nextInt);
                                                                                    i13 = (i99 & 65) + (i99 | 65);
                                                                                    zArr6 = zArr14;
                                                                                    objArr = objArr3;
                                                                                } else {
                                                                                    i12 = i11;
                                                                                    boolean[] zArr18 = zArr14;
                                                                                    objArr = objArr3;
                                                                                    try {
                                                                                        int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                                                        int i100 = nextInt * (-337);
                                                                                        zArr6 = zArr18;
                                                                                        int i101 = ((i100 | 32544) << 1) - (i100 ^ 32544);
                                                                                        int i102 = ~nextInt;
                                                                                        int i103 = ~currentTimeMillis7;
                                                                                        int i104 = ~((i102 ^ i103) | (i103 & i102));
                                                                                        int i105 = ~(((-97) ^ nextInt) | ((-97) & nextInt));
                                                                                        i9 = (i104 ^ i105) | (i104 & i105);
                                                                                        int i106 = ~((nextInt ^ currentTimeMillis7) | (nextInt & currentTimeMillis7));
                                                                                        int i107 = (((i9 ^ i106) | (i9 & i106)) * (-338)) + i101;
                                                                                        int i108 = ~nextInt;
                                                                                        int i109 = ((~((i108 ^ 96) | (i108 & 96))) * 338) + i107;
                                                                                        int i110 = ~currentTimeMillis7;
                                                                                        int i111 = nextInt | 96;
                                                                                        int i112 = ((~((i102 ^ i110) | (i110 & i102))) | (~((i111 & currentTimeMillis7) | (i111 ^ currentTimeMillis7)))) * 338;
                                                                                        i13 = ((i109 | i112) << 1) - (i109 ^ i112);
                                                                                    } catch (Throwable th18) {
                                                                                        th = th18;
                                                                                        zArr6 = zArr18;
                                                                                        zArr2 = zArr16;
                                                                                        i9 = i5;
                                                                                        zArr3 = zArr17;
                                                                                        zArr7 = zArr6;
                                                                                        cls6 = r4;
                                                                                        cls7 = bArr2;
                                                                                        zArr5 = zArr7;
                                                                                        int currentTimeMillis522 = (int) System.currentTimeMillis();
                                                                                        i8 = i9;
                                                                                        int i7522 = ~currentTimeMillis522;
                                                                                        int i7622 = ((369 - (~(-(-(i8 * 370))))) - (~(-(-((((i8 ^ 1) | (i8 & 1)) | i7522) * (-369)))))) - 1;
                                                                                        int i7722 = ~(((-2) ^ i7522) | ((-2) & i7522));
                                                                                        int i7822 = (((i7722 & i8) | (i8 ^ i7722)) * (-369)) + i7622;
                                                                                        int i7922 = ~i8;
                                                                                        int i8022 = ~((i7922 & 1) | (i7922 ^ 1));
                                                                                        int i8122 = ~((currentTimeMillis522 ^ 1) | (currentTimeMillis522 & 1));
                                                                                        int i8222 = (i8022 & i8122) | (i8022 ^ i8122);
                                                                                        int i8322 = ~currentTimeMillis522;
                                                                                        int i8422 = ((-2) & i8322) | ((-2) ^ i8322);
                                                                                        int i8522 = ~((i8422 & i8) | (i8422 ^ i8));
                                                                                        int i8622 = ((i8522 & i8222) | (i8222 ^ i8522)) * 369;
                                                                                        i10 = (i7822 ^ i8622) + ((i8622 & i7822) << 1);
                                                                                        while (i10 < 7) {
                                                                                        }
                                                                                        byte[] bArr1022 = $$a;
                                                                                        throw ((Throwable) Class.forName($$c(292, bArr1022[c9], bArr1022[191])).getDeclaredConstructor(String.class, cls7).newInstance($$c(1106, bArr1022[102], bArr1022[287]), th));
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    sb5.append((char) i13);
                                                                                } catch (Throwable th19) {
                                                                                    th = th19;
                                                                                    zArr2 = zArr16;
                                                                                    i9 = i5;
                                                                                    zArr3 = zArr17;
                                                                                    zArr7 = zArr6;
                                                                                    cls6 = r4;
                                                                                    cls7 = bArr2;
                                                                                    zArr5 = zArr7;
                                                                                    int currentTimeMillis5222 = (int) System.currentTimeMillis();
                                                                                    i8 = i9;
                                                                                    int i75222 = ~currentTimeMillis5222;
                                                                                    int i76222 = ((369 - (~(-(-(i8 * 370))))) - (~(-(-((((i8 ^ 1) | (i8 & 1)) | i75222) * (-369)))))) - 1;
                                                                                    int i77222 = ~(((-2) ^ i75222) | ((-2) & i75222));
                                                                                    int i78222 = (((i77222 & i8) | (i8 ^ i77222)) * (-369)) + i76222;
                                                                                    int i79222 = ~i8;
                                                                                    int i80222 = ~((i79222 & 1) | (i79222 ^ 1));
                                                                                    int i81222 = ~((currentTimeMillis5222 ^ 1) | (currentTimeMillis5222 & 1));
                                                                                    int i82222 = (i80222 & i81222) | (i80222 ^ i81222);
                                                                                    int i83222 = ~currentTimeMillis5222;
                                                                                    int i84222 = ((-2) & i83222) | ((-2) ^ i83222);
                                                                                    int i85222 = ~((i84222 & i8) | (i84222 ^ i8));
                                                                                    int i86222 = ((i85222 & i82222) | (i82222 ^ i85222)) * 369;
                                                                                    i10 = (i78222 ^ i86222) + ((i86222 & i78222) << 1);
                                                                                    while (i10 < 7) {
                                                                                    }
                                                                                    byte[] bArr10222 = $$a;
                                                                                    throw ((Throwable) Class.forName($$c(292, bArr10222[c9], bArr10222[191])).getDeclaredConstructor(String.class, cls7).newInstance($$c(1106, bArr10222[102], bArr10222[287]), th));
                                                                                }
                                                                            } else {
                                                                                i12 = i11;
                                                                                zArr6 = zArr14;
                                                                                objArr = objArr3;
                                                                                int nextInt2 = random.nextInt(12);
                                                                                sb5.append((char) ((nextInt2 ^ 8192) + ((nextInt2 & 8192) << 1)));
                                                                            }
                                                                            i97++;
                                                                            objArr3 = objArr;
                                                                            zArr14 = zArr6;
                                                                            i11 = i12;
                                                                        }
                                                                        zArr6 = zArr14;
                                                                        objArr = objArr3;
                                                                        String sb6 = sb5.toString();
                                                                        if (obj13 != null) {
                                                                            if (obj17 == null) {
                                                                                int i113 = $10;
                                                                                $11 = (((i113 | 11) << 1) - (i113 ^ 11)) % 128;
                                                                                try {
                                                                                    Object[] objArr4 = new Object[2];
                                                                                    objArr4[i24] = sb6;
                                                                                    objArr4[z2 ? 1 : 0] = obj3;
                                                                                    byte[] bArr12 = $$a;
                                                                                    obj6 = Class.forName($$c(194, bArr12[c9], bArr12[c8])).getDeclaredConstructor(Class.forName($$c(194, bArr12[c9], bArr12[c8])), String.class).newInstance(objArr4);
                                                                                    obj4 = obj12;
                                                                                    obj5 = obj13;
                                                                                    obj7 = obj18;
                                                                                    objArr3 = objArr;
                                                                                    zArr14 = zArr6;
                                                                                } catch (Throwable th20) {
                                                                                    Throwable cause8 = th20.getCause();
                                                                                    if (cause8 == null) {
                                                                                        throw th20;
                                                                                    }
                                                                                    throw cause8;
                                                                                }
                                                                            } else if (obj18 == null) {
                                                                                try {
                                                                                    Object[] objArr5 = new Object[2];
                                                                                    objArr5[i24] = sb6;
                                                                                    objArr5[z2 ? 1 : 0] = obj3;
                                                                                    byte[] bArr13 = $$a;
                                                                                    obj7 = Class.forName($$c(194, bArr13[c9], bArr13[c8])).getDeclaredConstructor(Class.forName($$c(194, bArr13[c9], bArr13[c8])), String.class).newInstance(objArr5);
                                                                                    obj4 = obj12;
                                                                                    obj5 = obj13;
                                                                                    obj6 = obj17;
                                                                                    objArr3 = objArr;
                                                                                    zArr14 = zArr6;
                                                                                } catch (Throwable th21) {
                                                                                    Throwable cause9 = th21.getCause();
                                                                                    if (cause9 == null) {
                                                                                        throw th21;
                                                                                    }
                                                                                    throw cause9;
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    Object[] objArr6 = new Object[2];
                                                                                    objArr6[i24] = sb6;
                                                                                    objArr6[z2 ? 1 : 0] = obj3;
                                                                                    byte[] bArr14 = $$a;
                                                                                    Object newInstance2 = Class.forName($$c(194, bArr14[c9], bArr14[c8])).getDeclaredConstructor(Class.forName($$c(194, bArr14[c9], bArr14[c8])), String.class).newInstance(objArr6);
                                                                                    System.currentTimeMillis();
                                                                                    System.currentTimeMillis();
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                Class.forName($$c(326, bArr14[c9], bArr14[c])).getMethod($$c(349, bArr14[c2], bArr14[9]), null).invoke(Class.forName($$c(326, bArr14[c9], bArr14[c])).getDeclaredConstructor(Class.forName($$c(194, bArr14[c9], bArr14[c8]))).newInstance(newInstance2), null);
                                                                                                obj4 = newInstance2;
                                                                                                obj5 = obj13;
                                                                                            } catch (Throwable th22) {
                                                                                                Throwable cause10 = th22.getCause();
                                                                                                if (cause10 == null) {
                                                                                                    throw th22;
                                                                                                }
                                                                                                throw cause10;
                                                                                            }
                                                                                        } catch (Exception e3) {
                                                                                            StringBuilder sb7 = new StringBuilder();
                                                                                            byte[] bArr15 = $$a;
                                                                                            sb7.append($$c(353, bArr15[102], bArr15[9]));
                                                                                            sb7.append(newInstance2);
                                                                                            sb7.append($$c(292, bArr15[1116], bArr15[112]));
                                                                                            String sb8 = sb7.toString();
                                                                                            try {
                                                                                                Object[] objArr7 = new Object[2];
                                                                                                objArr7[i24] = e3;
                                                                                                objArr7[z2 ? 1 : 0] = sb8;
                                                                                                throw ((Throwable) Class.forName($$c(292, bArr15[c9], bArr15[191])).getDeclaredConstructor(String.class, bArr2).newInstance(objArr7));
                                                                                            } catch (Throwable th23) {
                                                                                                Throwable cause11 = th23.getCause();
                                                                                                if (cause11 == null) {
                                                                                                    throw th23;
                                                                                                }
                                                                                                throw cause11;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th24) {
                                                                                        Throwable cause12 = th24.getCause();
                                                                                        if (cause12 == null) {
                                                                                            throw th24;
                                                                                        }
                                                                                        throw cause12;
                                                                                    }
                                                                                } catch (Throwable th25) {
                                                                                    Throwable cause13 = th25.getCause();
                                                                                    if (cause13 == null) {
                                                                                        throw th25;
                                                                                    }
                                                                                    throw cause13;
                                                                                }
                                                                            }
                                                                            th = th19;
                                                                            zArr2 = zArr16;
                                                                            i9 = i5;
                                                                            zArr3 = zArr17;
                                                                            zArr7 = zArr6;
                                                                            cls6 = r4;
                                                                            cls7 = bArr2;
                                                                            zArr5 = zArr7;
                                                                            int currentTimeMillis52222 = (int) System.currentTimeMillis();
                                                                            i8 = i9;
                                                                            int i752222 = ~currentTimeMillis52222;
                                                                            int i762222 = ((369 - (~(-(-(i8 * 370))))) - (~(-(-((((i8 ^ 1) | (i8 & 1)) | i752222) * (-369)))))) - 1;
                                                                            int i772222 = ~(((-2) ^ i752222) | ((-2) & i752222));
                                                                            int i782222 = (((i772222 & i8) | (i8 ^ i772222)) * (-369)) + i762222;
                                                                            int i792222 = ~i8;
                                                                            int i802222 = ~((i792222 & 1) | (i792222 ^ 1));
                                                                            int i812222 = ~((currentTimeMillis52222 ^ 1) | (currentTimeMillis52222 & 1));
                                                                            int i822222 = (i802222 & i812222) | (i802222 ^ i812222);
                                                                            int i832222 = ~currentTimeMillis52222;
                                                                            int i842222 = ((-2) & i832222) | ((-2) ^ i832222);
                                                                            int i852222 = ~((i842222 & i8) | (i842222 ^ i8));
                                                                            int i862222 = ((i852222 & i822222) | (i822222 ^ i852222)) * 369;
                                                                            i10 = (i782222 ^ i862222) + ((i862222 & i782222) << 1);
                                                                            while (i10 < 7) {
                                                                                if (zArr3[i10]) {
                                                                                    w = null;
                                                                                    e = null;
                                                                                    z3 = false;
                                                                                    i24 = 1;
                                                                                    cls4 = cls7;
                                                                                    zArr4 = zArr5;
                                                                                    cls3 = cls6;
                                                                                } else {
                                                                                    int i114 = ((i10 | 77) << 1) - (i10 ^ 77);
                                                                                    i10 = ((i114 | (-76)) << 1) - (i114 ^ (-76));
                                                                                }
                                                                            }
                                                                            byte[] bArr102222 = $$a;
                                                                            throw ((Throwable) Class.forName($$c(292, bArr102222[c9], bArr102222[191])).getDeclaredConstructor(String.class, cls7).newInstance($$c(1106, bArr102222[102], bArr102222[287]), th));
                                                                        }
                                                                        try {
                                                                            Object[] objArr8 = new Object[2];
                                                                            objArr8[i24] = sb6;
                                                                            objArr8[z2 ? 1 : 0] = obj3;
                                                                            byte[] bArr16 = $$a;
                                                                            obj5 = Class.forName($$c(194, bArr16[c9], bArr16[c8])).getDeclaredConstructor(Class.forName($$c(194, bArr16[c9], bArr16[c8])), String.class).newInstance(objArr8);
                                                                            obj4 = obj12;
                                                                        } catch (Throwable th26) {
                                                                            Throwable cause14 = th26.getCause();
                                                                            if (cause14 == null) {
                                                                                throw th26;
                                                                            }
                                                                            throw cause14;
                                                                        }
                                                                        obj6 = obj17;
                                                                        obj7 = obj18;
                                                                        objArr3 = objArr;
                                                                        zArr14 = zArr6;
                                                                    }
                                                                    obj8 = obj4;
                                                                    obj9 = obj5;
                                                                    obj10 = obj6;
                                                                    obj11 = obj7;
                                                                } else {
                                                                    zArr = zArr15;
                                                                    obj8 = null;
                                                                    obj9 = null;
                                                                    obj10 = null;
                                                                    obj11 = null;
                                                                }
                                                                ?? r53 = zArr14;
                                                                objArr = objArr3;
                                                                String $$c3 = $$c(357, (byte) (-$$a[727]), r0[52]);
                                                                try {
                                                                    try {
                                                                        String str4 = (String) Class.forName($$c(415, r0[c9], r0[c8])).getMethod($$c(426, r0[c4], r0[c11]), null).invoke(Class.class.getMethod($$c(405, r0[c4], r0[c7]), String.class).invoke(AFa1kSDK.class, $$c3), null);
                                                                        try {
                                                                            ZipFile zipFile5 = new ZipFile(str4.substring(5, str4.lastIndexOf($$c(432, (byte) ($$b >>> 1), r0[112]) + $$c3)));
                                                                            try {
                                                                                byte[] bArr17 = new byte[7440];
                                                                                InputStream inputStream = zipFile5.getInputStream(zipFile5.getEntry($$c3.substring(i24)));
                                                                                int i115 = $11;
                                                                                $10 = ((i115 & 49) + (i115 | 49)) % 128;
                                                                                try {
                                                                                    try {
                                                                                        Object newInstance3 = Class.forName($$c(476, r0[c9], r0[287])).getDeclaredConstructor(Class.forName($$c(458, r0[c9], r0[191]))).newInstance(Class.forName($$c(432, r0[c9], r0[451])).getDeclaredConstructor(Class.forName($$c(458, r0[c9], r0[191]))).newInstance(inputStream));
                                                                                        try {
                                                                                            Class.forName($$c(476, r0[c9], r0[287])).getMethod($$c(498, r0[8], r0[198]), r4).invoke(newInstance3, bArr17);
                                                                                            try {
                                                                                                try {
                                                                                                    Class.forName($$c(476, r0[c9], r0[287])).getMethod($$c(349, r0[c2], r0[9]), null).invoke(newInstance3, null);
                                                                                                    int i116 = 7400;
                                                                                                    String str5 = str2;
                                                                                                    byte[] bArr18 = bArr17;
                                                                                                    Class cls19 = null;
                                                                                                    int i117 = 16;
                                                                                                    bArr2 = bArr2;
                                                                                                    r4 = r4;
                                                                                                    ?? r25 = z2;
                                                                                                    r53 = r53;
                                                                                                    while (true) {
                                                                                                        long j = 1;
                                                                                                        int i118 = r25;
                                                                                                        for (int length = bArr18.length; i118 < length; length = length) {
                                                                                                            int i119 = i118;
                                                                                                            try {
                                                                                                                j = ((bArr18[i119] + (j << i70)) + (j << 16)) - j;
                                                                                                                i118 = (i119 ^ 1) + ((i119 & 1) << 1);
                                                                                                                zArr17 = zArr17;
                                                                                                            } catch (Throwable th27) {
                                                                                                                zArr3 = zArr17;
                                                                                                                th = th27;
                                                                                                                zArr2 = zArr16;
                                                                                                                i9 = i5;
                                                                                                                zArr8 = r53;
                                                                                                                r53 = r4;
                                                                                                                zipFile = zipFile5;
                                                                                                                bArr2 = bArr2;
                                                                                                                zArr17 = zArr8;
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        zipFile.close();
                                                                                                                        throw th;
                                                                                                                    } catch (Throwable th28) {
                                                                                                                        th.addSuppressed(th28);
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (Throwable th29) {
                                                                                                                    th = th29;
                                                                                                                    cls7 = bArr2;
                                                                                                                    zArr5 = zArr17;
                                                                                                                    cls6 = r53;
                                                                                                                    int currentTimeMillis522222 = (int) System.currentTimeMillis();
                                                                                                                    i8 = i9;
                                                                                                                    int i7522222 = ~currentTimeMillis522222;
                                                                                                                    int i7622222 = ((369 - (~(-(-(i8 * 370))))) - (~(-(-((((i8 ^ 1) | (i8 & 1)) | i7522222) * (-369)))))) - 1;
                                                                                                                    int i7722222 = ~(((-2) ^ i7522222) | ((-2) & i7522222));
                                                                                                                    int i7822222 = (((i7722222 & i8) | (i8 ^ i7722222)) * (-369)) + i7622222;
                                                                                                                    int i7922222 = ~i8;
                                                                                                                    int i8022222 = ~((i7922222 & 1) | (i7922222 ^ 1));
                                                                                                                    int i8122222 = ~((currentTimeMillis522222 ^ 1) | (currentTimeMillis522222 & 1));
                                                                                                                    int i8222222 = (i8022222 & i8122222) | (i8022222 ^ i8122222);
                                                                                                                    int i8322222 = ~currentTimeMillis522222;
                                                                                                                    int i8422222 = ((-2) & i8322222) | ((-2) ^ i8322222);
                                                                                                                    int i8522222 = ~((i8422222 & i8) | (i8422222 ^ i8));
                                                                                                                    int i8622222 = ((i8522222 & i8222222) | (i8222222 ^ i8522222)) * 369;
                                                                                                                    i10 = (i7822222 ^ i8622222) + ((i8622222 & i7822222) << 1);
                                                                                                                    while (i10 < 7) {
                                                                                                                    }
                                                                                                                    byte[] bArr1022222 = $$a;
                                                                                                                    throw ((Throwable) Class.forName($$c(292, bArr1022222[c9], bArr1022222[191])).getDeclaredConstructor(String.class, cls7).newInstance($$c(1106, bArr1022222[102], bArr1022222[287]), th));
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        zArr3 = zArr17;
                                                                                                        try {
                                                                                                            int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                                                                            int i120 = (i117 * (-494)) - 130416;
                                                                                                            zArr2 = zArr16;
                                                                                                            int i121 = -(-((~((i117 & 264) | (i117 ^ 264))) * (-495)));
                                                                                                            int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
                                                                                                            int i123 = ~currentTimeMillis8;
                                                                                                            int i124 = ((i123 & 264) | (i123 ^ 264)) * 495;
                                                                                                            int i125 = (i122 & i124) + (i124 | i122);
                                                                                                            int i126 = ~i117;
                                                                                                            int i127 = ~(((-265) ^ i126) | ((-265) & i126));
                                                                                                            int i128 = ~currentTimeMillis8;
                                                                                                            int i129 = ~((i128 & 264) | (i128 ^ 264));
                                                                                                            int i130 = (i125 - (~(-(-(((i129 & i127) | (i127 ^ i129)) * 495))))) - 1;
                                                                                                            try {
                                                                                                                int i131 = i117 * (-159);
                                                                                                                int i132 = ~((int) System.currentTimeMillis());
                                                                                                                int i133 = ~((i132 & 7423) | (i132 ^ 7423));
                                                                                                                int i134 = ~((i117 & 7423) | (i117 ^ 7423));
                                                                                                                int i135 = (((i133 & i134) | (i133 ^ i134)) * (-160)) + (((i117 ^ (-7424)) | (i117 & (-7424))) * 160) + ((-1180257) ^ i131) + ((i131 & (-1180257)) << 1);
                                                                                                                int i136 = ~(i126 | i132);
                                                                                                                int i137 = -(-(((i136 & 7423) | (i136 ^ 7423)) * 160));
                                                                                                                bArr18[i130] = (byte) (bArr18[(i135 & i137) + (i135 | i137)] + 37);
                                                                                                                int length2 = bArr18.length;
                                                                                                                int i138 = -i117;
                                                                                                                int i139 = (length2 ^ i138) + ((length2 & i138) << 1);
                                                                                                                try {
                                                                                                                    Object[] objArr9 = new Object[i23];
                                                                                                                    try {
                                                                                                                        objArr9[2] = Integer.valueOf(i139);
                                                                                                                        objArr9[1] = Integer.valueOf(i117);
                                                                                                                        objArr9[r25] = bArr18;
                                                                                                                        byte[] bArr19 = $$a;
                                                                                                                        Class<?> cls20 = Class.forName($$c(506, bArr19[c9], bArr19[952]));
                                                                                                                        Class cls21 = Integer.TYPE;
                                                                                                                        Object newInstance4 = cls20.getDeclaredConstructor(r4, cls21, cls21).newInstance(objArr9);
                                                                                                                        try {
                                                                                                                            Object obj19 = w;
                                                                                                                            if (obj19 == null) {
                                                                                                                                try {
                                                                                                                                    v = j;
                                                                                                                                    bArr3 = bArr19;
                                                                                                                                    int zoomControlsTimeout = (int) (j ^ ((-7044840232484646124L) - (ViewConfiguration.getZoomControlsTimeout() >> 32)));
                                                                                                                                    int uptimeMillis = (int) (v ^ ((SystemClock.uptimeMillis() >> 48) - 7044840231777098748L));
                                                                                                                                    byte[] bArr20 = {124, 55, 83, -50, 77, 91, 57, -123};
                                                                                                                                    int[] iArr = new int[(int) (v ^ ((SystemClock.elapsedRealtime() >> 48) - 7044840232484646124L))];
                                                                                                                                    int i140 = r25;
                                                                                                                                    int argb = Color.argb(i140, i140, i140, i140);
                                                                                                                                    int i141 = (int) (force >>> ((byte) (30 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))));
                                                                                                                                    iArr[argb] = ((~i141) & uptimeMillis) | ((~uptimeMillis) & i141);
                                                                                                                                    int zoomControlsTimeout2 = (int) (v ^ ((-7044840232484646121L) - (ViewConfiguration.getZoomControlsTimeout() >> 32)));
                                                                                                                                    int i142 = (int) force;
                                                                                                                                    iArr[zoomControlsTimeout2] = (uptimeMillis | i142) & (~(i142 & uptimeMillis));
                                                                                                                                    int i143 = afLogForce;
                                                                                                                                    ?? normalizeMetaState = KeyEvent.normalizeMetaState(0);
                                                                                                                                    try {
                                                                                                                                        Object[] objArr10 = new Object[i70];
                                                                                                                                        objArr10[5] = Integer.valueOf(zoomControlsTimeout);
                                                                                                                                        objArr10[i68] = Boolean.valueOf((boolean) normalizeMetaState);
                                                                                                                                        objArr10[3] = Integer.valueOf(i143);
                                                                                                                                        objArr10[2] = bArr20;
                                                                                                                                        objArr10[1] = iArr;
                                                                                                                                        objArr10[0] = newInstance4;
                                                                                                                                        Class<?> cls22 = Class.forName($$c(533, bArr3[c2], (byte) (-bArr3[488])));
                                                                                                                                        Class<?>[] clsArr = {Class.forName($$c(458, bArr3[c9], bArr3[191])), int[].class, byte[].class, cls21, Boolean.TYPE, cls21};
                                                                                                                                        cls21 = cls21;
                                                                                                                                        newInstance = cls22.getDeclaredConstructor(clsArr).newInstance(objArr10);
                                                                                                                                        cls8 = cls19;
                                                                                                                                        i14 = i117;
                                                                                                                                        i9 = i5;
                                                                                                                                        i23 = 3;
                                                                                                                                        i70 = 6;
                                                                                                                                    } catch (Throwable th30) {
                                                                                                                                        Throwable cause15 = th30.getCause();
                                                                                                                                        if (cause15 == null) {
                                                                                                                                            throw th30;
                                                                                                                                        }
                                                                                                                                        throw cause15;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th31) {
                                                                                                                                    th = th31;
                                                                                                                                    i9 = i5;
                                                                                                                                    zArr8 = r53;
                                                                                                                                    i23 = 3;
                                                                                                                                    i70 = 6;
                                                                                                                                    r53 = r4;
                                                                                                                                    zipFile = zipFile5;
                                                                                                                                    bArr2 = bArr2;
                                                                                                                                    zArr17 = zArr8;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                bArr3 = bArr19;
                                                                                                                                afErrorLog = j;
                                                                                                                                int zoomControlsTimeout3 = (int) (j ^ ((ViewConfiguration.getZoomControlsTimeout() >> 32) - 100439625434093874L));
                                                                                                                                int currentThreadTimeMillis = (int) (afErrorLog ^ (100439625206759766L - (SystemClock.currentThreadTimeMillis() >> 48)));
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        Object[] objArr11 = new Object[i68];
                                                                                                                                        i23 = 3;
                                                                                                                                        try {
                                                                                                                                            objArr11[3] = new byte[]{-17, 39, -108, -97, -84, 4, -1, 109, 23, 5, -123, 60, -111, 10, 114, 125};
                                                                                                                                            objArr11[2] = Integer.valueOf(currentThreadTimeMillis);
                                                                                                                                            objArr11[1] = Integer.valueOf(zoomControlsTimeout3);
                                                                                                                                            objArr11[0] = newInstance4;
                                                                                                                                            i14 = i117;
                                                                                                                                            i9 = i5;
                                                                                                                                            try {
                                                                                                                                                cls8 = cls19;
                                                                                                                                                newInstance = Class.forName($$c(563, bArr3[c2], bArr3[175]), true, (ClassLoader) e).getMethod($$c(595, (byte) (-bArr3[188]), bArr3[c6]), Class.forName($$c(458, bArr3[c9], bArr3[191])), cls21, cls21, r4).invoke(obj19, objArr11);
                                                                                                                                            } catch (Throwable th32) {
                                                                                                                                                th = th32;
                                                                                                                                                Throwable cause16 = th.getCause();
                                                                                                                                                if (cause16 == null) {
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                                throw cause16;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th33) {
                                                                                                                                            th = th33;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th34) {
                                                                                                                                        th = th34;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th35) {
                                                                                                                                    th = th35;
                                                                                                                                    i9 = i5;
                                                                                                                                    zArr17 = r53;
                                                                                                                                    i23 = 3;
                                                                                                                                    bArr2 = bArr2;
                                                                                                                                    obj14 = r4;
                                                                                                                                    r53 = obj14;
                                                                                                                                    r4 = zipFile5;
                                                                                                                                    th = th;
                                                                                                                                    bArr2 = bArr2;
                                                                                                                                    zipFile = r4;
                                                                                                                                    zArr17 = zArr17;
                                                                                                                                    r53 = r53;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                Class.forName($$c(458, bArr3[c9], bArr3[191])).getMethod($$c(609, bArr3[9], bArr3[45]), Long.TYPE).invoke(newInstance, 16);
                                                                                                                                if (z4) {
                                                                                                                                    try {
                                                                                                                                        Object obj20 = w;
                                                                                                                                        if (obj20 == null) {
                                                                                                                                            int i144 = $11 + 115;
                                                                                                                                            $10 = i144 % 128;
                                                                                                                                            if (i144 % 2 != 0) {
                                                                                                                                                try {
                                                                                                                                                    int i145 = 19 / 0;
                                                                                                                                                } catch (Throwable th36) {
                                                                                                                                                    th = th36;
                                                                                                                                                    zArr8 = r53;
                                                                                                                                                    r53 = r4;
                                                                                                                                                    zipFile = zipFile5;
                                                                                                                                                    bArr2 = bArr2;
                                                                                                                                                    zArr17 = zArr8;
                                                                                                                                                    zipFile.close();
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            obj15 = obj9;
                                                                                                                                        } else {
                                                                                                                                            obj15 = obj10;
                                                                                                                                        }
                                                                                                                                        Object obj21 = obj20 == null ? obj11 : obj8;
                                                                                                                                        c10 = '%';
                                                                                                                                        Method method2 = Class.forName($$c(458, bArr3[c9], bArr3[191])).getMethod($$c(612, bArr3[8], bArr3[45]), r4, cls21, cls21);
                                                                                                                                        Class<?> cls23 = Class.forName($$c(326, bArr3[c9], bArr3[c]));
                                                                                                                                        try {
                                                                                                                                            zipFile2 = zipFile5;
                                                                                                                                            try {
                                                                                                                                                Object newInstance5 = cls23.getConstructor(Class.forName($$c(194, bArr3[c9], bArr3[c8]))).newInstance(obj15);
                                                                                                                                                if (i6 != 0) {
                                                                                                                                                    try {
                                                                                                                                                        str3 = str5;
                                                                                                                                                        cls10 = bArr2;
                                                                                                                                                        try {
                                                                                                                                                            ((Boolean) Class.forName($$c(194, bArr3[c9], bArr3[c8])).getMethod($$c(615, bArr3[9], bArr3[c7]), null).invoke(obj15, null)).getClass();
                                                                                                                                                        } catch (Throwable th37) {
                                                                                                                                                            th = th37;
                                                                                                                                                            try {
                                                                                                                                                                Throwable cause17 = th.getCause();
                                                                                                                                                                if (cause17 == null) {
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                                throw cause17;
                                                                                                                                                            } catch (Exception e4) {
                                                                                                                                                                e = e4;
                                                                                                                                                                zArr9 = r53;
                                                                                                                                                                StringBuilder sb9 = new StringBuilder();
                                                                                                                                                                byte[] bArr21 = $$a;
                                                                                                                                                                sb9.append($$c(625, bArr21[102], bArr21[9]));
                                                                                                                                                                sb9.append(obj15);
                                                                                                                                                                sb9.append($$c(292, bArr21[1116], bArr21[112]));
                                                                                                                                                                try {
                                                                                                                                                                    Object[] objArr12 = {sb9.toString(), e};
                                                                                                                                                                    cls11 = cls10;
                                                                                                                                                                    try {
                                                                                                                                                                        throw ((Throwable) Class.forName($$c(292, bArr21[c9], bArr21[191])).getDeclaredConstructor(String.class, cls11).newInstance(objArr12));
                                                                                                                                                                    } catch (Throwable th38) {
                                                                                                                                                                        th = th38;
                                                                                                                                                                        try {
                                                                                                                                                                            Throwable cause18 = th.getCause();
                                                                                                                                                                            if (cause18 == null) {
                                                                                                                                                                                throw th;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause18;
                                                                                                                                                                        } catch (Throwable th39) {
                                                                                                                                                                            th = th39;
                                                                                                                                                                            bArr2 = cls11;
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    byte[] bArr22 = $$a;
                                                                                                                                                                                } catch (Throwable th40) {
                                                                                                                                                                                    th = th40;
                                                                                                                                                                                    th = th;
                                                                                                                                                                                    cls9 = r4;
                                                                                                                                                                                    zipFile3 = zipFile2;
                                                                                                                                                                                    cls13 = bArr2;
                                                                                                                                                                                    zArr12 = zArr9;
                                                                                                                                                                                    bArr2 = cls13;
                                                                                                                                                                                    zipFile = zipFile3;
                                                                                                                                                                                    zArr17 = zArr12;
                                                                                                                                                                                    r53 = cls9;
                                                                                                                                                                                    zipFile.close();
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th41) {
                                                                                                                                                                                th = th41;
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                Class<?> cls24 = Class.forName($$c(194, bArr22[c9], bArr22[c8]));
                                                                                                                                                                                int i146 = $$b;
                                                                                                                                                                                ((Boolean) cls24.getMethod($$c((short) ((i146 ^ 529) | (i146 & 529)), bArr22[37], bArr22[8]), null).invoke(obj15, null)).getClass();
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        ((Boolean) Class.forName($$c(194, bArr22[c9], bArr22[c8])).getMethod($$c((short) (i146 | 529), bArr22[37], bArr22[8]), null).invoke(obj21, null)).getClass();
                                                                                                                                                                                        throw th;
                                                                                                                                                                                    } catch (Throwable th42) {
                                                                                                                                                                                        th = th42;
                                                                                                                                                                                        Throwable cause19 = th.getCause();
                                                                                                                                                                                        if (cause19 == null) {
                                                                                                                                                                                            throw th;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw cause19;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th43) {
                                                                                                                                                                                    th = th43;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th44) {
                                                                                                                                                                                th = th44;
                                                                                                                                                                                Throwable cause20 = th.getCause();
                                                                                                                                                                                if (cause20 == null) {
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                                throw cause20;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th45) {
                                                                                                                                                                    th = th45;
                                                                                                                                                                    cls11 = cls10;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th46) {
                                                                                                                                                        th = th46;
                                                                                                                                                        cls10 = bArr2;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    cls10 = bArr2;
                                                                                                                                                    str3 = str5;
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    byte[] bArr23 = new byte[1024];
                                                                                                                                                    Method method3 = cls23.getMethod($$c(629, bArr3[112], bArr3[9]), r4, cls21, cls21);
                                                                                                                                                    boolean[] zArr19 = r53;
                                                                                                                                                    while (true) {
                                                                                                                                                        if (i116 <= 0) {
                                                                                                                                                            zArr11 = zArr19;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        zArr11 = zArr19;
                                                                                                                                                        try {
                                                                                                                                                            Integer num = (Integer) method2.invoke(newInstance, bArr23, zArr11, Integer.valueOf(Math.min(1024, i116)));
                                                                                                                                                            int intValue2 = num.intValue();
                                                                                                                                                            Object obj22 = newInstance;
                                                                                                                                                            if (intValue2 == -1) {
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            method3.invoke(newInstance5, bArr23, zArr11, num);
                                                                                                                                                            int i147 = -intValue2;
                                                                                                                                                            i116 = ((i116 | i147) << 1) - (i116 ^ i147);
                                                                                                                                                            newInstance = obj22;
                                                                                                                                                            zArr19 = zArr11;
                                                                                                                                                        } catch (Throwable th47) {
                                                                                                                                                            th = th47;
                                                                                                                                                            zArr10 = zArr11;
                                                                                                                                                            bArr2 = cls10;
                                                                                                                                                            zArr9 = zArr10;
                                                                                                                                                            byte[] bArr222 = $$a;
                                                                                                                                                            Class<?> cls242 = Class.forName($$c(194, bArr222[c9], bArr222[c8]));
                                                                                                                                                            int i1462 = $$b;
                                                                                                                                                            ((Boolean) cls242.getMethod($$c((short) ((i1462 ^ 529) | (i1462 & 529)), bArr222[37], bArr222[8]), null).invoke(obj15, null)).getClass();
                                                                                                                                                            ((Boolean) Class.forName($$c(194, bArr222[c9], bArr222[c8])).getMethod($$c((short) (i1462 | 529), bArr222[37], bArr222[8]), null).invoke(obj21, null)).getClass();
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    byte[] bArr24 = $$a;
                                                                                                                                                    Class.forName($$c(637, bArr24[c9], bArr24[282])).getMethod($$c(658, bArr24[9], bArr24[45]), null).invoke(cls23.getMethod($$c(633, bArr24[c4], bArr24[9]), null).invoke(newInstance5, null), null);
                                                                                                                                                    cls23.getMethod($$c(349, bArr24[c2], bArr24[9]), null).invoke(newInstance5, null);
                                                                                                                                                    Method declaredMethod = Class.forName($$c(661, bArr24[37], bArr24[c2])).getDeclaredMethod($$c(681, bArr24[c8], bArr24[c11]), String.class, String.class, Integer.TYPE);
                                                                                                                                                    $11 = ($10 + 67) % 128;
                                                                                                                                                    try {
                                                                                                                                                        Class<?> cls25 = Class.forName($$c(194, bArr24[c9], bArr24[c8]));
                                                                                                                                                        int i148 = $$b;
                                                                                                                                                        Object invoke5 = cls25.getMethod($$c((short) (i148 | 515), bArr24[c4], bArr24[c6]), null).invoke(obj15, null);
                                                                                                                                                        int i149 = $11;
                                                                                                                                                        $10 = ((i149 & 17) + (i149 | 17)) % 128;
                                                                                                                                                        try {
                                                                                                                                                            invoke3 = declaredMethod.invoke(null, invoke5, Class.forName($$c(194, bArr24[c9], bArr24[c8])).getMethod($$c((short) ((i148 ^ 515) | (i148 & 515)), bArr24[c4], bArr24[c6]), null).invoke(obj21, null), zArr11);
                                                                                                                                                            try {
                                                                                                                                                                ((Boolean) Class.forName($$c(194, bArr24[c9], bArr24[c8])).getMethod($$c((short) ((i148 ^ 529) | (i148 & 529)), bArr24[37], bArr24[8]), null).invoke(obj15, null)).getClass();
                                                                                                                                                                $11 = ($10 + 69) % 128;
                                                                                                                                                                try {
                                                                                                                                                                    ((Boolean) Class.forName($$c(194, bArr24[c9], bArr24[c8])).getMethod($$c((short) ((i148 & 529) | (i148 ^ 529)), bArr24[37], bArr24[8]), null).invoke(obj21, null)).getClass();
                                                                                                                                                                    if (e == null) {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                e = Class.class.getMethod($$c(706, bArr24[c4], bArr24[c9]), null).invoke(AFa1kSDK.class, null);
                                                                                                                                                                            } catch (Throwable th48) {
                                                                                                                                                                                th = th48;
                                                                                                                                                                                cls12 = r4;
                                                                                                                                                                                zArr13 = zArr11;
                                                                                                                                                                                zipFile3 = zipFile2;
                                                                                                                                                                                cls13 = cls10;
                                                                                                                                                                                zArr12 = zArr13;
                                                                                                                                                                                cls9 = cls12;
                                                                                                                                                                                bArr2 = cls13;
                                                                                                                                                                                zipFile = zipFile3;
                                                                                                                                                                                zArr17 = zArr12;
                                                                                                                                                                                r53 = cls9;
                                                                                                                                                                                zipFile.close();
                                                                                                                                                                                throw th;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th49) {
                                                                                                                                                                            Throwable cause21 = th49.getCause();
                                                                                                                                                                            if (cause21 == null) {
                                                                                                                                                                                throw th49;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause21;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    cls3 = r4;
                                                                                                                                                                    zArr4 = zArr11;
                                                                                                                                                                } catch (Throwable th50) {
                                                                                                                                                                    Throwable cause22 = th50.getCause();
                                                                                                                                                                    if (cause22 == null) {
                                                                                                                                                                        throw th50;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause22;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th51) {
                                                                                                                                                                Throwable cause23 = th51.getCause();
                                                                                                                                                                if (cause23 == null) {
                                                                                                                                                                    throw th51;
                                                                                                                                                                }
                                                                                                                                                                throw cause23;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th52) {
                                                                                                                                                            Throwable cause24 = th52.getCause();
                                                                                                                                                            if (cause24 == null) {
                                                                                                                                                                throw th52;
                                                                                                                                                            }
                                                                                                                                                            throw cause24;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th53) {
                                                                                                                                                        Throwable cause25 = th53.getCause();
                                                                                                                                                        if (cause25 == null) {
                                                                                                                                                            throw th53;
                                                                                                                                                        }
                                                                                                                                                        throw cause25;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th54) {
                                                                                                                                                    th = th54;
                                                                                                                                                    zArr10 = r53;
                                                                                                                                                }
                                                                                                                                            } catch (Exception e5) {
                                                                                                                                                e = e5;
                                                                                                                                                cls10 = bArr2;
                                                                                                                                            } catch (Throwable th55) {
                                                                                                                                                th = th55;
                                                                                                                                                zArr9 = r53;
                                                                                                                                                bArr2 = bArr2;
                                                                                                                                                byte[] bArr2222 = $$a;
                                                                                                                                                Class<?> cls2422 = Class.forName($$c(194, bArr2222[c9], bArr2222[c8]));
                                                                                                                                                int i14622 = $$b;
                                                                                                                                                ((Boolean) cls2422.getMethod($$c((short) ((i14622 ^ 529) | (i14622 & 529)), bArr2222[37], bArr2222[8]), null).invoke(obj15, null)).getClass();
                                                                                                                                                ((Boolean) Class.forName($$c(194, bArr2222[c9], bArr2222[c8])).getMethod($$c((short) (i14622 | 529), bArr2222[37], bArr2222[8]), null).invoke(obj21, null)).getClass();
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } catch (Exception e6) {
                                                                                                                                            e = e6;
                                                                                                                                            cls10 = bArr2;
                                                                                                                                            zipFile2 = zipFile5;
                                                                                                                                        } catch (Throwable th56) {
                                                                                                                                            th = th56;
                                                                                                                                            zipFile2 = zipFile5;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th57) {
                                                                                                                                        th = th57;
                                                                                                                                        zipFile2 = zipFile5;
                                                                                                                                        zArr9 = r53;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    zipFile2 = zipFile5;
                                                                                                                                    str3 = str5;
                                                                                                                                    zArr17 = r53;
                                                                                                                                    c10 = '%';
                                                                                                                                    r53 = newInstance;
                                                                                                                                    try {
                                                                                                                                        Class<?> cls26 = Class.forName($$c(719, bArr3[c9], bArr3[952]));
                                                                                                                                        Class<?> cls27 = Class.forName($$c(458, bArr3[c9], bArr3[191]));
                                                                                                                                        Object newInstance6 = cls26.getConstructor(cls27).newInstance(r53);
                                                                                                                                        Object invoke6 = cls26.getMethod($$c(746, bArr3[c4], bArr3[c8]), null).invoke(newInstance6, null);
                                                                                                                                        Method method4 = Class.forName($$c(757, bArr3[c9], bArr3[282])).getMethod($$c(778, bArr3[c4], bArr3[c11]), null);
                                                                                                                                        Method method5 = cls27.getMethod($$c(612, bArr3[8], bArr3[45]), r4);
                                                                                                                                        try {
                                                                                                                                            Object newInstance7 = Class.forName($$c(432, bArr3[c9], bArr3[451])).getDeclaredConstructor(Class.forName($$c(458, bArr3[c9], bArr3[191]))).newInstance(newInstance6);
                                                                                                                                            int i150 = $10;
                                                                                                                                            $11 = ((i150 ^ 37) + ((i150 & 37) << 1)) % 128;
                                                                                                                                            try {
                                                                                                                                                Object invoke7 = Class.class.getMethod($$c(706, bArr3[c4], bArr3[c9]), null).invoke(AFa1kSDK.class, null);
                                                                                                                                                Class<?> cls28 = Class.forName($$c(784, bArr3[c9], (byte) (-bArr3[288])));
                                                                                                                                                Object newInstance8 = cls28.getConstructor(null).newInstance(null);
                                                                                                                                                cls10 = bArr2;
                                                                                                                                                try {
                                                                                                                                                    Method method6 = cls28.getMethod($$c(629, bArr3[112], bArr3[9]), r4, cls21, cls21);
                                                                                                                                                    Method method7 = cls28.getMethod($$c(812, bArr3[45], bArr3[c7]), null);
                                                                                                                                                    r53 = r4;
                                                                                                                                                    try {
                                                                                                                                                        Method method8 = Class.forName($$c(822, bArr3[c9], bArr3[c4])).getMethod($$c(349, bArr3[c2], bArr3[9]), null);
                                                                                                                                                        byte[] bArr25 = new byte[1024];
                                                                                                                                                        int i151 = 0;
                                                                                                                                                        while (true) {
                                                                                                                                                            Integer num2 = (Integer) method5.invoke(newInstance7, bArr25);
                                                                                                                                                            Method method9 = method5;
                                                                                                                                                            int intValue3 = num2.intValue();
                                                                                                                                                            if (intValue3 <= 0) {
                                                                                                                                                                obj16 = invoke7;
                                                                                                                                                                method = method7;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            obj16 = invoke7;
                                                                                                                                                            Method method10 = method7;
                                                                                                                                                            if (i151 >= ((Long) method4.invoke(invoke6, null)).longValue()) {
                                                                                                                                                                method = method10;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            method6.invoke(newInstance8, bArr25, zArr17, num2);
                                                                                                                                                            int i152 = -(-intValue3);
                                                                                                                                                            i151 = ((i151 | i152) << 1) - (i152 ^ i151);
                                                                                                                                                            method5 = method9;
                                                                                                                                                            invoke7 = obj16;
                                                                                                                                                            method7 = method10;
                                                                                                                                                        }
                                                                                                                                                        byte[] bArr26 = (byte[]) method.invoke(newInstance8, null);
                                                                                                                                                        try {
                                                                                                                                                            method8.invoke(newInstance7, null);
                                                                                                                                                            method8.invoke(newInstance8, null);
                                                                                                                                                        } catch (Exception unused5) {
                                                                                                                                                        }
                                                                                                                                                        bArr2 = $$a;
                                                                                                                                                        r4 = Class.forName($$c(838, (byte) bArr2[37], (byte) bArr2[239])).getDeclaredConstructor(Class.forName($$c(873, (byte) bArr2[c9], (byte) bArr2[191])), Class.forName($$c(891, (byte) bArr2[c9], (byte) bArr2[c2])));
                                                                                                                                                        try {
                                                                                                                                                            Object obj23 = obj16;
                                                                                                                                                            Object newInstance9 = r4.newInstance(Class.forName($$c(873, (byte) bArr2[c9], (byte) bArr2[191])).getMethod($$c(911, (byte) bArr2[112], (byte) bArr2[45]), r53).invoke(null, bArr26), obj23);
                                                                                                                                                            try {
                                                                                                                                                                Class<?> cls29 = Class.forName($$c(914, (byte) bArr2[37], (byte) bArr2[320]));
                                                                                                                                                                byte b3 = (byte) bArr2[15];
                                                                                                                                                                Field declaredField = cls29.getDeclaredField($$c(945, b3, b3));
                                                                                                                                                                declaredField.setAccessible(true);
                                                                                                                                                                Object obj24 = declaredField.get(obj23);
                                                                                                                                                                Class<?> cls30 = obj24.getClass();
                                                                                                                                                                try {
                                                                                                                                                                    Field declaredField2 = cls30.getDeclaredField($$c(952, (byte) bArr2[5], (byte) bArr2[c]));
                                                                                                                                                                    declaredField2.setAccessible(true);
                                                                                                                                                                    Field declaredField3 = cls30.getDeclaredField($$c(975, (byte) bArr2[5], (byte) bArr2[961]));
                                                                                                                                                                    declaredField3.setAccessible(true);
                                                                                                                                                                    Object obj25 = declaredField2.get(obj24);
                                                                                                                                                                    Object obj26 = declaredField3.get(obj24);
                                                                                                                                                                    Object obj27 = declaredField.get(newInstance9);
                                                                                                                                                                    ArrayList arrayList = new ArrayList((List) obj25);
                                                                                                                                                                    try {
                                                                                                                                                                        Class cls31 = (Class) Class.class.getMethod($$c(999, (byte) bArr2[c4], (byte) bArr2[608]), null).invoke(obj26.getClass(), null);
                                                                                                                                                                        int length3 = Array.getLength(obj26);
                                                                                                                                                                        Object newInstance10 = Array.newInstance((Class<?>) cls31, length3);
                                                                                                                                                                        for (int i153 = 0; i153 < length3; i153 = ((i153 | 1) << 1) - (i153 ^ 1)) {
                                                                                                                                                                            Array.set(newInstance10, i153, Array.get(obj26, i153));
                                                                                                                                                                        }
                                                                                                                                                                        declaredField2.set(obj27, arrayList);
                                                                                                                                                                        declaredField3.set(obj27, newInstance10);
                                                                                                                                                                        $11 = ($10 + 57) % 128;
                                                                                                                                                                        if (e == null) {
                                                                                                                                                                            e = newInstance9;
                                                                                                                                                                        }
                                                                                                                                                                        invoke3 = newInstance9;
                                                                                                                                                                        zArr4 = zArr17;
                                                                                                                                                                        cls3 = r53;
                                                                                                                                                                    } catch (Throwable th58) {
                                                                                                                                                                        r4 = zipFile2;
                                                                                                                                                                        try {
                                                                                                                                                                            Throwable cause26 = th58.getCause();
                                                                                                                                                                            if (cause26 == null) {
                                                                                                                                                                                throw th58;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause26;
                                                                                                                                                                        } catch (Exception e7) {
                                                                                                                                                                            e = e7;
                                                                                                                                                                            try {
                                                                                                                                                                                StringBuilder sb10 = new StringBuilder();
                                                                                                                                                                                byte[] bArr27 = $$a;
                                                                                                                                                                                sb10.append($$c(1014, bArr27[102], bArr27[9]));
                                                                                                                                                                                sb10.append(obj23);
                                                                                                                                                                                sb10.append($$c(292, bArr27[1116], bArr27[112]));
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        throw ((Throwable) Class.forName($$c(292, bArr27[c9], bArr27[191])).getDeclaredConstructor(String.class, cls10).newInstance(sb10.toString(), e));
                                                                                                                                                                                    } catch (Throwable th59) {
                                                                                                                                                                                        th = th59;
                                                                                                                                                                                        Throwable cause27 = th.getCause();
                                                                                                                                                                                        if (cause27 == null) {
                                                                                                                                                                                            throw th;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw cause27;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th60) {
                                                                                                                                                                                    th = th60;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th61) {
                                                                                                                                                                                th = th61;
                                                                                                                                                                                bArr2 = cls10;
                                                                                                                                                                                th = th;
                                                                                                                                                                                bArr2 = bArr2;
                                                                                                                                                                                zipFile = r4;
                                                                                                                                                                                zArr17 = zArr17;
                                                                                                                                                                                r53 = r53;
                                                                                                                                                                                zipFile.close();
                                                                                                                                                                                throw th;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } catch (Exception e8) {
                                                                                                                                                                    e = e8;
                                                                                                                                                                    r4 = zipFile2;
                                                                                                                                                                }
                                                                                                                                                            } catch (Exception e9) {
                                                                                                                                                                e = e9;
                                                                                                                                                                r4 = zipFile2;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th62) {
                                                                                                                                                            Throwable cause28 = th62.getCause();
                                                                                                                                                            if (cause28 == null) {
                                                                                                                                                                throw th62;
                                                                                                                                                            }
                                                                                                                                                            throw cause28;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th63) {
                                                                                                                                                        th = th63;
                                                                                                                                                        r4 = zipFile2;
                                                                                                                                                        bArr2 = cls10;
                                                                                                                                                        r53 = r53;
                                                                                                                                                        th = th;
                                                                                                                                                        bArr2 = bArr2;
                                                                                                                                                        zipFile = r4;
                                                                                                                                                        zArr17 = zArr17;
                                                                                                                                                        r53 = r53;
                                                                                                                                                        zipFile.close();
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th64) {
                                                                                                                                                    th = th64;
                                                                                                                                                    r53 = r4;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th65) {
                                                                                                                                                Throwable cause29 = th65.getCause();
                                                                                                                                                if (cause29 == null) {
                                                                                                                                                    throw th65;
                                                                                                                                                }
                                                                                                                                                throw cause29;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th66) {
                                                                                                                                            Throwable cause30 = th66.getCause();
                                                                                                                                            if (cause30 == null) {
                                                                                                                                                throw th66;
                                                                                                                                            }
                                                                                                                                            throw cause30;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th67) {
                                                                                                                                        th = th67;
                                                                                                                                        r53 = r4;
                                                                                                                                        r4 = zipFile2;
                                                                                                                                        bArr2 = bArr2;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (z4) {
                                                                                                                                    try {
                                                                                                                                        byte[] bArr28 = $$a;
                                                                                                                                        Class<?> cls32 = Class.forName($$c(661, bArr28[c10], bArr28[c2]));
                                                                                                                                        Method declaredMethod2 = cls32.getDeclaredMethod($$c(1018, bArr28[c8], bArr28[198]), String.class, Class.forName($$c(891, bArr28[c9], bArr28[c2])));
                                                                                                                                        declaredMethod2.setAccessible(true);
                                                                                                                                        int i154 = $10;
                                                                                                                                        $11 = ((i154 & 123) + (i154 | 123)) % 128;
                                                                                                                                        try {
                                                                                                                                            ?? invoke8 = declaredMethod2.invoke(invoke3, str3, Class.class.getMethod($$c(706, bArr28[c4], bArr28[c9]), null).invoke(AFa1kSDK.class, null));
                                                                                                                                            if (invoke8 != null) {
                                                                                                                                                $11 = ($10 + 43) % 128;
                                                                                                                                                cls32.getDeclaredMethod($$c(349, bArr28[c2], bArr28[9]), null).invoke(invoke3, null);
                                                                                                                                            }
                                                                                                                                            cls14 = invoke8;
                                                                                                                                        } catch (Throwable th68) {
                                                                                                                                            Throwable cause31 = th68.getCause();
                                                                                                                                            if (cause31 == null) {
                                                                                                                                                throw th68;
                                                                                                                                            }
                                                                                                                                            throw cause31;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th69) {
                                                                                                                                        th = th69;
                                                                                                                                        zArr13 = zArr4;
                                                                                                                                        cls12 = cls3;
                                                                                                                                        zipFile3 = zipFile2;
                                                                                                                                        cls13 = cls10;
                                                                                                                                        zArr12 = zArr13;
                                                                                                                                        cls9 = cls12;
                                                                                                                                        bArr2 = cls13;
                                                                                                                                        zipFile = zipFile3;
                                                                                                                                        zArr17 = zArr12;
                                                                                                                                        r53 = cls9;
                                                                                                                                        zipFile.close();
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    String str6 = str3;
                                                                                                                                    try {
                                                                                                                                        byte[] bArr29 = $$a;
                                                                                                                                        Method declaredMethod3 = Class.forName($$c(891, bArr29[c9], bArr29[c2])).getDeclaredMethod($$c(1018, bArr29[c8], bArr29[198]), String.class);
                                                                                                                                        try {
                                                                                                                                            declaredMethod3.setAccessible(true);
                                                                                                                                            cls14 = declaredMethod3.invoke(invoke3, str6);
                                                                                                                                        } catch (InvocationTargetException e10) {
                                                                                                                                            try {
                                                                                                                                                throw ((Exception) e10.getCause());
                                                                                                                                            } catch (ClassNotFoundException unused6) {
                                                                                                                                                cls14 = null;
                                                                                                                                                if (cls14 != null) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th70) {
                                                                                                                                        th2 = th70;
                                                                                                                                        zipFile4 = zipFile2;
                                                                                                                                        th = th2;
                                                                                                                                        bArr2 = cls10;
                                                                                                                                        zipFile = zipFile4;
                                                                                                                                        zArr17 = zArr4;
                                                                                                                                        r53 = cls3;
                                                                                                                                        zipFile.close();
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (cls14 != null) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                int i155 = $10;
                                                                                                                                $11 = (((i155 | 5) << 1) - (i155 ^ 5)) % 128;
                                                                                                                                try {
                                                                                                                                    cls19 = cls14;
                                                                                                                                    byte[] bArr30 = $$a;
                                                                                                                                    str5 = $$c(1026, bArr30[c2], bArr30[175]);
                                                                                                                                    Constructor declaredConstructor = cls19.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                                    declaredConstructor.setAccessible(true);
                                                                                                                                    if (z4) {
                                                                                                                                        z6 = false;
                                                                                                                                    } else {
                                                                                                                                        $11 = ($10 + 57) % 128;
                                                                                                                                        z6 = true;
                                                                                                                                    }
                                                                                                                                    w = declaredConstructor.newInstance(invoke3, Boolean.valueOf(z6));
                                                                                                                                    bArr18 = new byte[13648];
                                                                                                                                    zipFile4 = zipFile2;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                Object newInstance11 = Class.forName($$c(476, bArr30[c9], bArr30[287])).getDeclaredConstructor(Class.forName($$c(458, bArr30[c9], bArr30[191]))).newInstance(Class.forName($$c(432, bArr30[c9], bArr30[451])).getDeclaredConstructor(Class.forName($$c(458, bArr30[c9], bArr30[191]))).newInstance(zipFile4.getInputStream(zipFile4.getEntry($$c(1058, (byte) (-bArr30[727]), bArr30[52]).substring(1)))));
                                                                                                                                                System.currentTimeMillis();
                                                                                                                                                System.currentTimeMillis();
                                                                                                                                                try {
                                                                                                                                                    Class.forName($$c(476, bArr30[c9], bArr30[287])).getMethod($$c(498, bArr30[8], bArr30[198]), cls3).invoke(newInstance11, bArr18);
                                                                                                                                                    try {
                                                                                                                                                        Class.forName($$c(476, bArr30[c9], bArr30[287])).getMethod($$c(349, bArr30[c2], bArr30[9]), null).invoke(newInstance11, null);
                                                                                                                                                        i117 = Math.abs(i14);
                                                                                                                                                        i116 = 13609;
                                                                                                                                                        zipFile5 = zipFile4;
                                                                                                                                                        r4 = cls3;
                                                                                                                                                        i5 = i9;
                                                                                                                                                        zArr16 = zArr2;
                                                                                                                                                        bArr2 = cls10;
                                                                                                                                                        r25 = 0;
                                                                                                                                                        i68 = 4;
                                                                                                                                                        r53 = zArr4;
                                                                                                                                                        zArr17 = zArr3;
                                                                                                                                                    } catch (Throwable th71) {
                                                                                                                                                        Throwable cause32 = th71.getCause();
                                                                                                                                                        if (cause32 == null) {
                                                                                                                                                            throw th71;
                                                                                                                                                        }
                                                                                                                                                        throw cause32;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th72) {
                                                                                                                                                    Throwable cause33 = th72.getCause();
                                                                                                                                                    if (cause33 == null) {
                                                                                                                                                        throw th72;
                                                                                                                                                    }
                                                                                                                                                    throw cause33;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th73) {
                                                                                                                                                Throwable cause34 = th73.getCause();
                                                                                                                                                if (cause34 == null) {
                                                                                                                                                    throw th73;
                                                                                                                                                }
                                                                                                                                                throw cause34;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th74) {
                                                                                                                                            Throwable cause35 = th74.getCause();
                                                                                                                                            if (cause35 == null) {
                                                                                                                                                throw th74;
                                                                                                                                            }
                                                                                                                                            throw cause35;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th75) {
                                                                                                                                        th2 = th75;
                                                                                                                                        th = th2;
                                                                                                                                        bArr2 = cls10;
                                                                                                                                        zipFile = zipFile4;
                                                                                                                                        zArr17 = zArr4;
                                                                                                                                        r53 = cls3;
                                                                                                                                        zipFile.close();
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th76) {
                                                                                                                                    th2 = th76;
                                                                                                                                    zipFile4 = zipFile2;
                                                                                                                                }
                                                                                                                            } catch (Throwable th77) {
                                                                                                                                th = th77;
                                                                                                                                zArr17 = r53;
                                                                                                                                bArr2 = bArr2;
                                                                                                                                obj14 = r4;
                                                                                                                                r53 = obj14;
                                                                                                                                r4 = zipFile5;
                                                                                                                                th = th;
                                                                                                                                bArr2 = bArr2;
                                                                                                                                zipFile = r4;
                                                                                                                                zArr17 = zArr17;
                                                                                                                                r53 = r53;
                                                                                                                                zipFile.close();
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        } catch (Throwable th78) {
                                                                                                                            th = th78;
                                                                                                                            i9 = i5;
                                                                                                                            zArr17 = r53;
                                                                                                                            i23 = 3;
                                                                                                                            bArr2 = bArr2;
                                                                                                                            obj14 = r4;
                                                                                                                        }
                                                                                                                    } catch (Throwable th79) {
                                                                                                                        th = th79;
                                                                                                                        Throwable cause36 = th.getCause();
                                                                                                                        if (cause36 == null) {
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                        throw cause36;
                                                                                                                    }
                                                                                                                } catch (Throwable th80) {
                                                                                                                    th = th80;
                                                                                                                }
                                                                                                            } catch (Throwable th81) {
                                                                                                                th = th81;
                                                                                                                i9 = i5;
                                                                                                                zArr17 = r53;
                                                                                                                bArr2 = bArr2;
                                                                                                                obj14 = r4;
                                                                                                                r53 = obj14;
                                                                                                                r4 = zipFile5;
                                                                                                                th = th;
                                                                                                                bArr2 = bArr2;
                                                                                                                zipFile = r4;
                                                                                                                zArr17 = zArr17;
                                                                                                                r53 = r53;
                                                                                                                zipFile.close();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (Throwable th82) {
                                                                                                            th = th82;
                                                                                                            zArr2 = zArr16;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th83) {
                                                                                                    Throwable cause37 = th83.getCause();
                                                                                                    if (cause37 == null) {
                                                                                                        throw th83;
                                                                                                    }
                                                                                                    throw cause37;
                                                                                                }
                                                                                            } catch (Throwable th84) {
                                                                                                th = th84;
                                                                                            }
                                                                                        } catch (Throwable th85) {
                                                                                            Throwable cause38 = th85.getCause();
                                                                                            if (cause38 == null) {
                                                                                                throw th85;
                                                                                            }
                                                                                            throw cause38;
                                                                                        }
                                                                                    } catch (Throwable th86) {
                                                                                        Throwable cause39 = th86.getCause();
                                                                                        if (cause39 == null) {
                                                                                            throw th86;
                                                                                        }
                                                                                        throw cause39;
                                                                                    }
                                                                                } catch (Throwable th87) {
                                                                                    Throwable cause40 = th87.getCause();
                                                                                    if (cause40 == null) {
                                                                                        throw th87;
                                                                                    }
                                                                                    throw cause40;
                                                                                }
                                                                            } catch (Throwable th88) {
                                                                                th = th88;
                                                                                zArr2 = zArr16;
                                                                                i9 = i5;
                                                                                zArr3 = zArr17;
                                                                            }
                                                                        } catch (Throwable th89) {
                                                                            th = th89;
                                                                            zArr2 = zArr16;
                                                                            i9 = i5;
                                                                            zArr3 = zArr17;
                                                                            zArr7 = r53;
                                                                            cls6 = r4;
                                                                            cls7 = bArr2;
                                                                            zArr5 = zArr7;
                                                                            int currentTimeMillis5222222 = (int) System.currentTimeMillis();
                                                                            i8 = i9;
                                                                            int i75222222 = ~currentTimeMillis5222222;
                                                                            int i76222222 = ((369 - (~(-(-(i8 * 370))))) - (~(-(-((((i8 ^ 1) | (i8 & 1)) | i75222222) * (-369)))))) - 1;
                                                                            int i77222222 = ~(((-2) ^ i75222222) | ((-2) & i75222222));
                                                                            int i78222222 = (((i77222222 & i8) | (i8 ^ i77222222)) * (-369)) + i76222222;
                                                                            int i79222222 = ~i8;
                                                                            int i80222222 = ~((i79222222 & 1) | (i79222222 ^ 1));
                                                                            int i81222222 = ~((currentTimeMillis5222222 ^ 1) | (currentTimeMillis5222222 & 1));
                                                                            int i82222222 = (i80222222 & i81222222) | (i80222222 ^ i81222222);
                                                                            int i83222222 = ~currentTimeMillis5222222;
                                                                            int i84222222 = ((-2) & i83222222) | ((-2) ^ i83222222);
                                                                            int i85222222 = ~((i84222222 & i8) | (i84222222 ^ i8));
                                                                            int i86222222 = ((i85222222 & i82222222) | (i82222222 ^ i85222222)) * 369;
                                                                            i10 = (i78222222 ^ i86222222) + ((i86222222 & i78222222) << 1);
                                                                            while (i10 < 7) {
                                                                            }
                                                                            byte[] bArr10222222 = $$a;
                                                                            throw ((Throwable) Class.forName($$c(292, bArr10222222[c9], bArr10222222[191])).getDeclaredConstructor(String.class, cls7).newInstance($$c(1106, bArr10222222[102], bArr10222222[287]), th));
                                                                        }
                                                                        i5 = i8 + 1;
                                                                        z2 = z3;
                                                                        zArr14 = zArr4;
                                                                        i3 = i6;
                                                                        $$c = str2;
                                                                        zArr15 = zArr;
                                                                        objArr3 = objArr;
                                                                        r4 = cls3;
                                                                        zArr16 = zArr2;
                                                                        zArr17 = zArr3;
                                                                        i68 = 4;
                                                                        bArr2 = cls4;
                                                                    } catch (Throwable th90) {
                                                                        Throwable cause41 = th90.getCause();
                                                                        if (cause41 == null) {
                                                                            throw th90;
                                                                        }
                                                                        throw cause41;
                                                                    }
                                                                } catch (Throwable th91) {
                                                                    Throwable cause42 = th91.getCause();
                                                                    if (cause42 == null) {
                                                                        throw th91;
                                                                    }
                                                                    throw cause42;
                                                                }
                                                            }
                                                            i4 = i7;
                                                            i5 = i8 + 1;
                                                            z2 = z3;
                                                            zArr14 = zArr4;
                                                            i3 = i6;
                                                            $$c = str2;
                                                            zArr15 = zArr;
                                                            objArr3 = objArr;
                                                            r4 = cls3;
                                                            zArr16 = zArr2;
                                                            zArr17 = zArr3;
                                                            i68 = 4;
                                                            bArr2 = cls4;
                                                        }
                                                        return;
                                                    }
                                                    z7 = z ? 1 : 0;
                                                    zArr17[z ? 1 : 0] = z7;
                                                    zArr17[1] = i15 >= 21 ? true : z ? 1 : 0;
                                                    zArr17[4] = i15 >= 21 ? true : z ? 1 : 0;
                                                    i4 = z ? 1 : 0;
                                                    i5 = i4;
                                                    bArr2 = Throwable.class;
                                                    r4 = byte[].class;
                                                    z2 = z;
                                                    while (i4 == 0) {
                                                        if (zArr17[i5]) {
                                                        }
                                                        i4 = i7;
                                                        i5 = i8 + 1;
                                                        z2 = z3;
                                                        zArr14 = zArr4;
                                                        i3 = i6;
                                                        $$c = str2;
                                                        zArr15 = zArr;
                                                        objArr3 = objArr;
                                                        r4 = cls3;
                                                        zArr16 = zArr2;
                                                        zArr17 = zArr3;
                                                        i68 = 4;
                                                        bArr2 = cls4;
                                                    }
                                                } catch (Throwable th92) {
                                                    Throwable cause43 = th92.getCause();
                                                    if (cause43 == null) {
                                                        throw th92;
                                                    }
                                                    throw cause43;
                                                }
                                            }
                                            int i156 = $11;
                                            int i157 = (i156 & 91) + (i156 | 91);
                                            $10 = i157 % 128;
                                            if (i157 % 2 != 0) {
                                                int i158 = 48 / 0;
                                            }
                                            invoke = null;
                                        }
                                        c9 = 356;
                                        c8 = 219;
                                        if (invoke2 == null) {
                                        }
                                        if (obj2 == null) {
                                            byte[] bArr62 = $$a;
                                            Object[] objArr22 = new Object[i2];
                                            objArr22[1] = $$c(243, bArr62[c2], bArr62[5]);
                                            objArr22[z ? 1 : 0] = invoke;
                                            obj2 = Class.forName($$c(194, bArr62[c9], bArr62[c8])).getDeclaredConstructor(Class.forName($$c(194, bArr62[c9], bArr62[c8])), String.class).newInstance(objArr22);
                                        }
                                        byte[] bArr72 = $$a;
                                        Object[] objArr32 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr72[c9], bArr72[c8])), 7);
                                        objArr32[z ? 1 : 0] = null;
                                        objArr32[1] = obj2;
                                        objArr32[2] = invoke;
                                        objArr32[3] = invoke2;
                                        objArr32[4] = obj2;
                                        objArr32[5] = invoke;
                                        objArr32[6] = invoke2;
                                        boolean[] zArr152 = {false, true, true, true, true, true, true};
                                        boolean[] zArr162 = {false, false, false, false, true, true, true};
                                        int i682 = 4;
                                        boolean[] zArr172 = new boolean[7];
                                        zArr172[z ? 1 : 0] = z;
                                        zArr172[1] = z;
                                        zArr172[2] = true;
                                        zArr172[3] = true;
                                        zArr172[4] = z;
                                        zArr172[5] = true;
                                        zArr172[6] = true;
                                        int i692 = $$b;
                                        char c112 = 159;
                                        short s32 = (short) ((i692 ^ 80) | (i692 & 80));
                                        int i702 = 6;
                                        Class<?> cls182 = Class.forName($$c(s32, bArr72[287], bArr72[c]));
                                        i15 = cls182.getDeclaredField($$c(275, bArr72[90], bArr72[159])).getInt(cls182);
                                        if (i15 < 34) {
                                        }
                                        if (i15 == 29) {
                                        }
                                        if (i15 >= 26) {
                                        }
                                        z7 = z ? 1 : 0;
                                        zArr172[z ? 1 : 0] = z7;
                                        zArr172[1] = i15 >= 21 ? true : z ? 1 : 0;
                                        zArr172[4] = i15 >= 21 ? true : z ? 1 : 0;
                                        i4 = z ? 1 : 0;
                                        i5 = i4;
                                        bArr2 = Throwable.class;
                                        r4 = byte[].class;
                                        z2 = z;
                                        while (i4 == 0) {
                                        }
                                    }
                                    try {
                                        byte[] bArr31 = $$a;
                                        invoke2 = cls2.getMethod($$c(s, bArr31[c4], bArr31[c7]), null).invoke(obj, null);
                                    } catch (Exception unused7) {
                                        invoke2 = null;
                                        if (invoke == null) {
                                        }
                                        c9 = 356;
                                        c8 = 219;
                                        if (invoke2 == null) {
                                        }
                                        if (obj2 == null) {
                                        }
                                        byte[] bArr722 = $$a;
                                        Object[] objArr322 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr722[c9], bArr722[c8])), 7);
                                        objArr322[z ? 1 : 0] = null;
                                        objArr322[1] = obj2;
                                        objArr322[2] = invoke;
                                        objArr322[3] = invoke2;
                                        objArr322[4] = obj2;
                                        objArr322[5] = invoke;
                                        objArr322[6] = invoke2;
                                        boolean[] zArr1522 = {false, true, true, true, true, true, true};
                                        boolean[] zArr1622 = {false, false, false, false, true, true, true};
                                        int i6822 = 4;
                                        boolean[] zArr1722 = new boolean[7];
                                        zArr1722[z ? 1 : 0] = z;
                                        zArr1722[1] = z;
                                        zArr1722[2] = true;
                                        zArr1722[3] = true;
                                        zArr1722[4] = z;
                                        zArr1722[5] = true;
                                        zArr1722[6] = true;
                                        int i6922 = $$b;
                                        char c1122 = 159;
                                        short s322 = (short) ((i6922 ^ 80) | (i6922 & 80));
                                        int i7022 = 6;
                                        Class<?> cls1822 = Class.forName($$c(s322, bArr722[287], bArr722[c]));
                                        i15 = cls1822.getDeclaredField($$c(275, bArr722[90], bArr722[159])).getInt(cls1822);
                                        if (i15 < 34) {
                                        }
                                        if (i15 == 29) {
                                        }
                                        if (i15 >= 26) {
                                        }
                                        z7 = z ? 1 : 0;
                                        zArr1722[z ? 1 : 0] = z7;
                                        zArr1722[1] = i15 >= 21 ? true : z ? 1 : 0;
                                        zArr1722[4] = i15 >= 21 ? true : z ? 1 : 0;
                                        i4 = z ? 1 : 0;
                                        i5 = i4;
                                        bArr2 = Throwable.class;
                                        r4 = byte[].class;
                                        z2 = z;
                                        while (i4 == 0) {
                                        }
                                    }
                                    if (invoke == null) {
                                    }
                                    c9 = 356;
                                    c8 = 219;
                                    if (invoke2 == null) {
                                    }
                                    if (obj2 == null) {
                                    }
                                    byte[] bArr7222 = $$a;
                                    Object[] objArr3222 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr7222[c9], bArr7222[c8])), 7);
                                    objArr3222[z ? 1 : 0] = null;
                                    objArr3222[1] = obj2;
                                    objArr3222[2] = invoke;
                                    objArr3222[3] = invoke2;
                                    objArr3222[4] = obj2;
                                    objArr3222[5] = invoke;
                                    objArr3222[6] = invoke2;
                                    boolean[] zArr15222 = {false, true, true, true, true, true, true};
                                    boolean[] zArr16222 = {false, false, false, false, true, true, true};
                                    int i68222 = 4;
                                    boolean[] zArr17222 = new boolean[7];
                                    zArr17222[z ? 1 : 0] = z;
                                    zArr17222[1] = z;
                                    zArr17222[2] = true;
                                    zArr17222[3] = true;
                                    zArr17222[4] = z;
                                    zArr17222[5] = true;
                                    zArr17222[6] = true;
                                    int i69222 = $$b;
                                    char c11222 = 159;
                                    short s3222 = (short) ((i69222 ^ 80) | (i69222 & 80));
                                    int i70222 = 6;
                                    Class<?> cls18222 = Class.forName($$c(s3222, bArr7222[287], bArr7222[c]));
                                    i15 = cls18222.getDeclaredField($$c(275, bArr7222[90], bArr7222[159])).getInt(cls18222);
                                    if (i15 < 34) {
                                    }
                                    if (i15 == 29) {
                                    }
                                    if (i15 >= 26) {
                                    }
                                    z7 = z ? 1 : 0;
                                    zArr17222[z ? 1 : 0] = z7;
                                    zArr17222[1] = i15 >= 21 ? true : z ? 1 : 0;
                                    zArr17222[4] = i15 >= 21 ? true : z ? 1 : 0;
                                    i4 = z ? 1 : 0;
                                    i5 = i4;
                                    bArr2 = Throwable.class;
                                    r4 = byte[].class;
                                    z2 = z;
                                    while (i4 == 0) {
                                    }
                                }
                                i2 = 2;
                                invoke2 = null;
                                if (invoke == null) {
                                }
                                c9 = 356;
                                c8 = 219;
                                if (invoke2 == null) {
                                }
                                if (obj2 == null) {
                                }
                                byte[] bArr72222 = $$a;
                                Object[] objArr32222 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr72222[c9], bArr72222[c8])), 7);
                                objArr32222[z ? 1 : 0] = null;
                                objArr32222[1] = obj2;
                                objArr32222[2] = invoke;
                                objArr32222[3] = invoke2;
                                objArr32222[4] = obj2;
                                objArr32222[5] = invoke;
                                objArr32222[6] = invoke2;
                                boolean[] zArr152222 = {false, true, true, true, true, true, true};
                                boolean[] zArr162222 = {false, false, false, false, true, true, true};
                                int i682222 = 4;
                                boolean[] zArr172222 = new boolean[7];
                                zArr172222[z ? 1 : 0] = z;
                                zArr172222[1] = z;
                                zArr172222[2] = true;
                                zArr172222[3] = true;
                                zArr172222[4] = z;
                                zArr172222[5] = true;
                                zArr172222[6] = true;
                                int i692222 = $$b;
                                char c112222 = 159;
                                short s32222 = (short) ((i692222 ^ 80) | (i692222 & 80));
                                int i702222 = 6;
                                Class<?> cls182222 = Class.forName($$c(s32222, bArr72222[287], bArr72222[c]));
                                i15 = cls182222.getDeclaredField($$c(275, bArr72222[90], bArr72222[159])).getInt(cls182222);
                                if (i15 < 34) {
                                }
                                if (i15 == 29) {
                                }
                                if (i15 >= 26) {
                                }
                                z7 = z ? 1 : 0;
                                zArr172222[z ? 1 : 0] = z7;
                                zArr172222[1] = i15 >= 21 ? true : z ? 1 : 0;
                                zArr172222[4] = i15 >= 21 ? true : z ? 1 : 0;
                                i4 = z ? 1 : 0;
                                i5 = i4;
                                bArr2 = Throwable.class;
                                r4 = byte[].class;
                                z2 = z;
                                while (i4 == 0) {
                                }
                            }
                            try {
                                obj2 = cls17.getMethod($$c(s2, bArr5[c4], bArr5[43]), null).invoke(obj, null);
                                c7 = 25;
                            } catch (Exception unused8) {
                                obj2 = null;
                                c7 = c5;
                                if (obj != null) {
                                }
                                i2 = 2;
                                invoke2 = null;
                                if (invoke == null) {
                                }
                                c9 = 356;
                                c8 = 219;
                                if (invoke2 == null) {
                                }
                                if (obj2 == null) {
                                }
                                byte[] bArr722222 = $$a;
                                Object[] objArr322222 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr722222[c9], bArr722222[c8])), 7);
                                objArr322222[z ? 1 : 0] = null;
                                objArr322222[1] = obj2;
                                objArr322222[2] = invoke;
                                objArr322222[3] = invoke2;
                                objArr322222[4] = obj2;
                                objArr322222[5] = invoke;
                                objArr322222[6] = invoke2;
                                boolean[] zArr1522222 = {false, true, true, true, true, true, true};
                                boolean[] zArr1622222 = {false, false, false, false, true, true, true};
                                int i6822222 = 4;
                                boolean[] zArr1722222 = new boolean[7];
                                zArr1722222[z ? 1 : 0] = z;
                                zArr1722222[1] = z;
                                zArr1722222[2] = true;
                                zArr1722222[3] = true;
                                zArr1722222[4] = z;
                                zArr1722222[5] = true;
                                zArr1722222[6] = true;
                                int i6922222 = $$b;
                                char c1122222 = 159;
                                short s322222 = (short) ((i6922222 ^ 80) | (i6922222 & 80));
                                int i7022222 = 6;
                                Class<?> cls1822222 = Class.forName($$c(s322222, bArr722222[287], bArr722222[c]));
                                i15 = cls1822222.getDeclaredField($$c(275, bArr722222[90], bArr722222[159])).getInt(cls1822222);
                                if (i15 < 34) {
                                }
                                if (i15 == 29) {
                                }
                                if (i15 >= 26) {
                                }
                                z7 = z ? 1 : 0;
                                zArr1722222[z ? 1 : 0] = z7;
                                zArr1722222[1] = i15 >= 21 ? true : z ? 1 : 0;
                                zArr1722222[4] = i15 >= 21 ? true : z ? 1 : 0;
                                i4 = z ? 1 : 0;
                                i5 = i4;
                                bArr2 = Throwable.class;
                                r4 = byte[].class;
                                z2 = z;
                                while (i4 == 0) {
                                }
                            }
                        } catch (Exception unused9) {
                            c5 = 25;
                        }
                        if (obj != null) {
                        }
                        i2 = 2;
                        invoke2 = null;
                        if (invoke == null) {
                        }
                        c9 = 356;
                        c8 = 219;
                        if (invoke2 == null) {
                        }
                        if (obj2 == null) {
                        }
                        byte[] bArr7222222 = $$a;
                        Object[] objArr3222222 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr7222222[c9], bArr7222222[c8])), 7);
                        objArr3222222[z ? 1 : 0] = null;
                        objArr3222222[1] = obj2;
                        objArr3222222[2] = invoke;
                        objArr3222222[3] = invoke2;
                        objArr3222222[4] = obj2;
                        objArr3222222[5] = invoke;
                        objArr3222222[6] = invoke2;
                        boolean[] zArr15222222 = {false, true, true, true, true, true, true};
                        boolean[] zArr16222222 = {false, false, false, false, true, true, true};
                        int i68222222 = 4;
                        boolean[] zArr17222222 = new boolean[7];
                        zArr17222222[z ? 1 : 0] = z;
                        zArr17222222[1] = z;
                        zArr17222222[2] = true;
                        zArr17222222[3] = true;
                        zArr17222222[4] = z;
                        zArr17222222[5] = true;
                        zArr17222222[6] = true;
                        int i69222222 = $$b;
                        char c11222222 = 159;
                        short s3222222 = (short) ((i69222222 ^ 80) | (i69222222 & 80));
                        int i70222222 = 6;
                        Class<?> cls18222222 = Class.forName($$c(s3222222, bArr7222222[287], bArr7222222[c]));
                        i15 = cls18222222.getDeclaredField($$c(275, bArr7222222[90], bArr7222222[159])).getInt(cls18222222);
                        if (i15 < 34) {
                        }
                        if (i15 == 29) {
                        }
                        if (i15 >= 26) {
                        }
                        z7 = z ? 1 : 0;
                        zArr17222222[z ? 1 : 0] = z7;
                        zArr17222222[1] = i15 >= 21 ? true : z ? 1 : 0;
                        zArr17222222[4] = i15 >= 21 ? true : z ? 1 : 0;
                        i4 = z ? 1 : 0;
                        i5 = i4;
                        bArr2 = Throwable.class;
                        r4 = byte[].class;
                        z2 = z;
                        while (i4 == 0) {
                        }
                    }
                    c5 = 25;
                    c6 = '+';
                    obj2 = null;
                    c7 = c5;
                    if (obj != null) {
                    }
                    i2 = 2;
                    invoke2 = null;
                    if (invoke == null) {
                    }
                    c9 = 356;
                    c8 = 219;
                    if (invoke2 == null) {
                    }
                    if (obj2 == null) {
                    }
                    byte[] bArr72222222 = $$a;
                    Object[] objArr32222222 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr72222222[c9], bArr72222222[c8])), 7);
                    objArr32222222[z ? 1 : 0] = null;
                    objArr32222222[1] = obj2;
                    objArr32222222[2] = invoke;
                    objArr32222222[3] = invoke2;
                    objArr32222222[4] = obj2;
                    objArr32222222[5] = invoke;
                    objArr32222222[6] = invoke2;
                    boolean[] zArr152222222 = {false, true, true, true, true, true, true};
                    boolean[] zArr162222222 = {false, false, false, false, true, true, true};
                    int i682222222 = 4;
                    boolean[] zArr172222222 = new boolean[7];
                    zArr172222222[z ? 1 : 0] = z;
                    zArr172222222[1] = z;
                    zArr172222222[2] = true;
                    zArr172222222[3] = true;
                    zArr172222222[4] = z;
                    zArr172222222[5] = true;
                    zArr172222222[6] = true;
                    int i692222222 = $$b;
                    char c112222222 = 159;
                    short s32222222 = (short) ((i692222222 ^ 80) | (i692222222 & 80));
                    int i702222222 = 6;
                    Class<?> cls182222222 = Class.forName($$c(s32222222, bArr72222222[287], bArr72222222[c]));
                    i15 = cls182222222.getDeclaredField($$c(275, bArr72222222[90], bArr72222222[159])).getInt(cls182222222);
                    if (i15 < 34) {
                    }
                    if (i15 == 29) {
                    }
                    if (i15 >= 26) {
                    }
                    z7 = z ? 1 : 0;
                    zArr172222222[z ? 1 : 0] = z7;
                    zArr172222222[1] = i15 >= 21 ? true : z ? 1 : 0;
                    zArr172222222[4] = i15 >= 21 ? true : z ? 1 : 0;
                    i4 = z ? 1 : 0;
                    i5 = i4;
                    bArr2 = Throwable.class;
                    r4 = byte[].class;
                    z2 = z;
                    while (i4 == 0) {
                    }
                }
                try {
                    invoke = cls.getMethod($$c(150, bArr[13], bArr[25]), null).invoke(obj, null);
                    c4 = '\r';
                } catch (Exception unused10) {
                    invoke = null;
                    c4 = c3;
                    if (obj != null) {
                    }
                    c6 = '+';
                    obj2 = null;
                    c7 = c5;
                    if (obj != null) {
                    }
                    i2 = 2;
                    invoke2 = null;
                    if (invoke == null) {
                    }
                    c9 = 356;
                    c8 = 219;
                    if (invoke2 == null) {
                    }
                    if (obj2 == null) {
                    }
                    byte[] bArr722222222 = $$a;
                    Object[] objArr322222222 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr722222222[c9], bArr722222222[c8])), 7);
                    objArr322222222[z ? 1 : 0] = null;
                    objArr322222222[1] = obj2;
                    objArr322222222[2] = invoke;
                    objArr322222222[3] = invoke2;
                    objArr322222222[4] = obj2;
                    objArr322222222[5] = invoke;
                    objArr322222222[6] = invoke2;
                    boolean[] zArr1522222222 = {false, true, true, true, true, true, true};
                    boolean[] zArr1622222222 = {false, false, false, false, true, true, true};
                    int i6822222222 = 4;
                    boolean[] zArr1722222222 = new boolean[7];
                    zArr1722222222[z ? 1 : 0] = z;
                    zArr1722222222[1] = z;
                    zArr1722222222[2] = true;
                    zArr1722222222[3] = true;
                    zArr1722222222[4] = z;
                    zArr1722222222[5] = true;
                    zArr1722222222[6] = true;
                    int i6922222222 = $$b;
                    char c1122222222 = 159;
                    short s322222222 = (short) ((i6922222222 ^ 80) | (i6922222222 & 80));
                    int i7022222222 = 6;
                    Class<?> cls1822222222 = Class.forName($$c(s322222222, bArr722222222[287], bArr722222222[c]));
                    i15 = cls1822222222.getDeclaredField($$c(275, bArr722222222[90], bArr722222222[159])).getInt(cls1822222222);
                    if (i15 < 34) {
                    }
                    if (i15 == 29) {
                    }
                    if (i15 >= 26) {
                    }
                    z7 = z ? 1 : 0;
                    zArr1722222222[z ? 1 : 0] = z7;
                    zArr1722222222[1] = i15 >= 21 ? true : z ? 1 : 0;
                    zArr1722222222[4] = i15 >= 21 ? true : z ? 1 : 0;
                    i4 = z ? 1 : 0;
                    i5 = i4;
                    bArr2 = Throwable.class;
                    r4 = byte[].class;
                    z2 = z;
                    while (i4 == 0) {
                    }
                }
                if (obj != null) {
                }
                c6 = '+';
                obj2 = null;
                c7 = c5;
                if (obj != null) {
                }
                i2 = 2;
                invoke2 = null;
                if (invoke == null) {
                }
                c9 = 356;
                c8 = 219;
                if (invoke2 == null) {
                }
                if (obj2 == null) {
                }
                byte[] bArr7222222222 = $$a;
                Object[] objArr3222222222 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr7222222222[c9], bArr7222222222[c8])), 7);
                objArr3222222222[z ? 1 : 0] = null;
                objArr3222222222[1] = obj2;
                objArr3222222222[2] = invoke;
                objArr3222222222[3] = invoke2;
                objArr3222222222[4] = obj2;
                objArr3222222222[5] = invoke;
                objArr3222222222[6] = invoke2;
                boolean[] zArr15222222222 = {false, true, true, true, true, true, true};
                boolean[] zArr16222222222 = {false, false, false, false, true, true, true};
                int i68222222222 = 4;
                boolean[] zArr17222222222 = new boolean[7];
                zArr17222222222[z ? 1 : 0] = z;
                zArr17222222222[1] = z;
                zArr17222222222[2] = true;
                zArr17222222222[3] = true;
                zArr17222222222[4] = z;
                zArr17222222222[5] = true;
                zArr17222222222[6] = true;
                int i69222222222 = $$b;
                char c11222222222 = 159;
                short s3222222222 = (short) ((i69222222222 ^ 80) | (i69222222222 & 80));
                int i70222222222 = 6;
                Class<?> cls18222222222 = Class.forName($$c(s3222222222, bArr7222222222[287], bArr7222222222[c]));
                i15 = cls18222222222.getDeclaredField($$c(275, bArr7222222222[90], bArr7222222222[159])).getInt(cls18222222222);
                if (i15 < 34) {
                }
                if (i15 == 29) {
                }
                if (i15 >= 26) {
                }
                z7 = z ? 1 : 0;
                zArr17222222222[z ? 1 : 0] = z7;
                zArr17222222222[1] = i15 >= 21 ? true : z ? 1 : 0;
                zArr17222222222[4] = i15 >= 21 ? true : z ? 1 : 0;
                i4 = z ? 1 : 0;
                i5 = i4;
                bArr2 = Throwable.class;
                r4 = byte[].class;
                z2 = z;
                while (i4 == 0) {
                }
            }
            c3 = '\r';
            invoke = null;
            c4 = c3;
            if (obj != null) {
            }
            c6 = '+';
            obj2 = null;
            c7 = c5;
            if (obj != null) {
            }
            i2 = 2;
            invoke2 = null;
            if (invoke == null) {
            }
            c9 = 356;
            c8 = 219;
            if (invoke2 == null) {
            }
            if (obj2 == null) {
            }
            byte[] bArr72222222222 = $$a;
            Object[] objArr32222222222 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr72222222222[c9], bArr72222222222[c8])), 7);
            objArr32222222222[z ? 1 : 0] = null;
            objArr32222222222[1] = obj2;
            objArr32222222222[2] = invoke;
            objArr32222222222[3] = invoke2;
            objArr32222222222[4] = obj2;
            objArr32222222222[5] = invoke;
            objArr32222222222[6] = invoke2;
            boolean[] zArr152222222222 = {false, true, true, true, true, true, true};
            boolean[] zArr162222222222 = {false, false, false, false, true, true, true};
            int i682222222222 = 4;
            boolean[] zArr172222222222 = new boolean[7];
            zArr172222222222[z ? 1 : 0] = z;
            zArr172222222222[1] = z;
            zArr172222222222[2] = true;
            zArr172222222222[3] = true;
            zArr172222222222[4] = z;
            zArr172222222222[5] = true;
            zArr172222222222[6] = true;
            int i692222222222 = $$b;
            char c112222222222 = 159;
            short s32222222222 = (short) ((i692222222222 ^ 80) | (i692222222222 & 80));
            int i702222222222 = 6;
            Class<?> cls182222222222 = Class.forName($$c(s32222222222, bArr72222222222[287], bArr72222222222[c]));
            i15 = cls182222222222.getDeclaredField($$c(275, bArr72222222222[90], bArr72222222222[159])).getInt(cls182222222222);
            if (i15 < 34) {
            }
            if (i15 == 29) {
            }
            if (i15 >= 26) {
            }
            z7 = z ? 1 : 0;
            zArr172222222222[z ? 1 : 0] = z7;
            zArr172222222222[1] = i15 >= 21 ? true : z ? 1 : 0;
            zArr172222222222[4] = i15 >= 21 ? true : z ? 1 : 0;
            i4 = z ? 1 : 0;
            i5 = i4;
            bArr2 = Throwable.class;
            r4 = byte[].class;
            z2 = z;
            while (i4 == 0) {
            }
            try {
                byte[] bArr32 = $$a;
                obj = Class.forName($$c(109, bArr32[287], bArr32[282])).getMethod($$c(130, bArr32[13], bArr32[c2]), null).invoke(null, null);
            } catch (Exception unused11) {
            }
            if (obj != null) {
            }
            c3 = '\r';
            invoke = null;
            c4 = c3;
            if (obj != null) {
            }
            c6 = '+';
            obj2 = null;
            c7 = c5;
            if (obj != null) {
            }
            i2 = 2;
            invoke2 = null;
            if (invoke == null) {
            }
            c9 = 356;
            c8 = 219;
            if (invoke2 == null) {
            }
            if (obj2 == null) {
            }
            byte[] bArr722222222222 = $$a;
            Object[] objArr322222222222 = (Object[]) Array.newInstance(Class.forName($$c(194, bArr722222222222[c9], bArr722222222222[c8])), 7);
            objArr322222222222[z ? 1 : 0] = null;
            objArr322222222222[1] = obj2;
            objArr322222222222[2] = invoke;
            objArr322222222222[3] = invoke2;
            objArr322222222222[4] = obj2;
            objArr322222222222[5] = invoke;
            objArr322222222222[6] = invoke2;
            boolean[] zArr1522222222222 = {false, true, true, true, true, true, true};
            boolean[] zArr1622222222222 = {false, false, false, false, true, true, true};
            int i6822222222222 = 4;
            boolean[] zArr1722222222222 = new boolean[7];
            zArr1722222222222[z ? 1 : 0] = z;
            zArr1722222222222[1] = z;
            zArr1722222222222[2] = true;
            zArr1722222222222[3] = true;
            zArr1722222222222[4] = z;
            zArr1722222222222[5] = true;
            zArr1722222222222[6] = true;
            int i6922222222222 = $$b;
            char c1122222222222 = 159;
            short s322222222222 = (short) ((i6922222222222 ^ 80) | (i6922222222222 & 80));
            int i7022222222222 = 6;
            Class<?> cls1822222222222 = Class.forName($$c(s322222222222, bArr722222222222[287], bArr722222222222[c]));
            i15 = cls1822222222222.getDeclaredField($$c(275, bArr722222222222[90], bArr722222222222[159])).getInt(cls1822222222222);
            if (i15 < 34) {
            }
            if (i15 == 29) {
            }
            if (i15 >= 26) {
            }
            z7 = z ? 1 : 0;
            zArr1722222222222[z ? 1 : 0] = z7;
            zArr1722222222222[1] = i15 >= 21 ? true : z ? 1 : 0;
            zArr1722222222222[4] = i15 >= 21 ? true : z ? 1 : 0;
            i4 = z ? 1 : 0;
            i5 = i4;
            bArr2 = Throwable.class;
            r4 = byte[].class;
            z2 = z;
            while (i4 == 0) {
            }
        } catch (Throwable th93) {
            Throwable cause44 = th93.getCause();
            if (cause44 == null) {
                throw th93;
            }
            throw cause44;
        }
    }

    private AFa1kSDK() {
    }

    public static Object getMediationNetwork(char c, int i2, int i3) {
        int i4 = $10 + 33;
        int i5 = i4 % 128;
        $11 = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        Object obj = w;
        $10 = ((i5 & 109) + (i5 | 109)) % 128;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i2), Integer.valueOf(i3)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(563, bArr[200], bArr[175]), true, (ClassLoader) e);
            String $$c = $$c(595, (byte) (-bArr[188]), bArr[43]);
            Class cls2 = Character.TYPE;
            Class cls3 = Integer.TYPE;
            return cls.getMethod($$c, cls2, cls3, cls3).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getMonetizationNetwork(int i2, int i3) {
        int i4 = $10 + 67;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static int getRevenue(int i2) {
        int i3 = $10;
        int i4 = (i3 ^ 91) + ((i3 & 91) << 1);
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Object obj = w;
        int i5 = ((i3 & 95) + (i3 | 95)) % 128;
        $11 = i5;
        $10 = (((i5 | 25) << 1) - (i5 ^ 25)) % 128;
        try {
            int intValue = ((Integer) Class.forName($$c(563, r0[200], r0[175]), true, (ClassLoader) e).getMethod($$c(595, (byte) (-$$a[188]), r0[43]), Integer.TYPE).invoke(obj, Integer.valueOf(i2))).intValue();
            int i6 = $11 + 115;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 11 / 0;
            }
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i2;
        int i3 = $10 + 97;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            byte[] bArr = new byte[1153];
            System.arraycopy("j¢®Pò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üü\n\u0004ó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0·%\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ú\u0002Ë1úÿÓý5Í/Ë-ÿþ\u0000Ö3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÚ9¼ \u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0·%\u000eø÷ÿú\u0004Ü\u0011ìî\u0010öø\u000f âì\u0012\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/Å\u0017\u000eø&¯Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<úÍ\u0002+\u0005þù\u0003ÿÑ,Ð3ø\u0006öÖ4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0001ð0Í\u0002ÿ\fö\né/Õ\u0003:\u0001\u0000ùóÓ\nþ".getBytes("ISO-8859-1"), 0, bArr, 0, 1153);
            $$a = bArr;
            i2 = 24963;
        } else {
            byte[] bArr2 = new byte[1153];
            System.arraycopy("j¢®Pò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üü\n\u0004ó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0·%\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ú\u0002Ë1úÿÓý5Í/Ë-ÿþ\u0000Ö3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÚ9¼ \u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0·%\u000eø÷ÿú\u0004Ü\u0011ìî\u0010öø\u000f âì\u0012\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/Å\u0017\u000eø&¯Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<úÍ\u0002+\u0005þù\u0003ÿÑ,Ð3ø\u0006öÖ4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0001ð0Í\u0002ÿ\fö\né/Õ\u0003:\u0001\u0000ùóÓ\nþ".getBytes("ISO-8859-1"), 0, bArr2, 0, 1153);
            $$a = bArr2;
            i2 = 172;
        }
        $$b = i2;
    }

    public static int getMediationNetwork(Object obj) {
        int i2 = $10;
        Object obj2 = w;
        int i3 = ((i2 & 53) + (i2 | 53)) % 128;
        $11 = i3;
        $10 = (i3 + 33) % 128;
        try {
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c(563, bArr[200], bArr[175]), true, (ClassLoader) e).getMethod($$c(1128, bArr[13], bArr[282]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
