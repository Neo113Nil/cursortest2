package com.appsflyer.internal.connector.purcahse;

import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import io.appmetrica.analytics.BuildConfig;
import io.jsonwebtoken.JwtParser;
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
public class AFPurchaseConnectorA1w {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Map PurchaseClientCompanion;
    private static long PurchaseClientInAppPurchaseValidationResultListener;
    private static long PurchaseClientPurchaseEventDataSource;
    private static long PurchaseClientSubscriptionPurchaseEventDataSource;
    private static byte[] build;
    private static Object getVERSION_NAMEannotations;
    private static byte onNewPurchases;
    private static byte[] setAfClient;
    private static Object setConnector;
    public static final Map setSubscriptionValidationResultListener;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0076 -> B:6:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b4, int i4, short s4) {
        int i5;
        int i6;
        int i7 = $10;
        $11 = ((i7 ^ 85) + ((i7 & 85) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i8 = b4 + 33;
        byte[] bArr = $$a;
        int i9 = -s4;
        int i10 = i9 * 306;
        int i11 = ((i10 & 610) + (i10 | 610)) - (-395046);
        int i12 = ((~((i9 ^ 1291) | (i9 & 1291))) | (~((i9 ^ i4) | (i9 & i4)))) * 305;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = ~i4;
        int i15 = ~((i9 & i14) | (i14 ^ i9));
        int i16 = -(-(((i15 & (-1292)) | ((-1292) ^ i15)) * 305));
        int i17 = (i13 & i16) + (i16 | i13);
        int i18 = i4 + 1;
        byte[] bArr2 = new byte[i18];
        if (bArr == null) {
            int i19 = i7 + 43;
            $11 = i19 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i19 % 2 == 0) {
                throw null;
            }
            i8 = i18;
            int i20 = i17;
            i5 = 0;
            int i21 = ((i17 * (-464)) - (~(-(-(i8 * (-929)))))) - 1;
            int i22 = ~i17;
            int i23 = (i8 ^ i4) | (i8 & i4);
            int i24 = ~i23;
            int i25 = (i21 - (~(((i24 & i22) | (i22 ^ i24)) * (-465)))) - 1;
            int i26 = ~((i22 ^ i4) | (i22 & i4));
            int i27 = (i25 - (~(((i8 & i26) | (i8 ^ i26)) * 930))) - 1;
            int i28 = ((i23 ^ i22) | (i22 & i23)) * 465;
            i8 = (((i27 | i28) << 1) - (i28 ^ i27)) - 3;
            i17 = ((i20 | 1) << 1) - (i20 ^ 1);
            int i29 = $11;
            $10 = ((i29 & 91) + (i29 | 91)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i6 = i5 + 1;
            bArr2[i5] = (byte) i8;
            if (i6 == i18) {
                String str = new String(bArr2, 0);
                int i30 = $11;
                $10 = ((i30 ^ 69) + ((i30 & 69) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return str;
            }
            int i31 = bArr[i17];
            int i32 = $10;
            $11 = (((i32 | 9) << 1) - (i32 ^ 9)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i33 = i17;
            i17 = i31;
            i5 = i6;
            i20 = i33;
            int i212 = ((i17 * (-464)) - (~(-(-(i8 * (-929)))))) - 1;
            int i222 = ~i17;
            int i232 = (i8 ^ i4) | (i8 & i4);
            int i242 = ~i232;
            int i252 = (i212 - (~(((i242 & i222) | (i222 ^ i242)) * (-465)))) - 1;
            int i262 = ~((i222 ^ i4) | (i222 & i4));
            int i272 = (i252 - (~(((i8 & i262) | (i8 ^ i262)) * 930))) - 1;
            int i282 = ((i232 ^ i222) | (i222 & i232)) * 465;
            i8 = (((i272 | i282) << 1) - (i282 ^ i272)) - 3;
            i17 = ((i20 | 1) << 1) - (i20 ^ 1);
            int i292 = $11;
            $10 = ((i292 & 91) + (i292 | 91)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i6 = i5 + 1;
            bArr2[i5] = (byte) i8;
            if (i6 == i18) {
            }
        } else {
            i5 = 0;
            i6 = i5 + 1;
            bArr2[i5] = (byte) i8;
            if (i6 == i18) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:(5:1066|1067|1068|1069|1070)|(0)|1065|23|(0)|25|(0)|27|28|29|(0)(0)|41|(0)|(0)|71|72|73|74|75|76|77|78|(0)(0)|81|(0)|1031|86|87|88|(0)|1029|93|(0)(0)|96|97|(3:98|(0)(0)|354)) */
    /* JADX WARN: Code restructure failed: missing block: B:1035:0x04e9, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1037:0x04ec, code lost:
    
        r42 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x026a, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x1acf, code lost:
    
        r8 = r41;
        r35 = 12;
        r0 = r31.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x1ae7, code lost:
    
        if (r60 != false) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x1ae9, code lost:
    
        r2 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.$10;
        com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.$11 = ((r2 ^ 81) + ((r2 & 81) << 1)) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x1af8, code lost:
    
        com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.getVERSION_NAMEannotations = r0.newInstance(r1, java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x1b06, code lost:
    
        com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.$10 = (com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.$11 + com.ironsource.InterfaceC1490j3.d.b.f16817i) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x1b0e, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x1b11, code lost:
    
        r1 = r42;
        r2 = r68;
        r7 = 2;
        r15 = true;
        r28 = -1;
        r29 = 0;
        r33 = 16;
        r39 = true;
        r48 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x1b27, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x1b28, code lost:
    
        r33 = 16;
        r4 = r4;
        r6 = r6;
        r49 = r49;
        r66 = r66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x1af7, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:992:0x054f, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r11[251(0xfb, float:3.52E-43)], r11[r38], r10)).getMethod($$c((byte) (-com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w.$$a[r36]), r11[286(0x11e, float:4.01E-43)], (short) 971), null).invoke(r0, null)).booleanValue() != false) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1008:0x0563 A[Catch: all -> 0x0564, TryCatch #41 {all -> 0x0564, blocks: (B:993:0x0584, B:1000:0x05e0, B:1002:0x05e6, B:1003:0x05e7, B:1006:0x055d, B:1008:0x0563, B:1009:0x057f, B:995:0x05bb, B:996:0x05de), top: B:981:0x0510, inners: #108 }] */
    /* JADX WARN: Removed duplicated region for block: B:1009:0x057f A[Catch: all -> 0x0564, TryCatch #41 {all -> 0x0564, blocks: (B:993:0x0584, B:1000:0x05e0, B:1002:0x05e6, B:1003:0x05e7, B:1006:0x055d, B:1008:0x0563, B:1009:0x057f, B:995:0x05bb, B:996:0x05de), top: B:981:0x0510, inners: #108 }] */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:1022:0x1fa6  */
    /* JADX WARN: Removed duplicated region for block: B:1025:0x1fee A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1028:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:1032:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:1038:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:1050:0x02e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1059:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x193f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x1acf A[EDGE_INSN: B:344:0x1acf->B:345:0x1acf BREAK  A[LOOP:1: B:139:0x0b27->B:305:0x1a6a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x1eae A[Catch: Exception -> 0x200a, TryCatch #21 {Exception -> 0x200a, blocks: (B:8:0x017e, B:14:0x021a, B:35:0x031f, B:43:0x0380, B:50:0x1ff0, B:52:0x1ff6, B:53:0x1ff7, B:56:0x1ff9, B:58:0x1fff, B:59:0x2000, B:62:0x03e3, B:67:0x0426, B:69:0x042c, B:70:0x042d, B:71:0x042e, B:74:0x0474, B:77:0x047a, B:87:0x04c2, B:93:0x04db, B:96:0x04e6, B:102:0x0500, B:358:0x1e53, B:360:0x1eae, B:367:0x1ebf, B:354:0x1fcb, B:375:0x1f4b, B:376:0x1f5b, B:382:0x1f9e, B:384:0x1fa4, B:385:0x1fa5, B:386:0x1f62, B:362:0x1eb6, B:1040:0x032f, B:1046:0x2002, B:1048:0x2008, B:1049:0x2009, B:1077:0x0229, B:64:0x03f5, B:378:0x1f6f, B:379:0x1f9c, B:47:0x03c0, B:45:0x038f, B:1043:0x035e), top: B:7:0x017e, inners: #4, #77, #113, #116, #117 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x1ebf A[Catch: Exception -> 0x200a, TRY_LEAVE, TryCatch #21 {Exception -> 0x200a, blocks: (B:8:0x017e, B:14:0x021a, B:35:0x031f, B:43:0x0380, B:50:0x1ff0, B:52:0x1ff6, B:53:0x1ff7, B:56:0x1ff9, B:58:0x1fff, B:59:0x2000, B:62:0x03e3, B:67:0x0426, B:69:0x042c, B:70:0x042d, B:71:0x042e, B:74:0x0474, B:77:0x047a, B:87:0x04c2, B:93:0x04db, B:96:0x04e6, B:102:0x0500, B:358:0x1e53, B:360:0x1eae, B:367:0x1ebf, B:354:0x1fcb, B:375:0x1f4b, B:376:0x1f5b, B:382:0x1f9e, B:384:0x1fa4, B:385:0x1fa5, B:386:0x1f62, B:362:0x1eb6, B:1040:0x032f, B:1046:0x2002, B:1048:0x2008, B:1049:0x2009, B:1077:0x0229, B:64:0x03f5, B:378:0x1f6f, B:379:0x1f9c, B:47:0x03c0, B:45:0x038f, B:1043:0x035e), top: B:7:0x017e, inners: #4, #77, #113, #116, #117 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x1edd A[EDGE_INSN: B:372:0x1edd->B:373:0x1edd BREAK  A[LOOP:0: B:98:0x04f2->B:354:0x1fcb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x1edd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x1ebb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0380 A[Catch: Exception -> 0x200a, TRY_ENTER, TRY_LEAVE, TryCatch #21 {Exception -> 0x200a, blocks: (B:8:0x017e, B:14:0x021a, B:35:0x031f, B:43:0x0380, B:50:0x1ff0, B:52:0x1ff6, B:53:0x1ff7, B:56:0x1ff9, B:58:0x1fff, B:59:0x2000, B:62:0x03e3, B:67:0x0426, B:69:0x042c, B:70:0x042d, B:71:0x042e, B:74:0x0474, B:77:0x047a, B:87:0x04c2, B:93:0x04db, B:96:0x04e6, B:102:0x0500, B:358:0x1e53, B:360:0x1eae, B:367:0x1ebf, B:354:0x1fcb, B:375:0x1f4b, B:376:0x1f5b, B:382:0x1f9e, B:384:0x1fa4, B:385:0x1fa5, B:386:0x1f62, B:362:0x1eb6, B:1040:0x032f, B:1046:0x2002, B:1048:0x2008, B:1049:0x2009, B:1077:0x0229, B:64:0x03f5, B:378:0x1f6f, B:379:0x1f9c, B:47:0x03c0, B:45:0x038f, B:1043:0x035e), top: B:7:0x017e, inners: #4, #77, #113, #116, #117 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:695:0x1d31 A[Catch: all -> 0x1c92, TryCatch #67 {all -> 0x1c92, blocks: (B:496:0x1c91, B:498:0x1c97, B:500:0x1c9d, B:501:0x1c9e, B:505:0x1ca4, B:507:0x1caa, B:508:0x1cab, B:565:0x1ce0, B:693:0x1d2b, B:695:0x1d31, B:696:0x1d32, B:757:0x1d86, B:759:0x1d8c, B:760:0x1d8d, B:766:0x1d8f, B:768:0x1da8, B:769:0x1da9, B:772:0x1dab, B:774:0x1dc4, B:775:0x1dc5, B:778:0x1dc7, B:780:0x1de0, B:781:0x1de1, B:784:0x1de3, B:786:0x1dfc, B:787:0x1dfd, B:137:0x0af2, B:493:0x1c69, B:134:0x0ab8, B:132:0x0a7c, B:130:0x0a3e), top: B:136:0x0af2, inners: #65, #73, #89, #101, #112 }] */
    /* JADX WARN: Removed duplicated region for block: B:696:0x1d32 A[Catch: all -> 0x1c92, TryCatch #67 {all -> 0x1c92, blocks: (B:496:0x1c91, B:498:0x1c97, B:500:0x1c9d, B:501:0x1c9e, B:505:0x1ca4, B:507:0x1caa, B:508:0x1cab, B:565:0x1ce0, B:693:0x1d2b, B:695:0x1d31, B:696:0x1d32, B:757:0x1d86, B:759:0x1d8c, B:760:0x1d8d, B:766:0x1d8f, B:768:0x1da8, B:769:0x1da9, B:772:0x1dab, B:774:0x1dc4, B:775:0x1dc5, B:778:0x1dc7, B:780:0x1de0, B:781:0x1de1, B:784:0x1de3, B:786:0x1dfc, B:787:0x1dfd, B:137:0x0af2, B:493:0x1c69, B:134:0x0ab8, B:132:0x0a7c, B:130:0x0a3e), top: B:136:0x0af2, inners: #65, #73, #89, #101, #112 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04e1  */
    /* JADX WARN: Type inference failed for: r1v290, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v164, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v105, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v111, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v117, types: [byte] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v125 */
    /* JADX WARN: Type inference failed for: r4v191 */
    /* JADX WARN: Type inference failed for: r4v206 */
    /* JADX WARN: Type inference failed for: r4v208 */
    /* JADX WARN: Type inference failed for: r4v209 */
    /* JADX WARN: Type inference failed for: r4v210 */
    /* JADX WARN: Type inference failed for: r4v237 */
    /* JADX WARN: Type inference failed for: r4v271, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v277, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v283, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v284 */
    /* JADX WARN: Type inference failed for: r4v285 */
    /* JADX WARN: Type inference failed for: r4v291 */
    /* JADX WARN: Type inference failed for: r4v293 */
    /* JADX WARN: Type inference failed for: r4v299 */
    /* JADX WARN: Type inference failed for: r4v306 */
    /* JADX WARN: Type inference failed for: r4v307 */
    /* JADX WARN: Type inference failed for: r4v308 */
    /* JADX WARN: Type inference failed for: r4v309 */
    /* JADX WARN: Type inference failed for: r4v310 */
    /* JADX WARN: Type inference failed for: r4v315 */
    /* JADX WARN: Type inference failed for: r4v316 */
    /* JADX WARN: Type inference failed for: r4v323 */
    /* JADX WARN: Type inference failed for: r4v324 */
    /* JADX WARN: Type inference failed for: r4v327 */
    /* JADX WARN: Type inference failed for: r4v328 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v77, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v83, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v97, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r66v10 */
    /* JADX WARN: Type inference failed for: r66v12, types: [int] */
    /* JADX WARN: Type inference failed for: r66v32 */
    /* JADX WARN: Type inference failed for: r66v33 */
    /* JADX WARN: Type inference failed for: r66v8 */
    /* JADX WARN: Type inference failed for: r66v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v100 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v146 */
    /* JADX WARN: Type inference failed for: r6v148 */
    /* JADX WARN: Type inference failed for: r6v150 */
    /* JADX WARN: Type inference failed for: r6v151 */
    /* JADX WARN: Type inference failed for: r6v152, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v170, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v172 */
    /* JADX WARN: Type inference failed for: r6v187 */
    /* JADX WARN: Type inference failed for: r6v226 */
    /* JADX WARN: Type inference failed for: r6v227 */
    /* JADX WARN: Type inference failed for: r6v228 */
    /* JADX WARN: Type inference failed for: r6v229 */
    /* JADX WARN: Type inference failed for: r6v230 */
    /* JADX WARN: Type inference failed for: r6v231 */
    /* JADX WARN: Type inference failed for: r6v232 */
    /* JADX WARN: Type inference failed for: r6v233 */
    /* JADX WARN: Type inference failed for: r6v238 */
    /* JADX WARN: Type inference failed for: r6v239 */
    /* JADX WARN: Type inference failed for: r6v240 */
    /* JADX WARN: Type inference failed for: r6v247 */
    /* JADX WARN: Type inference failed for: r6v248 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r6v51, types: [short] */
    /* JADX WARN: Type inference failed for: r6v54, types: [short] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v62, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r6v65, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r6v71, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r8v198, types: [short] */
    /* JADX WARN: Type inference failed for: r8v201 */
    /* JADX WARN: Type inference failed for: r8v237 */
    /* JADX WARN: Type inference failed for: r8v239 */
    /* JADX WARN: Type inference failed for: r8v257 */
    /* JADX WARN: Type inference failed for: r8v259 */
    /* JADX WARN: Type inference failed for: r8v267 */
    /* JADX WARN: Type inference failed for: r8v268 */
    /* JADX WARN: Type inference failed for: r8v271 */
    /* JADX WARN: Type inference failed for: r8v272 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v51, types: [short] */
    /* JADX WARN: Type inference failed for: r8v79 */
    static {
        String $$c;
        char c4;
        String str;
        Object obj;
        char c5;
        Object obj2;
        Object invoke;
        Class<?> cls;
        byte[] bArr;
        int i4;
        Object invoke2;
        int i5;
        char c6;
        boolean z4;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        int i6;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        boolean z7;
        boolean[] zArr4;
        String str2;
        Object[] objArr2;
        boolean[] zArr5;
        boolean[] zArr6;
        boolean z8;
        int i9;
        Object obj3;
        ?? r6;
        ?? r4;
        boolean z9;
        int i10;
        int i11;
        int i12;
        Class<byte[]> cls2;
        short s4;
        int i13;
        Class cls3;
        boolean z10;
        Class<byte[]> cls4;
        Class cls5;
        Class cls6;
        boolean z11;
        Class<byte[]> cls7;
        Class cls8;
        int i14;
        boolean z12;
        byte b4;
        byte b5;
        byte b6;
        Throwable cause;
        boolean z13;
        Class<byte[]> cls9;
        Class cls10;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i15;
        Object obj9;
        int i16;
        Random random;
        int i17;
        int i18;
        boolean z14;
        ?? r8;
        ?? r62;
        ?? r42;
        Throwable th;
        ZipFile zipFile;
        ZipFile zipFile2;
        Class<byte[]> cls11;
        Class cls12;
        int i19;
        Object obj10;
        Class cls13;
        Object newInstance;
        ZipFile zipFile3;
        Class cls14;
        Class cls15;
        ZipFile zipFile4;
        Class<byte[]> cls16;
        Class cls17;
        Class cls18;
        Class cls19;
        ZipFile zipFile5;
        Class<byte[]> cls20;
        Class cls21;
        Class cls22;
        ZipFile zipFile6;
        Class<byte[]> cls23;
        Class cls24;
        Class cls25;
        Class cls26;
        ZipFile zipFile7;
        Class cls27;
        Class cls28;
        Class<byte[]> cls29;
        Object newInstance2;
        Object invoke3;
        Method method;
        Method method2;
        char c7;
        int i20;
        boolean z15;
        String str3;
        Method method3;
        Object obj11;
        ZipFile zipFile8;
        Class cls30;
        ZipFile zipFile9;
        Class cls31;
        Object obj12;
        ZipFile zipFile10;
        Class cls32;
        Class<byte[]> cls33;
        ZipFile zipFile11;
        Class cls34;
        ZipFile zipFile12;
        Class cls35;
        ZipFile zipFile13;
        Class cls36;
        Class<?> cls37;
        byte b7;
        Class<?> cls38;
        byte b8;
        Throwable cause2;
        Class<?> cls39;
        String $$c2;
        byte b9;
        byte b10;
        int i21;
        boolean z16;
        Class<byte[]> cls40 = byte[].class;
        Class cls41 = AFPurchaseConnectorA1w.class;
        init$0();
        try {
            byte[] bArr2 = $$a;
            byte b11 = -1;
            int i22 = 0;
            Object obj13 = null;
            int intValue = ((Integer) Class.forName($$c((byte) (-bArr2[41]), bArr2[70], (short) 1287)).getMethod($$c(bArr2[91], bArr2[16], (short) 1266), Integer.TYPE).invoke(null, 153)).intValue();
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i23 = ~currentTimeMillis;
            int i24 = ((~(((-554512070) ^ i23) | (i23 & (-554512070)))) | 17370757) * (-241);
            int i25 = (((-1828841139) | i24) << 1) - (i24 ^ (-1828841139));
            int i26 = (i25 ^ 1284492626) + ((i25 & 1284492626) << 1);
            int i27 = ~currentTimeMillis;
            int i28 = ~(((-554512070) ^ i27) | (i27 & (-554512070)) | 21569159);
            int i29 = ((4198402 ^ i28) | (i28 & 4198402)) * 241;
            int i30 = (i26 ^ i29) + ((i29 & i26) << 1);
            int i31 = ~(((-948259150) & intValue) | ((-948259150) ^ intValue));
            int i32 = (545325133 ^ i31) | (i31 & 545325133);
            int i33 = i32 * 336;
            int i34 = 5;
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i35 = i32 * 164976;
            int i36 = i30 * (-489);
            int i37 = (i35 & i36) + (i36 | i35);
            int i38 = ~i33;
            int i39 = ~i30;
            int i40 = i38 | i39;
            int i41 = 16;
            int i42 = ~currentTimeMillis2;
            int i43 = i37 + (((i40 ^ i42) | (i40 & i42)) * (-490));
            int i44 = ~i30;
            int i45 = i43 + (((~(currentTimeMillis2 | i39)) | (~((i44 & i33) | (i44 ^ i33)))) * 490);
            int i46 = (~i33) * 490;
            int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
            int i48 = ~((1620127967 ^ intValue) | (1620127967 & intValue));
            int i49 = -(-(((i48 & (-2023061984)) | ((-2023061984) ^ i48)) * (-168)));
            int i50 = (i47 & i49) + (i47 | i49);
            int i51 = (~((~intValue) | 1620127967)) | (-948259150);
            int i52 = i51 * 168;
            int currentTimeMillis3 = (int) System.currentTimeMillis();
            int i53 = ((i51 * (-94584)) - (~(-(-(i50 * 565))))) - 1;
            int i54 = ~i52;
            int i55 = ~i50;
            int i56 = ~currentTimeMillis3;
            int i57 = ~(i55 | i56);
            int i58 = (i54 ^ i57) | (i57 & i54);
            int i59 = ~(i50 | currentTimeMillis3);
            int i60 = i53 + (((i58 ^ i59) | (i59 & i58)) * (-564));
            int i61 = i54 | i50;
            int i62 = -(-((~((currentTimeMillis3 & i61) | (i61 ^ currentTimeMillis3))) * 1128));
            int i63 = (i60 & i62) + (i60 | i62);
            int i64 = ~((i54 ^ i56) | (i54 & i56));
            int i65 = ~(i52 | i50);
            if ((i63 - (~(((i64 & i65) | (i64 ^ i65)) * 564))) - 1 == 0) {
                return;
            }
            PurchaseClientPurchaseEventDataSource = -6378050646938663648L;
            onNewPurchases = (byte) 69;
            setSubscriptionValidationResultListener = new HashMap();
            PurchaseClientCompanion = new HashMap();
            try {
                $$c = $$c((byte) (-bArr2[19]), bArr2[261], (short) 1262);
                if (getVERSION_NAMEannotations == null) {
                    int currentTimeMillis4 = (int) System.currentTimeMillis();
                    int i66 = ~currentTimeMillis4;
                    int i67 = (~((i66 & (-920869696)) | ((-920869696) ^ i66))) | (~((970061995 ^ currentTimeMillis4) | (970061995 & currentTimeMillis4)));
                    int i68 = ~currentTimeMillis4;
                    int i69 = ~((i68 ^ (-970061996)) | (i68 & (-970061996)));
                    int i70 = (-118415898) + (((i67 ^ i69) | (i69 & i67)) * 959);
                    int i71 = (i70 & 179748992) + (179748992 | i70);
                    int i72 = ~((970061995 ^ i68) | (970061995 & i68));
                    int i73 = ~(((-920869696) & currentTimeMillis4) | ((-920869696) ^ currentTimeMillis4));
                    int i74 = (i71 - (~(((~((currentTimeMillis4 & (-970061996)) | ((-970061996) ^ currentTimeMillis4))) | ((i72 & i73) | (i72 ^ i73))) * 959))) - 1;
                    int currentTimeMillis5 = (int) System.currentTimeMillis();
                    int i75 = 2106435212 + (((~((2085408237 ^ currentTimeMillis5) | (2085408237 & currentTimeMillis5))) | (-1552700340)) * (-220));
                    int i76 = ~(currentTimeMillis5 | 2085408237);
                    int i77 = ((i76 & (-2093801472)) | ((-2093801472) ^ i76)) * 220;
                    if (i74 <= (i75 & i77) + (i77 | i75) + 314838116) {
                        byte b12 = (byte) (-bArr2[108]);
                        byte b13 = bArr2[66];
                        str = $$c(b12, b13, (short) (b13 | 4392));
                        c4 = 19;
                    } else {
                        byte b14 = (byte) (-bArr2[19]);
                        byte b15 = bArr2[28];
                        str = $$c(b14, b15, (short) ((b15 ^ 1185) | (b15 & 1185)));
                        c4 = 19;
                    }
                } else {
                    c4 = 19;
                    str = null;
                }
                try {
                    obj = Class.forName($$c((byte) (-bArr2[41]), bArr2[525], (short) 1185)).getMethod($$c((byte) (-bArr2[c4]), bArr2[6], (short) 1160), null).invoke(null, null);
                } catch (Exception unused) {
                    obj = null;
                }
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
            try {
                byte[] bArr3 = $$a;
                byte b16 = (byte) (-bArr3[41]);
                byte b17 = bArr3[70];
                c5 = 'B';
                try {
                    obj = Class.forName($$c(b16, b17, (short) ((b17 & 1122) | (b17 ^ 1122)))).getMethod($$c(bArr3[91], bArr3[57], (short) 1122), null).invoke(null, null);
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                c5 = 'B';
                if (obj != null) {
                    $11 = ($10 + InterfaceC1490j3.d.b.f16815g) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    try {
                        Class<?> cls42 = obj.getClass();
                        byte[] bArr4 = $$a;
                        byte b18 = bArr4[91];
                        byte b19 = bArr4[c5];
                        obj2 = cls42.getMethod($$c(b18, b19, (short) (b19 | 1092)), null).invoke(obj, null);
                    } catch (Exception unused4) {
                        obj2 = null;
                        if (obj != null) {
                            try {
                                Class<?> cls43 = obj.getClass();
                                byte[] bArr5 = $$a;
                                invoke = cls43.getMethod($$c(bArr5[91], bArr5[12], (short) 1092), null).invoke(obj, null);
                            } catch (Exception unused5) {
                                invoke = null;
                                if (obj != null) {
                                    try {
                                        cls = obj.getClass();
                                        bArr = $$a;
                                        i4 = 12;
                                    } catch (Exception unused6) {
                                        i4 = 12;
                                        invoke2 = null;
                                        i5 = 2;
                                        if (obj2 != null) {
                                        }
                                        c6 = 271;
                                        if (invoke2 == null) {
                                        }
                                        if (invoke == null) {
                                        }
                                        byte[] bArr6 = $$a;
                                        short s5 = (short) 1058;
                                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr6[251], bArr6[c6], s5)), 7);
                                        objArr[0] = null;
                                        objArr[z4 ? 1 : 0] = invoke;
                                        objArr[2] = obj2;
                                        objArr[3] = invoke2;
                                        objArr[4] = invoke;
                                        objArr[5] = obj2;
                                        objArr[6] = invoke2;
                                        zArr = new boolean[]{false, true, true, true, true, true, true};
                                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                        zArr3 = new boolean[7];
                                        zArr3[0] = false;
                                        zArr3[z4 ? 1 : 0] = false;
                                        zArr3[2] = z4;
                                        zArr3[3] = z4;
                                        zArr3[4] = false;
                                        zArr3[5] = z4;
                                        zArr3[6] = z4;
                                        i6 = 4;
                                        i7 = 7;
                                        Class<?> cls44 = Class.forName($$c((byte) (-bArr6[41]), bArr6[126], (short) 1000));
                                        i21 = cls44.getDeclaredField($$c(bArr6[138], bArr6[23], (short) 977)).getInt(cls44);
                                        if (i21 < 34) {
                                        }
                                        zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                                        if (i21 >= 21) {
                                        }
                                        z16 = false;
                                        zArr3[z4 ? 1 : 0] = z16;
                                        zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                                        i8 = 0;
                                        z6 = false;
                                        z7 = z5;
                                        while (true) {
                                            int i78 = i5;
                                            if ((!z6) != z4) {
                                            }
                                            int i79 = i9 + 93;
                                            i7 = i11;
                                            cls41 = r4;
                                            cls40 = r6;
                                            i5 = i12;
                                            obj13 = obj3;
                                            z7 = z8;
                                            zArr = zArr4;
                                            $$c = str2;
                                            objArr = objArr2;
                                            zArr2 = zArr5;
                                            i6 = i10;
                                            zArr3 = zArr6;
                                            i34 = 5;
                                            i8 = (i79 | (-92)) + (i79 & (-92));
                                        }
                                    }
                                    try {
                                        invoke2 = cls.getMethod($$c(bArr[91], bArr[c5], (short) 1078), null).invoke(obj, null);
                                    } catch (Exception unused7) {
                                        invoke2 = null;
                                        i5 = 2;
                                        if (obj2 != null) {
                                        }
                                        c6 = 271;
                                        if (invoke2 == null) {
                                        }
                                        if (invoke == null) {
                                        }
                                        byte[] bArr62 = $$a;
                                        short s52 = (short) 1058;
                                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr62[251], bArr62[c6], s52)), 7);
                                        objArr[0] = null;
                                        objArr[z4 ? 1 : 0] = invoke;
                                        objArr[2] = obj2;
                                        objArr[3] = invoke2;
                                        objArr[4] = invoke;
                                        objArr[5] = obj2;
                                        objArr[6] = invoke2;
                                        zArr = new boolean[]{false, true, true, true, true, true, true};
                                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                        zArr3 = new boolean[7];
                                        zArr3[0] = false;
                                        zArr3[z4 ? 1 : 0] = false;
                                        zArr3[2] = z4;
                                        zArr3[3] = z4;
                                        zArr3[4] = false;
                                        zArr3[5] = z4;
                                        zArr3[6] = z4;
                                        i6 = 4;
                                        i7 = 7;
                                        Class<?> cls442 = Class.forName($$c((byte) (-bArr62[41]), bArr62[126], (short) 1000));
                                        i21 = cls442.getDeclaredField($$c(bArr62[138], bArr62[23], (short) 977)).getInt(cls442);
                                        if (i21 < 34) {
                                        }
                                        zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                                        if (i21 >= 21) {
                                        }
                                        z16 = false;
                                        zArr3[z4 ? 1 : 0] = z16;
                                        zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                                        i8 = 0;
                                        z6 = false;
                                        z7 = z5;
                                        while (true) {
                                            int i782 = i5;
                                            if ((!z6) != z4) {
                                            }
                                            int i792 = i9 + 93;
                                            i7 = i11;
                                            cls41 = r4;
                                            cls40 = r6;
                                            i5 = i12;
                                            obj13 = obj3;
                                            z7 = z8;
                                            zArr = zArr4;
                                            $$c = str2;
                                            objArr = objArr2;
                                            zArr2 = zArr5;
                                            i6 = i10;
                                            zArr3 = zArr6;
                                            i34 = 5;
                                            i8 = (i792 | (-92)) + (i792 & (-92));
                                        }
                                    }
                                    i5 = 2;
                                    if (obj2 != null) {
                                        int i80 = $10 + 23;
                                        $11 = i80 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                        if (i80 % 2 == 0) {
                                            int i81 = 66 / 0;
                                        }
                                        z4 = true;
                                    } else if (str == null) {
                                        z4 = true;
                                        obj2 = null;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        byte[] bArr7 = $$a;
                                        c6 = 271;
                                        z4 = true;
                                        sb.append($$c(bArr7[i4], bArr7[c5], (short) 1068));
                                        sb.append(str);
                                        String sb2 = sb.toString();
                                        int i82 = $10;
                                        $11 = ((i82 ^ 23) + ((i82 & 23) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                        try {
                                            obj2 = Class.forName($$c(bArr7[251], bArr7[271], (short) 1058)).getDeclaredConstructor(String.class).newInstance(sb2);
                                            if (invoke2 == null) {
                                                byte[] bArr8 = $$a;
                                                try {
                                                    Object[] objArr3 = {$$c(bArr8[251], bArr8[72], (short) 1047)};
                                                    Class<?> cls45 = Class.forName($$c(bArr8[251], bArr8[29], (short) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK));
                                                    byte b20 = bArr8[91];
                                                    byte b21 = bArr8[c5];
                                                    try {
                                                        invoke2 = Class.forName($$c(bArr8[251], bArr8[c6], (short) 1058)).getDeclaredConstructor(String.class).newInstance(cls45.getMethod($$c(b20, b21, (short) ((b21 & 1009) | (b21 ^ 1009))), String.class).invoke(null, objArr3));
                                                    } catch (Throwable th2) {
                                                        Throwable cause3 = th2.getCause();
                                                        if (cause3 == null) {
                                                            throw th2;
                                                        }
                                                        throw cause3;
                                                    }
                                                } catch (Throwable th3) {
                                                    Throwable cause4 = th3.getCause();
                                                    if (cause4 == null) {
                                                        throw th3;
                                                    }
                                                    throw cause4;
                                                }
                                            }
                                            if (invoke == null && obj2 != null) {
                                                try {
                                                    Object[] objArr4 = new Object[2];
                                                    objArr4[z4 ? 1 : 0] = $$c((byte) (-$$a[c4]), r0[37], (short) 1009);
                                                    objArr4[0] = obj2;
                                                    short s6 = (short) 1058;
                                                    invoke = Class.forName($$c(r0[251], r0[c6], s6)).getDeclaredConstructor(Class.forName($$c(r0[251], r0[c6], s6)), String.class).newInstance(objArr4);
                                                } catch (Throwable th4) {
                                                    Throwable cause5 = th4.getCause();
                                                    if (cause5 == null) {
                                                        throw th4;
                                                    }
                                                    throw cause5;
                                                }
                                            }
                                            byte[] bArr622 = $$a;
                                            short s522 = (short) 1058;
                                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr622[251], bArr622[c6], s522)), 7);
                                            objArr[0] = null;
                                            objArr[z4 ? 1 : 0] = invoke;
                                            objArr[2] = obj2;
                                            objArr[3] = invoke2;
                                            objArr[4] = invoke;
                                            objArr[5] = obj2;
                                            objArr[6] = invoke2;
                                            zArr = new boolean[]{false, true, true, true, true, true, true};
                                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                            zArr3 = new boolean[7];
                                            zArr3[0] = false;
                                            zArr3[z4 ? 1 : 0] = false;
                                            zArr3[2] = z4;
                                            zArr3[3] = z4;
                                            zArr3[4] = false;
                                            zArr3[5] = z4;
                                            zArr3[6] = z4;
                                            i6 = 4;
                                            i7 = 7;
                                            Class<?> cls4422 = Class.forName($$c((byte) (-bArr622[41]), bArr622[126], (short) 1000));
                                            i21 = cls4422.getDeclaredField($$c(bArr622[138], bArr622[23], (short) 977)).getInt(cls4422);
                                            if (i21 < 34) {
                                                int i83 = $10;
                                                $11 = ((i83 & 89) + (i83 | 89)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                z5 = z4 ? 1 : 0;
                                            } else {
                                                z5 = false;
                                            }
                                            zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                                            if (i21 >= 21) {
                                                int i84 = $11;
                                                int i85 = (i84 & BuildConfig.API_LEVEL) + (i84 | BuildConfig.API_LEVEL);
                                                $10 = i85 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                if (i85 % 2 == 0) {
                                                    z16 = z4 ? 1 : 0;
                                                    zArr3[z4 ? 1 : 0] = z16;
                                                    zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                                                    i8 = 0;
                                                    z6 = false;
                                                    z7 = z5;
                                                    while (true) {
                                                        int i7822 = i5;
                                                        if ((!z6) != z4 || i8 >= 9) {
                                                            return;
                                                        }
                                                        if (zArr3[i8]) {
                                                            zArr4 = zArr;
                                                            str2 = $$c;
                                                            objArr2 = objArr;
                                                            zArr5 = zArr2;
                                                            zArr6 = zArr3;
                                                            z8 = z7 ? 1 : 0;
                                                            i9 = i8;
                                                            obj3 = obj13;
                                                            r6 = cls40;
                                                            r4 = cls41;
                                                            z9 = z6;
                                                            i10 = i6;
                                                            i11 = i7;
                                                            i12 = i7822;
                                                            cls3 = cls3;
                                                        } else {
                                                            try {
                                                                boolean z17 = zArr[i8];
                                                                Object obj14 = objArr[i8];
                                                                boolean z18 = zArr2[i8];
                                                                if (z17) {
                                                                    try {
                                                                        if (obj14 != null) {
                                                                            $10 = ($11 + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                            try {
                                                                                zArr4 = zArr;
                                                                                try {
                                                                                    str2 = $$c;
                                                                                    try {
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                        cause = th.getCause();
                                                                                        if (cause != null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause;
                                                                                    }
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                            }
                                                                        } else {
                                                                            zArr4 = zArr;
                                                                            str2 = $$c;
                                                                        }
                                                                        StringBuilder sb3 = new StringBuilder();
                                                                        byte[] bArr9 = $$a;
                                                                        byte b22 = bArr9[383];
                                                                        byte b23 = bArr9[i41];
                                                                        sb3.append($$c(b22, b23, (short) (b23 | 960)));
                                                                        sb3.append(obj14);
                                                                        byte b24 = bArr9[43];
                                                                        byte b25 = bArr9[i7];
                                                                        sb3.append($$c(b24, b25, (short) ((b25 ^ 960) | (b25 & 960))));
                                                                        try {
                                                                            throw ((Throwable) Class.forName($$c(bArr9[251], bArr9[14], (short) 960)).getDeclaredConstructor(String.class).newInstance(sb3.toString()));
                                                                        } catch (Throwable th8) {
                                                                            Throwable cause6 = th8.getCause();
                                                                            if (cause6 == null) {
                                                                                throw th8;
                                                                            }
                                                                            throw cause6;
                                                                        }
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        objArr2 = objArr;
                                                                        zArr5 = zArr2;
                                                                        zArr6 = zArr3;
                                                                        z10 = z7;
                                                                        i13 = i8;
                                                                        cls4 = cls40;
                                                                        cls5 = cls41;
                                                                        z9 = z6;
                                                                        i10 = i6;
                                                                        cls8 = cls5;
                                                                        cls7 = cls4;
                                                                        z11 = z10;
                                                                        cls6 = cls3;
                                                                        int currentTimeMillis6 = (int) System.currentTimeMillis();
                                                                        i9 = i13;
                                                                        int i86 = 318 - (~(i9 * (-317)));
                                                                        int i87 = ~i9;
                                                                        int i88 = ~(((-2) & currentTimeMillis6) | ((-2) ^ currentTimeMillis6));
                                                                        int i89 = -(-(((i88 & i87) | (i87 ^ i88)) * (-318)));
                                                                        int i90 = (i86 & i89) + (i86 | i89);
                                                                        int i91 = ~i9;
                                                                        int i92 = ~((i91 & currentTimeMillis6) | (i91 ^ currentTimeMillis6));
                                                                        int i93 = ~currentTimeMillis6;
                                                                        int i94 = (i93 & 1) | (i93 ^ 1);
                                                                        int i95 = ~((i94 & i9) | (i94 ^ i9));
                                                                        int i96 = i90 + (((i92 & i95) | (i92 ^ i95)) * 318);
                                                                        int i97 = ~currentTimeMillis6;
                                                                        int i98 = (i97 & i87) | (i87 ^ i97);
                                                                        int i99 = ~((i98 & 1) | (i98 ^ 1));
                                                                        int i100 = (i9 ^ 1) | (i9 & 1);
                                                                        int i101 = ~((currentTimeMillis6 & i100) | (i100 ^ currentTimeMillis6));
                                                                        i14 = i96 + (((i101 & i99) | (i99 ^ i101)) * 318);
                                                                        i11 = i7;
                                                                        while (true) {
                                                                            if (i14 < i11) {
                                                                            }
                                                                            i14++;
                                                                        }
                                                                        b11 = -1;
                                                                        if (z12) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    zArr4 = zArr;
                                                                    str2 = $$c;
                                                                }
                                                                if (z17) {
                                                                    try {
                                                                        Random random2 = new Random();
                                                                        $11 = ($10 + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                        try {
                                                                            objArr2 = objArr;
                                                                            try {
                                                                                try {
                                                                                    random2.setSeed(((Long) Class.forName($$c(r2[251], r2[29], (short) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)).getMethod($$c((byte) (-$$a[c4]), r2[i6], (short) 942), null).invoke(null, null)).longValue() ^ (-1297697413));
                                                                                    Object obj15 = null;
                                                                                    Object obj16 = null;
                                                                                    Object obj17 = null;
                                                                                    obj4 = null;
                                                                                    z7 = z7;
                                                                                    while (obj15 == null) {
                                                                                        if (obj16 == null) {
                                                                                            obj7 = obj15;
                                                                                            obj8 = obj16;
                                                                                            i15 = 6;
                                                                                        } else if (obj17 == null) {
                                                                                            int i102 = $10;
                                                                                            obj7 = obj15;
                                                                                            $11 = (((i102 | 39) << 1) - (i102 ^ 39)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                            obj8 = obj16;
                                                                                            i15 = i34;
                                                                                        } else {
                                                                                            obj7 = obj15;
                                                                                            if (obj4 == null) {
                                                                                                int i103 = $11;
                                                                                                int i104 = (i103 & 5) + (i103 | 5);
                                                                                                obj8 = obj16;
                                                                                                $10 = i104 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                if (i104 % 2 == 0) {
                                                                                                    i15 = i6;
                                                                                                }
                                                                                            } else {
                                                                                                obj8 = obj16;
                                                                                            }
                                                                                            i15 = 3;
                                                                                        }
                                                                                        zArr5 = zArr2;
                                                                                        try {
                                                                                            StringBuilder sb4 = new StringBuilder(i15 + 1);
                                                                                            sb4.append(JwtParser.SEPARATOR_CHAR);
                                                                                            int i105 = i22;
                                                                                            z7 = z7;
                                                                                            while (i105 < i15) {
                                                                                                if (z18) {
                                                                                                    i10 = i15;
                                                                                                    try {
                                                                                                        int nextInt = random2.nextInt(26);
                                                                                                        if (random2.nextBoolean()) {
                                                                                                            i17 = nextInt & 65;
                                                                                                            i18 = nextInt | 65;
                                                                                                        } else {
                                                                                                            int i106 = -(-nextInt);
                                                                                                            i17 = i106 ^ 96;
                                                                                                            i18 = (i106 & 96) << 1;
                                                                                                        }
                                                                                                        sb4.append((char) (i17 + i18));
                                                                                                        random = random2;
                                                                                                        i16 = i105;
                                                                                                        zArr6 = zArr3;
                                                                                                        z13 = z7 ? 1 : 0;
                                                                                                    } catch (Throwable th10) {
                                                                                                        th = th10;
                                                                                                        zArr6 = zArr3;
                                                                                                        z10 = z7;
                                                                                                        i13 = i8;
                                                                                                        cls4 = cls40;
                                                                                                        cls5 = cls41;
                                                                                                        z9 = z6;
                                                                                                        i10 = i6;
                                                                                                        cls8 = cls5;
                                                                                                        cls7 = cls4;
                                                                                                        z11 = z10;
                                                                                                        cls6 = cls3;
                                                                                                        int currentTimeMillis62 = (int) System.currentTimeMillis();
                                                                                                        i9 = i13;
                                                                                                        int i862 = 318 - (~(i9 * (-317)));
                                                                                                        int i872 = ~i9;
                                                                                                        int i882 = ~(((-2) & currentTimeMillis62) | ((-2) ^ currentTimeMillis62));
                                                                                                        int i892 = -(-(((i882 & i872) | (i872 ^ i882)) * (-318)));
                                                                                                        int i902 = (i862 & i892) + (i862 | i892);
                                                                                                        int i912 = ~i9;
                                                                                                        int i922 = ~((i912 & currentTimeMillis62) | (i912 ^ currentTimeMillis62));
                                                                                                        int i932 = ~currentTimeMillis62;
                                                                                                        int i942 = (i932 & 1) | (i932 ^ 1);
                                                                                                        int i952 = ~((i942 & i9) | (i942 ^ i9));
                                                                                                        int i962 = i902 + (((i922 & i952) | (i922 ^ i952)) * 318);
                                                                                                        int i972 = ~currentTimeMillis62;
                                                                                                        int i982 = (i972 & i872) | (i872 ^ i972);
                                                                                                        int i992 = ~((i982 & 1) | (i982 ^ 1));
                                                                                                        int i1002 = (i9 ^ 1) | (i9 & 1);
                                                                                                        int i1012 = ~((currentTimeMillis62 & i1002) | (i1002 ^ currentTimeMillis62));
                                                                                                        i14 = i962 + (((i1012 & i992) | (i992 ^ i1012)) * 318);
                                                                                                        i11 = i7;
                                                                                                        while (true) {
                                                                                                            if (i14 < i11) {
                                                                                                            }
                                                                                                            i14++;
                                                                                                        }
                                                                                                        b11 = -1;
                                                                                                        if (z12) {
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    i10 = i15;
                                                                                                    i16 = i105;
                                                                                                    try {
                                                                                                        int nextInt2 = random2.nextInt(i4);
                                                                                                        random = random2;
                                                                                                        int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                                                                        int i107 = -(-(nextInt2 * IronSourceError.ERROR_AD_UNIT_CAPPED));
                                                                                                        zArr6 = zArr3;
                                                                                                        z13 = z7 ? 1 : 0;
                                                                                                        int i108 = (i107 & 1058) + (i107 | 1058);
                                                                                                        int i109 = (i108 & 4341760) + (4341760 | i108) + (((~((~currentTimeMillis7) | nextInt2)) | (~((nextInt2 & 8192) | (nextInt2 ^ 8192)))) * 529);
                                                                                                        int i110 = ~(currentTimeMillis7 | nextInt2);
                                                                                                        try {
                                                                                                            sb4.append((char) (i109 + (((i110 & (-8193)) | ((-8193) ^ i110)) * 529)));
                                                                                                        } catch (Throwable th11) {
                                                                                                            th = th11;
                                                                                                            i13 = i8;
                                                                                                            cls4 = cls40;
                                                                                                            cls5 = cls41;
                                                                                                            z9 = z6;
                                                                                                            i10 = i6;
                                                                                                            i4 = 12;
                                                                                                            z10 = z13;
                                                                                                            cls8 = cls5;
                                                                                                            cls7 = cls4;
                                                                                                            z11 = z10;
                                                                                                            cls6 = cls3;
                                                                                                            int currentTimeMillis622 = (int) System.currentTimeMillis();
                                                                                                            i9 = i13;
                                                                                                            int i8622 = 318 - (~(i9 * (-317)));
                                                                                                            int i8722 = ~i9;
                                                                                                            int i8822 = ~(((-2) & currentTimeMillis622) | ((-2) ^ currentTimeMillis622));
                                                                                                            int i8922 = -(-(((i8822 & i8722) | (i8722 ^ i8822)) * (-318)));
                                                                                                            int i9022 = (i8622 & i8922) + (i8622 | i8922);
                                                                                                            int i9122 = ~i9;
                                                                                                            int i9222 = ~((i9122 & currentTimeMillis622) | (i9122 ^ currentTimeMillis622));
                                                                                                            int i9322 = ~currentTimeMillis622;
                                                                                                            int i9422 = (i9322 & 1) | (i9322 ^ 1);
                                                                                                            int i9522 = ~((i9422 & i9) | (i9422 ^ i9));
                                                                                                            int i9622 = i9022 + (((i9222 & i9522) | (i9222 ^ i9522)) * 318);
                                                                                                            int i9722 = ~currentTimeMillis622;
                                                                                                            int i9822 = (i9722 & i8722) | (i8722 ^ i9722);
                                                                                                            int i9922 = ~((i9822 & 1) | (i9822 ^ 1));
                                                                                                            int i10022 = (i9 ^ 1) | (i9 & 1);
                                                                                                            int i10122 = ~((currentTimeMillis622 & i10022) | (i10022 ^ currentTimeMillis622));
                                                                                                            i14 = i9622 + (((i10122 & i9922) | (i9922 ^ i10122)) * 318);
                                                                                                            i11 = i7;
                                                                                                            while (true) {
                                                                                                                if (i14 < i11) {
                                                                                                                    z12 = false;
                                                                                                                    break;
                                                                                                                } else {
                                                                                                                    if (zArr6[i14]) {
                                                                                                                        z12 = true;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    i14++;
                                                                                                                }
                                                                                                            }
                                                                                                            b11 = -1;
                                                                                                            if (z12) {
                                                                                                                int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                                                                                int i111 = ~((-210838785) | currentTimeMillis8);
                                                                                                                int i112 = ~currentTimeMillis8;
                                                                                                                int i113 = 469516347 + (((i111 & 264232) | (264232 ^ i111)) * (-756)) + (((i112 & (-210838785)) | ((-210838785) ^ i112)) * 756);
                                                                                                                int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                                                                                int i114 = (-719808358) - (~(((currentTimeMillis9 ^ 604276738) | (currentTimeMillis9 & 604276738)) * 988));
                                                                                                                int i115 = ~currentTimeMillis9;
                                                                                                                int i116 = -(-(((~((i115 & 882760770) | (i115 ^ 882760770))) | 1214382237) * (-1976)));
                                                                                                                int i117 = ((i114 | i116) << 1) - (i116 ^ i114);
                                                                                                                int i118 = 604276738 | (~(((-1492866270) & currentTimeMillis9) | ((-1492866270) ^ currentTimeMillis9)));
                                                                                                                int i119 = ~currentTimeMillis9;
                                                                                                                int i120 = -(-(((~((i119 & 1492866269) | (i119 ^ 1492866269))) | i118) * 988));
                                                                                                                if (i113 <= ((i117 | i120) << 1) - (i120 ^ i117)) {
                                                                                                                    byte[] bArr10 = $$a;
                                                                                                                    b4 = bArr10[6909];
                                                                                                                    b5 = bArr10[104];
                                                                                                                    b6 = bArr10[23326];
                                                                                                                } else {
                                                                                                                    byte[] bArr11 = $$a;
                                                                                                                    b4 = bArr11[383];
                                                                                                                    b5 = bArr11[117];
                                                                                                                    b6 = bArr11[1294];
                                                                                                                }
                                                                                                                try {
                                                                                                                    Object[] objArr5 = {$$c(b4, b5, b6), th};
                                                                                                                    byte[] bArr12 = $$a;
                                                                                                                    throw ((Throwable) Class.forName($$c(bArr12[251], bArr12[14], (short) 960)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr5));
                                                                                                                } catch (Throwable th12) {
                                                                                                                    Throwable cause7 = th12.getCause();
                                                                                                                    if (cause7 == null) {
                                                                                                                        throw th12;
                                                                                                                    }
                                                                                                                    throw cause7;
                                                                                                                }
                                                                                                            }
                                                                                                            obj3 = null;
                                                                                                            getVERSION_NAMEannotations = null;
                                                                                                            setConnector = null;
                                                                                                            int i121 = $10;
                                                                                                            $11 = (((i121 | 125) << 1) - (i121 ^ 125)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                            i12 = 2;
                                                                                                            i22 = 0;
                                                                                                            r4 = cls8;
                                                                                                            r6 = cls7;
                                                                                                            z8 = z11;
                                                                                                            cls3 = cls6;
                                                                                                            z4 = true;
                                                                                                            z6 = z9;
                                                                                                            int i7922 = i9 + 93;
                                                                                                            i7 = i11;
                                                                                                            cls41 = r4;
                                                                                                            cls40 = r6;
                                                                                                            i5 = i12;
                                                                                                            obj13 = obj3;
                                                                                                            z7 = z8;
                                                                                                            zArr = zArr4;
                                                                                                            $$c = str2;
                                                                                                            objArr = objArr2;
                                                                                                            zArr2 = zArr5;
                                                                                                            i6 = i10;
                                                                                                            zArr3 = zArr6;
                                                                                                            i34 = 5;
                                                                                                            i8 = (i7922 | (-92)) + (i7922 & (-92));
                                                                                                        }
                                                                                                    } catch (Throwable th13) {
                                                                                                        th = th13;
                                                                                                        zArr6 = zArr3;
                                                                                                        z13 = z7 ? 1 : 0;
                                                                                                        i13 = i8;
                                                                                                        cls4 = cls40;
                                                                                                        cls5 = cls41;
                                                                                                        z9 = z6;
                                                                                                        i10 = i6;
                                                                                                        i4 = 12;
                                                                                                        z10 = z13;
                                                                                                        cls8 = cls5;
                                                                                                        cls7 = cls4;
                                                                                                        z11 = z10;
                                                                                                        cls6 = cls3;
                                                                                                        int currentTimeMillis6222 = (int) System.currentTimeMillis();
                                                                                                        i9 = i13;
                                                                                                        int i86222 = 318 - (~(i9 * (-317)));
                                                                                                        int i87222 = ~i9;
                                                                                                        int i88222 = ~(((-2) & currentTimeMillis6222) | ((-2) ^ currentTimeMillis6222));
                                                                                                        int i89222 = -(-(((i88222 & i87222) | (i87222 ^ i88222)) * (-318)));
                                                                                                        int i90222 = (i86222 & i89222) + (i86222 | i89222);
                                                                                                        int i91222 = ~i9;
                                                                                                        int i92222 = ~((i91222 & currentTimeMillis6222) | (i91222 ^ currentTimeMillis6222));
                                                                                                        int i93222 = ~currentTimeMillis6222;
                                                                                                        int i94222 = (i93222 & 1) | (i93222 ^ 1);
                                                                                                        int i95222 = ~((i94222 & i9) | (i94222 ^ i9));
                                                                                                        int i96222 = i90222 + (((i92222 & i95222) | (i92222 ^ i95222)) * 318);
                                                                                                        int i97222 = ~currentTimeMillis6222;
                                                                                                        int i98222 = (i97222 & i87222) | (i87222 ^ i97222);
                                                                                                        int i99222 = ~((i98222 & 1) | (i98222 ^ 1));
                                                                                                        int i100222 = (i9 ^ 1) | (i9 & 1);
                                                                                                        int i101222 = ~((currentTimeMillis6222 & i100222) | (i100222 ^ currentTimeMillis6222));
                                                                                                        i14 = i96222 + (((i101222 & i99222) | (i99222 ^ i101222)) * 318);
                                                                                                        i11 = i7;
                                                                                                        while (true) {
                                                                                                            if (i14 < i11) {
                                                                                                            }
                                                                                                            i14++;
                                                                                                        }
                                                                                                        b11 = -1;
                                                                                                        if (z12) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                int i122 = i16 - 53;
                                                                                                i105 = (i122 ^ 54) + ((i122 & 54) << 1);
                                                                                                z7 = z13;
                                                                                                i15 = i10;
                                                                                                random2 = random;
                                                                                                zArr3 = zArr6;
                                                                                                i4 = 12;
                                                                                            }
                                                                                            Random random3 = random2;
                                                                                            zArr6 = zArr3;
                                                                                            z13 = z7 ? 1 : 0;
                                                                                            try {
                                                                                                String sb5 = sb4.toString();
                                                                                                if (obj8 == null) {
                                                                                                    try {
                                                                                                        Object[] objArr6 = new Object[i7822];
                                                                                                        objArr6[1] = sb5;
                                                                                                        objArr6[i22] = obj14;
                                                                                                        byte[] bArr13 = $$a;
                                                                                                        obj16 = Class.forName($$c(bArr13[251], bArr13[c6], s522)).getDeclaredConstructor(Class.forName($$c(bArr13[251], bArr13[c6], s522)), String.class).newInstance(objArr6);
                                                                                                        i10 = i8;
                                                                                                        obj17 = obj17;
                                                                                                        obj15 = obj7;
                                                                                                    } catch (Throwable th14) {
                                                                                                        Throwable cause8 = th14.getCause();
                                                                                                        if (cause8 == null) {
                                                                                                            throw th14;
                                                                                                        }
                                                                                                        throw cause8;
                                                                                                    }
                                                                                                } else {
                                                                                                    if (obj17 == null) {
                                                                                                        try {
                                                                                                            Object[] objArr7 = new Object[2];
                                                                                                            objArr7[1] = sb5;
                                                                                                            objArr7[i22] = obj14;
                                                                                                            byte[] bArr14 = $$a;
                                                                                                            obj9 = Class.forName($$c(bArr14[251], bArr14[c6], s522)).getDeclaredConstructor(Class.forName($$c(bArr14[251], bArr14[c6], s522)), String.class).newInstance(objArr7);
                                                                                                            i10 = i8;
                                                                                                            obj16 = obj8;
                                                                                                            obj17 = obj9;
                                                                                                        } catch (Throwable th15) {
                                                                                                            Throwable cause9 = th15.getCause();
                                                                                                            if (cause9 == null) {
                                                                                                                throw th15;
                                                                                                            }
                                                                                                            throw cause9;
                                                                                                        }
                                                                                                    } else if (obj4 == null) {
                                                                                                        try {
                                                                                                            Object[] objArr8 = new Object[2];
                                                                                                            objArr8[1] = sb5;
                                                                                                            objArr8[i22] = obj14;
                                                                                                            byte[] bArr15 = $$a;
                                                                                                            obj4 = Class.forName($$c(bArr15[251], bArr15[c6], s522)).getDeclaredConstructor(Class.forName($$c(bArr15[251], bArr15[c6], s522)), String.class).newInstance(objArr8);
                                                                                                            obj9 = obj17;
                                                                                                            i10 = i8;
                                                                                                            obj16 = obj8;
                                                                                                            obj17 = obj9;
                                                                                                        } catch (Throwable th16) {
                                                                                                            Throwable cause10 = th16.getCause();
                                                                                                            if (cause10 == null) {
                                                                                                                throw th16;
                                                                                                            }
                                                                                                            throw cause10;
                                                                                                        }
                                                                                                    } else {
                                                                                                        try {
                                                                                                            try {
                                                                                                                Object[] objArr9 = new Object[2];
                                                                                                                objArr9[1] = sb5;
                                                                                                                objArr9[i22] = obj14;
                                                                                                                byte[] bArr16 = $$a;
                                                                                                                obj15 = Class.forName($$c(bArr16[251], bArr16[c6], s522)).getDeclaredConstructor(Class.forName($$c(bArr16[251], bArr16[c6], s522)), String.class).newInstance(objArr9);
                                                                                                                try {
                                                                                                                    short s7 = (short) 926;
                                                                                                                    Object newInstance3 = Class.forName($$c(bArr16[251], bArr16[126], s7)).getDeclaredConstructor(Class.forName($$c(bArr16[251], bArr16[c6], s522))).newInstance(obj15);
                                                                                                                    try {
                                                                                                                        Class<?> cls46 = Class.forName($$c(bArr16[251], bArr16[126], s7));
                                                                                                                        byte b26 = (byte) (-bArr16[c4]);
                                                                                                                        byte b27 = bArr16[i41];
                                                                                                                        i10 = i8;
                                                                                                                        try {
                                                                                                                            cls46.getMethod($$c(b26, b27, (short) ((b27 ^ 899) | (b27 & 899))), null).invoke(newInstance3, null);
                                                                                                                            obj16 = obj8;
                                                                                                                        } catch (Throwable th17) {
                                                                                                                            th = th17;
                                                                                                                            Throwable cause11 = th.getCause();
                                                                                                                            if (cause11 == null) {
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                            throw cause11;
                                                                                                                        }
                                                                                                                    } catch (Throwable th18) {
                                                                                                                        th = th18;
                                                                                                                    }
                                                                                                                } catch (Throwable th19) {
                                                                                                                    Throwable cause12 = th19.getCause();
                                                                                                                    if (cause12 == null) {
                                                                                                                        throw th19;
                                                                                                                    }
                                                                                                                    throw cause12;
                                                                                                                }
                                                                                                            } catch (Throwable th20) {
                                                                                                                Throwable cause13 = th20.getCause();
                                                                                                                if (cause13 == null) {
                                                                                                                    throw th20;
                                                                                                                }
                                                                                                                throw cause13;
                                                                                                            }
                                                                                                        } catch (Exception e5) {
                                                                                                            try {
                                                                                                                StringBuilder sb6 = new StringBuilder();
                                                                                                                byte[] bArr17 = $$a;
                                                                                                                sb6.append($$c(bArr17[383], bArr17[i41], (short) 899));
                                                                                                                sb6.append((Object) 2);
                                                                                                                byte b28 = bArr17[43];
                                                                                                                byte b29 = bArr17[i7];
                                                                                                                sb6.append($$c(b28, b29, (short) ((b29 ^ 960) | (b29 & 960))));
                                                                                                                String sb7 = sb6.toString();
                                                                                                                try {
                                                                                                                    Object[] objArr10 = new Object[2];
                                                                                                                    objArr10[1] = e5;
                                                                                                                    objArr10[i22] = sb7;
                                                                                                                    throw ((Throwable) Class.forName($$c(bArr17[251], bArr17[14], (short) 960)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr10));
                                                                                                                } catch (Throwable th21) {
                                                                                                                    Throwable cause14 = th21.getCause();
                                                                                                                    if (cause14 == null) {
                                                                                                                        throw th21;
                                                                                                                    }
                                                                                                                    throw cause14;
                                                                                                                }
                                                                                                            } catch (Throwable th22) {
                                                                                                                th = th22;
                                                                                                                cls9 = cls40;
                                                                                                                cls10 = cls41;
                                                                                                                z9 = z6;
                                                                                                                i13 = i10;
                                                                                                                i4 = 12;
                                                                                                                z14 = z13;
                                                                                                                i10 = i6;
                                                                                                                cls8 = cls10;
                                                                                                                cls7 = cls9;
                                                                                                                z11 = z14;
                                                                                                                cls6 = cls3;
                                                                                                                int currentTimeMillis62222 = (int) System.currentTimeMillis();
                                                                                                                i9 = i13;
                                                                                                                int i862222 = 318 - (~(i9 * (-317)));
                                                                                                                int i872222 = ~i9;
                                                                                                                int i882222 = ~(((-2) & currentTimeMillis62222) | ((-2) ^ currentTimeMillis62222));
                                                                                                                int i892222 = -(-(((i882222 & i872222) | (i872222 ^ i882222)) * (-318)));
                                                                                                                int i902222 = (i862222 & i892222) + (i862222 | i892222);
                                                                                                                int i912222 = ~i9;
                                                                                                                int i922222 = ~((i912222 & currentTimeMillis62222) | (i912222 ^ currentTimeMillis62222));
                                                                                                                int i932222 = ~currentTimeMillis62222;
                                                                                                                int i942222 = (i932222 & 1) | (i932222 ^ 1);
                                                                                                                int i952222 = ~((i942222 & i9) | (i942222 ^ i9));
                                                                                                                int i962222 = i902222 + (((i922222 & i952222) | (i922222 ^ i952222)) * 318);
                                                                                                                int i972222 = ~currentTimeMillis62222;
                                                                                                                int i982222 = (i972222 & i872222) | (i872222 ^ i972222);
                                                                                                                int i992222 = ~((i982222 & 1) | (i982222 ^ 1));
                                                                                                                int i1002222 = (i9 ^ 1) | (i9 & 1);
                                                                                                                int i1012222 = ~((currentTimeMillis62222 & i1002222) | (i1002222 ^ currentTimeMillis62222));
                                                                                                                i14 = i962222 + (((i1012222 & i992222) | (i992222 ^ i1012222)) * 318);
                                                                                                                i11 = i7;
                                                                                                                while (true) {
                                                                                                                    if (i14 < i11) {
                                                                                                                    }
                                                                                                                    i14++;
                                                                                                                }
                                                                                                                b11 = -1;
                                                                                                                if (z12) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    obj15 = obj7;
                                                                                                }
                                                                                                z7 = z13 ? 1 : 0;
                                                                                                zArr2 = zArr5;
                                                                                                i8 = i10;
                                                                                                random2 = random3;
                                                                                                zArr3 = zArr6;
                                                                                                i4 = 12;
                                                                                                i7822 = 2;
                                                                                                obj17 = obj17;
                                                                                            } catch (Throwable th23) {
                                                                                                th = th23;
                                                                                                i10 = i8;
                                                                                                cls9 = cls40;
                                                                                                cls10 = cls41;
                                                                                                z9 = z6;
                                                                                                i13 = i10;
                                                                                                i4 = 12;
                                                                                                z14 = z13;
                                                                                                i10 = i6;
                                                                                                cls8 = cls10;
                                                                                                cls7 = cls9;
                                                                                                z11 = z14;
                                                                                                cls6 = cls3;
                                                                                                int currentTimeMillis622222 = (int) System.currentTimeMillis();
                                                                                                i9 = i13;
                                                                                                int i8622222 = 318 - (~(i9 * (-317)));
                                                                                                int i8722222 = ~i9;
                                                                                                int i8822222 = ~(((-2) & currentTimeMillis622222) | ((-2) ^ currentTimeMillis622222));
                                                                                                int i8922222 = -(-(((i8822222 & i8722222) | (i8722222 ^ i8822222)) * (-318)));
                                                                                                int i9022222 = (i8622222 & i8922222) + (i8622222 | i8922222);
                                                                                                int i9122222 = ~i9;
                                                                                                int i9222222 = ~((i9122222 & currentTimeMillis622222) | (i9122222 ^ currentTimeMillis622222));
                                                                                                int i9322222 = ~currentTimeMillis622222;
                                                                                                int i9422222 = (i9322222 & 1) | (i9322222 ^ 1);
                                                                                                int i9522222 = ~((i9422222 & i9) | (i9422222 ^ i9));
                                                                                                int i9622222 = i9022222 + (((i9222222 & i9522222) | (i9222222 ^ i9522222)) * 318);
                                                                                                int i9722222 = ~currentTimeMillis622222;
                                                                                                int i9822222 = (i9722222 & i8722222) | (i8722222 ^ i9722222);
                                                                                                int i9922222 = ~((i9822222 & 1) | (i9822222 ^ 1));
                                                                                                int i10022222 = (i9 ^ 1) | (i9 & 1);
                                                                                                int i10122222 = ~((currentTimeMillis622222 & i10022222) | (i10022222 ^ currentTimeMillis622222));
                                                                                                i14 = i9622222 + (((i10122222 & i9922222) | (i9922222 ^ i10122222)) * 318);
                                                                                                i11 = i7;
                                                                                                while (true) {
                                                                                                    if (i14 < i11) {
                                                                                                    }
                                                                                                    i14++;
                                                                                                }
                                                                                                b11 = -1;
                                                                                                if (z12) {
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th24) {
                                                                                            th = th24;
                                                                                            zArr6 = zArr3;
                                                                                            z13 = z7;
                                                                                            i10 = i8;
                                                                                            cls9 = cls40;
                                                                                            cls10 = cls41;
                                                                                            z9 = z6;
                                                                                            i13 = i10;
                                                                                            i4 = 12;
                                                                                            z14 = z13;
                                                                                            i10 = i6;
                                                                                            cls8 = cls10;
                                                                                            cls7 = cls9;
                                                                                            z11 = z14;
                                                                                            cls6 = cls3;
                                                                                            int currentTimeMillis6222222 = (int) System.currentTimeMillis();
                                                                                            i9 = i13;
                                                                                            int i86222222 = 318 - (~(i9 * (-317)));
                                                                                            int i87222222 = ~i9;
                                                                                            int i88222222 = ~(((-2) & currentTimeMillis6222222) | ((-2) ^ currentTimeMillis6222222));
                                                                                            int i89222222 = -(-(((i88222222 & i87222222) | (i87222222 ^ i88222222)) * (-318)));
                                                                                            int i90222222 = (i86222222 & i89222222) + (i86222222 | i89222222);
                                                                                            int i91222222 = ~i9;
                                                                                            int i92222222 = ~((i91222222 & currentTimeMillis6222222) | (i91222222 ^ currentTimeMillis6222222));
                                                                                            int i93222222 = ~currentTimeMillis6222222;
                                                                                            int i94222222 = (i93222222 & 1) | (i93222222 ^ 1);
                                                                                            int i95222222 = ~((i94222222 & i9) | (i94222222 ^ i9));
                                                                                            int i96222222 = i90222222 + (((i92222222 & i95222222) | (i92222222 ^ i95222222)) * 318);
                                                                                            int i97222222 = ~currentTimeMillis6222222;
                                                                                            int i98222222 = (i97222222 & i87222222) | (i87222222 ^ i97222222);
                                                                                            int i99222222 = ~((i98222222 & 1) | (i98222222 ^ 1));
                                                                                            int i100222222 = (i9 ^ 1) | (i9 & 1);
                                                                                            int i101222222 = ~((currentTimeMillis6222222 & i100222222) | (i100222222 ^ currentTimeMillis6222222));
                                                                                            i14 = i96222222 + (((i101222222 & i99222222) | (i99222222 ^ i101222222)) * 318);
                                                                                            i11 = i7;
                                                                                            while (true) {
                                                                                                if (i14 < i11) {
                                                                                                }
                                                                                                i14++;
                                                                                            }
                                                                                            b11 = -1;
                                                                                            if (z12) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    obj5 = obj15;
                                                                                    obj6 = obj16;
                                                                                    r62 = z7;
                                                                                    r8 = obj17;
                                                                                } catch (Throwable th25) {
                                                                                    th = th25;
                                                                                    zArr5 = zArr2;
                                                                                    zArr6 = zArr3;
                                                                                    z13 = z7;
                                                                                    i10 = i8;
                                                                                    cls9 = cls40;
                                                                                    cls10 = cls41;
                                                                                    z9 = z6;
                                                                                    i13 = i10;
                                                                                    i4 = 12;
                                                                                    z14 = z13;
                                                                                    i10 = i6;
                                                                                    cls8 = cls10;
                                                                                    cls7 = cls9;
                                                                                    z11 = z14;
                                                                                    cls6 = cls3;
                                                                                    int currentTimeMillis62222222 = (int) System.currentTimeMillis();
                                                                                    i9 = i13;
                                                                                    int i862222222 = 318 - (~(i9 * (-317)));
                                                                                    int i872222222 = ~i9;
                                                                                    int i882222222 = ~(((-2) & currentTimeMillis62222222) | ((-2) ^ currentTimeMillis62222222));
                                                                                    int i892222222 = -(-(((i882222222 & i872222222) | (i872222222 ^ i882222222)) * (-318)));
                                                                                    int i902222222 = (i862222222 & i892222222) + (i862222222 | i892222222);
                                                                                    int i912222222 = ~i9;
                                                                                    int i922222222 = ~((i912222222 & currentTimeMillis62222222) | (i912222222 ^ currentTimeMillis62222222));
                                                                                    int i932222222 = ~currentTimeMillis62222222;
                                                                                    int i942222222 = (i932222222 & 1) | (i932222222 ^ 1);
                                                                                    int i952222222 = ~((i942222222 & i9) | (i942222222 ^ i9));
                                                                                    int i962222222 = i902222222 + (((i922222222 & i952222222) | (i922222222 ^ i952222222)) * 318);
                                                                                    int i972222222 = ~currentTimeMillis62222222;
                                                                                    int i982222222 = (i972222222 & i872222222) | (i872222222 ^ i972222222);
                                                                                    int i992222222 = ~((i982222222 & 1) | (i982222222 ^ 1));
                                                                                    int i1002222222 = (i9 ^ 1) | (i9 & 1);
                                                                                    int i1012222222 = ~((currentTimeMillis62222222 & i1002222222) | (i1002222222 ^ currentTimeMillis62222222));
                                                                                    i14 = i962222222 + (((i1012222222 & i992222222) | (i992222222 ^ i1012222222)) * 318);
                                                                                    i11 = i7;
                                                                                    while (true) {
                                                                                        if (i14 < i11) {
                                                                                        }
                                                                                        i14++;
                                                                                    }
                                                                                    b11 = -1;
                                                                                    if (z12) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th26) {
                                                                                th = th26;
                                                                                boolean z19 = z7 ? 1 : 0;
                                                                                Throwable cause15 = th.getCause();
                                                                                if (cause15 == null) {
                                                                                    throw th;
                                                                                }
                                                                                throw cause15;
                                                                            }
                                                                        } catch (Throwable th27) {
                                                                            th = th27;
                                                                        }
                                                                    } catch (Throwable th28) {
                                                                        th = th28;
                                                                        objArr2 = objArr;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr;
                                                                    r8 = 0;
                                                                    obj4 = null;
                                                                    obj6 = null;
                                                                    obj5 = null;
                                                                    r62 = z7;
                                                                }
                                                                zArr5 = zArr2;
                                                                zArr6 = zArr3;
                                                                z8 = r62;
                                                                i10 = i8;
                                                                byte[] bArr18 = $$a;
                                                                i4 = 12;
                                                                try {
                                                                    byte b30 = bArr18[12];
                                                                    byte b31 = (byte) (-bArr18[10]);
                                                                    ?? r43 = b31 & 844;
                                                                    String $$c3 = $$c(b30, b31, (short) ((b31 ^ 844) | r43));
                                                                    try {
                                                                        try {
                                                                            r62 = new Class[]{String.class};
                                                                            r43 = Class.class.getMethod($$c(bArr18[91], bArr18[c5], (short) 844), r62);
                                                                            Object invoke4 = r43.invoke(AFPurchaseConnectorA1w.class, $$c3);
                                                                            try {
                                                                                Class<?> cls47 = Class.forName($$c(bArr18[251], bArr18[c6], (short) 834));
                                                                                byte b32 = bArr18[91];
                                                                                byte b33 = bArr18[23];
                                                                                r62 = (short) ((b33 ^ 817) | (b33 & 817));
                                                                                r43 = $$c(b32, b33, r62);
                                                                                String str4 = (String) cls47.getMethod(r43, null).invoke(invoke4, null);
                                                                                StringBuilder sb8 = new StringBuilder();
                                                                                byte b34 = bArr18[i7];
                                                                                byte b35 = b34;
                                                                                r6 = (short) ((b35 ^ 817) | (b35 & 817));
                                                                                sb8.append($$c(b34, b35, r6));
                                                                                sb8.append($$c3);
                                                                                ZipFile zipFile14 = new ZipFile(str4.substring(i34, str4.lastIndexOf(sb8.toString())));
                                                                                try {
                                                                                    byte[] bArr19 = new byte[7697];
                                                                                    r42 = 1;
                                                                                    try {
                                                                                        Object[] objArr11 = {zipFile14.getInputStream(zipFile14.getEntry($$c3.substring(1)))};
                                                                                        r42 = Class.forName($$c(bArr18[251], bArr18[859], (short) 817));
                                                                                        byte b36 = bArr18[251];
                                                                                        r6 = bArr18[14];
                                                                                        try {
                                                                                            Object[] objArr12 = {r42.getDeclaredConstructor(Class.forName($$c(b36, r6, (short) ((r6 ^ 773) | (r6 & 773))))).newInstance(objArr11)};
                                                                                            short s8 = (short) 773;
                                                                                            ?? cls48 = Class.forName($$c(bArr18[251], bArr18[117], s8));
                                                                                            byte b37 = bArr18[251];
                                                                                            r6 = bArr18[14];
                                                                                            Object obj18 = r8;
                                                                                            r8 = r6 & 773;
                                                                                            r42 = new Class[]{Class.forName($$c(b37, r6, (short) ((r6 ^ 773) | r8)))};
                                                                                            Object newInstance4 = cls48.getDeclaredConstructor(r42).newInstance(objArr12);
                                                                                            try {
                                                                                                Class<?> cls49 = Class.forName($$c(bArr18[251], bArr18[117], s8));
                                                                                                byte b38 = bArr18[1];
                                                                                                byte b39 = bArr18[43];
                                                                                                r8 = (short) ((b39 ^ 743) | (b39 & 743));
                                                                                                r6 = $$c(b38, b39, r8);
                                                                                                r42 = cls49.getMethod(r6, cls40);
                                                                                                r42.invoke(newInstance4, bArr19);
                                                                                                $11 = ($10 + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                try {
                                                                                                    try {
                                                                                                        Class<?> cls50 = Class.forName($$c(bArr18[251], bArr18[117], s8));
                                                                                                        r42 = (byte) (-bArr18[c4]);
                                                                                                        byte b40 = bArr18[i41];
                                                                                                        r6 = 899;
                                                                                                        cls50.getMethod($$c(r42, b40, (short) ((b40 ^ 899) | (b40 & 899))), null).invoke(newInstance4, null);
                                                                                                        int i123 = 17;
                                                                                                        int i124 = 7653;
                                                                                                        byte[] bArr20 = bArr19;
                                                                                                        String str5 = str2;
                                                                                                        Class cls51 = null;
                                                                                                        ?? r66 = cls3;
                                                                                                        while (true) {
                                                                                                            long j4 = 1;
                                                                                                            int length = bArr20.length;
                                                                                                            long j5 = j4;
                                                                                                            int i125 = i22;
                                                                                                            while (i125 < length) {
                                                                                                                int i126 = $10;
                                                                                                                int i127 = (i126 ^ 95) + ((i126 & 95) << 1);
                                                                                                                int i128 = length;
                                                                                                                $11 = i127 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                if (i127 % 2 == 0) {
                                                                                                                    try {
                                                                                                                        j5 = ((bArr20[i125] % (j5 >> 10)) | (j5 << 45)) % j5;
                                                                                                                        int i129 = i125 + 19;
                                                                                                                        i125 = ((i129 & (-7)) << 1) + (i129 ^ (-7));
                                                                                                                        length = i128;
                                                                                                                    } catch (Throwable th29) {
                                                                                                                        th = th29;
                                                                                                                        th = th;
                                                                                                                        zipFile = zipFile14;
                                                                                                                        r62 = cls40;
                                                                                                                        r43 = cls41;
                                                                                                                        z9 = z6;
                                                                                                                        i13 = i10;
                                                                                                                        i4 = 12;
                                                                                                                        i10 = i6;
                                                                                                                        cls3 = r66;
                                                                                                                        try {
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        } catch (Throwable th30) {
                                                                                                                            th.addSuppressed(th30);
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    int i130 = i125;
                                                                                                                    try {
                                                                                                                        j5 = ((bArr20[i130] + (j5 << 6)) + (j5 << i41)) - j5;
                                                                                                                        int i131 = ((i130 | 45) << 1) - (i130 ^ 45);
                                                                                                                        i125 = ((i131 | (-44)) << 1) - (i131 ^ (-44));
                                                                                                                        length = i128;
                                                                                                                    } catch (Throwable th31) {
                                                                                                                        th = th31;
                                                                                                                        th = th;
                                                                                                                        zipFile = zipFile14;
                                                                                                                        r62 = cls40;
                                                                                                                        r43 = cls41;
                                                                                                                        z9 = z6;
                                                                                                                        i13 = i10;
                                                                                                                        i4 = 12;
                                                                                                                        i10 = i6;
                                                                                                                        cls3 = r66;
                                                                                                                        zipFile.close();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            int i132 = i123 + 471;
                                                                                                            byte b41 = bArr20[((i123 | 7679) << 1) - (i123 ^ 7679)];
                                                                                                            bArr20[i132] = (byte) ((b41 ^ 112) + ((b41 & 112) << 1));
                                                                                                            int length2 = bArr20.length;
                                                                                                            int i133 = -i123;
                                                                                                            int i134 = i123;
                                                                                                            byte[] bArr21 = bArr20;
                                                                                                            int currentTimeMillis10 = (int) System.currentTimeMillis();
                                                                                                            int i135 = i133 * LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK;
                                                                                                            int i136 = -(-(length2 * LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK));
                                                                                                            int i137 = ((i135 | i136) << 1) - (i135 ^ i136);
                                                                                                            int i138 = (length2 ^ currentTimeMillis10) | (length2 & currentTimeMillis10);
                                                                                                            int i139 = ~i133;
                                                                                                            int i140 = i137 + (((i138 ^ i139) | (i138 & i139)) * (-627));
                                                                                                            int i141 = ~length2;
                                                                                                            int i142 = (i140 - (~(((~((i141 ^ currentTimeMillis10) | (i141 & currentTimeMillis10))) | i133) * (-627)))) - 1;
                                                                                                            int i143 = ~currentTimeMillis10;
                                                                                                            int i144 = (i142 - (~(((~((currentTimeMillis10 & i133) | (i133 ^ currentTimeMillis10))) | (~((i143 ^ length2) | (i143 & length2)))) * LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED))) - 1;
                                                                                                            try {
                                                                                                                Object[] objArr13 = new Object[3];
                                                                                                                try {
                                                                                                                    objArr13[2] = Integer.valueOf(i144);
                                                                                                                    objArr13[1] = Integer.valueOf(i134);
                                                                                                                    objArr13[i22] = bArr21;
                                                                                                                    byte[] bArr22 = $$a;
                                                                                                                    byte b42 = bArr22[251];
                                                                                                                    byte b43 = bArr22[240];
                                                                                                                    int i145 = $$b;
                                                                                                                    Class<?> cls52 = Class.forName($$c(b42, b43, (short) ((i145 ^ 576) | (i145 & 576))));
                                                                                                                    Class cls53 = Integer.TYPE;
                                                                                                                    Object newInstance5 = cls52.getDeclaredConstructor(cls40, cls53, cls53).newInstance(objArr13);
                                                                                                                    Object obj19 = getVERSION_NAMEannotations;
                                                                                                                    if (obj19 == null) {
                                                                                                                        try {
                                                                                                                            PurchaseClientInAppPurchaseValidationResultListener = j5;
                                                                                                                            byte[] bArr23 = {77, 104, -127, 56, 103, -32, 35, 34, 109, 93, -95, 29, -93, 70, 58, 82};
                                                                                                                            i19 = i145;
                                                                                                                            r66 = (int) (j5 ^ ((SystemClock.elapsedRealtime() >> 48) - 5016720371489821289L));
                                                                                                                            byte globalActionKeyTimeout = (byte) (PurchaseClientInAppPurchaseValidationResultListener ^ ((ViewConfiguration.getGlobalActionKeyTimeout() >> 32) + 5016720372001319553L));
                                                                                                                            byte[] bArr24 = new byte[i41];
                                                                                                                            i13 = i10;
                                                                                                                            try {
                                                                                                                                i10 = i6;
                                                                                                                                int uptimeMillis = (int) (PurchaseClientInAppPurchaseValidationResultListener ^ (5016720372001319561L - (SystemClock.uptimeMillis() >> 48)));
                                                                                                                                int i146 = i22;
                                                                                                                                int deadChar = KeyEvent.getDeadChar(i146, i146);
                                                                                                                                try {
                                                                                                                                    Object[] objArr14 = new Object[5];
                                                                                                                                    objArr14[i10] = 16;
                                                                                                                                    objArr14[3] = Integer.valueOf(deadChar);
                                                                                                                                    objArr14[2] = bArr24;
                                                                                                                                    objArr14[1] = Integer.valueOf(uptimeMillis);
                                                                                                                                    objArr14[0] = bArr23;
                                                                                                                                    Class<?> cls54 = Class.forName($$c(bArr22[251], bArr22[29], (short) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK));
                                                                                                                                    byte b44 = (byte) (-bArr22[41]);
                                                                                                                                    byte b45 = bArr22[43];
                                                                                                                                    obj10 = obj4;
                                                                                                                                    z9 = z6;
                                                                                                                                    cls13 = cls53;
                                                                                                                                    try {
                                                                                                                                        cls54.getMethod($$c(b44, b45, (short) (b45 | 708)), Object.class, cls13, Object.class, cls13, cls13).invoke(null, objArr14);
                                                                                                                                        try {
                                                                                                                                            AFPurchaseConnectorA1m.getPackageName(bArr24, onNewPurchases, PurchaseClientPurchaseEventDataSource);
                                                                                                                                            try {
                                                                                                                                                Object[] objArr15 = new Object[i10];
                                                                                                                                                objArr15[3] = AFPurchaseConnectorA1j.toJsonMap(r66);
                                                                                                                                                objArr15[2] = bArr24;
                                                                                                                                                objArr15[1] = Integer.valueOf(globalActionKeyTimeout);
                                                                                                                                                objArr15[0] = newInstance5;
                                                                                                                                                Class<?> cls55 = Class.forName($$c((byte) (-bArr22[c4]), (byte) (-bArr22[116]), (short) IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT));
                                                                                                                                                byte b46 = bArr22[251];
                                                                                                                                                byte b47 = bArr22[14];
                                                                                                                                                newInstance = cls55.getDeclaredConstructor(Class.forName($$c(b46, b47, (short) ((b47 ^ 773) | (b47 & 773)))), cls13, cls40, byte[][].class).newInstance(objArr15);
                                                                                                                                                zipFile3 = zipFile14;
                                                                                                                                                cls14 = cls51;
                                                                                                                                                cls25 = r66;
                                                                                                                                            } catch (Throwable th32) {
                                                                                                                                                Throwable cause16 = th32.getCause();
                                                                                                                                                if (cause16 == null) {
                                                                                                                                                    throw th32;
                                                                                                                                                }
                                                                                                                                                throw cause16;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th33) {
                                                                                                                                            th = th33;
                                                                                                                                            th = th;
                                                                                                                                            zipFile2 = zipFile14;
                                                                                                                                            cls11 = cls40;
                                                                                                                                            cls12 = cls41;
                                                                                                                                            cls18 = r66;
                                                                                                                                            i41 = 16;
                                                                                                                                            i4 = 12;
                                                                                                                                            cls21 = cls12;
                                                                                                                                            cls20 = cls11;
                                                                                                                                            zipFile5 = zipFile2;
                                                                                                                                            cls19 = cls18;
                                                                                                                                            cls24 = cls21;
                                                                                                                                            cls23 = cls20;
                                                                                                                                            zipFile6 = zipFile5;
                                                                                                                                            cls22 = cls19;
                                                                                                                                            i10 = 4;
                                                                                                                                            r43 = cls24;
                                                                                                                                            r62 = cls23;
                                                                                                                                            zipFile = zipFile6;
                                                                                                                                            cls3 = cls22;
                                                                                                                                            zipFile.close();
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th34) {
                                                                                                                                        th = th34;
                                                                                                                                        Throwable cause17 = th.getCause();
                                                                                                                                        if (cause17 == null) {
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                        throw cause17;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th35) {
                                                                                                                                    th = th35;
                                                                                                                                }
                                                                                                                            } catch (Throwable th36) {
                                                                                                                                th = th36;
                                                                                                                                z9 = z6;
                                                                                                                            }
                                                                                                                        } catch (Throwable th37) {
                                                                                                                            th = th37;
                                                                                                                            z9 = z6;
                                                                                                                            i13 = i10;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i19 = i145;
                                                                                                                        obj10 = obj4;
                                                                                                                        z9 = z6;
                                                                                                                        i13 = i10;
                                                                                                                        cls13 = cls53;
                                                                                                                        try {
                                                                                                                            PurchaseClientSubscriptionPurchaseEventDataSource = j5;
                                                                                                                        } catch (Throwable th38) {
                                                                                                                            th = th38;
                                                                                                                            zipFile4 = zipFile14;
                                                                                                                            cls16 = cls40;
                                                                                                                            cls17 = cls41;
                                                                                                                            cls15 = r66;
                                                                                                                            i41 = 16;
                                                                                                                            i4 = 12;
                                                                                                                            r42 = cls17;
                                                                                                                            r6 = cls16;
                                                                                                                            r8 = zipFile4;
                                                                                                                            cls3 = cls15;
                                                                                                                            i10 = 4;
                                                                                                                            th = th;
                                                                                                                            r43 = r42;
                                                                                                                            r62 = r6;
                                                                                                                            zipFile = r8;
                                                                                                                            cls3 = cls3;
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            byte[] bArr25 = {Byte.MAX_VALUE, -97, 72, -60, -9, -125, 50, 56, 53, -27, -106, -15, 102, 99, 19, -101};
                                                                                                                            int elapsedCpuTime = (int) (j5 ^ ((Process.getElapsedCpuTime() >> 48) - 1553242459560331721L));
                                                                                                                            try {
                                                                                                                                Object[] objArr16 = new Object[4];
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        objArr16[3] = Integer.valueOf((byte) (PurchaseClientSubscriptionPurchaseEventDataSource ^ ((ViewConfiguration.getZoomControlsTimeout() >> 32) + 1553242459803750819L)));
                                                                                                                                        objArr16[2] = Integer.valueOf(elapsedCpuTime);
                                                                                                                                        objArr16[1] = bArr25;
                                                                                                                                        objArr16[0] = newInstance5;
                                                                                                                                        cls39 = Class.forName($$c((byte) (-bArr22[c4]), bArr22[261], (short) 645), true, (ClassLoader) setConnector);
                                                                                                                                        $$c2 = $$c((byte) (i19 >>> 1), bArr22[43], (short) 580);
                                                                                                                                        b9 = bArr22[251];
                                                                                                                                        b10 = bArr22[14];
                                                                                                                                        zipFile3 = zipFile14;
                                                                                                                                        cls14 = cls51;
                                                                                                                                    } catch (Throwable th39) {
                                                                                                                                        th = th39;
                                                                                                                                        cause2 = th.getCause();
                                                                                                                                        if (cause2 != null) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        newInstance = cls39.getMethod($$c2, Class.forName($$c(b9, b10, (short) ((b10 ^ 773) | (b10 & 773)))), cls40, cls13, cls13).invoke(obj19, objArr16);
                                                                                                                                        cls25 = r66;
                                                                                                                                    } catch (Throwable th40) {
                                                                                                                                        th = th40;
                                                                                                                                        cause2 = th.getCause();
                                                                                                                                        if (cause2 != null) {
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                        throw cause2;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th41) {
                                                                                                                                    th = th41;
                                                                                                                                }
                                                                                                                            } catch (Throwable th42) {
                                                                                                                                th = th42;
                                                                                                                            }
                                                                                                                        } catch (Throwable th43) {
                                                                                                                            th = th43;
                                                                                                                            r8 = zipFile14;
                                                                                                                            r6 = cls40;
                                                                                                                            r42 = cls41;
                                                                                                                            i41 = 16;
                                                                                                                            i4 = 12;
                                                                                                                            cls3 = r66;
                                                                                                                            i10 = 4;
                                                                                                                            th = th;
                                                                                                                            r43 = r42;
                                                                                                                            r62 = r6;
                                                                                                                            zipFile = r8;
                                                                                                                            cls3 = cls3;
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        byte b48 = bArr22[251];
                                                                                                                        byte b49 = bArr22[14];
                                                                                                                        Class<?> cls56 = Class.forName($$c(b48, b49, (short) ((b49 ^ 773) | (b49 & 773))));
                                                                                                                        byte b50 = bArr22[1];
                                                                                                                        int currentTimeMillis11 = (int) System.currentTimeMillis();
                                                                                                                        int i147 = b50 * (-282);
                                                                                                                        int i148 = (284 & i147) + (i147 | 284);
                                                                                                                        int i149 = ~((-2) | b50);
                                                                                                                        int i150 = ~(((-2) ^ currentTimeMillis11) | ((-2) & currentTimeMillis11));
                                                                                                                        int i151 = -(-(((i149 ^ i150) | (i149 & i150)) * (-283)));
                                                                                                                        int i152 = ~b50;
                                                                                                                        int i153 = (i148 & i151) + (i151 | i148) + ((~(i152 | 1)) * 283);
                                                                                                                        int i154 = (i152 & (-2)) | ((-2) ^ i152);
                                                                                                                        int i155 = (~((i154 & currentTimeMillis11) | (i154 ^ currentTimeMillis11))) * 283;
                                                                                                                        cls56.getMethod($$c((byte) ((i153 ^ i155) + ((i155 & i153) << 1)), bArr22[27], (short) 572), Long.TYPE).invoke(newInstance, 20);
                                                                                                                        if (!z17) {
                                                                                                                            try {
                                                                                                                                Class<?> cls57 = Class.forName($$c(bArr22[251], bArr22[240], (short) 462));
                                                                                                                                byte b51 = bArr22[251];
                                                                                                                                byte b52 = bArr22[14];
                                                                                                                                Class<?> cls58 = Class.forName($$c(b51, b52, (short) ((b52 ^ 773) | (b52 & 773))));
                                                                                                                                newInstance2 = cls57.getConstructor(cls58).newInstance(newInstance);
                                                                                                                                invoke3 = cls57.getMethod($$c(bArr22[91], bArr22[c6], (short) 435), null).invoke(newInstance2, null);
                                                                                                                                method = Class.forName($$c(bArr22[251], bArr22[70], (short) 424)).getMethod($$c(bArr22[91], bArr22[23], (short) InterfaceC1490j3.a.b.f16788c), null);
                                                                                                                                method2 = cls58.getMethod($$c(bArr22[1], bArr22[27], (short) 569), cls40);
                                                                                                                            } catch (Throwable th44) {
                                                                                                                                th = th44;
                                                                                                                                cls2 = cls40;
                                                                                                                                s4 = s522;
                                                                                                                                cls26 = cls41;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                c7 = 461;
                                                                                                                                Class<?> cls59 = Class.forName($$c(bArr22[251], bArr22[859], (short) 817));
                                                                                                                                byte b53 = bArr22[251];
                                                                                                                                byte b54 = bArr22[14];
                                                                                                                                i20 = -2;
                                                                                                                                Object newInstance6 = cls59.getDeclaredConstructor(Class.forName($$c(b53, b54, (short) (b54 | 773)))).newInstance(newInstance2);
                                                                                                                                Class<?> cls60 = Class.forName($$c(bArr22[251], (byte) (bArr22[240] + 1), (short) 397));
                                                                                                                                Object newInstance7 = cls60.getConstructor(null).newInstance(null);
                                                                                                                                byte b55 = (byte) 86;
                                                                                                                                Method method4 = cls60.getMethod($$c(b55, bArr22[16], (short) 552), cls40, cls13, cls13);
                                                                                                                                z15 = z17;
                                                                                                                                Method method5 = cls60.getMethod($$c((byte) (i19 >>> 1), bArr22[c5], (short) 369), null);
                                                                                                                                Class<?> cls61 = Class.forName($$c(bArr22[251], bArr22[4], (short) 359));
                                                                                                                                byte b56 = (byte) (-bArr22[c4]);
                                                                                                                                byte b57 = bArr22[16];
                                                                                                                                str3 = str5;
                                                                                                                                cls25 = cls41;
                                                                                                                                try {
                                                                                                                                    method3 = cls61.getMethod($$c(b56, b57, (short) ((b57 ^ 899) | (b57 & 899))), null);
                                                                                                                                    byte[] bArr26 = new byte[1024];
                                                                                                                                    int i156 = 0;
                                                                                                                                    while (true) {
                                                                                                                                        Integer num = (Integer) method2.invoke(newInstance6, bArr26);
                                                                                                                                        int intValue2 = num.intValue();
                                                                                                                                        if (intValue2 <= 0) {
                                                                                                                                            cls2 = cls40;
                                                                                                                                            s4 = s522;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        Method method6 = method2;
                                                                                                                                        int i157 = $10 + 5;
                                                                                                                                        s4 = s522;
                                                                                                                                        $11 = i157 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                                        if (i157 % 2 != 0) {
                                                                                                                                            cls2 = cls40;
                                                                                                                                            if (i156 >= ((Long) method.invoke(invoke3, null)).longValue()) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            method4.invoke(newInstance7, bArr26, 0, num);
                                                                                                                                            int currentTimeMillis12 = (int) System.currentTimeMillis();
                                                                                                                                            int i158 = intValue2 * 450;
                                                                                                                                            int i159 = i156 * (-448);
                                                                                                                                            int i160 = (i158 & i159) + (i158 | i159);
                                                                                                                                            int i161 = ~intValue2;
                                                                                                                                            int i162 = ~((i161 & i156) | (i161 ^ i156));
                                                                                                                                            int i163 = ~i156;
                                                                                                                                            Method method7 = method;
                                                                                                                                            int i164 = ~((i163 ^ intValue2) | (i163 & intValue2) | currentTimeMillis12);
                                                                                                                                            int i165 = i160 + (((i162 ^ i164) | (i164 & i162)) * 449);
                                                                                                                                            int i166 = -(-(i162 * (-1347)));
                                                                                                                                            int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                                                                                                                                            int i168 = ~intValue2;
                                                                                                                                            int i169 = ~((i168 & i156) | (i168 ^ i156));
                                                                                                                                            int i170 = ~currentTimeMillis12;
                                                                                                                                            int i171 = (i170 & i163) | (i163 ^ i170);
                                                                                                                                            int i172 = ~((i171 & intValue2) | (i171 ^ intValue2));
                                                                                                                                            i156 = (i167 - (~(-(-(((i172 & i169) | (i169 ^ i172)) * 449))))) - 1;
                                                                                                                                            method2 = method6;
                                                                                                                                            s522 = s4;
                                                                                                                                            cls40 = cls2;
                                                                                                                                            method = method7;
                                                                                                                                        } else {
                                                                                                                                            cls2 = cls40;
                                                                                                                                            try {
                                                                                                                                                if (i156 >= ((Long) method.invoke(invoke3, new Object[1])).longValue()) {
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                method4.invoke(newInstance7, bArr26, 0, num);
                                                                                                                                                int currentTimeMillis122 = (int) System.currentTimeMillis();
                                                                                                                                                int i1582 = intValue2 * 450;
                                                                                                                                                int i1592 = i156 * (-448);
                                                                                                                                                int i1602 = (i1582 & i1592) + (i1582 | i1592);
                                                                                                                                                int i1612 = ~intValue2;
                                                                                                                                                int i1622 = ~((i1612 & i156) | (i1612 ^ i156));
                                                                                                                                                int i1632 = ~i156;
                                                                                                                                                Method method72 = method;
                                                                                                                                                int i1642 = ~((i1632 ^ intValue2) | (i1632 & intValue2) | currentTimeMillis122);
                                                                                                                                                int i1652 = i1602 + (((i1622 ^ i1642) | (i1642 & i1622)) * 449);
                                                                                                                                                int i1662 = -(-(i1622 * (-1347)));
                                                                                                                                                int i1672 = ((i1652 | i1662) << 1) - (i1662 ^ i1652);
                                                                                                                                                int i1682 = ~intValue2;
                                                                                                                                                int i1692 = ~((i1682 & i156) | (i1682 ^ i156));
                                                                                                                                                int i1702 = ~currentTimeMillis122;
                                                                                                                                                int i1712 = (i1702 & i1632) | (i1632 ^ i1702);
                                                                                                                                                int i1722 = ~((i1712 & intValue2) | (i1712 ^ intValue2));
                                                                                                                                                i156 = (i1672 - (~(-(-(((i1722 & i1692) | (i1692 ^ i1722)) * 449))))) - 1;
                                                                                                                                                method2 = method6;
                                                                                                                                                s522 = s4;
                                                                                                                                                cls40 = cls2;
                                                                                                                                                method = method72;
                                                                                                                                            } catch (Throwable th45) {
                                                                                                                                                th = th45;
                                                                                                                                                zipFile2 = zipFile3;
                                                                                                                                                cls12 = cls25;
                                                                                                                                                s522 = s4;
                                                                                                                                                cls11 = cls2;
                                                                                                                                                cls18 = cls25;
                                                                                                                                                i41 = 16;
                                                                                                                                                i4 = 12;
                                                                                                                                                cls21 = cls12;
                                                                                                                                                cls20 = cls11;
                                                                                                                                                zipFile5 = zipFile2;
                                                                                                                                                cls19 = cls18;
                                                                                                                                                cls24 = cls21;
                                                                                                                                                cls23 = cls20;
                                                                                                                                                zipFile6 = zipFile5;
                                                                                                                                                cls22 = cls19;
                                                                                                                                                i10 = 4;
                                                                                                                                                r43 = cls24;
                                                                                                                                                r62 = cls23;
                                                                                                                                                zipFile = zipFile6;
                                                                                                                                                cls3 = cls22;
                                                                                                                                                zipFile.close();
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } catch (Throwable th46) {
                                                                                                                                    th = th46;
                                                                                                                                    cls2 = cls40;
                                                                                                                                    s4 = s522;
                                                                                                                                    cls26 = cls25;
                                                                                                                                    th = th;
                                                                                                                                    zipFile7 = zipFile3;
                                                                                                                                    cls27 = cls26;
                                                                                                                                    cls28 = cls26;
                                                                                                                                    cls29 = cls2;
                                                                                                                                    cls31 = cls27;
                                                                                                                                    zipFile9 = zipFile7;
                                                                                                                                    cls30 = cls28;
                                                                                                                                    i41 = 16;
                                                                                                                                    i4 = 12;
                                                                                                                                    cls21 = cls31;
                                                                                                                                    cls20 = cls29;
                                                                                                                                    zipFile5 = zipFile9;
                                                                                                                                    cls19 = cls30;
                                                                                                                                    cls24 = cls21;
                                                                                                                                    cls23 = cls20;
                                                                                                                                    zipFile6 = zipFile5;
                                                                                                                                    cls22 = cls19;
                                                                                                                                    i10 = 4;
                                                                                                                                    r43 = cls24;
                                                                                                                                    r62 = cls23;
                                                                                                                                    zipFile = zipFile6;
                                                                                                                                    cls3 = cls22;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    byte[] bArr27 = (byte[]) method5.invoke(newInstance7, null);
                                                                                                                                    try {
                                                                                                                                        method3.invoke(newInstance6, null);
                                                                                                                                        method3.invoke(newInstance7, null);
                                                                                                                                    } catch (Exception unused8) {
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        byte[] bArr28 = $$a;
                                                                                                                                        Object invoke5 = Class.class.getMethod($$c(bArr28[91], bArr28[72], (short) 475), null).invoke(AFPurchaseConnectorA1w.class, null);
                                                                                                                                        short s9 = (short) 308;
                                                                                                                                        try {
                                                                                                                                            Object newInstance8 = Class.forName($$c(bArr28[461], (byte) (-bArr28[858]), (short) 343)).getDeclaredConstructor(Class.forName($$c(bArr28[251], bArr28[14], s9)), Class.forName($$c(bArr28[251], bArr28[57], (short) 290))).newInstance(Class.forName($$c(bArr28[251], bArr28[14], s9)).getMethod($$c(b55, bArr28[27], (short) 270), cls2).invoke(null, bArr27), invoke5);
                                                                                                                                            try {
                                                                                                                                                Field declaredField = Class.forName($$c(bArr28[461], bArr28[360], (short) 267)).getDeclaredField($$c(bArr28[838], bArr28[286], (short) 236));
                                                                                                                                                declaredField.setAccessible(true);
                                                                                                                                                Object obj20 = declaredField.get(invoke5);
                                                                                                                                                Class<?> cls62 = obj20.getClass();
                                                                                                                                                byte b58 = bArr28[1200];
                                                                                                                                                int currentTimeMillis13 = (int) System.currentTimeMillis();
                                                                                                                                                int i173 = (-398) + (b58 * (-396));
                                                                                                                                                int i174 = ~currentTimeMillis13;
                                                                                                                                                int i175 = ~i174;
                                                                                                                                                int i176 = ~b58;
                                                                                                                                                int i177 = (i175 & i176) | (i175 ^ i176);
                                                                                                                                                int i178 = ~((i174 & b58) | (i174 ^ b58));
                                                                                                                                                int i179 = -(-(((i178 & i177) | (i177 ^ i178)) * (-397)));
                                                                                                                                                int i180 = ((i173 | i179) << 1) - (i179 ^ i173);
                                                                                                                                                int i181 = ~b58;
                                                                                                                                                int i182 = -(-(i181 * (-397)));
                                                                                                                                                int i183 = (currentTimeMillis13 & i181) | (currentTimeMillis13 ^ i181);
                                                                                                                                                int i184 = ~b58;
                                                                                                                                                int i185 = ~(i184 | (i184 ^ (-1)));
                                                                                                                                                Field declaredField2 = cls62.getDeclaredField($$c((byte) ((((i180 & i182) + (i182 | i180)) - (~(-(-(((i185 & i183) | (i183 ^ i185)) * 397))))) - 1), bArr28[126], (short) 229));
                                                                                                                                                declaredField2.setAccessible(true);
                                                                                                                                                byte b59 = bArr28[1200];
                                                                                                                                                int currentTimeMillis14 = (int) System.currentTimeMillis();
                                                                                                                                                int i186 = -(-(b59 * 306));
                                                                                                                                                int i187 = ((304 | i186) << 1) - (i186 ^ 304);
                                                                                                                                                int i188 = ~((b11 ^ b59) | b59);
                                                                                                                                                int i189 = ~((b11 ^ currentTimeMillis14) | currentTimeMillis14);
                                                                                                                                                int i190 = -(-(((i188 & i189) | (i188 ^ i189)) * 305));
                                                                                                                                                int i191 = ~b59;
                                                                                                                                                int i192 = ~currentTimeMillis14;
                                                                                                                                                int i193 = ~(i192 | (i192 ^ (-1)));
                                                                                                                                                Field declaredField3 = cls62.getDeclaredField($$c((byte) ((((i187 ^ i190) + ((i190 & i187) << 1)) - (~(-(-(((i191 & i193) | (i191 ^ i193)) * 305))))) - 1), bArr28[20], (short) InterfaceC1490j3.c.b.f16806g));
                                                                                                                                                declaredField3.setAccessible(true);
                                                                                                                                                Object obj21 = declaredField2.get(obj20);
                                                                                                                                                Object obj22 = declaredField3.get(obj20);
                                                                                                                                                Object obj23 = declaredField.get(newInstance8);
                                                                                                                                                ArrayList arrayList = new ArrayList((List) obj21);
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        Class cls63 = (Class) Class.class.getMethod($$c(bArr28[91], bArr28[29], (short) 182), null).invoke(obj22.getClass(), null);
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                int length3 = Array.getLength(obj22);
                                                                                                                                                                Object newInstance9 = Array.newInstance((Class<?>) cls63, length3);
                                                                                                                                                                for (int i194 = 0; i194 < length3; i194++) {
                                                                                                                                                                    Array.set(newInstance9, i194, Array.get(obj22, i194));
                                                                                                                                                                }
                                                                                                                                                                declaredField2.set(obj23, arrayList);
                                                                                                                                                                declaredField3.set(obj23, newInstance9);
                                                                                                                                                                if (setConnector == null) {
                                                                                                                                                                    setConnector = newInstance8;
                                                                                                                                                                }
                                                                                                                                                                obj11 = newInstance8;
                                                                                                                                                                r4 = cls25;
                                                                                                                                                                s522 = s4;
                                                                                                                                                                r6 = cls2;
                                                                                                                                                                cls3 = cls25;
                                                                                                                                                            } catch (Exception e6) {
                                                                                                                                                                e = e6;
                                                                                                                                                                StringBuilder sb9 = new StringBuilder();
                                                                                                                                                                byte[] bArr29 = $$a;
                                                                                                                                                                sb9.append($$c(bArr29[383], bArr29[16], (short) $$b));
                                                                                                                                                                sb9.append(invoke5);
                                                                                                                                                                byte b60 = bArr29[43];
                                                                                                                                                                byte b61 = bArr29[i7];
                                                                                                                                                                sb9.append($$c(b60, b61, (short) (b61 | 960)));
                                                                                                                                                                try {
                                                                                                                                                                    throw ((Throwable) Class.forName($$c(bArr29[251], bArr29[14], (short) 960)).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb9.toString(), e));
                                                                                                                                                                } catch (Throwable th47) {
                                                                                                                                                                    Throwable cause18 = th47.getCause();
                                                                                                                                                                    if (cause18 == null) {
                                                                                                                                                                        throw th47;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause18;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th48) {
                                                                                                                                                            th = th48;
                                                                                                                                                            th = th;
                                                                                                                                                            zipFile7 = zipFile3;
                                                                                                                                                            cls27 = cls25;
                                                                                                                                                            s522 = s4;
                                                                                                                                                            cls28 = cls25;
                                                                                                                                                            cls29 = cls2;
                                                                                                                                                            cls31 = cls27;
                                                                                                                                                            zipFile9 = zipFile7;
                                                                                                                                                            cls30 = cls28;
                                                                                                                                                            i41 = 16;
                                                                                                                                                            i4 = 12;
                                                                                                                                                            cls21 = cls31;
                                                                                                                                                            cls20 = cls29;
                                                                                                                                                            zipFile5 = zipFile9;
                                                                                                                                                            cls19 = cls30;
                                                                                                                                                            cls24 = cls21;
                                                                                                                                                            cls23 = cls20;
                                                                                                                                                            zipFile6 = zipFile5;
                                                                                                                                                            cls22 = cls19;
                                                                                                                                                            i10 = 4;
                                                                                                                                                            r43 = cls24;
                                                                                                                                                            r62 = cls23;
                                                                                                                                                            zipFile = zipFile6;
                                                                                                                                                            cls3 = cls22;
                                                                                                                                                            zipFile.close();
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th49) {
                                                                                                                                                        th = th49;
                                                                                                                                                        Throwable cause19 = th.getCause();
                                                                                                                                                        if (cause19 == null) {
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                        throw cause19;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th50) {
                                                                                                                                                    th = th50;
                                                                                                                                                }
                                                                                                                                            } catch (Exception e7) {
                                                                                                                                                e = e7;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th51) {
                                                                                                                                            Throwable cause20 = th51.getCause();
                                                                                                                                            if (cause20 == null) {
                                                                                                                                                throw th51;
                                                                                                                                            }
                                                                                                                                            throw cause20;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th52) {
                                                                                                                                        Throwable cause21 = th52.getCause();
                                                                                                                                        if (cause21 == null) {
                                                                                                                                            throw th52;
                                                                                                                                        }
                                                                                                                                        throw cause21;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th53) {
                                                                                                                                    th = th53;
                                                                                                                                    th = th;
                                                                                                                                    zipFile7 = zipFile3;
                                                                                                                                    cls27 = cls25;
                                                                                                                                    s522 = s4;
                                                                                                                                    cls28 = cls25;
                                                                                                                                    cls29 = cls2;
                                                                                                                                    cls31 = cls27;
                                                                                                                                    zipFile9 = zipFile7;
                                                                                                                                    cls30 = cls28;
                                                                                                                                    i41 = 16;
                                                                                                                                    i4 = 12;
                                                                                                                                    cls21 = cls31;
                                                                                                                                    cls20 = cls29;
                                                                                                                                    zipFile5 = zipFile9;
                                                                                                                                    cls19 = cls30;
                                                                                                                                    cls24 = cls21;
                                                                                                                                    cls23 = cls20;
                                                                                                                                    zipFile6 = zipFile5;
                                                                                                                                    cls22 = cls19;
                                                                                                                                    i10 = 4;
                                                                                                                                    r43 = cls24;
                                                                                                                                    r62 = cls23;
                                                                                                                                    zipFile = zipFile6;
                                                                                                                                    cls3 = cls22;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (Throwable th54) {
                                                                                                                                Throwable cause22 = th54.getCause();
                                                                                                                                if (cause22 == null) {
                                                                                                                                    throw th54;
                                                                                                                                }
                                                                                                                                throw cause22;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            str3 = str5;
                                                                                                                            i20 = -2;
                                                                                                                            cls2 = cls40;
                                                                                                                            s4 = s522;
                                                                                                                            cls3 = cls41;
                                                                                                                            z15 = z17;
                                                                                                                            c7 = 461;
                                                                                                                            int currentTimeMillis15 = (int) System.currentTimeMillis();
                                                                                                                            int i195 = ~currentTimeMillis15;
                                                                                                                            int i196 = ~((456156202 & i195) | (456156202 ^ i195));
                                                                                                                            int i197 = (i196 & 1623985045) | (i196 ^ 1623985045);
                                                                                                                            int i198 = ~(((-270533643) & currentTimeMillis15) | ((-270533643) ^ currentTimeMillis15));
                                                                                                                            int i199 = -(-(((i197 & i198) | (i197 ^ i198)) * (-713)));
                                                                                                                            int i200 = ((672412226 | i199) << 1) - (i199 ^ 672412226);
                                                                                                                            int i201 = (~(currentTimeMillis15 | (-270533643))) * 1426;
                                                                                                                            int i202 = (i200 & i201) + (i201 | i200) + ((~((1809607605 & i195) | (1809607605 ^ i195))) * 713);
                                                                                                                            int currentTimeMillis16 = (int) System.currentTimeMillis();
                                                                                                                            int i203 = ~((-1436397185) | (~currentTimeMillis16));
                                                                                                                            int i204 = (i203 & 269328512) | (i203 ^ 269328512);
                                                                                                                            int i205 = ~((~currentTimeMillis16) | 1743785773);
                                                                                                                            int i206 = -(-(((i204 & i205) | (i204 ^ i205)) * 464));
                                                                                                                            int i207 = (((-220399811) | i206) << 1) - (i206 ^ (-220399811));
                                                                                                                            int i208 = (-1743785774) | currentTimeMillis16;
                                                                                                                            int i209 = ((i208 & (-1436397185)) | (i208 ^ (-1436397185))) * (-464);
                                                                                                                            int i210 = ((i207 | i209) << 1) - (i209 ^ i207);
                                                                                                                            int i211 = ~(currentTimeMillis16 | 1743785773);
                                                                                                                            int i212 = -(-(((i211 & 269328512) | (269328512 ^ i211)) * 464));
                                                                                                                            if (i202 <= (i210 & i212) + (i212 | i210)) {
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                Object obj24 = getVERSION_NAMEannotations;
                                                                                                                                Object obj25 = obj24 == null ? obj6 : obj18;
                                                                                                                                Object obj26 = obj24 == null ? obj10 : obj5;
                                                                                                                                byte b62 = bArr22[251];
                                                                                                                                byte b63 = bArr22[14];
                                                                                                                                Class cls64 = Class.forName($$c(b62, b63, (short) ((b63 ^ 773) | (b63 & 773))));
                                                                                                                                ?? r82 = (short) 569;
                                                                                                                                r6 = cls2;
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        Method method8 = cls64.getMethod($$c(bArr22[1], bArr22[27], r82), r6, cls13, cls13);
                                                                                                                                        Class<?> cls65 = Class.forName($$c(bArr22[251], bArr22[126], (short) 926));
                                                                                                                                        try {
                                                                                                                                            s522 = s4;
                                                                                                                                        } catch (Exception e8) {
                                                                                                                                            e = e8;
                                                                                                                                            zipFile13 = zipFile3;
                                                                                                                                            cls36 = cls3;
                                                                                                                                            s522 = s4;
                                                                                                                                        } catch (Throwable th55) {
                                                                                                                                            th = th55;
                                                                                                                                            zipFile12 = zipFile3;
                                                                                                                                            cls35 = cls3;
                                                                                                                                            s522 = s4;
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                Object newInstance10 = cls65.getConstructor(Class.forName($$c(bArr22[251], bArr22[c6], s522))).newInstance(obj25);
                                                                                                                                                if (z8) {
                                                                                                                                                    try {
                                                                                                                                                        Class<?> cls66 = Class.forName($$c(bArr22[251], bArr22[c6], s522));
                                                                                                                                                        byte b64 = bArr22[1];
                                                                                                                                                        ((Boolean) cls66.getMethod($$c((byte) ((b64 & 1) + (b64 | 1)), bArr22[c5], (short) 566), null).invoke(obj25, null)).getClass();
                                                                                                                                                    } catch (Throwable th56) {
                                                                                                                                                        Throwable cause23 = th56.getCause();
                                                                                                                                                        if (cause23 == null) {
                                                                                                                                                            throw th56;
                                                                                                                                                        }
                                                                                                                                                        throw cause23;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                $10 = ($11 + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                                                int i213 = 1024;
                                                                                                                                                byte[] bArr30 = new byte[1024];
                                                                                                                                                Method method9 = cls65.getMethod($$c((byte) 86, bArr22[16], (short) 552), r6, cls13, cls13);
                                                                                                                                                while (i124 > 0) {
                                                                                                                                                    try {
                                                                                                                                                        Integer num2 = (Integer) method8.invoke(newInstance, bArr30, 0, Integer.valueOf(Math.min(i213, i124)));
                                                                                                                                                        int intValue3 = num2.intValue();
                                                                                                                                                        if (intValue3 == b11) {
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        int i214 = $11;
                                                                                                                                                        int i215 = (i214 ^ InterfaceC1490j3.d.b.f16810b) + ((i214 & InterfaceC1490j3.d.b.f16810b) << 1);
                                                                                                                                                        $10 = i215 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                                                        if (i215 % 2 != 0) {
                                                                                                                                                            Object[] objArr17 = new Object[4];
                                                                                                                                                            objArr17[1] = bArr30;
                                                                                                                                                            objArr17[1] = 0;
                                                                                                                                                            objArr17[3] = num2;
                                                                                                                                                            method9.invoke(newInstance10, objArr17);
                                                                                                                                                            int i216 = -(-intValue3);
                                                                                                                                                            i124 = (i124 | i216) + (i124 & i216);
                                                                                                                                                        } else {
                                                                                                                                                            method9.invoke(newInstance10, bArr30, 0, num2);
                                                                                                                                                            i124 -= intValue3;
                                                                                                                                                        }
                                                                                                                                                        i213 = 1024;
                                                                                                                                                        b11 = -1;
                                                                                                                                                    } catch (Throwable th57) {
                                                                                                                                                        th = th57;
                                                                                                                                                        r8 = zipFile3;
                                                                                                                                                        r42 = cls3;
                                                                                                                                                        i41 = 16;
                                                                                                                                                        i4 = 12;
                                                                                                                                                        i10 = 4;
                                                                                                                                                        try {
                                                                                                                                                            byte[] bArr31 = $$a;
                                                                                                                                                            short s10 = (short) 480;
                                                                                                                                                            try {
                                                                                                                                                                ((Boolean) Class.forName($$c(bArr31[251], bArr31[c6], s522)).getMethod($$c(bArr31[461], bArr31[207], s10), null).invoke(obj25, null)).getClass();
                                                                                                                                                                try {
                                                                                                                                                                    ((Boolean) Class.forName($$c(bArr31[251], bArr31[c6], s522)).getMethod($$c(bArr31[461], bArr31[207], s10), null).invoke(obj26, null)).getClass();
                                                                                                                                                                    throw th;
                                                                                                                                                                } catch (Throwable th58) {
                                                                                                                                                                    Throwable cause24 = th58.getCause();
                                                                                                                                                                    if (cause24 == null) {
                                                                                                                                                                        throw th58;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause24;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th59) {
                                                                                                                                                                th = th59;
                                                                                                                                                                Throwable cause25 = th.getCause();
                                                                                                                                                                if (cause25 == null) {
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                                throw cause25;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th60) {
                                                                                                                                                            th = th60;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                byte[] bArr32 = $$a;
                                                                                                                                                byte b65 = bArr32[91];
                                                                                                                                                byte b66 = bArr32[16];
                                                                                                                                                Object invoke6 = cls65.getMethod($$c(b65, b66, (short) ((b66 ^ 544) | (b66 & 544))), null).invoke(newInstance10, null);
                                                                                                                                                Class<?> cls67 = Class.forName($$c(bArr32[251], bArr32[70], (short) 544));
                                                                                                                                                byte b67 = bArr32[1];
                                                                                                                                                int currentTimeMillis17 = (int) System.currentTimeMillis();
                                                                                                                                                int i217 = 470 - (~(b67 * 471));
                                                                                                                                                int i218 = -(-((b67 | 1) * (-470)));
                                                                                                                                                int i219 = (i217 ^ i218) + ((i217 & i218) << 1);
                                                                                                                                                int i220 = ~b67;
                                                                                                                                                int i221 = ~(((-2) & i220) | ((-2) ^ i220));
                                                                                                                                                int i222 = ~b67;
                                                                                                                                                int i223 = ~((i222 ^ currentTimeMillis17) | (i222 & currentTimeMillis17));
                                                                                                                                                int i224 = (i221 ^ i223) | (i221 & i223);
                                                                                                                                                int i225 = ~currentTimeMillis17;
                                                                                                                                                int i226 = (i225 ^ 1) | (i225 & 1);
                                                                                                                                                int i227 = (i226 ^ b67) | (b67 & i226);
                                                                                                                                                int i228 = ~i227;
                                                                                                                                                int i229 = (i219 - (~(-(-(((i224 ^ i228) | (i224 & i228)) * (-470)))))) - 1;
                                                                                                                                                int i230 = (i222 ^ 1) | (i222 & 1);
                                                                                                                                                int i231 = ~((currentTimeMillis17 & i230) | (i230 ^ currentTimeMillis17));
                                                                                                                                                int i232 = ~i227;
                                                                                                                                                byte b68 = (byte) (i229 + (((i232 & i231) | (i231 ^ i232)) * 470));
                                                                                                                                                byte b69 = bArr32[27];
                                                                                                                                                cls67.getMethod($$c(b68, b69, (short) ((b69 ^ 520) | (b69 & 520))), null).invoke(invoke6, null);
                                                                                                                                                byte b70 = (byte) (-bArr32[c4]);
                                                                                                                                                byte b71 = bArr32[16];
                                                                                                                                                cls65.getMethod($$c(b70, b71, (short) ((b71 ^ 899) | (b71 & 899))), null).invoke(newInstance10, null);
                                                                                                                                                Class<?> cls68 = Class.forName($$c(bArr32[461], bArr32[57], (short) IronSourceError.ERROR_NO_INTERNET_CONNECTION));
                                                                                                                                                byte b72 = bArr32[833];
                                                                                                                                                ?? declaredMethod = cls68.getDeclaredMethod($$c((byte) (((b72 | 1) << 1) - (b72 ^ 1)), bArr32[23], (short) 500), String.class, String.class, Integer.TYPE);
                                                                                                                                                try {
                                                                                                                                                    cls37 = Class.forName($$c(bArr32[251], bArr32[c6], s522));
                                                                                                                                                    b7 = bArr32[91];
                                                                                                                                                } catch (Throwable th61) {
                                                                                                                                                    th = th61;
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    byte b73 = bArr32[12];
                                                                                                                                                    Object invoke7 = cls37.getMethod($$c(b7, b73, (short) ((b73 ^ 480) | (b73 & 480))), null).invoke(obj25, null);
                                                                                                                                                    $11 = ($10 + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                                                    try {
                                                                                                                                                        cls38 = Class.forName($$c(bArr32[251], bArr32[c6], s522));
                                                                                                                                                        b8 = bArr32[91];
                                                                                                                                                        i4 = 12;
                                                                                                                                                    } catch (Throwable th62) {
                                                                                                                                                        th = th62;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        byte b74 = bArr32[12];
                                                                                                                                                        String $$c4 = $$c(b8, b74, (short) ((b74 ^ 480) | (b74 & 480)));
                                                                                                                                                        zipFile8 = null;
                                                                                                                                                        r4 = new Object[]{invoke7, cls38.getMethod($$c4, null).invoke(obj26, null), 0};
                                                                                                                                                        obj11 = declaredMethod.invoke(null, r4);
                                                                                                                                                        try {
                                                                                                                                                            short s11 = (short) 480;
                                                                                                                                                            zipFile8 = null;
                                                                                                                                                            zipFile8 = null;
                                                                                                                                                            r4 = Class.forName($$c(bArr32[251], bArr32[c6], s522)).getMethod($$c(bArr32[461], bArr32[207], s11), null);
                                                                                                                                                            ((Boolean) r4.invoke(obj25, null)).getClass();
                                                                                                                                                            try {
                                                                                                                                                                Class<?> cls69 = Class.forName($$c(bArr32[251], bArr32[c6], s522));
                                                                                                                                                                r4 = $$c(bArr32[461], bArr32[207], s11);
                                                                                                                                                                zipFile8 = null;
                                                                                                                                                                ((Boolean) cls69.getMethod(r4, null).invoke(obj26, null)).getClass();
                                                                                                                                                                try {
                                                                                                                                                                    if (setConnector == null) {
                                                                                                                                                                        int i233 = $11 + 105;
                                                                                                                                                                        $10 = i233 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                                                                        if (i233 % 2 != 0) {
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            Class cls70 = cls3;
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    setConnector = Class.class.getMethod($$c(bArr32[91], bArr32[72], (short) 475), null).invoke(cls70, null);
                                                                                                                                                                                    r4 = cls70;
                                                                                                                                                                                    r6 = r6;
                                                                                                                                                                                    cls3 = cls3;
                                                                                                                                                                                } catch (Throwable th63) {
                                                                                                                                                                                    th = th63;
                                                                                                                                                                                    zipFile9 = zipFile3;
                                                                                                                                                                                    cls31 = cls70;
                                                                                                                                                                                    cls29 = r6;
                                                                                                                                                                                    cls30 = cls3;
                                                                                                                                                                                    i41 = 16;
                                                                                                                                                                                    i4 = 12;
                                                                                                                                                                                    cls21 = cls31;
                                                                                                                                                                                    cls20 = cls29;
                                                                                                                                                                                    zipFile5 = zipFile9;
                                                                                                                                                                                    cls19 = cls30;
                                                                                                                                                                                    cls24 = cls21;
                                                                                                                                                                                    cls23 = cls20;
                                                                                                                                                                                    zipFile6 = zipFile5;
                                                                                                                                                                                    cls22 = cls19;
                                                                                                                                                                                    i10 = 4;
                                                                                                                                                                                    r43 = cls24;
                                                                                                                                                                                    r62 = cls23;
                                                                                                                                                                                    zipFile = zipFile6;
                                                                                                                                                                                    cls3 = cls22;
                                                                                                                                                                                    zipFile.close();
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th64) {
                                                                                                                                                                                th = th64;
                                                                                                                                                                                Throwable cause26 = th.getCause();
                                                                                                                                                                                if (cause26 == null) {
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                                throw cause26;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th65) {
                                                                                                                                                                            th = th65;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        r4 = cls3;
                                                                                                                                                                        r6 = r6;
                                                                                                                                                                        cls3 = cls3;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th66) {
                                                                                                                                                                    th = th66;
                                                                                                                                                                    zipFile8 = zipFile3;
                                                                                                                                                                    r4 = cls3;
                                                                                                                                                                    i4 = 12;
                                                                                                                                                                    r6 = r6;
                                                                                                                                                                    cls3 = cls3;
                                                                                                                                                                    i10 = 4;
                                                                                                                                                                    th = th;
                                                                                                                                                                    i41 = 16;
                                                                                                                                                                    r43 = r4;
                                                                                                                                                                    r62 = r6;
                                                                                                                                                                    zipFile = zipFile8;
                                                                                                                                                                    cls3 = cls3;
                                                                                                                                                                    zipFile.close();
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th67) {
                                                                                                                                                                Throwable cause27 = th67.getCause();
                                                                                                                                                                if (cause27 == null) {
                                                                                                                                                                    throw th67;
                                                                                                                                                                }
                                                                                                                                                                throw cause27;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th68) {
                                                                                                                                                            Throwable cause28 = th68.getCause();
                                                                                                                                                            if (cause28 == null) {
                                                                                                                                                                throw th68;
                                                                                                                                                            }
                                                                                                                                                            throw cause28;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th69) {
                                                                                                                                                        th = th69;
                                                                                                                                                        Throwable cause29 = th.getCause();
                                                                                                                                                        if (cause29 == null) {
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                        throw cause29;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th70) {
                                                                                                                                                    th = th70;
                                                                                                                                                    Throwable cause30 = th.getCause();
                                                                                                                                                    if (cause30 == null) {
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                    throw cause30;
                                                                                                                                                }
                                                                                                                                            } catch (Exception e9) {
                                                                                                                                                e = e9;
                                                                                                                                                zipFile13 = zipFile3;
                                                                                                                                                cls36 = cls3;
                                                                                                                                                i4 = 12;
                                                                                                                                                i10 = 4;
                                                                                                                                                StringBuilder sb10 = new StringBuilder();
                                                                                                                                                byte[] bArr33 = $$a;
                                                                                                                                                byte b75 = bArr33[383];
                                                                                                                                                i41 = 16;
                                                                                                                                                try {
                                                                                                                                                    byte b76 = bArr33[16];
                                                                                                                                                    sb10.append($$c(b75, b76, (short) ((b76 ^ 552) | (b76 & 552))));
                                                                                                                                                    sb10.append(obj25);
                                                                                                                                                    byte b77 = bArr33[43];
                                                                                                                                                    byte b78 = bArr33[i7];
                                                                                                                                                    sb10.append($$c(b77, b78, (short) (b78 | 960)));
                                                                                                                                                    try {
                                                                                                                                                        throw ((Throwable) Class.forName($$c(bArr33[251], bArr33[14], (short) 960)).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb10.toString(), e));
                                                                                                                                                    } catch (Throwable th71) {
                                                                                                                                                        Throwable cause31 = th71.getCause();
                                                                                                                                                        if (cause31 == null) {
                                                                                                                                                            throw th71;
                                                                                                                                                        }
                                                                                                                                                        throw cause31;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th72) {
                                                                                                                                                    th = th72;
                                                                                                                                                    r42 = cls36;
                                                                                                                                                    r8 = zipFile13;
                                                                                                                                                    byte[] bArr312 = $$a;
                                                                                                                                                    short s102 = (short) 480;
                                                                                                                                                    ((Boolean) Class.forName($$c(bArr312[251], bArr312[c6], s522)).getMethod($$c(bArr312[461], bArr312[207], s102), null).invoke(obj25, null)).getClass();
                                                                                                                                                    ((Boolean) Class.forName($$c(bArr312[251], bArr312[c6], s522)).getMethod($$c(bArr312[461], bArr312[207], s102), null).invoke(obj26, null)).getClass();
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th73) {
                                                                                                                                            th = th73;
                                                                                                                                            zipFile12 = zipFile3;
                                                                                                                                            cls35 = cls3;
                                                                                                                                            i4 = 12;
                                                                                                                                            i10 = 4;
                                                                                                                                            cls34 = cls35;
                                                                                                                                            zipFile11 = zipFile12;
                                                                                                                                            i41 = 16;
                                                                                                                                            r42 = cls34;
                                                                                                                                            r8 = zipFile11;
                                                                                                                                            byte[] bArr3122 = $$a;
                                                                                                                                            short s1022 = (short) 480;
                                                                                                                                            ((Boolean) Class.forName($$c(bArr3122[251], bArr3122[c6], s522)).getMethod($$c(bArr3122[461], bArr3122[207], s1022), null).invoke(obj25, null)).getClass();
                                                                                                                                            ((Boolean) Class.forName($$c(bArr3122[251], bArr3122[c6], s522)).getMethod($$c(bArr3122[461], bArr3122[207], s1022), null).invoke(obj26, null)).getClass();
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th74) {
                                                                                                                                        th = th74;
                                                                                                                                        cls34 = cls64;
                                                                                                                                        zipFile11 = r82;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th75) {
                                                                                                                                    th = th75;
                                                                                                                                    zipFile10 = zipFile3;
                                                                                                                                    cls32 = cls3;
                                                                                                                                    s522 = s4;
                                                                                                                                    cls33 = r6;
                                                                                                                                    i41 = 16;
                                                                                                                                    i4 = 12;
                                                                                                                                    r42 = cls32;
                                                                                                                                    r6 = cls33;
                                                                                                                                    r8 = zipFile10;
                                                                                                                                    cls3 = cls3;
                                                                                                                                    i10 = 4;
                                                                                                                                    th = th;
                                                                                                                                    r43 = r42;
                                                                                                                                    r62 = r6;
                                                                                                                                    zipFile = r8;
                                                                                                                                    cls3 = cls3;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (Throwable th76) {
                                                                                                                                th = th76;
                                                                                                                                zipFile10 = zipFile3;
                                                                                                                                cls32 = cls3;
                                                                                                                                s522 = s4;
                                                                                                                                cls33 = cls2;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (z15) {
                                                                                                                            try {
                                                                                                                                byte[] bArr34 = $$a;
                                                                                                                                Class<?> cls71 = Class.forName($$c(bArr34[c7], bArr34[57], (short) IronSourceError.ERROR_NO_INTERNET_CONNECTION));
                                                                                                                                byte b79 = bArr34[833];
                                                                                                                                byte b80 = (byte) (((b79 | 1) << 1) - (b79 ^ 1));
                                                                                                                                byte b81 = bArr34[43];
                                                                                                                                int i234 = $$b;
                                                                                                                                int currentTimeMillis18 = (int) System.currentTimeMillis();
                                                                                                                                int i235 = i234 * (-987);
                                                                                                                                int i236 = (((-3956) | i235) << 1) - (i235 ^ (-3956));
                                                                                                                                int i237 = ~i234;
                                                                                                                                int i238 = ~currentTimeMillis18;
                                                                                                                                int i239 = (i237 ^ i238) | (i237 & i238);
                                                                                                                                int i240 = ~((i239 & (-4)) | (i239 ^ (-4)));
                                                                                                                                int i241 = (-4) | i234;
                                                                                                                                int i242 = ~((i241 ^ currentTimeMillis18) | (i241 & currentTimeMillis18));
                                                                                                                                int i243 = ((i240 ^ i242) | (i240 & i242)) * 988;
                                                                                                                                int i244 = (((i236 & i243) + (i236 | i243)) - (~(-(-((((-4) ^ i237) | ((-4) & i237)) * (-988)))))) - 1;
                                                                                                                                int i245 = ~((3 ^ i237) | (3 & i237));
                                                                                                                                int i246 = ~((currentTimeMillis18 & i237) | (i237 ^ currentTimeMillis18));
                                                                                                                                int i247 = (i246 & i245) | (i245 ^ i246);
                                                                                                                                int i248 = ~(i234 | (i238 ^ (-4)) | (i238 & (-4)));
                                                                                                                                try {
                                                                                                                                    Method declaredMethod2 = cls71.getDeclaredMethod($$c(b80, b81, (short) (i244 + (((i248 & i247) | (i247 ^ i248)) * 988))), String.class, Class.forName($$c(bArr34[251], bArr34[57], (short) 290)));
                                                                                                                                    declaredMethod2.setAccessible(true);
                                                                                                                                    try {
                                                                                                                                        Object invoke8 = declaredMethod2.invoke(obj11, str3, Class.class.getMethod($$c(bArr34[91], bArr34[72], (short) 475), null).invoke(AFPurchaseConnectorA1w.class, null));
                                                                                                                                        if (invoke8 != null) {
                                                                                                                                            byte b82 = (byte) (-bArr34[c4]);
                                                                                                                                            byte b83 = bArr34[16];
                                                                                                                                            cls71.getDeclaredMethod($$c(b82, b83, (short) (b83 | 899)), null).invoke(obj11, null);
                                                                                                                                        }
                                                                                                                                        obj12 = invoke8;
                                                                                                                                        i10 = 4;
                                                                                                                                    } catch (Throwable th77) {
                                                                                                                                        Throwable cause32 = th77.getCause();
                                                                                                                                        if (cause32 == null) {
                                                                                                                                            throw th77;
                                                                                                                                        }
                                                                                                                                        throw cause32;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th78) {
                                                                                                                                    th = th78;
                                                                                                                                    th = th;
                                                                                                                                    zipFile6 = zipFile3;
                                                                                                                                    i41 = 16;
                                                                                                                                    i4 = 12;
                                                                                                                                    cls24 = r4;
                                                                                                                                    cls23 = r6;
                                                                                                                                    cls22 = cls3;
                                                                                                                                    i10 = 4;
                                                                                                                                    r43 = cls24;
                                                                                                                                    r62 = cls23;
                                                                                                                                    zipFile = zipFile6;
                                                                                                                                    cls3 = cls22;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (Throwable th79) {
                                                                                                                                th = th79;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            String str6 = str3;
                                                                                                                            try {
                                                                                                                                byte[] bArr35 = $$a;
                                                                                                                                Class<?> cls72 = Class.forName($$c(bArr35[251], bArr35[57], (short) 290));
                                                                                                                                byte b84 = bArr35[833];
                                                                                                                                int currentTimeMillis19 = (int) System.currentTimeMillis();
                                                                                                                                int i249 = (-661) + (b84 * (-661));
                                                                                                                                int i250 = ~currentTimeMillis19;
                                                                                                                                int i251 = ~b84;
                                                                                                                                int i252 = ~((i20 ^ i251) | (i20 & i251));
                                                                                                                                int i253 = -(-(((i250 & i252) | (i250 ^ i252)) * 1324));
                                                                                                                                int i254 = (i249 ^ i253) + ((i253 & i249) << 1);
                                                                                                                                int i255 = ~((currentTimeMillis19 ^ 1) | (currentTimeMillis19 & 1));
                                                                                                                                int i256 = ~((currentTimeMillis19 & b84) | (b84 ^ currentTimeMillis19));
                                                                                                                                int i257 = ((i256 & i255) | (i255 ^ i256)) * (-1324);
                                                                                                                                int i258 = (i254 & i257) + (i257 | i254);
                                                                                                                                int i259 = ~((b84 & (-2)) | ((-2) ^ b84));
                                                                                                                                int i260 = ~(i251 | 1);
                                                                                                                                int i261 = ((i259 & i260) | (i259 ^ i260)) * 662;
                                                                                                                                i10 = 4;
                                                                                                                                Method declaredMethod3 = cls72.getDeclaredMethod($$c((byte) (((i258 | i261) << 1) - (i261 ^ i258)), bArr35[43], (short) ($$b - 4)), String.class);
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        declaredMethod3.setAccessible(true);
                                                                                                                                        obj12 = declaredMethod3.invoke(obj11, str6);
                                                                                                                                    } catch (Throwable th80) {
                                                                                                                                        th = th80;
                                                                                                                                        zipFile = zipFile3;
                                                                                                                                        i41 = 16;
                                                                                                                                        i4 = 12;
                                                                                                                                        r43 = r4;
                                                                                                                                        r62 = r6;
                                                                                                                                        cls3 = cls3;
                                                                                                                                        zipFile.close();
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (InvocationTargetException e10) {
                                                                                                                                    try {
                                                                                                                                        throw ((Exception) e10.getCause());
                                                                                                                                    } catch (ClassNotFoundException unused9) {
                                                                                                                                        obj12 = null;
                                                                                                                                        if (obj12 != null) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (Throwable th81) {
                                                                                                                                th = th81;
                                                                                                                                zipFile8 = zipFile3;
                                                                                                                                i4 = 12;
                                                                                                                                r4 = r4;
                                                                                                                                r6 = r6;
                                                                                                                                cls3 = cls3;
                                                                                                                                i10 = 4;
                                                                                                                                th = th;
                                                                                                                                i41 = 16;
                                                                                                                                r43 = r4;
                                                                                                                                r62 = r6;
                                                                                                                                zipFile = zipFile8;
                                                                                                                                cls3 = cls3;
                                                                                                                                zipFile.close();
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (obj12 != null) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            Class cls73 = (Class) obj12;
                                                                                                                            byte[] bArr36 = $$a;
                                                                                                                            str5 = $$c((byte) (-bArr36[c4]), bArr36[261], (short) 155);
                                                                                                                            Constructor declaredConstructor = cls73.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                            declaredConstructor.setAccessible(true);
                                                                                                                            getVERSION_NAMEannotations = declaredConstructor.newInstance(obj11, Boolean.valueOf(!z15));
                                                                                                                            byte[] bArr37 = new byte[9953];
                                                                                                                            i4 = 12;
                                                                                                                            try {
                                                                                                                                zipFile8 = zipFile3;
                                                                                                                                try {
                                                                                                                                    InputStream inputStream = zipFile8.getInputStream(zipFile8.getEntry($$c(bArr36[12], (byte) (-bArr36[10]), (short) 90).substring(1)));
                                                                                                                                    int i262 = $10;
                                                                                                                                    $11 = ((i262 ^ 73) + ((i262 & 73) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                                                                                                                    try {
                                                                                                                                        Class<?> cls74 = Class.forName($$c(bArr36[251], bArr36[859], (short) 817));
                                                                                                                                        byte b85 = bArr36[251];
                                                                                                                                        byte b86 = bArr36[14];
                                                                                                                                        try {
                                                                                                                                            Object[] objArr18 = {cls74.getDeclaredConstructor(Class.forName($$c(b85, b86, (short) (b86 | 773)))).newInstance(inputStream)};
                                                                                                                                            short s12 = (short) 773;
                                                                                                                                            Class<?> cls75 = Class.forName($$c(bArr36[251], bArr36[117], s12));
                                                                                                                                            byte b87 = bArr36[251];
                                                                                                                                            byte b88 = bArr36[14];
                                                                                                                                            Object newInstance11 = cls75.getDeclaredConstructor(Class.forName($$c(b87, b88, (short) (b88 | 773)))).newInstance(objArr18);
                                                                                                                                            try {
                                                                                                                                                Class<?> cls76 = Class.forName($$c(bArr36[251], bArr36[117], s12));
                                                                                                                                                byte b89 = bArr36[1];
                                                                                                                                                byte b90 = bArr36[43];
                                                                                                                                                cls76.getMethod($$c(b89, b90, (short) ((b90 & 743) | (b90 ^ 743))), r6).invoke(newInstance11, bArr37);
                                                                                                                                                try {
                                                                                                                                                    Class<?> cls77 = Class.forName($$c(bArr36[251], bArr36[117], s12));
                                                                                                                                                    byte b91 = (byte) (-bArr36[c4]);
                                                                                                                                                    byte b92 = bArr36[16];
                                                                                                                                                    try {
                                                                                                                                                        cls77.getMethod($$c(b91, b92, (short) ((b92 ^ 899) | (b92 & 899))), null).invoke(newInstance11, null);
                                                                                                                                                        try {
                                                                                                                                                            i123 = Math.abs(i134);
                                                                                                                                                            cls41 = r4;
                                                                                                                                                            cls40 = r6;
                                                                                                                                                            zipFile14 = zipFile8;
                                                                                                                                                            i6 = i10;
                                                                                                                                                            z17 = z15;
                                                                                                                                                            obj4 = obj10;
                                                                                                                                                            z6 = z9;
                                                                                                                                                            i10 = i13;
                                                                                                                                                            b11 = -1;
                                                                                                                                                            i22 = 0;
                                                                                                                                                            i41 = 16;
                                                                                                                                                            cls51 = cls73;
                                                                                                                                                            i124 = 9901;
                                                                                                                                                            bArr20 = bArr37;
                                                                                                                                                            r66 = cls3;
                                                                                                                                                        } catch (Throwable th82) {
                                                                                                                                                            th = th82;
                                                                                                                                                            th = th;
                                                                                                                                                            i41 = 16;
                                                                                                                                                            r43 = r4;
                                                                                                                                                            r62 = r6;
                                                                                                                                                            zipFile = zipFile8;
                                                                                                                                                            cls3 = cls3;
                                                                                                                                                            zipFile.close();
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th83) {
                                                                                                                                                        th = th83;
                                                                                                                                                        Throwable cause33 = th.getCause();
                                                                                                                                                        if (cause33 == null) {
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                        throw cause33;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th84) {
                                                                                                                                                    th = th84;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th85) {
                                                                                                                                                Throwable cause34 = th85.getCause();
                                                                                                                                                if (cause34 == null) {
                                                                                                                                                    throw th85;
                                                                                                                                                }
                                                                                                                                                throw cause34;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th86) {
                                                                                                                                            Throwable cause35 = th86.getCause();
                                                                                                                                            if (cause35 == null) {
                                                                                                                                                throw th86;
                                                                                                                                            }
                                                                                                                                            throw cause35;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th87) {
                                                                                                                                        Throwable cause36 = th87.getCause();
                                                                                                                                        if (cause36 == null) {
                                                                                                                                            throw th87;
                                                                                                                                        }
                                                                                                                                        throw cause36;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th88) {
                                                                                                                                    th = th88;
                                                                                                                                    th = th;
                                                                                                                                    i41 = 16;
                                                                                                                                    r43 = r4;
                                                                                                                                    r62 = r6;
                                                                                                                                    zipFile = zipFile8;
                                                                                                                                    cls3 = cls3;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (Throwable th89) {
                                                                                                                                th = th89;
                                                                                                                                zipFile8 = zipFile3;
                                                                                                                            }
                                                                                                                        } catch (Throwable th90) {
                                                                                                                            th = th90;
                                                                                                                            zipFile8 = zipFile3;
                                                                                                                            i4 = 12;
                                                                                                                        }
                                                                                                                    } catch (Throwable th91) {
                                                                                                                        th = th91;
                                                                                                                        cls16 = cls40;
                                                                                                                        cls17 = cls41;
                                                                                                                        zipFile4 = zipFile3;
                                                                                                                        cls15 = cls25;
                                                                                                                        i41 = 16;
                                                                                                                        i4 = 12;
                                                                                                                        r42 = cls17;
                                                                                                                        r6 = cls16;
                                                                                                                        r8 = zipFile4;
                                                                                                                        cls3 = cls15;
                                                                                                                        i10 = 4;
                                                                                                                        th = th;
                                                                                                                        r43 = r42;
                                                                                                                        r62 = r6;
                                                                                                                        zipFile = r8;
                                                                                                                        cls3 = cls3;
                                                                                                                        zipFile.close();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (Throwable th92) {
                                                                                                                    th = th92;
                                                                                                                    Throwable cause37 = th.getCause();
                                                                                                                    if (cause37 == null) {
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                    throw cause37;
                                                                                                                }
                                                                                                            } catch (Throwable th93) {
                                                                                                                th = th93;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th94) {
                                                                                                        Throwable cause38 = th94.getCause();
                                                                                                        if (cause38 == null) {
                                                                                                            throw th94;
                                                                                                        }
                                                                                                        throw cause38;
                                                                                                    }
                                                                                                } catch (Throwable th95) {
                                                                                                    th = th95;
                                                                                                }
                                                                                            } catch (Throwable th96) {
                                                                                                Throwable cause39 = th96.getCause();
                                                                                                if (cause39 == null) {
                                                                                                    throw th96;
                                                                                                }
                                                                                                throw cause39;
                                                                                            }
                                                                                        } catch (Throwable th97) {
                                                                                            Throwable cause40 = th97.getCause();
                                                                                            if (cause40 == null) {
                                                                                                throw th97;
                                                                                            }
                                                                                            throw cause40;
                                                                                        }
                                                                                    } catch (Throwable th98) {
                                                                                        Throwable cause41 = th98.getCause();
                                                                                        if (cause41 == null) {
                                                                                            throw th98;
                                                                                        }
                                                                                        throw cause41;
                                                                                    }
                                                                                } catch (Throwable th99) {
                                                                                    th = th99;
                                                                                    r8 = zipFile14;
                                                                                    r6 = cls40;
                                                                                    r42 = cls41;
                                                                                    z9 = z6;
                                                                                    i13 = i10;
                                                                                    i4 = 12;
                                                                                    i10 = i6;
                                                                                }
                                                                            } catch (Throwable th100) {
                                                                                Throwable cause42 = th100.getCause();
                                                                                if (cause42 == null) {
                                                                                    throw th100;
                                                                                }
                                                                                throw cause42;
                                                                            }
                                                                        } catch (Throwable th101) {
                                                                            Throwable cause43 = th101.getCause();
                                                                            if (cause43 == null) {
                                                                                throw th101;
                                                                            }
                                                                            throw cause43;
                                                                        }
                                                                    } catch (Throwable th102) {
                                                                        th = th102;
                                                                        cls8 = r43;
                                                                        cls7 = r62;
                                                                        z11 = z8;
                                                                        cls6 = cls3;
                                                                    }
                                                                } catch (Throwable th103) {
                                                                    th = th103;
                                                                    cls9 = cls40;
                                                                    cls10 = cls41;
                                                                    z9 = z6;
                                                                    i13 = i10;
                                                                    z14 = z8;
                                                                    i10 = i6;
                                                                    cls8 = cls10;
                                                                    cls7 = cls9;
                                                                    z11 = z14;
                                                                    cls6 = cls3;
                                                                    int currentTimeMillis622222222 = (int) System.currentTimeMillis();
                                                                    i9 = i13;
                                                                    int i8622222222 = 318 - (~(i9 * (-317)));
                                                                    int i8722222222 = ~i9;
                                                                    int i8822222222 = ~(((-2) & currentTimeMillis622222222) | ((-2) ^ currentTimeMillis622222222));
                                                                    int i8922222222 = -(-(((i8822222222 & i8722222222) | (i8722222222 ^ i8822222222)) * (-318)));
                                                                    int i9022222222 = (i8622222222 & i8922222222) + (i8622222222 | i8922222222);
                                                                    int i9122222222 = ~i9;
                                                                    int i9222222222 = ~((i9122222222 & currentTimeMillis622222222) | (i9122222222 ^ currentTimeMillis622222222));
                                                                    int i9322222222 = ~currentTimeMillis622222222;
                                                                    int i9422222222 = (i9322222222 & 1) | (i9322222222 ^ 1);
                                                                    int i9522222222 = ~((i9422222222 & i9) | (i9422222222 ^ i9));
                                                                    int i9622222222 = i9022222222 + (((i9222222222 & i9522222222) | (i9222222222 ^ i9522222222)) * 318);
                                                                    int i9722222222 = ~currentTimeMillis622222222;
                                                                    int i9822222222 = (i9722222222 & i8722222222) | (i8722222222 ^ i9722222222);
                                                                    int i9922222222 = ~((i9822222222 & 1) | (i9822222222 ^ 1));
                                                                    int i10022222222 = (i9 ^ 1) | (i9 & 1);
                                                                    int i10122222222 = ~((currentTimeMillis622222222 & i10022222222) | (i10022222222 ^ currentTimeMillis622222222));
                                                                    i14 = i9622222222 + (((i10122222222 & i9922222222) | (i9922222222 ^ i10122222222)) * 318);
                                                                    i11 = i7;
                                                                    while (true) {
                                                                        if (i14 < i11) {
                                                                        }
                                                                        i14++;
                                                                    }
                                                                    b11 = -1;
                                                                    if (z12) {
                                                                    }
                                                                }
                                                            } catch (Throwable th104) {
                                                                th = th104;
                                                                zArr4 = zArr;
                                                                str2 = $$c;
                                                            }
                                                        }
                                                        z4 = true;
                                                        z6 = z9;
                                                        int i79222 = i9 + 93;
                                                        i7 = i11;
                                                        cls41 = r4;
                                                        cls40 = r6;
                                                        i5 = i12;
                                                        obj13 = obj3;
                                                        z7 = z8;
                                                        zArr = zArr4;
                                                        $$c = str2;
                                                        objArr = objArr2;
                                                        zArr2 = zArr5;
                                                        i6 = i10;
                                                        zArr3 = zArr6;
                                                        i34 = 5;
                                                        i8 = (i79222 | (-92)) + (i79222 & (-92));
                                                    }
                                                }
                                            }
                                            z16 = false;
                                            zArr3[z4 ? 1 : 0] = z16;
                                            zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                                            i8 = 0;
                                            z6 = false;
                                            z7 = z5;
                                            while (true) {
                                                int i78222 = i5;
                                                if ((!z6) != z4) {
                                                    return;
                                                }
                                                if (zArr3[i8]) {
                                                }
                                                z4 = true;
                                                z6 = z9;
                                                int i792222 = i9 + 93;
                                                i7 = i11;
                                                cls41 = r4;
                                                cls40 = r6;
                                                i5 = i12;
                                                obj13 = obj3;
                                                z7 = z8;
                                                zArr = zArr4;
                                                $$c = str2;
                                                objArr = objArr2;
                                                zArr2 = zArr5;
                                                i6 = i10;
                                                zArr3 = zArr6;
                                                i34 = 5;
                                                i8 = (i792222 | (-92)) + (i792222 & (-92));
                                            }
                                        } catch (Throwable th105) {
                                            Throwable cause44 = th105.getCause();
                                            if (cause44 == null) {
                                                throw th105;
                                            }
                                            throw cause44;
                                        }
                                    }
                                    c6 = 271;
                                    if (invoke2 == null) {
                                    }
                                    if (invoke == null) {
                                        Object[] objArr42 = new Object[2];
                                        objArr42[z4 ? 1 : 0] = $$c((byte) (-$$a[c4]), r0[37], (short) 1009);
                                        objArr42[0] = obj2;
                                        short s62 = (short) 1058;
                                        invoke = Class.forName($$c(r0[251], r0[c6], s62)).getDeclaredConstructor(Class.forName($$c(r0[251], r0[c6], s62)), String.class).newInstance(objArr42);
                                    }
                                    byte[] bArr6222 = $$a;
                                    short s5222 = (short) 1058;
                                    objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr6222[251], bArr6222[c6], s5222)), 7);
                                    objArr[0] = null;
                                    objArr[z4 ? 1 : 0] = invoke;
                                    objArr[2] = obj2;
                                    objArr[3] = invoke2;
                                    objArr[4] = invoke;
                                    objArr[5] = obj2;
                                    objArr[6] = invoke2;
                                    zArr = new boolean[]{false, true, true, true, true, true, true};
                                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                    zArr3 = new boolean[7];
                                    zArr3[0] = false;
                                    zArr3[z4 ? 1 : 0] = false;
                                    zArr3[2] = z4;
                                    zArr3[3] = z4;
                                    zArr3[4] = false;
                                    zArr3[5] = z4;
                                    zArr3[6] = z4;
                                    i6 = 4;
                                    i7 = 7;
                                    Class<?> cls44222 = Class.forName($$c((byte) (-bArr6222[41]), bArr6222[126], (short) 1000));
                                    i21 = cls44222.getDeclaredField($$c(bArr6222[138], bArr6222[23], (short) 977)).getInt(cls44222);
                                    if (i21 < 34) {
                                    }
                                    if (i21 != 29) {
                                        zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                                        if (i21 >= 21) {
                                        }
                                        z16 = false;
                                        zArr3[z4 ? 1 : 0] = z16;
                                        zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                                        i8 = 0;
                                        z6 = false;
                                        z7 = z5;
                                        while (true) {
                                            int i782222 = i5;
                                            if ((!z6) != z4) {
                                            }
                                            int i7922222 = i9 + 93;
                                            i7 = i11;
                                            cls41 = r4;
                                            cls40 = r6;
                                            i5 = i12;
                                            obj13 = obj3;
                                            z7 = z8;
                                            zArr = zArr4;
                                            $$c = str2;
                                            objArr = objArr2;
                                            zArr2 = zArr5;
                                            i6 = i10;
                                            zArr3 = zArr6;
                                            i34 = 5;
                                            i8 = (i7922222 | (-92)) + (i7922222 & (-92));
                                        }
                                    }
                                    zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                                    if (i21 >= 21) {
                                    }
                                    z16 = false;
                                    zArr3[z4 ? 1 : 0] = z16;
                                    zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                                    i8 = 0;
                                    z6 = false;
                                    z7 = z5;
                                    while (true) {
                                        int i7822222 = i5;
                                        if ((!z6) != z4) {
                                        }
                                        int i79222222 = i9 + 93;
                                        i7 = i11;
                                        cls41 = r4;
                                        cls40 = r6;
                                        i5 = i12;
                                        obj13 = obj3;
                                        z7 = z8;
                                        zArr = zArr4;
                                        $$c = str2;
                                        objArr = objArr2;
                                        zArr2 = zArr5;
                                        i6 = i10;
                                        zArr3 = zArr6;
                                        i34 = 5;
                                        i8 = (i79222222 | (-92)) + (i79222222 & (-92));
                                    }
                                }
                                i4 = 12;
                                invoke2 = null;
                                i5 = 2;
                                if (obj2 != null) {
                                }
                                c6 = 271;
                                if (invoke2 == null) {
                                }
                                if (invoke == null) {
                                }
                                byte[] bArr62222 = $$a;
                                short s52222 = (short) 1058;
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr62222[251], bArr62222[c6], s52222)), 7);
                                objArr[0] = null;
                                objArr[z4 ? 1 : 0] = invoke;
                                objArr[2] = obj2;
                                objArr[3] = invoke2;
                                objArr[4] = invoke;
                                objArr[5] = obj2;
                                objArr[6] = invoke2;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[7];
                                zArr3[0] = false;
                                zArr3[z4 ? 1 : 0] = false;
                                zArr3[2] = z4;
                                zArr3[3] = z4;
                                zArr3[4] = false;
                                zArr3[5] = z4;
                                zArr3[6] = z4;
                                i6 = 4;
                                i7 = 7;
                                Class<?> cls442222 = Class.forName($$c((byte) (-bArr62222[41]), bArr62222[126], (short) 1000));
                                i21 = cls442222.getDeclaredField($$c(bArr62222[138], bArr62222[23], (short) 977)).getInt(cls442222);
                                if (i21 < 34) {
                                }
                                zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                                if (i21 >= 21) {
                                }
                                z16 = false;
                                zArr3[z4 ? 1 : 0] = z16;
                                zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                                i8 = 0;
                                z6 = false;
                                z7 = z5;
                                while (true) {
                                    int i78222222 = i5;
                                    if ((!z6) != z4) {
                                    }
                                    int i792222222 = i9 + 93;
                                    i7 = i11;
                                    cls41 = r4;
                                    cls40 = r6;
                                    i5 = i12;
                                    obj13 = obj3;
                                    z7 = z8;
                                    zArr = zArr4;
                                    $$c = str2;
                                    objArr = objArr2;
                                    zArr2 = zArr5;
                                    i6 = i10;
                                    zArr3 = zArr6;
                                    i34 = 5;
                                    i8 = (i792222222 | (-92)) + (i792222222 & (-92));
                                }
                            }
                            if (obj != null) {
                            }
                            i4 = 12;
                            invoke2 = null;
                            i5 = 2;
                            if (obj2 != null) {
                            }
                            c6 = 271;
                            if (invoke2 == null) {
                            }
                            if (invoke == null) {
                            }
                            byte[] bArr622222 = $$a;
                            short s522222 = (short) 1058;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr622222[251], bArr622222[c6], s522222)), 7);
                            objArr[0] = null;
                            objArr[z4 ? 1 : 0] = invoke;
                            objArr[2] = obj2;
                            objArr[3] = invoke2;
                            objArr[4] = invoke;
                            objArr[5] = obj2;
                            objArr[6] = invoke2;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[0] = false;
                            zArr3[z4 ? 1 : 0] = false;
                            zArr3[2] = z4;
                            zArr3[3] = z4;
                            zArr3[4] = false;
                            zArr3[5] = z4;
                            zArr3[6] = z4;
                            i6 = 4;
                            i7 = 7;
                            Class<?> cls4422222 = Class.forName($$c((byte) (-bArr622222[41]), bArr622222[126], (short) 1000));
                            i21 = cls4422222.getDeclaredField($$c(bArr622222[138], bArr622222[23], (short) 977)).getInt(cls4422222);
                            if (i21 < 34) {
                            }
                            zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                            if (i21 >= 21) {
                            }
                            z16 = false;
                            zArr3[z4 ? 1 : 0] = z16;
                            zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                            i8 = 0;
                            z6 = false;
                            z7 = z5;
                            while (true) {
                                int i782222222 = i5;
                                if ((!z6) != z4) {
                                }
                                int i7922222222 = i9 + 93;
                                i7 = i11;
                                cls41 = r4;
                                cls40 = r6;
                                i5 = i12;
                                obj13 = obj3;
                                z7 = z8;
                                zArr = zArr4;
                                $$c = str2;
                                objArr = objArr2;
                                zArr2 = zArr5;
                                i6 = i10;
                                zArr3 = zArr6;
                                i34 = 5;
                                i8 = (i7922222222 | (-92)) + (i7922222222 & (-92));
                            }
                        }
                        invoke = null;
                        if (obj != null) {
                        }
                        i4 = 12;
                        invoke2 = null;
                        i5 = 2;
                        if (obj2 != null) {
                        }
                        c6 = 271;
                        if (invoke2 == null) {
                        }
                        if (invoke == null) {
                        }
                        byte[] bArr6222222 = $$a;
                        short s5222222 = (short) 1058;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr6222222[251], bArr6222222[c6], s5222222)), 7);
                        objArr[0] = null;
                        objArr[z4 ? 1 : 0] = invoke;
                        objArr[2] = obj2;
                        objArr[3] = invoke2;
                        objArr[4] = invoke;
                        objArr[5] = obj2;
                        objArr[6] = invoke2;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[z4 ? 1 : 0] = false;
                        zArr3[2] = z4;
                        zArr3[3] = z4;
                        zArr3[4] = false;
                        zArr3[5] = z4;
                        zArr3[6] = z4;
                        i6 = 4;
                        i7 = 7;
                        Class<?> cls44222222 = Class.forName($$c((byte) (-bArr6222222[41]), bArr6222222[126], (short) 1000));
                        i21 = cls44222222.getDeclaredField($$c(bArr6222222[138], bArr6222222[23], (short) 977)).getInt(cls44222222);
                        if (i21 < 34) {
                        }
                        zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                        if (i21 >= 21) {
                        }
                        z16 = false;
                        zArr3[z4 ? 1 : 0] = z16;
                        zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                        i8 = 0;
                        z6 = false;
                        z7 = z5;
                        while (true) {
                            int i7822222222 = i5;
                            if ((!z6) != z4) {
                            }
                            int i79222222222 = i9 + 93;
                            i7 = i11;
                            cls41 = r4;
                            cls40 = r6;
                            i5 = i12;
                            obj13 = obj3;
                            z7 = z8;
                            zArr = zArr4;
                            $$c = str2;
                            objArr = objArr2;
                            zArr2 = zArr5;
                            i6 = i10;
                            zArr3 = zArr6;
                            i34 = 5;
                            i8 = (i79222222222 | (-92)) + (i79222222222 & (-92));
                        }
                    }
                    if (obj != null) {
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    i4 = 12;
                    invoke2 = null;
                    i5 = 2;
                    if (obj2 != null) {
                    }
                    c6 = 271;
                    if (invoke2 == null) {
                    }
                    if (invoke == null) {
                    }
                    byte[] bArr62222222 = $$a;
                    short s52222222 = (short) 1058;
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr62222222[251], bArr62222222[c6], s52222222)), 7);
                    objArr[0] = null;
                    objArr[z4 ? 1 : 0] = invoke;
                    objArr[2] = obj2;
                    objArr[3] = invoke2;
                    objArr[4] = invoke;
                    objArr[5] = obj2;
                    objArr[6] = invoke2;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[7];
                    zArr3[0] = false;
                    zArr3[z4 ? 1 : 0] = false;
                    zArr3[2] = z4;
                    zArr3[3] = z4;
                    zArr3[4] = false;
                    zArr3[5] = z4;
                    zArr3[6] = z4;
                    i6 = 4;
                    i7 = 7;
                    Class<?> cls442222222 = Class.forName($$c((byte) (-bArr62222222[41]), bArr62222222[126], (short) 1000));
                    i21 = cls442222222.getDeclaredField($$c(bArr62222222[138], bArr62222222[23], (short) 977)).getInt(cls442222222);
                    if (i21 < 34) {
                    }
                    zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                    if (i21 >= 21) {
                    }
                    z16 = false;
                    zArr3[z4 ? 1 : 0] = z16;
                    zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                    i8 = 0;
                    z6 = false;
                    z7 = z5;
                    while (true) {
                        int i78222222222 = i5;
                        if ((!z6) != z4) {
                        }
                        int i792222222222 = i9 + 93;
                        i7 = i11;
                        cls41 = r4;
                        cls40 = r6;
                        i5 = i12;
                        obj13 = obj3;
                        z7 = z8;
                        zArr = zArr4;
                        $$c = str2;
                        objArr = objArr2;
                        zArr2 = zArr5;
                        i6 = i10;
                        zArr3 = zArr6;
                        i34 = 5;
                        i8 = (i792222222222 | (-92)) + (i792222222222 & (-92));
                    }
                }
                obj2 = null;
                if (obj != null) {
                }
                invoke = null;
                if (obj != null) {
                }
                i4 = 12;
                invoke2 = null;
                i5 = 2;
                if (obj2 != null) {
                }
                c6 = 271;
                if (invoke2 == null) {
                }
                if (invoke == null) {
                }
                byte[] bArr622222222 = $$a;
                short s522222222 = (short) 1058;
                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr622222222[251], bArr622222222[c6], s522222222)), 7);
                objArr[0] = null;
                objArr[z4 ? 1 : 0] = invoke;
                objArr[2] = obj2;
                objArr[3] = invoke2;
                objArr[4] = invoke;
                objArr[5] = obj2;
                objArr[6] = invoke2;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[7];
                zArr3[0] = false;
                zArr3[z4 ? 1 : 0] = false;
                zArr3[2] = z4;
                zArr3[3] = z4;
                zArr3[4] = false;
                zArr3[5] = z4;
                zArr3[6] = z4;
                i6 = 4;
                i7 = 7;
                Class<?> cls4422222222 = Class.forName($$c((byte) (-bArr622222222[41]), bArr622222222[126], (short) 1000));
                i21 = cls4422222222.getDeclaredField($$c(bArr622222222[138], bArr622222222[23], (short) 977)).getInt(cls4422222222);
                if (i21 < 34) {
                }
                zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
                if (i21 >= 21) {
                }
                z16 = false;
                zArr3[z4 ? 1 : 0] = z16;
                zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
                i8 = 0;
                z6 = false;
                z7 = z5;
                while (true) {
                    int i782222222222 = i5;
                    if ((!z6) != z4) {
                    }
                    int i7922222222222 = i9 + 93;
                    i7 = i11;
                    cls41 = r4;
                    cls40 = r6;
                    i5 = i12;
                    obj13 = obj3;
                    z7 = z8;
                    zArr = zArr4;
                    $$c = str2;
                    objArr = objArr2;
                    zArr2 = zArr5;
                    i6 = i10;
                    zArr3 = zArr6;
                    i34 = 5;
                    i8 = (i7922222222222 | (-92)) + (i7922222222222 & (-92));
                }
            }
            if (obj != null) {
            }
            obj2 = null;
            if (obj != null) {
            }
            invoke = null;
            if (obj != null) {
            }
            i4 = 12;
            invoke2 = null;
            i5 = 2;
            if (obj2 != null) {
            }
            c6 = 271;
            if (invoke2 == null) {
            }
            if (invoke == null) {
            }
            byte[] bArr6222222222 = $$a;
            short s5222222222 = (short) 1058;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr6222222222[251], bArr6222222222[c6], s5222222222)), 7);
            objArr[0] = null;
            objArr[z4 ? 1 : 0] = invoke;
            objArr[2] = obj2;
            objArr[3] = invoke2;
            objArr[4] = invoke;
            objArr[5] = obj2;
            objArr[6] = invoke2;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            zArr3 = new boolean[7];
            zArr3[0] = false;
            zArr3[z4 ? 1 : 0] = false;
            zArr3[2] = z4;
            zArr3[3] = z4;
            zArr3[4] = false;
            zArr3[5] = z4;
            zArr3[6] = z4;
            i6 = 4;
            i7 = 7;
            Class<?> cls44222222222 = Class.forName($$c((byte) (-bArr6222222222[41]), bArr6222222222[126], (short) 1000));
            i21 = cls44222222222.getDeclaredField($$c(bArr6222222222[138], bArr6222222222[23], (short) 977)).getInt(cls44222222222);
            if (i21 < 34) {
            }
            zArr3[0] = (i21 != 29 && i21 >= 26) ? z4 ? 1 : 0 : false;
            if (i21 >= 21) {
            }
            z16 = false;
            zArr3[z4 ? 1 : 0] = z16;
            zArr3[4] = i21 < 21 ? z4 ? 1 : 0 : false;
            i8 = 0;
            z6 = false;
            z7 = z5;
            while (true) {
                int i7822222222222 = i5;
                if ((!z6) != z4) {
                }
                int i79222222222222 = i9 + 93;
                i7 = i11;
                cls41 = r4;
                cls40 = r6;
                i5 = i12;
                obj13 = obj3;
                z7 = z8;
                zArr = zArr4;
                $$c = str2;
                objArr = objArr2;
                zArr2 = zArr5;
                i6 = i10;
                zArr3 = zArr6;
                i34 = 5;
                i8 = (i79222222222222 | (-92)) + (i79222222222222 & (-92));
            }
        } catch (Throwable th106) {
            Throwable cause45 = th106.getCause();
            if (cause45 == null) {
                throw th106;
            }
            throw cause45;
        }
    }

    private AFPurchaseConnectorA1w() {
    }

    public static int getQuantity(int i4) {
        int i5 = $10;
        Object obj = getVERSION_NAMEannotations;
        $11 = (((i5 | 21) << 1) - (i5 ^ 21)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[19]), r0[261], (short) 645), true, (ClassLoader) setConnector).getMethod($$c(r0[91], r0[66], r0[7]), Integer.TYPE).invoke(obj, Integer.valueOf(i4))).intValue();
            int i6 = $11;
            int i7 = ((i6 | 73) << 1) - (i6 ^ 73);
            $10 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i7 % 2 != 0) {
                int i8 = 77 / 0;
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

    static void init$0() {
        int i4;
        int i5 = $10;
        int i6 = ((i5 | 57) << 1) - (i5 ^ 57);
        $11 = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 == 0) {
            byte[] bArr = new byte[1301];
            System.arraycopy("tQ(è\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006\u000eö\u0003\f\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ\u0015\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóFâ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ5Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0014\u0003ò\u001bí\u000f\u0004\f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ8\u000f\u0002\u0003ú\u0001\u0014þ\u0006¿E\b\u0000ô\u0001\n\u000eõÌ\u0016\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006Òó:\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ8\u000f\u0002\u0003ú\u0001\u0014þ\u0006¿E\b\u0000ô\u0001\n\u000eõÌ\u0016\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóFâ\u0003þÞ,ÿ\u0002â\u0017\u0012û\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ\u0015\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóI°N5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ6Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸(Ö2\u0003ã(\u0000ô\bü\u0015õã4ò\f\t\u0001\u0012à'ï\u0010\tø\u000e\b".getBytes("ISO-8859-1"), 0, bArr, 0, 1301);
            $$a = bArr;
            i4 = 21749;
        } else {
            byte[] bArr2 = new byte[1301];
            System.arraycopy("tQ(è\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006\u000eö\u0003\f\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ\u0015\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóFâ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ5Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0014\u0003ò\u001bí\u000f\u0004\f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ8\u000f\u0002\u0003ú\u0001\u0014þ\u0006¿E\b\u0000ô\u0001\n\u000eõÌ\u0016\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006Òó:\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ8\u000f\u0002\u0003ú\u0001\u0014þ\u0006¿E\b\u0000ô\u0001\n\u000eõÌ\u0016\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóFâ\u0003þÞ,ÿ\u0002â\u0017\u0012û\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ\u0015\b\r(\u0000ô\bü\u0015õá/\u0002\u0003ú\u0001\u0014þ\u0006ÒóI°N5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7\u000f\u0002\u0003ú\u0001\u0014þ\u0006ÀD\b\u0000ô\u0001\n\u000eõÍ6Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸(Ö2\u0003ã(\u0000ô\bü\u0015õã4ò\f\t\u0001\u0012à'ï\u0010\tø\u000e\b".getBytes("ISO-8859-1"), 0, bArr2, 0, 1301);
            $$a = bArr2;
            i4 = 167;
        }
        $$b = i4;
    }

    public static int toJsonMap(Object obj) {
        int i4 = $10;
        int i5 = (i4 ^ 119) + ((i4 & 119) << 1);
        int i6 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        $11 = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        Object obj2 = getVERSION_NAMEannotations;
        $10 = (i6 + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[19]), r0[261], (short) 645), true, (ClassLoader) setConnector).getMethod($$c(r0[91], r0[66], r0[7]), Object.class).invoke(obj2, obj)).intValue();
            int i7 = $11 + 97;
            $10 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i7 % 2 == 0) {
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

    public static Object getQuantity(int i4, int i5, char c4) {
        int i6 = $11;
        Object obj = getVERSION_NAMEannotations;
        int i7 = (((i6 | 117) << 1) - (i6 ^ 117)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        $10 = i7;
        $11 = ((i7 ^ 113) + ((i7 & 113) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {Integer.valueOf(i4), Integer.valueOf(i5), Character.valueOf(c4)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) (-bArr[19]), bArr[261], (short) 645), true, (ClassLoader) setConnector);
            byte b4 = bArr[2];
            byte b5 = bArr[6];
            String $$c = $$c(b4, b5, b5);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i8 = $11;
            int i9 = ((i8 | 25) << 1) - (i8 ^ 25);
            $10 = i9 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i9 % 2 == 0) {
                return invoke;
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
}
