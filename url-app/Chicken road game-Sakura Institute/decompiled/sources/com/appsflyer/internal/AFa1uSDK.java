package com.appsflyer.internal;

import android.view.View;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class AFa1uSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFLogger$LogLevel;
    private static Object AFPurchaseDetails;
    private static Object afErrorLogForExcManagerOnly;
    private static final Map<String, Object> afLogForce;
    public static final Map<Integer, Object> afRDLog;
    private static byte[] getLevel;
    private static long getProductId;
    private static int getPurchaseType;

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004f -> B:4:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i4, int i5) {
        int i6;
        int i7 = $11;
        int i8 = (((i7 | 105) << 1) - (i7 ^ 105)) % 128;
        $10 = i8;
        int i9 = i2 + 41;
        byte[] bArr = $$a;
        int i10 = (i5 & (-79)) + (i5 | (-79));
        int i11 = ((i10 | 80) << 1) - (i10 ^ 80);
        int i12 = ((i4 | 4) << 1) - (i4 ^ 4);
        byte[] bArr2 = new byte[i11];
        int i13 = i11 - 1;
        if (bArr == null) {
            int i14 = ((i8 & 9) + (i8 | 9)) % 128;
            $11 = i14;
            $10 = ((i14 ^ 67) + ((i14 & 67) << 1)) % 128;
            i9 = i13;
            int i15 = i12;
            i6 = 0;
            int i16 = -i12;
            i9 = ((i9 | i16) << 1) - (i9 ^ i16);
            int i17 = i15 + 55;
            i12 = (i17 ^ (-54)) + ((i17 & (-54)) << 1);
            bArr2[i6] = (byte) i9;
            if (i6 == i13) {
                return new String(bArr2, 0);
            }
            int i18 = bArr[i12];
            i6++;
            int i19 = $10;
            $11 = ((i19 & 97) + (i19 | 97)) % 128;
            i15 = i12;
            i12 = i18;
            int i162 = -i12;
            i9 = ((i9 | i162) << 1) - (i9 ^ i162);
            int i172 = i15 + 55;
            i12 = (i172 ^ (-54)) + ((i172 & (-54)) << 1);
            bArr2[i6] = (byte) i9;
            if (i6 == i13) {
            }
        } else {
            i6 = 0;
            bArr2[i6] = (byte) i9;
            if (i6 == i13) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:(2:971|972)|(32:967|968|(0)|13|(0)|15|16|(0)|(0)(0)|32|(0)|47|48|49|50|51|(0)(0)|54|(0)|937|59|60|61|(0)(0)|64|(0)(0)|67|68|69|(0)|931|932)|11|(0)|13|(0)|15|16|(0)|(0)(0)|32|(0)|47|48|49|50|51|(0)(0)|54|(0)|937|59|60|61|(0)(0)|64|(0)(0)|67|68|69|(0)|931|932) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0359, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r37[r11], r14, r37[35])).getMethod($$c((byte) (-com.appsflyer.internal.AFa1uSDK.$$a[436(0x1b4, float:6.11E-43)]), (short) 725, r37[2]), null).invoke(r10, null)).booleanValue() != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x10aa, code lost:
    
        r5 = com.appsflyer.internal.AFa1uSDK.$10;
        com.appsflyer.internal.AFa1uSDK.$11 = ((r5 & 101) + (r5 | 101)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x10b7, code lost:
    
        r5 = r13[10];
        r5 = java.lang.Class.forName($$c(r5, (short) ((r5 ^ 426) | (r5 & 426)), r13[757(0x2f5, float:1.061E-42)])).getMethod($$c(r13[334(0x14e, float:4.68E-43)], (short) 861, r13[67]), null).invoke(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x10f1, code lost:
    
        java.lang.Class.forName($$c(r13[10], r13[14], r13[538(0x21a, float:7.54E-43)])).getMethod($$c((byte) (-r13[436(0x1b4, float:6.11E-43)]), (short) 605, r13[28]), null).invoke(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x1122, code lost:
    
        r3 = com.appsflyer.internal.AFa1uSDK.$$a;
        r6 = r3[10];
        java.lang.Class.forName($$c(r6, (short) ((r6 ^ 426) | (r6 & 426)), r3[757(0x2f5, float:1.061E-42)])).getMethod($$c((byte) (-r3[436(0x1b4, float:6.11E-43)]), (short) 605, r3[28]), null).invoke(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x115d, code lost:
    
        r3 = com.appsflyer.internal.AFa1uSDK.$$a;
        r1 = java.lang.Class.class.getMethod($$c(r3[425(0x1a9, float:5.96E-43)], (short) 543, r3[17]), null).invoke(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x117b, code lost:
    
        r6 = java.lang.Class.forName($$c((byte) (-r3[8]), (short) 147, r3[95]));
        r7 = java.lang.Class.forName($$c(r3[10], r3[319(0x13f, float:4.47E-43)], (byte) (-r3[45])));
        r11 = r3[10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x1203, code lost:
    
        r5 = r6.getDeclaredConstructor(r7, java.lang.Class.forName($$c(r11, (short) ((r11 ^ 302) | (r11 & 302)), r3[341(0x155, float:4.78E-43)]))).newInstance(java.lang.Class.forName($$c(r3[10], r3[319(0x13f, float:4.47E-43)], (byte) (-r3[45]))).getMethod($$c((byte) (r3[319(0x13f, float:4.47E-43)] - 1), (short) 923, r3[46]), byte[].class).invoke(null, r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x120d, code lost:
    
        r6 = java.lang.Class.forName($$c((byte) (-r3[8]), (short) 246, r3[534(0x216, float:7.48E-43)])).getDeclaredField($$c((byte) 71, (short) 750, r3[2]));
        r6.setAccessible(true);
        r7 = r6.get(r1);
        r9 = r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x124b, code lost:
    
        r10 = r9.getDeclaredField($$c(r3[75], (short) (com.appsflyer.internal.AFa1uSDK.$$b | 898), r3[315(0x13b, float:4.41E-43)]));
        r10.setAccessible(true);
        r12 = r3[75];
        r3 = r9.getDeclaredField($$c(r12, (short) ((r12 & 512) | (r12 ^ 512)), r3[345(0x159, float:4.83E-43)]));
        r3.setAccessible(true);
        r9 = r10.get(r7);
        r7 = r3.get(r7);
        r6 = r6.get(r5);
        r11 = new java.util.ArrayList((java.util.List) r9);
        r9 = r7.getClass().getComponentType();
        r12 = java.lang.reflect.Array.getLength(r7);
        r9 = java.lang.reflect.Array.newInstance(r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x1299, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x129c, code lost:
    
        r21 = com.appsflyer.internal.AFa1uSDK.$10;
        com.appsflyer.internal.AFa1uSDK.$11 = ((r21 ^ 29) + ((r21 & 29) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x12ac, code lost:
    
        java.lang.reflect.Array.set(r9, r13, java.lang.reflect.Array.get(r7, r13));
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x12c3, code lost:
    
        r10.set(r6, r11);
        r3.set(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x12cb, code lost:
    
        if (com.appsflyer.internal.AFa1uSDK.AFPurchaseDetails == null) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x12cd, code lost:
    
        com.appsflyer.internal.AFa1uSDK.AFPurchaseDetails = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x12cf, code lost:
    
        r3 = r5;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x12bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x12c0, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x151a, code lost:
    
        r5 = new java.lang.StringBuilder();
        r6 = com.appsflyer.internal.AFa1uSDK.$$a;
        r5.append($$c(r6[757(0x2f5, float:1.061E-42)], (short) 339, r6[28]));
        r5.append(r1);
        r1 = r6[14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x1538, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x1542, code lost:
    
        r5.append($$c(r7, (short) ((r7 ^ 217) | (r7 & 217)), r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x157c, code lost:
    
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(r6[10], (short) 732, (byte) (-r6[45]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(r5.toString(), r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x157d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x157f, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x1583, code lost:
    
        if (r3 != null) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x1585, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x158b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x158c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x1515, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x1510, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x1596, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x1597, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x15a0, code lost:
    
        if (r3 != null) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x15a2, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x15a3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x15a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x15a5, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x15ae, code lost:
    
        if (r3 != null) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x15b0, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x15b1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x1153, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x1155, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x1159, code lost:
    
        if (r3 != null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x115b, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x115c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x1113, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x1114, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x111a, code lost:
    
        r6 = r3.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x111e, code lost:
    
        if (r6 != null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x1120, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x1121, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x1116, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x15b2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x15b3, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x15bc, code lost:
    
        if (r3 != null) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x15be, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x15bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x1586, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x04b5, code lost:
    
        if (r34 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:940:0x0309, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008e, code lost:
    
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x16a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x129c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x12cd A[Catch: all -> 0x12b8, TryCatch #55 {all -> 0x12b8, blocks: (B:318:0x12d2, B:323:0x134a, B:325:0x1354, B:275:0x13c9, B:283:0x14ac, B:286:0x14c0, B:288:0x14c7, B:289:0x14c8, B:292:0x14ca, B:294:0x14d1, B:295:0x14d2, B:298:0x14d4, B:300:0x14db, B:301:0x14dc, B:305:0x14dd, B:329:0x136f, B:331:0x1376, B:332:0x1377, B:270:0x1378, B:273:0x13b1, B:312:0x13bf, B:313:0x13c5, B:258:0x124b, B:262:0x12ac, B:264:0x12c3, B:265:0x12c9, B:267:0x12cd, B:321:0x132e, B:282:0x1486, B:279:0x1452, B:277:0x1417), top: B:317:0x12d2, inners: #23, #59, #64, #70 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x1378 A[Catch: all -> 0x12b8, TRY_LEAVE, TryCatch #55 {all -> 0x12b8, blocks: (B:318:0x12d2, B:323:0x134a, B:325:0x1354, B:275:0x13c9, B:283:0x14ac, B:286:0x14c0, B:288:0x14c7, B:289:0x14c8, B:292:0x14ca, B:294:0x14d1, B:295:0x14d2, B:298:0x14d4, B:300:0x14db, B:301:0x14dc, B:305:0x14dd, B:329:0x136f, B:331:0x1376, B:332:0x1377, B:270:0x1378, B:273:0x13b1, B:312:0x13bf, B:313:0x13c5, B:258:0x124b, B:262:0x12ac, B:264:0x12c3, B:265:0x12c9, B:267:0x12cd, B:321:0x132e, B:282:0x1486, B:279:0x1452, B:277:0x1417), top: B:317:0x12d2, inners: #23, #59, #64, #70 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x13c9 A[Catch: all -> 0x12b8, TRY_ENTER, TRY_LEAVE, TryCatch #55 {all -> 0x12b8, blocks: (B:318:0x12d2, B:323:0x134a, B:325:0x1354, B:275:0x13c9, B:283:0x14ac, B:286:0x14c0, B:288:0x14c7, B:289:0x14c8, B:292:0x14ca, B:294:0x14d1, B:295:0x14d2, B:298:0x14d4, B:300:0x14db, B:301:0x14dc, B:305:0x14dd, B:329:0x136f, B:331:0x1376, B:332:0x1377, B:270:0x1378, B:273:0x13b1, B:312:0x13bf, B:313:0x13c5, B:258:0x124b, B:262:0x12ac, B:264:0x12c3, B:265:0x12c9, B:267:0x12cd, B:321:0x132e, B:282:0x1486, B:279:0x1452, B:277:0x1417), top: B:317:0x12d2, inners: #23, #59, #64, #70 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x14dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x12d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x15da A[Catch: all -> 0x1586, TryCatch #31 {all -> 0x1586, blocks: (B:340:0x1542, B:349:0x157f, B:351:0x1585, B:352:0x158b, B:364:0x1597, B:366:0x15a2, B:367:0x15a3, B:370:0x15a5, B:372:0x15b0, B:373:0x15b1, B:396:0x15b3, B:398:0x15be, B:399:0x15bf, B:406:0x15c1, B:408:0x15cc, B:409:0x15cd, B:413:0x15d4, B:415:0x15da, B:416:0x15db, B:427:0x15dd, B:429:0x15e8, B:430:0x15e9, B:702:0x15eb, B:704:0x15f9, B:705:0x15fa, B:727:0x15fc, B:729:0x160a, B:730:0x160b, B:736:0x161c, B:738:0x162a, B:739:0x162b, B:746:0x163d, B:748:0x1643, B:749:0x1644, B:755:0x164e, B:757:0x165e, B:758:0x165f, B:761:0x1661, B:763:0x1671, B:764:0x1672, B:767:0x1674, B:769:0x1684, B:770:0x1685, B:171:0x07ed, B:168:0x07b1, B:166:0x076f, B:343:0x154e, B:344:0x157c, B:251:0x11c7, B:247:0x115d, B:236:0x10b7, B:212:0x0feb, B:201:0x0f42, B:194:0x09de, B:724:0x0972, B:716:0x0924), top: B:339:0x1542, inners: #14, #18, #26, #29, #38, #45, #52, #61, #73, #77, #82, #104 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x15db A[Catch: all -> 0x1586, TryCatch #31 {all -> 0x1586, blocks: (B:340:0x1542, B:349:0x157f, B:351:0x1585, B:352:0x158b, B:364:0x1597, B:366:0x15a2, B:367:0x15a3, B:370:0x15a5, B:372:0x15b0, B:373:0x15b1, B:396:0x15b3, B:398:0x15be, B:399:0x15bf, B:406:0x15c1, B:408:0x15cc, B:409:0x15cd, B:413:0x15d4, B:415:0x15da, B:416:0x15db, B:427:0x15dd, B:429:0x15e8, B:430:0x15e9, B:702:0x15eb, B:704:0x15f9, B:705:0x15fa, B:727:0x15fc, B:729:0x160a, B:730:0x160b, B:736:0x161c, B:738:0x162a, B:739:0x162b, B:746:0x163d, B:748:0x1643, B:749:0x1644, B:755:0x164e, B:757:0x165e, B:758:0x165f, B:761:0x1661, B:763:0x1671, B:764:0x1672, B:767:0x1674, B:769:0x1684, B:770:0x1685, B:171:0x07ed, B:168:0x07b1, B:166:0x076f, B:343:0x154e, B:344:0x157c, B:251:0x11c7, B:247:0x115d, B:236:0x10b7, B:212:0x0feb, B:201:0x0f42, B:194:0x09de, B:724:0x0972, B:716:0x0924), top: B:339:0x1542, inners: #14, #18, #26, #29, #38, #45, #52, #61, #73, #77, #82, #104 }] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0f0e A[Catch: all -> 0x0d94, TryCatch #37 {all -> 0x0d94, blocks: (B:491:0x0efc, B:495:0x0f08, B:497:0x0f0e, B:498:0x0f0f, B:510:0x0f1e, B:512:0x0f24, B:513:0x0f25, B:595:0x0d91, B:599:0x0d9f, B:601:0x0da5, B:602:0x0da6, B:611:0x0db2, B:613:0x0dbb, B:614:0x0dbc, B:617:0x0dbe, B:619:0x0dc7, B:620:0x0dc8, B:208:0x0fac, B:217:0x103d, B:227:0x109d, B:229:0x10a3, B:230:0x10a4, B:401:0x10a5, B:402:0x10a9, B:377:0x1155, B:379:0x115b, B:380:0x115c, B:386:0x111a, B:388:0x1120, B:389:0x1121, B:222:0x1046, B:583:0x0d44, B:580:0x0d12), top: B:594:0x0d91, inners: #42, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0f0f A[Catch: all -> 0x0d94, TryCatch #37 {all -> 0x0d94, blocks: (B:491:0x0efc, B:495:0x0f08, B:497:0x0f0e, B:498:0x0f0f, B:510:0x0f1e, B:512:0x0f24, B:513:0x0f25, B:595:0x0d91, B:599:0x0d9f, B:601:0x0da5, B:602:0x0da6, B:611:0x0db2, B:613:0x0dbb, B:614:0x0dbc, B:617:0x0dbe, B:619:0x0dc7, B:620:0x0dc8, B:208:0x0fac, B:217:0x103d, B:227:0x109d, B:229:0x10a3, B:230:0x10a4, B:401:0x10a5, B:402:0x10a9, B:377:0x1155, B:379:0x115b, B:380:0x115c, B:386:0x111a, B:388:0x1120, B:389:0x1121, B:222:0x1046, B:583:0x0d44, B:580:0x0d12), top: B:594:0x0d91, inners: #42, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0f24 A[Catch: all -> 0x0d94, TryCatch #37 {all -> 0x0d94, blocks: (B:491:0x0efc, B:495:0x0f08, B:497:0x0f0e, B:498:0x0f0f, B:510:0x0f1e, B:512:0x0f24, B:513:0x0f25, B:595:0x0d91, B:599:0x0d9f, B:601:0x0da5, B:602:0x0da6, B:611:0x0db2, B:613:0x0dbb, B:614:0x0dbc, B:617:0x0dbe, B:619:0x0dc7, B:620:0x0dc8, B:208:0x0fac, B:217:0x103d, B:227:0x109d, B:229:0x10a3, B:230:0x10a4, B:401:0x10a5, B:402:0x10a9, B:377:0x1155, B:379:0x115b, B:380:0x115c, B:386:0x111a, B:388:0x1120, B:389:0x1121, B:222:0x1046, B:583:0x0d44, B:580:0x0d12), top: B:594:0x0d91, inners: #42, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0f25 A[Catch: all -> 0x0d94, TRY_LEAVE, TryCatch #37 {all -> 0x0d94, blocks: (B:491:0x0efc, B:495:0x0f08, B:497:0x0f0e, B:498:0x0f0f, B:510:0x0f1e, B:512:0x0f24, B:513:0x0f25, B:595:0x0d91, B:599:0x0d9f, B:601:0x0da5, B:602:0x0da6, B:611:0x0db2, B:613:0x0dbb, B:614:0x0dbc, B:617:0x0dbe, B:619:0x0dc7, B:620:0x0dc8, B:208:0x0fac, B:217:0x103d, B:227:0x109d, B:229:0x10a3, B:230:0x10a4, B:401:0x10a5, B:402:0x10a9, B:377:0x1155, B:379:0x115b, B:380:0x115c, B:386:0x111a, B:388:0x1120, B:389:0x1121, B:222:0x1046, B:583:0x0d44, B:580:0x0d12), top: B:594:0x0d91, inners: #42, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x172c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0316 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:934:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:935:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:938:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:941:0x017d A[Catch: Exception -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #88 {Exception -> 0x004f, blocks: (B:3:0x0025, B:5:0x003e, B:20:0x0131, B:25:0x177d, B:27:0x1784, B:29:0x1785, B:36:0x01f4, B:43:0x0243, B:45:0x0249, B:46:0x024a, B:47:0x024b, B:50:0x02a0, B:60:0x02e6, B:64:0x02fb, B:68:0x0306, B:73:0x0312, B:112:0x16b2, B:115:0x16b7, B:121:0x16c7, B:77:0x174a, B:128:0x16c2, B:134:0x16df, B:142:0x1724, B:144:0x172a, B:145:0x172b, B:941:0x017d, B:948:0x1769, B:950:0x1770, B:951:0x1771, B:954:0x1773, B:956:0x177a, B:957:0x177b, B:137:0x16f3, B:138:0x1721, B:39:0x020d, B:945:0x01c1, B:943:0x018e, B:22:0x0151), top: B:2:0x0025, inners: #0, #11, #21, #25, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:958:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:963:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:967:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v159, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v220, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v237, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r48v1 */
    /* JADX WARN: Type inference failed for: r48v10 */
    /* JADX WARN: Type inference failed for: r48v11 */
    /* JADX WARN: Type inference failed for: r48v12 */
    /* JADX WARN: Type inference failed for: r48v17 */
    /* JADX WARN: Type inference failed for: r48v2 */
    /* JADX WARN: Type inference failed for: r48v20, types: [int] */
    /* JADX WARN: Type inference failed for: r48v21 */
    /* JADX WARN: Type inference failed for: r48v26 */
    /* JADX WARN: Type inference failed for: r48v27 */
    /* JADX WARN: Type inference failed for: r48v28 */
    /* JADX WARN: Type inference failed for: r48v29 */
    /* JADX WARN: Type inference failed for: r48v3 */
    /* JADX WARN: Type inference failed for: r48v30 */
    /* JADX WARN: Type inference failed for: r48v9 */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v112, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v120, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v121 */
    /* JADX WARN: Type inference failed for: r4v125, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v152 */
    /* JADX WARN: Type inference failed for: r4v153, types: [java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v154 */
    /* JADX WARN: Type inference failed for: r4v155 */
    /* JADX WARN: Type inference failed for: r4v156 */
    /* JADX WARN: Type inference failed for: r4v157, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v176 */
    /* JADX WARN: Type inference failed for: r4v178 */
    /* JADX WARN: Type inference failed for: r4v181 */
    /* JADX WARN: Type inference failed for: r4v182 */
    /* JADX WARN: Type inference failed for: r4v183 */
    /* JADX WARN: Type inference failed for: r4v184 */
    /* JADX WARN: Type inference failed for: r4v185 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v50, types: [int] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v70, types: [java.lang.Long, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r6v151, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v110, types: [java.lang.reflect.Method] */
    static {
        Object obj;
        Object invoke;
        Object invoke2;
        Object invoke3;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        String str;
        boolean z7;
        boolean[] zArr4;
        boolean[] zArr5;
        ?? r48;
        Object[] objArr2;
        boolean[] zArr6;
        byte[] bArr;
        Object obj2;
        int i4;
        boolean z8;
        Object obj3;
        boolean z9;
        Class<AFa1uSDK> cls;
        int i5;
        Random random;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i6;
        String sb;
        Random random2;
        Object obj9;
        int i7;
        String str2;
        Class cls2;
        int i8;
        InputStream inputStream;
        Object obj10;
        Exception exc;
        Throwable th;
        Throwable cause;
        Throwable cause2;
        Throwable th2;
        Class<AFa1uSDK> cls3;
        Class<AFa1uSDK> cls4;
        int min;
        Class cls5;
        Throwable th3;
        Object newInstance;
        byte[] bArr2;
        Throwable cause3;
        Class<AFa1uSDK> cls6;
        int i9;
        char c4;
        boolean z10;
        char c5;
        boolean z11;
        Class<AFa1uSDK> cls7 = AFa1uSDK.class;
        init$0();
        getProductId = -7759472570103191783L;
        getPurchaseType = -7;
        afLogForce = new HashMap();
        afRDLog = new HashMap();
        try {
            byte[] bArr3 = $$a;
            String $$c = $$c((byte) (-bArr3[436]), (short) 879, bArr3[309]);
            String $$c2 = afErrorLogForExcManagerOnly == null ? $$c((byte) (-bArr3[436]), (short) 911, bArr3[79]) : null;
            try {
                int i10 = $$b;
                obj = Class.forName($$c((byte) ((i10 & (-4)) + (i10 | (-4))), (short) 671, bArr3[590])).getMethod($$c((byte) (-bArr3[436]), bArr3[63], bArr3[118]), null).invoke(null, null);
            } catch (Exception unused) {
                obj = null;
            }
            try {
                byte[] bArr4 = $$a;
                obj = Class.forName($$c((byte) ($$b - 4), (short) 387, bArr4[6])).getMethod($$c(bArr4[425], (short) 757, bArr4[341]), null).invoke(null, null);
            } catch (Exception unused2) {
            }
            if (obj != null) {
                try {
                    Class<?> cls8 = obj.getClass();
                    byte b4 = $$a[425];
                    invoke = cls8.getMethod($$c(b4, (short) ((b4 & 128) | (b4 ^ 128)), r7[67]), null).invoke(obj, null);
                } catch (Exception unused3) {
                    invoke = null;
                    if (obj != null) {
                        try {
                            Class<?> cls9 = obj.getClass();
                            byte[] bArr5 = $$a;
                            invoke2 = cls9.getMethod($$c(bArr5[425], (short) 277, bArr5[182]), null).invoke(obj, null);
                        } catch (Exception unused4) {
                            invoke2 = null;
                            if (obj != null) {
                            }
                            invoke3 = null;
                            char c6 = '\n';
                            if (invoke == null) {
                            }
                            if (invoke3 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr6 = $$a;
                            short s4 = (short) 777;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr6[10], s4, bArr6[35])), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = invoke3;
                            objArr[4] = invoke2;
                            objArr[5] = invoke;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[0] = false;
                            zArr3[1] = false;
                            zArr3[2] = true;
                            zArr3[3] = true;
                            zArr3[4] = false;
                            zArr3[5] = true;
                            zArr3[6] = true;
                            Class<?> cls10 = Class.forName($$c((byte) ($$b - 4), (short) 97, bArr6[315]));
                            byte b5 = bArr6[511];
                            i9 = cls10.getDeclaredField($$c(b5, (short) ((b5 & 533) | (b5 ^ 533)), bArr6[41])).getInt(cls10);
                            if (i9 < 34) {
                            }
                            if (i9 != 29) {
                            }
                            c4 = 0;
                            z10 = false;
                            zArr3[c4] = z10;
                            if (i9 >= 21) {
                            }
                            zArr3[c5] = z11;
                            zArr3[4] = i9 >= 21;
                            z5 = false;
                            i2 = 0;
                            while (!z5) {
                            }
                        }
                        if (obj != null) {
                            try {
                                Class<?> cls11 = obj.getClass();
                                byte[] bArr7 = $$a;
                                invoke3 = cls11.getMethod($$c(bArr7[425], (short) 204, bArr7[67]), null).invoke(obj, null);
                                int i11 = $10;
                                $11 = ((i11 & 125) + (i11 | 125)) % 128;
                            } catch (Exception unused5) {
                                invoke3 = null;
                                char c62 = '\n';
                                if (invoke == null) {
                                }
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr62 = $$a;
                                short s42 = (short) 777;
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr62[10], s42, bArr62[35])), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[3] = invoke3;
                                objArr[4] = invoke2;
                                objArr[5] = invoke;
                                objArr[6] = invoke3;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[7];
                                zArr3[0] = false;
                                zArr3[1] = false;
                                zArr3[2] = true;
                                zArr3[3] = true;
                                zArr3[4] = false;
                                zArr3[5] = true;
                                zArr3[6] = true;
                                Class<?> cls102 = Class.forName($$c((byte) ($$b - 4), (short) 97, bArr62[315]));
                                byte b52 = bArr62[511];
                                i9 = cls102.getDeclaredField($$c(b52, (short) ((b52 & 533) | (b52 ^ 533)), bArr62[41])).getInt(cls102);
                                if (i9 < 34) {
                                }
                                if (i9 != 29) {
                                }
                                c4 = 0;
                                z10 = false;
                                zArr3[c4] = z10;
                                if (i9 >= 21) {
                                }
                                zArr3[c5] = z11;
                                zArr3[4] = i9 >= 21;
                                z5 = false;
                                i2 = 0;
                                while (!z5) {
                                }
                            }
                            char c622 = '\n';
                            if (invoke == null) {
                                if ($$c2 == null) {
                                    invoke = null;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    byte[] bArr8 = $$a;
                                    sb2.append($$c(bArr8[41], (short) 556, bArr8[67]));
                                    sb2.append($$c2);
                                    try {
                                        invoke = Class.forName($$c(bArr8[10], (short) 777, bArr8[35])).getDeclaredConstructor(String.class).newInstance(sb2.toString());
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 == null) {
                                            throw th4;
                                        }
                                        throw cause4;
                                    }
                                }
                            }
                            if (invoke3 == null) {
                                $10 = ($11 + 35) % 128;
                            } else {
                                byte[] bArr9 = $$a;
                                try {
                                    try {
                                        invoke3 = Class.forName($$c(bArr9[10], (short) 777, bArr9[35])).getDeclaredConstructor(String.class).newInstance(Class.forName($$c(bArr9[10], bArr9[538], bArr9[13])).getMethod($$c(bArr9[425], (short) 647, bArr9[67]), String.class).invoke(null, $$c(bArr9[10], (short) 634, bArr9[17])));
                                    } catch (Throwable th5) {
                                        Throwable cause5 = th5.getCause();
                                        if (cause5 == null) {
                                            throw th5;
                                        }
                                        throw cause5;
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause6 = th6.getCause();
                                    if (cause6 == null) {
                                        throw th6;
                                    }
                                    throw cause6;
                                }
                            }
                            if (invoke2 == null && invoke != null) {
                                int i12 = $10;
                                $11 = ((i12 ^ 31) + ((i12 & 31) << 1)) % 128;
                                String $$c3 = $$c((byte) (-$$a[436]), (short) 237, r7[4]);
                                $10 = ($11 + 71) % 128;
                                try {
                                    short s5 = (short) 777;
                                    invoke2 = Class.forName($$c(r7[10], s5, r7[35])).getDeclaredConstructor(Class.forName($$c(r7[10], s5, r7[35])), String.class).newInstance(invoke, $$c3);
                                } catch (Throwable th7) {
                                    Throwable cause7 = th7.getCause();
                                    if (cause7 == null) {
                                        throw th7;
                                    }
                                    throw cause7;
                                }
                            }
                            byte[] bArr622 = $$a;
                            short s422 = (short) 777;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr622[10], s422, bArr622[35])), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = invoke3;
                            objArr[4] = invoke2;
                            objArr[5] = invoke;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[0] = false;
                            zArr3[1] = false;
                            zArr3[2] = true;
                            zArr3[3] = true;
                            zArr3[4] = false;
                            zArr3[5] = true;
                            zArr3[6] = true;
                            Class<?> cls1022 = Class.forName($$c((byte) ($$b - 4), (short) 97, bArr622[315]));
                            byte b522 = bArr622[511];
                            i9 = cls1022.getDeclaredField($$c(b522, (short) ((b522 & 533) | (b522 ^ 533)), bArr622[41])).getInt(cls1022);
                            z4 = i9 < 34;
                            if (i9 != 29 && i9 >= 26) {
                                c4 = 0;
                                z10 = true;
                            } else {
                                c4 = 0;
                                z10 = false;
                            }
                            zArr3[c4] = z10;
                            if (i9 >= 21) {
                                $11 = ($10 + 109) % 128;
                                c5 = 1;
                                z11 = true;
                            } else {
                                c5 = 1;
                                z11 = false;
                            }
                            zArr3[c5] = z11;
                            zArr3[4] = i9 >= 21;
                            z5 = false;
                            i2 = 0;
                            while (!z5 && i2 < 9) {
                                if (zArr3[i2]) {
                                    z6 = z5;
                                    str = $$c;
                                    z7 = z4;
                                    zArr4 = zArr;
                                    zArr5 = zArr2;
                                    r48 = i2;
                                    objArr2 = objArr;
                                    zArr6 = zArr3;
                                    bArr = cls7;
                                } else {
                                    try {
                                        z8 = zArr[i2];
                                        obj3 = objArr[i2];
                                        z9 = zArr2[i2];
                                        if (z8) {
                                            if (obj3 != null) {
                                                try {
                                                    z6 = z5;
                                                    str = $$c;
                                                    try {
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        Throwable th9 = th;
                                                        try {
                                                            Throwable cause8 = th9.getCause();
                                                            if (cause8 == null) {
                                                                throw th9;
                                                            }
                                                            throw cause8;
                                                        } catch (Throwable th10) {
                                                            obj2 = th10;
                                                            cls6 = cls7;
                                                            z7 = z4;
                                                            zArr4 = zArr;
                                                            zArr5 = zArr2;
                                                            i5 = i2;
                                                            objArr2 = objArr;
                                                            zArr6 = zArr3;
                                                            cls = cls6;
                                                            bArr = cls;
                                                            r48 = i5;
                                                            while (i4 < 7) {
                                                            }
                                                            $10 = ($11 + 61) % 128;
                                                            try {
                                                                throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                            } catch (Throwable th11) {
                                                                Throwable cause9 = th11.getCause();
                                                                if (cause9 == null) {
                                                                    throw th11;
                                                                }
                                                                throw cause9;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    z6 = z5;
                                                    str = $$c;
                                                }
                                            } else {
                                                z6 = z5;
                                                str = $$c;
                                            }
                                            try {
                                                StringBuilder sb3 = new StringBuilder();
                                                byte[] bArr10 = $$a;
                                                zArr4 = zArr;
                                                try {
                                                    sb3.append($$c(bArr10[757], (short) 331, bArr10[28]));
                                                    sb3.append(obj3);
                                                    byte b6 = bArr10[14];
                                                    byte b7 = b6;
                                                    zArr5 = zArr2;
                                                    try {
                                                        sb3.append($$c(b7, (short) ((b7 & 217) | (b7 ^ 217)), b6));
                                                        String sb4 = sb3.toString();
                                                        int i13 = $11;
                                                        $10 = ((i13 & 21) + (i13 | 21)) % 128;
                                                        try {
                                                            throw ((Throwable) Class.forName($$c(bArr10[10], (short) 732, (byte) (-bArr10[45]))).getDeclaredConstructor(String.class).newInstance(sb4));
                                                        } catch (Throwable th13) {
                                                            Throwable cause10 = th13.getCause();
                                                            if (cause10 == null) {
                                                                throw th13;
                                                            }
                                                            throw cause10;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        obj2 = th;
                                                        cls6 = cls7;
                                                        z7 = z4;
                                                        i5 = i2;
                                                        objArr2 = objArr;
                                                        zArr6 = zArr3;
                                                        cls = cls6;
                                                        bArr = cls;
                                                        r48 = i5;
                                                        while (i4 < 7) {
                                                        }
                                                        $10 = ($11 + 61) % 128;
                                                        throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    zArr5 = zArr2;
                                                    obj2 = th;
                                                    cls6 = cls7;
                                                    z7 = z4;
                                                    i5 = i2;
                                                    objArr2 = objArr;
                                                    zArr6 = zArr3;
                                                    cls = cls6;
                                                    bArr = cls;
                                                    r48 = i5;
                                                    while (i4 < 7) {
                                                    }
                                                    $10 = ($11 + 61) % 128;
                                                    throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                zArr4 = zArr;
                                            }
                                        } else {
                                            z6 = z5;
                                            str = $$c;
                                        }
                                        zArr4 = zArr;
                                        zArr5 = zArr2;
                                    } catch (Throwable th17) {
                                        th = th17;
                                        z6 = z5;
                                        str = $$c;
                                        z7 = z4;
                                        zArr4 = zArr;
                                        zArr5 = zArr2;
                                        r48 = i2;
                                        objArr2 = objArr;
                                        zArr6 = zArr3;
                                        bArr = cls7;
                                    }
                                    if (z8) {
                                        try {
                                            random = new Random();
                                        } catch (Throwable th18) {
                                            th = th18;
                                            objArr2 = objArr;
                                        }
                                        try {
                                            random.setSeed(((Long) Class.forName($$c(r6[10], r6[538], r6[13])).getMethod($$c((byte) (-$$a[436]), (short) 792, r6[526]), null).invoke(null, null)).longValue() ^ (-1617165123));
                                            Object obj11 = null;
                                            Object obj12 = null;
                                            Object obj13 = null;
                                            obj4 = null;
                                            Object obj14 = r48;
                                            while (obj11 == null) {
                                                if (obj12 == null) {
                                                    obj8 = obj11;
                                                    i6 = 6;
                                                } else if (obj13 == null) {
                                                    obj8 = obj11;
                                                    i6 = 5;
                                                } else if (obj4 == null) {
                                                    obj8 = obj11;
                                                    i6 = 4;
                                                } else {
                                                    obj8 = obj11;
                                                    i6 = 3;
                                                }
                                                objArr2 = objArr;
                                                try {
                                                    StringBuilder sb5 = new StringBuilder(((i6 | 1) << 1) - (i6 ^ 1));
                                                    sb5.append('.');
                                                    int i14 = 0;
                                                    while (i14 < i6) {
                                                        int i15 = $10;
                                                        int i16 = i6;
                                                        int i17 = (i15 & 97) + (i15 | 97);
                                                        zArr6 = zArr3;
                                                        $11 = i17 % 128;
                                                        if (i17 % 2 == 0) {
                                                            try {
                                                                int i18 = 88 / 0;
                                                                if (z9) {
                                                                    int nextInt = random.nextInt(26);
                                                                    if (random.nextBoolean()) {
                                                                        i7 = 64 - (~nextInt);
                                                                    } else {
                                                                        int i19 = -(-nextInt);
                                                                        i7 = ((i19 | 96) << 1) - (i19 ^ 96);
                                                                    }
                                                                    sb5.append((char) i7);
                                                                }
                                                                sb5.append((char) (random.nextInt(12) + 8192));
                                                            } catch (Throwable th19) {
                                                                th = th19;
                                                                obj2 = th;
                                                                cls = cls7;
                                                                z7 = z4;
                                                                i5 = i2;
                                                                bArr = cls;
                                                                r48 = i5;
                                                                while (i4 < 7) {
                                                                }
                                                                $10 = ($11 + 61) % 128;
                                                                throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                            }
                                                        }
                                                        int i20 = i14 - 81;
                                                        i14 = (i20 | 82) + (i20 & 82);
                                                        zArr3 = zArr6;
                                                        i6 = i16;
                                                    }
                                                    zArr6 = zArr3;
                                                    sb = sb5.toString();
                                                } catch (Throwable th20) {
                                                    th = th20;
                                                    zArr6 = zArr3;
                                                    obj2 = th;
                                                    cls = cls7;
                                                    z7 = z4;
                                                    i5 = i2;
                                                    bArr = cls;
                                                    r48 = i5;
                                                    for (i4 = (r48 == true ? 1 : 0) + 1; i4 < 7; i4++) {
                                                        int i21 = $11;
                                                        int i22 = (i21 & 31) + (i21 | 31);
                                                        $10 = i22 % 128;
                                                        if (i22 % 2 != 0) {
                                                            int i23 = 92 / 0;
                                                            if (zArr6[i4]) {
                                                                afErrorLogForExcManagerOnly = null;
                                                                AFPurchaseDetails = null;
                                                                c622 = '\n';
                                                            }
                                                        } else {
                                                            if (zArr6[i4]) {
                                                                afErrorLogForExcManagerOnly = null;
                                                                AFPurchaseDetails = null;
                                                                c622 = '\n';
                                                            }
                                                        }
                                                        int i24 = r48 + 30;
                                                        cls7 = bArr;
                                                        i2 = ((i24 & (-29)) << 1) + (i24 ^ (-29));
                                                        zArr = zArr4;
                                                        z5 = z6;
                                                        $$c = str;
                                                        zArr2 = zArr5;
                                                        zArr3 = zArr6;
                                                        objArr = objArr2;
                                                        z4 = z7;
                                                    }
                                                    $10 = ($11 + 61) % 128;
                                                    throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                }
                                                if (obj12 == null) {
                                                    try {
                                                        Object[] objArr3 = {obj3, sb};
                                                        byte[] bArr11 = $$a;
                                                        obj12 = Class.forName($$c(bArr11[10], s422, bArr11[35])).getDeclaredConstructor(Class.forName($$c(bArr11[10], s422, bArr11[35])), String.class).newInstance(objArr3);
                                                    } catch (Throwable th21) {
                                                        Throwable cause11 = th21.getCause();
                                                        if (cause11 == null) {
                                                            throw th21;
                                                        }
                                                        throw cause11;
                                                    }
                                                } else {
                                                    if (obj13 != null) {
                                                        if (obj4 == null) {
                                                            $11 = ($10 + 71) % 128;
                                                            try {
                                                                Object[] objArr4 = {obj3, sb};
                                                                byte[] bArr12 = $$a;
                                                                obj4 = Class.forName($$c(bArr12[10], s422, bArr12[35])).getDeclaredConstructor(Class.forName($$c(bArr12[10], s422, bArr12[35])), String.class).newInstance(objArr4);
                                                            } catch (Throwable th22) {
                                                                Throwable cause12 = th22.getCause();
                                                                if (cause12 == null) {
                                                                    throw th22;
                                                                }
                                                                throw cause12;
                                                            }
                                                        } else {
                                                            try {
                                                                try {
                                                                    Object[] objArr5 = {obj3, sb};
                                                                    byte[] bArr13 = $$a;
                                                                    random2 = random;
                                                                    Object newInstance2 = Class.forName($$c(bArr13[10], s422, bArr13[35])).getDeclaredConstructor(Class.forName($$c(bArr13[10], s422, bArr13[35])), String.class).newInstance(objArr5);
                                                                    try {
                                                                        byte b8 = bArr13[10];
                                                                        int i25 = $$b;
                                                                        Object obj15 = obj12;
                                                                        obj9 = obj3;
                                                                        Object obj16 = obj13;
                                                                        try {
                                                                            Class.forName($$c(bArr13[10], (short) ((i25 ^ 642) | (i25 & 642)), bArr13[315])).getMethod($$c((byte) (-bArr13[436]), (short) 605, bArr13[28]), null).invoke(Class.forName($$c(b8, (short) ((i25 ^ 642) | (i25 & 642)), bArr13[315])).getDeclaredConstructor(Class.forName($$c(bArr13[10], s422, bArr13[35]))).newInstance(newInstance2), null);
                                                                            obj11 = newInstance2;
                                                                            obj12 = obj15;
                                                                            obj13 = obj16;
                                                                            zArr3 = zArr6;
                                                                            random = random2;
                                                                            objArr = objArr2;
                                                                            obj3 = obj9;
                                                                            obj14 = obj9;
                                                                        } catch (Throwable th23) {
                                                                            Throwable cause13 = th23.getCause();
                                                                            if (cause13 == null) {
                                                                                throw th23;
                                                                            }
                                                                            throw cause13;
                                                                        }
                                                                    } catch (Throwable th24) {
                                                                        Throwable cause14 = th24.getCause();
                                                                        if (cause14 == null) {
                                                                            throw th24;
                                                                        }
                                                                        throw cause14;
                                                                    }
                                                                } catch (Exception e4) {
                                                                    StringBuilder sb6 = new StringBuilder();
                                                                    byte[] bArr14 = $$a;
                                                                    sb6.append($$c(bArr14[757], (short) 788, bArr14[28]));
                                                                    sb6.append(random);
                                                                    byte b9 = bArr14[14];
                                                                    byte b10 = b9;
                                                                    sb6.append($$c(b10, (short) (b10 | 217), b9));
                                                                    try {
                                                                        throw ((Throwable) Class.forName($$c(bArr14[10], (short) 732, (byte) (-bArr14[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb6.toString(), e4));
                                                                    } catch (Throwable th25) {
                                                                        Throwable cause15 = th25.getCause();
                                                                        if (cause15 == null) {
                                                                            throw th25;
                                                                        }
                                                                        throw cause15;
                                                                    }
                                                                }
                                                            } catch (Throwable th26) {
                                                                Throwable cause16 = th26.getCause();
                                                                if (cause16 == null) {
                                                                    throw th26;
                                                                }
                                                                throw cause16;
                                                            }
                                                        }
                                                        th = th19;
                                                        obj2 = th;
                                                        cls = cls7;
                                                        z7 = z4;
                                                        i5 = i2;
                                                        bArr = cls;
                                                        r48 = i5;
                                                        while (i4 < 7) {
                                                        }
                                                        $10 = ($11 + 61) % 128;
                                                        throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                    }
                                                    try {
                                                        Object[] objArr6 = {obj3, sb};
                                                        byte[] bArr15 = $$a;
                                                        obj13 = Class.forName($$c(bArr15[10], s422, bArr15[35])).getDeclaredConstructor(Class.forName($$c(bArr15[10], s422, bArr15[35])), String.class).newInstance(objArr6);
                                                    } catch (Throwable th27) {
                                                        Throwable cause17 = th27.getCause();
                                                        if (cause17 == null) {
                                                            throw th27;
                                                        }
                                                        throw cause17;
                                                    }
                                                }
                                                random2 = random;
                                                obj9 = obj3;
                                                obj11 = obj8;
                                                zArr3 = zArr6;
                                                random = random2;
                                                objArr = objArr2;
                                                obj3 = obj9;
                                                obj14 = obj9;
                                            }
                                            obj5 = obj11;
                                            obj6 = obj13;
                                            objArr2 = objArr;
                                            zArr6 = zArr3;
                                            obj7 = obj12;
                                            r48 = obj14;
                                        } catch (Throwable th28) {
                                            Throwable cause18 = th28.getCause();
                                            if (cause18 == null) {
                                                throw th28;
                                            }
                                            throw cause18;
                                        }
                                    } else {
                                        objArr2 = objArr;
                                        zArr6 = zArr3;
                                        obj7 = null;
                                        obj4 = null;
                                        obj5 = null;
                                        obj6 = null;
                                        r48 = r48;
                                    }
                                    try {
                                        byte[] bArr16 = new byte[7796];
                                        bArr = $$a;
                                        try {
                                            Object[] objArr7 = {cls7.getResourceAsStream($$c((byte) bArr[41], (short) 609, (byte) bArr[590]))};
                                            short s6 = (short) 443;
                                            Class<?> cls12 = Class.forName($$c((byte) bArr[10], s6, (byte) bArr[337]));
                                            byte b11 = (byte) bArr[10];
                                            Object obj17 = obj7;
                                            Object obj18 = obj4;
                                            Object newInstance3 = cls12.getDeclaredConstructor(Class.forName($$c(b11, (short) ((b11 & 916) | (b11 ^ 916)), (byte) (-bArr[45])))).newInstance(objArr7);
                                            try {
                                                Class.forName($$c((byte) bArr[10], s6, (byte) bArr[337])).getMethod($$c((byte) bArr[486], (short) 182, (byte) bArr[115]), byte[].class).invoke(newInstance3, bArr16);
                                                $11 = ($10 + 121) % 128;
                                                try {
                                                    bArr = Class.forName($$c((byte) bArr[10], s6, (byte) bArr[337])).getMethod($$c((byte) (-bArr[436]), (short) 605, (byte) bArr[28]), null);
                                                    bArr.invoke(newInstance3, null);
                                                    bArr = 20;
                                                    int i26 = 7749;
                                                    String str3 = str;
                                                    Class cls13 = null;
                                                    while (true) {
                                                        int i27 = ((bArr | 104) << 1) - (bArr ^ 104);
                                                        byte b12 = bArr16[(bArr & 7775) + (bArr | 7775)];
                                                        bArr16[i27] = (byte) ((b12 ^ (-42)) + ((b12 & (-42)) << 1));
                                                        int length = bArr16.length;
                                                        int i28 = -bArr;
                                                        try {
                                                            Object[] objArr8 = {bArr16, Integer.valueOf((int) bArr), Integer.valueOf((length & i28) + (length | i28))};
                                                            byte[] bArr17 = $$a;
                                                            byte b13 = bArr17[10];
                                                            int i29 = $$b;
                                                            int i30 = i26;
                                                            r48 = i2;
                                                            try {
                                                                Class<?> cls14 = Class.forName($$c(b13, (short) (i29 << 1), bArr17[3]));
                                                                Class cls15 = Integer.TYPE;
                                                                InputStream inputStream2 = (InputStream) cls14.getDeclaredConstructor(byte[].class, cls15, cls15).newInstance(objArr8);
                                                                try {
                                                                    Object obj19 = afErrorLogForExcManagerOnly;
                                                                    if (obj19 == null) {
                                                                        $11 = ($10 + 111) % 128;
                                                                        try {
                                                                            int i31 = 0 - (~(-(-((Integer) Class.forName($$c((byte) (i29 - 4), (short) 471, bArr17[341])).getMethod($$c(bArr17[401], (short) 524, bArr17[526]), String.class).invoke(null, "")).intValue())));
                                                                            try {
                                                                                int i32 = -(-View.MeasureSpec.getMode(0));
                                                                                int i33 = ((i32 | (-1672487143)) << 1) - (i32 ^ (-1672487143));
                                                                                long j4 = getProductId;
                                                                                str2 = str3;
                                                                                z7 = false;
                                                                                inputStream = new AFj1lSDK(inputStream2, new int[]{((int) (j4 >>> 32)) ^ i33, ((int) j4) ^ i33}, null, getPurchaseType, false, i31);
                                                                                i8 = bArr;
                                                                                cls2 = cls13;
                                                                            } catch (Throwable th29) {
                                                                                obj2 = th29;
                                                                                cls = cls7;
                                                                                z7 = z4;
                                                                                i5 = r48;
                                                                                bArr = cls;
                                                                                r48 = i5;
                                                                                while (i4 < 7) {
                                                                                }
                                                                                $10 = ($11 + 61) % 128;
                                                                                throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                                            }
                                                                        } catch (Throwable th30) {
                                                                            Throwable cause19 = th30.getCause();
                                                                            if (cause19 == null) {
                                                                                throw th30;
                                                                            }
                                                                            throw cause19;
                                                                        }
                                                                    } else {
                                                                        str2 = str3;
                                                                        Class cls16 = cls13;
                                                                        int i34 = $11;
                                                                        $10 = ((i34 ^ 79) + ((i34 & 79) << 1)) % 128;
                                                                        try {
                                                                            int intValue = (((Integer) Class.forName($$c((byte) (((i29 | (-4)) << 1) - (i29 ^ (-4))), bArr17[425], bArr17[118])).getMethod($$c(bArr17[824], (short) (-bArr17[436]), bArr17[28]), null).invoke(null, null)).intValue() >> 22) + 4;
                                                                            try {
                                                                                byte[] bArr18 = {76, -30, 101, 13, -71, -69, 18, -67, 113, 60, 34, -33, -113, 100, -12, -7};
                                                                                int i35 = -(-View.MeasureSpec.getMode(0));
                                                                                try {
                                                                                    Object[] objArr9 = {inputStream2, Integer.valueOf(intValue), bArr18, Integer.valueOf(((i35 | 768756660) << 1) - (i35 ^ 768756660))};
                                                                                    Class<?> cls17 = Class.forName($$c((byte) (-bArr17[436]), (short) 808, bArr17[309]), true, (ClassLoader) AFPurchaseDetails);
                                                                                    cls2 = cls16;
                                                                                    String $$c4 = $$c((byte) 77, (short) 696, bArr17[41]);
                                                                                    byte b14 = bArr17[10];
                                                                                    i8 = bArr;
                                                                                    bArr = cls17.getMethod($$c4, Class.forName($$c(b14, (short) (b14 | 916), (byte) (-bArr17[45]))), cls15, byte[].class, cls15).invoke(obj19, objArr9);
                                                                                    inputStream = (InputStream) bArr;
                                                                                } catch (Throwable th31) {
                                                                                    Throwable cause20 = th31.getCause();
                                                                                    if (cause20 == null) {
                                                                                        throw th31;
                                                                                    }
                                                                                    throw cause20;
                                                                                }
                                                                            } catch (Throwable th32) {
                                                                                th = th32;
                                                                                bArr = cls7;
                                                                                z7 = z4;
                                                                                obj2 = th;
                                                                                bArr = bArr;
                                                                                r48 = r48;
                                                                                while (i4 < 7) {
                                                                                }
                                                                                $10 = ($11 + 61) % 128;
                                                                                throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                                            }
                                                                        } catch (Throwable th33) {
                                                                            Throwable cause21 = th33.getCause();
                                                                            if (cause21 == null) {
                                                                                throw th33;
                                                                            }
                                                                            throw cause21;
                                                                        }
                                                                    }
                                                                    bArr = 20;
                                                                    try {
                                                                        Object[] objArr10 = {Long.valueOf(20)};
                                                                        byte b15 = bArr17[10];
                                                                        bArr = (Long) Class.forName($$c(b15, (short) ((b15 ^ 916) | (b15 & 916)), (byte) (-bArr17[45]))).getMethod($$c((byte) ((-2) - (bArr17[334] ^ (-1))), (short) 540, bArr17[46]), Long.TYPE).invoke(inputStream, objArr10);
                                                                        bArr.getClass();
                                                                        if (z8) {
                                                                            try {
                                                                                Object obj20 = afErrorLogForExcManagerOnly;
                                                                                if (obj20 == null) {
                                                                                    int i36 = $11;
                                                                                    $10 = ((i36 ^ 5) + ((i36 & 5) << 1)) % 128;
                                                                                    obj10 = obj17;
                                                                                } else {
                                                                                    obj10 = obj6;
                                                                                }
                                                                                Object obj21 = obj20 == null ? obj18 : obj5;
                                                                                try {
                                                                                    Object newInstance4 = Class.forName($$c(bArr17[10], (short) ((i29 ^ 642) | (i29 & 642)), bArr17[315])).getDeclaredConstructor(Class.forName($$c(bArr17[10], s422, bArr17[35]))).newInstance(obj10);
                                                                                    if (z4) {
                                                                                        try {
                                                                                            ((Boolean) Class.forName($$c(bArr17[10], s422, bArr17[35])).getMethod($$c((byte) (bArr17[334] - 1), (short) 408, bArr17[67]), null).invoke(obj10, null)).getClass();
                                                                                        } catch (Throwable th34) {
                                                                                            try {
                                                                                                Throwable cause22 = th34.getCause();
                                                                                                if (cause22 == null) {
                                                                                                    throw th34;
                                                                                                }
                                                                                                throw cause22;
                                                                                            } catch (Exception e5) {
                                                                                                exc = e5;
                                                                                                StringBuilder sb7 = new StringBuilder();
                                                                                                byte[] bArr19 = $$a;
                                                                                                sb7.append($$c(bArr19[757], (short) 335, bArr19[28]));
                                                                                                sb7.append(obj10);
                                                                                                byte b16 = bArr19[14];
                                                                                                byte b17 = b16;
                                                                                                sb7.append($$c(b17, (short) ((b17 ^ 217) | (b17 & 217)), b16));
                                                                                                try {
                                                                                                    throw ((Throwable) Class.forName($$c(bArr19[10], (short) 732, (byte) (-bArr19[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb7.toString(), exc));
                                                                                                } catch (Throwable th35) {
                                                                                                    Throwable cause23 = th35.getCause();
                                                                                                    if (cause23 == null) {
                                                                                                        throw th35;
                                                                                                    }
                                                                                                    throw cause23;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int i37 = 1024;
                                                                                    try {
                                                                                        byte[] bArr20 = new byte[1024];
                                                                                        int i38 = i30;
                                                                                        while (true) {
                                                                                            if (i38 <= 0) {
                                                                                                cls3 = cls7;
                                                                                                z7 = z4;
                                                                                                break;
                                                                                            }
                                                                                            int i39 = $11 + 7;
                                                                                            $10 = i39 % 128;
                                                                                            if (i39 % 2 != 0) {
                                                                                                try {
                                                                                                    min = Math.min(i37, i38);
                                                                                                } catch (Throwable th36) {
                                                                                                    th = th36;
                                                                                                    try {
                                                                                                        byte[] bArr21 = $$a;
                                                                                                    } catch (Throwable th37) {
                                                                                                        th = th37;
                                                                                                    }
                                                                                                    try {
                                                                                                        short s7 = (short) 566;
                                                                                                        try {
                                                                                                            ((Boolean) Class.forName($$c(bArr21[10], s422, bArr21[35])).getMethod($$c((byte) (-bArr21[8]), s7, bArr21[65]), null).invoke(obj10, null)).getClass();
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        ((Boolean) Class.forName($$c(bArr21[10], s422, bArr21[35])).getMethod($$c((byte) (-bArr21[8]), s7, bArr21[65]), null).invoke(obj21, null)).getClass();
                                                                                                                        throw th;
                                                                                                                    } catch (Throwable th38) {
                                                                                                                        th = th38;
                                                                                                                        Throwable th39 = th;
                                                                                                                        cause2 = th39.getCause();
                                                                                                                        if (cause2 != null) {
                                                                                                                            throw th39;
                                                                                                                        }
                                                                                                                        throw cause2;
                                                                                                                    }
                                                                                                                } catch (Throwable th40) {
                                                                                                                    th = th40;
                                                                                                                    Throwable th392 = th;
                                                                                                                    cause2 = th392.getCause();
                                                                                                                    if (cause2 != null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (Throwable th41) {
                                                                                                                th = th41;
                                                                                                            }
                                                                                                        } catch (Throwable th42) {
                                                                                                            th = th42;
                                                                                                            Throwable th43 = th;
                                                                                                            cause = th43.getCause();
                                                                                                            if (cause != null) {
                                                                                                                throw th43;
                                                                                                            }
                                                                                                            throw cause;
                                                                                                        }
                                                                                                    } catch (Throwable th44) {
                                                                                                        th = th44;
                                                                                                        Throwable th432 = th;
                                                                                                        cause = th432.getCause();
                                                                                                        if (cause != null) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                try {
                                                                                                    min = Math.min(i37, i38);
                                                                                                } catch (Throwable th45) {
                                                                                                    th = th45;
                                                                                                    cls3 = cls7;
                                                                                                    th = th;
                                                                                                    byte[] bArr212 = $$a;
                                                                                                    short s72 = (short) 566;
                                                                                                    ((Boolean) Class.forName($$c(bArr212[10], s422, bArr212[35])).getMethod($$c((byte) (-bArr212[8]), s72, bArr212[65]), null).invoke(obj10, null)).getClass();
                                                                                                    ((Boolean) Class.forName($$c(bArr212[10], s422, bArr212[35])).getMethod($$c((byte) (-bArr212[8]), s72, bArr212[65]), null).invoke(obj21, null)).getClass();
                                                                                                    throw th;
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                Object[] objArr11 = {bArr20, 0, Integer.valueOf(min)};
                                                                                                byte[] bArr22 = $$a;
                                                                                                byte b18 = bArr22[10];
                                                                                                z7 = z4;
                                                                                                try {
                                                                                                    Class<?> cls18 = Class.forName($$c(b18, (short) (b18 | 916), (byte) (-bArr22[45])));
                                                                                                    cls3 = cls7;
                                                                                                    try {
                                                                                                        String $$c5 = $$c(bArr22[486], (short) 214, bArr22[46]);
                                                                                                        Class cls19 = Integer.TYPE;
                                                                                                        Integer num = (Integer) cls18.getMethod($$c5, byte[].class, cls19, cls19).invoke(inputStream, objArr11);
                                                                                                        int intValue2 = num.intValue();
                                                                                                        if (intValue2 == -1) {
                                                                                                            break;
                                                                                                        }
                                                                                                        $10 = ($11 + 65) % 128;
                                                                                                        try {
                                                                                                            try {
                                                                                                                Object[] objArr12 = {bArr20, 0, num};
                                                                                                                byte[] bArr23 = bArr20;
                                                                                                                Class<?> cls20 = Class.forName($$c(bArr22[10], (short) ($$b | 642), bArr22[315]));
                                                                                                                byte b19 = bArr22[319];
                                                                                                                cls20.getMethod($$c((byte) ((b19 ^ (-1)) + (b19 << 1)), (short) 200, bArr22[28]), byte[].class, cls19, cls19).invoke(newInstance4, objArr12);
                                                                                                                i38 = (i38 - (~(-intValue2))) - 1;
                                                                                                                z4 = z7;
                                                                                                                cls7 = cls3;
                                                                                                                bArr20 = bArr23;
                                                                                                                i37 = 1024;
                                                                                                            } catch (Throwable th46) {
                                                                                                                Throwable cause24 = th46.getCause();
                                                                                                                if (cause24 == null) {
                                                                                                                    throw th46;
                                                                                                                }
                                                                                                                throw cause24;
                                                                                                            }
                                                                                                        } catch (Throwable th47) {
                                                                                                            th = th47;
                                                                                                            th = th;
                                                                                                            byte[] bArr2122 = $$a;
                                                                                                            short s722 = (short) 566;
                                                                                                            ((Boolean) Class.forName($$c(bArr2122[10], s422, bArr2122[35])).getMethod($$c((byte) (-bArr2122[8]), s722, bArr2122[65]), null).invoke(obj10, null)).getClass();
                                                                                                            ((Boolean) Class.forName($$c(bArr2122[10], s422, bArr2122[35])).getMethod($$c((byte) (-bArr2122[8]), s722, bArr2122[65]), null).invoke(obj21, null)).getClass();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (Throwable th48) {
                                                                                                        th = th48;
                                                                                                        Throwable th49 = th;
                                                                                                        Throwable cause25 = th49.getCause();
                                                                                                        if (cause25 == null) {
                                                                                                            throw th49;
                                                                                                        }
                                                                                                        throw cause25;
                                                                                                    }
                                                                                                } catch (Throwable th50) {
                                                                                                    th = th50;
                                                                                                }
                                                                                            } catch (Throwable th51) {
                                                                                                th = th51;
                                                                                            }
                                                                                        }
                                                                                        int i40 = $11;
                                                                                        $10 = ((i40 & 59) + (i40 | 59)) % 128;
                                                                                        try {
                                                                                            byte[] bArr24 = $$a;
                                                                                            byte b20 = bArr24[10];
                                                                                            int i41 = $$b;
                                                                                            try {
                                                                                                try {
                                                                                                    Class.forName($$c(bArr24[10], (short) 840, bArr24[6])).getMethod($$c((byte) (bArr24[334] - 1), (short) 291, bArr24[46]), null).invoke(Class.forName($$c(b20, (short) ((i41 ^ 642) | (i41 & 642)), bArr24[315])).getMethod($$c(bArr24[425], (short) 571, bArr24[28]), null).invoke(newInstance4, null), null);
                                                                                                    try {
                                                                                                        Class.forName($$c(bArr24[10], (short) ((i41 & 642) | (i41 ^ 642)), bArr24[315])).getMethod($$c((byte) (-bArr24[436]), (short) 605, bArr24[28]), null).invoke(newInstance4, null);
                                                                                                        try {
                                                                                                            Method declaredMethod = Class.forName($$c((byte) (-bArr24[8]), (short) 217, bArr24[341])).getDeclaredMethod($$c(bArr24[435], (short) 465, bArr24[41]), String.class, String.class, Integer.TYPE);
                                                                                                            try {
                                                                                                                short s8 = (short) 657;
                                                                                                                Object invoke4 = Class.forName($$c(bArr24[10], s422, bArr24[35])).getMethod($$c(bArr24[425], s8, bArr24[182]), null).invoke(obj10, null);
                                                                                                                int i42 = $10;
                                                                                                                $11 = ((i42 ^ 51) + ((i42 & 51) << 1)) % 128;
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        Object invoke5 = declaredMethod.invoke(null, invoke4, Class.forName($$c(bArr24[10], s422, bArr24[35])).getMethod($$c(bArr24[425], s8, bArr24[182]), null).invoke(obj21, null), 0);
                                                                                                                        bArr = 10;
                                                                                                                        try {
                                                                                                                            short s9 = (short) 566;
                                                                                                                            bArr = (Boolean) Class.forName($$c(bArr24[10], s422, bArr24[35])).getMethod($$c((byte) (-bArr24[8]), s9, bArr24[65]), null).invoke(obj10, null);
                                                                                                                            bArr.getClass();
                                                                                                                            bArr = 10;
                                                                                                                            try {
                                                                                                                                bArr = (Boolean) Class.forName($$c(bArr24[10], s422, bArr24[35])).getMethod($$c((byte) (-bArr24[8]), s9, bArr24[65]), null).invoke(obj21, null);
                                                                                                                                bArr.getClass();
                                                                                                                                try {
                                                                                                                                    if (AFPurchaseDetails == null) {
                                                                                                                                        try {
                                                                                                                                            bArr = cls3;
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    AFPurchaseDetails = Class.class.getMethod($$c(bArr24[425], (short) 543, bArr24[17]), null).invoke(bArr, null);
                                                                                                                                                    cls4 = bArr;
                                                                                                                                                } catch (Throwable th52) {
                                                                                                                                                    th = th52;
                                                                                                                                                    obj2 = th;
                                                                                                                                                    cls = bArr;
                                                                                                                                                    i5 = r48;
                                                                                                                                                    bArr = cls;
                                                                                                                                                    r48 = i5;
                                                                                                                                                    while (i4 < 7) {
                                                                                                                                                    }
                                                                                                                                                    $10 = ($11 + 61) % 128;
                                                                                                                                                    throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th53) {
                                                                                                                                                th = th53;
                                                                                                                                                Throwable th54 = th;
                                                                                                                                                Throwable cause26 = th54.getCause();
                                                                                                                                                if (cause26 == null) {
                                                                                                                                                    throw th54;
                                                                                                                                                }
                                                                                                                                                throw cause26;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th55) {
                                                                                                                                            th = th55;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        cls4 = cls3;
                                                                                                                                    }
                                                                                                                                    bArr = cls4;
                                                                                                                                    if (z8) {
                                                                                                                                        try {
                                                                                                                                            byte[] bArr25 = $$a;
                                                                                                                                            Class<?> cls21 = Class.forName($$c((byte) (-bArr25[8]), (short) 217, bArr25[341]));
                                                                                                                                            byte b21 = bArr25[435];
                                                                                                                                            String $$c6 = $$c(b21, (short) ((b21 ^ 804) | (b21 & 804)), bArr25[115]);
                                                                                                                                            byte b22 = bArr25[10];
                                                                                                                                            Method declaredMethod2 = cls21.getDeclaredMethod($$c6, String.class, Class.forName($$c(b22, (short) ((b22 ^ 302) | (b22 & 302)), bArr25[341])));
                                                                                                                                            declaredMethod2.setAccessible(true);
                                                                                                                                            int i43 = $11;
                                                                                                                                            $10 = ((i43 ^ 33) + ((i43 & 33) << 1)) % 128;
                                                                                                                                            try {
                                                                                                                                                ?? invoke6 = declaredMethod2.invoke(invoke5, str2, Class.class.getMethod($$c(bArr25[425], (short) 543, bArr25[17]), null).invoke(bArr, null));
                                                                                                                                                if (invoke6 != null) {
                                                                                                                                                    cls21.getDeclaredMethod($$c((byte) (-bArr25[436]), (short) 605, bArr25[28]), null).invoke(invoke5, null);
                                                                                                                                                }
                                                                                                                                                cls5 = invoke6;
                                                                                                                                            } catch (Throwable th56) {
                                                                                                                                                Throwable cause27 = th56.getCause();
                                                                                                                                                if (cause27 == null) {
                                                                                                                                                    throw th56;
                                                                                                                                                }
                                                                                                                                                throw cause27;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th57) {
                                                                                                                                            Object th58 = th57;
                                                                                                                                            obj2 = th58;
                                                                                                                                            bArr = bArr;
                                                                                                                                            r48 = r48;
                                                                                                                                            while (i4 < 7) {
                                                                                                                                            }
                                                                                                                                            $10 = ($11 + 61) % 128;
                                                                                                                                            throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        String str4 = str2;
                                                                                                                                        byte[] bArr26 = $$a;
                                                                                                                                        byte b23 = bArr26[10];
                                                                                                                                        Class<?> cls22 = Class.forName($$c(b23, (short) ((b23 ^ 302) | (b23 & 302)), bArr26[341]));
                                                                                                                                        byte b24 = bArr26[435];
                                                                                                                                        Method declaredMethod3 = cls22.getDeclaredMethod($$c(b24, (short) ((b24 ^ 804) | (b24 & 804)), bArr26[115]), String.class);
                                                                                                                                        try {
                                                                                                                                            declaredMethod3.setAccessible(true);
                                                                                                                                            cls5 = declaredMethod3.invoke(invoke5, str4);
                                                                                                                                        } catch (InvocationTargetException e6) {
                                                                                                                                            try {
                                                                                                                                                throw ((Exception) e6.getCause());
                                                                                                                                            } catch (ClassNotFoundException unused6) {
                                                                                                                                                cls5 = null;
                                                                                                                                                if (cls5 != null) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (cls5 != null) {
                                                                                                                                        Constructor declaredConstructor = cls2.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                                        declaredConstructor.setAccessible(true);
                                                                                                                                        afErrorLogForExcManagerOnly = declaredConstructor.newInstance(invoke5, Boolean.valueOf(!z8));
                                                                                                                                        c622 = '\n';
                                                                                                                                        z6 = true;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    cls13 = cls5;
                                                                                                                                    byte[] bArr27 = $$a;
                                                                                                                                    String $$c7 = $$c((byte) (-bArr27[436]), (short) 926, bArr27[309]);
                                                                                                                                    Constructor declaredConstructor2 = cls13.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                                    declaredConstructor2.setAccessible(true);
                                                                                                                                    afErrorLogForExcManagerOnly = declaredConstructor2.newInstance(invoke5, Boolean.valueOf(!z8));
                                                                                                                                    byte[] bArr28 = new byte[11764];
                                                                                                                                    try {
                                                                                                                                        Object[] objArr13 = {bArr.getResourceAsStream($$c(bArr27[41], (short) 418, bArr27[590]))};
                                                                                                                                        short s10 = (short) 443;
                                                                                                                                        Class<?> cls23 = Class.forName($$c(bArr27[10], s10, bArr27[337]));
                                                                                                                                        byte b25 = bArr27[10];
                                                                                                                                        Object newInstance5 = cls23.getDeclaredConstructor(Class.forName($$c(b25, (short) (b25 | 916), (byte) (-bArr27[45])))).newInstance(objArr13);
                                                                                                                                        try {
                                                                                                                                            Class.forName($$c(bArr27[10], s10, bArr27[337])).getMethod($$c(bArr27[486], (short) 182, bArr27[115]), byte[].class).invoke(newInstance5, bArr28);
                                                                                                                                            try {
                                                                                                                                                Class.forName($$c(bArr27[10], s10, bArr27[337])).getMethod($$c((byte) (-bArr27[436]), (short) 605, bArr27[28]), null).invoke(newInstance5, null);
                                                                                                                                                int abs = Math.abs(i8);
                                                                                                                                                i26 = 11719;
                                                                                                                                                str3 = $$c7;
                                                                                                                                                i2 = r48 == true ? 1 : 0;
                                                                                                                                                z4 = z7;
                                                                                                                                                Class<AFa1uSDK> cls24 = bArr;
                                                                                                                                                bArr = abs;
                                                                                                                                                bArr16 = bArr28;
                                                                                                                                                cls7 = cls24;
                                                                                                                                            } catch (Throwable th59) {
                                                                                                                                                Throwable cause28 = th59.getCause();
                                                                                                                                                if (cause28 == null) {
                                                                                                                                                    throw th59;
                                                                                                                                                }
                                                                                                                                                throw cause28;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th60) {
                                                                                                                                            Throwable cause29 = th60.getCause();
                                                                                                                                            if (cause29 == null) {
                                                                                                                                                throw th60;
                                                                                                                                            }
                                                                                                                                            throw cause29;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th61) {
                                                                                                                                        Throwable cause30 = th61.getCause();
                                                                                                                                        if (cause30 == null) {
                                                                                                                                            throw th61;
                                                                                                                                        }
                                                                                                                                        throw cause30;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th62) {
                                                                                                                                    th = th62;
                                                                                                                                    bArr = cls3;
                                                                                                                                    obj2 = th;
                                                                                                                                    cls = bArr;
                                                                                                                                    i5 = r48;
                                                                                                                                    bArr = cls;
                                                                                                                                    r48 = i5;
                                                                                                                                    while (i4 < 7) {
                                                                                                                                    }
                                                                                                                                    $10 = ($11 + 61) % 128;
                                                                                                                                    throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                                                                                                }
                                                                                                                            } catch (Throwable th63) {
                                                                                                                                Throwable cause31 = th63.getCause();
                                                                                                                                if (cause31 == null) {
                                                                                                                                    throw th63;
                                                                                                                                }
                                                                                                                                throw cause31;
                                                                                                                            }
                                                                                                                        } catch (Throwable th64) {
                                                                                                                            Throwable cause32 = th64.getCause();
                                                                                                                            if (cause32 == null) {
                                                                                                                                throw th64;
                                                                                                                            }
                                                                                                                            throw cause32;
                                                                                                                        }
                                                                                                                    } catch (Throwable th65) {
                                                                                                                        Throwable cause33 = th65.getCause();
                                                                                                                        if (cause33 == null) {
                                                                                                                            throw th65;
                                                                                                                        }
                                                                                                                        throw cause33;
                                                                                                                    }
                                                                                                                } catch (Throwable th66) {
                                                                                                                    th2 = th66;
                                                                                                                    th = th2;
                                                                                                                    byte[] bArr21222 = $$a;
                                                                                                                    short s7222 = (short) 566;
                                                                                                                    ((Boolean) Class.forName($$c(bArr21222[10], s422, bArr21222[35])).getMethod($$c((byte) (-bArr21222[8]), s7222, bArr21222[65]), null).invoke(obj10, null)).getClass();
                                                                                                                    ((Boolean) Class.forName($$c(bArr21222[10], s422, bArr21222[35])).getMethod($$c((byte) (-bArr21222[8]), s7222, bArr21222[65]), null).invoke(obj21, null)).getClass();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (Throwable th67) {
                                                                                                                Throwable cause34 = th67.getCause();
                                                                                                                if (cause34 == null) {
                                                                                                                    throw th67;
                                                                                                                }
                                                                                                                throw cause34;
                                                                                                            }
                                                                                                        } catch (Throwable th68) {
                                                                                                            th2 = th68;
                                                                                                            th = th2;
                                                                                                            byte[] bArr212222 = $$a;
                                                                                                            short s72222 = (short) 566;
                                                                                                            ((Boolean) Class.forName($$c(bArr212222[10], s422, bArr212222[35])).getMethod($$c((byte) (-bArr212222[8]), s72222, bArr212222[65]), null).invoke(obj10, null)).getClass();
                                                                                                            ((Boolean) Class.forName($$c(bArr212222[10], s422, bArr212222[35])).getMethod($$c((byte) (-bArr212222[8]), s72222, bArr212222[65]), null).invoke(obj21, null)).getClass();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (Throwable th69) {
                                                                                                        Throwable cause35 = th69.getCause();
                                                                                                        if (cause35 == null) {
                                                                                                            throw th69;
                                                                                                        }
                                                                                                        throw cause35;
                                                                                                    }
                                                                                                } catch (Throwable th70) {
                                                                                                    th = th70;
                                                                                                    Throwable th71 = th;
                                                                                                    Throwable cause36 = th71.getCause();
                                                                                                    if (cause36 == null) {
                                                                                                        throw th71;
                                                                                                    }
                                                                                                    throw cause36;
                                                                                                }
                                                                                            } catch (Throwable th72) {
                                                                                                th = th72;
                                                                                            }
                                                                                        } catch (Throwable th73) {
                                                                                            Throwable cause37 = th73.getCause();
                                                                                            if (cause37 == null) {
                                                                                                throw th73;
                                                                                            }
                                                                                            throw cause37;
                                                                                        }
                                                                                    } catch (Throwable th74) {
                                                                                        th2 = th74;
                                                                                    }
                                                                                } catch (Throwable th75) {
                                                                                    try {
                                                                                        Throwable cause38 = th75.getCause();
                                                                                        if (cause38 == null) {
                                                                                            throw th75;
                                                                                        }
                                                                                        throw cause38;
                                                                                    } catch (Exception e7) {
                                                                                        exc = e7;
                                                                                        StringBuilder sb72 = new StringBuilder();
                                                                                        byte[] bArr192 = $$a;
                                                                                        sb72.append($$c(bArr192[757], (short) 335, bArr192[28]));
                                                                                        sb72.append(obj10);
                                                                                        byte b162 = bArr192[14];
                                                                                        byte b172 = b162;
                                                                                        sb72.append($$c(b172, (short) ((b172 ^ 217) | (b172 & 217)), b162));
                                                                                        throw ((Throwable) Class.forName($$c(bArr192[10], (short) 732, (byte) (-bArr192[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb72.toString(), exc));
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th76) {
                                                                                th = th76;
                                                                                bArr = cls7;
                                                                                z7 = z4;
                                                                            }
                                                                        } else {
                                                                            bArr = cls7;
                                                                            z7 = z4;
                                                                            try {
                                                                                ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                                                                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                                                try {
                                                                                    Class<?> cls25 = Class.forName($$c(bArr17[10], bArr17[14], bArr17[538]));
                                                                                    byte b26 = bArr17[10];
                                                                                    Object newInstance6 = cls25.getDeclaredConstructor(Class.forName($$c(b26, (short) ((b26 ^ 916) | (b26 & 916)), (byte) (-bArr17[45])))).newInstance(zipInputStream);
                                                                                    int i44 = $11 + 43;
                                                                                    $10 = i44 % 128;
                                                                                    if (i44 % 2 != 0) {
                                                                                        try {
                                                                                            byte b27 = bArr17[77];
                                                                                            newInstance = Class.forName($$c(b27, (short) (b27 | 29635), bArr17[10942])).getDeclaredConstructor(null).newInstance(null);
                                                                                            bArr2 = new byte[5428];
                                                                                        } catch (Throwable th77) {
                                                                                            th3 = th77;
                                                                                            cause3 = th3.getCause();
                                                                                            if (cause3 != null) {
                                                                                                throw th3;
                                                                                            }
                                                                                            throw cause3;
                                                                                        }
                                                                                    } else {
                                                                                        try {
                                                                                            byte b28 = bArr17[10];
                                                                                            newInstance = Class.forName($$c(b28, (short) ((b28 ^ 426) | (b28 & 426)), bArr17[757])).getDeclaredConstructor(null).newInstance(null);
                                                                                            bArr2 = new byte[1024];
                                                                                        } catch (Throwable th78) {
                                                                                            th3 = th78;
                                                                                            cause3 = th3.getCause();
                                                                                            if (cause3 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int i45 = 0;
                                                                                    while (true) {
                                                                                        int i46 = $10;
                                                                                        $11 = ((i46 ^ 51) + ((i46 & 51) << 1)) % 128;
                                                                                        try {
                                                                                            byte[] bArr29 = $$a;
                                                                                            Integer num2 = (Integer) Class.forName($$c(bArr29[10], bArr29[14], bArr29[538])).getMethod($$c(bArr29[486], (short) 214, bArr29[46]), byte[].class).invoke(newInstance6, bArr2);
                                                                                            int intValue3 = num2.intValue();
                                                                                            if (intValue3 <= 0) {
                                                                                                break;
                                                                                            }
                                                                                            int i47 = $10;
                                                                                            int i48 = (i47 ^ 51) + ((i47 & 51) << 1);
                                                                                            $11 = i48 % 128;
                                                                                            if (i48 % 2 == 0) {
                                                                                                nextEntry.getSize();
                                                                                                throw null;
                                                                                            }
                                                                                            if (i45 >= nextEntry.getSize()) {
                                                                                                break;
                                                                                            }
                                                                                            try {
                                                                                                Object[] objArr14 = {bArr2, 0, num2};
                                                                                                byte b29 = bArr29[10];
                                                                                                Class<?> cls26 = Class.forName($$c(b29, (short) (b29 | 426), bArr29[757]));
                                                                                                byte b30 = bArr29[319];
                                                                                                String $$c8 = $$c((byte) ((b30 ^ (-1)) + (b30 << 1)), (short) 200, bArr29[28]);
                                                                                                Class cls27 = Integer.TYPE;
                                                                                                cls26.getMethod($$c8, byte[].class, cls27, cls27).invoke(newInstance, objArr14);
                                                                                                i45 = ((i45 & intValue3) << 1) + (i45 ^ intValue3);
                                                                                            } catch (Throwable th79) {
                                                                                                Throwable cause39 = th79.getCause();
                                                                                                if (cause39 == null) {
                                                                                                    throw th79;
                                                                                                }
                                                                                                throw cause39;
                                                                                            }
                                                                                        } catch (Throwable th80) {
                                                                                            Throwable cause40 = th80.getCause();
                                                                                            if (cause40 == null) {
                                                                                                throw th80;
                                                                                            }
                                                                                            throw cause40;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th81) {
                                                                                    Throwable cause41 = th81.getCause();
                                                                                    if (cause41 == null) {
                                                                                        throw th81;
                                                                                    }
                                                                                    throw cause41;
                                                                                }
                                                                            } catch (Throwable th82) {
                                                                                th = th82;
                                                                                obj2 = th;
                                                                                bArr = bArr;
                                                                                r48 = r48;
                                                                                while (i4 < 7) {
                                                                                }
                                                                                $10 = ($11 + 61) % 128;
                                                                                throw ((Throwable) Class.forName($$c(r2[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r2[757], (short) 309, r2[337]), obj2));
                                                                            }
                                                                        }
                                                                    } catch (Throwable th83) {
                                                                        Throwable cause42 = th83.getCause();
                                                                        if (cause42 == null) {
                                                                            throw th83;
                                                                        }
                                                                        throw cause42;
                                                                    }
                                                                } catch (Throwable th84) {
                                                                    th = th84;
                                                                    bArr = cls7;
                                                                    z7 = z4;
                                                                }
                                                            } catch (Throwable th85) {
                                                                th = th85;
                                                                Throwable th86 = th;
                                                                Throwable cause43 = th86.getCause();
                                                                if (cause43 == null) {
                                                                    throw th86;
                                                                }
                                                                throw cause43;
                                                            }
                                                        } catch (Throwable th87) {
                                                            th = th87;
                                                        }
                                                    }
                                                } catch (Throwable th88) {
                                                    Throwable cause44 = th88.getCause();
                                                    if (cause44 == null) {
                                                        throw th88;
                                                    }
                                                    throw cause44;
                                                }
                                            } catch (Throwable th89) {
                                                Throwable cause45 = th89.getCause();
                                                if (cause45 == null) {
                                                    throw th89;
                                                }
                                                throw cause45;
                                            }
                                        } catch (Throwable th90) {
                                            Throwable cause46 = th90.getCause();
                                            if (cause46 == null) {
                                                throw th90;
                                            }
                                            throw cause46;
                                        }
                                    } catch (Throwable th91) {
                                        th = th91;
                                        bArr = cls7;
                                        z7 = z4;
                                        r48 = i2;
                                    }
                                }
                                int i242 = r48 + 30;
                                cls7 = bArr;
                                i2 = ((i242 & (-29)) << 1) + (i242 ^ (-29));
                                zArr = zArr4;
                                z5 = z6;
                                $$c = str;
                                zArr2 = zArr5;
                                zArr3 = zArr6;
                                objArr = objArr2;
                                z4 = z7;
                            }
                            return;
                        }
                        invoke3 = null;
                        char c6222 = '\n';
                        if (invoke == null) {
                        }
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                            int i122 = $10;
                            $11 = ((i122 ^ 31) + ((i122 & 31) << 1)) % 128;
                            String $$c32 = $$c((byte) (-$$a[436]), (short) 237, r7[4]);
                            $10 = ($11 + 71) % 128;
                            short s52 = (short) 777;
                            invoke2 = Class.forName($$c(r7[10], s52, r7[35])).getDeclaredConstructor(Class.forName($$c(r7[10], s52, r7[35])), String.class).newInstance(invoke, $$c32);
                        }
                        byte[] bArr6222 = $$a;
                        short s4222 = (short) 777;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr6222[10], s4222, bArr6222[35])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = invoke3;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[1] = false;
                        zArr3[2] = true;
                        zArr3[3] = true;
                        zArr3[4] = false;
                        zArr3[5] = true;
                        zArr3[6] = true;
                        Class<?> cls10222 = Class.forName($$c((byte) ($$b - 4), (short) 97, bArr6222[315]));
                        byte b5222 = bArr6222[511];
                        i9 = cls10222.getDeclaredField($$c(b5222, (short) ((b5222 & 533) | (b5222 ^ 533)), bArr6222[41])).getInt(cls10222);
                        if (i9 < 34) {
                        }
                        if (i9 != 29) {
                            c4 = 0;
                            z10 = true;
                            zArr3[c4] = z10;
                            if (i9 >= 21) {
                            }
                            zArr3[c5] = z11;
                            zArr3[4] = i9 >= 21;
                            z5 = false;
                            i2 = 0;
                            while (!z5) {
                                if (zArr3[i2]) {
                                }
                                int i2422 = r48 + 30;
                                cls7 = bArr;
                                i2 = ((i2422 & (-29)) << 1) + (i2422 ^ (-29));
                                zArr = zArr4;
                                z5 = z6;
                                $$c = str;
                                zArr2 = zArr5;
                                zArr3 = zArr6;
                                objArr = objArr2;
                                z4 = z7;
                            }
                        }
                        c4 = 0;
                        z10 = false;
                        zArr3[c4] = z10;
                        if (i9 >= 21) {
                        }
                        zArr3[c5] = z11;
                        zArr3[4] = i9 >= 21;
                        z5 = false;
                        i2 = 0;
                        while (!z5) {
                        }
                    }
                    invoke2 = null;
                    if (obj != null) {
                    }
                    invoke3 = null;
                    char c62222 = '\n';
                    if (invoke == null) {
                    }
                    if (invoke3 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr62222 = $$a;
                    short s42222 = (short) 777;
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr62222[10], s42222, bArr62222[35])), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[3] = invoke3;
                    objArr[4] = invoke2;
                    objArr[5] = invoke;
                    objArr[6] = invoke3;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[7];
                    zArr3[0] = false;
                    zArr3[1] = false;
                    zArr3[2] = true;
                    zArr3[3] = true;
                    zArr3[4] = false;
                    zArr3[5] = true;
                    zArr3[6] = true;
                    Class<?> cls102222 = Class.forName($$c((byte) ($$b - 4), (short) 97, bArr62222[315]));
                    byte b52222 = bArr62222[511];
                    i9 = cls102222.getDeclaredField($$c(b52222, (short) ((b52222 & 533) | (b52222 ^ 533)), bArr62222[41])).getInt(cls102222);
                    if (i9 < 34) {
                    }
                    if (i9 != 29) {
                    }
                    c4 = 0;
                    z10 = false;
                    zArr3[c4] = z10;
                    if (i9 >= 21) {
                    }
                    zArr3[c5] = z11;
                    zArr3[4] = i9 >= 21;
                    z5 = false;
                    i2 = 0;
                    while (!z5) {
                    }
                }
                if (obj != null) {
                }
                invoke2 = null;
                if (obj != null) {
                }
                invoke3 = null;
                char c622222 = '\n';
                if (invoke == null) {
                }
                if (invoke3 == null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr622222 = $$a;
                short s422222 = (short) 777;
                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr622222[10], s422222, bArr622222[35])), 7);
                objArr[0] = null;
                objArr[1] = invoke2;
                objArr[2] = invoke;
                objArr[3] = invoke3;
                objArr[4] = invoke2;
                objArr[5] = invoke;
                objArr[6] = invoke3;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[7];
                zArr3[0] = false;
                zArr3[1] = false;
                zArr3[2] = true;
                zArr3[3] = true;
                zArr3[4] = false;
                zArr3[5] = true;
                zArr3[6] = true;
                Class<?> cls1022222 = Class.forName($$c((byte) ($$b - 4), (short) 97, bArr622222[315]));
                byte b522222 = bArr622222[511];
                i9 = cls1022222.getDeclaredField($$c(b522222, (short) ((b522222 & 533) | (b522222 ^ 533)), bArr622222[41])).getInt(cls1022222);
                if (i9 < 34) {
                }
                if (i9 != 29) {
                }
                c4 = 0;
                z10 = false;
                zArr3[c4] = z10;
                if (i9 >= 21) {
                }
                zArr3[c5] = z11;
                zArr3[4] = i9 >= 21;
                z5 = false;
                i2 = 0;
                while (!z5) {
                }
            }
            invoke = null;
            if (obj != null) {
            }
            invoke2 = null;
            if (obj != null) {
            }
            invoke3 = null;
            char c6222222 = '\n';
            if (invoke == null) {
            }
            if (invoke3 == null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr6222222 = $$a;
            short s4222222 = (short) 777;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr6222222[10], s4222222, bArr6222222[35])), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = invoke3;
            objArr[4] = invoke2;
            objArr[5] = invoke;
            objArr[6] = invoke3;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            zArr3 = new boolean[7];
            zArr3[0] = false;
            zArr3[1] = false;
            zArr3[2] = true;
            zArr3[3] = true;
            zArr3[4] = false;
            zArr3[5] = true;
            zArr3[6] = true;
            Class<?> cls10222222 = Class.forName($$c((byte) ($$b - 4), (short) 97, bArr6222222[315]));
            byte b5222222 = bArr6222222[511];
            i9 = cls10222222.getDeclaredField($$c(b5222222, (short) ((b5222222 & 533) | (b5222222 ^ 533)), bArr6222222[41])).getInt(cls10222222);
            if (i9 < 34) {
            }
            if (i9 != 29) {
            }
            c4 = 0;
            z10 = false;
            zArr3[c4] = z10;
            if (i9 >= 21) {
            }
            zArr3[c5] = z11;
            zArr3[4] = i9 >= 21;
            z5 = false;
            i2 = 0;
            while (!z5) {
            }
            if (obj != null) {
            }
            invoke = null;
            if (obj != null) {
            }
            invoke2 = null;
            if (obj != null) {
            }
            invoke3 = null;
            char c62222222 = '\n';
            if (invoke == null) {
            }
            if (invoke3 == null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr62222222 = $$a;
            short s42222222 = (short) 777;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr62222222[10], s42222222, bArr62222222[35])), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = invoke3;
            objArr[4] = invoke2;
            objArr[5] = invoke;
            objArr[6] = invoke3;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            zArr3 = new boolean[7];
            zArr3[0] = false;
            zArr3[1] = false;
            zArr3[2] = true;
            zArr3[3] = true;
            zArr3[4] = false;
            zArr3[5] = true;
            zArr3[6] = true;
            Class<?> cls102222222 = Class.forName($$c((byte) ($$b - 4), (short) 97, bArr62222222[315]));
            byte b52222222 = bArr62222222[511];
            i9 = cls102222222.getDeclaredField($$c(b52222222, (short) ((b52222222 & 533) | (b52222222 ^ 533)), bArr62222222[41])).getInt(cls102222222);
            if (i9 < 34) {
            }
            if (i9 != 29) {
            }
            c4 = 0;
            z10 = false;
            zArr3[c4] = z10;
            if (i9 >= 21) {
            }
            zArr3[c5] = z11;
            zArr3[4] = i9 >= 21;
            z5 = false;
            i2 = 0;
            while (!z5) {
            }
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }

    private AFa1uSDK() {
    }

    public static int AFInAppEventType(Object obj) {
        int i2 = $11;
        int i4 = (i2 & 123) + (i2 | 123);
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Object obj2 = afErrorLogForExcManagerOnly;
        $10 = (i2 + 31) % 128;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[436]), (short) 808, r0[309]), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r0[345], (short) 294, r0[13]), Object.class).invoke(obj2, obj)).intValue();
            int i5 = $11;
            int i6 = (i5 ^ 7) + ((i5 & 7) << 1);
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
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

    public static void init$0() {
        int i2 = $11;
        $10 = (((i2 | 61) << 1) - (i2 ^ 61)) % 128;
        byte[] bArr = new byte[1003];
        System.arraycopy("t9\u0007\u001b\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ô)ç\u0005ó\nò\u0003\u0006\u00056¿üEÞÞ\u0003\fþò\u0000\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000ó\u0002ñ.Ýý\u0007ò/Û÷\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ý\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ú\u000b\u000bûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018øûýÛ-Ñ\u0000+Ï\u0011÷ú$ïï\u0011ô\bñ\u000fó$íô\b\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u000eñ\"í\u0004ý\u0015á\u0002óÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Í5\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßíó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0015õ÷\u0010ò\u0006ì6Ô\u000bÿ\u001fÔ\u0003\u0002\u001aß\u0002\tû\u0007\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûú\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Î4\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003öô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûå0¸&\u000fù'\u0000\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0¸&\u000fù'\u0000ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0¼\"\u000fù'\u00ad\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr, 0, 1003);
        $$a = bArr;
        $$b = 60;
        int i4 = $10;
        int i5 = (i4 ^ 17) + ((i4 & 17) << 1);
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
    }

    public static int values(int i2) {
        int i4 = $11;
        int i5 = ((i4 | 101) << 1) - (i4 ^ 101);
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        Object obj = afErrorLogForExcManagerOnly;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[436]), (short) 808, r3[309]), true, (ClassLoader) AFPurchaseDetails).getMethod($$c((byte) 77, (short) 519, r3[65]), Integer.TYPE).invoke(obj, Integer.valueOf(i2))).intValue();
            int i6 = $11;
            int i7 = ((i6 | 53) << 1) - (i6 ^ 53);
            $10 = i7 % 128;
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

    public static Object values(char c4, int i2, int i4) {
        int i5 = $11;
        int i6 = ((i5 | 31) << 1) - (i5 ^ 31);
        int i7 = i6 % 128;
        $10 = i7;
        if (i6 % 2 != 0) {
            throw null;
        }
        Object obj = afErrorLogForExcManagerOnly;
        int i8 = (i7 + 87) % 128;
        $11 = i8;
        $10 = (i8 + 107) % 128;
        try {
            Object[] objArr = {Character.valueOf(c4), Integer.valueOf(i2), Integer.valueOf(i4)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) (-bArr[436]), (short) 808, bArr[309]), true, (ClassLoader) AFPurchaseDetails);
            byte b4 = bArr[345];
            String $$c = $$c(b4, (short) 343, b4);
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
}
