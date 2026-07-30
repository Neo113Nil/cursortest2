package com.appsflyer.internal;

import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AFb1pSDK {
    public static byte[] getOutOfStore = null;
    public static byte[] setAndroidIdData = null;
    private static int setAppInviteOneLink = 1;
    public static int setCustomerIdAndLogSession;
    public static final int setCustomerUserId = 0;
    private static Object setDebugLog;
    public static long setImeiData;
    private static Object setOaidData;
    public static int setPhoneNumber;
    private static int setUserEmails;
    public static byte[] updateServerUninstallToken;
    public static final byte[] waitForCustomerUserId = null;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:6:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = (setUserEmails + 77) % 128;
        setAppInviteOneLink = i3;
        int i4 = -i;
        int i5 = (i4 ^ 1135) + ((i4 & 1135) << 1);
        byte[] bArr = waitForCustomerUserId;
        int i6 = b + 21;
        int i7 = (i6 & (-20)) + (i6 | (-20));
        int i8 = b2 + 144;
        int i9 = ((i8 | (-103)) << 1) - (i8 ^ (-103));
        byte[] bArr2 = new byte[i7];
        int i10 = ((i7 | 85) << 1) - (i7 ^ 85);
        int i11 = (i10 & (-86)) + (i10 | (-86));
        if (bArr == null) {
            int i12 = i3 + 77;
            setUserEmails = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            byte[] bArr3 = bArr;
            int i13 = i11;
            int i14 = 0;
            int i15 = i13 + (-i9);
            i9 = (i15 & (-3)) + (i15 | (-3));
            int i16 = setUserEmails;
            setAppInviteOneLink = (((i16 | 81) << 1) - (i16 ^ 81)) % 128;
            bArr = bArr3;
            i2 = i14;
            bArr2[i2] = (byte) i9;
            if (i2 == i11) {
                return new String(bArr2, 0);
            }
            i14 = ((i2 | 1) << 1) - (i2 ^ 1);
            int i17 = (i5 ^ 1) + ((i5 & 1) << 1);
            byte b3 = bArr[i17];
            int i18 = setUserEmails;
            setAppInviteOneLink = ((i18 ^ 75) + ((i18 & 75) << 1)) % 128;
            byte[] bArr4 = bArr;
            i13 = i9;
            i9 = b3;
            i5 = i17;
            bArr3 = bArr4;
            int i152 = i13 + (-i9);
            i9 = (i152 & (-3)) + (i152 | (-3));
            int i162 = setUserEmails;
            setAppInviteOneLink = (((i162 | 81) << 1) - (i162 ^ 81)) % 128;
            bArr = bArr3;
            i2 = i14;
            bArr2[i2] = (byte) i9;
            if (i2 == i11) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i9;
            if (i2 == i11) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:(5:972|973|974|975|976)|(50:958|959|960|961|962|963|964|965|19|(0)|957|953|(0)(0)|940|933|35|(0)(0)|38|39|(0)(0)|(0)|63|64|65|66|67|68|69|70|71|72|73|(0)(0)|76|77|78|(0)|887|83|(0)(0)|86|(0)(0)|89|90|(0)(0)|93|94|(0)|881|882)(1:16)|63|64|65|66|67|68|69|70|71|72|73|(0)(0)|76|77|78|(0)|887|83|(0)(0)|86|(0)(0)|89|90|(0)(0)|93|94|(0)|881|882) */
    /* JADX WARN: Can't wrap try/catch for region: R(53:982|983|972|973|974|975|976|14|(50:958|959|960|961|962|963|964|965|19|(0)|957|953|(0)(0)|940|933|35|(0)(0)|38|39|(0)(0)|(0)|63|64|65|66|67|68|69|70|71|72|73|(0)(0)|76|77|78|(0)|887|83|(0)(0)|86|(0)(0)|89|90|(0)(0)|93|94|(0)|881|882)(1:16)|17|18|19|(0)|957|953|(0)(0)|940|933|35|(0)(0)|38|39|(0)(0)|(0)|63|64|65|66|67|68|69|70|71|72|73|(0)(0)|76|77|78|(0)|887|83|(0)(0)|86|(0)(0)|89|90|(0)(0)|93|94|(0)|881|882) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x047c, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r14, (short) ((r14 ^ 112) | (r14 & 112)), r0[r27])).getMethod($$c(r0[165(0xa5, float:2.31E-43)], 196, r0[26]), null).invoke(r15, null)).booleanValue() != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x028a, code lost:
    
        if (r11 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0291, code lost:
    
        r5 = com.appsflyer.internal.AFb1pSDK.waitForCustomerUserId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02a1, code lost:
    
        r12 = new java.lang.Object[2];
        r12[r22 ? 1 : 0] = $$c(r5[210(0xd2, float:2.94E-43)], 705, r5[r25]);
        r12[r19 ? 1 : 0] = r11;
        r8 = r5[r26];
        r8 = java.lang.Class.forName($$c(r8, (short) ((r8 ^ 112) | (r8 & 112)), r5[r27]));
        r13 = r5[r26];
        r12 = r8.getDeclaredConstructor(java.lang.Class.forName($$c(r13, (short) ((r13 ^ 112) | (r13 & 112)), r5[r27])), java.lang.String.class).newInstance(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02dd, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02e1, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02e3, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028f, code lost:
    
        if (r11 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x03eb, code lost:
    
        r36 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:895:0x03ee, code lost:
    
        r36 = 2;
        r35 = 4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x16f7 A[Catch: Exception -> 0x17bd, TRY_ENTER, TryCatch #47 {Exception -> 0x17bd, blocks: (B:3:0x001a, B:5:0x0035, B:47:0x0288, B:49:0x0291, B:54:0x02dd, B:56:0x02e3, B:58:0x02e4, B:65:0x0310, B:67:0x0369, B:70:0x036e, B:73:0x0376, B:77:0x03a2, B:83:0x03bc, B:86:0x03c7, B:89:0x03d2, B:93:0x03e8, B:99:0x040f, B:212:0x16f7, B:216:0x16fb, B:219:0x1779, B:214:0x1704, B:221:0x1717, B:228:0x1758, B:230:0x175e, B:231:0x175f, B:898:0x179a, B:900:0x17a0, B:901:0x17a1, B:902:0x0216, B:909:0x17a3, B:911:0x17a9, B:912:0x17aa, B:915:0x17ac, B:917:0x17b2, B:918:0x17b3, B:921:0x01c8, B:926:0x17b5, B:928:0x17bb, B:929:0x17bc, B:224:0x172c, B:225:0x1756, B:64:0x02e5, B:906:0x0258, B:904:0x0228, B:923:0x01eb, B:51:0x02a1), top: B:2:0x001a, inners: #23, #50, #51, #53, #55, #76 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x12fa A[Catch: all -> 0x1195, Exception -> 0x1313, LOOP:4: B:254:0x12f8->B:255:0x12fa, LOOP_END, TryCatch #15 {Exception -> 0x1313, blocks: (B:253:0x126b, B:255:0x12fa, B:257:0x131a), top: B:252:0x126b, outer: #86 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x13bd A[Catch: all -> 0x1195, TRY_LEAVE, TryCatch #48 {all -> 0x1195, blocks: (B:327:0x132a, B:332:0x1391, B:334:0x139b, B:267:0x140d, B:272:0x1422, B:338:0x13b5, B:340:0x13bb, B:341:0x13bc, B:262:0x13bd, B:264:0x13ea, B:321:0x13f4, B:322:0x13fa, B:247:0x11f0, B:250:0x1261, B:253:0x126b, B:255:0x12fa, B:257:0x131a, B:258:0x1320, B:344:0x1324, B:375:0x11cd, B:377:0x11d3, B:378:0x11d4, B:382:0x118e, B:384:0x1194, B:385:0x1198, B:330:0x1378), top: B:326:0x132a, inners: #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x13fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x1528 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x132a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x1324 A[Catch: all -> 0x1195, TryCatch #48 {all -> 0x1195, blocks: (B:327:0x132a, B:332:0x1391, B:334:0x139b, B:267:0x140d, B:272:0x1422, B:338:0x13b5, B:340:0x13bb, B:341:0x13bc, B:262:0x13bd, B:264:0x13ea, B:321:0x13f4, B:322:0x13fa, B:247:0x11f0, B:250:0x1261, B:253:0x126b, B:255:0x12fa, B:257:0x131a, B:258:0x1320, B:344:0x1324, B:375:0x11cd, B:377:0x11d3, B:378:0x11d4, B:382:0x118e, B:384:0x1194, B:385:0x1198, B:330:0x1378), top: B:326:0x132a, inners: #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:884:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:885:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:886:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:888:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x0216 A[Catch: Exception -> 0x17bd, TRY_ENTER, TRY_LEAVE, TryCatch #47 {Exception -> 0x17bd, blocks: (B:3:0x001a, B:5:0x0035, B:47:0x0288, B:49:0x0291, B:54:0x02dd, B:56:0x02e3, B:58:0x02e4, B:65:0x0310, B:67:0x0369, B:70:0x036e, B:73:0x0376, B:77:0x03a2, B:83:0x03bc, B:86:0x03c7, B:89:0x03d2, B:93:0x03e8, B:99:0x040f, B:212:0x16f7, B:216:0x16fb, B:219:0x1779, B:214:0x1704, B:221:0x1717, B:228:0x1758, B:230:0x175e, B:231:0x175f, B:898:0x179a, B:900:0x17a0, B:901:0x17a1, B:902:0x0216, B:909:0x17a3, B:911:0x17a9, B:912:0x17aa, B:915:0x17ac, B:917:0x17b2, B:918:0x17b3, B:921:0x01c8, B:926:0x17b5, B:928:0x17bb, B:929:0x17bc, B:224:0x172c, B:225:0x1756, B:64:0x02e5, B:906:0x0258, B:904:0x0228, B:923:0x01eb, B:51:0x02a1), top: B:2:0x001a, inners: #23, #50, #51, #53, #55, #76 }] */
    /* JADX WARN: Removed duplicated region for block: B:919:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:942:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:958:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f7  */
    /* JADX WARN: Type inference failed for: r0v174, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v44 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r7v137, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.String] */
    static {
        boolean z;
        char c;
        Object obj;
        char c2;
        char c3;
        Class<?> cls;
        byte b;
        int i;
        char c4;
        Object invoke;
        char c5;
        char c6;
        boolean z2;
        char c7;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        char c8;
        char c9;
        int i4;
        char c10;
        int i5;
        int i6;
        int i7;
        String str;
        boolean[] zArr;
        Throwable th;
        boolean[] zArr2;
        boolean[] zArr3;
        Object[] objArr;
        int i8;
        int i9;
        int i10;
        char c11;
        int i11;
        boolean z3;
        Object obj4;
        boolean z4;
        Random random;
        int i12;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        int i13;
        String sb;
        Object obj14;
        int i14;
        int i15;
        int i16;
        Class<?> cls2;
        byte b2;
        Object obj15;
        Object obj16;
        Object[] objArr2;
        InputStream inputStream;
        Class cls3;
        String str2;
        Object invoke2;
        Class cls4;
        byte[] bArr;
        byte[] bArr2;
        int i17;
        Object invoke3;
        int length;
        int i18;
        int i19;
        boolean z5;
        boolean z6;
        boolean z7;
        Method method;
        init$0();
        setPhoneNumber = 2;
        setCustomerIdAndLogSession = 0;
        setImeiData = -7667004608863316743L;
        try {
            byte[] bArr3 = waitForCustomerUserId;
            byte b3 = bArr3[226];
            int i20 = 26;
            i20 = 26;
            i20 = 26;
            i20 = 26;
            String $$c = $$c(b3, (short) ((b3 ^ 972) | (b3 & 972)), bArr3[26]);
            Throwable th2 = null;
            String $$c2 = setDebugLog == null ? $$c(bArr3[21], bArr3[580], bArr3[26]) : null;
            try {
                byte b4 = bArr3[989];
                int i21 = setCustomerUserId;
                z = false;
                short s = (short) ((i21 ^ 114) | (i21 & 114));
                c = 520;
                try {
                    Class<?> cls5 = Class.forName($$c(b4, s, (byte) (-bArr3[27])));
                    byte b5 = bArr3[15];
                    obj = cls5.getMethod($$c(b5, (short) (b5 | 1004), bArr3[26]), null).invoke(null, null);
                } catch (Exception unused) {
                    obj = null;
                    try {
                        try {
                            c2 = 490;
                            try {
                                obj = Class.forName($$c(r5[c], 570, (byte) (-waitForCustomerUserId[27]))).getMethod($$c(r5[490], (short) (setCustomerUserId | 7), r5[35]), null).invoke(null, null);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            c2 = 490;
                            if (obj == null) {
                            }
                            c4 = 27;
                            invoke = null;
                            c6 = c3;
                            c5 = c4;
                            if (obj != null) {
                            }
                            z2 = true;
                            c7 = '\\';
                            obj2 = null;
                            if (obj == null) {
                            }
                            i3 = i20;
                            obj3 = null;
                            if (invoke != null) {
                            }
                            c8 = 268;
                            c9 = 244;
                            if (obj3 == null) {
                            }
                            if (obj2 == null) {
                            }
                            byte[] bArr4 = waitForCustomerUserId;
                            Object invoke4 = Class.forName($$c(bArr4[c], 467, (byte) (-bArr4[c5]))).getMethod($$c(bArr4[82], 549, bArr4[35]), null).invoke(null, null);
                            byte b6 = bArr4[c8];
                            int i22 = 9;
                            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName($$c(b6, (short) ((b6 ^ 112) | (b6 & 112)), bArr4[c9])), 9);
                            objArr3[z ? 1 : 0] = null;
                            objArr3[z2 ? 1 : 0] = obj2;
                            objArr3[2] = invoke;
                            objArr3[3] = obj3;
                            int i23 = 3;
                            objArr3[4] = invoke4;
                            objArr3[5] = obj2;
                            objArr3[6] = invoke;
                            objArr3[c6] = obj3;
                            objArr3[8] = invoke4;
                            boolean[] zArr4 = {false, true, true, true, true, true, true, true, true};
                            boolean[] zArr5 = {false, false, false, false, false, true, true, true, true};
                            boolean[] zArr6 = new boolean[9];
                            zArr6[z ? 1 : 0] = z;
                            zArr6[z2 ? 1 : 0] = z;
                            zArr6[2] = z2;
                            zArr6[3] = z2;
                            zArr6[4] = z;
                            zArr6[5] = z;
                            zArr6[6] = z2;
                            zArr6[c6] = z2;
                            zArr6[8] = z;
                            int i24 = 4;
                            int i25 = 2;
                            Class<?> cls6 = Class.forName($$c(bArr4[z ? 1 : 0], 858, (byte) (-bArr4[c5])));
                            i19 = cls6.getDeclaredField($$c(bArr4[i4], 385, bArr4[398])).getInt(cls6);
                            if (i19 != i4) {
                            }
                            z5 = z ? 1 : 0;
                            zArr6[z ? 1 : 0] = z5;
                            if (i19 >= 21) {
                            }
                            z6 = z ? 1 : 0;
                            zArr6[z2 ? 1 : 0] = z6;
                            zArr6[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                            zArr6[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                            if (i19 < 16) {
                            }
                            zArr6[8] = z7;
                            i5 = z ? 1 : 0;
                            int i26 = i5;
                            boolean z8 = z2;
                            while (i5 == 0) {
                            }
                            return;
                        }
                        if (obj == null) {
                            try {
                                cls = obj.getClass();
                                b = waitForCustomerUserId[12];
                                c3 = 7;
                            } catch (Exception unused4) {
                                c3 = 7;
                            }
                            try {
                                i = setCustomerUserId;
                                c4 = 27;
                            } catch (Exception unused5) {
                                c4 = 27;
                                invoke = null;
                                c6 = c3;
                                c5 = c4;
                                if (obj != null) {
                                    int i27 = setAppInviteOneLink;
                                    int i28 = (i27 ^ 49) + ((i27 & 49) << 1);
                                    setUserEmails = i28 % 128;
                                    try {
                                        if (i28 % 2 != 0) {
                                            try {
                                                Class<?> cls7 = obj.getClass();
                                                byte[] bArr5 = waitForCustomerUserId;
                                                c7 = '\\';
                                                try {
                                                    z2 = true;
                                                    i2 = 76;
                                                    method = cls7.getMethod($$c(bArr5[104], (short) (setCustomerUserId & 14976), bArr5[76]), null);
                                                } catch (Exception unused6) {
                                                    z2 = true;
                                                    obj2 = null;
                                                    if (obj == null) {
                                                    }
                                                    i3 = i20;
                                                    obj3 = null;
                                                    if (invoke != null) {
                                                    }
                                                    c8 = 268;
                                                    c9 = 244;
                                                    if (obj3 == null) {
                                                    }
                                                    if (obj2 == null) {
                                                    }
                                                    byte[] bArr42 = waitForCustomerUserId;
                                                    Object invoke42 = Class.forName($$c(bArr42[c], 467, (byte) (-bArr42[c5]))).getMethod($$c(bArr42[82], 549, bArr42[35]), null).invoke(null, null);
                                                    byte b62 = bArr42[c8];
                                                    int i222 = 9;
                                                    Object[] objArr32 = (Object[]) Array.newInstance(Class.forName($$c(b62, (short) ((b62 ^ 112) | (b62 & 112)), bArr42[c9])), 9);
                                                    objArr32[z ? 1 : 0] = null;
                                                    objArr32[z2 ? 1 : 0] = obj2;
                                                    objArr32[2] = invoke;
                                                    objArr32[3] = obj3;
                                                    int i232 = 3;
                                                    objArr32[4] = invoke42;
                                                    objArr32[5] = obj2;
                                                    objArr32[6] = invoke;
                                                    objArr32[c6] = obj3;
                                                    objArr32[8] = invoke42;
                                                    boolean[] zArr42 = {false, true, true, true, true, true, true, true, true};
                                                    boolean[] zArr52 = {false, false, false, false, false, true, true, true, true};
                                                    boolean[] zArr62 = new boolean[9];
                                                    zArr62[z ? 1 : 0] = z;
                                                    zArr62[z2 ? 1 : 0] = z;
                                                    zArr62[2] = z2;
                                                    zArr62[3] = z2;
                                                    zArr62[4] = z;
                                                    zArr62[5] = z;
                                                    zArr62[6] = z2;
                                                    zArr62[c6] = z2;
                                                    zArr62[8] = z;
                                                    int i242 = 4;
                                                    int i252 = 2;
                                                    Class<?> cls62 = Class.forName($$c(bArr42[z ? 1 : 0], 858, (byte) (-bArr42[c5])));
                                                    i19 = cls62.getDeclaredField($$c(bArr42[i4], 385, bArr42[398])).getInt(cls62);
                                                    if (i19 != i4) {
                                                    }
                                                    z5 = z ? 1 : 0;
                                                    zArr62[z ? 1 : 0] = z5;
                                                    if (i19 >= 21) {
                                                    }
                                                    z6 = z ? 1 : 0;
                                                    zArr62[z2 ? 1 : 0] = z6;
                                                    zArr62[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                    zArr62[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                    if (i19 < 16) {
                                                    }
                                                    zArr62[8] = z7;
                                                    i5 = z ? 1 : 0;
                                                    int i262 = i5;
                                                    boolean z82 = z2;
                                                    while (i5 == 0) {
                                                    }
                                                    return;
                                                }
                                            } catch (Exception unused7) {
                                                z2 = true;
                                                c7 = '\\';
                                                obj2 = null;
                                                if (obj == null) {
                                                }
                                                i3 = i20;
                                                obj3 = null;
                                                if (invoke != null) {
                                                }
                                                c8 = 268;
                                                c9 = 244;
                                                if (obj3 == null) {
                                                }
                                                if (obj2 == null) {
                                                }
                                                byte[] bArr422 = waitForCustomerUserId;
                                                Object invoke422 = Class.forName($$c(bArr422[c], 467, (byte) (-bArr422[c5]))).getMethod($$c(bArr422[82], 549, bArr422[35]), null).invoke(null, null);
                                                byte b622 = bArr422[c8];
                                                int i2222 = 9;
                                                Object[] objArr322 = (Object[]) Array.newInstance(Class.forName($$c(b622, (short) ((b622 ^ 112) | (b622 & 112)), bArr422[c9])), 9);
                                                objArr322[z ? 1 : 0] = null;
                                                objArr322[z2 ? 1 : 0] = obj2;
                                                objArr322[2] = invoke;
                                                objArr322[3] = obj3;
                                                int i2322 = 3;
                                                objArr322[4] = invoke422;
                                                objArr322[5] = obj2;
                                                objArr322[6] = invoke;
                                                objArr322[c6] = obj3;
                                                objArr322[8] = invoke422;
                                                boolean[] zArr422 = {false, true, true, true, true, true, true, true, true};
                                                boolean[] zArr522 = {false, false, false, false, false, true, true, true, true};
                                                boolean[] zArr622 = new boolean[9];
                                                zArr622[z ? 1 : 0] = z;
                                                zArr622[z2 ? 1 : 0] = z;
                                                zArr622[2] = z2;
                                                zArr622[3] = z2;
                                                zArr622[4] = z;
                                                zArr622[5] = z;
                                                zArr622[6] = z2;
                                                zArr622[c6] = z2;
                                                zArr622[8] = z;
                                                int i2422 = 4;
                                                int i2522 = 2;
                                                Class<?> cls622 = Class.forName($$c(bArr422[z ? 1 : 0], 858, (byte) (-bArr422[c5])));
                                                i19 = cls622.getDeclaredField($$c(bArr422[i4], 385, bArr422[398])).getInt(cls622);
                                                if (i19 != i4) {
                                                }
                                                z5 = z ? 1 : 0;
                                                zArr622[z ? 1 : 0] = z5;
                                                if (i19 >= 21) {
                                                }
                                                z6 = z ? 1 : 0;
                                                zArr622[z2 ? 1 : 0] = z6;
                                                zArr622[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                zArr622[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                if (i19 < 16) {
                                                }
                                                zArr622[8] = z7;
                                                i5 = z ? 1 : 0;
                                                int i2622 = i5;
                                                boolean z822 = z2;
                                                while (i5 == 0) {
                                                }
                                                return;
                                            }
                                        } else {
                                            z2 = true;
                                            c7 = '\\';
                                            Class<?> cls8 = obj.getClass();
                                            byte[] bArr6 = waitForCustomerUserId;
                                            method = cls8.getMethod($$c(bArr6[92], (short) (setCustomerUserId | 529), bArr6[35]), null);
                                        }
                                        obj2 = method.invoke(obj, null);
                                    } catch (Exception unused8) {
                                    }
                                    if (obj == null) {
                                        int i29 = setAppInviteOneLink;
                                        int i30 = ((i29 | 87) << 1) - (i29 ^ 87);
                                        setUserEmails = i30 % 128;
                                        try {
                                            if (i30 % 2 != 0) {
                                                try {
                                                    Class<?> cls9 = obj.getClass();
                                                    byte b7 = waitForCustomerUserId[60];
                                                    i2 = 12;
                                                    obj3 = cls9.getMethod($$c(b7, (short) (b7 | 10039), r14[87]), null).invoke(obj, null);
                                                    i3 = 26;
                                                } catch (Exception unused9) {
                                                    i2 = 12;
                                                    i3 = i20;
                                                    obj3 = null;
                                                    if (invoke != null) {
                                                    }
                                                    c8 = 268;
                                                    c9 = 244;
                                                    if (obj3 == null) {
                                                    }
                                                    if (obj2 == null) {
                                                    }
                                                    byte[] bArr4222 = waitForCustomerUserId;
                                                    Object invoke4222 = Class.forName($$c(bArr4222[c], 467, (byte) (-bArr4222[c5]))).getMethod($$c(bArr4222[82], 549, bArr4222[35]), null).invoke(null, null);
                                                    byte b6222 = bArr4222[c8];
                                                    int i22222 = 9;
                                                    Object[] objArr3222 = (Object[]) Array.newInstance(Class.forName($$c(b6222, (short) ((b6222 ^ 112) | (b6222 & 112)), bArr4222[c9])), 9);
                                                    objArr3222[z ? 1 : 0] = null;
                                                    objArr3222[z2 ? 1 : 0] = obj2;
                                                    objArr3222[2] = invoke;
                                                    objArr3222[3] = obj3;
                                                    int i23222 = 3;
                                                    objArr3222[4] = invoke4222;
                                                    objArr3222[5] = obj2;
                                                    objArr3222[6] = invoke;
                                                    objArr3222[c6] = obj3;
                                                    objArr3222[8] = invoke4222;
                                                    boolean[] zArr4222 = {false, true, true, true, true, true, true, true, true};
                                                    boolean[] zArr5222 = {false, false, false, false, false, true, true, true, true};
                                                    boolean[] zArr6222 = new boolean[9];
                                                    zArr6222[z ? 1 : 0] = z;
                                                    zArr6222[z2 ? 1 : 0] = z;
                                                    zArr6222[2] = z2;
                                                    zArr6222[3] = z2;
                                                    zArr6222[4] = z;
                                                    zArr6222[5] = z;
                                                    zArr6222[6] = z2;
                                                    zArr6222[c6] = z2;
                                                    zArr6222[8] = z;
                                                    int i24222 = 4;
                                                    int i25222 = 2;
                                                    Class<?> cls6222 = Class.forName($$c(bArr4222[z ? 1 : 0], 858, (byte) (-bArr4222[c5])));
                                                    i19 = cls6222.getDeclaredField($$c(bArr4222[i4], 385, bArr4222[398])).getInt(cls6222);
                                                    if (i19 != i4) {
                                                    }
                                                    z5 = z ? 1 : 0;
                                                    zArr6222[z ? 1 : 0] = z5;
                                                    if (i19 >= 21) {
                                                    }
                                                    z6 = z ? 1 : 0;
                                                    zArr6222[z2 ? 1 : 0] = z6;
                                                    zArr6222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                    zArr6222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                    if (i19 < 16) {
                                                    }
                                                    zArr6222[8] = z7;
                                                    i5 = z ? 1 : 0;
                                                    int i26222 = i5;
                                                    boolean z8222 = z2;
                                                    while (i5 == 0) {
                                                    }
                                                    return;
                                                }
                                            } else {
                                                i2 = 12;
                                                Class<?> cls10 = obj.getClass();
                                                byte b8 = waitForCustomerUserId[12];
                                                i3 = 26;
                                                try {
                                                    ?? $$c3 = $$c(b8, (short) ((b8 & 741) | (b8 ^ 741)), r13[35]);
                                                    obj3 = cls10.getMethod($$c3, null).invoke(obj, null);
                                                    i20 = $$c3;
                                                } catch (Exception unused10) {
                                                    obj3 = null;
                                                    if (invoke != null) {
                                                    }
                                                    c8 = 268;
                                                    c9 = 244;
                                                    if (obj3 == null) {
                                                    }
                                                    if (obj2 == null) {
                                                    }
                                                    byte[] bArr42222 = waitForCustomerUserId;
                                                    Object invoke42222 = Class.forName($$c(bArr42222[c], 467, (byte) (-bArr42222[c5]))).getMethod($$c(bArr42222[82], 549, bArr42222[35]), null).invoke(null, null);
                                                    byte b62222 = bArr42222[c8];
                                                    int i222222 = 9;
                                                    Object[] objArr32222 = (Object[]) Array.newInstance(Class.forName($$c(b62222, (short) ((b62222 ^ 112) | (b62222 & 112)), bArr42222[c9])), 9);
                                                    objArr32222[z ? 1 : 0] = null;
                                                    objArr32222[z2 ? 1 : 0] = obj2;
                                                    objArr32222[2] = invoke;
                                                    objArr32222[3] = obj3;
                                                    int i232222 = 3;
                                                    objArr32222[4] = invoke42222;
                                                    objArr32222[5] = obj2;
                                                    objArr32222[6] = invoke;
                                                    objArr32222[c6] = obj3;
                                                    objArr32222[8] = invoke42222;
                                                    boolean[] zArr42222 = {false, true, true, true, true, true, true, true, true};
                                                    boolean[] zArr52222 = {false, false, false, false, false, true, true, true, true};
                                                    boolean[] zArr62222 = new boolean[9];
                                                    zArr62222[z ? 1 : 0] = z;
                                                    zArr62222[z2 ? 1 : 0] = z;
                                                    zArr62222[2] = z2;
                                                    zArr62222[3] = z2;
                                                    zArr62222[4] = z;
                                                    zArr62222[5] = z;
                                                    zArr62222[6] = z2;
                                                    zArr62222[c6] = z2;
                                                    zArr62222[8] = z;
                                                    int i242222 = 4;
                                                    int i252222 = 2;
                                                    Class<?> cls62222 = Class.forName($$c(bArr42222[z ? 1 : 0], 858, (byte) (-bArr42222[c5])));
                                                    i19 = cls62222.getDeclaredField($$c(bArr42222[i4], 385, bArr42222[398])).getInt(cls62222);
                                                    if (i19 != i4) {
                                                    }
                                                    z5 = z ? 1 : 0;
                                                    zArr62222[z ? 1 : 0] = z5;
                                                    if (i19 >= 21) {
                                                    }
                                                    z6 = z ? 1 : 0;
                                                    zArr62222[z2 ? 1 : 0] = z6;
                                                    zArr62222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                    zArr62222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                    if (i19 < 16) {
                                                    }
                                                    zArr62222[8] = z7;
                                                    i5 = z ? 1 : 0;
                                                    int i262222 = i5;
                                                    boolean z82222 = z2;
                                                    while (i5 == 0) {
                                                    }
                                                    return;
                                                }
                                            }
                                        } catch (Exception unused11) {
                                        }
                                        if (invoke != null) {
                                            setAppInviteOneLink = (setUserEmails + 63) % 128;
                                            i4 = 29;
                                        } else {
                                            if ($$c2 != null) {
                                                StringBuilder sb2 = new StringBuilder();
                                                byte[] bArr7 = waitForCustomerUserId;
                                                c8 = 268;
                                                c9 = 244;
                                                i4 = 29;
                                                sb2.append($$c(bArr7[i2], 404, bArr7[29]));
                                                sb2.append($$c2);
                                                try {
                                                    Object[] objArr4 = {sb2.toString()};
                                                    byte b9 = bArr7[268];
                                                    invoke = Class.forName($$c(b9, (short) ((b9 ^ 112) | (b9 & 112)), bArr7[244])).getDeclaredConstructor(String.class).newInstance(objArr4);
                                                    if (obj3 == null) {
                                                        c10 = 693;
                                                    } else {
                                                        byte[] bArr8 = waitForCustomerUserId;
                                                        byte b10 = bArr8[693];
                                                        try {
                                                            c10 = 693;
                                                            try {
                                                                Object[] objArr5 = {Class.forName($$c(bArr8[270], 1036, bArr8[c9])).getMethod($$c(bArr8[i2], 274, bArr8[35]), String.class).invoke(null, $$c(b10, (short) ((b10 ^ 274) | (b10 & 274)), bArr8[c9]))};
                                                                byte b11 = bArr8[c8];
                                                                obj3 = Class.forName($$c(b11, (short) (b11 | 112), bArr8[c9])).getDeclaredConstructor(String.class).newInstance(objArr5);
                                                            } catch (Throwable th3) {
                                                                Throwable cause = th3.getCause();
                                                                if (cause == null) {
                                                                    throw th3;
                                                                }
                                                                throw cause;
                                                            }
                                                        } catch (Throwable th4) {
                                                            Throwable cause2 = th4.getCause();
                                                            if (cause2 == null) {
                                                                throw th4;
                                                            }
                                                            throw cause2;
                                                        }
                                                    }
                                                    if (obj2 == null) {
                                                        int i31 = setAppInviteOneLink + 53;
                                                        setUserEmails = i31 % 128;
                                                        if (i31 % 2 != 0) {
                                                            int i32 = 23 / 0;
                                                        }
                                                        throw new RuntimeException(e);
                                                    }
                                                    byte[] bArr422222 = waitForCustomerUserId;
                                                    Object invoke422222 = Class.forName($$c(bArr422222[c], 467, (byte) (-bArr422222[c5]))).getMethod($$c(bArr422222[82], 549, bArr422222[35]), null).invoke(null, null);
                                                    byte b622222 = bArr422222[c8];
                                                    int i2222222 = 9;
                                                    Object[] objArr322222 = (Object[]) Array.newInstance(Class.forName($$c(b622222, (short) ((b622222 ^ 112) | (b622222 & 112)), bArr422222[c9])), 9);
                                                    objArr322222[z ? 1 : 0] = null;
                                                    objArr322222[z2 ? 1 : 0] = obj2;
                                                    objArr322222[2] = invoke;
                                                    objArr322222[3] = obj3;
                                                    int i2322222 = 3;
                                                    objArr322222[4] = invoke422222;
                                                    objArr322222[5] = obj2;
                                                    objArr322222[6] = invoke;
                                                    objArr322222[c6] = obj3;
                                                    objArr322222[8] = invoke422222;
                                                    boolean[] zArr422222 = {false, true, true, true, true, true, true, true, true};
                                                    boolean[] zArr522222 = {false, false, false, false, false, true, true, true, true};
                                                    boolean[] zArr622222 = new boolean[9];
                                                    zArr622222[z ? 1 : 0] = z;
                                                    zArr622222[z2 ? 1 : 0] = z;
                                                    zArr622222[2] = z2;
                                                    zArr622222[3] = z2;
                                                    zArr622222[4] = z;
                                                    zArr622222[5] = z;
                                                    zArr622222[6] = z2;
                                                    zArr622222[c6] = z2;
                                                    zArr622222[8] = z;
                                                    int i2422222 = 4;
                                                    int i2522222 = 2;
                                                    Class<?> cls622222 = Class.forName($$c(bArr422222[z ? 1 : 0], 858, (byte) (-bArr422222[c5])));
                                                    i19 = cls622222.getDeclaredField($$c(bArr422222[i4], 385, bArr422222[398])).getInt(cls622222);
                                                    if (i19 != i4 && i19 >= i3) {
                                                        z5 = z2 ? 1 : 0;
                                                        zArr622222[z ? 1 : 0] = z5;
                                                        if (i19 >= 21) {
                                                            int i33 = setUserEmails;
                                                            int i34 = (i33 & 103) + (i33 | 103);
                                                            setAppInviteOneLink = i34 % 128;
                                                            if (i34 % 2 != 0) {
                                                                z6 = z2 ? 1 : 0;
                                                                zArr622222[z2 ? 1 : 0] = z6;
                                                                zArr622222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                                zArr622222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                                if (i19 < 16) {
                                                                    int i35 = setAppInviteOneLink;
                                                                    setUserEmails = ((i35 & 51) + (i35 | 51)) % 128;
                                                                    z7 = z2 ? 1 : 0;
                                                                } else {
                                                                    z7 = z ? 1 : 0;
                                                                }
                                                                zArr622222[8] = z7;
                                                                i5 = z ? 1 : 0;
                                                                int i2622222 = i5;
                                                                boolean z822222 = z2;
                                                                while (i5 == 0) {
                                                                    int i36 = setAppInviteOneLink;
                                                                    int i37 = ((i36 ^ 81) + ((i36 & 81) << 1)) % 128;
                                                                    setUserEmails = i37;
                                                                    if (i2622222 >= i2222222) {
                                                                        return;
                                                                    }
                                                                    int i38 = ((i37 & 107) + (i37 | 107)) % 128;
                                                                    setAppInviteOneLink = i38;
                                                                    if (zArr622222[i2622222]) {
                                                                        try {
                                                                            z3 = zArr422222[i2622222];
                                                                            c11 = 597;
                                                                            try {
                                                                                obj4 = objArr322222[i2622222];
                                                                                z4 = zArr522222[i2622222];
                                                                                if (z3) {
                                                                                    int i39 = (i38 & 85) + (i38 | 85);
                                                                                    i10 = i2222222;
                                                                                    int i40 = i39 % 128;
                                                                                    setUserEmails = i40;
                                                                                    try {
                                                                                        if (i39 % 2 != 0) {
                                                                                            throw th2;
                                                                                        }
                                                                                        if (obj4 != null) {
                                                                                            int i41 = (i40 & 61) + (i40 | 61);
                                                                                            setAppInviteOneLink = i41 % 128;
                                                                                            if (i41 % 2 == 0) {
                                                                                                throw th2;
                                                                                            }
                                                                                            try {
                                                                                                byte b12 = waitForCustomerUserId[c8];
                                                                                                i6 = i5;
                                                                                                try {
                                                                                                } catch (Throwable th5) {
                                                                                                    th = th5;
                                                                                                    Throwable cause3 = th.getCause();
                                                                                                    if (cause3 == null) {
                                                                                                        throw th;
                                                                                                    }
                                                                                                    throw cause3;
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                            }
                                                                                        } else {
                                                                                            i6 = i5;
                                                                                        }
                                                                                        StringBuilder sb3 = new StringBuilder();
                                                                                        byte[] bArr9 = waitForCustomerUserId;
                                                                                        sb3.append($$c(bArr9[107], 626, bArr9[981]));
                                                                                        sb3.append(obj4);
                                                                                        byte b13 = bArr9[90];
                                                                                        byte b14 = b13;
                                                                                        sb3.append($$c(b14, (short) ((b14 ^ 725) | (b14 & 725)), b13));
                                                                                        try {
                                                                                            Object[] objArr6 = {sb3.toString()};
                                                                                            byte b15 = bArr9[31];
                                                                                            int i42 = setCustomerUserId;
                                                                                            throw ((Throwable) Class.forName($$c(b15, (short) ((i42 & 53) | (i42 ^ 53)), bArr9[c9])).getDeclaredConstructor(String.class).newInstance(objArr6));
                                                                                        } catch (Throwable th7) {
                                                                                            Throwable cause4 = th7.getCause();
                                                                                            if (cause4 == null) {
                                                                                                throw th7;
                                                                                            }
                                                                                            throw cause4;
                                                                                        }
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                        i7 = i2622222;
                                                                                        str = $$c;
                                                                                        zArr = zArr422222;
                                                                                        zArr2 = zArr522222;
                                                                                        zArr3 = zArr622222;
                                                                                        objArr = objArr322222;
                                                                                        i11 = (i7 & 1) + (i7 | 1);
                                                                                        i8 = i10;
                                                                                        while (i11 < i8) {
                                                                                        }
                                                                                        byte b16 = waitForCustomerUserId[c11];
                                                                                        int i43 = setCustomerUserId;
                                                                                        String $$c4 = $$c(b16, (short) ((i43 ^ 512) | (i43 & 512)), r2[981]);
                                                                                        try {
                                                                                            Object[] objArr7 = new Object[2];
                                                                                            objArr7[1] = th;
                                                                                            objArr7[z ? 1 : 0] = $$c4;
                                                                                            throw ((Throwable) Class.forName($$c(r2[31], (short) ((i43 ^ 53) | (i43 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr7));
                                                                                        } catch (Throwable th9) {
                                                                                            Throwable cause5 = th9.getCause();
                                                                                            if (cause5 == null) {
                                                                                                throw th9;
                                                                                            }
                                                                                            throw cause5;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i6 = i5;
                                                                                i10 = i2222222;
                                                                            } catch (Throwable th10) {
                                                                                th = th10;
                                                                                i6 = i5;
                                                                                i7 = i2622222;
                                                                                str = $$c;
                                                                                zArr = zArr422222;
                                                                                zArr2 = zArr522222;
                                                                                zArr3 = zArr622222;
                                                                                objArr = objArr322222;
                                                                                i10 = i2222222;
                                                                            }
                                                                        } catch (Throwable th11) {
                                                                            th = th11;
                                                                            i6 = i5;
                                                                            i7 = i2622222;
                                                                            str = $$c;
                                                                            zArr = zArr422222;
                                                                            zArr2 = zArr522222;
                                                                            zArr3 = zArr622222;
                                                                            objArr = objArr322222;
                                                                            i10 = i2222222;
                                                                            c11 = 597;
                                                                        }
                                                                        if (z3) {
                                                                            try {
                                                                                random = new Random();
                                                                                try {
                                                                                    byte[] bArr10 = waitForCustomerUserId;
                                                                                    i12 = -1;
                                                                                    i7 = i2622222;
                                                                                    try {
                                                                                        Class<?> cls11 = Class.forName($$c(bArr10[270], 1036, bArr10[c9]));
                                                                                        byte b17 = bArr10[623];
                                                                                        try {
                                                                                            random.setSeed(((Long) cls11.getMethod($$c(b17, (short) ((b17 ^ 77) | (b17 & 77)), bArr10[26]), null).invoke(null, null)).longValue() ^ (-1588684927));
                                                                                            obj5 = null;
                                                                                            obj6 = null;
                                                                                            obj7 = null;
                                                                                            obj8 = null;
                                                                                        } catch (Throwable th12) {
                                                                                            th = th12;
                                                                                            str = $$c;
                                                                                            zArr = zArr422222;
                                                                                            zArr2 = zArr522222;
                                                                                            zArr3 = zArr622222;
                                                                                            objArr = objArr322222;
                                                                                            i2 = 12;
                                                                                            i11 = (i7 & 1) + (i7 | 1);
                                                                                            i8 = i10;
                                                                                            while (i11 < i8) {
                                                                                            }
                                                                                            byte b162 = waitForCustomerUserId[c11];
                                                                                            int i432 = setCustomerUserId;
                                                                                            String $$c42 = $$c(b162, (short) ((i432 ^ 512) | (i432 & 512)), r2[981]);
                                                                                            Object[] objArr72 = new Object[2];
                                                                                            objArr72[1] = th;
                                                                                            objArr72[z ? 1 : 0] = $$c42;
                                                                                            throw ((Throwable) Class.forName($$c(r2[31], (short) ((i432 ^ 53) | (i432 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr72));
                                                                                        }
                                                                                    } catch (Throwable th13) {
                                                                                        th = th13;
                                                                                        Throwable cause6 = th.getCause();
                                                                                        if (cause6 == null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause6;
                                                                                    }
                                                                                } catch (Throwable th14) {
                                                                                    th = th14;
                                                                                }
                                                                            } catch (Throwable th15) {
                                                                                th = th15;
                                                                                i7 = i2622222;
                                                                            }
                                                                            while (obj5 == null) {
                                                                                if (obj6 == null) {
                                                                                    obj12 = obj5;
                                                                                    obj13 = obj6;
                                                                                    i13 = 6;
                                                                                } else if (obj7 == null) {
                                                                                    obj12 = obj5;
                                                                                    obj13 = obj6;
                                                                                    i13 = 5;
                                                                                } else if (obj8 == null) {
                                                                                    int i44 = setAppInviteOneLink;
                                                                                    obj12 = obj5;
                                                                                    setUserEmails = ((i44 & 75) + (i44 | 75)) % 128;
                                                                                    obj13 = obj6;
                                                                                    i13 = i2422222;
                                                                                } else {
                                                                                    obj12 = obj5;
                                                                                    obj13 = obj6;
                                                                                    i13 = i2322222;
                                                                                }
                                                                                str = $$c;
                                                                                try {
                                                                                    StringBuilder sb4 = new StringBuilder(i13 + 1);
                                                                                    sb4.append('.');
                                                                                    int i45 = z ? 1 : 0;
                                                                                    while (i45 < i13) {
                                                                                        if (z4) {
                                                                                            i14 = i13;
                                                                                            i15 = i45;
                                                                                            try {
                                                                                                int nextInt = random.nextInt(26);
                                                                                                if (random.nextBoolean()) {
                                                                                                    i16 = 64 - (~nextInt);
                                                                                                } else {
                                                                                                    int i46 = -(-nextInt);
                                                                                                    i16 = (i46 | 96) + (i46 & 96);
                                                                                                }
                                                                                                sb4.append((char) i16);
                                                                                            } catch (Throwable th16) {
                                                                                                th = th16;
                                                                                                zArr = zArr422222;
                                                                                                zArr2 = zArr522222;
                                                                                                zArr3 = zArr622222;
                                                                                                objArr = objArr322222;
                                                                                                i11 = (i7 & 1) + (i7 | 1);
                                                                                                i8 = i10;
                                                                                                while (i11 < i8) {
                                                                                                }
                                                                                                byte b1622 = waitForCustomerUserId[c11];
                                                                                                int i4322 = setCustomerUserId;
                                                                                                String $$c422 = $$c(b1622, (short) ((i4322 ^ 512) | (i4322 & 512)), r2[981]);
                                                                                                Object[] objArr722 = new Object[2];
                                                                                                objArr722[1] = th;
                                                                                                objArr722[z ? 1 : 0] = $$c422;
                                                                                                throw ((Throwable) Class.forName($$c(r2[31], (short) ((i4322 ^ 53) | (i4322 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr722));
                                                                                            }
                                                                                        } else {
                                                                                            i14 = i13;
                                                                                            i15 = i45;
                                                                                            sb4.append((char) (random.nextInt(i2) + Utility.DEFAULT_STREAM_BUFFER_SIZE));
                                                                                        }
                                                                                        int i47 = (i15 & (-23)) + (i15 | (-23));
                                                                                        i45 = (i47 ^ 24) + ((i47 & 24) << 1);
                                                                                        i13 = i14;
                                                                                        i2 = 12;
                                                                                    }
                                                                                    sb = sb4.toString();
                                                                                } catch (Throwable th17) {
                                                                                    th = th17;
                                                                                    zArr = zArr422222;
                                                                                    zArr2 = zArr522222;
                                                                                    zArr3 = zArr622222;
                                                                                    objArr = objArr322222;
                                                                                    i2 = 12;
                                                                                    i11 = (i7 & 1) + (i7 | 1);
                                                                                    i8 = i10;
                                                                                    while (i11 < i8) {
                                                                                    }
                                                                                    byte b16222 = waitForCustomerUserId[c11];
                                                                                    int i43222 = setCustomerUserId;
                                                                                    String $$c4222 = $$c(b16222, (short) ((i43222 ^ 512) | (i43222 & 512)), r2[981]);
                                                                                    Object[] objArr7222 = new Object[2];
                                                                                    objArr7222[1] = th;
                                                                                    objArr7222[z ? 1 : 0] = $$c4222;
                                                                                    throw ((Throwable) Class.forName($$c(r2[31], (short) ((i43222 ^ 53) | (i43222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr7222));
                                                                                }
                                                                                if (obj13 != null) {
                                                                                    zArr = zArr422222;
                                                                                    obj14 = obj7;
                                                                                    if (obj14 == null) {
                                                                                        int i48 = setAppInviteOneLink;
                                                                                        setUserEmails = (((i48 | 81) << 1) - (i48 ^ 81)) % 128;
                                                                                        try {
                                                                                            try {
                                                                                                Object[] objArr8 = new Object[2];
                                                                                                objArr8[z822222 ? 1 : 0] = sb;
                                                                                                objArr8[z ? 1 : 0] = obj4;
                                                                                                byte[] bArr11 = waitForCustomerUserId;
                                                                                                byte b18 = bArr11[c8];
                                                                                                Class<?> cls12 = Class.forName($$c(b18, (short) ((b18 ^ 112) | (b18 & 112)), bArr11[c9]));
                                                                                                byte b19 = bArr11[c8];
                                                                                                obj7 = cls12.getDeclaredConstructor(Class.forName($$c(b19, (short) ((b19 ^ 112) | (b19 & 112)), bArr11[c9])), String.class).newInstance(objArr8);
                                                                                                zArr2 = zArr522222;
                                                                                                obj6 = obj13;
                                                                                                obj5 = obj12;
                                                                                                $$c = str;
                                                                                                zArr422222 = zArr;
                                                                                                zArr522222 = zArr2;
                                                                                                i2 = 12;
                                                                                                i2522222 = 2;
                                                                                            } catch (Throwable th18) {
                                                                                                th = th18;
                                                                                                zArr2 = zArr522222;
                                                                                                zArr3 = zArr622222;
                                                                                                objArr = objArr322222;
                                                                                                i2 = 12;
                                                                                                i11 = (i7 & 1) + (i7 | 1);
                                                                                                i8 = i10;
                                                                                                while (i11 < i8) {
                                                                                                }
                                                                                                byte b162222 = waitForCustomerUserId[c11];
                                                                                                int i432222 = setCustomerUserId;
                                                                                                String $$c42222 = $$c(b162222, (short) ((i432222 ^ 512) | (i432222 & 512)), r2[981]);
                                                                                                Object[] objArr72222 = new Object[2];
                                                                                                objArr72222[1] = th;
                                                                                                objArr72222[z ? 1 : 0] = $$c42222;
                                                                                                throw ((Throwable) Class.forName($$c(r2[31], (short) ((i432222 ^ 53) | (i432222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr72222));
                                                                                            }
                                                                                        } catch (Throwable th19) {
                                                                                            Throwable cause7 = th19.getCause();
                                                                                            if (cause7 == null) {
                                                                                                throw th19;
                                                                                            }
                                                                                            throw cause7;
                                                                                        }
                                                                                    } else if (obj8 == null) {
                                                                                        try {
                                                                                            Object[] objArr9 = new Object[2];
                                                                                            objArr9[z822222 ? 1 : 0] = sb;
                                                                                            objArr9[z ? 1 : 0] = obj4;
                                                                                            byte[] bArr12 = waitForCustomerUserId;
                                                                                            byte b20 = bArr12[c8];
                                                                                            Class<?> cls13 = Class.forName($$c(b20, (short) ((b20 ^ 112) | (b20 & 112)), bArr12[c9]));
                                                                                            byte b21 = bArr12[c8];
                                                                                            obj8 = cls13.getDeclaredConstructor(Class.forName($$c(b21, (short) (b21 | 112), bArr12[c9])), String.class).newInstance(objArr9);
                                                                                            zArr2 = zArr522222;
                                                                                            obj6 = obj13;
                                                                                        } catch (Throwable th20) {
                                                                                            Throwable cause8 = th20.getCause();
                                                                                            if (cause8 == null) {
                                                                                                throw th20;
                                                                                            }
                                                                                            throw cause8;
                                                                                        }
                                                                                    } else {
                                                                                        try {
                                                                                            try {
                                                                                                Object[] objArr10 = new Object[2];
                                                                                                objArr10[z822222 ? 1 : 0] = sb;
                                                                                                objArr10[z ? 1 : 0] = obj4;
                                                                                                byte[] bArr13 = waitForCustomerUserId;
                                                                                                byte b22 = bArr13[c8];
                                                                                                Class<?> cls14 = Class.forName($$c(b22, (short) ((b22 ^ 112) | (b22 & 112)), bArr13[c9]));
                                                                                                byte b23 = bArr13[c8];
                                                                                                obj5 = cls14.getDeclaredConstructor(Class.forName($$c(b23, (short) (b23 | 112), bArr13[c9])), String.class).newInstance(objArr10);
                                                                                                try {
                                                                                                    Object[] objArr11 = {obj5};
                                                                                                    byte b24 = bArr13[z ? 1 : 0];
                                                                                                    int i49 = setCustomerUserId;
                                                                                                    Class<?> cls15 = Class.forName($$c(b24, (short) ((i49 ^ 83) | (i49 & 83)), bArr13[c9]));
                                                                                                    byte b25 = bArr13[c8];
                                                                                                    zArr2 = zArr522222;
                                                                                                    try {
                                                                                                        Object newInstance = cls15.getDeclaredConstructor(Class.forName($$c(b25, (short) (b25 | 112), bArr13[c9]))).newInstance(objArr11);
                                                                                                        int i50 = setAppInviteOneLink;
                                                                                                        setUserEmails = ((i50 ^ 59) + ((i50 & 59) << 1)) % 128;
                                                                                                        try {
                                                                                                            Class<?> cls16 = Class.forName($$c(bArr13[z ? 1 : 0], (short) (i49 | 83), bArr13[c9]));
                                                                                                            byte b26 = bArr13[107];
                                                                                                            cls16.getMethod($$c(b26, (short) ((b26 ^ 328) | (b26 & 328)), bArr13[26]), null).invoke(newInstance, null);
                                                                                                            obj6 = obj13;
                                                                                                            obj7 = obj14;
                                                                                                            $$c = str;
                                                                                                            zArr422222 = zArr;
                                                                                                            zArr522222 = zArr2;
                                                                                                            i2 = 12;
                                                                                                            i2522222 = 2;
                                                                                                        } catch (Throwable th21) {
                                                                                                            Throwable cause9 = th21.getCause();
                                                                                                            if (cause9 == null) {
                                                                                                                throw th21;
                                                                                                            }
                                                                                                            throw cause9;
                                                                                                        }
                                                                                                    } catch (Throwable th22) {
                                                                                                        th = th22;
                                                                                                        Throwable cause10 = th.getCause();
                                                                                                        if (cause10 == null) {
                                                                                                            throw th;
                                                                                                        }
                                                                                                        throw cause10;
                                                                                                    }
                                                                                                } catch (Throwable th23) {
                                                                                                    th = th23;
                                                                                                }
                                                                                            } catch (Exception e) {
                                                                                                try {
                                                                                                    StringBuilder sb5 = new StringBuilder();
                                                                                                    byte[] bArr14 = waitForCustomerUserId;
                                                                                                    sb5.append($$c(bArr14[107], (short) (bArr14[i2322222] + 1), bArr14[981]));
                                                                                                    sb5.append((Object) sb);
                                                                                                    byte b27 = bArr14[90];
                                                                                                    byte b28 = b27;
                                                                                                    sb5.append($$c(b28, (short) ((b28 ^ 725) | (b28 & 725)), b27));
                                                                                                    String sb6 = sb5.toString();
                                                                                                    try {
                                                                                                        Object[] objArr12 = new Object[2];
                                                                                                        objArr12[z822222 ? 1 : 0] = e;
                                                                                                        objArr12[z ? 1 : 0] = sb6;
                                                                                                        byte b29 = bArr14[31];
                                                                                                        int i51 = setCustomerUserId;
                                                                                                        throw ((Throwable) Class.forName($$c(b29, (short) ((i51 & 53) | (i51 ^ 53)), bArr14[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr12));
                                                                                                    } catch (Throwable th24) {
                                                                                                        Throwable cause11 = th24.getCause();
                                                                                                        if (cause11 == null) {
                                                                                                            throw th24;
                                                                                                        }
                                                                                                        throw cause11;
                                                                                                    }
                                                                                                } catch (Throwable th25) {
                                                                                                    th = th25;
                                                                                                    zArr3 = zArr622222;
                                                                                                    objArr = objArr322222;
                                                                                                    i2 = 12;
                                                                                                    i11 = (i7 & 1) + (i7 | 1);
                                                                                                    i8 = i10;
                                                                                                    while (i11 < i8) {
                                                                                                    }
                                                                                                    byte b1622222 = waitForCustomerUserId[c11];
                                                                                                    int i4322222 = setCustomerUserId;
                                                                                                    String $$c422222 = $$c(b1622222, (short) ((i4322222 ^ 512) | (i4322222 & 512)), r2[981]);
                                                                                                    Object[] objArr722222 = new Object[2];
                                                                                                    objArr722222[1] = th;
                                                                                                    objArr722222[z ? 1 : 0] = $$c422222;
                                                                                                    throw ((Throwable) Class.forName($$c(r2[31], (short) ((i4322222 ^ 53) | (i4322222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr722222));
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th26) {
                                                                                            Throwable cause12 = th26.getCause();
                                                                                            if (cause12 == null) {
                                                                                                throw th26;
                                                                                            }
                                                                                            throw cause12;
                                                                                        }
                                                                                    }
                                                                                    th = th18;
                                                                                    zArr2 = zArr522222;
                                                                                    zArr3 = zArr622222;
                                                                                    objArr = objArr322222;
                                                                                    i2 = 12;
                                                                                    i11 = (i7 & 1) + (i7 | 1);
                                                                                    i8 = i10;
                                                                                    while (i11 < i8) {
                                                                                    }
                                                                                    byte b16222222 = waitForCustomerUserId[c11];
                                                                                    int i43222222 = setCustomerUserId;
                                                                                    String $$c4222222 = $$c(b16222222, (short) ((i43222222 ^ 512) | (i43222222 & 512)), r2[981]);
                                                                                    Object[] objArr7222222 = new Object[2];
                                                                                    objArr7222222[1] = th;
                                                                                    objArr7222222[z ? 1 : 0] = $$c4222222;
                                                                                    throw ((Throwable) Class.forName($$c(r2[31], (short) ((i43222222 ^ 53) | (i43222222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr7222222));
                                                                                }
                                                                                setAppInviteOneLink = (setUserEmails + 67) % 128;
                                                                                try {
                                                                                    Object[] objArr13 = new Object[i2522222];
                                                                                    objArr13[z822222 ? 1 : 0] = sb;
                                                                                    objArr13[z ? 1 : 0] = obj4;
                                                                                    byte[] bArr15 = waitForCustomerUserId;
                                                                                    byte b30 = bArr15[c8];
                                                                                    zArr = zArr422222;
                                                                                    try {
                                                                                        Class<?> cls17 = Class.forName($$c(b30, (short) ((b30 ^ 112) | (b30 & 112)), bArr15[c9]));
                                                                                        byte b31 = bArr15[c8];
                                                                                        obj14 = obj7;
                                                                                        obj6 = cls17.getDeclaredConstructor(Class.forName($$c(b31, (short) ((b31 ^ 112) | (b31 & 112)), bArr15[c9])), String.class).newInstance(objArr13);
                                                                                        zArr2 = zArr522222;
                                                                                    } catch (Throwable th27) {
                                                                                        th = th27;
                                                                                        Throwable cause13 = th.getCause();
                                                                                        if (cause13 == null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause13;
                                                                                    }
                                                                                } catch (Throwable th28) {
                                                                                    th = th28;
                                                                                }
                                                                                obj5 = obj12;
                                                                                obj7 = obj14;
                                                                                $$c = str;
                                                                                zArr422222 = zArr;
                                                                                zArr522222 = zArr2;
                                                                                i2 = 12;
                                                                                i2522222 = 2;
                                                                            }
                                                                            obj9 = obj5;
                                                                            obj10 = obj7;
                                                                            obj11 = obj6;
                                                                        } else {
                                                                            i7 = i2622222;
                                                                            i12 = -1;
                                                                            obj11 = null;
                                                                            obj8 = null;
                                                                            obj9 = null;
                                                                            obj10 = null;
                                                                        }
                                                                        str = $$c;
                                                                        zArr = zArr422222;
                                                                        zArr2 = zArr522222;
                                                                        byte[] bArr16 = new byte[7120];
                                                                        byte[] bArr17 = waitForCustomerUserId;
                                                                        try {
                                                                            try {
                                                                                Object newInstance2 = Class.forName($$c(bArr17[597], 523, bArr17[c9])).getDeclaredConstructor(Class.forName($$c(bArr17[31], bArr17[90], bArr17[c9]))).newInstance(AFb1pSDK.class.getResourceAsStream($$c(bArr17[989], 312, bArr17[29])));
                                                                                try {
                                                                                    Class.forName($$c(bArr17[597], 523, bArr17[c9])).getMethod($$c(bArr17[105], 773, (byte) (-bArr17[492])), byte[].class).invoke(newInstance2, bArr16);
                                                                                    try {
                                                                                        cls2 = Class.forName($$c(bArr17[597], 523, bArr17[c9]));
                                                                                        b2 = bArr17[107];
                                                                                    } catch (Throwable th29) {
                                                                                        th = th29;
                                                                                    }
                                                                                    try {
                                                                                        cls2.getMethod($$c(b2, (short) ((b2 ^ 328) | (b2 & 328)), bArr17[26]), null).invoke(newInstance2, null);
                                                                                        int i52 = 16;
                                                                                        int i53 = 7082;
                                                                                        String str3 = str;
                                                                                        Class cls18 = null;
                                                                                        boolean z9 = z822222;
                                                                                        while (true) {
                                                                                            bArr16[i52 + 166] = (byte) (bArr16[i52 + 5087] + 116);
                                                                                            int length2 = bArr16.length - i52;
                                                                                            int i54 = i52;
                                                                                            try {
                                                                                                Object[] objArr14 = new Object[i2322222];
                                                                                                objArr14[2] = Integer.valueOf(length2);
                                                                                                objArr14[z9] = Integer.valueOf(i54);
                                                                                                objArr14[z ? 1 : 0] = bArr16;
                                                                                                byte[] bArr18 = waitForCustomerUserId;
                                                                                                int i55 = i53;
                                                                                                Class<?> cls19 = Class.forName($$c(bArr18[366], 835, bArr18[c9]));
                                                                                                Class cls20 = Integer.TYPE;
                                                                                                InputStream inputStream2 = (InputStream) cls19.getDeclaredConstructor(byte[].class, cls20, cls20).newInstance(objArr14);
                                                                                                Object obj17 = setDebugLog;
                                                                                                if (obj17 == null) {
                                                                                                    try {
                                                                                                        obj15 = obj11;
                                                                                                        zArr3 = zArr622222;
                                                                                                    } catch (Throwable th30) {
                                                                                                        th = th30;
                                                                                                    }
                                                                                                    try {
                                                                                                        int i56 = -((Integer) Class.forName($$c(bArr18[z ? 1 : 0], 379, (byte) (-bArr18[c5]))).getMethod($$c(bArr18[c10], 741, (byte) (-bArr18[c5])), String.class).invoke(null, BuildConfig.FLAVOR)).intValue();
                                                                                                        int i57 = (i56 & 1811151160) + (i56 | 1811151160);
                                                                                                        try {
                                                                                                            Object[] objArr15 = new Object[2];
                                                                                                            objArr15[z9] = 0;
                                                                                                            objArr15[z ? 1 : 0] = 0;
                                                                                                            byte b32 = bArr18[312];
                                                                                                            int i58 = setCustomerUserId;
                                                                                                            int i59 = -((Integer) Class.forName($$c(b32, (short) ((i58 & 836) | (i58 ^ 836)), (byte) (-bArr18[c5]))).getMethod($$c(bArr18[c10], 1049, (byte) (-bArr18[492])), cls20, cls20).invoke(null, objArr15)).intValue();
                                                                                                            short s2 = (short) (((i59 | 9) << 1) - (i59 ^ 9));
                                                                                                            try {
                                                                                                                long j = setImeiData;
                                                                                                                int i60 = (int) (j >>> 32);
                                                                                                                int i61 = (int) j;
                                                                                                                obj16 = obj8;
                                                                                                                inputStream = new AFg1oSDK(inputStream2, new int[]{(i60 | i57) & (~(i60 & i57)), (i61 | i57) & (~(i61 & i57))}, setCustomerIdAndLogSession, getOutOfStore, s2, setPhoneNumber);
                                                                                                                objArr = objArr322222;
                                                                                                            } catch (Throwable th31) {
                                                                                                                th = th31;
                                                                                                                objArr = objArr322222;
                                                                                                                i2 = 12;
                                                                                                                i11 = (i7 & 1) + (i7 | 1);
                                                                                                                i8 = i10;
                                                                                                                while (i11 < i8) {
                                                                                                                }
                                                                                                                byte b162222222 = waitForCustomerUserId[c11];
                                                                                                                int i432222222 = setCustomerUserId;
                                                                                                                String $$c42222222 = $$c(b162222222, (short) ((i432222222 ^ 512) | (i432222222 & 512)), r2[981]);
                                                                                                                Object[] objArr72222222 = new Object[2];
                                                                                                                objArr72222222[1] = th;
                                                                                                                objArr72222222[z ? 1 : 0] = $$c42222222;
                                                                                                                throw ((Throwable) Class.forName($$c(r2[31], (short) ((i432222222 ^ 53) | (i432222222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr72222222));
                                                                                                            }
                                                                                                        } catch (Throwable th32) {
                                                                                                            Throwable cause14 = th32.getCause();
                                                                                                            if (cause14 == null) {
                                                                                                                throw th32;
                                                                                                            }
                                                                                                            throw cause14;
                                                                                                        }
                                                                                                    } catch (Throwable th33) {
                                                                                                        th = th33;
                                                                                                        Throwable cause15 = th.getCause();
                                                                                                        if (cause15 == null) {
                                                                                                            throw th;
                                                                                                        }
                                                                                                        throw cause15;
                                                                                                    }
                                                                                                } else {
                                                                                                    obj15 = obj11;
                                                                                                    zArr3 = zArr622222;
                                                                                                    try {
                                                                                                        Object[] objArr16 = {0};
                                                                                                        byte b33 = bArr18[15];
                                                                                                        int i62 = setCustomerUserId;
                                                                                                        objArr = objArr322222;
                                                                                                        try {
                                                                                                            obj16 = obj8;
                                                                                                            int i63 = -((((Integer) Class.forName($$c(b33, (short) ((i62 & 803) | (i62 ^ 803)), (byte) (-bArr18[c5]))).getMethod($$c(bArr18[623], 328, bArr18[35]), cls20).invoke(null, objArr16)).intValue() + 20) >> 6);
                                                                                                            int i64 = (i63 & (-1177904578)) + (i63 | (-1177904578));
                                                                                                            try {
                                                                                                                int i65 = (((Long) Class.forName($$c(bArr18[c], (short) ((i62 ^ 305) | (i62 & 305)), (byte) (-bArr18[c5]))).getMethod($$c(bArr18[c7], 872, bArr18[234]), null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) Class.forName($$c(bArr18[c], (short) ((i62 ^ 305) | (i62 & 305)), (byte) (-bArr18[c5]))).getMethod($$c(bArr18[c7], 872, bArr18[234]), null).invoke(null, null)).longValue() == 0L ? 0 : -1));
                                                                                                                int i66 = ((i65 | (-2022406918)) << 1) - (i65 ^ (-2022406918));
                                                                                                                setAppInviteOneLink = (setUserEmails + 21) % 128;
                                                                                                                try {
                                                                                                                    short intValue = (short) (8 - ((Integer) Class.forName($$c(bArr18[c], (short) ((i62 ^ 35) | (i62 & 35)), (byte) (-bArr18[c5]))).getMethod($$c(bArr18[270], 108, bArr18[35]), CharSequence.class).invoke(null, BuildConfig.FLAVOR)).intValue());
                                                                                                                    setAppInviteOneLink = (setUserEmails + 117) % 128;
                                                                                                                    try {
                                                                                                                        objArr2 = new Object[i2422222];
                                                                                                                        objArr2[3] = Short.valueOf(intValue);
                                                                                                                        objArr2[2] = Integer.valueOf(i66);
                                                                                                                        objArr2[z9] = Integer.valueOf(i64);
                                                                                                                        objArr2[z ? 1 : 0] = inputStream2;
                                                                                                                    } catch (Throwable th34) {
                                                                                                                        th = th34;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        Class<?> cls21 = Class.forName($$c(bArr18[226], (short) ((i62 & 768) | (i62 ^ 768)), bArr18[26]), z9, (ClassLoader) setOaidData);
                                                                                                                        byte b34 = bArr18[44];
                                                                                                                        inputStream = (InputStream) cls21.getMethod($$c(b34, 614, b34), Class.forName($$c(bArr18[31], bArr18[90], bArr18[c9])), cls20, cls20, Short.TYPE).invoke(obj17, objArr2);
                                                                                                                    } catch (Throwable th35) {
                                                                                                                        th = th35;
                                                                                                                        Throwable cause16 = th.getCause();
                                                                                                                        if (cause16 == null) {
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                        throw cause16;
                                                                                                                    }
                                                                                                                } catch (Throwable th36) {
                                                                                                                    Throwable cause17 = th36.getCause();
                                                                                                                    if (cause17 == null) {
                                                                                                                        throw th36;
                                                                                                                    }
                                                                                                                    throw cause17;
                                                                                                                }
                                                                                                            } catch (Throwable th37) {
                                                                                                                Throwable cause18 = th37.getCause();
                                                                                                                if (cause18 == null) {
                                                                                                                    throw th37;
                                                                                                                }
                                                                                                                throw cause18;
                                                                                                            }
                                                                                                        } catch (Throwable th38) {
                                                                                                            th = th38;
                                                                                                            Throwable cause19 = th.getCause();
                                                                                                            if (cause19 == null) {
                                                                                                                throw th;
                                                                                                            }
                                                                                                            throw cause19;
                                                                                                        }
                                                                                                    } catch (Throwable th39) {
                                                                                                        th = th39;
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    ((Long) Class.forName($$c(bArr18[31], bArr18[90], bArr18[c9])).getMethod($$c(bArr18[111], 420, (byte) 74), Long.TYPE).invoke(inputStream, 16L)).getClass();
                                                                                                    if (z3) {
                                                                                                        try {
                                                                                                            Object obj18 = setDebugLog;
                                                                                                            Object obj19 = obj18 == null ? obj15 : obj10;
                                                                                                            Object obj20 = obj18 == null ? obj16 : obj9;
                                                                                                            try {
                                                                                                                byte b35 = bArr18[z ? 1 : 0];
                                                                                                                int i67 = setCustomerUserId;
                                                                                                                Class<?> cls22 = Class.forName($$c(b35, (short) ((i67 ^ 83) | (i67 & 83)), bArr18[c9]));
                                                                                                                byte b36 = bArr18[c8];
                                                                                                                Object newInstance3 = cls22.getDeclaredConstructor(Class.forName($$c(b36, (short) ((b36 ^ 112) | (b36 & 112)), bArr18[c9]))).newInstance(obj19);
                                                                                                                int i68 = 1024;
                                                                                                                try {
                                                                                                                    byte[] bArr19 = new byte[1024];
                                                                                                                    int i69 = i55;
                                                                                                                    while (i69 > 0) {
                                                                                                                        int min = Math.min(i68, i69);
                                                                                                                        int i70 = setAppInviteOneLink;
                                                                                                                        setUserEmails = (((i70 | 99) << 1) - (i70 ^ 99)) % 128;
                                                                                                                        try {
                                                                                                                            Object[] objArr17 = new Object[3];
                                                                                                                            objArr17[2] = Integer.valueOf(min);
                                                                                                                            objArr17[1] = 0;
                                                                                                                            objArr17[z ? 1 : 0] = bArr19;
                                                                                                                            byte[] bArr20 = waitForCustomerUserId;
                                                                                                                            byte[] bArr21 = bArr19;
                                                                                                                            Class<?> cls23 = Class.forName($$c(bArr20[31], bArr20[90], bArr20[c9]));
                                                                                                                            byte b37 = bArr20[111];
                                                                                                                            int i71 = setCustomerUserId;
                                                                                                                            int i72 = i69;
                                                                                                                            String $$c5 = $$c(b37, (short) (i71 | 592), (byte) (-bArr20[492]));
                                                                                                                            Class cls24 = Integer.TYPE;
                                                                                                                            Integer num = (Integer) cls23.getMethod($$c5, byte[].class, cls24, cls24).invoke(inputStream, objArr17);
                                                                                                                            int intValue2 = num.intValue();
                                                                                                                            if (intValue2 == i12) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                Object[] objArr18 = new Object[3];
                                                                                                                                objArr18[2] = num;
                                                                                                                                objArr18[1] = 0;
                                                                                                                                objArr18[z ? 1 : 0] = bArr21;
                                                                                                                                Class cls25 = cls18;
                                                                                                                                String str4 = str3;
                                                                                                                                Class.forName($$c(bArr20[z ? 1 : 0], (short) ((i71 ^ 83) | (i71 & 83)), bArr20[c9])).getMethod($$c(bArr20[107], 755, (byte) 78), byte[].class, cls24, cls24).invoke(newInstance3, objArr18);
                                                                                                                                int i73 = -intValue2;
                                                                                                                                i69 = (i72 & i73) + (i72 | i73);
                                                                                                                                setAppInviteOneLink = (setUserEmails + 69) % 128;
                                                                                                                                str3 = str4;
                                                                                                                                bArr19 = bArr21;
                                                                                                                                cls18 = cls25;
                                                                                                                                i68 = 1024;
                                                                                                                                i12 = -1;
                                                                                                                            } catch (Throwable th40) {
                                                                                                                                Throwable cause20 = th40.getCause();
                                                                                                                                if (cause20 == null) {
                                                                                                                                    throw th40;
                                                                                                                                }
                                                                                                                                throw cause20;
                                                                                                                            }
                                                                                                                        } catch (Throwable th41) {
                                                                                                                            Throwable cause21 = th41.getCause();
                                                                                                                            if (cause21 == null) {
                                                                                                                                throw th41;
                                                                                                                            }
                                                                                                                            throw cause21;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cls3 = cls18;
                                                                                                                    str2 = str3;
                                                                                                                    try {
                                                                                                                        byte[] bArr22 = waitForCustomerUserId;
                                                                                                                        byte b38 = bArr22[z ? 1 : 0];
                                                                                                                        int i74 = setCustomerUserId;
                                                                                                                        Class<?> cls26 = Class.forName($$c(b38, (short) ((i74 ^ 83) | (i74 & 83)), bArr22[c9]));
                                                                                                                        byte b39 = bArr22[107];
                                                                                                                        Object invoke5 = cls26.getMethod($$c(b39, (short) (b39 | 385), bArr22[35]), null).invoke(newInstance3, null);
                                                                                                                        int i75 = setAppInviteOneLink;
                                                                                                                        setUserEmails = (((i75 | 45) << 1) - (i75 ^ 45)) % 128;
                                                                                                                        try {
                                                                                                                            i12 = -1;
                                                                                                                            Class<?> cls27 = Class.forName($$c(bArr22[c], (short) (bArr22[494] + 1), bArr22[c9]));
                                                                                                                            byte b40 = bArr22[111];
                                                                                                                            cls27.getMethod($$c(b40, (short) ((b40 ^ 648) | (b40 & 648)), (byte) 74), null).invoke(invoke5, null);
                                                                                                                            try {
                                                                                                                                Class<?> cls28 = Class.forName($$c(bArr22[z ? 1 : 0], (short) ((i74 ^ 83) | (i74 & 83)), bArr22[c9]));
                                                                                                                                byte b41 = bArr22[107];
                                                                                                                                cls28.getMethod($$c(b41, (short) (b41 | 328), bArr22[26]), null).invoke(newInstance3, null);
                                                                                                                                byte b42 = bArr22[c2];
                                                                                                                                Method declaredMethod = Class.forName($$c(b42, (short) ((b42 ^ 705) | (b42 & 705)), bArr22[c6])).getDeclaredMethod($$c(bArr22[29], 501, bArr22[976]), String.class, String.class, Integer.TYPE);
                                                                                                                                try {
                                                                                                                                    byte b43 = bArr22[c8];
                                                                                                                                    Object invoke6 = Class.forName($$c(b43, (short) ((b43 ^ 112) | (b43 & 112)), bArr22[c9])).getMethod($$c(bArr22[c7], 264, bArr22[35]), null).invoke(obj19, null);
                                                                                                                                    try {
                                                                                                                                        byte b44 = bArr22[c8];
                                                                                                                                        invoke2 = declaredMethod.invoke(null, invoke6, Class.forName($$c(b44, (short) ((b44 ^ 112) | (b44 & 112)), bArr22[c9])).getMethod($$c(bArr22[c7], 264, bArr22[35]), null).invoke(obj20, null), 0);
                                                                                                                                        int i76 = setUserEmails;
                                                                                                                                        setAppInviteOneLink = (((i76 | 9) << 1) - (i76 ^ 9)) % 128;
                                                                                                                                        try {
                                                                                                                                            byte b45 = bArr22[c8];
                                                                                                                                            ((Boolean) Class.forName($$c(b45, (short) ((b45 ^ 112) | (b45 & 112)), bArr22[c9])).getMethod($$c(bArr22[175], (short) (i74 | 258), bArr22[c6]), null).invoke(obj19, null)).getClass();
                                                                                                                                            try {
                                                                                                                                                byte b46 = bArr22[c8];
                                                                                                                                                ((Boolean) Class.forName($$c(b46, (short) (b46 | 112), bArr22[c9])).getMethod($$c(bArr22[175], (short) ((i74 & 258) | (i74 ^ 258)), bArr22[c6]), null).invoke(obj20, null)).getClass();
                                                                                                                                                if (setOaidData == null) {
                                                                                                                                                    setAppInviteOneLink = (setUserEmails + 35) % 128;
                                                                                                                                                    try {
                                                                                                                                                        setOaidData = Class.class.getMethod($$c(bArr22[c10], 417, bArr22[35]), null).invoke(AFb1pSDK.class, null);
                                                                                                                                                    } catch (Throwable th42) {
                                                                                                                                                        Throwable cause22 = th42.getCause();
                                                                                                                                                        if (cause22 == null) {
                                                                                                                                                            throw th42;
                                                                                                                                                        }
                                                                                                                                                        throw cause22;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i2 = 12;
                                                                                                                                            } catch (Throwable th43) {
                                                                                                                                                Throwable cause23 = th43.getCause();
                                                                                                                                                if (cause23 == null) {
                                                                                                                                                    throw th43;
                                                                                                                                                }
                                                                                                                                                throw cause23;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th44) {
                                                                                                                                            Throwable cause24 = th44.getCause();
                                                                                                                                            if (cause24 == null) {
                                                                                                                                                throw th44;
                                                                                                                                            }
                                                                                                                                            throw cause24;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th45) {
                                                                                                                                        Throwable cause25 = th45.getCause();
                                                                                                                                        if (cause25 == null) {
                                                                                                                                            throw th45;
                                                                                                                                        }
                                                                                                                                        throw cause25;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th46) {
                                                                                                                                    Throwable cause26 = th46.getCause();
                                                                                                                                    if (cause26 == null) {
                                                                                                                                        throw th46;
                                                                                                                                    }
                                                                                                                                    throw cause26;
                                                                                                                                }
                                                                                                                            } catch (Throwable th47) {
                                                                                                                                Throwable cause27 = th47.getCause();
                                                                                                                                if (cause27 == null) {
                                                                                                                                    throw th47;
                                                                                                                                }
                                                                                                                                throw cause27;
                                                                                                                            }
                                                                                                                        } catch (Throwable th48) {
                                                                                                                            Throwable cause28 = th48.getCause();
                                                                                                                            if (cause28 == null) {
                                                                                                                                throw th48;
                                                                                                                            }
                                                                                                                            throw cause28;
                                                                                                                        }
                                                                                                                    } catch (Throwable th49) {
                                                                                                                        Throwable cause29 = th49.getCause();
                                                                                                                        if (cause29 == null) {
                                                                                                                            throw th49;
                                                                                                                        }
                                                                                                                        throw cause29;
                                                                                                                    }
                                                                                                                } catch (Throwable th50) {
                                                                                                                    try {
                                                                                                                        byte[] bArr23 = waitForCustomerUserId;
                                                                                                                        byte b47 = bArr23[c8];
                                                                                                                        Class<?> cls29 = Class.forName($$c(b47, (short) ((b47 ^ 112) | (b47 & 112)), bArr23[c9]));
                                                                                                                        byte b48 = bArr23[175];
                                                                                                                        int i77 = setCustomerUserId;
                                                                                                                        ((Boolean) cls29.getMethod($$c(b48, (short) ((i77 ^ 258) | (i77 & 258)), bArr23[c6]), null).invoke(obj19, null)).getClass();
                                                                                                                        try {
                                                                                                                            byte b49 = bArr23[c8];
                                                                                                                            ((Boolean) Class.forName($$c(b49, (short) ((b49 ^ 112) | (b49 & 112)), bArr23[c9])).getMethod($$c(bArr23[175], (short) ((i77 ^ 258) | (i77 & 258)), bArr23[c6]), null).invoke(obj20, null)).getClass();
                                                                                                                            throw th50;
                                                                                                                        } catch (Throwable th51) {
                                                                                                                            Throwable cause30 = th51.getCause();
                                                                                                                            if (cause30 == null) {
                                                                                                                                throw th51;
                                                                                                                            }
                                                                                                                            throw cause30;
                                                                                                                        }
                                                                                                                    } catch (Throwable th52) {
                                                                                                                        Throwable cause31 = th52.getCause();
                                                                                                                        if (cause31 == null) {
                                                                                                                            throw th52;
                                                                                                                        }
                                                                                                                        throw cause31;
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (Throwable th53) {
                                                                                                                try {
                                                                                                                    Throwable cause32 = th53.getCause();
                                                                                                                    if (cause32 == null) {
                                                                                                                        throw th53;
                                                                                                                    }
                                                                                                                    throw cause32;
                                                                                                                } catch (Exception e2) {
                                                                                                                    StringBuilder sb7 = new StringBuilder();
                                                                                                                    byte[] bArr24 = waitForCustomerUserId;
                                                                                                                    byte b50 = bArr24[107];
                                                                                                                    sb7.append($$c(b50, (short) ((b50 ^ 618) | (b50 & 618)), bArr24[981]));
                                                                                                                    sb7.append(obj19);
                                                                                                                    byte b51 = bArr24[90];
                                                                                                                    byte b52 = b51;
                                                                                                                    sb7.append($$c(b52, (short) ((b52 ^ 725) | (b52 & 725)), b51));
                                                                                                                    String sb8 = sb7.toString();
                                                                                                                    try {
                                                                                                                        Object[] objArr19 = new Object[2];
                                                                                                                        objArr19[1] = e2;
                                                                                                                        objArr19[z ? 1 : 0] = sb8;
                                                                                                                        throw ((Throwable) Class.forName($$c(bArr24[31], (short) (setCustomerUserId | 53), bArr24[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr19));
                                                                                                                    } catch (Throwable th54) {
                                                                                                                        Throwable cause33 = th54.getCause();
                                                                                                                        if (cause33 == null) {
                                                                                                                            throw th54;
                                                                                                                        }
                                                                                                                        throw cause33;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th55) {
                                                                                                            th = th55;
                                                                                                            i2 = 12;
                                                                                                            i11 = (i7 & 1) + (i7 | 1);
                                                                                                            i8 = i10;
                                                                                                            while (i11 < i8) {
                                                                                                            }
                                                                                                            byte b1622222222 = waitForCustomerUserId[c11];
                                                                                                            int i4322222222 = setCustomerUserId;
                                                                                                            String $$c422222222 = $$c(b1622222222, (short) ((i4322222222 ^ 512) | (i4322222222 & 512)), r2[981]);
                                                                                                            Object[] objArr722222222 = new Object[2];
                                                                                                            objArr722222222[1] = th;
                                                                                                            objArr722222222[z ? 1 : 0] = $$c422222222;
                                                                                                            throw ((Throwable) Class.forName($$c(r2[31], (short) ((i4322222222 ^ 53) | (i4322222222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr722222222));
                                                                                                        }
                                                                                                    } else {
                                                                                                        cls3 = cls18;
                                                                                                        str2 = str3;
                                                                                                        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                                                                                                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                                                                        try {
                                                                                                            int i78 = 1107;
                                                                                                            Object newInstance4 = Class.forName($$c(bArr18[82], 1107, bArr18[c9])).getDeclaredConstructor(Class.forName($$c(bArr18[31], bArr18[90], bArr18[c9]))).newInstance(zipInputStream);
                                                                                                            try {
                                                                                                                Object newInstance5 = Class.forName($$c(bArr18[981], (short) (setCustomerUserId | 359), bArr18[c9])).getDeclaredConstructor(null).newInstance(null);
                                                                                                                byte[] bArr25 = new byte[1024];
                                                                                                                int i79 = z ? 1 : 0;
                                                                                                                while (true) {
                                                                                                                    int i80 = setUserEmails;
                                                                                                                    setAppInviteOneLink = ((i80 ^ 67) + ((i80 & 67) << 1)) % 128;
                                                                                                                    try {
                                                                                                                        bArr2 = waitForCustomerUserId;
                                                                                                                        Class<?> cls30 = Class.forName($$c(bArr2[82], i78, bArr2[c9]));
                                                                                                                        byte b53 = bArr2[111];
                                                                                                                        i17 = setCustomerUserId;
                                                                                                                        ZipEntry zipEntry = nextEntry;
                                                                                                                        Integer num2 = (Integer) cls30.getMethod($$c(b53, (short) ((i17 & 592) | (i17 ^ 592)), (byte) (-bArr2[492])), byte[].class).invoke(newInstance4, bArr25);
                                                                                                                        int intValue3 = num2.intValue();
                                                                                                                        if (intValue3 <= 0) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        int i81 = setAppInviteOneLink + 75;
                                                                                                                        setUserEmails = i81 % 128;
                                                                                                                        if (i81 % 2 != 0) {
                                                                                                                            zipEntry.getSize();
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (i79 >= zipEntry.getSize()) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                Object[] objArr20 = new Object[3];
                                                                                                                                objArr20[2] = num2;
                                                                                                                                objArr20[1] = 0;
                                                                                                                                objArr20[z ? 1 : 0] = bArr25;
                                                                                                                                Class<?> cls31 = Class.forName($$c(bArr2[981], (short) ((i17 ^ 359) | (i17 & 359)), bArr2[c9]));
                                                                                                                                String $$c6 = $$c(bArr2[107], 755, (byte) 78);
                                                                                                                                Class cls32 = Integer.TYPE;
                                                                                                                                cls31.getMethod($$c6, byte[].class, cls32, cls32).invoke(newInstance5, objArr20);
                                                                                                                                i79 = ((i79 & intValue3) << 1) + (i79 ^ intValue3);
                                                                                                                                nextEntry = zipEntry;
                                                                                                                                i78 = 1107;
                                                                                                                            } catch (Throwable th56) {
                                                                                                                                Throwable cause34 = th56.getCause();
                                                                                                                                if (cause34 == null) {
                                                                                                                                    throw th56;
                                                                                                                                }
                                                                                                                                throw cause34;
                                                                                                                            }
                                                                                                                        } catch (Throwable th57) {
                                                                                                                            th = th57;
                                                                                                                            i2 = 12;
                                                                                                                            i11 = (i7 & 1) + (i7 | 1);
                                                                                                                            i8 = i10;
                                                                                                                            while (i11 < i8) {
                                                                                                                            }
                                                                                                                            byte b16222222222 = waitForCustomerUserId[c11];
                                                                                                                            int i43222222222 = setCustomerUserId;
                                                                                                                            String $$c4222222222 = $$c(b16222222222, (short) ((i43222222222 ^ 512) | (i43222222222 & 512)), r2[981]);
                                                                                                                            Object[] objArr7222222222 = new Object[2];
                                                                                                                            objArr7222222222[1] = th;
                                                                                                                            objArr7222222222[z ? 1 : 0] = $$c4222222222;
                                                                                                                            throw ((Throwable) Class.forName($$c(r2[31], (short) ((i43222222222 ^ 53) | (i43222222222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr7222222222));
                                                                                                                        }
                                                                                                                    } catch (Throwable th58) {
                                                                                                                        Throwable cause35 = th58.getCause();
                                                                                                                        if (cause35 == null) {
                                                                                                                            throw th58;
                                                                                                                        }
                                                                                                                        throw cause35;
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    i2 = 12;
                                                                                                                    try {
                                                                                                                        Object invoke7 = Class.forName($$c(bArr2[981], (short) (i17 | 359), bArr2[c9])).getMethod($$c(bArr2[12], (short) (-bArr2[c5]), (byte) (-bArr2[764])), null).invoke(newInstance5, null);
                                                                                                                        try {
                                                                                                                            Class<?> cls33 = Class.forName($$c(bArr2[82], 1107, bArr2[c9]));
                                                                                                                            byte b54 = bArr2[107];
                                                                                                                            cls33.getMethod($$c(b54, (short) ((b54 ^ 328) | (b54 & 328)), bArr2[26]), null).invoke(newInstance4, null);
                                                                                                                            try {
                                                                                                                                byte[] bArr26 = waitForCustomerUserId;
                                                                                                                                byte b55 = bArr26[981];
                                                                                                                                int i82 = setCustomerUserId;
                                                                                                                                Class<?> cls34 = Class.forName($$c(b55, (short) ((i82 & 359) | (i82 ^ 359)), bArr26[c9]));
                                                                                                                                byte b56 = bArr26[107];
                                                                                                                                cls34.getMethod($$c(b56, (short) ((b56 ^ 328) | (b56 & 328)), bArr26[26]), null).invoke(newInstance5, null);
                                                                                                                                try {
                                                                                                                                    byte[] bArr27 = waitForCustomerUserId;
                                                                                                                                    invoke3 = Class.class.getMethod($$c(bArr27[c10], 417, bArr27[35]), null).invoke(AFb1pSDK.class, null);
                                                                                                                                    Class<?> cls35 = Class.forName($$c((byte) (bArr27[85] - 1), 808, bArr27[c6]));
                                                                                                                                    byte b57 = bArr27[31];
                                                                                                                                    Constructor<?> declaredConstructor = cls35.getDeclaredConstructor(Class.forName($$c(b57, (short) ((b57 ^ 904) | (b57 & 904)), bArr27[c9])), Class.forName($$c(bArr27[c2], 590, bArr27[c9])));
                                                                                                                                    try {
                                                                                                                                        byte b58 = bArr27[31];
                                                                                                                                        invoke2 = declaredConstructor.newInstance(Class.forName($$c(b58, (short) ((b58 ^ 904) | (b58 & 904)), bArr27[c9])).getMethod($$c(bArr27[111], bArr27[82], (byte) 78), byte[].class).invoke(null, invoke7), invoke3);
                                                                                                                                        try {
                                                                                                                                            byte b59 = bArr27[477];
                                                                                                                                            int i83 = setCustomerUserId;
                                                                                                                                            Class<?> cls36 = Class.forName($$c(b59, (short) ((i83 & 560) | (i83 ^ 560)), bArr27[c6]));
                                                                                                                                            byte b60 = bArr27[165];
                                                                                                                                            byte b61 = bArr27[509];
                                                                                                                                            Field declaredField = cls36.getDeclaredField($$c(b60, 150, (byte) ((b61 ^ (-1)) + (b61 << 1))));
                                                                                                                                            declaredField.setAccessible(true);
                                                                                                                                            Object obj21 = declaredField.get(invoke3);
                                                                                                                                            Class<?> cls37 = obj21.getClass();
                                                                                                                                            byte b63 = bArr27[z ? 1 : 0];
                                                                                                                                            Field declaredField2 = cls37.getDeclaredField($$c(b63, b63, (byte) (bArr27[768] - 1)));
                                                                                                                                            declaredField2.setAccessible(true);
                                                                                                                                            Field declaredField3 = cls37.getDeclaredField($$c(bArr27[44], 356, (byte) (bArr27[768] - 1)));
                                                                                                                                            declaredField3.setAccessible(true);
                                                                                                                                            Object obj22 = declaredField2.get(obj21);
                                                                                                                                            Object obj23 = declaredField3.get(obj21);
                                                                                                                                            Object obj24 = declaredField.get(invoke2);
                                                                                                                                            ArrayList arrayList = new ArrayList((List) obj22);
                                                                                                                                            Class<?> componentType = obj23.getClass().getComponentType();
                                                                                                                                            length = Array.getLength(obj23);
                                                                                                                                            Object newInstance6 = Array.newInstance(componentType, length);
                                                                                                                                            i18 = z ? 1 : 0;
                                                                                                                                            while (i18 < length) {
                                                                                                                                                Array.set(newInstance6, i18, Array.get(obj23, i18));
                                                                                                                                                int i84 = ((i18 | 110) << 1) - (i18 ^ 110);
                                                                                                                                                i18 = ((i84 | (-109)) << 1) - (i84 ^ (-109));
                                                                                                                                            }
                                                                                                                                            declaredField2.set(obj24, arrayList);
                                                                                                                                            declaredField3.set(obj24, newInstance6);
                                                                                                                                            if (setOaidData == null) {
                                                                                                                                                setOaidData = invoke2;
                                                                                                                                            }
                                                                                                                                        } catch (Exception e3) {
                                                                                                                                            StringBuilder sb9 = new StringBuilder();
                                                                                                                                            byte[] bArr28 = waitForCustomerUserId;
                                                                                                                                            sb9.append($$c(bArr28[107], 618, bArr28[981]));
                                                                                                                                            sb9.append(invoke3);
                                                                                                                                            byte b64 = bArr28[90];
                                                                                                                                            byte b65 = b64;
                                                                                                                                            sb9.append($$c(b65, (short) (b65 | 725), b64));
                                                                                                                                            String sb10 = sb9.toString();
                                                                                                                                            try {
                                                                                                                                                Object[] objArr21 = new Object[2];
                                                                                                                                                objArr21[1] = e3;
                                                                                                                                                objArr21[z ? 1 : 0] = sb10;
                                                                                                                                                byte b66 = bArr28[31];
                                                                                                                                                int i85 = setCustomerUserId;
                                                                                                                                                throw ((Throwable) Class.forName($$c(b66, (short) ((i85 & 53) | (i85 ^ 53)), bArr28[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr21));
                                                                                                                                            } catch (Throwable th59) {
                                                                                                                                                Throwable cause36 = th59.getCause();
                                                                                                                                                if (cause36 == null) {
                                                                                                                                                    throw th59;
                                                                                                                                                }
                                                                                                                                                throw cause36;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th60) {
                                                                                                                                        Throwable cause37 = th60.getCause();
                                                                                                                                        if (cause37 == null) {
                                                                                                                                            throw th60;
                                                                                                                                        }
                                                                                                                                        throw cause37;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th61) {
                                                                                                                                    Throwable cause38 = th61.getCause();
                                                                                                                                    if (cause38 == null) {
                                                                                                                                        throw th61;
                                                                                                                                    }
                                                                                                                                    throw cause38;
                                                                                                                                }
                                                                                                                            } catch (Throwable th62) {
                                                                                                                                try {
                                                                                                                                    Throwable cause39 = th62.getCause();
                                                                                                                                    if (cause39 == null) {
                                                                                                                                        throw th62;
                                                                                                                                    }
                                                                                                                                    throw cause39;
                                                                                                                                } catch (IOException unused12) {
                                                                                                                                    byte[] bArr272 = waitForCustomerUserId;
                                                                                                                                    invoke3 = Class.class.getMethod($$c(bArr272[c10], 417, bArr272[35]), null).invoke(AFb1pSDK.class, null);
                                                                                                                                    Class<?> cls352 = Class.forName($$c((byte) (bArr272[85] - 1), 808, bArr272[c6]));
                                                                                                                                    byte b572 = bArr272[31];
                                                                                                                                    Constructor<?> declaredConstructor2 = cls352.getDeclaredConstructor(Class.forName($$c(b572, (short) ((b572 ^ 904) | (b572 & 904)), bArr272[c9])), Class.forName($$c(bArr272[c2], 590, bArr272[c9])));
                                                                                                                                    byte b582 = bArr272[31];
                                                                                                                                    invoke2 = declaredConstructor2.newInstance(Class.forName($$c(b582, (short) ((b582 ^ 904) | (b582 & 904)), bArr272[c9])).getMethod($$c(bArr272[111], bArr272[82], (byte) 78), byte[].class).invoke(null, invoke7), invoke3);
                                                                                                                                    byte b592 = bArr272[477];
                                                                                                                                    int i832 = setCustomerUserId;
                                                                                                                                    Class<?> cls362 = Class.forName($$c(b592, (short) ((i832 & 560) | (i832 ^ 560)), bArr272[c6]));
                                                                                                                                    byte b602 = bArr272[165];
                                                                                                                                    byte b612 = bArr272[509];
                                                                                                                                    Field declaredField4 = cls362.getDeclaredField($$c(b602, 150, (byte) ((b612 ^ (-1)) + (b612 << 1))));
                                                                                                                                    declaredField4.setAccessible(true);
                                                                                                                                    Object obj212 = declaredField4.get(invoke3);
                                                                                                                                    Class<?> cls372 = obj212.getClass();
                                                                                                                                    byte b632 = bArr272[z ? 1 : 0];
                                                                                                                                    Field declaredField22 = cls372.getDeclaredField($$c(b632, b632, (byte) (bArr272[768] - 1)));
                                                                                                                                    declaredField22.setAccessible(true);
                                                                                                                                    Field declaredField32 = cls372.getDeclaredField($$c(bArr272[44], 356, (byte) (bArr272[768] - 1)));
                                                                                                                                    declaredField32.setAccessible(true);
                                                                                                                                    Object obj222 = declaredField22.get(obj212);
                                                                                                                                    Object obj232 = declaredField32.get(obj212);
                                                                                                                                    Object obj242 = declaredField4.get(invoke2);
                                                                                                                                    ArrayList arrayList2 = new ArrayList((List) obj222);
                                                                                                                                    Class<?> componentType2 = obj232.getClass().getComponentType();
                                                                                                                                    length = Array.getLength(obj232);
                                                                                                                                    Object newInstance62 = Array.newInstance(componentType2, length);
                                                                                                                                    i18 = z ? 1 : 0;
                                                                                                                                    while (i18 < length) {
                                                                                                                                    }
                                                                                                                                    declaredField22.set(obj242, arrayList2);
                                                                                                                                    declaredField32.set(obj242, newInstance62);
                                                                                                                                    if (setOaidData == null) {
                                                                                                                                    }
                                                                                                                                    Object obj25 = invoke2;
                                                                                                                                    if (z3) {
                                                                                                                                    }
                                                                                                                                    if (cls4 == null) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (Throwable th63) {
                                                                                                                            try {
                                                                                                                                Throwable cause40 = th63.getCause();
                                                                                                                                if (cause40 == null) {
                                                                                                                                    throw th63;
                                                                                                                                }
                                                                                                                                throw cause40;
                                                                                                                            } catch (IOException unused13) {
                                                                                                                                byte[] bArr262 = waitForCustomerUserId;
                                                                                                                                byte b552 = bArr262[981];
                                                                                                                                int i822 = setCustomerUserId;
                                                                                                                                Class<?> cls342 = Class.forName($$c(b552, (short) ((i822 & 359) | (i822 ^ 359)), bArr262[c9]));
                                                                                                                                byte b562 = bArr262[107];
                                                                                                                                cls342.getMethod($$c(b562, (short) ((b562 ^ 328) | (b562 & 328)), bArr262[26]), null).invoke(newInstance5, null);
                                                                                                                                byte[] bArr2722 = waitForCustomerUserId;
                                                                                                                                invoke3 = Class.class.getMethod($$c(bArr2722[c10], 417, bArr2722[35]), null).invoke(AFb1pSDK.class, null);
                                                                                                                                Class<?> cls3522 = Class.forName($$c((byte) (bArr2722[85] - 1), 808, bArr2722[c6]));
                                                                                                                                byte b5722 = bArr2722[31];
                                                                                                                                Constructor<?> declaredConstructor22 = cls3522.getDeclaredConstructor(Class.forName($$c(b5722, (short) ((b5722 ^ 904) | (b5722 & 904)), bArr2722[c9])), Class.forName($$c(bArr2722[c2], 590, bArr2722[c9])));
                                                                                                                                byte b5822 = bArr2722[31];
                                                                                                                                invoke2 = declaredConstructor22.newInstance(Class.forName($$c(b5822, (short) ((b5822 ^ 904) | (b5822 & 904)), bArr2722[c9])).getMethod($$c(bArr2722[111], bArr2722[82], (byte) 78), byte[].class).invoke(null, invoke7), invoke3);
                                                                                                                                byte b5922 = bArr2722[477];
                                                                                                                                int i8322 = setCustomerUserId;
                                                                                                                                Class<?> cls3622 = Class.forName($$c(b5922, (short) ((i8322 & 560) | (i8322 ^ 560)), bArr2722[c6]));
                                                                                                                                byte b6022 = bArr2722[165];
                                                                                                                                byte b6122 = bArr2722[509];
                                                                                                                                Field declaredField42 = cls3622.getDeclaredField($$c(b6022, 150, (byte) ((b6122 ^ (-1)) + (b6122 << 1))));
                                                                                                                                declaredField42.setAccessible(true);
                                                                                                                                Object obj2122 = declaredField42.get(invoke3);
                                                                                                                                Class<?> cls3722 = obj2122.getClass();
                                                                                                                                byte b6322 = bArr2722[z ? 1 : 0];
                                                                                                                                Field declaredField222 = cls3722.getDeclaredField($$c(b6322, b6322, (byte) (bArr2722[768] - 1)));
                                                                                                                                declaredField222.setAccessible(true);
                                                                                                                                Field declaredField322 = cls3722.getDeclaredField($$c(bArr2722[44], 356, (byte) (bArr2722[768] - 1)));
                                                                                                                                declaredField322.setAccessible(true);
                                                                                                                                Object obj2222 = declaredField222.get(obj2122);
                                                                                                                                Object obj2322 = declaredField322.get(obj2122);
                                                                                                                                Object obj2422 = declaredField42.get(invoke2);
                                                                                                                                ArrayList arrayList22 = new ArrayList((List) obj2222);
                                                                                                                                Class<?> componentType22 = obj2322.getClass().getComponentType();
                                                                                                                                length = Array.getLength(obj2322);
                                                                                                                                Object newInstance622 = Array.newInstance(componentType22, length);
                                                                                                                                i18 = z ? 1 : 0;
                                                                                                                                while (i18 < length) {
                                                                                                                                }
                                                                                                                                declaredField222.set(obj2422, arrayList22);
                                                                                                                                declaredField322.set(obj2422, newInstance622);
                                                                                                                                if (setOaidData == null) {
                                                                                                                                }
                                                                                                                                Object obj252 = invoke2;
                                                                                                                                if (z3) {
                                                                                                                                }
                                                                                                                                if (cls4 == null) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (Throwable th64) {
                                                                                                                        th = th64;
                                                                                                                        Throwable cause41 = th.getCause();
                                                                                                                        if (cause41 == null) {
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                        throw cause41;
                                                                                                                    }
                                                                                                                } catch (Throwable th65) {
                                                                                                                    th = th65;
                                                                                                                }
                                                                                                            } catch (Throwable th66) {
                                                                                                                Throwable cause42 = th66.getCause();
                                                                                                                if (cause42 == null) {
                                                                                                                    throw th66;
                                                                                                                }
                                                                                                                throw cause42;
                                                                                                            }
                                                                                                        } catch (Throwable th67) {
                                                                                                            Throwable cause43 = th67.getCause();
                                                                                                            if (cause43 == null) {
                                                                                                                throw th67;
                                                                                                            }
                                                                                                            throw cause43;
                                                                                                        }
                                                                                                    }
                                                                                                    Object obj2522 = invoke2;
                                                                                                    if (z3) {
                                                                                                        try {
                                                                                                            byte[] bArr29 = waitForCustomerUserId;
                                                                                                            byte b67 = bArr29[c2];
                                                                                                            Class<?> cls38 = Class.forName($$c(b67, (short) ((b67 ^ 705) | (b67 & 705)), bArr29[c6]));
                                                                                                            Method declaredMethod2 = cls38.getDeclaredMethod($$c(bArr29[105], bArr29[80], bArr29[976]), String.class, Class.forName($$c(bArr29[c2], 590, bArr29[c9])));
                                                                                                            int i86 = setUserEmails;
                                                                                                            setAppInviteOneLink = (((i86 | 11) << 1) - (i86 ^ 11)) % 128;
                                                                                                            try {
                                                                                                                ?? invoke8 = declaredMethod2.invoke(obj2522, str2, Class.class.getMethod($$c(bArr29[c10], 417, bArr29[35]), null).invoke(AFb1pSDK.class, null));
                                                                                                                if (invoke8 != null) {
                                                                                                                    byte b68 = bArr29[107];
                                                                                                                    cls38.getDeclaredMethod($$c(b68, (short) (b68 | 328), bArr29[26]), null).invoke(obj2522, null);
                                                                                                                }
                                                                                                                cls4 = invoke8;
                                                                                                            } catch (Throwable th68) {
                                                                                                                Throwable cause44 = th68.getCause();
                                                                                                                if (cause44 == null) {
                                                                                                                    throw th68;
                                                                                                                }
                                                                                                                throw cause44;
                                                                                                            }
                                                                                                        } catch (Throwable th69) {
                                                                                                            th = th69;
                                                                                                            i11 = (i7 & 1) + (i7 | 1);
                                                                                                            i8 = i10;
                                                                                                            while (i11 < i8) {
                                                                                                            }
                                                                                                            byte b162222222222 = waitForCustomerUserId[c11];
                                                                                                            int i432222222222 = setCustomerUserId;
                                                                                                            String $$c42222222222 = $$c(b162222222222, (short) ((i432222222222 ^ 512) | (i432222222222 & 512)), r2[981]);
                                                                                                            Object[] objArr72222222222 = new Object[2];
                                                                                                            objArr72222222222[1] = th;
                                                                                                            objArr72222222222[z ? 1 : 0] = $$c42222222222;
                                                                                                            throw ((Throwable) Class.forName($$c(r2[31], (short) ((i432222222222 ^ 53) | (i432222222222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr72222222222));
                                                                                                        }
                                                                                                    } else {
                                                                                                        String str5 = str2;
                                                                                                        byte[] bArr30 = waitForCustomerUserId;
                                                                                                        try {
                                                                                                            cls4 = Class.forName($$c(bArr30[c2], 590, bArr30[c9])).getDeclaredMethod($$c(bArr30[105], bArr30[80], bArr30[976]), String.class).invoke(obj2522, str5);
                                                                                                        } catch (InvocationTargetException e4) {
                                                                                                            try {
                                                                                                                throw ((Exception) e4.getCause());
                                                                                                            } catch (ClassNotFoundException unused14) {
                                                                                                                cls4 = null;
                                                                                                                if (cls4 == null) {
                                                                                                                    int i87 = setUserEmails;
                                                                                                                    setAppInviteOneLink = ((i87 ^ 19) + ((i87 & 19) << 1)) % 128;
                                                                                                                    cls18 = cls4;
                                                                                                                    byte[] bArr31 = waitForCustomerUserId;
                                                                                                                    byte b69 = bArr31[226];
                                                                                                                    try {
                                                                                                                        str3 = $$c(b69, (short) ((b69 ^ 1049) | (b69 & 1049)), bArr31[26]);
                                                                                                                        Constructor declaredConstructor3 = cls18.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                        declaredConstructor3.setAccessible(true);
                                                                                                                        setDebugLog = declaredConstructor3.newInstance(obj2522, Boolean.valueOf(!z3));
                                                                                                                        bArr = new byte[5104];
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                Object newInstance7 = Class.forName($$c(bArr31[597], 523, bArr31[c9])).getDeclaredConstructor(Class.forName($$c(bArr31[31], bArr31[90], bArr31[c9]))).newInstance(AFb1pSDK.class.getResourceAsStream($$c(bArr31[989], 1132, bArr31[29])));
                                                                                                                                try {
                                                                                                                                    Class.forName($$c(bArr31[597], 523, bArr31[c9])).getMethod($$c(bArr31[105], 773, (byte) (-bArr31[492])), byte[].class).invoke(newInstance7, bArr);
                                                                                                                                    try {
                                                                                                                                        Class<?> cls39 = Class.forName($$c(bArr31[597], 523, bArr31[c9]));
                                                                                                                                        byte b70 = bArr31[107];
                                                                                                                                        try {
                                                                                                                                            cls39.getMethod($$c(b70, (short) ((b70 ^ 328) | (b70 & 328)), bArr31[26]), null).invoke(newInstance7, null);
                                                                                                                                            try {
                                                                                                                                                i53 = 5064;
                                                                                                                                                i52 = Math.abs(i54);
                                                                                                                                                bArr16 = bArr;
                                                                                                                                                objArr322222 = objArr;
                                                                                                                                                obj8 = obj16;
                                                                                                                                                obj11 = obj15;
                                                                                                                                                zArr622222 = zArr3;
                                                                                                                                                z9 = 1;
                                                                                                                                                i2322222 = 3;
                                                                                                                                                i2422222 = 4;
                                                                                                                                            } catch (Throwable th70) {
                                                                                                                                                th = th70;
                                                                                                                                                i11 = (i7 & 1) + (i7 | 1);
                                                                                                                                                i8 = i10;
                                                                                                                                                while (i11 < i8) {
                                                                                                                                                }
                                                                                                                                                byte b1622222222222 = waitForCustomerUserId[c11];
                                                                                                                                                int i4322222222222 = setCustomerUserId;
                                                                                                                                                String $$c422222222222 = $$c(b1622222222222, (short) ((i4322222222222 ^ 512) | (i4322222222222 & 512)), r2[981]);
                                                                                                                                                Object[] objArr722222222222 = new Object[2];
                                                                                                                                                objArr722222222222[1] = th;
                                                                                                                                                objArr722222222222[z ? 1 : 0] = $$c422222222222;
                                                                                                                                                throw ((Throwable) Class.forName($$c(r2[31], (short) ((i4322222222222 ^ 53) | (i4322222222222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr722222222222));
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th71) {
                                                                                                                                            th = th71;
                                                                                                                                            Throwable cause45 = th.getCause();
                                                                                                                                            if (cause45 == null) {
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                            throw cause45;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th72) {
                                                                                                                                        th = th72;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th73) {
                                                                                                                                    Throwable cause46 = th73.getCause();
                                                                                                                                    if (cause46 == null) {
                                                                                                                                        throw th73;
                                                                                                                                    }
                                                                                                                                    throw cause46;
                                                                                                                                }
                                                                                                                            } catch (Throwable th74) {
                                                                                                                                Throwable cause47 = th74.getCause();
                                                                                                                                if (cause47 == null) {
                                                                                                                                    throw th74;
                                                                                                                                }
                                                                                                                                throw cause47;
                                                                                                                            }
                                                                                                                        } catch (Throwable th75) {
                                                                                                                            th = th75;
                                                                                                                            i11 = (i7 & 1) + (i7 | 1);
                                                                                                                            i8 = i10;
                                                                                                                            while (i11 < i8) {
                                                                                                                                if (zArr3[i11]) {
                                                                                                                                    th = null;
                                                                                                                                    setDebugLog = null;
                                                                                                                                    setOaidData = null;
                                                                                                                                    i9 = 2;
                                                                                                                                    i5 = i6;
                                                                                                                                    z822222 = true;
                                                                                                                                    i2222222 = i8;
                                                                                                                                    i2522222 = i9;
                                                                                                                                    th2 = th;
                                                                                                                                    $$c = str;
                                                                                                                                    zArr422222 = zArr;
                                                                                                                                    zArr522222 = zArr2;
                                                                                                                                    objArr322222 = objArr;
                                                                                                                                    zArr622222 = zArr3;
                                                                                                                                    i2322222 = 3;
                                                                                                                                    i2422222 = 4;
                                                                                                                                    i2622222 = ((i7 | 1) << 1) - (i7 ^ 1);
                                                                                                                                } else {
                                                                                                                                    int i88 = ((i11 | (-31)) << 1) - (i11 ^ (-31));
                                                                                                                                    i11 = ((i88 | 32) << 1) - (i88 ^ 32);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            byte b16222222222222 = waitForCustomerUserId[c11];
                                                                                                                            int i43222222222222 = setCustomerUserId;
                                                                                                                            String $$c4222222222222 = $$c(b16222222222222, (short) ((i43222222222222 ^ 512) | (i43222222222222 & 512)), r2[981]);
                                                                                                                            Object[] objArr7222222222222 = new Object[2];
                                                                                                                            objArr7222222222222[1] = th;
                                                                                                                            objArr7222222222222[z ? 1 : 0] = $$c4222222222222;
                                                                                                                            throw ((Throwable) Class.forName($$c(r2[31], (short) ((i43222222222222 ^ 53) | (i43222222222222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr7222222222222));
                                                                                                                        }
                                                                                                                    } catch (Throwable th76) {
                                                                                                                        th = th76;
                                                                                                                        i11 = (i7 & 1) + (i7 | 1);
                                                                                                                        i8 = i10;
                                                                                                                        while (i11 < i8) {
                                                                                                                        }
                                                                                                                        byte b162222222222222 = waitForCustomerUserId[c11];
                                                                                                                        int i432222222222222 = setCustomerUserId;
                                                                                                                        String $$c42222222222222 = $$c(b162222222222222, (short) ((i432222222222222 ^ 512) | (i432222222222222 & 512)), r2[981]);
                                                                                                                        Object[] objArr72222222222222 = new Object[2];
                                                                                                                        objArr72222222222222[1] = th;
                                                                                                                        objArr72222222222222[z ? 1 : 0] = $$c42222222222222;
                                                                                                                        throw ((Throwable) Class.forName($$c(r2[31], (short) ((i432222222222222 ^ 53) | (i432222222222222 & 53)), r2[c9])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr72222222222222));
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    Constructor declaredConstructor4 = cls3.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                    declaredConstructor4.setAccessible(true);
                                                                                                                    setDebugLog = declaredConstructor4.newInstance(obj2522, Boolean.valueOf(!z3));
                                                                                                                    i8 = i10;
                                                                                                                    i5 = 1;
                                                                                                                    i9 = 2;
                                                                                                                    th = null;
                                                                                                                    z822222 = true;
                                                                                                                    i2222222 = i8;
                                                                                                                    i2522222 = i9;
                                                                                                                    th2 = th;
                                                                                                                    $$c = str;
                                                                                                                    zArr422222 = zArr;
                                                                                                                    zArr522222 = zArr2;
                                                                                                                    objArr322222 = objArr;
                                                                                                                    zArr622222 = zArr3;
                                                                                                                    i2322222 = 3;
                                                                                                                    i2422222 = 4;
                                                                                                                    i2622222 = ((i7 | 1) << 1) - (i7 ^ 1);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (cls4 == null) {
                                                                                                    }
                                                                                                    i53 = 5064;
                                                                                                    i52 = Math.abs(i54);
                                                                                                    bArr16 = bArr;
                                                                                                    objArr322222 = objArr;
                                                                                                    obj8 = obj16;
                                                                                                    obj11 = obj15;
                                                                                                    zArr622222 = zArr3;
                                                                                                    z9 = 1;
                                                                                                    i2322222 = 3;
                                                                                                    i2422222 = 4;
                                                                                                } catch (Throwable th77) {
                                                                                                    Throwable cause48 = th77.getCause();
                                                                                                    if (cause48 == null) {
                                                                                                        throw th77;
                                                                                                    }
                                                                                                    throw cause48;
                                                                                                }
                                                                                            } catch (Throwable th78) {
                                                                                                Throwable cause49 = th78.getCause();
                                                                                                if (cause49 == null) {
                                                                                                    throw th78;
                                                                                                }
                                                                                                throw cause49;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th79) {
                                                                                        th = th79;
                                                                                        Throwable cause50 = th.getCause();
                                                                                        if (cause50 == null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause50;
                                                                                    }
                                                                                } catch (Throwable th80) {
                                                                                    Throwable cause51 = th80.getCause();
                                                                                    if (cause51 == null) {
                                                                                        throw th80;
                                                                                    }
                                                                                    throw cause51;
                                                                                }
                                                                            } catch (Throwable th81) {
                                                                                Throwable cause52 = th81.getCause();
                                                                                if (cause52 == null) {
                                                                                    throw th81;
                                                                                }
                                                                                throw cause52;
                                                                            }
                                                                        } catch (Throwable th82) {
                                                                            th = th82;
                                                                            zArr3 = zArr622222;
                                                                            objArr = objArr322222;
                                                                            i2 = 12;
                                                                        }
                                                                        z822222 = true;
                                                                        i2222222 = i8;
                                                                        i2522222 = i9;
                                                                        th2 = th;
                                                                        $$c = str;
                                                                        zArr422222 = zArr;
                                                                        zArr522222 = zArr2;
                                                                        objArr322222 = objArr;
                                                                        zArr622222 = zArr3;
                                                                        i2322222 = 3;
                                                                        i2422222 = 4;
                                                                        i2622222 = ((i7 | 1) << 1) - (i7 ^ 1);
                                                                    } else {
                                                                        i6 = i5;
                                                                        i7 = i2622222;
                                                                        str = $$c;
                                                                        zArr = zArr422222;
                                                                        th = th2;
                                                                        zArr2 = zArr522222;
                                                                        zArr3 = zArr622222;
                                                                        objArr = objArr322222;
                                                                        i8 = i2222222;
                                                                        i9 = i2522222;
                                                                    }
                                                                    i5 = i6;
                                                                    z822222 = true;
                                                                    i2222222 = i8;
                                                                    i2522222 = i9;
                                                                    th2 = th;
                                                                    $$c = str;
                                                                    zArr422222 = zArr;
                                                                    zArr522222 = zArr2;
                                                                    objArr322222 = objArr;
                                                                    zArr622222 = zArr3;
                                                                    i2322222 = 3;
                                                                    i2422222 = 4;
                                                                    i2622222 = ((i7 | 1) << 1) - (i7 ^ 1);
                                                                }
                                                                return;
                                                            }
                                                        }
                                                        z6 = z ? 1 : 0;
                                                        zArr622222[z2 ? 1 : 0] = z6;
                                                        zArr622222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                        zArr622222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                        if (i19 < 16) {
                                                        }
                                                        zArr622222[8] = z7;
                                                        i5 = z ? 1 : 0;
                                                        int i26222222 = i5;
                                                        boolean z8222222 = z2;
                                                        while (i5 == 0) {
                                                        }
                                                        return;
                                                    }
                                                    z5 = z ? 1 : 0;
                                                    zArr622222[z ? 1 : 0] = z5;
                                                    if (i19 >= 21) {
                                                    }
                                                    z6 = z ? 1 : 0;
                                                    zArr622222[z2 ? 1 : 0] = z6;
                                                    zArr622222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                    zArr622222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                                    if (i19 < 16) {
                                                    }
                                                    zArr622222[8] = z7;
                                                    i5 = z ? 1 : 0;
                                                    int i262222222 = i5;
                                                    boolean z82222222 = z2;
                                                    while (i5 == 0) {
                                                    }
                                                    return;
                                                } catch (Throwable th83) {
                                                    Throwable cause53 = th83.getCause();
                                                    if (cause53 == null) {
                                                        throw th83;
                                                    }
                                                    throw cause53;
                                                }
                                            }
                                            i4 = 29;
                                            invoke = null;
                                        }
                                        c8 = 268;
                                        c9 = 244;
                                        if (obj3 == null) {
                                        }
                                        if (obj2 == null) {
                                        }
                                        byte[] bArr4222222 = waitForCustomerUserId;
                                        Object invoke4222222 = Class.forName($$c(bArr4222222[c], 467, (byte) (-bArr4222222[c5]))).getMethod($$c(bArr4222222[82], 549, bArr4222222[35]), null).invoke(null, null);
                                        byte b6222222 = bArr4222222[c8];
                                        int i22222222 = 9;
                                        Object[] objArr3222222 = (Object[]) Array.newInstance(Class.forName($$c(b6222222, (short) ((b6222222 ^ 112) | (b6222222 & 112)), bArr4222222[c9])), 9);
                                        objArr3222222[z ? 1 : 0] = null;
                                        objArr3222222[z2 ? 1 : 0] = obj2;
                                        objArr3222222[2] = invoke;
                                        objArr3222222[3] = obj3;
                                        int i23222222 = 3;
                                        objArr3222222[4] = invoke4222222;
                                        objArr3222222[5] = obj2;
                                        objArr3222222[6] = invoke;
                                        objArr3222222[c6] = obj3;
                                        objArr3222222[8] = invoke4222222;
                                        boolean[] zArr4222222 = {false, true, true, true, true, true, true, true, true};
                                        boolean[] zArr5222222 = {false, false, false, false, false, true, true, true, true};
                                        boolean[] zArr6222222 = new boolean[9];
                                        zArr6222222[z ? 1 : 0] = z;
                                        zArr6222222[z2 ? 1 : 0] = z;
                                        zArr6222222[2] = z2;
                                        zArr6222222[3] = z2;
                                        zArr6222222[4] = z;
                                        zArr6222222[5] = z;
                                        zArr6222222[6] = z2;
                                        zArr6222222[c6] = z2;
                                        zArr6222222[8] = z;
                                        int i24222222 = 4;
                                        int i25222222 = 2;
                                        Class<?> cls6222222 = Class.forName($$c(bArr4222222[z ? 1 : 0], 858, (byte) (-bArr4222222[c5])));
                                        i19 = cls6222222.getDeclaredField($$c(bArr4222222[i4], 385, bArr4222222[398])).getInt(cls6222222);
                                        if (i19 != i4) {
                                            z5 = z2 ? 1 : 0;
                                            zArr6222222[z ? 1 : 0] = z5;
                                            if (i19 >= 21) {
                                            }
                                            z6 = z ? 1 : 0;
                                            zArr6222222[z2 ? 1 : 0] = z6;
                                            zArr6222222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                            zArr6222222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                            if (i19 < 16) {
                                            }
                                            zArr6222222[8] = z7;
                                            i5 = z ? 1 : 0;
                                            int i2622222222 = i5;
                                            boolean z822222222 = z2;
                                            while (i5 == 0) {
                                            }
                                            return;
                                        }
                                        z5 = z ? 1 : 0;
                                        zArr6222222[z ? 1 : 0] = z5;
                                        if (i19 >= 21) {
                                        }
                                        z6 = z ? 1 : 0;
                                        zArr6222222[z2 ? 1 : 0] = z6;
                                        zArr6222222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                        zArr6222222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                        if (i19 < 16) {
                                        }
                                        zArr6222222[8] = z7;
                                        i5 = z ? 1 : 0;
                                        int i26222222222 = i5;
                                        boolean z8222222222 = z2;
                                        while (i5 == 0) {
                                        }
                                        return;
                                    }
                                    i2 = 12;
                                    i3 = i20;
                                    obj3 = null;
                                    if (invoke != null) {
                                    }
                                    c8 = 268;
                                    c9 = 244;
                                    if (obj3 == null) {
                                    }
                                    if (obj2 == null) {
                                    }
                                    byte[] bArr42222222 = waitForCustomerUserId;
                                    Object invoke42222222 = Class.forName($$c(bArr42222222[c], 467, (byte) (-bArr42222222[c5]))).getMethod($$c(bArr42222222[82], 549, bArr42222222[35]), null).invoke(null, null);
                                    byte b62222222 = bArr42222222[c8];
                                    int i222222222 = 9;
                                    Object[] objArr32222222 = (Object[]) Array.newInstance(Class.forName($$c(b62222222, (short) ((b62222222 ^ 112) | (b62222222 & 112)), bArr42222222[c9])), 9);
                                    objArr32222222[z ? 1 : 0] = null;
                                    objArr32222222[z2 ? 1 : 0] = obj2;
                                    objArr32222222[2] = invoke;
                                    objArr32222222[3] = obj3;
                                    int i232222222 = 3;
                                    objArr32222222[4] = invoke42222222;
                                    objArr32222222[5] = obj2;
                                    objArr32222222[6] = invoke;
                                    objArr32222222[c6] = obj3;
                                    objArr32222222[8] = invoke42222222;
                                    boolean[] zArr42222222 = {false, true, true, true, true, true, true, true, true};
                                    boolean[] zArr52222222 = {false, false, false, false, false, true, true, true, true};
                                    boolean[] zArr62222222 = new boolean[9];
                                    zArr62222222[z ? 1 : 0] = z;
                                    zArr62222222[z2 ? 1 : 0] = z;
                                    zArr62222222[2] = z2;
                                    zArr62222222[3] = z2;
                                    zArr62222222[4] = z;
                                    zArr62222222[5] = z;
                                    zArr62222222[6] = z2;
                                    zArr62222222[c6] = z2;
                                    zArr62222222[8] = z;
                                    int i242222222 = 4;
                                    int i252222222 = 2;
                                    Class<?> cls62222222 = Class.forName($$c(bArr42222222[z ? 1 : 0], 858, (byte) (-bArr42222222[c5])));
                                    i19 = cls62222222.getDeclaredField($$c(bArr42222222[i4], 385, bArr42222222[398])).getInt(cls62222222);
                                    if (i19 != i4) {
                                    }
                                    z5 = z ? 1 : 0;
                                    zArr62222222[z ? 1 : 0] = z5;
                                    if (i19 >= 21) {
                                    }
                                    z6 = z ? 1 : 0;
                                    zArr62222222[z2 ? 1 : 0] = z6;
                                    zArr62222222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                    zArr62222222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                    if (i19 < 16) {
                                    }
                                    zArr62222222[8] = z7;
                                    i5 = z ? 1 : 0;
                                    int i262222222222 = i5;
                                    boolean z82222222222 = z2;
                                    while (i5 == 0) {
                                    }
                                    return;
                                }
                                z2 = true;
                                c7 = '\\';
                                obj2 = null;
                                if (obj == null) {
                                }
                                i3 = i20;
                                obj3 = null;
                                if (invoke != null) {
                                }
                                c8 = 268;
                                c9 = 244;
                                if (obj3 == null) {
                                }
                                if (obj2 == null) {
                                }
                                byte[] bArr422222222 = waitForCustomerUserId;
                                Object invoke422222222 = Class.forName($$c(bArr422222222[c], 467, (byte) (-bArr422222222[c5]))).getMethod($$c(bArr422222222[82], 549, bArr422222222[35]), null).invoke(null, null);
                                byte b622222222 = bArr422222222[c8];
                                int i2222222222 = 9;
                                Object[] objArr322222222 = (Object[]) Array.newInstance(Class.forName($$c(b622222222, (short) ((b622222222 ^ 112) | (b622222222 & 112)), bArr422222222[c9])), 9);
                                objArr322222222[z ? 1 : 0] = null;
                                objArr322222222[z2 ? 1 : 0] = obj2;
                                objArr322222222[2] = invoke;
                                objArr322222222[3] = obj3;
                                int i2322222222 = 3;
                                objArr322222222[4] = invoke422222222;
                                objArr322222222[5] = obj2;
                                objArr322222222[6] = invoke;
                                objArr322222222[c6] = obj3;
                                objArr322222222[8] = invoke422222222;
                                boolean[] zArr422222222 = {false, true, true, true, true, true, true, true, true};
                                boolean[] zArr522222222 = {false, false, false, false, false, true, true, true, true};
                                boolean[] zArr622222222 = new boolean[9];
                                zArr622222222[z ? 1 : 0] = z;
                                zArr622222222[z2 ? 1 : 0] = z;
                                zArr622222222[2] = z2;
                                zArr622222222[3] = z2;
                                zArr622222222[4] = z;
                                zArr622222222[5] = z;
                                zArr622222222[6] = z2;
                                zArr622222222[c6] = z2;
                                zArr622222222[8] = z;
                                int i2422222222 = 4;
                                int i2522222222 = 2;
                                Class<?> cls622222222 = Class.forName($$c(bArr422222222[z ? 1 : 0], 858, (byte) (-bArr422222222[c5])));
                                i19 = cls622222222.getDeclaredField($$c(bArr422222222[i4], 385, bArr422222222[398])).getInt(cls622222222);
                                if (i19 != i4) {
                                }
                                z5 = z ? 1 : 0;
                                zArr622222222[z ? 1 : 0] = z5;
                                if (i19 >= 21) {
                                }
                                z6 = z ? 1 : 0;
                                zArr622222222[z2 ? 1 : 0] = z6;
                                zArr622222222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                zArr622222222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                if (i19 < 16) {
                                }
                                zArr622222222[8] = z7;
                                i5 = z ? 1 : 0;
                                int i2622222222222 = i5;
                                boolean z822222222222 = z2;
                                while (i5 == 0) {
                                }
                                return;
                            }
                            try {
                                invoke = cls.getMethod($$c(b, (short) ((i & 629) | (i ^ 629)), r12[35]), null).invoke(obj, null);
                                c6 = 7;
                                c5 = 27;
                            } catch (Exception unused15) {
                                invoke = null;
                                c6 = c3;
                                c5 = c4;
                                if (obj != null) {
                                }
                                z2 = true;
                                c7 = '\\';
                                obj2 = null;
                                if (obj == null) {
                                }
                                i3 = i20;
                                obj3 = null;
                                if (invoke != null) {
                                }
                                c8 = 268;
                                c9 = 244;
                                if (obj3 == null) {
                                }
                                if (obj2 == null) {
                                }
                                byte[] bArr4222222222 = waitForCustomerUserId;
                                Object invoke4222222222 = Class.forName($$c(bArr4222222222[c], 467, (byte) (-bArr4222222222[c5]))).getMethod($$c(bArr4222222222[82], 549, bArr4222222222[35]), null).invoke(null, null);
                                byte b6222222222 = bArr4222222222[c8];
                                int i22222222222 = 9;
                                Object[] objArr3222222222 = (Object[]) Array.newInstance(Class.forName($$c(b6222222222, (short) ((b6222222222 ^ 112) | (b6222222222 & 112)), bArr4222222222[c9])), 9);
                                objArr3222222222[z ? 1 : 0] = null;
                                objArr3222222222[z2 ? 1 : 0] = obj2;
                                objArr3222222222[2] = invoke;
                                objArr3222222222[3] = obj3;
                                int i23222222222 = 3;
                                objArr3222222222[4] = invoke4222222222;
                                objArr3222222222[5] = obj2;
                                objArr3222222222[6] = invoke;
                                objArr3222222222[c6] = obj3;
                                objArr3222222222[8] = invoke4222222222;
                                boolean[] zArr4222222222 = {false, true, true, true, true, true, true, true, true};
                                boolean[] zArr5222222222 = {false, false, false, false, false, true, true, true, true};
                                boolean[] zArr6222222222 = new boolean[9];
                                zArr6222222222[z ? 1 : 0] = z;
                                zArr6222222222[z2 ? 1 : 0] = z;
                                zArr6222222222[2] = z2;
                                zArr6222222222[3] = z2;
                                zArr6222222222[4] = z;
                                zArr6222222222[5] = z;
                                zArr6222222222[6] = z2;
                                zArr6222222222[c6] = z2;
                                zArr6222222222[8] = z;
                                int i24222222222 = 4;
                                int i25222222222 = 2;
                                Class<?> cls6222222222 = Class.forName($$c(bArr4222222222[z ? 1 : 0], 858, (byte) (-bArr4222222222[c5])));
                                i19 = cls6222222222.getDeclaredField($$c(bArr4222222222[i4], 385, bArr4222222222[398])).getInt(cls6222222222);
                                if (i19 != i4) {
                                }
                                z5 = z ? 1 : 0;
                                zArr6222222222[z ? 1 : 0] = z5;
                                if (i19 >= 21) {
                                }
                                z6 = z ? 1 : 0;
                                zArr6222222222[z2 ? 1 : 0] = z6;
                                zArr6222222222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                                zArr6222222222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                                if (i19 < 16) {
                                }
                                zArr6222222222[8] = z7;
                                i5 = z ? 1 : 0;
                                int i26222222222222 = i5;
                                boolean z8222222222222 = z2;
                                while (i5 == 0) {
                                }
                                return;
                            }
                            if (obj != null) {
                            }
                            z2 = true;
                            c7 = '\\';
                            obj2 = null;
                            if (obj == null) {
                            }
                            i3 = i20;
                            obj3 = null;
                            if (invoke != null) {
                            }
                            c8 = 268;
                            c9 = 244;
                            if (obj3 == null) {
                            }
                            if (obj2 == null) {
                            }
                            byte[] bArr42222222222 = waitForCustomerUserId;
                            Object invoke42222222222 = Class.forName($$c(bArr42222222222[c], 467, (byte) (-bArr42222222222[c5]))).getMethod($$c(bArr42222222222[82], 549, bArr42222222222[35]), null).invoke(null, null);
                            byte b62222222222 = bArr42222222222[c8];
                            int i222222222222 = 9;
                            Object[] objArr32222222222 = (Object[]) Array.newInstance(Class.forName($$c(b62222222222, (short) ((b62222222222 ^ 112) | (b62222222222 & 112)), bArr42222222222[c9])), 9);
                            objArr32222222222[z ? 1 : 0] = null;
                            objArr32222222222[z2 ? 1 : 0] = obj2;
                            objArr32222222222[2] = invoke;
                            objArr32222222222[3] = obj3;
                            int i232222222222 = 3;
                            objArr32222222222[4] = invoke42222222222;
                            objArr32222222222[5] = obj2;
                            objArr32222222222[6] = invoke;
                            objArr32222222222[c6] = obj3;
                            objArr32222222222[8] = invoke42222222222;
                            boolean[] zArr42222222222 = {false, true, true, true, true, true, true, true, true};
                            boolean[] zArr52222222222 = {false, false, false, false, false, true, true, true, true};
                            boolean[] zArr62222222222 = new boolean[9];
                            zArr62222222222[z ? 1 : 0] = z;
                            zArr62222222222[z2 ? 1 : 0] = z;
                            zArr62222222222[2] = z2;
                            zArr62222222222[3] = z2;
                            zArr62222222222[4] = z;
                            zArr62222222222[5] = z;
                            zArr62222222222[6] = z2;
                            zArr62222222222[c6] = z2;
                            zArr62222222222[8] = z;
                            int i242222222222 = 4;
                            int i252222222222 = 2;
                            Class<?> cls62222222222 = Class.forName($$c(bArr42222222222[z ? 1 : 0], 858, (byte) (-bArr42222222222[c5])));
                            i19 = cls62222222222.getDeclaredField($$c(bArr42222222222[i4], 385, bArr42222222222[398])).getInt(cls62222222222);
                            if (i19 != i4) {
                            }
                            z5 = z ? 1 : 0;
                            zArr62222222222[z ? 1 : 0] = z5;
                            if (i19 >= 21) {
                            }
                            z6 = z ? 1 : 0;
                            zArr62222222222[z2 ? 1 : 0] = z6;
                            zArr62222222222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                            zArr62222222222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                            if (i19 < 16) {
                            }
                            zArr62222222222[8] = z7;
                            i5 = z ? 1 : 0;
                            int i262222222222222 = i5;
                            boolean z82222222222222 = z2;
                            while (i5 == 0) {
                            }
                            return;
                        }
                        c3 = 7;
                        byte[] bArr422222222222 = waitForCustomerUserId;
                        Object invoke422222222222 = Class.forName($$c(bArr422222222222[c], 467, (byte) (-bArr422222222222[c5]))).getMethod($$c(bArr422222222222[82], 549, bArr422222222222[35]), null).invoke(null, null);
                        byte b622222222222 = bArr422222222222[c8];
                        int i2222222222222 = 9;
                        Object[] objArr322222222222 = (Object[]) Array.newInstance(Class.forName($$c(b622222222222, (short) ((b622222222222 ^ 112) | (b622222222222 & 112)), bArr422222222222[c9])), 9);
                        objArr322222222222[z ? 1 : 0] = null;
                        objArr322222222222[z2 ? 1 : 0] = obj2;
                        objArr322222222222[2] = invoke;
                        objArr322222222222[3] = obj3;
                        int i2322222222222 = 3;
                        objArr322222222222[4] = invoke422222222222;
                        objArr322222222222[5] = obj2;
                        objArr322222222222[6] = invoke;
                        objArr322222222222[c6] = obj3;
                        objArr322222222222[8] = invoke422222222222;
                        boolean[] zArr422222222222 = {false, true, true, true, true, true, true, true, true};
                        boolean[] zArr522222222222 = {false, false, false, false, false, true, true, true, true};
                        boolean[] zArr622222222222 = new boolean[9];
                        zArr622222222222[z ? 1 : 0] = z;
                        zArr622222222222[z2 ? 1 : 0] = z;
                        zArr622222222222[2] = z2;
                        zArr622222222222[3] = z2;
                        zArr622222222222[4] = z;
                        zArr622222222222[5] = z;
                        zArr622222222222[6] = z2;
                        zArr622222222222[c6] = z2;
                        zArr622222222222[8] = z;
                        int i2422222222222 = 4;
                        int i2522222222222 = 2;
                        Class<?> cls622222222222 = Class.forName($$c(bArr422222222222[z ? 1 : 0], 858, (byte) (-bArr422222222222[c5])));
                        i19 = cls622222222222.getDeclaredField($$c(bArr422222222222[i4], 385, bArr422222222222[398])).getInt(cls622222222222);
                        if (i19 != i4) {
                        }
                        z5 = z ? 1 : 0;
                        zArr622222222222[z ? 1 : 0] = z5;
                        if (i19 >= 21) {
                        }
                        z6 = z ? 1 : 0;
                        zArr622222222222[z2 ? 1 : 0] = z6;
                        zArr622222222222[5] = i19 >= 21 ? z2 ? 1 : 0 : z ? 1 : 0;
                        zArr622222222222[4] = i19 < 16 ? z2 ? 1 : 0 : z ? 1 : 0;
                        if (i19 < 16) {
                        }
                        zArr622222222222[8] = z7;
                        i5 = z ? 1 : 0;
                        int i2622222222222222 = i5;
                        boolean z822222222222222 = z2;
                        while (i5 == 0) {
                        }
                        return;
                    } catch (Throwable th84) {
                        Throwable cause54 = th84.getCause();
                        if (cause54 == null) {
                            throw th84;
                        }
                        throw cause54;
                    }
                    c4 = 27;
                    invoke = null;
                    c6 = c3;
                    c5 = c4;
                    if (obj != null) {
                    }
                    z2 = true;
                    c7 = '\\';
                    obj2 = null;
                    if (obj == null) {
                    }
                    i3 = i20;
                    obj3 = null;
                    if (invoke != null) {
                    }
                    c8 = 268;
                    c9 = 244;
                    if (obj3 == null) {
                    }
                    if (obj2 == null) {
                    }
                }
            } catch (Exception unused16) {
                z = false;
                c = 520;
            }
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }

    private AFb1pSDK() {
    }

    public static int AFInAppEventParameterName(Object obj) {
        int i = setAppInviteOneLink + 77;
        int i2 = i % 128;
        setUserEmails = i2;
        if (i % 2 != 0) {
            throw null;
        }
        Object obj2 = setDebugLog;
        setAppInviteOneLink = (i2 + 13) % 128;
        try {
            byte[] bArr = waitForCustomerUserId;
            Class<?> cls = Class.forName($$c(bArr[226], (short) (setCustomerUserId | 768), bArr[26]), true, (ClassLoader) setOaidData);
            byte b = bArr[44];
            return ((Integer) cls.getMethod($$c(b, 614, b), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i;
        int i2 = setAppInviteOneLink;
        int i3 = ((i2 | 43) << 1) - (i2 ^ 43);
        setUserEmails = i3 % 128;
        if (i3 % 2 != 0) {
            byte[] bArr = new byte[1154];
            System.arraycopy("\u0017eaoÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:È4\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ññÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøá.¾\u001a\fö$¼\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òø\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøá.Á\u0017\fö$ýð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004ð\u0007ï\u0000\u0003\u00023¼ùBÛÛ\u0000\tûïý\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøá.Á\u0017\fö$ýö\bîú\u000bþ\u000fê\u0001òõ\bù\u0005ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØôæ\fó*Ñ\u0000ÿ\u0017Üÿ\u0006ø\u0004\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0012õ\u0015õøúØ*Îý(Ì\u000eô÷!ìì\u000eñ\u0005î\fð!êñ\u0005\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úö\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜê\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0012òô\rïð\u0007ï\u0000\u0003\u00023¼ùBØ×\u0003ü\fõ'Ôú\tõ\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷ð\u0007ï\u0000\u0003\u00023µ\n\u0001ëFÞÛø\b÷þ&Ì\u000eô÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000bÿî\u001déó\n\u0001ú\u0011Û\u0006÷ú\u0006òøÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:É3\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0012òô\r\u0013æ\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þð\u0007ï\u0000\u0003\u00023·\fê\u0001C×ìê\u0001\u001cÞ\búö\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004\u0012ú\u0010õÿî\u001dß\u0006ùý\u0005þ\u0015äô\u0004ð\të\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëýñÿ<Êîýú\n÷ð\u0011ð\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr, 0, 1154);
            waitForCustomerUserId = bArr;
            i = 26897;
        } else {
            byte[] bArr2 = new byte[1154];
            System.arraycopy("\u0017eaoÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:È4\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ññÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøá.¾\u001a\fö$¼\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òø\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøá.Á\u0017\fö$ýð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004ð\u0007ï\u0000\u0003\u00023¼ùBÛÛ\u0000\tûïý\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøá.Á\u0017\fö$ýö\bîú\u000bþ\u000fê\u0001òõ\bù\u0005ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØôæ\fó*Ñ\u0000ÿ\u0017Üÿ\u0006ø\u0004\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0012õ\u0015õøúØ*Îý(Ì\u000eô÷!ìì\u000eñ\u0005î\fð!êñ\u0005\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úö\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜê\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0012òô\rïð\u0007ï\u0000\u0003\u00023¼ùBØ×\u0003ü\fõ'Ôú\tõ\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷ð\u0007ï\u0000\u0003\u00023µ\n\u0001ëFÞÛø\b÷þ&Ì\u000eô÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000bÿî\u001déó\n\u0001ú\u0011Û\u0006÷ú\u0006òøÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:É3\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0012òô\r\u0013æ\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þð\u0007ï\u0000\u0003\u00023·\fê\u0001C×ìê\u0001\u001cÞ\búö\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004\u0012ú\u0010õÿî\u001dß\u0006ùý\u0005þ\u0015äô\u0004ð\të\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëýñÿ<Êîýú\n÷ð\u0011ð\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr2, 0, 1154);
            waitForCustomerUserId = bArr2;
            i = 136;
        }
        setCustomerUserId = i;
    }

    public static int valueOf(int i) {
        Object obj;
        int i2 = setUserEmails;
        int i3 = i2 + 41;
        setAppInviteOneLink = i3 % 128;
        if (i3 % 2 == 0) {
            obj = setDebugLog;
            int i4 = 5 / 0;
        } else {
            obj = setDebugLog;
        }
        int i5 = (((i2 | 65) << 1) - (i2 ^ 65)) % 128;
        setAppInviteOneLink = i5;
        setUserEmails = (((i5 | 73) << 1) - (i5 ^ 73)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = waitForCustomerUserId;
            byte b = bArr[226];
            int i6 = setCustomerUserId;
            Class<?> cls = Class.forName($$c(b, (short) ((i6 & 768) | (i6 ^ 768)), bArr[26]), true, (ClassLoader) setOaidData);
            byte b2 = bArr[29];
            byte b3 = bArr[494];
            int intValue = ((Integer) cls.getMethod($$c(b2, 225, (byte) (((b3 | 1) << 1) - (b3 ^ 1))), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i7 = setUserEmails + 5;
            setAppInviteOneLink = i7 % 128;
            if (i7 % 2 != 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object values(char c, int i, int i2) {
        int i3 = setAppInviteOneLink;
        Object obj = setDebugLog;
        int i4 = (i3 + 19) % 128;
        setUserEmails = i4;
        setAppInviteOneLink = (((i4 | 49) << 1) - (i4 ^ 49)) % 128;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            byte[] bArr = waitForCustomerUserId;
            byte b = bArr[226];
            int i5 = setCustomerUserId;
            Class<?> cls = Class.forName($$c(b, (short) ((i5 ^ 768) | (i5 & 768)), bArr[26]), true, (ClassLoader) setOaidData);
            String $$c = $$c(bArr[175], (short) ((i5 & 310) | (i5 ^ 310)), (byte) (bArr[494] + 1));
            Class cls2 = Character.TYPE;
            Class cls3 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls3, cls3).invoke(obj, objArr);
            setAppInviteOneLink = (setUserEmails + 43) % 128;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
