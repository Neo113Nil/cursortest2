package com.appsflyer.internal;

import android.view.View;
import androidx.compose.runtime.ComposerKt;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.PointerIconCompat;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0055 -> B:4:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = $11;
        int i7 = ((i6 | 105) << 1) - (i6 ^ 105);
        int i8 = i7 % 128;
        $10 = i8;
        int i9 = i7 % 2;
        int i10 = i + 41;
        byte[] bArr = $$a;
        int i11 = (i3 & (-79)) + (i3 | (-79));
        int i12 = ((i11 | 80) << 1) - (i11 ^ 80);
        int i13 = ((i2 | 4) << 1) - (i2 ^ 4);
        byte[] bArr2 = new byte[i12];
        int i14 = i12 - 1;
        if (bArr == null) {
            int i15 = (i8 & 9) + (i8 | 9);
            int i16 = i15 % 128;
            $11 = i16;
            int i17 = i15 % 2;
            int i18 = (i16 ^ 67) + ((i16 & 67) << 1);
            $10 = i18 % 128;
            int i19 = i18 % 2;
            i10 = i14;
            int i20 = i13;
            i4 = 0;
            int i21 = -i13;
            i10 = ((i10 | i21) << 1) - (i10 ^ i21);
            int i22 = i20 + 55;
            i13 = (i22 ^ (-54)) + ((i22 & (-54)) << 1);
            bArr2[i4] = (byte) i10;
            if (i4 == i14) {
                return new String(bArr2, 0);
            }
            int i23 = bArr[i13];
            i4++;
            int i24 = $10;
            int i25 = (i24 & 97) + (i24 | 97);
            $11 = i25 % 128;
            int i26 = i25 % 2;
            i20 = i13;
            i13 = i23;
            int i212 = -i13;
            i10 = ((i10 | i212) << 1) - (i10 ^ i212);
            int i222 = i20 + 55;
            i13 = (i222 ^ (-54)) + ((i222 & (-54)) << 1);
            bArr2[i4] = (byte) i10;
            if (i4 == i14) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i10;
            if (i4 == i14) {
            }
        }
    }

    public static int AFInAppEventType(Object obj) {
        int i = 2 % 2;
        int i2 = $11;
        int i3 = (i2 & 123) + (i2 | 123);
        $10 = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj3 = afErrorLogForExcManagerOnly;
        int i4 = i2 + 31;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[436]), (short) 808, r1[309]), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r1[345], (short) 294, r1[13]), Object.class).invoke(obj3, obj)).intValue();
            int i6 = $11;
            int i7 = (i6 ^ 7) + ((i6 & 7) << 1);
            $10 = i7 % 128;
            if (i7 % 2 == 0) {
                return intValue;
            }
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i = 2 % 2;
        int i2 = $11;
        int i3 = ((i2 | 61) << 1) - (i2 ^ 61);
        $10 = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = new byte[PointerIconCompat.TYPE_HELP];
        System.arraycopy("t9\u0007\u001b\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ô)ç\u0005ó\nò\u0003\u0006\u00056¿üEÞÞ\u0003\fþò\u0000\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000ó\u0002ñ.Ýý\u0007ò/Û÷\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ý\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ú\u000b\u000bûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018øûýÛ-Ñ\u0000+Ï\u0011÷ú$ïï\u0011ô\bñ\u000fó$íô\b\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u000eñ\"í\u0004ý\u0015á\u0002óÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Í5\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßíó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0015õ÷\u0010ò\u0006ì6Ô\u000bÿ\u001fÔ\u0003\u0002\u001aß\u0002\tû\u0007\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûú\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Î4\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003öô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûå0¸&\u000fù'\u0000\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0¸&\u000fù'\u0000ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0¼\"\u000fù'\u00ad\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr, 0, PointerIconCompat.TYPE_HELP);
        $$a = bArr;
        $$b = 60;
        int i5 = $10;
        int i6 = (i5 ^ 17) + ((i5 & 17) << 1);
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
    }

    public static int values(int i) {
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = ((i3 | 101) << 1) - (i3 ^ 101);
        $10 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        Object obj2 = afErrorLogForExcManagerOnly;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[436]), (short) 808, r4[309]), true, (ClassLoader) AFPurchaseDetails).getMethod($$c((byte) 77, (short) 519, r4[65]), Integer.TYPE).invoke(obj2, Integer.valueOf(i))).intValue();
            int i5 = $11;
            int i6 = ((i5 | 53) << 1) - (i5 ^ 53);
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                return intValue;
            }
            obj.hashCode();
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
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = ((i4 | 31) << 1) - (i4 ^ 31);
        int i6 = i5 % 128;
        $10 = i6;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = afErrorLogForExcManagerOnly;
        int i7 = i6 + 87;
        int i8 = i7 % 128;
        $11 = i8;
        if (i7 % 2 == 0) {
            int i9 = 3 / 4;
        }
        int i10 = i8 + 107;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) (-bArr[436]), (short) 808, bArr[309]), true, (ClassLoader) AFPurchaseDetails);
            byte b = bArr[345];
            return cls.getMethod($$c(b, (short) 343, b), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(obj2, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFa1uSDK() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(1:795)(1:(1:931)(16:(1:933)(1:934)|797|798|799|800|801|802|(3:804|(6:806|807|808|(5:810|811|(1:813)(1:817)|814|815)|818|819)(0)|816)|824|825|826|827|(7:829|830|831|832|833|834|835)(2:849|(4:851|852|853|854)(14:(4:863|864|865|866)(11:874|875|876|878|879|880|881|882|883|837|838)|693|694|118|119|120|(0)|143|144|145|146|147|148|149))|836|837|838))|796|797|798|799|800|801|802|(0)|824|825|826|827|(0)(0)|836|837|838) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:(2:994|995)|10|(34:989|990|991|(0)|14|(0)(0)|17|18|(0)|32|(0)(0)|(0)|51|52|53|54|55|(0)(0)|58|(0)|956|63|64|65|(0)(0)|68|69|(0)(0)|72|73|74|(0)|950|951)|12|(0)|14|(0)(0)|17|18|(0)|32|(0)(0)|(0)|51|52|53|54|55|(0)(0)|58|(0)|956|63|64|65|(0)(0)|68|69|(0)(0)|72|73|74|(0)|950|951) */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x113f, code lost:
    
        r3 = com.appsflyer.internal.AFa1uSDK.$10;
        r5 = (r3 & 101) + (r3 | 101);
        com.appsflyer.internal.AFa1uSDK.$11 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x114f, code lost:
    
        r3 = r11[10];
        r3 = java.lang.Class.forName($$c(r3, (short) ((r3 ^ 426) | (r3 & 426)), r11[757(0x2f5, float:1.061E-42)])).getMethod($$c(r11[334(0x14e, float:4.68E-43)], (short) 861, r11[67]), null).invoke(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x1181, code lost:
    
        java.lang.Class.forName($$c(r11[10], r11[14], r11[538(0x21a, float:7.54E-43)])).getMethod($$c((byte) (-r11[436(0x1b4, float:6.11E-43)]), (short) 605, r11[28]), null).invoke(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x11b7, code lost:
    
        r4 = com.appsflyer.internal.AFa1uSDK.$$a;
        r5 = r4[10];
        java.lang.Class.forName($$c(r5, (short) ((r5 ^ 426) | (r5 & 426)), r4[757(0x2f5, float:1.061E-42)])).getMethod($$c((byte) (-r4[436(0x1b4, float:6.11E-43)]), (short) 605, r4[28]), null).invoke(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x11f6, code lost:
    
        r5 = com.appsflyer.internal.AFa1uSDK.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x1204, code lost:
    
        r2 = java.lang.Class.class.getMethod($$c(r5[425(0x1a9, float:5.96E-43)], (short) 543, r5[17]), null).invoke(com.appsflyer.internal.AFa1uSDK.class, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x1216, code lost:
    
        r4 = java.lang.Class.forName($$c((byte) (-r5[8]), (short) 147, r5[95]));
        r6 = r5[10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x12a5, code lost:
    
        r3 = r4.getDeclaredConstructor(java.lang.Class.forName($$c(r5[10], r5[319(0x13f, float:4.47E-43)], (byte) (-r5[45]))), java.lang.Class.forName($$c(r6, (short) ((r6 ^ 302) | (r6 & 302)), r5[341(0x155, float:4.78E-43)]))).newInstance(java.lang.Class.forName($$c(r5[10], r5[319(0x13f, float:4.47E-43)], (byte) (-r5[45]))).getMethod($$c((byte) (r5[319(0x13f, float:4.47E-43)] - 1), (short) 923, r5[46]), byte[].class).invoke(null, r3), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x12af, code lost:
    
        r4 = java.lang.Class.forName($$c((byte) (-r5[8]), (short) 246, r5[534(0x216, float:7.48E-43)])).getDeclaredField($$c((byte) 71, (short) 750, r5[2]));
        r4.setAccessible(true);
        r6 = r4.get(r2);
        r10 = r6.getClass();
        r11 = r10.getDeclaredField($$c(r5[75], (short) (com.appsflyer.internal.AFa1uSDK.$$b | 898), r5[315(0x13b, float:4.41E-43)]));
        r11.setAccessible(true);
        r13 = r5[75];
        r5 = r10.getDeclaredField($$c(r13, (short) ((r13 ^ 512) | (r13 & 512)), r5[345(0x159, float:4.83E-43)]));
        r5.setAccessible(true);
        r10 = r11.get(r6);
        r6 = r5.get(r6);
        r4 = r4.get(r3);
        r13 = new java.util.ArrayList((java.util.List) r10);
        r10 = r6.getClass().getComponentType();
        r14 = java.lang.reflect.Array.getLength(r6);
        r10 = java.lang.reflect.Array.newInstance(r10, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x1339, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x133c, code lost:
    
        r20 = com.appsflyer.internal.AFa1uSDK.$10;
        r8 = (r20 ^ 29) + ((r20 & 29) << 1);
        com.appsflyer.internal.AFa1uSDK.$11 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x134e, code lost:
    
        java.lang.reflect.Array.set(r10, r15, java.lang.reflect.Array.get(r6, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x1355, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x135b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x135c, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x15f4, code lost:
    
        r4 = new java.lang.StringBuilder();
        r5 = com.appsflyer.internal.AFa1uSDK.$$a;
        r2 = r4.append($$c(r5[757(0x2f5, float:1.061E-42)], (short) 339, r5[28])).append(r2);
        r4 = r5[14];
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x165e, code lost:
    
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(r5[10], (short) 732, (byte) (-r5[45]))).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(r2.append($$c(r6, (short) ((r6 ^ 217) | (r6 & 217)), r4)).toString(), r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x165f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x1661, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x1665, code lost:
    
        if (r3 != null) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x1667, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x1668, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x1363, code lost:
    
        r11.set(r4, r13);
        r5.set(r4, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x136b, code lost:
    
        if (com.appsflyer.internal.AFa1uSDK.AFPurchaseDetails == null) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x136d, code lost:
    
        com.appsflyer.internal.AFa1uSDK.AFPurchaseDetails = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x1435, code lost:
    
        r2 = com.appsflyer.internal.AFa1uSDK.$$a;
        r4 = r2[10];
        r4 = java.lang.Class.forName($$c(r4, (short) ((r4 ^ 302) | (r4 & 302)), r2[341(0x155, float:4.78E-43)]));
        r5 = r2[435(0x1b3, float:6.1E-43)];
        r2 = r4.getDeclaredMethod($$c(r5, (short) ((r5 ^ 804) | (r5 & 804)), r2[115(0x73, float:1.61E-43)]), java.lang.String.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x146f, code lost:
    
        r2.setAccessible(true);
        r2 = r2.invoke(r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x1489, code lost:
    
        r2 = (java.lang.Class) r2;
        r4 = com.appsflyer.internal.AFa1uSDK.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x1498, code lost:
    
        r7 = $$c((byte) (-r4[436(0x1b4, float:6.11E-43)]), (short) 926, r4[309(0x135, float:4.33E-43)]);
        r5 = r2.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r5.setAccessible(true);
        com.appsflyer.internal.AFa1uSDK.afErrorLogForExcManagerOnly = r5.newInstance(r3, java.lang.Boolean.valueOf(!r24));
        r3 = new byte[11764];
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x14de, code lost:
    
        r5 = new java.lang.Object[]{com.appsflyer.internal.AFa1uSDK.class.getResourceAsStream($$c(r4[41], (short) 418, r4[590(0x24e, float:8.27E-43)]))};
        r11 = (short) 443;
        r8 = java.lang.Class.forName($$c(r4[10], r11, r4[337(0x151, float:4.72E-43)]));
        r12 = r4[10];
        r5 = r8.getDeclaredConstructor(java.lang.Class.forName($$c(r12, (short) (r12 | 916), (byte) (-r4[45])))).newInstance(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x151b, code lost:
    
        java.lang.Class.forName($$c(r4[10], r11, r4[337(0x151, float:4.72E-43)])).getMethod($$c(r4[486(0x1e6, float:6.81E-43)], (short) 182, r4[115(0x73, float:1.61E-43)]), byte[].class).invoke(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x1563, code lost:
    
        java.lang.Class.forName($$c(r4[10], r11, r4[337(0x151, float:4.72E-43)])).getMethod($$c((byte) (-r4[436(0x1b4, float:6.11E-43)]), (short) 605, r4[28]), null).invoke(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x158b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x1590, code lost:
    
        r2 = r0;
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x1595, code lost:
    
        if (r3 != null) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x1597, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x1598, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x158d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x1599, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x159a, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x15a1, code lost:
    
        if (r3 != null) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x15a3, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x15a4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x15a5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x15a6, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x15ad, code lost:
    
        if (r3 != null) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x15af, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x15b0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x15b1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x15e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x15b5, code lost:
    
        r2 = r42.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r2.setAccessible(true);
        com.appsflyer.internal.AFa1uSDK.afErrorLogForExcManagerOnly = r2.newInstance(r3, java.lang.Boolean.valueOf(!r24));
        r2 = '\n';
        r7 = false;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x147d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x1485, code lost:
    
        throw ((java.lang.Exception) r0.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x1486, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x1371, code lost:
    
        r2 = com.appsflyer.internal.AFa1uSDK.$$a;
        r4 = java.lang.Class.forName($$c((byte) (-r2[8]), (short) 217, r2[341(0x155, float:4.78E-43)]));
        r5 = r2[435(0x1b3, float:6.1E-43)];
        r5 = $$c(r5, (short) ((r5 ^ 804) | (r5 & 804)), r2[115(0x73, float:1.61E-43)]);
        r6 = r2[10];
        r5 = r4.getDeclaredMethod(r5, java.lang.String.class, java.lang.Class.forName($$c(r6, (short) ((r6 ^ 302) | (r6 & 302)), r2[341(0x155, float:4.78E-43)])));
        r5.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x13c9, code lost:
    
        r8 = com.appsflyer.internal.AFa1uSDK.$11;
        r11 = (r8 ^ 33) + ((r8 & 33) << 1);
        com.appsflyer.internal.AFa1uSDK.$10 = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x13f3, code lost:
    
        r5 = r5.invoke(r3, r7, java.lang.Class.class.getMethod($$c(r2[425(0x1a9, float:5.96E-43)], (short) 543, r2[17]), null).invoke(com.appsflyer.internal.AFa1uSDK.class, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x13fb, code lost:
    
        if (r5 != null) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x13fd, code lost:
    
        r4.getDeclaredMethod($$c((byte) (-r2[436(0x1b4, float:6.11E-43)]), (short) 605, r2[28]), new java.lang.Class[0]).invoke(r3, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x1419, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x147b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x142e, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x141d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x1422, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x1427, code lost:
    
        if (r3 != null) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x1429, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x142a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x142b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x15ee, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x15ef, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x1669, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x166a, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x1673, code lost:
    
        if (r3 != null) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x1675, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x1676, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x1677, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x1681, code lost:
    
        r2 = r0;
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x1686, code lost:
    
        if (r3 != null) goto L663;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x1688, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x1689, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x167c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x11ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x11ec, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x11f0, code lost:
    
        if (r4 != null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x11f2, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x11f3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x11ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x11af, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x11b3, code lost:
    
        if (r5 != null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x11b5, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x11b6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x168a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x168b, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x1694, code lost:
    
        if (r3 != null) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x1696, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x1697, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x1781, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x04d5, code lost:
    
        if (r25 != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0391, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r28[r10], r9, r28[35])).getMethod($$c((byte) (-com.appsflyer.internal.AFa1uSDK.$$a[436(0x1b4, float:6.11E-43)]), (short) 725, r28[2]), null).invoke(r12, null)).booleanValue() != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:919:0x077d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x07ad, code lost:
    
        r35 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x077f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x07ab, code lost:
    
        r34 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x0781, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:929:0x07a9, code lost:
    
        r36 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:959:0x0343, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0087, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x17a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x133c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x136d A[Catch: all -> 0x0fa5, TRY_ENTER, TRY_LEAVE, TryCatch #71 {all -> 0x0fa5, blocks: (B:517:0x0f88, B:521:0x0f8e, B:523:0x0f95, B:524:0x0f96, B:532:0x0f9c, B:534:0x0fa3, B:535:0x0fa4, B:592:0x0e25, B:597:0x0e47, B:600:0x0e4c, B:602:0x0e53, B:603:0x0e54, B:606:0x0e56, B:608:0x0e5d, B:609:0x0e5e, B:612:0x0e60, B:614:0x0e67, B:615:0x0e68, B:208:0x102a, B:233:0x112d, B:235:0x1133, B:236:0x1134, B:433:0x1139, B:434:0x113e, B:273:0x134e, B:295:0x136d, B:409:0x11ec, B:411:0x11f2, B:412:0x11f3, B:417:0x11af, B:419:0x11b5, B:420:0x11b6, B:596:0x0e2b, B:591:0x0df8, B:588:0x0dc6), top: B:207:0x102a, inners: #14, #16, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1433  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1489 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x15b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1371 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x16b2 A[Catch: all -> 0x1781, TryCatch #48 {all -> 0x1781, blocks: (B:320:0x1579, B:324:0x1590, B:326:0x1597, B:327:0x1598, B:333:0x159a, B:335:0x15a3, B:336:0x15a4, B:339:0x15a6, B:341:0x15af, B:342:0x15b0, B:351:0x15b5, B:278:0x15f4, B:287:0x1661, B:289:0x1667, B:290:0x1668, B:391:0x166a, B:393:0x1675, B:394:0x1676, B:398:0x1681, B:400:0x1688, B:401:0x1689, B:424:0x168b, B:426:0x1696, B:427:0x1697, B:438:0x1699, B:440:0x16a4, B:441:0x16a5, B:446:0x16ac, B:448:0x16b2, B:449:0x16b3, B:460:0x16b5, B:462:0x16c0, B:463:0x16c1, B:683:0x16c6, B:685:0x16d3, B:686:0x16d4, B:726:0x16f5, B:728:0x16fc, B:729:0x16fd, B:743:0x171d, B:745:0x1724, B:746:0x1725, B:755:0x1727, B:757:0x1738, B:758:0x1739, B:762:0x1750, B:764:0x1757, B:765:0x1758, B:771:0x175a, B:773:0x176b, B:774:0x176c, B:777:0x176e, B:779:0x177f, B:780:0x1780, B:183:0x08bb, B:169:0x082a, B:281:0x1629, B:282:0x165e, B:264:0x1267, B:167:0x07e8, B:246:0x114f, B:212:0x106a, B:312:0x151b, B:310:0x14de, B:200:0x0fbe, B:194:0x0a7b), top: B:319:0x1579, inners: #2, #18, #20, #32, #36, #54, #63, #64, #70, #79, #85 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x16b3 A[Catch: all -> 0x1781, TryCatch #48 {all -> 0x1781, blocks: (B:320:0x1579, B:324:0x1590, B:326:0x1597, B:327:0x1598, B:333:0x159a, B:335:0x15a3, B:336:0x15a4, B:339:0x15a6, B:341:0x15af, B:342:0x15b0, B:351:0x15b5, B:278:0x15f4, B:287:0x1661, B:289:0x1667, B:290:0x1668, B:391:0x166a, B:393:0x1675, B:394:0x1676, B:398:0x1681, B:400:0x1688, B:401:0x1689, B:424:0x168b, B:426:0x1696, B:427:0x1697, B:438:0x1699, B:440:0x16a4, B:441:0x16a5, B:446:0x16ac, B:448:0x16b2, B:449:0x16b3, B:460:0x16b5, B:462:0x16c0, B:463:0x16c1, B:683:0x16c6, B:685:0x16d3, B:686:0x16d4, B:726:0x16f5, B:728:0x16fc, B:729:0x16fd, B:743:0x171d, B:745:0x1724, B:746:0x1725, B:755:0x1727, B:757:0x1738, B:758:0x1739, B:762:0x1750, B:764:0x1757, B:765:0x1758, B:771:0x175a, B:773:0x176b, B:774:0x176c, B:777:0x176e, B:779:0x177f, B:780:0x1780, B:183:0x08bb, B:169:0x082a, B:281:0x1629, B:282:0x165e, B:264:0x1267, B:167:0x07e8, B:246:0x114f, B:212:0x106a, B:312:0x151b, B:310:0x14de, B:200:0x0fbe, B:194:0x0a7b), top: B:319:0x1579, inners: #2, #18, #20, #32, #36, #54, #63, #64, #70, #79, #85 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x16fc A[Catch: all -> 0x1781, TryCatch #48 {all -> 0x1781, blocks: (B:320:0x1579, B:324:0x1590, B:326:0x1597, B:327:0x1598, B:333:0x159a, B:335:0x15a3, B:336:0x15a4, B:339:0x15a6, B:341:0x15af, B:342:0x15b0, B:351:0x15b5, B:278:0x15f4, B:287:0x1661, B:289:0x1667, B:290:0x1668, B:391:0x166a, B:393:0x1675, B:394:0x1676, B:398:0x1681, B:400:0x1688, B:401:0x1689, B:424:0x168b, B:426:0x1696, B:427:0x1697, B:438:0x1699, B:440:0x16a4, B:441:0x16a5, B:446:0x16ac, B:448:0x16b2, B:449:0x16b3, B:460:0x16b5, B:462:0x16c0, B:463:0x16c1, B:683:0x16c6, B:685:0x16d3, B:686:0x16d4, B:726:0x16f5, B:728:0x16fc, B:729:0x16fd, B:743:0x171d, B:745:0x1724, B:746:0x1725, B:755:0x1727, B:757:0x1738, B:758:0x1739, B:762:0x1750, B:764:0x1757, B:765:0x1758, B:771:0x175a, B:773:0x176b, B:774:0x176c, B:777:0x176e, B:779:0x177f, B:780:0x1780, B:183:0x08bb, B:169:0x082a, B:281:0x1629, B:282:0x165e, B:264:0x1267, B:167:0x07e8, B:246:0x114f, B:212:0x106a, B:312:0x151b, B:310:0x14de, B:200:0x0fbe, B:194:0x0a7b), top: B:319:0x1579, inners: #2, #18, #20, #32, #36, #54, #63, #64, #70, #79, #85 }] */
    /* JADX WARN: Removed duplicated region for block: B:729:0x16fd A[Catch: all -> 0x1781, TryCatch #48 {all -> 0x1781, blocks: (B:320:0x1579, B:324:0x1590, B:326:0x1597, B:327:0x1598, B:333:0x159a, B:335:0x15a3, B:336:0x15a4, B:339:0x15a6, B:341:0x15af, B:342:0x15b0, B:351:0x15b5, B:278:0x15f4, B:287:0x1661, B:289:0x1667, B:290:0x1668, B:391:0x166a, B:393:0x1675, B:394:0x1676, B:398:0x1681, B:400:0x1688, B:401:0x1689, B:424:0x168b, B:426:0x1696, B:427:0x1697, B:438:0x1699, B:440:0x16a4, B:441:0x16a5, B:446:0x16ac, B:448:0x16b2, B:449:0x16b3, B:460:0x16b5, B:462:0x16c0, B:463:0x16c1, B:683:0x16c6, B:685:0x16d3, B:686:0x16d4, B:726:0x16f5, B:728:0x16fc, B:729:0x16fd, B:743:0x171d, B:745:0x1724, B:746:0x1725, B:755:0x1727, B:757:0x1738, B:758:0x1739, B:762:0x1750, B:764:0x1757, B:765:0x1758, B:771:0x175a, B:773:0x176b, B:774:0x176c, B:777:0x176e, B:779:0x177f, B:780:0x1780, B:183:0x08bb, B:169:0x082a, B:281:0x1629, B:282:0x165e, B:264:0x1267, B:167:0x07e8, B:246:0x114f, B:212:0x106a, B:312:0x151b, B:310:0x14de, B:200:0x0fbe, B:194:0x0a7b), top: B:319:0x1579, inners: #2, #18, #20, #32, #36, #54, #63, #64, #70, #79, #85 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x1830  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0350 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:849:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:953:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:957:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:961:0x01ac A[Catch: Exception -> 0x1887, TRY_ENTER, TRY_LEAVE, TryCatch #90 {Exception -> 0x1887, blocks: (B:3:0x001d, B:5:0x0036, B:22:0x0152, B:27:0x187e, B:29:0x1885, B:31:0x1886, B:40:0x0229, B:47:0x027f, B:49:0x0285, B:50:0x0286, B:51:0x0287, B:54:0x02db, B:64:0x0320, B:68:0x0334, B:73:0x0340, B:78:0x034c, B:124:0x17b1, B:127:0x17b6, B:130:0x17c1, B:82:0x184b, B:139:0x17bd, B:145:0x17dc, B:153:0x1828, B:155:0x182e, B:156:0x182f, B:961:0x01ac, B:968:0x186a, B:970:0x1871, B:971:0x1872, B:974:0x1874, B:976:0x187b, B:977:0x187c, B:148:0x17f0, B:149:0x1825, B:965:0x01f4, B:963:0x01bd, B:43:0x0246, B:24:0x0174), top: B:2:0x001d, inners: #3, #31, #37, #45, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:978:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:985:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:989:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        Object obj;
        Object invoke;
        Object invoke2;
        Object obj2;
        char c;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean[] zArr4;
        boolean z3;
        String str;
        boolean z4;
        Object[] objArr2;
        boolean[] zArr5;
        boolean[] zArr6;
        Object obj3;
        int i3;
        char c2;
        boolean z5;
        boolean z6;
        Object obj4;
        boolean z7;
        Random random;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        int i4;
        int i5;
        int i6;
        Random random2;
        Object obj13;
        int i7;
        int i8;
        Throwable cause;
        Class cls;
        InputStream inputStream;
        Object obj14;
        Exception exc;
        Throwable th;
        Throwable th2;
        int i9;
        byte[] bArr;
        int min;
        Object obj15;
        Class cls2;
        byte[] bArr2;
        Throwable th3;
        Object newInstance;
        byte[] bArr3;
        Throwable cause2;
        int i10;
        boolean z8;
        int i11;
        boolean z9;
        boolean z10;
        init$0();
        getProductId = -7759472570103191783L;
        getPurchaseType = -7;
        afLogForce = new HashMap();
        afRDLog = new HashMap();
        try {
            byte[] bArr4 = $$a;
            String $$c = $$c((byte) (-bArr4[436]), (short) 879, bArr4[309]);
            String $$c2 = afErrorLogForExcManagerOnly == null ? $$c((byte) (-bArr4[436]), (short) 911, bArr4[79]) : null;
            boolean z11 = false;
            try {
                int i12 = $$b;
                Method method = Class.forName($$c((byte) ((i12 & (-4)) + (i12 | (-4))), (short) 671, bArr4[590])).getMethod($$c((byte) (-bArr4[436]), bArr4[63], bArr4[118]), new Class[0]);
                obj = method.invoke(null, null);
            } catch (Exception unused) {
                obj = null;
            }
            try {
                byte[] bArr5 = $$a;
                obj = Class.forName($$c((byte) ($$b - 4), (short) 387, bArr5[6])).getMethod($$c(bArr5[425], (short) 757, bArr5[341]), new Class[0]).invoke(null, null);
            } catch (Exception unused2) {
            }
            if (obj != null) {
                try {
                    Class<?> cls3 = obj.getClass();
                    byte b = $$a[425];
                    invoke = cls3.getMethod($$c(b, (short) ((b ^ ByteCompanionObject.MIN_VALUE) | (b & ByteCompanionObject.MIN_VALUE)), r15[67]), null).invoke(obj, null);
                    int i13 = 2 % 2;
                } catch (Exception unused3) {
                    invoke = null;
                    if (obj != null) {
                        try {
                            Class<?> cls4 = obj.getClass();
                            byte[] bArr6 = $$a;
                            Method method2 = cls4.getMethod($$c(bArr6[425], (short) 277, bArr6[182]), null);
                            invoke2 = method2.invoke(obj, null);
                        } catch (Exception unused4) {
                            invoke2 = null;
                            if (obj == null) {
                            }
                            int i14 = 2 % 2;
                            c = '\n';
                            if (invoke == null) {
                            }
                            if (obj2 != null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr7 = $$a;
                            short s = (short) 777;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr7[10], s, bArr7[35])), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = obj2;
                            objArr[4] = invoke2;
                            objArr[5] = invoke;
                            objArr[6] = obj2;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            i = 6;
                            zArr3 = new boolean[]{false, false, true, true, false, true, true};
                            i = $$b;
                            Class<?> cls5 = Class.forName($$c((byte) (i - 4), (short) 97, bArr7[315]));
                            byte b2 = bArr7[511];
                            i10 = cls5.getDeclaredField($$c(b2, (short) ((b2 & 533) | (b2 ^ 533)), bArr7[41])).getInt(cls5);
                            if (i10 >= 34) {
                            }
                            if (i10 != 29) {
                            }
                            int i15 = 2 % 2;
                            z8 = false;
                            zArr3[0] = z8;
                            if (i10 < 21) {
                            }
                            zArr3[1] = z9;
                            if (i10 < 21) {
                            }
                            zArr3[4] = z10;
                            z2 = false;
                            i2 = 0;
                            while (!z2) {
                            }
                        }
                        if (obj == null) {
                            try {
                                Class<?> cls6 = obj.getClass();
                                byte[] bArr8 = $$a;
                                String $$c3 = $$c(bArr8[425], (short) ComposerKt.providerMapsKey, bArr8[67]);
                                Method method3 = cls6.getMethod($$c3, null);
                                obj2 = method3.invoke(obj, null);
                                int i16 = $10;
                                int i17 = (i16 & 125) + (i16 | 125);
                                $11 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    int i18 = 2 % 2;
                                }
                            } catch (Exception unused5) {
                                obj2 = null;
                                c = '\n';
                                if (invoke == null) {
                                }
                                if (obj2 != null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr72 = $$a;
                                short s2 = (short) 777;
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr72[10], s2, bArr72[35])), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[3] = obj2;
                                objArr[4] = invoke2;
                                objArr[5] = invoke;
                                objArr[6] = obj2;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                i = 6;
                                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                i = $$b;
                                Class<?> cls52 = Class.forName($$c((byte) (i - 4), (short) 97, bArr72[315]));
                                byte b22 = bArr72[511];
                                i10 = cls52.getDeclaredField($$c(b22, (short) ((b22 & 533) | (b22 ^ 533)), bArr72[41])).getInt(cls52);
                                if (i10 >= 34) {
                                }
                                if (i10 != 29) {
                                }
                                int i152 = 2 % 2;
                                z8 = false;
                                zArr3[0] = z8;
                                if (i10 < 21) {
                                }
                                zArr3[1] = z9;
                                if (i10 < 21) {
                                }
                                zArr3[4] = z10;
                                z2 = false;
                                i2 = 0;
                                while (!z2) {
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                        int i142 = 2 % 2;
                        c = '\n';
                        if (invoke == null) {
                            if ($$c2 == null) {
                                invoke = null;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                byte[] bArr9 = $$a;
                                try {
                                    invoke = Class.forName($$c(bArr9[10], (short) 777, bArr9[35])).getDeclaredConstructor(String.class).newInstance(sb.append($$c(bArr9[41], (short) 556, bArr9[67])).append($$c2).toString());
                                } catch (Throwable th4) {
                                    Throwable cause3 = th4.getCause();
                                    if (cause3 == null) {
                                        throw th4;
                                    }
                                    throw cause3;
                                }
                            }
                        }
                        if (obj2 != null) {
                            int i19 = $11 + 35;
                            $10 = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i20 = 4 % 3;
                            } else {
                                int i21 = 2 % 2;
                            }
                        } else {
                            byte[] bArr10 = $$a;
                            try {
                                try {
                                    obj2 = Class.forName($$c(bArr10[10], (short) 777, bArr10[35])).getDeclaredConstructor(String.class).newInstance(Class.forName($$c(bArr10[10], bArr10[538], bArr10[13])).getMethod($$c(bArr10[425], (short) 647, bArr10[67]), String.class).invoke(null, $$c(bArr10[10], (short) 634, bArr10[17])));
                                } catch (Throwable th5) {
                                    Throwable cause4 = th5.getCause();
                                    if (cause4 == null) {
                                        throw th5;
                                    }
                                    throw cause4;
                                }
                            } catch (Throwable th6) {
                                Throwable cause5 = th6.getCause();
                                if (cause5 == null) {
                                    throw th6;
                                }
                                throw cause5;
                            }
                        }
                        if (invoke2 == null && invoke != null) {
                            int i22 = $10;
                            int i23 = (i22 ^ 31) + ((i22 & 31) << 1);
                            $11 = i23 % 128;
                            int i24 = i23 % 2;
                            String $$c4 = $$c((byte) (-$$a[436]), (short) 237, r5[4]);
                            int i25 = $11 + 71;
                            $10 = i25 % 128;
                            int i26 = i25 % 2;
                            try {
                                short s3 = (short) 777;
                                invoke2 = Class.forName($$c(r5[10], s3, r5[35])).getDeclaredConstructor(Class.forName($$c(r5[10], s3, r5[35])), String.class).newInstance(invoke, $$c4);
                            } catch (Throwable th7) {
                                Throwable cause6 = th7.getCause();
                                if (cause6 == null) {
                                    throw th7;
                                }
                                throw cause6;
                            }
                        }
                        byte[] bArr722 = $$a;
                        short s22 = (short) 777;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr722[10], s22, bArr722[35])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = obj2;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = obj2;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        i = 6;
                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                        i = $$b;
                        Class<?> cls522 = Class.forName($$c((byte) (i - 4), (short) 97, bArr722[315]));
                        byte b222 = bArr722[511];
                        i10 = cls522.getDeclaredField($$c(b222, (short) ((b222 & 533) | (b222 ^ 533)), bArr722[41])).getInt(cls522);
                        z = i10 >= 34;
                        if (i10 != 29 && i10 >= 26) {
                            z8 = true;
                        } else {
                            int i1522 = 2 % 2;
                            z8 = false;
                        }
                        zArr3[0] = z8;
                        if (i10 < 21) {
                            int i27 = $10 + 109;
                            $11 = i27 % 128;
                            i11 = 2;
                            int i28 = i27 % 2;
                            z9 = true;
                        } else {
                            i11 = 2;
                            z9 = false;
                        }
                        zArr3[1] = z9;
                        if (i10 < 21) {
                            int i29 = i11 % i11;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zArr3[4] = z10;
                        z2 = false;
                        i2 = 0;
                        while (!z2 && i2 < 9) {
                            if (zArr3[i2]) {
                                zArr4 = zArr;
                                z3 = z2;
                                str = $$c;
                                z4 = z;
                                objArr2 = objArr;
                                zArr5 = zArr2;
                                i = i2;
                                c2 = c;
                                z5 = z11;
                                zArr6 = zArr3;
                            } else {
                                try {
                                    z6 = zArr[i2];
                                    obj4 = objArr[i2];
                                    z7 = zArr2[i2];
                                    if (z6) {
                                        if (obj4 != null) {
                                            try {
                                            } catch (Throwable th8) {
                                                Throwable cause7 = th8.getCause();
                                                if (cause7 == null) {
                                                    throw th8;
                                                }
                                                throw cause7;
                                            }
                                        }
                                        try {
                                            StringBuilder sb2 = new StringBuilder();
                                            byte[] bArr11 = $$a;
                                            zArr4 = zArr;
                                            try {
                                                StringBuilder append = sb2.append($$c(bArr11[757], (short) 331, bArr11[28])).append(obj4);
                                                byte b3 = bArr11[14];
                                                byte b4 = b3;
                                                String sb3 = append.append($$c(b4, (short) ((b4 ^ 217) | (b4 & 217)), b3)).toString();
                                                int i30 = $11;
                                                int i31 = (i30 & 21) + (i30 | 21);
                                                $10 = i31 % 128;
                                                int i32 = i31 % 2;
                                                try {
                                                    throw ((Throwable) Class.forName($$c(bArr11[10], (short) 732, (byte) (-bArr11[45]))).getDeclaredConstructor(String.class).newInstance(sb3));
                                                } catch (Throwable th9) {
                                                    Throwable cause8 = th9.getCause();
                                                    if (cause8 == null) {
                                                        throw th9;
                                                    }
                                                    throw cause8;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                obj3 = th;
                                                z3 = z2;
                                                str = $$c;
                                                z4 = z;
                                                objArr2 = objArr;
                                                zArr5 = zArr2;
                                                i = i2;
                                                zArr6 = zArr3;
                                                while (i3 < 7) {
                                                }
                                                int i33 = $11 + 61;
                                                $10 = i33 % 128;
                                                int i34 = i33 % 2;
                                                try {
                                                    throw ((Throwable) Class.forName($$c(r1[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[757], (short) 309, r1[337]), obj3));
                                                } catch (Throwable th11) {
                                                    Throwable cause9 = th11.getCause();
                                                    if (cause9 == null) {
                                                        throw th11;
                                                    }
                                                    throw cause9;
                                                }
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            zArr4 = zArr;
                                        }
                                    }
                                    zArr4 = zArr;
                                } catch (Throwable th13) {
                                    th = th13;
                                    zArr4 = zArr;
                                    z3 = z2;
                                    str = $$c;
                                    z4 = z;
                                    objArr2 = objArr;
                                    zArr5 = zArr2;
                                }
                                if (z6) {
                                    try {
                                        random = new Random();
                                        try {
                                            random.setSeed(((Long) Class.forName($$c(r11[10], r11[538], r11[13])).getMethod($$c((byte) (-$$a[436]), (short) 792, r11[526]), null).invoke(null, null)).longValue() ^ (-1617165123));
                                            obj5 = null;
                                            obj6 = null;
                                            obj7 = null;
                                            obj8 = null;
                                        } catch (Throwable th14) {
                                            Throwable cause10 = th14.getCause();
                                            if (cause10 == null) {
                                                throw th14;
                                            }
                                            throw cause10;
                                        }
                                    } catch (Throwable th15) {
                                        th = th15;
                                        z3 = z2;
                                    }
                                    while (obj5 == null) {
                                        if (obj6 == null) {
                                            i5 = 6;
                                        } else if (obj7 == null) {
                                            i5 = 5;
                                        } else {
                                            if (obj8 == null) {
                                                obj12 = obj5;
                                                z3 = z2;
                                                i4 = 4;
                                            } else {
                                                obj12 = obj5;
                                                z3 = z2;
                                                i4 = 3;
                                            }
                                            str = $$c;
                                            StringBuilder sb4 = new StringBuilder(((i4 | 1) << 1) - (i4 ^ 1));
                                            sb4.append('.');
                                            i6 = 0;
                                            while (i6 < i4) {
                                                int i35 = $10;
                                                int i36 = i4;
                                                int i37 = (i35 & 97) + (i35 | 97);
                                                objArr2 = objArr;
                                                $11 = i37 % 128;
                                                if (i37 % 2 == 0) {
                                                    try {
                                                        int i38 = 88 / 0;
                                                        if (z7) {
                                                            int nextInt = random.nextInt(26);
                                                            if (random.nextBoolean()) {
                                                                i7 = 64 - (~nextInt);
                                                            } else {
                                                                int i39 = -(-nextInt);
                                                                i7 = ((i39 | 96) << 1) - (i39 ^ 96);
                                                            }
                                                            sb4.append((char) i7);
                                                        }
                                                        sb4.append((char) (random.nextInt(12) + 8192));
                                                    } catch (Throwable th16) {
                                                        obj3 = th16;
                                                        z4 = z;
                                                        zArr5 = zArr2;
                                                        i = i2;
                                                        zArr6 = zArr3;
                                                        while (i3 < 7) {
                                                        }
                                                        int i332 = $11 + 61;
                                                        $10 = i332 % 128;
                                                        int i342 = i332 % 2;
                                                        throw ((Throwable) Class.forName($$c(r1[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[757], (short) 309, r1[337]), obj3));
                                                    }
                                                }
                                                int i40 = i6 - 81;
                                                i6 = (i40 | 82) + (i40 & 82);
                                                objArr = objArr2;
                                                i4 = i36;
                                            }
                                            objArr2 = objArr;
                                            String sb5 = sb4.toString();
                                            if (obj6 != null) {
                                                try {
                                                    Object[] objArr3 = {obj4, sb5};
                                                    byte[] bArr12 = $$a;
                                                    Class<?> cls7 = Class.forName($$c(bArr12[10], s22, bArr12[35]));
                                                    Class<?>[] clsArr = new Class[2];
                                                    zArr5 = zArr2;
                                                    try {
                                                        clsArr[0] = Class.forName($$c(bArr12[10], s22, bArr12[35]));
                                                        clsArr[1] = String.class;
                                                        obj6 = cls7.getDeclaredConstructor(clsArr).newInstance(objArr3);
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        Throwable th18 = th;
                                                        Throwable cause11 = th18.getCause();
                                                        if (cause11 == null) {
                                                            throw th18;
                                                        }
                                                        throw cause11;
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                }
                                            } else {
                                                zArr5 = zArr2;
                                                if (obj7 != null) {
                                                    if (obj8 == null) {
                                                        int i41 = $10 + 71;
                                                        $11 = i41 % 128;
                                                        int i42 = i41 % 2;
                                                        try {
                                                            Object[] objArr4 = {obj4, sb5};
                                                            byte[] bArr13 = $$a;
                                                            obj8 = Class.forName($$c(bArr13[10], s22, bArr13[35])).getDeclaredConstructor(Class.forName($$c(bArr13[10], s22, bArr13[35])), String.class).newInstance(objArr4);
                                                        } catch (Throwable th20) {
                                                            Throwable cause12 = th20.getCause();
                                                            if (cause12 == null) {
                                                                throw th20;
                                                            }
                                                            throw cause12;
                                                        }
                                                    } else {
                                                        try {
                                                            try {
                                                                Object[] objArr5 = {obj4, sb5};
                                                                byte[] bArr14 = $$a;
                                                                random2 = random;
                                                                Object obj16 = obj6;
                                                                Object newInstance2 = Class.forName($$c(bArr14[10], s22, bArr14[35])).getDeclaredConstructor(Class.forName($$c(bArr14[10], s22, bArr14[35])), String.class).newInstance(objArr5);
                                                                try {
                                                                    byte b5 = bArr14[10];
                                                                    int i43 = $$b;
                                                                    obj13 = obj4;
                                                                    Object obj17 = obj7;
                                                                    try {
                                                                        Class.forName($$c(bArr14[10], (short) ((i43 & 642) | (i43 ^ 642)), bArr14[315])).getMethod($$c((byte) (-bArr14[436]), (short) 605, bArr14[28]), null).invoke(Class.forName($$c(b5, (short) ((i43 ^ 642) | (i43 & 642)), bArr14[315])).getDeclaredConstructor(Class.forName($$c(bArr14[10], s22, bArr14[35]))).newInstance(newInstance2), null);
                                                                        obj5 = newInstance2;
                                                                        obj6 = obj16;
                                                                        obj7 = obj17;
                                                                        int i44 = 2 % 2;
                                                                        z2 = z3;
                                                                        objArr = objArr2;
                                                                        zArr2 = zArr5;
                                                                        $$c = str;
                                                                        random = random2;
                                                                        obj4 = obj13;
                                                                    } catch (Throwable th21) {
                                                                        Throwable cause13 = th21.getCause();
                                                                        if (cause13 == null) {
                                                                            throw th21;
                                                                        }
                                                                        throw cause13;
                                                                    }
                                                                } catch (Throwable th22) {
                                                                    Throwable cause14 = th22.getCause();
                                                                    if (cause14 == null) {
                                                                        throw th22;
                                                                    }
                                                                    throw cause14;
                                                                }
                                                            } catch (Exception e) {
                                                                try {
                                                                    StringBuilder sb6 = new StringBuilder();
                                                                    byte[] bArr15 = $$a;
                                                                    StringBuilder append2 = sb6.append($$c(bArr15[757], (short) 788, bArr15[28])).append((Object) 2);
                                                                    byte b6 = bArr15[14];
                                                                    byte b7 = b6;
                                                                    try {
                                                                        throw ((Throwable) Class.forName($$c(bArr15[10], (short) 732, (byte) (-bArr15[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance(append2.append($$c(b7, (short) (b7 | 217), b6)).toString(), e));
                                                                    } catch (Throwable th23) {
                                                                        Throwable cause15 = th23.getCause();
                                                                        if (cause15 == null) {
                                                                            throw th23;
                                                                        }
                                                                        throw cause15;
                                                                    }
                                                                } catch (Throwable th24) {
                                                                    th = th24;
                                                                    obj3 = th;
                                                                    z4 = z;
                                                                    i = i2;
                                                                    zArr6 = zArr3;
                                                                    while (i3 < 7) {
                                                                    }
                                                                    int i3322 = $11 + 61;
                                                                    $10 = i3322 % 128;
                                                                    int i3422 = i3322 % 2;
                                                                    throw ((Throwable) Class.forName($$c(r1[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[757], (short) 309, r1[337]), obj3));
                                                                }
                                                            }
                                                        } catch (Throwable th25) {
                                                            Throwable cause16 = th25.getCause();
                                                            if (cause16 == null) {
                                                                throw th25;
                                                            }
                                                            throw cause16;
                                                        }
                                                    }
                                                    th = th24;
                                                    obj3 = th;
                                                    z4 = z;
                                                    i = i2;
                                                    zArr6 = zArr3;
                                                    while (i3 < 7) {
                                                    }
                                                    int i33222 = $11 + 61;
                                                    $10 = i33222 % 128;
                                                    int i34222 = i33222 % 2;
                                                    throw ((Throwable) Class.forName($$c(r1[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[757], (short) 309, r1[337]), obj3));
                                                }
                                                try {
                                                    Object[] objArr6 = {obj4, sb5};
                                                    byte[] bArr16 = $$a;
                                                    obj7 = Class.forName($$c(bArr16[10], s22, bArr16[35])).getDeclaredConstructor(Class.forName($$c(bArr16[10], s22, bArr16[35])), String.class).newInstance(objArr6);
                                                } catch (Throwable th26) {
                                                    Throwable cause17 = th26.getCause();
                                                    if (cause17 == null) {
                                                        throw th26;
                                                    }
                                                    throw cause17;
                                                }
                                            }
                                            random2 = random;
                                            obj13 = obj4;
                                            obj5 = obj12;
                                            int i442 = 2 % 2;
                                            z2 = z3;
                                            objArr = objArr2;
                                            zArr2 = zArr5;
                                            $$c = str;
                                            random = random2;
                                            obj4 = obj13;
                                        }
                                        z3 = z2;
                                        int i45 = i5;
                                        obj12 = obj5;
                                        i4 = i45;
                                        str = $$c;
                                        StringBuilder sb42 = new StringBuilder(((i4 | 1) << 1) - (i4 ^ 1));
                                        sb42.append('.');
                                        i6 = 0;
                                        while (i6 < i4) {
                                        }
                                        objArr2 = objArr;
                                        String sb52 = sb42.toString();
                                        if (obj6 != null) {
                                        }
                                        random2 = random;
                                        obj13 = obj4;
                                        obj5 = obj12;
                                        int i4422 = 2 % 2;
                                        z2 = z3;
                                        objArr = objArr2;
                                        zArr2 = zArr5;
                                        $$c = str;
                                        random = random2;
                                        obj4 = obj13;
                                    }
                                    obj9 = obj5;
                                    z3 = z2;
                                    str = $$c;
                                    objArr2 = objArr;
                                    zArr5 = zArr2;
                                    obj10 = obj6;
                                    obj11 = obj7;
                                } else {
                                    z3 = z2;
                                    str = $$c;
                                    objArr2 = objArr;
                                    zArr5 = zArr2;
                                    obj8 = null;
                                    obj9 = null;
                                    obj10 = null;
                                    obj11 = null;
                                }
                                try {
                                    byte[] bArr17 = new byte[7796];
                                    byte[] bArr18 = $$a;
                                    try {
                                        Object[] objArr7 = {AFa1uSDK.class.getResourceAsStream($$c(bArr18[41], (short) 609, bArr18[590]))};
                                        short s4 = (short) 443;
                                        Class<?> cls8 = Class.forName($$c(bArr18[10], s4, bArr18[337]));
                                        byte b8 = bArr18[10];
                                        Object obj18 = obj8;
                                        Object newInstance3 = cls8.getDeclaredConstructor(Class.forName($$c(b8, (short) ((b8 ^ 916) | (b8 & 916)), (byte) (-bArr18[45])))).newInstance(objArr7);
                                        try {
                                            Class.forName($$c(bArr18[10], s4, bArr18[337])).getMethod($$c(bArr18[486], (short) 182, bArr18[115]), byte[].class).invoke(newInstance3, bArr17);
                                            int i46 = $10 + 121;
                                            $11 = i46 % 128;
                                            int i47 = i46 % 2;
                                            try {
                                                try {
                                                    Class.forName($$c(bArr18[10], s4, bArr18[337])).getMethod($$c((byte) (-bArr18[436]), (short) 605, bArr18[28]), null).invoke(newInstance3, null);
                                                    int i48 = 20;
                                                    int i49 = 7749;
                                                    String str2 = str;
                                                    Class cls9 = null;
                                                    while (true) {
                                                        int i50 = ((i48 | LocationRequestCompat.QUALITY_LOW_POWER) << 1) - (i48 ^ LocationRequestCompat.QUALITY_LOW_POWER);
                                                        byte b9 = bArr17[(i48 & 7775) + (i48 | 7775)];
                                                        bArr17[i50] = (byte) ((b9 ^ (-42)) + ((b9 & (-42)) << 1));
                                                        int length = bArr17.length;
                                                        int i51 = -i48;
                                                        int i52 = (length & i51) + (length | i51);
                                                        int i53 = 2 % 2;
                                                        try {
                                                            Object[] objArr8 = {bArr17, Integer.valueOf(i48), Integer.valueOf(i52)};
                                                            byte[] bArr19 = $$a;
                                                            byte b10 = bArr19[10];
                                                            int i54 = $$b;
                                                            int i55 = i49;
                                                            InputStream inputStream2 = (InputStream) Class.forName($$c(b10, (short) (i54 << 1), bArr19[3])).getDeclaredConstructor(byte[].class, Integer.TYPE, Integer.TYPE).newInstance(objArr8);
                                                            Object obj19 = afErrorLogForExcManagerOnly;
                                                            if (obj19 == null) {
                                                                int i56 = $10 + 111;
                                                                $11 = i56 % 128;
                                                                int i57 = i56 % 2;
                                                                try {
                                                                    int i58 = 0 - (~(-(-((Integer) Class.forName($$c((byte) (i54 - 4), (short) 471, bArr19[341])).getMethod($$c(bArr19[401], (short) 524, bArr19[526]), String.class).invoke(null, "")).intValue())));
                                                                    int i59 = -(-View.MeasureSpec.getMode(0));
                                                                    int i60 = ((i59 | (-1672487143)) << 1) - (i59 ^ (-1672487143));
                                                                    long j = getProductId;
                                                                    i8 = i48;
                                                                    z4 = false;
                                                                    inputStream = new AFj1lSDK(inputStream2, new int[]{((int) (j >>> 32)) ^ i60, ((int) j) ^ i60}, null, getPurchaseType, false, i58);
                                                                    cls = cls9;
                                                                    i = i2;
                                                                    zArr6 = zArr3;
                                                                } catch (Throwable th27) {
                                                                    Throwable cause18 = th27.getCause();
                                                                    if (cause18 == null) {
                                                                        throw th27;
                                                                    }
                                                                    throw cause18;
                                                                }
                                                            } else {
                                                                i8 = i48;
                                                                int i61 = $11;
                                                                int i62 = (i61 ^ 79) + ((i61 & 79) << 1);
                                                                $10 = i62 % 128;
                                                                int i63 = i62 % 2;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            int intValue = (((Integer) Class.forName($$c((byte) (((i54 | (-4)) << 1) - (i54 ^ (-4))), bArr19[425], bArr19[118])).getMethod($$c(bArr19[824], (short) (-bArr19[436]), bArr19[28]), null).invoke(null, null)).intValue() >> 22) + 4;
                                                                            byte[] bArr20 = {76, -30, 101, 13, -71, -69, 18, -67, 113, 60, 34, -33, -113, 100, -12, -7};
                                                                            int i64 = -(-View.MeasureSpec.getMode(0));
                                                                            try {
                                                                                Object[] objArr9 = {inputStream2, Integer.valueOf(intValue), bArr20, Integer.valueOf(((i64 | 768756660) << 1) - (i64 ^ 768756660))};
                                                                                try {
                                                                                    Class<?> cls10 = Class.forName($$c((byte) (-bArr19[436]), (short) 808, bArr19[309]), true, (ClassLoader) AFPurchaseDetails);
                                                                                    zArr6 = zArr3;
                                                                                    try {
                                                                                        String $$c5 = $$c((byte) 77, (short) 696, bArr19[41]);
                                                                                        Class<?>[] clsArr2 = new Class[4];
                                                                                        byte b11 = bArr19[10];
                                                                                        i = i2;
                                                                                        cls = cls9;
                                                                                        try {
                                                                                            clsArr2[0] = Class.forName($$c(b11, (short) (b11 | 916), (byte) (-bArr19[45])));
                                                                                            clsArr2[1] = Integer.TYPE;
                                                                                            clsArr2[2] = byte[].class;
                                                                                            clsArr2[3] = Integer.TYPE;
                                                                                            inputStream = (InputStream) cls10.getMethod($$c5, clsArr2).invoke(obj19, objArr9);
                                                                                        } catch (Throwable th28) {
                                                                                            th = th28;
                                                                                            Throwable th29 = th;
                                                                                            cause = th29.getCause();
                                                                                            if (cause != null) {
                                                                                                throw th29;
                                                                                            }
                                                                                            throw cause;
                                                                                        }
                                                                                    } catch (Throwable th30) {
                                                                                        th = th30;
                                                                                    }
                                                                                } catch (Throwable th31) {
                                                                                    th = th31;
                                                                                    Throwable th292 = th;
                                                                                    cause = th292.getCause();
                                                                                    if (cause != null) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th32) {
                                                                                th = th32;
                                                                            }
                                                                        } catch (Throwable th33) {
                                                                            th = th33;
                                                                            Throwable th34 = th;
                                                                            Throwable cause19 = th34.getCause();
                                                                            if (cause19 == null) {
                                                                                throw th34;
                                                                            }
                                                                            throw cause19;
                                                                        }
                                                                    } catch (Throwable th35) {
                                                                        th = th35;
                                                                    }
                                                                } catch (Throwable th36) {
                                                                    th = th36;
                                                                }
                                                            }
                                                            try {
                                                                Object[] objArr10 = {Long.valueOf(20)};
                                                                byte b12 = bArr19[10];
                                                                ((Long) Class.forName($$c(b12, (short) ((b12 ^ 916) | (b12 & 916)), (byte) (-bArr19[45]))).getMethod($$c((byte) ((-2) - (bArr19[334] ^ (-1))), (short) 540, bArr19[46]), Long.TYPE).invoke(inputStream, objArr10)).longValue();
                                                                if (z6) {
                                                                    try {
                                                                        Object obj20 = afErrorLogForExcManagerOnly;
                                                                        if (obj20 == null) {
                                                                            int i65 = $11;
                                                                            int i66 = (i65 ^ 5) + ((i65 & 5) << 1);
                                                                            $10 = i66 % 128;
                                                                            int i67 = i66 % 2;
                                                                            obj14 = obj10;
                                                                        } else {
                                                                            obj14 = obj11;
                                                                        }
                                                                        Object obj21 = obj20 == null ? obj18 : obj9;
                                                                        try {
                                                                            Object newInstance4 = Class.forName($$c(bArr19[10], (short) ((i54 & 642) | (i54 ^ 642)), bArr19[315])).getDeclaredConstructor(Class.forName($$c(bArr19[10], s22, bArr19[35]))).newInstance(obj14);
                                                                            if (z) {
                                                                                try {
                                                                                    ((Boolean) Class.forName($$c(bArr19[10], s22, bArr19[35])).getMethod($$c((byte) (bArr19[334] - 1), (short) 408, bArr19[67]), null).invoke(obj14, null)).booleanValue();
                                                                                } catch (Throwable th37) {
                                                                                    try {
                                                                                        Throwable cause20 = th37.getCause();
                                                                                        if (cause20 == null) {
                                                                                            throw th37;
                                                                                        }
                                                                                        throw cause20;
                                                                                    } catch (Exception e2) {
                                                                                        exc = e2;
                                                                                        StringBuilder sb7 = new StringBuilder();
                                                                                        byte[] bArr21 = $$a;
                                                                                        StringBuilder append3 = sb7.append($$c(bArr21[757], (short) 335, bArr21[28])).append(obj14);
                                                                                        byte b13 = bArr21[14];
                                                                                        byte b14 = b13;
                                                                                        try {
                                                                                            throw ((Throwable) Class.forName($$c(bArr21[10], (short) 732, (byte) (-bArr21[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance(append3.append($$c(b14, (short) ((b14 ^ 217) | (b14 & 217)), b13)).toString(), exc));
                                                                                        } catch (Throwable th38) {
                                                                                            Throwable cause21 = th38.getCause();
                                                                                            if (cause21 == null) {
                                                                                                throw th38;
                                                                                            }
                                                                                            throw cause21;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int i68 = 1024;
                                                                            try {
                                                                                byte[] bArr22 = new byte[1024];
                                                                                int i69 = i55;
                                                                                while (true) {
                                                                                    if (i69 <= 0) {
                                                                                        z4 = z;
                                                                                        i9 = i8;
                                                                                        break;
                                                                                    }
                                                                                    int i70 = $11 + 7;
                                                                                    $10 = i70 % 128;
                                                                                    if (i70 % 2 != 0) {
                                                                                        try {
                                                                                            min = Math.min(i68, i69);
                                                                                        } catch (Throwable th39) {
                                                                                            th = th39;
                                                                                            try {
                                                                                                byte[] bArr23 = $$a;
                                                                                                try {
                                                                                                    short s5 = (short) 566;
                                                                                                    ((Boolean) Class.forName($$c(bArr23[10], s22, bArr23[35])).getMethod($$c((byte) (-bArr23[8]), s5, bArr23[65]), null).invoke(obj14, null)).booleanValue();
                                                                                                    try {
                                                                                                        try {
                                                                                                            ((Boolean) Class.forName($$c(bArr23[10], s22, bArr23[35])).getMethod($$c((byte) (-bArr23[8]), s5, bArr23[65]), null).invoke(obj21, null)).booleanValue();
                                                                                                            throw th;
                                                                                                        } catch (Throwable th40) {
                                                                                                            th = th40;
                                                                                                            Throwable th41 = th;
                                                                                                            Throwable cause22 = th41.getCause();
                                                                                                            if (cause22 == null) {
                                                                                                                throw th41;
                                                                                                            }
                                                                                                            throw cause22;
                                                                                                        }
                                                                                                    } catch (Throwable th42) {
                                                                                                        th = th42;
                                                                                                    }
                                                                                                } catch (Throwable th43) {
                                                                                                    th = th43;
                                                                                                    Throwable th44 = th;
                                                                                                    Throwable cause23 = th44.getCause();
                                                                                                    if (cause23 == null) {
                                                                                                        throw th44;
                                                                                                    }
                                                                                                    throw cause23;
                                                                                                }
                                                                                            } catch (Throwable th45) {
                                                                                                th = th45;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        min = Math.min(i68, i69);
                                                                                    }
                                                                                    try {
                                                                                        Object[] objArr11 = {bArr22, 0, Integer.valueOf(min)};
                                                                                        byte[] bArr24 = $$a;
                                                                                        byte b15 = bArr24[10];
                                                                                        z4 = z;
                                                                                        try {
                                                                                            i9 = i8;
                                                                                            int intValue2 = ((Integer) Class.forName($$c(b15, (short) (b15 | 916), (byte) (-bArr24[45]))).getMethod($$c(bArr24[486], (short) 214, bArr24[46]), byte[].class, Integer.TYPE, Integer.TYPE).invoke(inputStream, objArr11)).intValue();
                                                                                            if (intValue2 == -1) {
                                                                                                break;
                                                                                            }
                                                                                            int i71 = $11 + 65;
                                                                                            $10 = i71 % 128;
                                                                                            int i72 = i71 % 2;
                                                                                            try {
                                                                                                Object[] objArr12 = {bArr22, 0, Integer.valueOf(intValue2)};
                                                                                                Class<?> cls11 = Class.forName($$c(bArr24[10], (short) ($$b | 642), bArr24[315]));
                                                                                                byte b16 = bArr24[319];
                                                                                                cls11.getMethod($$c((byte) ((b16 ^ (-1)) + (b16 << 1)), (short) ComposerKt.invocationKey, bArr24[28]), byte[].class, Integer.TYPE, Integer.TYPE).invoke(newInstance4, objArr12);
                                                                                                i69 = (i69 - (~(-intValue2))) - 1;
                                                                                                z = z4;
                                                                                                i8 = i9;
                                                                                                i68 = 1024;
                                                                                            } catch (Throwable th46) {
                                                                                                Throwable cause24 = th46.getCause();
                                                                                                if (cause24 == null) {
                                                                                                    throw th46;
                                                                                                }
                                                                                                throw cause24;
                                                                                            }
                                                                                        } catch (Throwable th47) {
                                                                                            th = th47;
                                                                                            Throwable th48 = th;
                                                                                            Throwable cause25 = th48.getCause();
                                                                                            if (cause25 == null) {
                                                                                                throw th48;
                                                                                            }
                                                                                            throw cause25;
                                                                                        }
                                                                                    } catch (Throwable th49) {
                                                                                        th = th49;
                                                                                    }
                                                                                }
                                                                                int i73 = $11;
                                                                                int i74 = (i73 & 59) + (i73 | 59);
                                                                                $10 = i74 % 128;
                                                                                int i75 = i74 % 2;
                                                                                try {
                                                                                    bArr = $$a;
                                                                                    byte b17 = bArr[10];
                                                                                    int i76 = $$b;
                                                                                    try {
                                                                                        Class.forName($$c(bArr[10], (short) 840, bArr[6])).getMethod($$c((byte) (bArr[334] - 1), (short) 291, bArr[46]), null).invoke(Class.forName($$c(b17, (short) ((i76 ^ 642) | (i76 & 642)), bArr[315])).getMethod($$c(bArr[425], (short) 571, bArr[28]), null).invoke(newInstance4, null), null);
                                                                                        try {
                                                                                            Class.forName($$c(bArr[10], (short) ((i76 & 642) | (i76 ^ 642)), bArr[315])).getMethod($$c((byte) (-bArr[436]), (short) 605, bArr[28]), null).invoke(newInstance4, null);
                                                                                        } catch (Throwable th50) {
                                                                                            Throwable cause26 = th50.getCause();
                                                                                            if (cause26 == null) {
                                                                                                throw th50;
                                                                                            }
                                                                                            throw cause26;
                                                                                        }
                                                                                    } catch (Throwable th51) {
                                                                                        Throwable cause27 = th51.getCause();
                                                                                        if (cause27 == null) {
                                                                                            throw th51;
                                                                                        }
                                                                                        throw cause27;
                                                                                    }
                                                                                } catch (Throwable th52) {
                                                                                    Throwable cause28 = th52.getCause();
                                                                                    if (cause28 == null) {
                                                                                        throw th52;
                                                                                    }
                                                                                    throw cause28;
                                                                                }
                                                                            } catch (Throwable th53) {
                                                                                th2 = th53;
                                                                                th = th2;
                                                                                byte[] bArr232 = $$a;
                                                                                short s52 = (short) 566;
                                                                                ((Boolean) Class.forName($$c(bArr232[10], s22, bArr232[35])).getMethod($$c((byte) (-bArr232[8]), s52, bArr232[65]), null).invoke(obj14, null)).booleanValue();
                                                                                ((Boolean) Class.forName($$c(bArr232[10], s22, bArr232[35])).getMethod($$c((byte) (-bArr232[8]), s52, bArr232[65]), null).invoke(obj21, null)).booleanValue();
                                                                                throw th;
                                                                            }
                                                                            try {
                                                                                Method declaredMethod = Class.forName($$c((byte) (-bArr[8]), (short) 217, bArr[341])).getDeclaredMethod($$c(bArr[435], (short) 465, bArr[41]), String.class, String.class, Integer.TYPE);
                                                                                try {
                                                                                    short s6 = (short) 657;
                                                                                    Object invoke3 = Class.forName($$c(bArr[10], s22, bArr[35])).getMethod($$c(bArr[425], s6, bArr[182]), null).invoke(obj14, null);
                                                                                    int i77 = $10;
                                                                                    int i78 = (i77 ^ 51) + ((i77 & 51) << 1);
                                                                                    $11 = i78 % 128;
                                                                                    int i79 = i78 % 2;
                                                                                    try {
                                                                                        Object invoke4 = declaredMethod.invoke(null, invoke3, Class.forName($$c(bArr[10], s22, bArr[35])).getMethod($$c(bArr[425], s6, bArr[182]), null).invoke(obj21, null), 0);
                                                                                        try {
                                                                                            short s7 = (short) 566;
                                                                                            ((Boolean) Class.forName($$c(bArr[10], s22, bArr[35])).getMethod($$c((byte) (-bArr[8]), s7, bArr[65]), null).invoke(obj14, null)).booleanValue();
                                                                                            try {
                                                                                                ((Boolean) Class.forName($$c(bArr[10], s22, bArr[35])).getMethod($$c((byte) (-bArr[8]), s7, bArr[65]), null).invoke(obj21, null)).booleanValue();
                                                                                                if (AFPurchaseDetails == null) {
                                                                                                    try {
                                                                                                        AFPurchaseDetails = Class.class.getMethod($$c(bArr[425], (short) 543, bArr[17]), null).invoke(AFa1uSDK.class, null);
                                                                                                    } catch (Throwable th54) {
                                                                                                        Throwable cause29 = th54.getCause();
                                                                                                        if (cause29 == null) {
                                                                                                            throw th54;
                                                                                                        }
                                                                                                        throw cause29;
                                                                                                    }
                                                                                                }
                                                                                                if (z6) {
                                                                                                }
                                                                                                if (obj15 == null) {
                                                                                                }
                                                                                            } catch (Throwable th55) {
                                                                                                Throwable cause30 = th55.getCause();
                                                                                                if (cause30 == null) {
                                                                                                    throw th55;
                                                                                                }
                                                                                                throw cause30;
                                                                                            }
                                                                                        } catch (Throwable th56) {
                                                                                            Throwable cause31 = th56.getCause();
                                                                                            if (cause31 == null) {
                                                                                                throw th56;
                                                                                            }
                                                                                            throw cause31;
                                                                                        }
                                                                                    } catch (Throwable th57) {
                                                                                        Throwable cause32 = th57.getCause();
                                                                                        if (cause32 == null) {
                                                                                            throw th57;
                                                                                        }
                                                                                        throw cause32;
                                                                                    }
                                                                                } catch (Throwable th58) {
                                                                                    Throwable cause33 = th58.getCause();
                                                                                    if (cause33 == null) {
                                                                                        throw th58;
                                                                                    }
                                                                                    throw cause33;
                                                                                }
                                                                            } catch (Throwable th59) {
                                                                                th2 = th59;
                                                                                th = th2;
                                                                                byte[] bArr2322 = $$a;
                                                                                short s522 = (short) 566;
                                                                                ((Boolean) Class.forName($$c(bArr2322[10], s22, bArr2322[35])).getMethod($$c((byte) (-bArr2322[8]), s522, bArr2322[65]), null).invoke(obj14, null)).booleanValue();
                                                                                ((Boolean) Class.forName($$c(bArr2322[10], s22, bArr2322[35])).getMethod($$c((byte) (-bArr2322[8]), s522, bArr2322[65]), null).invoke(obj21, null)).booleanValue();
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th60) {
                                                                            try {
                                                                                Throwable cause34 = th60.getCause();
                                                                                if (cause34 == null) {
                                                                                    throw th60;
                                                                                }
                                                                                throw cause34;
                                                                            } catch (Exception e3) {
                                                                                exc = e3;
                                                                                StringBuilder sb72 = new StringBuilder();
                                                                                byte[] bArr212 = $$a;
                                                                                StringBuilder append32 = sb72.append($$c(bArr212[757], (short) 335, bArr212[28])).append(obj14);
                                                                                byte b132 = bArr212[14];
                                                                                byte b142 = b132;
                                                                                throw ((Throwable) Class.forName($$c(bArr212[10], (short) 732, (byte) (-bArr212[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance(append32.append($$c(b142, (short) ((b142 ^ 217) | (b142 & 217)), b132)).toString(), exc));
                                                                            }
                                                                        }
                                                                    } catch (Throwable th61) {
                                                                        th = th61;
                                                                        z4 = z;
                                                                        obj3 = th;
                                                                        while (i3 < 7) {
                                                                        }
                                                                        int i332222 = $11 + 61;
                                                                        $10 = i332222 % 128;
                                                                        int i342222 = i332222 % 2;
                                                                        throw ((Throwable) Class.forName($$c(r1[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[757], (short) 309, r1[337]), obj3));
                                                                    }
                                                                } else {
                                                                    z4 = z;
                                                                    i9 = i8;
                                                                    try {
                                                                        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                                                                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                                        try {
                                                                            Class<?> cls12 = Class.forName($$c(bArr19[10], bArr19[14], bArr19[538]));
                                                                            byte b18 = bArr19[10];
                                                                            Object newInstance5 = cls12.getDeclaredConstructor(Class.forName($$c(b18, (short) ((b18 ^ 916) | (b18 & 916)), (byte) (-bArr19[45])))).newInstance(zipInputStream);
                                                                            int i80 = $11 + 43;
                                                                            $10 = i80 % 128;
                                                                            if (i80 % 2 != 0) {
                                                                                try {
                                                                                    byte b19 = bArr19[77];
                                                                                    newInstance = Class.forName($$c(b19, (short) (b19 | 29635), bArr19[10942])).getDeclaredConstructor(null).newInstance(null);
                                                                                    try {
                                                                                        bArr3 = new byte[5428];
                                                                                    } catch (Throwable th62) {
                                                                                        th = th62;
                                                                                        obj3 = th;
                                                                                        while (i3 < 7) {
                                                                                        }
                                                                                        int i3322222 = $11 + 61;
                                                                                        $10 = i3322222 % 128;
                                                                                        int i3422222 = i3322222 % 2;
                                                                                        throw ((Throwable) Class.forName($$c(r1[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[757], (short) 309, r1[337]), obj3));
                                                                                    }
                                                                                } catch (Throwable th63) {
                                                                                    th3 = th63;
                                                                                    cause2 = th3.getCause();
                                                                                    if (cause2 != null) {
                                                                                        throw th3;
                                                                                    }
                                                                                    throw cause2;
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    byte b20 = bArr19[10];
                                                                                    newInstance = Class.forName($$c(b20, (short) ((b20 ^ 426) | (b20 & 426)), bArr19[757])).getDeclaredConstructor(null).newInstance(null);
                                                                                    bArr3 = new byte[1024];
                                                                                } catch (Throwable th64) {
                                                                                    th3 = th64;
                                                                                    cause2 = th3.getCause();
                                                                                    if (cause2 != null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            int i81 = 0;
                                                                            while (true) {
                                                                                int i82 = $10;
                                                                                int i83 = (i82 ^ 51) + ((i82 & 51) << 1);
                                                                                $11 = i83 % 128;
                                                                                int i84 = i83 % 2;
                                                                                try {
                                                                                    byte[] bArr25 = $$a;
                                                                                    int intValue3 = ((Integer) Class.forName($$c(bArr25[10], bArr25[14], bArr25[538])).getMethod($$c(bArr25[486], (short) 214, bArr25[46]), byte[].class).invoke(newInstance5, bArr3)).intValue();
                                                                                    if (intValue3 <= 0) {
                                                                                        break;
                                                                                    }
                                                                                    int i85 = $10;
                                                                                    int i86 = (i85 ^ 51) + ((i85 & 51) << 1);
                                                                                    $11 = i86 % 128;
                                                                                    if (i86 % 2 == 0) {
                                                                                        nextEntry.getSize();
                                                                                        throw null;
                                                                                    }
                                                                                    try {
                                                                                        if (i81 >= nextEntry.getSize()) {
                                                                                            break;
                                                                                        }
                                                                                        try {
                                                                                            Object[] objArr13 = new Object[3];
                                                                                            try {
                                                                                                objArr13[2] = Integer.valueOf(intValue3);
                                                                                                objArr13[1] = 0;
                                                                                                objArr13[0] = bArr3;
                                                                                                byte b21 = bArr25[10];
                                                                                                Class<?> cls13 = Class.forName($$c(b21, (short) (b21 | 426), bArr25[757]));
                                                                                                byte b23 = bArr25[319];
                                                                                                try {
                                                                                                    cls13.getMethod($$c((byte) ((b23 ^ (-1)) + (b23 << 1)), (short) ComposerKt.invocationKey, bArr25[28]), byte[].class, Integer.TYPE, Integer.TYPE).invoke(newInstance, objArr13);
                                                                                                    i81 = ((i81 & intValue3) << 1) + (i81 ^ intValue3);
                                                                                                } catch (Throwable th65) {
                                                                                                    th = th65;
                                                                                                    Throwable th66 = th;
                                                                                                    Throwable cause35 = th66.getCause();
                                                                                                    if (cause35 == null) {
                                                                                                        throw th66;
                                                                                                    }
                                                                                                    throw cause35;
                                                                                                }
                                                                                            } catch (Throwable th67) {
                                                                                                th = th67;
                                                                                            }
                                                                                        } catch (Throwable th68) {
                                                                                            th = th68;
                                                                                        }
                                                                                    } catch (Throwable th69) {
                                                                                        th = th69;
                                                                                        obj3 = th;
                                                                                        for (i3 = i + 1; i3 < 7; i3++) {
                                                                                            int i87 = $11;
                                                                                            int i88 = (i87 & 31) + (i87 | 31);
                                                                                            $10 = i88 % 128;
                                                                                            if (i88 % 2 != 0) {
                                                                                                int i89 = 92 / 0;
                                                                                                if (zArr6[i3]) {
                                                                                                    afErrorLogForExcManagerOnly = null;
                                                                                                    AFPurchaseDetails = null;
                                                                                                    c2 = '\n';
                                                                                                    z5 = false;
                                                                                                }
                                                                                            } else if (zArr6[i3]) {
                                                                                                afErrorLogForExcManagerOnly = null;
                                                                                                AFPurchaseDetails = null;
                                                                                                c2 = '\n';
                                                                                                z5 = false;
                                                                                            }
                                                                                            int i90 = i + 30;
                                                                                            c = c2;
                                                                                            i2 = ((i90 & (-29)) << 1) + (i90 ^ (-29));
                                                                                            zArr = zArr4;
                                                                                            z2 = z3;
                                                                                            objArr = objArr2;
                                                                                            $$c = str;
                                                                                            zArr3 = zArr6;
                                                                                            z = z4;
                                                                                            z11 = z5;
                                                                                            zArr2 = zArr5;
                                                                                        }
                                                                                        int i33222222 = $11 + 61;
                                                                                        $10 = i33222222 % 128;
                                                                                        int i34222222 = i33222222 % 2;
                                                                                        throw ((Throwable) Class.forName($$c(r1[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[757], (short) 309, r1[337]), obj3));
                                                                                    }
                                                                                } catch (Throwable th70) {
                                                                                    Throwable cause36 = th70.getCause();
                                                                                    if (cause36 == null) {
                                                                                        throw th70;
                                                                                    }
                                                                                    throw cause36;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th71) {
                                                                            Throwable cause37 = th71.getCause();
                                                                            if (cause37 == null) {
                                                                                throw th71;
                                                                            }
                                                                            throw cause37;
                                                                        }
                                                                    } catch (Throwable th72) {
                                                                        th = th72;
                                                                        obj3 = th;
                                                                        while (i3 < 7) {
                                                                        }
                                                                        int i332222222 = $11 + 61;
                                                                        $10 = i332222222 % 128;
                                                                        int i342222222 = i332222222 % 2;
                                                                        throw ((Throwable) Class.forName($$c(r1[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[757], (short) 309, r1[337]), obj3));
                                                                    }
                                                                }
                                                                cls9 = cls2;
                                                                bArr17 = bArr2;
                                                                i48 = Math.abs(i9);
                                                                i49 = 11719;
                                                                i2 = i;
                                                                zArr3 = zArr6;
                                                                z = z4;
                                                            } catch (Throwable th73) {
                                                                Throwable cause38 = th73.getCause();
                                                                if (cause38 == null) {
                                                                    throw th73;
                                                                }
                                                                throw cause38;
                                                            }
                                                        } catch (Throwable th74) {
                                                            Throwable cause39 = th74.getCause();
                                                            if (cause39 == null) {
                                                                throw th74;
                                                            }
                                                            throw cause39;
                                                        }
                                                    }
                                                } catch (Throwable th75) {
                                                    th = th75;
                                                    Throwable th76 = th;
                                                    Throwable cause40 = th76.getCause();
                                                    if (cause40 == null) {
                                                        throw th76;
                                                    }
                                                    throw cause40;
                                                }
                                            } catch (Throwable th77) {
                                                th = th77;
                                            }
                                        } catch (Throwable th78) {
                                            Throwable cause41 = th78.getCause();
                                            if (cause41 == null) {
                                                throw th78;
                                            }
                                            throw cause41;
                                        }
                                    } catch (Throwable th79) {
                                        Throwable cause42 = th79.getCause();
                                        if (cause42 == null) {
                                            throw th79;
                                        }
                                        throw cause42;
                                    }
                                } catch (Throwable th80) {
                                    th = th80;
                                    z4 = z;
                                    i = i2;
                                    zArr6 = zArr3;
                                    obj3 = th;
                                    while (i3 < 7) {
                                    }
                                    int i3322222222 = $11 + 61;
                                    $10 = i3322222222 % 128;
                                    int i3422222222 = i3322222222 % 2;
                                    throw ((Throwable) Class.forName($$c(r1[10], (short) 732, (byte) (-$$a[45]))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[757], (short) 309, r1[337]), obj3));
                                }
                            }
                            int i902 = i + 30;
                            c = c2;
                            i2 = ((i902 & (-29)) << 1) + (i902 ^ (-29));
                            zArr = zArr4;
                            z2 = z3;
                            objArr = objArr2;
                            $$c = str;
                            zArr3 = zArr6;
                            z = z4;
                            z11 = z5;
                            zArr2 = zArr5;
                        }
                        return;
                    }
                    invoke2 = null;
                    if (obj == null) {
                    }
                    int i1422 = 2 % 2;
                    c = '\n';
                    if (invoke == null) {
                    }
                    if (obj2 != null) {
                    }
                    if (invoke2 == null) {
                        int i222 = $10;
                        int i232 = (i222 ^ 31) + ((i222 & 31) << 1);
                        $11 = i232 % 128;
                        int i242 = i232 % 2;
                        String $$c42 = $$c((byte) (-$$a[436]), (short) 237, r5[4]);
                        int i252 = $11 + 71;
                        $10 = i252 % 128;
                        int i262 = i252 % 2;
                        short s32 = (short) 777;
                        invoke2 = Class.forName($$c(r5[10], s32, r5[35])).getDeclaredConstructor(Class.forName($$c(r5[10], s32, r5[35])), String.class).newInstance(invoke, $$c42);
                    }
                    byte[] bArr7222 = $$a;
                    short s222 = (short) 777;
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr7222[10], s222, bArr7222[35])), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[3] = obj2;
                    objArr[4] = invoke2;
                    objArr[5] = invoke;
                    objArr[6] = obj2;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    i = 6;
                    zArr3 = new boolean[]{false, false, true, true, false, true, true};
                    i = $$b;
                    Class<?> cls5222 = Class.forName($$c((byte) (i - 4), (short) 97, bArr7222[315]));
                    byte b2222 = bArr7222[511];
                    i10 = cls5222.getDeclaredField($$c(b2222, (short) ((b2222 & 533) | (b2222 ^ 533)), bArr7222[41])).getInt(cls5222);
                    if (i10 >= 34) {
                    }
                    if (i10 != 29) {
                        z8 = true;
                        zArr3[0] = z8;
                        if (i10 < 21) {
                        }
                        zArr3[1] = z9;
                        if (i10 < 21) {
                        }
                        zArr3[4] = z10;
                        z2 = false;
                        i2 = 0;
                        while (!z2) {
                            if (zArr3[i2]) {
                            }
                            int i9022 = i + 30;
                            c = c2;
                            i2 = ((i9022 & (-29)) << 1) + (i9022 ^ (-29));
                            zArr = zArr4;
                            z2 = z3;
                            objArr = objArr2;
                            $$c = str;
                            zArr3 = zArr6;
                            z = z4;
                            z11 = z5;
                            zArr2 = zArr5;
                        }
                    }
                    int i15222 = 2 % 2;
                    z8 = false;
                    zArr3[0] = z8;
                    if (i10 < 21) {
                    }
                    zArr3[1] = z9;
                    if (i10 < 21) {
                    }
                    zArr3[4] = z10;
                    z2 = false;
                    i2 = 0;
                    while (!z2) {
                    }
                }
                if (obj != null) {
                }
                invoke2 = null;
                if (obj == null) {
                }
                int i14222 = 2 % 2;
                c = '\n';
                if (invoke == null) {
                }
                if (obj2 != null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr72222 = $$a;
                short s2222 = (short) 777;
                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr72222[10], s2222, bArr72222[35])), 7);
                objArr[0] = null;
                objArr[1] = invoke2;
                objArr[2] = invoke;
                objArr[3] = obj2;
                objArr[4] = invoke2;
                objArr[5] = invoke;
                objArr[6] = obj2;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                i = 6;
                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                i = $$b;
                Class<?> cls52222 = Class.forName($$c((byte) (i - 4), (short) 97, bArr72222[315]));
                byte b22222 = bArr72222[511];
                i10 = cls52222.getDeclaredField($$c(b22222, (short) ((b22222 & 533) | (b22222 ^ 533)), bArr72222[41])).getInt(cls52222);
                if (i10 >= 34) {
                }
                if (i10 != 29) {
                }
                int i152222 = 2 % 2;
                z8 = false;
                zArr3[0] = z8;
                if (i10 < 21) {
                }
                zArr3[1] = z9;
                if (i10 < 21) {
                }
                zArr3[4] = z10;
                z2 = false;
                i2 = 0;
                while (!z2) {
                }
            }
            invoke = null;
            if (obj != null) {
            }
            invoke2 = null;
            if (obj == null) {
            }
            int i142222 = 2 % 2;
            c = '\n';
            if (invoke == null) {
            }
            if (obj2 != null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr722222 = $$a;
            short s22222 = (short) 777;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr722222[10], s22222, bArr722222[35])), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = obj2;
            objArr[4] = invoke2;
            objArr[5] = invoke;
            objArr[6] = obj2;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            i = 6;
            zArr3 = new boolean[]{false, false, true, true, false, true, true};
            i = $$b;
            Class<?> cls522222 = Class.forName($$c((byte) (i - 4), (short) 97, bArr722222[315]));
            byte b222222 = bArr722222[511];
            i10 = cls522222.getDeclaredField($$c(b222222, (short) ((b222222 & 533) | (b222222 ^ 533)), bArr722222[41])).getInt(cls522222);
            if (i10 >= 34) {
            }
            if (i10 != 29) {
            }
            int i1522222 = 2 % 2;
            z8 = false;
            zArr3[0] = z8;
            if (i10 < 21) {
            }
            zArr3[1] = z9;
            if (i10 < 21) {
            }
            zArr3[4] = z10;
            z2 = false;
            i2 = 0;
            while (!z2) {
            }
            if (obj != null) {
            }
            invoke = null;
            if (obj != null) {
            }
            invoke2 = null;
            if (obj == null) {
            }
            int i1422222 = 2 % 2;
            c = '\n';
            if (invoke == null) {
            }
            if (obj2 != null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr7222222 = $$a;
            short s222222 = (short) 777;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr7222222[10], s222222, bArr7222222[35])), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = obj2;
            objArr[4] = invoke2;
            objArr[5] = invoke;
            objArr[6] = obj2;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            i = 6;
            zArr3 = new boolean[]{false, false, true, true, false, true, true};
            i = $$b;
            Class<?> cls5222222 = Class.forName($$c((byte) (i - 4), (short) 97, bArr7222222[315]));
            byte b2222222 = bArr7222222[511];
            i10 = cls5222222.getDeclaredField($$c(b2222222, (short) ((b2222222 & 533) | (b2222222 ^ 533)), bArr7222222[41])).getInt(cls5222222);
            if (i10 >= 34) {
            }
            if (i10 != 29) {
            }
            int i15222222 = 2 % 2;
            z8 = false;
            zArr3[0] = z8;
            if (i10 < 21) {
            }
            zArr3[1] = z9;
            if (i10 < 21) {
            }
            zArr3[4] = z10;
            z2 = false;
            i2 = 0;
            while (!z2) {
            }
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
